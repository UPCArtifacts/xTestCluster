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
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1574270622069016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1817363258761233d + "'", double1 == 2.1817363258761233d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double1 = org.apache.commons.math.util.FastMath.expm1(32.48537739999093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2829807711056233E14d + "'", double1 == 1.2829807711056233E14d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999391764340757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931167683145355d + "'", double1 == 0.6931167683145355d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5419362735933929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8152974304743282d + "'", double1 == 0.8152974304743282d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 100, (-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7465363222182906d) + "'", double2 == (-0.7465363222182906d));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.989031169415003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.303190128915375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.165739117215784d + "'", double1 == 2.165739117215784d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.093079357587117d + "'", double1 == 1.093079357587117d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707651109236087d, (double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4758285569314635d + "'", double2 == 2.4758285569314635d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6997597439205169d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5436257195614518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.44323887871599d + "'", double1 == 88.44323887871599d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9335905118403582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9335905118403582d + "'", double1 == 0.9335905118403582d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53L, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.58601345E15f + "'", float1 == 1.58601345E15f);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9702843181545027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1626470961947334E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0782611447115831E-7d + "'", double1 == 1.0782611447115831E-7d);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3043045862358962d + "'", double1 == 1.3043045862358962d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9848545729576582d, (-0.017444115666094908d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9848545729576581d + "'", double2 == 0.9848545729576581d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22.180709777452588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.185039863261519d + "'", double1 == 2.185039863261519d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double2 = org.apache.commons.math.util.FastMath.min(7.896296018267969E13d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.790884902745726d + "'", double1 == 3.790884902745726d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        long long1 = org.apache.commons.math.util.FastMath.abs(115L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 115L + "'", long1 == 115L);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.803279531369336d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.9999999999999996d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914824263686d + "'", double1 == 4.041914824263686d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(21.72623702062758d, (-0.4881954908148405d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.726237020627575d + "'", double2 == 21.726237020627575d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math.util.FastMath.atanh(20.245261958970328d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4343980560668567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 53);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        double double1 = org.apache.commons.math.util.FastMath.cosh(263.856815596594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9522212262964344E114d + "'", double1 == 1.9522212262964344E114d);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6229585671655451d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.870594663085938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2619.1226207268155d + "'", double1 == 2619.1226207268155d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8713868162390156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7874470920119091d + "'", double1 == 0.7874470920119091d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.244277192748949d + "'", double1 == 4.244277192748949d);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        double double1 = org.apache.commons.math.util.FastMath.tan(41.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16065669868064283d + "'", double1 == 0.16065669868064283d);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.138645867274483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3301388768476645d + "'", double1 == 0.3301388768476645d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0009877980461308d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double2 = org.apache.commons.math.util.FastMath.min(1.118870081899753d, 630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.118870081899753d + "'", double2 == 1.118870081899753d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.03353507713878987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.852975109821626E-4d + "'", double1 == 5.852975109821626E-4d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.7085733084162253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4622805158701188d) + "'", double1 == (-0.4622805158701188d));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), 115L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5881074181024651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5586003788994619d + "'", double1 == 0.5586003788994619d);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.161724629793691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.306656161368529d + "'", double1 == 2.306656161368529d);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000298023228d + "'", double1 == 1.0000000298023228d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5302764730926062d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 84677176);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2138239491732021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8316959613139696d + "'", double1 == 1.8316959613139696d);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9980569874847491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01741938055414471d + "'", double1 == 0.01741938055414471d);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7144384417412475d + "'", double1 == 0.7144384417412475d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.011857372290144d) + "'", double1 == (-49.011857372290144d));
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014987199998230864d + "'", double1 == 0.014987199998230864d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        double double1 = org.apache.commons.math.util.FastMath.log10(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707963267948937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.392346359950966E14d + "'", double1 == 3.392346359950966E14d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1177647015329363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11722329716047776d + "'", double1 == 0.11722329716047776d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2395257648972624d + "'", double1 == 0.2395257648972624d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.15561577E15f + "'", float1 == 2.15561577E15f);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.3805150062465854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8503325208986047d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5727271688214748d) + "'", double1 == (-0.5727271688214748d));
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5506.500045400884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001449108505118d + "'", double1 == 1.0001449108505118d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18505477173607918d) + "'", double1 == (-0.18505477173607918d));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.3867553648319086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.604331810789432d + "'", double1 == 1.604331810789432d);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7944146264030464d, 0.7629672449812436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7944146264030464d + "'", double2 == 0.7944146264030464d);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5487785339621303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.045370515966924575d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 52L, 0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 97.0f, 21.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3575918074054423d + "'", double2 == 1.3575918074054423d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.044522437723423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.523809523809524d + "'", double1 == 10.523809523809524d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.36056635633382056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3605663563338206d + "'", double1 == 0.3605663563338206d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2622510397683969d) + "'", double1 == (-0.2622510397683969d));
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6076102029351266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.775557561562892E-17d + "'", double1 == 2.775557561562892E-17d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6396562447182141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.023140907904583d + "'", double1 == 1.023140907904583d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9636263942628832d) + "'", double1 == (-0.9636263942628832d));
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5494213976540494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.708744903392718d + "'", double1 == 3.708744903392718d);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8561074278563534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.152452494747568d + "'", double1 == 1.152452494747568d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.588870767838961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.36792187455389946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35217266165947814d + "'", double1 == 0.35217266165947814d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        long long1 = org.apache.commons.math.util.FastMath.round(2.0808864545885957E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5690077881630158d + "'", double1 == 1.5690077881630158d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.log(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.938747370452312d) + "'", double1 == (-12.938747370452312d));
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.23585732697719813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23585732697719813d + "'", double1 == 0.23585732697719813d);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8096100974766685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0141303618583601d + "'", double1 == 0.0141303618583601d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7076312586751926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999694819561995d + "'", double1 == 0.9999694819561995d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8461684323333869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6890624663225461d + "'", double1 == 0.6890624663225461d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7133729108990164d), 148.80597572185025d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3162739259961891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5558738409986911d + "'", double1 == 0.5558738409986911d);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.atanh(96.10655605346268d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4528691957923934d, 5.8794530986865425E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707558589185557d + "'", double2 == 1.5707558589185557d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5039744651761873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2263663666197746d + "'", double1 == 1.2263663666197746d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.51425465281641d + "'", double1 == 7.51425465281641d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999694819561995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.294030957973554d + "'", double1 == 57.294030957973554d);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.467141881863116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.336822260414053d + "'", double1 == 3.336822260414053d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3529733609987885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.2238838657782d + "'", double1 == 20.2238838657782d);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2160401483855212d, (-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.49824130708557135d) + "'", double2 == (-0.49824130708557135d));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        double double1 = org.apache.commons.math.util.FastMath.signum(572.2646479502633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double double2 = org.apache.commons.math.util.FastMath.pow(65.38547255349003d, 1.5524423814822215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 658.3094075238282d + "'", double2 == 658.3094075238282d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7813863964118539d, 0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3833162101372999d + "'", double2 == 0.3833162101372999d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.185039863261519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1850398632615193d + "'", double1 == 2.1850398632615193d);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.27346213804538994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695312E-8d + "'", double1 == 2.9802322387695312E-8d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.29182899153935693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8669348381260393d + "'", double1 == 1.8669348381260393d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4967005954324935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0510032037388184d + "'", double1 == 1.0510032037388184d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6430898160505507d + "'", double1 == 0.6430898160505507d);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.09917726107940236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10426202488960268d + "'", double1 == 0.10426202488960268d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.10577750197666945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8954624216489684d + "'", double1 == 0.8954624216489684d);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7019471874912554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double2 = org.apache.commons.math.util.FastMath.pow(1477895.5237245467d, (-0.9633078296451878d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1395513111913864E-6d + "'", double2 == 1.1395513111913864E-6d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.2717628242082613d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.017315053411302784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0174658279143685d + "'", double1 == 1.0174658279143685d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2536458786393916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.82861785000694d + "'", double1 == 71.82861785000694d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9672221742711605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6306268775526067d + "'", double1 == 1.6306268775526067d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8369144593899815d, 1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8369144593899815d + "'", double2 == 1.8369144593899815d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7614645887194331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01329006421049858d + "'", double1 == 0.01329006421049858d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6718310471269701d + "'", double1 == 0.6718310471269701d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.139516973384503d + "'", double1 == 3.139516973384503d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5021549377007348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        double double1 = org.apache.commons.math.util.FastMath.floor(10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9709835434146469d + "'", double1 == 0.9709835434146469d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8449898195469685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8449898195469686d + "'", double1 == 0.8449898195469686d);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        long long1 = org.apache.commons.math.util.FastMath.round(1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1765L + "'", long1 == 1765L);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.316173196322488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.8794530986865425E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.879453102073888E-5d + "'", double1 == 5.879453102073888E-5d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 1765L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.07476179912891115d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double2 = org.apache.commons.math.util.FastMath.max(8.881784197001248E-16d, 0.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4132193591697708d + "'", double2 == 0.4132193591697708d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 84677176L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0017885376783303671d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0017885376783303671d + "'", double2 == 0.0017885376783303671d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.07476179912891115d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.016455121993179136d, 13.781933809549642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6132436982648076E-25d + "'", double2 == 2.6132436982648076E-25d);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2222844543037337d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.38873810163383016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.623488653973615d + "'", double1 == 0.623488653973615d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2.2517998136852422E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.251799813685243E15d) + "'", double1 == (-2.251799813685243E15d));
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695326E-8d + "'", double1 == 2.9802322387695326E-8d);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.50632862831693E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.310651852518919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3643141559577787d + "'", double1 == 1.3643141559577787d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3605699210490763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3770536582776822d + "'", double1 == 0.3770536582776822d);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.102022356359888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7019390084780832d) + "'", double1 == (-1.7019390084780832d));
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49670059543249345d + "'", double1 == 0.49670059543249345d);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.214684851089402E-8d, 2.452674104609824d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.146149210139842E-19d + "'", double2 == 8.146149210139842E-19d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-36));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.1720269046268675E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        long long1 = org.apache.commons.math.util.FastMath.round(4.727787050299033d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.07490147911901063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07216510706318602d) + "'", double1 == (-0.07216510706318602d));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4387190799581824d) + "'", double1 == (-0.4387190799581824d));
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.26035149959480436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0340833231523574d + "'", double1 == 1.0340833231523574d);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double2 = org.apache.commons.math.util.FastMath.min(177.4022424239215d, 2.1817363258761233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1817363258761233d + "'", double2 == 2.1817363258761233d);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7020228836336021d + "'", double1 == 0.7020228836336021d);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.1961196899529816d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8718162306995085d, (-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11831214619987152d) + "'", double2 == (-0.11831214619987152d));
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8803786840634491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        double double1 = org.apache.commons.math.util.FastMath.ulp(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091713E-12d + "'", double1 == 3.637978807091713E-12d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double2 = org.apache.commons.math.util.FastMath.min(8.467717607067357E7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6306268775526067d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.20529357054986405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0211468390624778d + "'", double1 == 1.0211468390624778d);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        long long2 = org.apache.commons.math.util.FastMath.min(1765L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.109163004257367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7632818845146023d + "'", double1 == 1.7632818845146023d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149, (float) 115L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.7174132092735896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9113767583706034d) + "'", double1 == (-0.9113767583706034d));
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6904492636009613d) + "'", double1 == (-0.6904492636009613d));
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.51425465281641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.87588590891195d + "'", double1 == 0.87588590891195d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3605663563338206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44301479880114863d) + "'", double1 == (-0.44301479880114863d));
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.03353507713878987d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.847671522084021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2330848261667855d + "'", double1 == 1.2330848261667855d);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        double double1 = org.apache.commons.math.util.FastMath.cosh(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634389258010436E93d + "'", double1 == 2.0634389258010436E93d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        double double1 = org.apache.commons.math.util.FastMath.log(34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5353451248706285d + "'", double1 == 3.5353451248706285d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, 2155615773557597L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 149, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0529697638030147E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.583108182225291E-6d + "'", double1 == 3.583108182225291E-6d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707956501570803d, 1.60978210179491616E17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.60978210179491616E17d + "'", double2 == 1.60978210179491616E17d);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.680482178387856d, 0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.680482178387855d + "'", double2 == 4.680482178387855d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6076102029351266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089404E-8d + "'", double1 == 4.214684851089404E-8d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8081843818082922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7390464345756131d + "'", double1 == 0.7390464345756131d);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36208966808181453d) + "'", double1 == (-0.36208966808181453d));
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double2 = org.apache.commons.math.util.FastMath.min(0.057233205734539196d, (-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017453292519943295d) + "'", double2 == (-0.017453292519943295d));
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.7626139187213443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 215.58189747991278d + "'", double1 == 215.58189747991278d);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4327384526996933d + "'", double1 == 0.4327384526996933d);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.340144407361754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 134.08039799297177d + "'", double1 == 134.08039799297177d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double1 = org.apache.commons.math.util.FastMath.ceil(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6283185307179586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0230972649707364d + "'", double1 == 1.0230972649707364d);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22574212779940497d + "'", double1 == 0.22574212779940497d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4400297437607181d + "'", double1 == 1.4400297437607181d);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        double double2 = org.apache.commons.math.util.FastMath.min(1.212015649612875d, 2.1850398632615193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.212015649612875d + "'", double2 == 1.212015649612875d);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 36L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41285127790450793d + "'", double1 == 0.41285127790450793d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.045370515966924575d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011343644545624419d + "'", double1 == 0.011343644545624419d);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.2318521822d + "'", double1 == 1261966.2318521822d);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.4262213939948603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42622139399486025d) + "'", double1 == (-0.42622139399486025d));
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3283909087132567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8503325208986047d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9473917451937623d) + "'", double1 == (-0.9473917451937623d));
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.311329466289671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.980537980246085d + "'", double1 == 0.980537980246085d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        double double2 = org.apache.commons.math.util.FastMath.pow(53.90638748024775d, 0.6085674966810348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.319310132841686d + "'", double2 == 11.319310132841686d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4967005954324935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.643290436395493d + "'", double1 == 0.643290436395493d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.4677176E7d, 2.2339641205849246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1326968860569261E17d + "'", double2 == 5.1326968860569261E17d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9407807517372623d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.574710978503383d, 0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9086404266042183d + "'", double2 == 1.9086404266042183d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double2 = org.apache.commons.math.util.FastMath.min(0.006396965828810899d, 0.7098212011473782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006396965828810899d + "'", double2 == 0.006396965828810899d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.15315376700887107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4170374192945634d + "'", double1 == 1.4170374192945634d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.622003184662269d) + "'", double1 == (-0.622003184662269d));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double1 = org.apache.commons.math.util.FastMath.exp(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9534903170187385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8688562153383979d) + "'", double1 == (-1.8688562153383979d));
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.acosh(44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.494563888756254d + "'", double1 == 4.494563888756254d);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4670602929020584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10355008054994842d + "'", double1 == 0.10355008054994842d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1310377402202207d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9174537712762877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0516871176602036d + "'", double1 == 1.0516871176602036d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.71828182845905d + "'", double1 == 2.71828182845905d);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2413.6743652510727d + "'", double1 == 2413.6743652510727d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9796686085695417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.663573410253516d + "'", double1 == 1.663573410253516d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2071903406766498d + "'", double1 == 2.2071903406766498d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7874470920119091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8713868162390155d + "'", double1 == 0.8713868162390155d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.989075492968012E-4d + "'", double1 == 9.989075492968012E-4d);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9021994443085871d + "'", double1 == 0.9021994443085871d);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 8.4677176E7f, 0.9383251747599725d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.467717599999999E7d + "'", double2 == 8.467717599999999E7d);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.106976355621385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44736775427009084d + "'", double1 == 0.44736775427009084d);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.657902518456065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6579025184560652d + "'", double1 == 1.6579025184560652d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.01706517535661036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8178843569317782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.414213562373095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8883855615856605d + "'", double1 == 0.8883855615856605d);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 53L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.51425465281641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3332296899280631d + "'", double1 == 0.3332296899280631d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4088493392805228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.408849339280523d + "'", double1 == 1.408849339280523d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31587294930624943d + "'", double1 == 0.31587294930624943d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-41.94454512494747d), 1.5436257195614516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-41.94454512494746d) + "'", double2 == (-41.94454512494746d));
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3770536582776822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.680482178387855d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double2 = org.apache.commons.math.util.FastMath.min(0.921688867296064d, (-0.8337422720523482d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8337422720523482d) + "'", double2 == (-0.8337422720523482d));
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        long long1 = org.apache.commons.math.util.FastMath.round(1.546410917622178d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4241520375805427d + "'", double1 == 0.4241520375805427d);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.097044078157508d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707173906673306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45153245172720313d + "'", double1 == 0.45153245172720313d);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3126911014714069d) + "'", double1 == (-0.3126911014714069d));
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02187509047518678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5489194913340663d + "'", double1 == 1.5489194913340663d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6370964612589353d, (-55.19347301057655d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6370964612589353d + "'", double2 == 0.6370964612589353d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9688117453268874d + "'", double1 == 0.9688117453268874d);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9520464219027572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9520464219027572d + "'", double1 == 0.9520464219027572d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        double double1 = org.apache.commons.math.util.FastMath.floor(295.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 295.0d + "'", double1 == 295.0d);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.07216510706318602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.7703727489272E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.890441852638668d + "'", double1 == 13.890441852638668d);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.691649480399157E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.770372748927258E13d + "'", double1 == 7.770372748927258E13d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515096263d + "'", double1 == 1.1624473515096263d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.09969305692768458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1048317455746075d + "'", double1 == 1.1048317455746075d);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3083117974611422d + "'", double1 == 2.3083117974611422d);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 248.5313787931064d + "'", double1 == 248.5313787931064d);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0466433349068984d + "'", double1 == 1.0466433349068984d);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5165902998982612d + "'", double1 == 0.5165902998982612d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.395584147203374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9366325274242508d + "'", double1 == 1.9366325274242508d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(265.94345040106276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.307772698963607d + "'", double1 == 16.307772698963607d);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        float float2 = org.apache.commons.math.util.FastMath.max(8.4677176E7f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 1477896L, 0.30790367156192044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30790367156192044d + "'", double2 == 0.30790367156192044d);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-86.33580274416313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4946.677118114539d) + "'", double1 == (-4946.677118114539d));
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        int int2 = org.apache.commons.math.util.FastMath.min(84677176, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.002205218707991866d, 3.3453942544278394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.591804196680549E-4d + "'", double2 == 6.591804196680549E-4d);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027241040673019475d + "'", double1 == 0.027241040673019475d);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        long long1 = org.apache.commons.math.util.FastMath.round(3.3453942544278394d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.log(4.303190128915375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4593566380802732d + "'", double1 == 1.4593566380802732d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        double double2 = org.apache.commons.math.util.FastMath.atan2(134.08039799297177d, 2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963265726246d + "'", double2 == 1.5707963265726246d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16065669868064283d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1586013452313419L, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.000000000000014d + "'", double1 == 35.000000000000014d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-2.0f), 1.4670602929020584d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3671385529012792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8616818640537413d + "'", double1 == 0.8616818640537413d);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8250464049151596d, 1.5707963267738794d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.739272481061051d + "'", double2 == 0.739272481061051d);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 149, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5607966601082317d, 9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082317d + "'", double2 == 1.5607966601082317d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7858907674327538d + "'", double1 == 0.7858907674327538d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000323d + "'", double1 == 100.00000000000323d);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5995504841726447d + "'", double1 == 0.5995504841726447d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3283909087132568d, (-0.011029208157548202d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32839090871325677d + "'", double2 == 0.32839090871325677d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24156447527049035d) + "'", double1 == (-0.24156447527049035d));
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5690077881630158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999984005652075d + "'", double1 == 0.9999984005652075d);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9016684086532855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8101065397490559d) + "'", double1 == (-0.8101065397490559d));
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9746955125367257d + "'", double1 == 0.9746955125367257d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.9021393831114582d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double1 = org.apache.commons.math.util.FastMath.atan(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055415023634d + "'", double1 == 1.5707055415023634d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        double double1 = org.apache.commons.math.util.FastMath.log(2.3194821852228826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8413439647416594d + "'", double1 == 0.8413439647416594d);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5552986459319043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        double double2 = org.apache.commons.math.util.FastMath.max(1262023.527631695d, 0.014987199998230864d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1262023.527631695d + "'", double2 == 1262023.527631695d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7541871649905414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.161720762982154d + "'", double1 == 1.161720762982154d);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601003E-15d + "'", double1 == 7.105427357601003E-15d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.099674546851823d + "'", double1 == 2.099674546851823d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.18075770071274028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17881444089942233d) + "'", double1 == (-0.17881444089942233d));
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3665191429188092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0679234427148745d + "'", double1 == 1.0679234427148745d);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.38873810163383016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.529104380392399d), 0.4384640908548959d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0192608780318253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0063795080101574d + "'", double1 == 1.0063795080101574d);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.16065669868064283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.012933069048479d + "'", double1 == 1.012933069048479d);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8101065397490559d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.185039863261519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8172096612475641d + "'", double1 == 0.8172096612475641d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.3284512750821519d), 1.1877020959207132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.26980060830058605d) + "'", double2 == (-0.26980060830058605d));
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.7703727489272E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.67707152554634d + "'", double1 == 32.67707152554634d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9086404266042183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4460977834217053d + "'", double1 == 3.4460977834217053d);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        double double2 = org.apache.commons.math.util.FastMath.min(1.546410917622178d, 4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.214684851089406E-8d + "'", double2 == 4.214684851089406E-8d);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.392346359950966E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.6701224592653805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.09240868099498095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09254025572625442d + "'", double1 == 0.09254025572625442d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4394872797857692d + "'", double1 == 0.4394872797857692d);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9171523356672743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01600732799975016d + "'", double1 == 0.01600732799975016d);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.01741938055414471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017421142650212083d + "'", double1 == 0.017421142650212083d);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.16256464224861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1625646422486104d + "'", double1 == 4.1625646422486104d);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1586013452313419L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.011028313824087112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01102809027471389d) + "'", double1 == (-0.01102809027471389d));
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.09950371902099892d, 1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06085912128862039d + "'", double2 == 0.06085912128862039d);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0001545365584956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7854754257066167d + "'", double1 == 0.7854754257066167d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.161720762982154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1954271206598093d + "'", double1 == 3.1954271206598093d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6312937620005052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.459983974854105d) + "'", double1 == (-0.459983974854105d));
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0682346001726604d + "'", double1 == 1.0682346001726604d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0580220586617817d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        double double1 = org.apache.commons.math.util.FastMath.cos(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1367372182078336d + "'", double1 == 0.1367372182078336d);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.01709844279797004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.553697050746449d + "'", double1 == 1.553697050746449d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999609443118818d + "'", double1 == 0.9999609443118818d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.22160826669200384d, (-0.6842868307608121d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.804186612093146d + "'", double2 == 2.804186612093146d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999500037496876d + "'", double1 == 0.9999500037496876d);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5533448061434307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5533448061434307d + "'", double1 == 1.5533448061434307d);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2719221418875999d + "'", double1 == 1.2719221418875999d);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7632818845146023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1680070164348144d + "'", double1 == 1.1680070164348144d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.586013445029888E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.768115659666964E13d + "'", double1 == 2.768115659666964E13d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        int int2 = org.apache.commons.math.util.FastMath.min(149, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.36056635633382056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35317815969016075d + "'", double1 == 0.35317815969016075d);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        double double1 = org.apache.commons.math.util.FastMath.log(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9512437185814275d + "'", double1 == 3.9512437185814275d);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.594078672416073E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.33932123363772365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33932123363772365d + "'", double1 == 0.33932123363772365d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        double double2 = org.apache.commons.math.util.FastMath.atan2(13.781933809549642d, 1.037396450599555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4956658091302928d + "'", double2 == 1.4956658091302928d);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7185289533415847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5414686651970061d + "'", double1 == 0.5414686651970061d);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.634779260704061d + "'", double1 == 3.634779260704061d);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9171523356672743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9715843084612968d) + "'", double1 == (-0.9715843084612968d));
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        int int1 = org.apache.commons.math.util.FastMath.round(36.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.509011168189731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.509011168189732d + "'", double1 == 4.509011168189732d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.76837158203125E-7d + "'", double1 == 4.76837158203125E-7d);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        double double1 = org.apache.commons.math.util.FastMath.expm1(199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.671611577801729E86d + "'", double1 == 2.671611577801729E86d);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        double double1 = org.apache.commons.math.util.FastMath.rint((-6.053272382792838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5430806348152388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634815239d + "'", double1 == 1.543080634815239d);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        long long2 = org.apache.commons.math.util.FastMath.min(84677176L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5953649790673516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.566481311004089d + "'", double1 == 2.566481311004089d);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.768115659666964E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4868981666828483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097344d) + "'", double1 == (-0.5063656411097344d));
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000000000000009d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9908886150478888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.757740976791324d + "'", double1 == 0.757740976791324d);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.08704594528845262d, 24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08704594528845264d + "'", double2 == 0.08704594528845264d);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8954624216489684d, 100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8954624216489684d + "'", double2 == 0.8954624216489684d);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20321057778875d + "'", double1 == 74.20321057778875d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.637986554446435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6177859350239399d, 471.123645247015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6177859350239399d + "'", double2 == 1.6177859350239399d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2543619974793934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22662707477833305d + "'", double1 == 0.22662707477833305d);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.4896128191743455E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.652208889389414d + "'", double1 == 38.652208889389414d);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4684335570709989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0583132700977513d + "'", double1 == 2.0583132700977513d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.28162208224762103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28162208224762103d + "'", double1 == 0.28162208224762103d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        int int2 = org.apache.commons.math.util.FastMath.min(84677176, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        long long2 = org.apache.commons.math.util.FastMath.max(1765L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1765L + "'", long2 == 1765L);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        double double1 = org.apache.commons.math.util.FastMath.atanh(262.1116315604069d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0077322051969947875d + "'", double1 == 0.0077322051969947875d);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.17230617170547372d), 4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17230617170547372d) + "'", double2 == (-0.17230617170547372d));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3533464791127893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3158729493062495d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.01706087125665432d), 0.642821405345039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017060871256654318d) + "'", double2 == (-0.017060871256654318d));
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5419362735933929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.28162208224762103d, 0.7207960780149949d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2816220822476211d + "'", double2 == 0.2816220822476211d);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5013507798060323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.7174132092735896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.141104673840013d + "'", double1 == 14.141104673840013d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8125492953065081d, 1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5751804806033579d + "'", double2 == 0.5751804806033579d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.6701224592653805d, 0.011697165240742895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0115543119502841d + "'", double2 == 1.0115543119502841d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.33932123363772365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9429808081566275d + "'", double1 == 0.9429808081566275d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        long long1 = org.apache.commons.math.util.FastMath.round(3.790884902745726d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8404766374262675d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6860614383184498d) + "'", double1 == (-0.6860614383184498d));
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2395257648972624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23504776468620056d + "'", double1 == 0.23504776468620056d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9616411655135638d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2583723393689585d, 0.5514266812416907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2583723393689583d + "'", double2 == 1.2583723393689583d);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6428702637760138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4418123421690833d) + "'", double1 == (-0.4418123421690833d));
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        double double1 = org.apache.commons.math.util.FastMath.floor((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 84677176, 84677176L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8544631004594128d + "'", double1 == 1.8544631004594128d);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3893722612835904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4110599028199951d + "'", double1 == 0.4110599028199951d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6860614383184498d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.0476958419065936d), 0.5995504841726447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0476958419065934d) + "'", double2 == (-1.0476958419065934d));
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091340L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16162584696387075d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06928485212771912d + "'", double1 == 0.06928485212771912d);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6773758358854114d + "'", double1 == 1.6773758358854114d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.16162584696387075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7777872910831916d) + "'", double1 == (-0.7777872910831916d));
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2832776133349888d + "'", double1 == 1.2832776133349888d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557652d + "'", double1 == 0.7615941559557652d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8404766374262674d), 3.139516973384503d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1559274280097633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.915169171319882d + "'", double1 == 0.915169171319882d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.7150780923637137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6718310471269701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6718310471269701d + "'", double1 == 0.6718310471269701d);
    }
}

