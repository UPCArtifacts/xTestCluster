import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        double double2 = org.apache.commons.math.util.FastMath.pow(81.77019445276477d, 0.7057759543134d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.380180397773714d + "'", double2 == 22.380180397773714d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8492499565656626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6906774267659388d + "'", double1 == 0.6906774267659388d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.8452881141118595E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7813318292761458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9279843325100741d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.3043013731747495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.057670938440069215d + "'", double1 == 0.057670938440069215d);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6266394763546572d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.951853132062316E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.3967546673214364d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.921688867296064d, 28.42845879209619d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09844358520763341d + "'", double2 == 0.09844358520763341d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3298168749545565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.780351047220972d + "'", double1 == 2.780351047220972d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.185039863261519d), 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8414709848078965d + "'", double2 == 0.8414709848078965d);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.3730212381267685d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.10558035700584559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1055803570058456d + "'", double1 == 0.1055803570058456d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026926349378495064d + "'", double1 == 0.026926349378495064d);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.051269224554469806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05126922455446981d + "'", double1 == 0.05126922455446981d);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.14385932007498992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5239775354020728d + "'", double1 == 0.5239775354020728d);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5574077246549018d), 0.6949948789359283d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9824345117057643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.950212931632136d) + "'", double1 == (-0.950212931632136d));
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8884186928096095d + "'", double1 == 0.8884186928096095d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3587246453502182d + "'", double1 == 1.3587246453502182d);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9087403372292328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4811950949513535d + "'", double1 == 1.4811950949513535d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math.util.FastMath.sinh(966980.6941481595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.2040699473456506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5168431503089737d) + "'", double1 == (-1.5168431503089737d));
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.48982900228029397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.63203712146721d + "'", double1 == 0.63203712146721d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0338353139228529d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7835271334741006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7835271334741005d) + "'", double1 == (-0.7835271334741005d));
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1069763556213847d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 6, (-1.2554125869476496d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2554125869476496d) + "'", double2 == (-1.2554125869476496d));
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        long long1 = org.apache.commons.math.util.FastMath.abs(1586013452313419L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1586013452313419L + "'", long1 == 1586013452313419L);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6424959163097872d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6077685160459958E11d + "'", double2 == 1.6077685160459958E11d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 55, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55L + "'", long2 == 55L);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16299078079570548d) + "'", double1 == (-0.16299078079570548d));
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21226824538976596d + "'", double1 == 0.21226824538976596d);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2531606858262283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8123339797352284d + "'", double1 == 0.8123339797352284d);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9213886642621285d + "'", double1 == 0.9213886642621285d);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0841005523291758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9515984431693014d, 3.81765898774876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.81765898774876d + "'", double2 == 3.81765898774876d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double1 = org.apache.commons.math.util.FastMath.exp(55.37844799163721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1234516311494852E24d + "'", double1 == 1.1234516311494852E24d);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0000219474331413d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        int int2 = org.apache.commons.math.util.FastMath.max(6, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04134068757158039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04135247220430408d + "'", double1 == 0.04135247220430408d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038848218538872d + "'", double1 == 1.0038848218538872d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        int int2 = org.apache.commons.math.util.FastMath.min(416128, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.300233222602407E-4d + "'", double1 == 9.300233222602407E-4d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.23191437957608327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4073861552074949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.407386155207495d + "'", double1 == 1.407386155207495d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.240517442917666d + "'", double1 == 12.240517442917666d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7558191731720005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6386077655581859d + "'", double1 == 0.6386077655581859d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double2 = org.apache.commons.math.util.FastMath.min(2.3686469200204923d, 0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.053286411214247056d + "'", double2 == 0.053286411214247056d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8693785117457933d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.3182714301523224d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8351015231807235d, 2.3529804386339674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.17241067260829d + "'", double2 == 4.17241067260829d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.978724239478952E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.1988545487871776E-6d) + "'", double1 == (-5.1988545487871776E-6d));
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 84677176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6261581216290331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8704108668561197d + "'", double1 == 1.8704108668561197d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1982259298436744d + "'", double1 == 1.1982259298436744d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.537538551229054d + "'", double1 == 1.537538551229054d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.043629138314787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.03162654244477d + "'", double1 == 155.03162654244477d);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double1 = org.apache.commons.math.util.FastMath.log1p(110.01219831593043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.709640090012462d + "'", double1 == 4.709640090012462d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2.1317761108019555d), 18.72514057803899d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.38095094490971865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3722911787333264d + "'", double1 == 0.3722911787333264d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.06567000136305376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06557584317901276d + "'", double1 == 0.06557584317901276d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3132616875182228d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3132616875182226d + "'", double2 == 1.3132616875182226d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.04191482247339d + "'", double1 == 4.04191482247339d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3268153559855746d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3587246453502182d, 74.2057952278721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3587246453502184d + "'", double2 == 1.3587246453502184d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.608239979297323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7383312956481652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6281359110509813d + "'", double1 == 0.6281359110509813d);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.acosh(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.43450228702824d + "'", double1 == 5.43450228702824d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6455325219591219d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.abs(17.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5128928810496862d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.38659742645238d) + "'", double1 == (-29.38659742645238d));
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2603569881435552d) + "'", double1 == (-3.2603569881435552d));
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.16371340869567735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0450588814264876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7798779215136177d + "'", double1 == 0.7798779215136177d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9413588856302918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9413588856302918d + "'", double1 == 0.9413588856302918d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        double double2 = org.apache.commons.math.util.FastMath.atan2(17.247748258387592d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4807442484038669d + "'", double2 == 1.4807442484038669d);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8626451474962336E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012303916499059983d + "'", double1 == 0.0012303916499059983d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9619978945176638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(13.260930909413656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.260930909413657d + "'", double1 == 13.260930909413657d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.761594155955765d, 0.3061339104324154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.92000795811553d + "'", double2 == 0.92000795811553d);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5524423814822215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9370506974354846d + "'", double1 == 0.9370506974354846d);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3799380148686868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.97465525033135d + "'", double1 == 2.97465525033135d);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08704561128797016d + "'", double1 == 0.08704561128797016d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8623188722876837d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double double2 = org.apache.commons.math.util.FastMath.min(34.30685281944005d, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math.util.FastMath.rint(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8388608.0d + "'", double1 == 8388608.0d);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.710594084652733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.552352059737451d + "'", double1 == 7.552352059737451d);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3132616875182226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1459763032097228d + "'", double1 == 1.1459763032097228d);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7241359194704645d + "'", double1 == 0.7241359194704645d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4822417450149294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39355563436394514d + "'", double1 == 0.39355563436394514d);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0028875952298260572d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5368290450042061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, 1.5472906E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.20675080015374017d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.9950201419849896d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4311581967195641d) + "'", double1 == (-0.4311581967195641d));
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3799380148686868d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5575575715124121d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.300233222602407E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0315061604762503d) + "'", double1 == (-3.0315061604762503d));
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.2040699473456506d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2040699473456506d) + "'", double2 == (-1.2040699473456506d));
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.3270448216204103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.020964603232372d) + "'", double1 == (-4.020964603232372d));
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0221161044594675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017839291360476007d + "'", double1 == 0.017839291360476007d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.16703684659955795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16550047552112018d) + "'", double1 == (-0.16550047552112018d));
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.694990094719959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5255806086508463d) + "'", double1 == (-0.5255806086508463d));
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.319414307254659E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000550925572d + "'", double1 == 1.0000000550925572d);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.111512116496156d, 0.2999355935358229d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.801082947740872d + "'", double2 == 1.801082947740872d);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.3043013731747495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0206400411325952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02063857593167883d + "'", double1 == 0.02063857593167883d);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.073741824E9d + "'", double1 == 1.073741824E9d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.776356839400252E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.944304526105059E-31d + "'", double1 == 3.944304526105059E-31d);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1599753909038675d, 0.6509498349092765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1599753909038675d + "'", double2 == 1.1599753909038675d);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.225973768125749E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        double double2 = org.apache.commons.math.util.FastMath.min(1.253350360695029d, 3.828641396489095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.253350360695029d + "'", double2 == 1.253350360695029d);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(20.085536923187668d, 0.021252051384784545d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.085536923187664d + "'", double2 == 20.085536923187664d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        float float2 = org.apache.commons.math.util.FastMath.min(96.0f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3859684164526524d + "'", double1 == 0.3859684164526524d);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9986081305645496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6924510035672429d + "'", double1 == 0.6924510035672429d);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8315832436782697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.296952498465264d + "'", double1 == 1.296952498465264d);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-4L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0947125472611012d) + "'", double1 == (-2.0947125472611012d));
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9921995076561011d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6292396966001443d) + "'", double1 == (-0.6292396966001443d));
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 8.4677176E7f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.38654543622728665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double1 = org.apache.commons.math.util.FastMath.asin((-3.114099791007893d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double1 = org.apache.commons.math.util.FastMath.rint(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 55L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0788418462814133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8660152332847653d + "'", double1 == 1.8660152332847653d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.2829673798684508E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        int int2 = org.apache.commons.math.util.FastMath.min(416128, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math.util.FastMath.exp((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.602680054508676E-24d + "'", double1 == 9.602680054508676E-24d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double1 = org.apache.commons.math.util.FastMath.ceil(17.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        int int2 = org.apache.commons.math.util.FastMath.max((-4), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), (float) 992L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double1 = org.apache.commons.math.util.FastMath.cos(17.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27516333805159693d) + "'", double1 == (-0.27516333805159693d));
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.977857455908435d), 1.5524423814822215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5621031630629434d) + "'", double2 == (-0.5621031630629434d));
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        long long1 = org.apache.commons.math.util.FastMath.round(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.048441193928777d, 1.3694345116302007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0669246942920232d + "'", double2 == 1.0669246942920232d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7417440442090276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-42.498803212142434d) + "'", double1 == (-42.498803212142434d));
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999938218286504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.683154013895851E-6d) + "'", double1 == (-2.683154013895851E-6d));
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double1 = org.apache.commons.math.util.FastMath.signum(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.74877907E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.74877907E11f + "'", float1 == 2.74877907E11f);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9157372585173394d, (-1.4834748111766378d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1394937033410437d + "'", double2 == 1.1394937033410437d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.8828470691743546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7203883278459435d + "'", double1 == 1.7203883278459435d);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double1 = org.apache.commons.math.util.FastMath.atan(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515679276951895d + "'", double1 == 1.5515679276951895d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.11688393127179245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11715172275379059d + "'", double1 == 0.11715172275379059d);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0467596981169403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        long long1 = org.apache.commons.math.util.FastMath.round(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.26485486485821585d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7210773218691856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852097698166123d + "'", double1 == 0.7852097698166123d);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9520464219027572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5910065301645633d + "'", double1 == 1.5910065301645633d);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.494102162974031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7029240093879501d + "'", double1 == 0.7029240093879501d);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (long) 84677176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9454830277888808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9814870620301351d + "'", double1 == 0.9814870620301351d);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999971125d + "'", double1 == 0.9999999999971125d);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7692799493082574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9435304519566817d + "'", double1 == 0.9435304519566817d);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0463214738377196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.02289856478427d + "'", double1 == 1.02289856478427d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math.util.FastMath.ceil(55.37844799163721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.0d + "'", double1 == 56.0d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9097172013945863d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1481461824783568d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0038586340573412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038586340573412d + "'", double1 == 1.0038586340573412d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 15472906, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3140833526702298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32483577129825836d + "'", double1 == 0.32483577129825836d);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0035151680352298246d, 2309777.270505642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7046910343691102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7046910343691102d + "'", double1 == 1.7046910343691102d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(22.60451646247372d, (-0.6275902047702033d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.604516462473715d + "'", double2 == 22.604516462473715d);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.9999999999999998d), 0.5604313987190848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2975876169601384d) + "'", double2 == (-1.2975876169601384d));
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6928737998977109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6059272509550887d + "'", double1 == 0.6059272509550887d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0141135859351529d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        long long2 = org.apache.commons.math.util.FastMath.min(992L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4077166057103022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1508443471762746d + "'", double1 == 1.1508443471762746d);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9722441973843963d + "'", double1 == 0.9722441973843963d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8359466061307562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1065748658499797d) + "'", double1 == (-1.1065748658499797d));
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7669782712368582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267948823d, 59.09671887400065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.09671887400065d + "'", double2 == 59.09671887400065d);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.476915139009423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07813690950809406d) + "'", double1 == (-0.07813690950809406d));
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double1 = org.apache.commons.math.util.FastMath.asinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9406842499833806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9798237396396555d + "'", double1 == 0.9798237396396555d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1425351349536241d + "'", double1 == 1.1425351349536241d);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5364951284461146d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.7130053006861585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6471203054683523d + "'", double1 == 1.6471203054683523d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(18.725140578038992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32681535598557465d + "'", double1 == 0.32681535598557465d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7833882657167645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.188876209368736d + "'", double1 == 2.188876209368736d);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9764996816772386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7515466474572382d + "'", double1 == 0.7515466474572382d);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        int int2 = org.apache.commons.math.util.FastMath.min(416128, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3013745589365472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31084298021201845d + "'", double1 == 0.31084298021201845d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5574077246549023d, (-0.12178778438053141d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.557407724654902d + "'", double2 == 1.557407724654902d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9822712330395684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1035776552602234d + "'", double1 == 1.1035776552602234d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4725617387019807d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.752053219489803E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000227951122d + "'", double1 == 1.000000227951122d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double2 = org.apache.commons.math.util.FastMath.atan2(96.10655605346268d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        long long2 = org.apache.commons.math.util.FastMath.max(28L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5191129625505976d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.766656752030037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.766656752030038d + "'", double1 == 5.766656752030038d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), (-4L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6975104867803742d + "'", double1 == 0.6975104867803742d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8686198410610924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8686198410610924d + "'", double1 == 0.8686198410610924d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double1 = org.apache.commons.math.util.FastMath.atanh(34.99999999540764d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(10.017874927409906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.165102672491037d + "'", double1 == 3.165102672491037d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.013277137307171d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16162584696387075d + "'", double1 == 0.16162584696387075d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.43305085726475895d, 0.8975305571361484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44954295052108806d + "'", double2 == 0.44954295052108806d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math.util.FastMath.tan(2309777.270505642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19048490393218875d) + "'", double1 == (-0.19048490393218875d));
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.44160428466265983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.386584147120561d + "'", double1 == 2.386584147120561d);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.560196367709658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027230563594189672d + "'", double1 == 0.027230563594189672d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.7448973633883265d, 0.9684798222642294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.369452223918956d + "'", double2 == 1.369452223918956d);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557597L, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.011282567768101364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011282089061486306d + "'", double1 == 0.011282089061486306d);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.015707579305579825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015706933396818862d + "'", double1 == 0.015706933396818862d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5354158716652867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0057962608999693d + "'", double1 == 1.0057962608999693d);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.013865150856733838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9107602588845184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8168436061909092d + "'", double1 == 0.8168436061909092d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.138692313968385d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0021606868913213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7241615341867753d + "'", double1 == 1.7241615341867753d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8615858172757184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0314323214767873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03094843962363085d + "'", double1 == 0.03094843962363085d);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double2 = org.apache.commons.math.util.FastMath.max(5.538468212281815d, 238.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 238.0d + "'", double2 == 238.0d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.017067660761448736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706683222077747d) + "'", double1 == (-0.01706683222077747d));
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.7626139187213443d, 1.5310379237791847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.184348949071694d + "'", double2 == 1.184348949071694d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.036783162923711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.898178588177084d + "'", double1 == 3.898178588177084d);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.36341525809683245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3482187323969228d + "'", double1 == 0.3482187323969228d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2027522105204773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8771844805774996d + "'", double1 == 0.8771844805774996d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.1538315676666131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15383156766661307d) + "'", double1 == (-0.15383156766661307d));
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.3992162411495254E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8436963527515928E124d + "'", double1 == 1.8436963527515928E124d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.07440361544177959d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862269254527579d + "'", double1 == 0.8862269254527579d);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) (-4L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.35150619296419316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3443122945394621d + "'", double1 == 0.3443122945394621d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-4L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.0f) + "'", float2 == (-4.0f));
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double2 = org.apache.commons.math.util.FastMath.min(3.2395798055406804d, 5506.500045400884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2395798055406804d + "'", double2 == 3.2395798055406804d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        long long2 = org.apache.commons.math.util.FastMath.min(96L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6967614701467567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5287214166476935d + "'", double1 == 0.5287214166476935d);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.523746987213264d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7063851457511368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.845265973706546d + "'", double1 == 2.845265973706546d);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        double double1 = org.apache.commons.math.util.FastMath.log(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6017101575745776d) + "'", double1 == (-2.6017101575745776d));
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8743692948528521d, 0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.874369294852852d + "'", double2 == 0.874369294852852d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.8452881141118595E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.965964575911209E-6d) + "'", double1 == (-4.965964575911209E-6d));
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.921688867296064d + "'", double1 == 0.921688867296064d);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0214010731908018d + "'", double1 == 0.0214010731908018d);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8703483020626325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1861628710359773d + "'", double1 == 1.1861628710359773d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6879830786861454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4678297255314154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9735605461531053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5623589104272122d + "'", double1 == 0.5623589104272122d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6842868307608122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.16371340869567735d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16371340869567733d) + "'", double1 == (-0.16371340869567733d));
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5692047668094316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.068244165322444d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3436113127178665d + "'", double1 == 0.3436113127178665d);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485196d) + "'", double1 == (-0.6995216443485196d));
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5707963267948966d), 0.3678794411714423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948963d) + "'", double2 == (-1.5707963267948963d));
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        float float1 = org.apache.commons.math.util.FastMath.abs((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.040168003889966E204d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.036300395193130185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2490718174402814E16d, 6.802168607459072E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2490718174402814E16d + "'", double2 == 1.2490718174402814E16d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-36));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7156372641383866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012490226509179187d + "'", double1 == 0.012490226509179187d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7580564974852393d) + "'", double1 == (-0.7580564974852393d));
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        float float2 = org.apache.commons.math.util.FastMath.min(96.0f, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.0f + "'", float2 == 96.0f);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.2816994331335767d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-16d + "'", double1 == 8.881784197001254E-16d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8554182836643192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5748946607304181d) + "'", double1 == (-0.5748946607304181d));
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double1 = org.apache.commons.math.util.FastMath.signum(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8771844805774996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8723562630490505d + "'", double1 == 0.8723562630490505d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double2 = org.apache.commons.math.util.FastMath.max(1.02289856478427d, (-0.36313042116107785d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.02289856478427d + "'", double2 == 1.02289856478427d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.sinh(36.01388621073821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1857579040987705E15d + "'", double1 == 2.1857579040987705E15d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(28.458847799916846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.334683477013125d + "'", double1 == 5.334683477013125d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.rint(57.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        double double1 = org.apache.commons.math.util.FastMath.asin(74.20994852478785d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1279175336939193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12861983110901812d + "'", double1 == 0.12861983110901812d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5700480097637672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.609582766785463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01063922634382306d + "'", double1 == 0.01063922634382306d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.5091729483939074d, (-2.134428840403784d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.27566783010164d + "'", double2 == 2.27566783010164d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1578212823495775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.282204450191367d + "'", double1 == 2.282204450191367d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.9857113690718d + "'", double1 == 34.9857113690718d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.0365889718756627d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6455325219591219d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.21569275083837d + "'", double1 == 1.21569275083837d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10728189713552241d) + "'", double1 == (-0.10728189713552241d));
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.signum((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.724275869600789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.4642859456318895d) + "'", double1 == (-6.4642859456318895d));
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.31466697030166657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9506539170750531d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6670125879009923d) + "'", double1 == (-1.6670125879009923d));
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        float float1 = org.apache.commons.math.util.FastMath.abs(992.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 992.0f + "'", float1 == 992.0f);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5992442618287415d, 1.000000227951122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000227951122d + "'", double2 == 1.000000227951122d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.9093606334381874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.978724151380226E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8369386687558497d + "'", double1 == 0.8369386687558497d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.862645149230957E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.862645149230957E-9d + "'", double1 == 1.862645149230957E-9d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5617466952995023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5092722588769432d + "'", double1 == 0.5092722588769432d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8385747266373784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.01941637183672906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01941637183672906d + "'", double1 == 0.01941637183672906d);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7607149637232955d + "'", double1 == 3.7607149637232955d);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4411926976881834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4411926976881834d + "'", double1 == 0.4411926976881834d);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 416128L, (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.499686190671499d, 2.147483648E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0953296640289476E-9d + "'", double2 == 2.0953296640289476E-9d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 15472906);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1632803573594961d + "'", double1 == 0.1632803573594961d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.1720269046268675E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0393938154819877d + "'", double1 == 2.0393938154819877d);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0004446442786143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0004446442786146d + "'", double1 == 1.0004446442786146d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37692701902305553d + "'", double1 == 0.37692701902305553d);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.557407724654902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(96.84399620220857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6902465945174239d + "'", double1 == 1.6902465945174239d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double1 = org.apache.commons.math.util.FastMath.sin(22.604516462473715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5756246881499133d) + "'", double1 == (-0.5756246881499133d));
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-53));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double1 = org.apache.commons.math.util.FastMath.acos(41.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3966070444871779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3340457554434107d + "'", double1 == 0.3340457554434107d);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2026142367355531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20543314404898916d + "'", double1 == 0.20543314404898916d);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.027414190085478973d, 0.04084445256892067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8633759783072272d + "'", double2 == 0.8633759783072272d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013029516808438469d) + "'", double1 == (-0.013029516808438469d));
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19207790936638264d + "'", double1 == 0.19207790936638264d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7835271334741006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7057825263091493d) + "'", double1 == (-0.7057825263091493d));
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0239341746073216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 58.66710670421104d + "'", double1 == 58.66710670421104d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7367922631517189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6349944312062704d) + "'", double1 == (-0.6349944312062704d));
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math.util.FastMath.log(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7646689908861497d + "'", double1 == 0.7646689908861497d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.776356839400252E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 55L, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4149733479708179d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4149733479708179d + "'", double2 == 0.4149733479708179d);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.825659180793972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.825659180793972d + "'", double1 == 9.825659180793972d);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double1 = org.apache.commons.math.util.FastMath.sinh(55.22296199276716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8083677112033115E23d + "'", double1 == 4.8083677112033115E23d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.38714087209326337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4121309759620155d) + "'", double1 == (-0.4121309759620155d));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8965647786762592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0496842573695355d + "'", double1 == 1.0496842573695355d);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.8626451474962336E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.050930946109083d, (-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0509309461090828d + "'", double2 == 3.0509309461090828d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        int int1 = org.apache.commons.math.util.FastMath.round(45.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.840451469933454E-71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.840451469933454E-71d + "'", double1 == 3.840451469933454E-71d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.079331342726163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4785608704294266d + "'", double1 == 1.4785608704294266d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        double double1 = org.apache.commons.math.util.FastMath.signum(34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.296952498465264d, 0.8345117301386048d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.242328536433336d + "'", double2 == 1.242328536433336d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.0514559851130003d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5815258540844123d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21068150841353378d + "'", double1 == 0.21068150841353378d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.7339893174783004E-5d), 2.9802322387695303E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.7339893174783E-5d) + "'", double2 == (-4.7339893174783E-5d));
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double1 = org.apache.commons.math.util.FastMath.sin(71.37228331994979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7735017357645743d + "'", double1 == 0.7735017357645743d);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        long long1 = org.apache.commons.math.util.FastMath.round(0.841319842005267d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.598159103388802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02735936220501092d) + "'", double1 == (-0.02735936220501092d));
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0953296640289476E-9d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 149, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 2147483647L, 0.9201531231110199d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483647E9d + "'", double2 == 2.147483647E9d);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }
}

