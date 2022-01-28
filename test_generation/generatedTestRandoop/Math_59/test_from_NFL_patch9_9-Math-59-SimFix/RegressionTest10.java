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
        double double2 = org.apache.commons.math.util.FastMath.min(11.591953275521519d, 2.2829673798684508E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.591953275521519d + "'", double2 == 11.591953275521519d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.594985873324243E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707803769361628d + "'", double1 == 1.5707803769361628d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double double1 = org.apache.commons.math.util.FastMath.log1p(27.722354182756217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.357675710972333d + "'", double1 == 3.357675710972333d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22766430356286294d + "'", double1 == 0.22766430356286294d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5944033714909972d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.248291097914389d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3235780930645504d, (-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7454928479817351d + "'", double2 == 0.7454928479817351d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9176021804981276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162005601990669d + "'", double1 == 1.162005601990669d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.810721175460831E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5709773989134321d + "'", double1 == 1.5709773989134321d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.6540468455730294E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6695915964485293E-9d + "'", double1 == 1.6695915964485293E-9d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.169643873696645d + "'", double1 == 6.169643873696645d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.02350739754725d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0111706374508639E-10d + "'", double1 == 1.0111706374508639E-10d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double1 = org.apache.commons.math.util.FastMath.tan(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.614234282244587d + "'", double1 == 1.614234282244587d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.427348303568163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 226.54506429048942d + "'", double1 == 226.54506429048942d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.06728499818968087d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13873071426144487d) + "'", double1 == (-0.13873071426144487d));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.677261497848975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.53797086347916d + "'", double1 == 39.53797086347916d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.330583428267176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.15958182281264355d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5399687534597263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49510907103385027d + "'", double1 == 0.49510907103385027d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999999d + "'", double1 == 0.9999999999999999d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5311751345663922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5311751345663923d + "'", double1 == 0.5311751345663923d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5065900109542124d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5359549985579515d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5619846939613335d) + "'", double1 == (-0.5619846939613335d));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.30756025842063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0995037190209989d + "'", double1 == 0.0995037190209989d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.100327553785448E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.411092370385766E-19d + "'", double1 == 5.411092370385766E-19d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.33925861454291717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9430016488922662d + "'", double1 == 0.9430016488922662d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double double2 = org.apache.commons.math.util.FastMath.min(3.084931348079087d, 0.011800350358700291d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011800350358700291d + "'", double2 == 0.011800350358700291d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double1 = org.apache.commons.math.util.FastMath.acosh(69.9857113690718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.941387233322628d + "'", double1 == 4.941387233322628d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395564933646284d + "'", double1 == 1.5395564933646284d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.01743935748923473d, (-0.16174140574189208d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017439357489234728d + "'", double2 == 0.017439357489234728d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1740434439996548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2350469597522027d + "'", double1 == 2.2350469597522027d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6105647004975028d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 72, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5442239942543037E37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4416248142133119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double2 = org.apache.commons.math.util.FastMath.max(0.03202856368786667d, 3.121587127777053E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03202856368786667d + "'", double2 == 0.03202856368786667d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6176678248388561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.09388108110331789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09401953689254947d) + "'", double1 == (-0.09401953689254947d));
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006910197462126033d) + "'", double1 == (-0.006910197462126033d));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.294956681159677d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0899797098486261d) + "'", double1 == (-1.0899797098486261d));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        int int1 = org.apache.commons.math.util.FastMath.round((-3.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1936674.200214743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.12796368962740468d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12831320362729703d) + "'", double1 == (-0.12831320362729703d));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double double1 = org.apache.commons.math.util.FastMath.exp(22.18070977745259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.294967294000012E9d + "'", double1 == 4.294967294000012E9d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5589356908721315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.571817330503849d + "'", double1 == 0.571817330503849d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8365164337420496d + "'", double1 == 0.8365164337420496d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6535657774206832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9223834135669848d + "'", double1 == 0.9223834135669848d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double1 = org.apache.commons.math.util.FastMath.log1p(71.39110387530145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.28208341719143d + "'", double1 == 4.28208341719143d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9394827641334688d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6656171301354403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9720385499927633d + "'", double1 == 0.9720385499927633d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(174.92896910346727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.226071567304755d + "'", double1 == 13.226071567304755d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double2 = org.apache.commons.math.util.FastMath.min(4.584967478670572d, 1.0341118110464225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0341118110464225d + "'", double2 == 1.0341118110464225d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.251952459411674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25462659179339014d + "'", double1 == 0.25462659179339014d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.ulp(31.306852819440046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6620929831696072d) + "'", double1 == (-0.6620929831696072d));
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.3843670665782926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.358364510279281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        double double1 = org.apache.commons.math.util.FastMath.abs((-9.714248156445102d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.714248156445102d + "'", double1 == 9.714248156445102d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math.util.FastMath.asin(28.476411608537195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007084150078732777d + "'", double1 == 0.007084150078732777d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5544646780753981d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.125899906842619E15d) + "'", double1 == (-1.125899906842619E15d));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.703675447601967d + "'", double1 == 14.703675447601967d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9597713318903205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.99084661496516d + "'", double1 == 54.99084661496516d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6048394375639378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7007434110857121d + "'", double1 == 0.7007434110857121d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5864322888707242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.797563773299419d + "'", double1 == 1.797563773299419d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6245825288299705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0717009473084772E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0717009176697242E-4d + "'", double1 == 2.0717009176697242E-4d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.052455059316914306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0524310073195241d) + "'", double1 == (-0.0524310073195241d));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6176678248388561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7103940468474689d + "'", double1 == 0.7103940468474689d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.35088571671474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9977092024346516d + "'", double1 == 0.9977092024346516d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.21551488653168732d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.993848217574073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.717637540215414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5447113544610696d) + "'", double1 == (-0.5447113544610696d));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, 72.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double1 = org.apache.commons.math.util.FastMath.tan((-11.046068560414216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.7873918878129d + "'", double1 == 19.7873918878129d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (byte) 100, 2.928261786081652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9226350743220142d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9250245035569947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.910203733964713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.150832453226435d + "'", double1 == 52.150832453226435d);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.4677203E7d, 1.0003963416279558d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796314980662d + "'", double2 == 1.570796314980662d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 72);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.0d + "'", double1 == 72.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9669091747253342d + "'", double1 == 0.9669091747253342d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.2015841995251388E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.884570336239587E-9d) + "'", double1 == (-6.884570336239587E-9d));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9640275800758169d) + "'", double1 == (-0.9640275800758169d));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4123217725605077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9309496169302012d + "'", double1 == 1.9309496169302012d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math.util.FastMath.asinh(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.346596288441431d + "'", double1 == 5.346596288441431d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.08799424496928993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7556232703920002d + "'", double1 == 0.7556232703920002d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.144372335284569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994974667686599d + "'", double1 == 0.9994974667686599d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5093497777060075d + "'", double1 == 0.5093497777060075d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 3.490658503988659d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.490658503988659d + "'", double2 == 3.490658503988659d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6931471805599463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.71440802747734d + "'", double1 == 39.71440802747734d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 175L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 175L + "'", long2 == 175L);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(103646.29347944363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.97332022531634d + "'", double1 == 46.97332022531634d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0311019009248779d, 1.5563025007672873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5851354327337928d + "'", double2 == 0.5851354327337928d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(271.6563638137265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741297982545107d + "'", double1 == 4.741297982545107d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7964493619549832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.980990341745093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1460783373166685d + "'", double1 == 1.1460783373166685d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5716776679087392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5716776679087392d + "'", double1 == 0.5716776679087392d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1647182772090332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0792211437926118d + "'", double1 == 1.0792211437926118d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1555516045788385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9872039973492128d + "'", double1 == 0.9872039973492128d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3961990902973522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8631246376794037d + "'", double1 == 0.8631246376794037d);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650188248182274d + "'", double1 == 1.4650188248182274d);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        int int1 = org.apache.commons.math.util.FastMath.round(175.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 175 + "'", int1 == 175);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0888874903416256E-14d + "'", double1 == 5.0888874903416256E-14d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double double1 = org.apache.commons.math.util.FastMath.atanh(10.000069652443239d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8713868162390155d, 0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8713868162390155d + "'", double2 == 0.8713868162390155d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02002249477008881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.550772493946048d + "'", double1 == 1.550772493946048d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1102230246251565E-16d) + "'", double1 == (-1.1102230246251565E-16d));
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7651141195590695d, 0.7134535544390084d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7651141195590694d + "'", double2 == 0.7651141195590694d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3168008123704915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11952008579643952d + "'", double1 == 0.11952008579643952d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9232595127935677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 14, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707963270671181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567785554935d + "'", double1 == 0.027415567785554935d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.30726023062048147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31730925009496586d + "'", double1 == 0.31730925009496586d);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7857868058746702d, 0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.811629889474638d + "'", double2 == 0.811629889474638d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8032795313693358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9295845569456044d + "'", double1 == 0.9295845569456044d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 1833.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1833L + "'", long1 == 1833L);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.127374547607299d + "'", double1 == 2.127374547607299d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.270624161294803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9995917534020515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.773354455044319E-4d) + "'", double1 == (-1.773354455044319E-4d));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.716225035560587d + "'", double1 == 22.716225035560587d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.951998196031877d), 0.01645512199317914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9519981960318769d) + "'", double2 == (-0.9519981960318769d));
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.753527162054068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.033133040651895d + "'", double1 == 2.033133040651895d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3394482820132315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35311624476434156d) + "'", double1 == (-0.35311624476434156d));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        double double1 = org.apache.commons.math.util.FastMath.rint(68.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.0d + "'", double1 == 68.0d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.4331632610984664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.008838092819754678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5796345346787104d + "'", double1 == 1.5796345346787104d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math.util.FastMath.log(1.582697034944376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4591303759392693d + "'", double1 == 0.4591303759392693d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.09388108110331789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.947140865203826d, 3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9471408652038261d + "'", double2 == 0.9471408652038261d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        long long1 = org.apache.commons.math.util.FastMath.round(3.3015966351452155d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5169642656554078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1366286499604767d + "'", double1 == 1.1366286499604767d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.753527162054068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.323945308420996d + "'", double1 == 21.323945308420996d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        int int2 = org.apache.commons.math.util.FastMath.max((-3), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.958177806871242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4228320252930724d + "'", double1 == 1.4228320252930724d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double2 = org.apache.commons.math.util.FastMath.max(0.035124005767007416d, 1.0893507405929967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0893507405929967d + "'", double2 == 1.0893507405929967d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 1833);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double1 = org.apache.commons.math.util.FastMath.cosh(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.470017988445906E22d + "'", double1 == 9.470017988445906E22d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7017203400855395d), 75.83543858857243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 75.83543858857243d + "'", double2 == 75.83543858857243d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.010374295917472898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21809859971375445d) + "'", double1 == (-0.21809859971375445d));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3670376550625507d + "'", double1 == 2.3670376550625507d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.049787068367863944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04982826625822182d + "'", double1 == 0.04982826625822182d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.975185951049946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.086833375744787d) + "'", double1 == (-0.086833375744787d));
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8585102001747416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8585102001747416d + "'", double1 == 0.8585102001747416d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4862788570863891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4526105640476662d + "'", double1 == 0.4526105640476662d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        double double2 = org.apache.commons.math.util.FastMath.min(3.8120133682438273d, 1.893622651558004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.893622651558004d + "'", double2 == 1.893622651558004d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9990737979836914d, 5506.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00608437406795188d + "'", double2 == 0.00608437406795188d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.9327515395324766E246d + "'", double1 == 5.9327515395324766E246d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7084672892615039d + "'", double1 == 0.7084672892615039d);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9471408652038261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8117490720018438d + "'", double1 == 0.8117490720018438d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2924316695611777d, (-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8915455315224443d + "'", double2 == 1.8915455315224443d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double2 = org.apache.commons.math.util.FastMath.max(15.0d, 0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.0d + "'", double2 == 15.0d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.881221190967907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6319211356265796d + "'", double1 == 0.6319211356265796d);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        long long1 = org.apache.commons.math.util.FastMath.round(14.476482730108394d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.251366653795176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8248883136696412d + "'", double1 == 1.8248883136696412d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.143775716219968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.762568627764521d + "'", double1 == 0.762568627764521d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8380289519085355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8380289519085355d + "'", double1 == 1.8380289519085355d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double double1 = org.apache.commons.math.util.FastMath.sin((-103.97207708399179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2950611482183454d + "'", double1 == 0.2950611482183454d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        long long2 = org.apache.commons.math.util.FastMath.max(53L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5669767943827967d, 206.89035656270292d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 206.89035656270292d + "'", double2 == 206.89035656270292d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double double1 = org.apache.commons.math.util.FastMath.abs(26.564939304500307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.564939304500307d + "'", double1 == 26.564939304500307d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.7487757631160047E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.2917098371502295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5721494028333372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999990845927568d + "'", double1 == 0.9999990845927568d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(21.487562597823967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1231.1466488784763d + "'", double1 == 1231.1466488784763d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.597379374759859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5665764324793966d + "'", double1 == 0.5665764324793966d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double2 = org.apache.commons.math.util.FastMath.min(0.21504954471869261d, 0.03511678415619611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03511678415619611d + "'", double2 == 0.03511678415619611d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6242971965547152d + "'", double1 == 0.6242971965547152d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double double1 = org.apache.commons.math.util.FastMath.log10(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149978319906d + "'", double1 == 1.505149978319906d);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.3043304676536818d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707055250154316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.080177934025127E-5d + "'", double1 == 9.080177934025127E-5d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math.util.FastMath.cos(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3212171779331709d) + "'", double1 == (-0.3212171779331709d));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double1 = org.apache.commons.math.util.FastMath.exp(103646.29347944363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5872139151568908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8324875211177079d + "'", double1 == 0.8324875211177079d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.810477380965351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380965352d + "'", double1 == 4.810477380965352d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6196139432498801d, 3.691076096637946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6196139432498802d + "'", double2 == 0.6196139432498802d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.13462871407679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9063773800902429d) + "'", double1 == (-0.9063773800902429d));
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.7626139187213443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0001153070642954d + "'", double1 == 2.0001153070642954d);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5506.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double double2 = org.apache.commons.math.util.FastMath.atan2(44.1377407200944d, 1.1531436238758581d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5446762457544896d + "'", double2 == 1.5446762457544896d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1833L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.28208341719143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.160950374690384d + "'", double1 == 2.160950374690384d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        long long2 = org.apache.commons.math.util.FastMath.max(11013L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        long long2 = org.apache.commons.math.util.FastMath.min(53L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.263814502040431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7112911764025783d + "'", double1 == 0.7112911764025783d);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0111706374508639E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0111706373997405E-10d + "'", double1 == 1.0111706373997405E-10d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6147492292213783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.55119399232989d + "'", double1 == 0.55119399232989d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5513081531541428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02707543498557225d + "'", double1 == 0.02707543498557225d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        long long1 = org.apache.commons.math.util.FastMath.round(0.14542111457707005d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 175L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.09388108110331789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.307013259236445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999835160613d + "'", double1 == 0.9999999835160613d);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double double2 = org.apache.commons.math.util.FastMath.min(4.691649480399158E41d, 39.53797086347916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.53797086347916d + "'", double2 == 39.53797086347916d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1612981381853015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175035239470709d + "'", double1 == 1.175035239470709d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.1616365426019666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4999119425680455d + "'", double1 == 0.4999119425680455d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8693235746902677d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9960029898367354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1690428558137103d + "'", double1 == 1.1690428558137103d);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double1 = org.apache.commons.math.util.FastMath.log(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.348459106948174d + "'", double1 == 3.348459106948174d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3986255640071519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8656105404126457d + "'", double1 == 0.8656105404126457d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.0305000985748444E41d, (-0.14042404529948058d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.983031862437426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9914796328908759d + "'", double1 == 0.9914796328908759d);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double double1 = org.apache.commons.math.util.FastMath.sinh(39.71440802747734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.8454160025236096E16d + "'", double1 == 8.8454160025236096E16d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6196139432498802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.691076096637946d, 0.8837010712667019d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.335804023725103d + "'", double2 == 1.335804023725103d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.035131231835661816d + "'", double1 == 0.035131231835661816d);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.4390790887957308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9848929415691015d) + "'", double1 == (-0.9848929415691015d));
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35357399678940143d) + "'", double1 == (-0.35357399678940143d));
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        double double1 = org.apache.commons.math.util.FastMath.exp(128.05875780734718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.122986142413734E55d + "'", double1 == 4.122986142413734E55d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11862641298045705d + "'", double1 == 0.11862641298045705d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        int int2 = org.apache.commons.math.util.FastMath.max(72, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 11013.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.2131105221355d + "'", double1 == 192.2131105221355d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.024704267641731482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.062374919401660824d) + "'", double1 == (-0.062374919401660824d));
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.3068506629900103E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0012941034727495249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000837352016d + "'", double1 == 1.000000837352016d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.38879069538562044d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double2 = org.apache.commons.math.util.FastMath.max(28.4764116085372d, (-0.024704267641731482d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.4764116085372d + "'", double2 == 28.4764116085372d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.5670287798288525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003767538053032665d + "'", double1 == 0.003767538053032665d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6229585671655451d) + "'", double1 == (-0.6229585671655451d));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math.util.FastMath.log(22.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.091042453358316d + "'", double1 == 3.091042453358316d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.746938918904175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6793958110074185d) + "'", double1 == (-0.6793958110074185d));
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.244277192748949d + "'", double1 == 4.244277192748949d);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7103940468474689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7716711998216207d + "'", double1 == 0.7716711998216207d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9997894669934126d, (double) 53L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9997894669934126d + "'", double2 == 1.9997894669934126d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double1 = org.apache.commons.math.util.FastMath.asinh(49.63039286521482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.597852065546174d + "'", double1 == 4.597852065546174d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.55460107782765d + "'", double1 == 16.55460107782765d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7165313105737893d + "'", double1 == 0.7165313105737893d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3574158419544757d, 9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.357415841954476d + "'", double2 == 1.357415841954476d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.rint(8525.954375188212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8526.0d + "'", double1 == 8526.0d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.663528081877013d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17632143880121934d + "'", double1 == 0.17632143880121934d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.6855685475011852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6387704377066317d + "'", double1 == 1.6387704377066317d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8175632803535192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44150617158823724d + "'", double1 == 0.44150617158823724d);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.016499688795946783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.246967376963645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1520712071332257d + "'", double1 == 1.1520712071332257d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.000000000000001d + "'", double1 == 6.000000000000001d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.16860807748755743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16781924358920813d + "'", double1 == 0.16781924358920813d);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5135318290179205d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 14, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.955817372303998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.99743594923893d + "'", double1 == 192.99743594923893d);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3822932005034183d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.003767538053032665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037604586572327447d + "'", double1 == 0.0037604586572327447d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.16954561468575624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0144073205767572d + "'", double1 == 1.0144073205767572d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8660262953611549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7834002924547043d + "'", double1 == 0.7834002924547043d);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1116752822606313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44316034533777954d + "'", double1 == 0.44316034533777954d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        float float2 = org.apache.commons.math.util.FastMath.max(175.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 175.0f + "'", float2 == 175.0f);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(70187.3299035258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4021437.7787643834d + "'", double1 == 4021437.7787643834d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        long long1 = org.apache.commons.math.util.FastMath.round(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.55119399232989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9870017657767483d + "'", double1 == 0.9870017657767483d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.259921049894873d), (-1.0156523399700865d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.259921049894873d) + "'", double2 == (-1.259921049894873d));
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1740434439996548d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.40992093582609207d, 1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.694732228393676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9165031085180287d + "'", double1 == 0.9165031085180287d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4137774971580666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.00348375772595d + "'", double1 == 81.00348375772595d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        int int2 = org.apache.commons.math.util.FastMath.min(175, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078068E-7d + "'", double1 == 1.1920928955078068E-7d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.atanh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        double double1 = org.apache.commons.math.util.FastMath.asinh(642935.4876213886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.066946848453556d + "'", double1 == 14.066946848453556d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8604282210872225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9511263541784306d + "'", double1 == 0.9511263541784306d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5146349215357182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9077581224596178d + "'", double1 == 0.9077581224596178d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9778913495481287d, 1.0000121526688588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000121526688588d + "'", double2 == 1.0000121526688588d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.15195825143981E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0737192693285789E-5d + "'", double1 == 1.0737192693285789E-5d);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6861038807844514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011974771730399332d + "'", double1 == 0.011974771730399332d);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 1833);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int int1 = org.apache.commons.math.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double double1 = org.apache.commons.math.util.FastMath.log(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4193244267567873d) + "'", double1 == (-1.4193244267567873d));
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.math.util.FastMath.log10(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7581226324091723d + "'", double1 == 2.7581226324091723d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.03492076949174774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.60572419759865d + "'", double1 == 1.60572419759865d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.941387233322628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-53), (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9335082459300553d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.803712352137012d) + "'", double1 == (-0.803712352137012d));
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02707543498557225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027082053072100973d + "'", double1 == 0.027082053072100973d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double1 = org.apache.commons.math.util.FastMath.tanh(22.716225035560587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.rint(22.18070977791825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.0d + "'", double1 == 22.0d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        double double1 = org.apache.commons.math.util.FastMath.atanh(15.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-59.10786673843406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0316268884157163d) + "'", double1 == (-1.0316268884157163d));
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.17119879283175632d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17203629754325797d) + "'", double1 == (-0.17203629754325797d));
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4591303759392693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8964382266143576d + "'", double1 == 0.8964382266143576d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.49536728921867335d, 34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4953672892186734d + "'", double2 == 0.4953672892186734d);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02300811819039169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023010148225475972d + "'", double1 == 0.023010148225475972d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6904153131565023d + "'", double1 == 0.6904153131565023d);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.1073424338879928E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963057214722d + "'", double1 == 1.5707963057214722d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.27234146891183075d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6042872728524414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6417418616465844d) + "'", double1 == (-0.6417418616465844d));
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0737192693285789E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0737192693285789E-5d + "'", double1 == 1.0737192693285789E-5d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4142135623730951d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2039819363249487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double double1 = org.apache.commons.math.util.FastMath.sinh(31.306852819440046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9740740045669996E13d + "'", double1 == 1.9740740045669996E13d);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9179618963970241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03717534551766489d) + "'", double1 == (-0.03717534551766489d));
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        float float1 = org.apache.commons.math.util.FastMath.abs(11013.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-54.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.99999999999999d) + "'", double1 == (-53.99999999999999d));
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9879623542931133d, (-0.3394482820132315d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9879623542931132d + "'", double2 == 0.9879623542931132d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.48313004522679587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4831300452267959d + "'", double1 == 0.4831300452267959d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2389254154223536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24363416035769922d + "'", double1 == 0.24363416035769922d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.246967376963645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7237368419565783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0621246647864042d + "'", double1 == 1.0621246647864042d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        double double1 = org.apache.commons.math.util.FastMath.log(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5364793041447001d + "'", double1 == 0.5364793041447001d);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.262451664828748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1235887436374343d + "'", double1 == 1.1235887436374343d);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.0899797098486261d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5878356581161792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.893147016352981d + "'", double1 == 4.893147016352981d);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18830010901986582d + "'", double1 == 0.18830010901986582d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9711243963529564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6213429619407828d) + "'", double1 == (-0.6213429619407828d));
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 72L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 1833.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702507731119777d + "'", double1 == 1.5702507731119777d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.16243485560816776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16243485560816776d + "'", double2 == 0.16243485560816776d);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.762568627764521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.651496622684403d + "'", double1 == 0.651496622684403d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.812549295306508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.33784800591283637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5812469405621301d + "'", double1 == 0.5812469405621301d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4274266235030733d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.954342383797684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.491013751652984d + "'", double1 == 1.491013751652984d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double1 = org.apache.commons.math.util.FastMath.exp(14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2955791.9999996633d + "'", double1 == 2955791.9999996633d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1508493389168752d) + "'", double1 == (-1.1508493389168752d));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        int int2 = org.apache.commons.math.util.FastMath.max(1833, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1833 + "'", int2 == 1833);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6995216443485196d), (-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6995216443485196d) + "'", double2 == (-0.6995216443485196d));
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 175);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 175.0f + "'", float2 == 175.0f);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.548739357257746d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025624541614806685d) + "'", double1 == (-0.025624541614806685d));
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math.util.FastMath.log(1.566170105494617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44863321586778093d + "'", double1 == 0.44863321586778093d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math.util.FastMath.cos(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47924214780867125d) + "'", double1 == (-0.47924214780867125d));
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(42672.42111385361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 744.7742482342916d + "'", double1 == 744.7742482342916d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.589527355068891d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9249444936921902d) + "'", double1 == (-0.9249444936921902d));
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.43107595064559234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4062201040757268d + "'", double1 == 0.4062201040757268d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.201488995569804d + "'", double1 == 2.201488995569804d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.03374953896461893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.033755946293507505d + "'", double1 == 0.033755946293507505d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        double double1 = org.apache.commons.math.util.FastMath.log(4.04191482247339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.396718545645432d + "'", double1 == 1.396718545645432d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.2917098371502295d), 11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.29170983715022947d) + "'", double2 == (-0.29170983715022947d));
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math.util.FastMath.cos(48.83850327565627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14332188690651262d + "'", double1 == 0.14332188690651262d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 72.0f, 0.9918956474731391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 72.0d + "'", double2 == 72.0d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        long long1 = org.apache.commons.math.util.FastMath.round(2.718281828459047d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7624008500552837d + "'", double1 == 0.7624008500552837d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9995086225327711d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        long long1 = org.apache.commons.math.util.FastMath.round(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707803769361628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038802218743867d + "'", double1 == 1.0038802218743867d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6305721433002951d + "'", double1 == 0.6305721433002951d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8431082790768845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014715015420714852d + "'", double1 == 0.014715015420714852d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.718281828459047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.99998657637409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.565614887623712d + "'", double1 == 1.565614887623712d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.3756877578035446E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.12841819466121d + "'", double1 == 43.12841819466121d);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.16035232751746503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.18751160185024d + "'", double1 == 9.18751160185024d);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        double double1 = org.apache.commons.math.util.FastMath.exp(49.46170004073965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.026518920269548E21d + "'", double1 == 3.026518920269548E21d);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6585081942517719d, 1.1785603199102086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6111719451321949d + "'", double2 == 0.6111719451321949d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        double double2 = org.apache.commons.math.util.FastMath.max(2955791.9999996633d, 0.39550023939513446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2955791.9999996633d + "'", double2 == 2955791.9999996633d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.06728499818968087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math.util.FastMath.acos(23.620277154609447d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8150650454920118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6723749183155961d + "'", double1 == 0.6723749183155961d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math.util.FastMath.log(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5545968900472338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6249959095647029d) + "'", double1 == (-0.6249959095647029d));
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.084931348079087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7563972637416305d + "'", double1 == 1.7563972637416305d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.450905222423708d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 72L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.39585386311332965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3861829820264634d + "'", double1 == 0.3861829820264634d);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 175, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.570796314980662d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.167906788198742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.167906788198742d + "'", double1 == 1.167906788198742d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.07463853704904692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07463853704904692d + "'", double1 == 0.07463853704904692d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8037349983759179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.118483893036185d + "'", double1 == 3.118483893036185d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.948148009134034E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9107344921579834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.000000837352016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615945076219022d + "'", double1 == 0.7615945076219022d);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math.util.FastMath.log10(16.62301213247846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2207097218540308d + "'", double1 == 1.2207097218540308d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.954342383797684d, 2.71824533950557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.337643448872604d + "'", double2 == 0.337643448872604d);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01959867915914997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7077731966650576d) + "'", double1 == (-1.7077731966650576d));
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        double double1 = org.apache.commons.math.util.FastMath.ceil(36.013886210738235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.0d + "'", double1 == 37.0d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double1 = org.apache.commons.math.util.FastMath.abs(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005587116544590791d + "'", double1 == 0.005587116544590791d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6521987679191874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.285378842178129d + "'", double1 == 1.285378842178129d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7556616167207904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1290196524840186d + "'", double1 == 1.1290196524840186d);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        double double1 = org.apache.commons.math.util.FastMath.acos((-50.498986710526204d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1833L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.999303822951033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422628605868842d + "'", double1 == 1.5422628605868842d);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.426490964964291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 14L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14054753050866103d) + "'", double1 == (-0.14054753050866103d));
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.16174140574189208d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.026299389467141204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5670176959525735d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.5574077246549016d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.143775716219968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4099913590976203d + "'", double1 == 1.4099913590976203d);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.17203629754325797d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8419486119476914d + "'", double1 == 0.8419486119476914d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.043734674009951d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9038701794048025d + "'", double1 == 3.9038701794048025d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5860134523134185E15d, 49.46170004073965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4577979139729036d, 52.150832453226435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4577979139729038d + "'", double2 == 1.4577979139729038d);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4451787324341032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025223127160773268d + "'", double1 == 0.025223127160773268d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.5671826220878478d, 0.7035872612422763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5671826220878473d + "'", double2 == 2.5671826220878473d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double1 = org.apache.commons.math.util.FastMath.ceil(40.17107384637538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.0d + "'", double1 == 41.0d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0717009176697242E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0717008880309724E-4d + "'", double1 == 2.0717008880309724E-4d);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0003963416279558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017460209986313837d + "'", double1 == 0.017460209986313837d);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5430365305682094d + "'", double1 == 0.5430365305682094d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707963267948966d, (-1.5574077246549016d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3519145518732776d + "'", double2 == 2.3519145518732776d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5686029556540668d, 2.5671826220878473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5686029556540668d + "'", double2 == 0.5686029556540668d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.208718528794109E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        double double2 = org.apache.commons.math.util.FastMath.max(0.004930039400314648d, (-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004930039400314648d + "'", double2 == 0.004930039400314648d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2361973931514942d + "'", double1 == 1.2361973931514942d);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5895194292017539d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011799528855315896d + "'", double1 == 0.011799528855315896d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.056630991823551025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.056600765506712045d + "'", double1 == 0.056600765506712045d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.7571779662589213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.4376760684376033d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6319211356265796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6748257944193083d + "'", double1 == 0.6748257944193083d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.162277660168379d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.910203733964713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.969124421199099d + "'", double1 == 0.969124421199099d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6582356512126448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8698822455734988d + "'", double1 == 0.8698822455734988d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9472912478964628d, 1.4856741544225798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9472912478964628d + "'", double2 == 0.9472912478964628d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        long long1 = org.apache.commons.math.util.FastMath.round(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }
}

