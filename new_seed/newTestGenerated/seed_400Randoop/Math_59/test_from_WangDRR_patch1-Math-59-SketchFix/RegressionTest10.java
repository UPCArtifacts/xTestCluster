import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        double double1 = org.apache.commons.math.util.FastMath.asin(1477895.5237245467d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math.util.FastMath.tanh(384.43435069728696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.980513274942486d + "'", double1 == 1.980513274942486d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3165695056594996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.138096596832156d + "'", double1 == 18.138096596832156d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.5347252927908293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        int int1 = org.apache.commons.math.util.FastMath.abs((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.680482178387855d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        int int2 = org.apache.commons.math.util.FastMath.max(15472906, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15472906 + "'", int2 == 15472906);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.779091278954217d + "'", double1 == 0.779091278954217d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 416128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416128 + "'", int2 == 416128);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6174449004242214E-24d + "'", double1 == 6.6174449004242214E-24d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.647653479929832d), 1.0021606868913213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6476534799298319d) + "'", double2 == (-0.6476534799298319d));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double2 = org.apache.commons.math.util.FastMath.min(9.306943613116557d, (-0.03422749178784308d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03422749178784308d) + "'", double2 == (-0.03422749178784308d));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0065892631285295435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.006611020084001d + "'", double1 == 1.006611020084001d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5485217903960327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7045107871079d + "'", double1 == 3.7045107871079d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2554125869476498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02191108311321608d) + "'", double1 == (-0.02191108311321608d));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6002341714155816d, 1.2447575658151468d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5297403258624965d + "'", double2 == 0.5297403258624965d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.08154756650174319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08136728211872615d) + "'", double1 == (-0.08136728211872615d));
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 5558L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double double1 = org.apache.commons.math.util.FastMath.exp(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695303E-8d + "'", double1 == 2.9802322387695303E-8d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double1 = org.apache.commons.math.util.FastMath.floor((-29.500939575070152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-30.0d) + "'", double1 == (-30.0d));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6362495915029428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6800539615877755d + "'", double1 == 0.6800539615877755d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5604313987190848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8470258791360018d + "'", double1 == 0.8470258791360018d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.1321790744880604d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7554612895086841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6856245397572791d + "'", double1 == 0.6856245397572791d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9515984431693014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5803821484541514d + "'", double1 == 0.5803821484541514d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double double2 = org.apache.commons.math.util.FastMath.min(0.456786327633631d, 0.038686412312912005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.038686412312912005d + "'", double2 == 0.038686412312912005d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.2991889085111596d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8746388394445976d + "'", double1 == 1.8746388394445976d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.305661184154149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.230622944437516d + "'", double1 == 2.230622944437516d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.195813174500402d + "'", double1 == 1.195813174500402d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2026142367355531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.320301064820172d + "'", double1 == 0.320301064820172d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.756659174304436E12d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double double2 = org.apache.commons.math.util.FastMath.pow(10.049875621120886d, 0.03173339314553415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.07597445084245d + "'", double2 == 1.07597445084245d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.10506753677637078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10526181346375738d + "'", double1 == 0.10526181346375738d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5427661770824743d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9952300096280062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0020765369746493637d) + "'", double1 == (-0.0020765369746493637d));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5992442618287416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6425567703544879d + "'", double1 == 0.6425567703544879d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2764592626816604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10600695915211926d + "'", double1 == 0.10600695915211926d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7360711750351105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9059108349693629d + "'", double1 == 0.9059108349693629d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.814737873122817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2585835592934642d + "'", double1 == 1.2585835592934642d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8488138000713359d) + "'", double1 == (-0.8488138000713359d));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 274877906944L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 274877906944L + "'", long1 == 274877906944L);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5790336546285149d + "'", double1 == 0.5790336546285149d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1834.0d + "'", double1 == 1834.0d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.363655626077857d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.464727648867038d + "'", double1 == 0.464727648867038d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.040477170287252d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-52.99999999999999d) + "'", double1 == (-52.99999999999999d));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9137514854687232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0463214738377196d + "'", double1 == 1.0463214738377196d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.111512116496156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1225.9999999999993d + "'", double1 == 1225.9999999999993d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5660619385698706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02733293711820942d + "'", double1 == 0.02733293711820942d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.097129110263696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5023658486217008d) + "'", double1 == (-0.5023658486217008d));
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5440211108893698d), 1.2083802338853868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5440211108893698d) + "'", double2 == (-0.5440211108893698d));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.280109889280518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6735424271045924d + "'", double1 == 2.6735424271045924d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9093606334381874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9093606334381874d + "'", double1 == 1.9093606334381874d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7871127525111785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6668333172919337d + "'", double1 == 0.6668333172919337d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8745129512124437d, 77.35348403241947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8745129512124438d + "'", double2 == 0.8745129512124438d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5258817486693113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.599197117877118d + "'", double1 == 3.599197117877118d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4494190750372284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9157372585176267d + "'", double1 == 0.9157372585176267d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 84677176L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.017422180268940393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01742041785803647d + "'", double1 == 0.01742041785803647d);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9686168251319445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        long long2 = org.apache.commons.math.util.FastMath.min(2155615773557597L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.06597229168077529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5525513908179496d, 0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5525513908179496d + "'", double2 == 1.5525513908179496d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.4415890906031725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.22490746112810533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2268480630938991d + "'", double1 == 0.2268480630938991d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012859450895217988d) + "'", double1 == (-0.012859450895217988d));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9210614703334487d + "'", double1 == 0.9210614703334487d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.05305817965162052d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.001407915460983d + "'", double1 == 1.001407915460983d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1375934887012635d) + "'", double1 == (-1.1375934887012635d));
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8029955704341625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.232217688457459d + "'", double1 == 2.232217688457459d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5192770005594214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6808119841648221d + "'", double1 == 1.6808119841648221d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double double1 = org.apache.commons.math.util.FastMath.abs(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.180709777452588d + "'", double1 == 22.180709777452588d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9261711162367934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.863181544606687d + "'", double1 == 5.863181544606687d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.047996489290474884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046880235979570445d + "'", double1 == 0.046880235979570445d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.2599210498948732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0221161044594675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5301143212171575E15d + "'", double1 == 3.5301143212171575E15d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.23083849595387476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4804565494962835d + "'", double1 == 0.4804565494962835d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0035762205678407963d, 7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0035762205678407963d + "'", double2 == 0.0035762205678407963d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.863181544606687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 175.9194616402627d + "'", double1 == 175.9194616402627d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        int int1 = org.apache.commons.math.util.FastMath.abs(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2228636002804178E-47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4308653429145085E-63d + "'", double1 == 2.4308653429145085E-63d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 274877906944L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.33959286127792d + "'", double1 == 26.33959286127792d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.378697984345966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.016421137029044217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23104906018664845d + "'", double1 == 0.23104906018664845d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6103789692086523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3162739259961891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3162739259961891d + "'", double1 == 0.3162739259961891d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2083543502704375d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        float float2 = org.apache.commons.math.util.FastMath.min((-4.0f), (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0798594392233403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036300395193130185d + "'", double1 == 0.036300395193130185d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7955086123527585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6615183426519794d + "'", double1 == 0.6615183426519794d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5997823587707154d + "'", double1 == 1.5997823587707154d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4133588461770283d + "'", double1 == 1.4133588461770283d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6590683909191797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 95.05761672322959d + "'", double1 == 95.05761672322959d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4397451933719909d) + "'", double1 == (-0.4397451933719909d));
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9221885224184981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5147880418821518d + "'", double1 == 2.5147880418821518d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.276858964458209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996232838047843d + "'", double1 == 0.9996232838047843d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int int2 = org.apache.commons.math.util.FastMath.min((-4), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21051295027658917d + "'", double1 == 0.21051295027658917d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.013267898272381876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999119827289205d + "'", double1 == 0.9999119827289205d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.951386703658795E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double double1 = org.apache.commons.math.util.FastMath.ceil(171.78552109133562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 172.0d + "'", double1 == 172.0d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7138297703395624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9897881448302445d + "'", double1 == 0.9897881448302445d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        float float2 = org.apache.commons.math.util.FastMath.max(2.74877907E11f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.74877907E11f + "'", float2 == 2.74877907E11f);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.15175275993832957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15292849116466664d + "'", double1 == 0.15292849116466664d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(26.33959286127792d, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.339592861277925d + "'", double2 == 26.339592861277925d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        float float2 = org.apache.commons.math.util.FastMath.max(11013.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.035308797215385d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.003875819055588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.517847587123896d + "'", double1 == 57.517847587123896d);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.11100049204224008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.359859717895836d + "'", double1 == 6.359859717895836d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.021248852757409047d, (-0.26852417051818694d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.062625214351322d + "'", double2 == 3.062625214351322d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6065871573381094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065871573381094d + "'", double1 == 0.6065871573381094d);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1727924348551592d + "'", double1 == 0.1727924348551592d);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768986d + "'", double1 == 5557.690612768986d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9980487804878049d + "'", double1 == 0.9980487804878049d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0580220586617817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2667629006989776d + "'", double1 == 1.2667629006989776d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2851156853967676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5643275751081487d + "'", double1 == 1.5643275751081487d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5563906530042565d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6275902047702033d) + "'", double1 == (-0.6275902047702033d));
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.057233205734539244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05717079571676086d + "'", double1 == 0.05717079571676086d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.297288184003927d + "'", double1 == 0.297288184003927d);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        float float2 = org.apache.commons.math.util.FastMath.max(416128.0f, 55.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5341303138750584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.6034126950388d + "'", double1 == 30.6034126950388d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 84677176L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(13.781934843695915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3975632004991088d + "'", double1 == 2.3975632004991088d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.34143015186032E-13d, 1.5485217903960327d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.740927894842705E-13d + "'", double2 == 4.740927894842705E-13d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7609048895609227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6483307938061412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6947140785078793d + "'", double1 == 0.6947140785078793d);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000463958854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000463958854d + "'", double1 == 1.0000000463958854d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-4));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3112833096758056d + "'", double1 == 1.3112833096758056d);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.10506753677637078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10506753677637079d + "'", double1 == 0.10506753677637079d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 416128);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 416128.0f + "'", float1 == 416128.0f);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.3368086899420177E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4848083448933725E-17d + "'", double1 == 2.4848083448933725E-17d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double double1 = org.apache.commons.math.util.FastMath.atanh(215.5579348013961d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0741466672417709d, 0.9980487804878049d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9980487804878049d + "'", double2 == 0.9980487804878049d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double1 = org.apache.commons.math.util.FastMath.acos(2049.000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.3182714301523224d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.44160428466265983d, 0.8448454122626561d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4416042846626599d + "'", double2 == 0.4416042846626599d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double1 = org.apache.commons.math.util.FastMath.log10((-4.084289455298592d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.7174132092735896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double1 = org.apache.commons.math.util.FastMath.floor((-4.084289455298592d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2026142367355531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0035362855424506488d + "'", double1 == 0.0035362855424506488d);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2842089146420203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2921168138549946d + "'", double1 == 0.2921168138549946d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5013507798060324d, 1.1173954566600866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46231681775633493d + "'", double2 == 0.46231681775633493d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 15472906L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15472906 + "'", int1 == 15472906);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8868316935392928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9607573933045136d + "'", double1 == 0.9607573933045136d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-3.380515006246585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9659700754028167d) + "'", double1 == (-0.9659700754028167d));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        long long1 = org.apache.commons.math.util.FastMath.round(0.025470578295336027d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.821637045374455E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0001353885748059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7586713254405011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11994633011584259d) + "'", double1 == (-0.11994633011584259d));
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 224.18766003551505d + "'", double1 == 224.18766003551505d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7586713254405011d, 5.303304908059076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7586713254405012d + "'", double2 == 0.7586713254405012d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        double double1 = org.apache.commons.math.util.FastMath.asinh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0615776890930098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.79104479655494d + "'", double1 == 1.79104479655494d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8385206858446207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5540801229283607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6242971965547152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8965647786762592d + "'", double1 == 0.8965647786762592d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0679333434477085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06572532608811625d + "'", double1 == 0.06572532608811625d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.8828470691743546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8924232090626707d, (-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8924232090626706d + "'", double2 == 0.8924232090626706d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9555114450274362d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1267112619868758d + "'", double1 == 1.1267112619868758d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24134492463194956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24369470893416073d + "'", double1 == 0.24369470893416073d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        long long1 = org.apache.commons.math.util.FastMath.abs(28L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.138692313968385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.48833029705642d + "'", double1 == 8.48833029705642d);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.9823021454200065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.11722616095796d + "'", double1 == 1.11722616095796d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double2 = org.apache.commons.math.util.FastMath.max(1.79104479655494d, 7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896296018267969E13d + "'", double2 == 7.896296018267969E13d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.1140439897145558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.278159705025557d + "'", double1 == 11.278159705025557d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double2 = org.apache.commons.math.util.FastMath.max(28.000000000000004d, 0.00285907349248556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.000000000000004d + "'", double2 == 28.000000000000004d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7833882657167645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3228658238308055d + "'", double1 == 1.3228658238308055d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double double1 = org.apache.commons.math.util.FastMath.floor(18.94750415825669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966758829408293d + "'", double1 == 0.9966758829408293d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0461741978670857E-4d + "'", double1 == 3.0461741978670857E-4d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.30557409445340483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30557409445340483d + "'", double1 == 0.30557409445340483d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double1 = org.apache.commons.math.util.FastMath.atan(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5257426154328373d + "'", double1 == 1.5257426154328373d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double2 = org.apache.commons.math.util.FastMath.min(0.569270896282244d, 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.569270896282244d + "'", double2 == 0.569270896282244d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.27235277350985465d), 1.5707963267948823d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5588710554571172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027207432531765816d + "'", double1 == 0.027207432531765816d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7076312586751925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6589071296001404d) + "'", double1 == (-0.6589071296001404d));
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3061339104324154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3013745589365472d + "'", double1 == 0.3013745589365472d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.11803632173468953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9279843325100741d) + "'", double1 == (-0.9279843325100741d));
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.951853132063153E-7d, 0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8443005821425256E-6d + "'", double2 == 1.8443005821425256E-6d);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4418411684567414d, 7.049772952917979E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.049772952917979E12d + "'", double2 == 7.049772952917979E12d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double double1 = org.apache.commons.math.util.FastMath.log1p(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2399333220157684d + "'", double1 == 4.2399333220157684d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        float float2 = org.apache.commons.math.util.FastMath.max((-53.0f), 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 5L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        long long1 = org.apache.commons.math.util.FastMath.round(0.013267898272381876d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0009877980461308d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.6659095108044255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.159396881398953d + "'", double1 == 2.159396881398953d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        float float1 = org.apache.commons.math.util.FastMath.abs((-53.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.37228331994979d + "'", double1 == 71.37228331994979d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.6691802474974652E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6691802474942956E-6d + "'", double1 == 2.6691802474942956E-6d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        long long2 = org.apache.commons.math.util.FastMath.max(274877906944L, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 274877906944L + "'", long2 == 274877906944L);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.11994633011584259d), 0.14314380086313663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14314380086313663d + "'", double2 == 0.14314380086313663d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8470258791360018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07210332049070342d) + "'", double1 == (-0.07210332049070342d));
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.293329949408897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8359466061307562d) + "'", double1 == (-0.8359466061307562d));
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7156372641383866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.00299489741845d + "'", double1 == 41.00299489741845d);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 11013L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8359466061307562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7604924191950363d) + "'", double1 == (-0.7604924191950363d));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9309148936420054d, (-0.8203560256686975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8203560256686975d) + "'", double2 == (-0.8203560256686975d));
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.912812809961445d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9059108349693629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04291454601682609d) + "'", double1 == (-0.04291454601682609d));
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        double double1 = org.apache.commons.math.util.FastMath.log1p(833.7240977253724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.727101248363734d + "'", double1 == 6.727101248363734d);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double1 = org.apache.commons.math.util.FastMath.asin(2062.6480624709634d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math.util.FastMath.cos(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915007d) + "'", double1 == (-0.9036922050915007d));
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2743356563668091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9626053857092893d + "'", double1 == 0.9626053857092893d);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1679596500040805d + "'", double1 == 4.1679596500040805d);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.752053732535971E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999997720488606d + "'", double1 == 0.9999997720488606d);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9663516425671945d + "'", double1 == 0.9663516425671945d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(23.620277154609447d, 4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.620277154609443d + "'", double2 == 23.620277154609443d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9171523356672712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7938732240748424d + "'", double1 == 0.7938732240748424d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.7045107871079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9839623687554913d + "'", double1 == 1.9839623687554913d);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.027414190085478973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027793416457935965d + "'", double1 == 0.027793416457935965d);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.9290529400482024d, 0.9990342965546459d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.242092215277729d + "'", double2 == 1.242092215277729d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.244277192748949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.85985224581786d + "'", double1 == 34.85985224581786d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5215691996538042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5004202174768195d) + "'", double1 == (-0.5004202174768195d));
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0454926245955656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3005056373354028d + "'", double1 == 0.3005056373354028d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0986122886681096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7412763113750152d + "'", double1 == 0.7412763113750152d);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025624541614806685d) + "'", double1 == (-0.025624541614806685d));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3781636423089436E12d + "'", double1 == 1.3781636423089436E12d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4133588461770283d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9171523356672712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948766d + "'", double1 == 1.5707963267948766d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double1 = org.apache.commons.math.util.FastMath.floor(17.322108077097887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3655839376264684d + "'", double1 == 0.3655839376264684d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double2 = org.apache.commons.math.util.FastMath.min(100.0d, 2.219048724654734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.219048724654734d + "'", double2 == 2.219048724654734d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.477141806555308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6114619437197315d + "'", double1 == 1.6114619437197315d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math.util.FastMath.log10(105.29607152181329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.022412168448307d + "'", double1 == 2.022412168448307d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2929710785315947d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874927409906d + "'", double1 == 10.017874927409906d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5659627585563982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4485008160319364d + "'", double1 == 0.4485008160319364d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3234882492226412d, 0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2536376160922087d + "'", double2 == 1.2536376160922087d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-5.629499534213125E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        long long1 = org.apache.commons.math.util.FastMath.round(2.205992763916979d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5067985556900776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1453217742909305d + "'", double1 == 2.1453217742909305d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.42157803635284585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.653673562487557d, 5.2846029059076024E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0215193264966856E-21d + "'", double2 == 5.0215193264966856E-21d);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6811167122883163d + "'", double1 == 0.6811167122883163d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double double1 = org.apache.commons.math.util.FastMath.tanh(44.78115991081384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.316173196322488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36477103147801476d + "'", double1 == 0.36477103147801476d);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2845116435464194d + "'", double1 == 2.2845116435464194d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.2991889085111596d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7414193357820069d + "'", double1 == 0.7414193357820069d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9037520325301021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7185364026199063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012540826021152975d + "'", double1 == 0.012540826021152975d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3132616875182233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8916040425905878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04982797106797227d) + "'", double1 == (-0.04982797106797227d));
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double double1 = org.apache.commons.math.util.FastMath.acos(45.41047360972814d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double1 = org.apache.commons.math.util.FastMath.cosh(55.37844799163721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.617258155747426E23d + "'", double1 == 5.617258155747426E23d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double double1 = org.apache.commons.math.util.FastMath.acosh(57.292734699501686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741244831014441d + "'", double1 == 4.741244831014441d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        double double2 = org.apache.commons.math.util.FastMath.max(4.844187086458591d, 198511.1294275471d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198511.1294275471d + "'", double2 == 198511.1294275471d);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.1538315676666131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.813899583178067d) + "'", double1 == (-8.813899583178067d));
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0327340166022558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5124730541256319d + "'", double1 == 0.5124730541256319d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double1 = org.apache.commons.math.util.FastMath.expm1(24.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.648912212884347E10d + "'", double1 == 2.648912212884347E10d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2268480630938991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4834748111766378d) + "'", double1 == (-1.4834748111766378d));
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0808866710930027E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0808866710929876E-7d + "'", double1 == 2.0808866710929876E-7d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.2057952278721d + "'", double1 == 74.2057952278721d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.7568396789787584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.394775987579248d + "'", double1 == 21.394775987579248d);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        double double2 = org.apache.commons.math.util.FastMath.min(0.921688867296064d, 1.1316153248585041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.921688867296064d + "'", double2 == 0.921688867296064d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5320411334091114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5096851415624919d + "'", double1 == 0.5096851415624919d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double1 = org.apache.commons.math.util.FastMath.log(1.026102280813798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025767430682306667d + "'", double1 == 0.025767430682306667d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5569307316547285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1590168869266604d + "'", double1 == 1.1590168869266604d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(77.26503394947866d, (-0.04291454601682609d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 77.26503394947865d + "'", double2 == 77.26503394947865d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0009877980461308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 15472906L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3933.5614905578886d + "'", double1 == 3933.5614905578886d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        float float1 = org.apache.commons.math.util.FastMath.abs(416128.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 416128.0f + "'", float1 == 416128.0f);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.71315737027922d + "'", double1 == 201.71315737027922d);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.014014916583006168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0141135859351529d + "'", double1 == 1.0141135859351529d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2418689364577661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6500970221088582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5764434229163654d + "'", double1 == 0.5764434229163654d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.22031529761059193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21857083091550567d + "'", double1 == 0.21857083091550567d);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.1003275537854505E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4667272212422093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46672722124220933d + "'", double1 == 0.46672722124220933d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2464988104479273d + "'", double1 == 2.2464988104479273d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3967546673214364d) + "'", double1 == (-1.3967546673214364d));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.032611072057901d + "'", double1 == 1.032611072057901d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 55L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.15912713462618d + "'", double1 == 4.15912713462618d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7305466429491709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7448097514430837d + "'", double1 == 0.7448097514430837d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 274877906944L, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.74877907E11f + "'", float2 == 2.74877907E11f);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.041574577518914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 288.86094539228486d + "'", double1 == 288.86094539228486d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9926395119337849d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1034585241152786d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7076312586751926d), 0.4081112474421564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7076312586751926d) + "'", double2 == (-0.7076312586751926d));
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0002284177042067d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3292773492529157d, 0.6826664571216055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2144740142210173d + "'", double2 == 1.2144740142210173d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5785812223437699d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8372393319006808d + "'", double1 == 0.8372393319006808d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.467720335926631E7d + "'", double1 == 8.467720335926631E7d);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        int int2 = org.apache.commons.math.util.FastMath.min(4, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.817884356931778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1173954566600866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9619978945176638d + "'", double1 == 0.9619978945176638d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1021241580712529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0329441506769634d + "'", double1 == 1.0329441506769634d);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double double1 = org.apache.commons.math.util.FastMath.tanh(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double2 = org.apache.commons.math.util.FastMath.min(0.006589358495248128d, 0.9984579799537394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006589358495248128d + "'", double2 == 0.006589358495248128d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2316310948340863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02149601777479733d + "'", double1 == 0.02149601777479733d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5395250166930861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00941648793817172d + "'", double1 == 0.00941648793817172d);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.log(416128.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.938748184223522d + "'", double1 == 12.938748184223522d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7732774675530747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1116646444966368d) + "'", double1 == (-0.1116646444966368d));
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        double double1 = org.apache.commons.math.util.FastMath.acos(57.517847587123896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4499136391552796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9872460216486223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8345117301386048d + "'", double1 == 0.8345117301386048d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1578212823495775d + "'", double1 == 1.1578212823495775d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-5.316577016430221E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.316577016380129E-6d) + "'", double1 == (-5.316577016380129E-6d));
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5447358754943394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.2723414689118314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2793911354105798d) + "'", double1 == (-0.2793911354105798d));
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.924097546764221d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08594171488041112d) + "'", double1 == (-0.08594171488041112d));
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.452674104609824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.766656752030037d + "'", double1 == 5.766656752030037d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.009730277093455045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009729970023077877d + "'", double1 == 0.009729970023077877d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7219067166708869d), 1.0000451959965992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7219067166708868d) + "'", double2 == (-0.7219067166708868d));
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5791193270433386d + "'", double1 == 1.5791193270433386d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000002279510873d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1933463270565558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.376224634367275d + "'", double1 == 1.376224634367275d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7425442460725571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.634578497998064d + "'", double1 == 0.634578497998064d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        long long2 = org.apache.commons.math.util.FastMath.max((-36L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.10757413843619563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10757413843619563d + "'", double1 == 0.10757413843619563d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6803629519678808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8297894823635735d + "'", double1 == 0.8297894823635735d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.37358420207865345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        double double1 = org.apache.commons.math.util.FastMath.sinh(31.330643198305168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0216010749472336E13d + "'", double1 == 2.0216010749472336E13d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0926396835566503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03847696959674483d + "'", double1 == 0.03847696959674483d);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        int int2 = org.apache.commons.math.util.FastMath.min(149, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4337042405910991d + "'", double1 == 1.4337042405910991d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4657022738769552d, 1.166594879293176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.465702273876955d + "'", double2 == 1.465702273876955d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.544753606236012E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5447536062360122E-12d + "'", double1 == 1.5447536062360122E-12d);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8292136654695167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1856140964708441d) + "'", double1 == (-1.1856140964708441d));
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.14336970329182344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14386546036866116d + "'", double1 == 0.14386546036866116d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4632517768651745d + "'", double1 == 2.4632517768651745d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.10757413843619563d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.769916847424642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8774490568828722d + "'", double1 == 0.8774490568828722d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math.util.FastMath.acos(18.94750415825669d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.265795015415366E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0006267758434833d + "'", double1 == 1.0006267758434833d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.192987713658941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7154172950779301d + "'", double1 == 0.7154172950779301d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10462257884688057d + "'", double1 == 0.10462257884688057d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.023780854648827218d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.32220799131551875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.311704553863275d) + "'", double1 == (-0.311704553863275d));
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.608239979297323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4650188248182274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2103796201267714d + "'", double1 == 1.2103796201267714d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        double double1 = org.apache.commons.math.util.FastMath.acos(18.947504158256688d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.844187086458591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.50393700787401d + "'", double1 == 63.50393700787401d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.772202675694091d + "'", double1 == 2.772202675694091d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        int int2 = org.apache.commons.math.util.FastMath.max(6, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        double double2 = org.apache.commons.math.util.FastMath.max(5506.500045400885d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.989082137816156E-4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0997501702946164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8328682075004891d + "'", double1 == 0.8328682075004891d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5591799640801441d) + "'", double1 == (-0.5591799640801441d));
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6627966601314947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7882744648924518d + "'", double1 == 0.7882744648924518d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017451707835378805d + "'", double1 == 0.017451707835378805d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39731803409120725d) + "'", double1 == (-0.39731803409120725d));
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0926396835566503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.797839565109256d + "'", double1 == 0.797839565109256d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9922991399818323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1633528750218218d + "'", double1 == 1.1633528750218218d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        double double1 = org.apache.commons.math.util.FastMath.log(74.2057952278721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.306842249924981d + "'", double1 == 4.306842249924981d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.570796326794896d, 2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948961d + "'", double2 == 1.5707963267948961d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17895840892620393d) + "'", double1 == (-0.17895840892620393d));
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double2 = org.apache.commons.math.util.FastMath.max(0.09933992780358329d, 1.0002284177042067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0002284177042067d + "'", double2 == 1.0002284177042067d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        double double1 = org.apache.commons.math.util.FastMath.atan(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.046638298095111E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8795409825708094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4123833316742815d + "'", double1 == 1.4123833316742815d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.978724151380226E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.978724063281508E-4d) + "'", double1 == (-2.978724063281508E-4d));
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9418502147163486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9996232838047843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852097698166124d + "'", double1 == 0.7852097698166124d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.0559214943204758d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-5.650670009067568d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0986227966019269d) + "'", double1 == (-0.0986227966019269d));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.37218765288965655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        double double1 = org.apache.commons.math.util.FastMath.asin(28.476411608537198d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8934868792764122d + "'", double1 == 0.8934868792764122d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9963655798023592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0875425747804d + "'", double1 == 57.0875425747804d);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.499686190671499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7046910343691102d + "'", double1 == 1.7046910343691102d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.42149796567476777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5242431102058631d + "'", double1 == 1.5242431102058631d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double2 = org.apache.commons.math.util.FastMath.pow((-7.016709298534876E-15d), 1.9839623687554913d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 52, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        double double1 = org.apache.commons.math.util.FastMath.signum(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9963655798023592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08528333759276409d + "'", double1 == 0.08528333759276409d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7849678260893329d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6555488695639239d) + "'", double1 == (-0.6555488695639239d));
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        double double1 = org.apache.commons.math.util.FastMath.log(28.43781006905283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3477196001788587d + "'", double1 == 3.3477196001788587d);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3211090992020036d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9486832980505138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9740037464252967d + "'", double1 == 0.9740037464252967d);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-4L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3297065169161864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28495825391099355d + "'", double1 == 0.28495825391099355d);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        int int2 = org.apache.commons.math.util.FastMath.max((-4), 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.15912713462618d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1316153248585041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9714474050397283d + "'", double1 == 0.9714474050397283d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.6881171418161356E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9990342965546459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990342965546459d + "'", double1 == 0.9990342965546459d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8226212809177448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8226212809177448d + "'", double1 == 0.8226212809177448d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.752053732535971E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000002279511566d + "'", double1 == 1.0000002279511566d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9930368739582951d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.828393152171177d) + "'", double1 == (-2.828393152171177d));
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5297042362484659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        int int2 = org.apache.commons.math.util.FastMath.max(149, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9913289158005998d + "'", double1 == 0.9913289158005998d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double1 = org.apache.commons.math.util.FastMath.log10(41.01558075875642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6129488653088495d + "'", double1 == 1.6129488653088495d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3669495678698107d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        double double1 = org.apache.commons.math.util.FastMath.log10((-4.476915139009423d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        double double1 = org.apache.commons.math.util.FastMath.ceil(11.275731748166242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        double double1 = org.apache.commons.math.util.FastMath.abs(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 11013);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(74.2057952278721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.614278566883712d + "'", double1 == 8.614278566883712d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.22073986460634293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4698296123131693d + "'", double1 == 0.4698296123131693d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.709640090012462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 110.01219831593043d + "'", double1 == 110.01219831593043d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3707603104765322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.190968782399803d + "'", double1 == 1.190968782399803d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.6664505058576533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.569197741437403d + "'", double1 == 19.569197741437403d);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.342510013496884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1279175336939193d + "'", double1 == 0.1279175336939193d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double1 = org.apache.commons.math.util.FastMath.log(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 363.7080191456556d + "'", double1 == 363.7080191456556d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.11776318452497536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11831214619987152d + "'", double1 == 0.11831214619987152d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8463869133158289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1641532182693481E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1641532182693481E-10d + "'", double1 == 1.1641532182693481E-10d);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94284158531254d + "'", double1 == 104.94284158531254d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5679327709600677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2941231550911616d + "'", double1 == 2.2941231550911616d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 28L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.446257064291475E12d + "'", double1 == 1.446257064291475E12d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2309594173407747d + "'", double1 == 1.2309594173407747d);
    }
}

