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
        double double1 = org.apache.commons.math.util.FastMath.floor(2.5098796108399273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.006589358495248128d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7206435247136849d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.38272983027743895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3927493029595414d + "'", double1 == 0.3927493029595414d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.994072887542587E-4d, 2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.370887824493474E-9d + "'", double2 == 7.370887824493474E-9d);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.6701224592653805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.441737609099619d + "'", double1 == 13.441737609099619d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0596009736702285d, 0.05323601959381076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0596009736702285d + "'", double2 == 1.0596009736702285d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1215.6874598349693d + "'", double1 == 1215.6874598349693d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 254L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 254 + "'", int1 == 254);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6228237053820482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6228237053820482d + "'", double1 == 0.6228237053820482d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4909189283808535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9519986478399194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9519986478399196d + "'", double1 == 1.9519986478399196d);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4593010294267361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008016315221295908d + "'", double1 == 0.008016315221295908d);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7968780678647464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7968780678647465d + "'", double1 == 0.7968780678647465d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 793006726156715L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9300672E14f + "'", float2 == 7.9300672E14f);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.797559069755228d, (-4.795297172557674d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.958532119357816d + "'", double2 == 2.958532119357816d);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9797867046510361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6638879864107798d + "'", double1 == 1.6638879864107798d);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46872714429059403d) + "'", double1 == (-0.46872714429059403d));
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8646647167633873d) + "'", double1 == (-0.8646647167633873d));
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4836385494853932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.091073911623369d + "'", double1 == 2.091073911623369d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.010510567768484375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010565997816100813d + "'", double1 == 0.010565997816100813d);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        long long1 = org.apache.commons.math.util.FastMath.round(6.389056098930649d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.610917912644225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6109179126442252d + "'", double1 == 3.6109179126442252d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9983481197742622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double2 = org.apache.commons.math.util.FastMath.min(4.680482178387856d, 1.8826238623526614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8826238623526614d + "'", double2 == 1.8826238623526614d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.0006324214414275d), (-0.027050493904618365d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        long long2 = org.apache.commons.math.util.FastMath.max(15472906L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15472906L + "'", long2 == 15472906L);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.017023122756475405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998551101447892d + "'", double1 == 0.9998551101447892d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5707539050029569d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0038725871553387d) + "'", double1 == (-1.0038725871553387d));
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.431181872803843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8883775065231543d + "'", double1 == 0.8883775065231543d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.24371064248078259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27597506408789846d + "'", double1 == 0.27597506408789846d);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.806318343896785E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.80631835E8d + "'", double1 == 4.80631835E8d);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9604880600327923d, (-0.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9604880600327923d + "'", double2 == 0.9604880600327923d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.36431415595777866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4395263789175174d + "'", double1 == 1.4395263789175174d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.005402465832298d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double1 = org.apache.commons.math.util.FastMath.atan((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5578545843443006d) + "'", double1 == (-1.5578545843443006d));
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0192106325823187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01778858130989566d) + "'", double1 == (-0.01778858130989566d));
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.004278030156706235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5674991151269535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5674991151269537d + "'", double1 == 1.5674991151269537d);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.5098796108399273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3589942843649623d + "'", double1 == 1.3589942843649623d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.977857455908435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8102544490184327d) + "'", double1 == (-3.8102544490184327d));
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.876179281316129E-122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.876179281316129E-122d + "'", double1 == 4.876179281316129E-122d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.038410356896381344d), 295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.038410356896381344d) + "'", double2 == (-0.038410356896381344d));
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.acosh(6.802168607459072E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.14916504967242d + "'", double1 == 37.14916504967242d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.21355356455282556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6704931751025157d) + "'", double1 == (-0.6704931751025157d));
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.366643026452032d, (-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3457322689061346d + "'", double2 == 0.3457322689061346d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double1 = org.apache.commons.math.util.FastMath.tanh(22.248715438260383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.675234572368367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029238359031067227d + "'", double1 == 0.029238359031067227d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        long long2 = org.apache.commons.math.util.FastMath.min(2155615773557597L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7923652280736779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.20861412943733d + "'", double1 == 2.20861412943733d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.06577273855851125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06582017154423006d + "'", double1 == 0.06582017154423006d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5555871714402396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1586833980749858d + "'", double1 == 1.1586833980749858d);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.2239800905693152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.244049900699666d + "'", double1 == 9.244049900699666d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5134455542318993d + "'", double1 == 0.5134455542318993d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.254356666405517d + "'", double1 == 18.254356666405517d);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718281828459047d + "'", double1 == 1.718281828459047d);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.829120600623248d, (-1.150849338916875d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2406770803135128d + "'", double2 == 1.2406770803135128d);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9408618465702292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8389324050427284d) + "'", double1 == (-0.8389324050427284d));
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5021549377007348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9834561220913894d + "'", double1 == 0.9834561220913894d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0587911840678754E-22d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0587911840678753E-22d + "'", double2 == 1.0587911840678753E-22d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.567739246697935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1952738305822843d + "'", double1 == 0.1952738305822843d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double1 = org.apache.commons.math.util.FastMath.acosh(84.73931296875567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.132692001088028d + "'", double1 == 5.132692001088028d);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.306110394417042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5727121991303104d + "'", double1 == 1.5727121991303104d);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0009999068626307d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0009999068626305d + "'", double2 == 1.0009999068626305d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4713396625418989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double1 = org.apache.commons.math.util.FastMath.tanh(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5796994106826333d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.01745417873758517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745417873758517d + "'", double1 == 0.01745417873758517d);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1134536045423387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.79619222390459d + "'", double1 == 63.79619222390459d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5953649790673516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1684765959860581d + "'", double1 == 1.1684765959860581d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2584006825852871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 416128, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6930491557595923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5999372604379551d + "'", double1 == 0.5999372604379551d);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3283909087132568d + "'", double1 == 0.3283909087132568d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9885255319736725d), 1.7306786685136297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5189571803979739d) + "'", double2 == (-0.5189571803979739d));
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6506685335476448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8665359830203146d + "'", double1 == 0.8665359830203146d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.008837862706915426d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7991915029216112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7991915029216113d + "'", double1 == 0.7991915029216113d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4395263789175174d, (-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2918341927023468d + "'", double2 == 0.2918341927023468d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.933910420297154d) + "'", double1 == (-1.933910420297154d));
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8332128969929774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.565349446923133d) + "'", double1 == (-0.565349446923133d));
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6220031846622691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5525212217123197d + "'", double1 == 0.5525212217123197d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.acosh(13.463738035001686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.291765177633798d + "'", double1 == 3.291765177633798d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.31681683799824617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3068127984286353d + "'", double1 == 0.3068127984286353d);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9155040003582885E22d, 2.2542036597000856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2542036597000856d + "'", double2 == 2.2542036597000856d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4137774971580666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.316173196322488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.117729395772099d + "'", double1 == 5.117729395772099d);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.3805150062465854d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8587920411303291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06611198904854713d) + "'", double1 == (-0.06611198904854713d));
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5093186428238677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6746814409630337d) + "'", double1 == (-0.6746814409630337d));
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        long long1 = org.apache.commons.math.util.FastMath.round(0.871945894290764d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2906699594446309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2355668154408765d) + "'", double1 == (-1.2355668154408765d));
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.9228850149325126d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.15753066060280643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15884681562938494d + "'", double1 == 0.15884681562938494d);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.356147801749622d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.44761628698542416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double1 = org.apache.commons.math.util.FastMath.log10(55.367870644634905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.743257821596323d + "'", double1 == 1.743257821596323d);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.380515006246586d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.380515006246586d) + "'", double2 == (-3.380515006246586d));
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9043712444123206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2715337265371605d) + "'", double1 == (-1.2715337265371605d));
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707377645772738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171430336373434d + "'", double1 == 0.9171430336373434d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8452362215107015d + "'", double1 == 0.8452362215107015d);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0255162991293005d, 2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0576355780357318d + "'", double2 == 1.0576355780357318d);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016454379488565464d + "'", double1 == 0.016454379488565464d);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.896296018268E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5940561914458121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double2 = org.apache.commons.math.util.FastMath.max((-7.016709298534876E-15d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 15472906);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15472906L + "'", long1 == 15472906L);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.8996799722452d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.038180775847953E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009506934719376142d + "'", double1 == 0.009506934719376142d);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double2 = org.apache.commons.math.util.FastMath.min(0.985023376545766d, 2.7574580733948113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.985023376545766d + "'", double2 == 0.985023376545766d);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.559213651529111d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5592136515291111d + "'", double2 == 0.5592136515291111d);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1586013452313419L, (float) 416128);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3927493029595414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41504663633865063d + "'", double1 == 0.41504663633865063d);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3264961224259655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8443633256026882d + "'", double1 == 0.8443633256026882d);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double1 = org.apache.commons.math.util.FastMath.expm1(36.974403151355936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1422975893993612E16d + "'", double1 == 1.1422975893993612E16d);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.806318343896785E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.683759298479497d + "'", double1 == 20.683759298479497d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7649423546396938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1488704986706695d + "'", double1 == 1.1488704986706695d);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        int int2 = org.apache.commons.math.util.FastMath.max(15472906, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15472906 + "'", int2 == 15472906);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2881954997339584d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9659700754028168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.446664069790744d + "'", double1 == 1.446664069790744d);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double1 = org.apache.commons.math.util.FastMath.rint(13.596394652490343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        float float2 = org.apache.commons.math.util.FastMath.min((-36.0f), (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7586713254405011d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double1 = org.apache.commons.math.util.FastMath.tan(263.856815596594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03698415377215357d) + "'", double1 == (-0.03698415377215357d));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.369434511630201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8785632544979229d + "'", double1 == 0.8785632544979229d);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 254);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8868316935392928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4274266235030733d + "'", double1 == 2.4274266235030733d);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9631551729748808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        long long2 = org.apache.commons.math.util.FastMath.max(1586013452313419L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42648547885197696d + "'", double1 == 0.42648547885197696d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.006677190176525592d, 0.007302804107846621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7406773432674305d + "'", double2 == 0.7406773432674305d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8119506301746697d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8306189581832664d, 1.0392473890246534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8745811248203028d + "'", double2 == 1.8745811248203028d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.71898596144298d + "'", double1 == 86.71898596144298d);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        double double1 = org.apache.commons.math.util.FastMath.log10(28.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4471580313422192d + "'", double1 == 1.4471580313422192d);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0175660469936023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.35016104929231356d, 0.6532555690014658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.503837426778427d + "'", double2 == 0.503837426778427d);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.6109179126442252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.513513513513526d + "'", double1 == 18.513513513513526d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5578948219222873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8232229011500263d + "'", double1 == 0.8232229011500263d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        double double1 = org.apache.commons.math.util.FastMath.acosh(46.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.521670408657297d + "'", double1 == 4.521670408657297d);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.44634137093517556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4198072452609807d + "'", double1 == 0.4198072452609807d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.509011168189731d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5128928810496862d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 15472906, (float) 149);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0037614532268226615d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double1 = org.apache.commons.math.util.FastMath.log(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.374583897527433d) + "'", double1 == (-10.374583897527433d));
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8126520452412627d + "'", double1 == 1.8126520452412627d);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.8996799722452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19922.993187029744d + "'", double1 == 19922.993187029744d);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-77.26503394947866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 15472906L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15472906L + "'", long2 == 15472906L);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.03173339314553415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31659605873331587d + "'", double1 == 0.31659605873331587d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        long long2 = org.apache.commons.math.util.FastMath.min(15472906L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.03291910793037927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994582150954171d + "'", double1 == 0.9994582150954171d);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9063773800902429d) + "'", double1 == (-0.9063773800902429d));
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 45);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5707956501572984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533138673761248d + "'", double1 == 1.2533138673761248d);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8781280698332341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9136668838819056d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double1 = org.apache.commons.math.util.FastMath.acos(21.278971706197215d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        double double1 = org.apache.commons.math.util.FastMath.abs((-14.04469065108256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.04469065108256d + "'", double1 == 14.04469065108256d);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        float float2 = org.apache.commons.math.util.FastMath.min(6.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002207655573629d + "'", double1 == 1.002207655573629d);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8623188722876837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1670181026229585d + "'", double1 == 1.1670181026229585d);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double2 = org.apache.commons.math.util.FastMath.pow(5506.500045400884d, 13.596393407514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.284789166526067E50d + "'", double2 == 7.284789166526067E50d);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09966865249116202d + "'", double1 == 0.09966865249116202d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8668295926043834d, 1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8668295926043835d + "'", double2 == 0.8668295926043835d);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5057929593184665d, (-0.01390942313339779d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5982896283025279d + "'", double2 == 1.5982896283025279d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        int int1 = org.apache.commons.math.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.499714999892002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9827060193701941d) + "'", double1 == (-0.9827060193701941d));
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0239341746073216d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double1 = org.apache.commons.math.util.FastMath.acos(262.6992857325621d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0841005523291758d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.121587129297938E-5d + "'", double1 == 3.121587129297938E-5d);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double2 = org.apache.commons.math.util.FastMath.max(1.556529890912072d, (-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.556529890912072d + "'", double2 == 1.556529890912072d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 254L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 254.0f + "'", float2 == 254.0f);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2853121312169806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022432928605561703d + "'", double1 == 0.022432928605561703d);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1666.4487951693106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.111597441888199d + "'", double1 == 8.111597441888199d);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7040920051570956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1944400205783785d + "'", double1 == 1.1944400205783785d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math.util.FastMath.acos(803227.6141649d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double2 = org.apache.commons.math.util.FastMath.min((-34.657359027997266d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-34.657359027997266d) + "'", double2 == (-34.657359027997266d));
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8174375413706592E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2631414958580244E8d + "'", double1 == 4.2631414958580244E8d);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.410321299048242d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007161457659452098d) + "'", double1 == (-0.007161457659452098d));
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.68022760406715d + "'", double1 == 4.68022760406715d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11776318452497536d) + "'", double1 == (-0.11776318452497536d));
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.132692001088028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3783772743322416d + "'", double1 == 1.3783772743322416d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.008016315221295908d, 0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00801631522129591d + "'", double2 == 0.00801631522129591d);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.280109889280518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4342900156325915d + "'", double1 == 1.4342900156325915d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7619036782447477d + "'", double1 == 0.7619036782447477d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.930067261567155E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9136668838819056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.447249947769043d + "'", double1 == 1.447249947769043d);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double2 = org.apache.commons.math.util.FastMath.atan2(74.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707956501572984d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.721667748088015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7216677480880156d + "'", double1 == 2.7216677480880156d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) 15472906);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9972523950133705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8794294017448049d + "'", double1 == 0.8794294017448049d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6127838567197355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6127838567197355d + "'", double1 == 1.6127838567197355d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.814737873122817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1409622947442513d + "'", double1 == 1.1409622947442513d);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.26035149959480436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5102465086551836d + "'", double1 == 0.5102465086551836d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        long long1 = org.apache.commons.math.util.FastMath.round(3.1338468571120415d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) '4', (-0.2083157409463713d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5748023773057473d + "'", double2 == 1.5748023773057473d);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 84677176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.45967525618227173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008022846710329061d) + "'", double1 == (-0.008022846710329061d));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8934964811466461d, (-4.302546093059478E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5710235543636748d + "'", double2 == 1.5710235543636748d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5216334679510201d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4808042224301313d) + "'", double1 == (-0.4808042224301313d));
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6105647004975029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9140228957377067d + "'", double1 == 0.9140228957377067d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.194215895814761E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.3805150062465854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9323667197459253d) + "'", double1 == (-1.9323667197459253d));
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3296867882556773d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9339826894350282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5446234682124351d + "'", double1 == 1.5446234682124351d);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5303019207992773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10988798327592862d + "'", double1 == 0.10988798327592862d);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6949948789359283d, 0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6949948789359283d + "'", double2 == 0.6949948789359283d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 45L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.348658628056262d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1077737640562015d) + "'", double1 == (-1.1077737640562015d));
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4344205208065718d, 1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29543207297922036d + "'", double2 == 0.29543207297922036d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.0415522815958145d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6470935536208939d) + "'", double1 == (-0.6470935536208939d));
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double1 = org.apache.commons.math.util.FastMath.cosh(49.81171952239862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1474592281398254E21d + "'", double1 == 2.1474592281398254E21d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5374184941250892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9116855593144492d + "'", double1 == 0.9116855593144492d);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2543319811638522d + "'", double1 == 1.2543319811638522d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308233d + "'", double1 == 57.29577951308233d);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5596872477209207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2488743922912826d + "'", double1 == 1.2488743922912826d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11211.863579677763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874923432364d + "'", double1 == 10.017874923432364d);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) 45);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        double double2 = org.apache.commons.math.util.FastMath.min(9.984096369658629E-4d, (-0.9942575694137897d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9942575694137897d) + "'", double2 == (-0.9942575694137897d));
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.14699383281419737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13714446133608932d + "'", double1 == 0.13714446133608932d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double2 = org.apache.commons.math.util.FastMath.atan2(21.487562597358306d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.30685281589777d + "'", double1 == 35.30685281589777d);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.01745417873758517d), 0.004296826558596309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017454178737585167d) + "'", double2 == (-0.017454178737585167d));
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.127171016908329E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.94860155578762E62d + "'", double1 == 8.94860155578762E62d);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7099378310397426d + "'", double1 == 0.7099378310397426d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9659700754028167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.028250403399582d) + "'", double1 == (-2.028250403399582d));
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.984184871799573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01717726646122084d + "'", double1 == 0.01717726646122084d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.817884356931778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.964440738224975d) + "'", double1 == (-3.964440738224975d));
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483647E9d + "'", double1 == 2.147483647E9d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.771145792105561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.932165660516785d) + "'", double1 == (-0.932165660516785d));
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 45L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double1 = org.apache.commons.math.util.FastMath.log10(966980.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.985417491684385d + "'", double1 == 5.985417491684385d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6044791236121515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6044791236121516d + "'", double1 == 0.6044791236121516d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9942575694137896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4635775323982976d) + "'", double1 == (-1.4635775323982976d));
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9918472337211128d + "'", double1 == 1.9918472337211128d);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7383640997376417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6360124459143899d + "'", double1 == 0.6360124459143899d);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.951386703658792E-16d, 1.4779900867225375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.951386703658793E-16d + "'", double2 == 7.951386703658793E-16d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        float float1 = org.apache.commons.math.util.FastMath.abs(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math.util.FastMath.acos(11.267396586565031d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.797839565109256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double2 = org.apache.commons.math.util.FastMath.max(3.81765898774876d, 236.0628816681138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 236.0628816681138d + "'", double2 == 236.0628816681138d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4868981666828483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5319865653801386d) + "'", double1 == (-0.5319865653801386d));
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.574710978503384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07984376890201558d + "'", double1 == 0.07984376890201558d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 45L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        long long1 = org.apache.commons.math.util.FastMath.round(20.054663569220438d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 20L + "'", long1 == 20L);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4628824377340256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4465290746610793d + "'", double1 == 0.4465290746610793d);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3796103144511154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.973352967537076d + "'", double1 == 2.973352967537076d);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 84677176, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.327055958571125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9918472337211128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4824196727343814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0587911840678754E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0587911840678754E-22d + "'", double1 == 1.0587911840678754E-22d);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.786036626268317d), 0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6997597439205169d + "'", double2 == 0.6997597439205169d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7005202664493964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7592368268565954d + "'", double1 == 0.7592368268565954d);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.017455065036229584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9659700754028168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9828377665733123d + "'", double1 == 0.9828377665733123d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2542036597000856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9544163159728498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2676980971301346d + "'", double1 == 1.2676980971301346d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999997919113546d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.557407011843562d) + "'", double1 == (-1.557407011843562d));
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3686370946198846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1877020959207132d, (-0.5817278226951806d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0262448066799315d + "'", double2 == 2.0262448066799315d);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.034920772952347814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03493497471284167d + "'", double1 == 0.03493497471284167d);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.05323601959381076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0532611689585372d + "'", double1 == 0.0532611689585372d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7851541419138716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9029449846286381d + "'", double1 == 0.9029449846286381d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5623823663631259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1623490349698802d + "'", double1 == 1.1623490349698802d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.05042677562564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7450404035952758d + "'", double1 == 1.7450404035952758d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double1 = org.apache.commons.math.util.FastMath.floor((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-37.0d) + "'", double1 == (-37.0d));
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        long long1 = org.apache.commons.math.util.FastMath.round((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-35L) + "'", long1 == (-35L));
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8449739071498816E-5d + "'", double1 == 3.8449739071498816E-5d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5842599568378692d, 1.281321279551499E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5842599568378692d + "'", double2 == 1.5842599568378692d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.932165660516785d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double1 = org.apache.commons.math.util.FastMath.ceil(35.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 416128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-7.016709298534876E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.016709298534901E-15d) + "'", double1 == (-7.016709298534901E-15d));
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.38937226128359037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38937226128359037d + "'", double1 == 0.38937226128359037d);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9260416922830169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7287430613686455d + "'", double1 == 0.7287430613686455d);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.227708505501907E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2277085056E10d + "'", double1 == 7.2277085056E10d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1225257824954484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7504888361866489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.003975161446914431d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15841084985711618d) + "'", double1 == (-0.15841084985711618d));
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.36341525809683245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36341525809683245d + "'", double1 == 0.36341525809683245d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double1 = org.apache.commons.math.util.FastMath.exp(21.487562597358306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483648000002E9d + "'", double1 == 2.147483648000002E9d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3217992116817487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3217992116817487d + "'", double1 == 0.3217992116817487d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        float float2 = org.apache.commons.math.util.FastMath.max(416128.0f, (float) 149);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.2395798055406804d, 30.772666314109507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10488824477105782d + "'", double2 == 0.10488824477105782d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8996977230841076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7831389754994359d) + "'", double1 == (-0.7831389754994359d));
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        double double1 = org.apache.commons.math.util.FastMath.exp(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2955791.0474487552d + "'", double1 == 2955791.0474487552d);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.769101973997255d + "'", double1 == 3.769101973997255d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7076312586751927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7076312586751926d) + "'", double1 == (-0.7076312586751926d));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.718737117947564E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.718737117947565E-7d + "'", double1 == 7.718737117947565E-7d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3783772743322416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.557407011843562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02718188015031648d) + "'", double1 == (-0.02718188015031648d));
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.168501181378485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9201647971321822d + "'", double1 == 0.9201647971321822d);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        long long1 = org.apache.commons.math.util.FastMath.abs(1586013452313419L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1586013452313419L + "'", long1 == 1586013452313419L);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        double double1 = org.apache.commons.math.util.FastMath.acos(183.14723824272207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double1 = org.apache.commons.math.util.FastMath.log(262.1116315604069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.568770487675106d + "'", double1 == 5.568770487675106d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math.util.FastMath.tan(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.964041297605273d + "'", double1 == 6.964041297605273d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.014660473777194752d, 4.356147801749623d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0267617116484067E-8d + "'", double2 == 1.0267617116484067E-8d);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8172096612475641d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014262999267877505d) + "'", double1 == (-0.014262999267877505d));
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.756499886438907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3234876425965192d + "'", double1 == 1.3234876425965192d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        double double1 = org.apache.commons.math.util.FastMath.sin(28.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2709057883078656d + "'", double1 == 0.2709057883078656d);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.951386703658795E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5558089939608874E-14d + "'", double1 == 4.5558089939608874E-14d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9950915100179343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7829378852328782d + "'", double1 == 0.7829378852328782d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double1 = org.apache.commons.math.util.FastMath.log(1.570796326794884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4515827052894468d + "'", double1 == 0.4515827052894468d);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.1623266059131168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        float float2 = org.apache.commons.math.util.FastMath.min(36.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0028875952298260572d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0028875952298260572d + "'", double2 == 0.0028875952298260572d);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5021549377007348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5021549377007348d + "'", double1 == 1.5021549377007348d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6283185307179586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6704839982471176d + "'", double1 == 0.6704839982471176d);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.25128902086761173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5998264858633516d) + "'", double1 == (-0.5998264858633516d));
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2245999714347802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double1 = org.apache.commons.math.util.FastMath.asinh(18.947503835155906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6355150169170694d + "'", double1 == 3.6355150169170694d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.043629138314787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math.util.FastMath.cos((-5.0071219815385035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29048437469546273d + "'", double1 == 0.29048437469546273d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(803227.6141649d, (-0.9848929415691016d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 803227.6141648999d + "'", double2 == 803227.6141648999d);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664802d + "'", double1 == 3.4965075614664802d);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7180674033998771d + "'", double1 == 0.7180674033998771d);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5010608089539732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.166594879293176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.010869896178468208d), 0.7850896760339817d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3235780930645504d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3235780930645504d + "'", double2 == 1.3235780930645504d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8846616861015088E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8846616861015088E31d + "'", double1 == 1.8846616861015088E31d);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double1 = org.apache.commons.math.util.FastMath.exp(327.1084999525159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1519046011713222E142d + "'", double1 == 1.1519046011713222E142d);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-3.8787751869641602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5297515540876878d, 0.6022111734203904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5297515540876876d + "'", double2 == 1.5297515540876876d);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9070592073636674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7876954293959413d + "'", double1 == 0.7876954293959413d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        long long1 = org.apache.commons.math.util.FastMath.round(5.568770487675106d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.3118395312526729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9517707940180289d + "'", double1 == 0.9517707940180289d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.11003618844778293d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 2155615773557597L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9912373278715739d, (-2.9364233859784283d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9912373278715739d + "'", double2 == 0.9912373278715739d);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 45.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1316153248585041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.811571379621474d + "'", double1 == 0.811571379621474d);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double1 = org.apache.commons.math.util.FastMath.exp(17.490740823090167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.945774155304224E7d + "'", double1 == 3.945774155304224E7d);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-36.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9942575694137897d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        long long2 = org.apache.commons.math.util.FastMath.max(84677176L, 2155615773557597L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6418794309070784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.2504594738129939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.823951153543866d + "'", double1 == 1.823951153543866d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9599030060384935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8191359364722263d + "'", double1 == 0.8191359364722263d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        double double2 = org.apache.commons.math.util.FastMath.pow((-5.895315751447931d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.27213935230245856d), 1.2778919526316612d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.313261687518223d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2753612114631538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.777035258448096d + "'", double1 == 15.777035258448096d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        long long1 = org.apache.commons.math.util.FastMath.round(0.006968429058501292d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8263518223330697d) + "'", double1 == (-0.8263518223330697d));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2083802338853868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0992634961124592d + "'", double1 == 1.0992634961124592d);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.010586943092505522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9752294213566821d) + "'", double1 == (-1.9752294213566821d));
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5319865653801386d), 1.7138297703395624d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6532555690014658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5786604420546939d + "'", double1 == 0.5786604420546939d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.558155592227304E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.455303878600325E11d + "'", double1 == 7.455303878600325E11d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999999999971125d, 0.31627392599618903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999990867d + "'", double2 == 0.9999999999990867d);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.581666008924904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8630509523652563d + "'", double1 == 3.8630509523652563d);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5528548740537169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5528548740537169d + "'", double1 == 0.5528548740537169d);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5528548740537169d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.03840091833939954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.038410362468802896d) + "'", double1 == (-0.038410362468802896d));
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.4808042224301313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.548052717315795d) + "'", double1 == (-27.548052717315795d));
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double1 = org.apache.commons.math.util.FastMath.asinh(13.441737609099619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2928925900666535d + "'", double1 == 3.2928925900666535d);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5143952585235492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4750973835811797d + "'", double1 == 0.4750973835811797d);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.982478439757623E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5845774691047715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5259844657400761d + "'", double1 == 0.5259844657400761d);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4077166057103022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4077166057103022d + "'", double1 == 0.4077166057103022d);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5524423814822215d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.8996799722452d, 4.810477380965347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1184739975963325d + "'", double2 == 1.1184739975963325d);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        int int2 = org.apache.commons.math.util.FastMath.min(416128, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1586833980749858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02022284028460463d + "'", double1 == 0.02022284028460463d);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7938732240748443d), 1.3211090992020036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3211090992020036d + "'", double2 == 1.3211090992020036d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5574060173404456d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5134455542318993d, (-9.76771663808282E-6d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000065112913281d + "'", double2 == 1.0000065112913281d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.964041297605273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 528.9496371823001d + "'", double1 == 528.9496371823001d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.038180788153241E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.037772369202355E-5d + "'", double1 == 9.037772369202355E-5d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6441260327612386d + "'", double1 == 2.6441260327612386d);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.748066029033894E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.43933565899792d + "'", double1 == 17.43933565899792d);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6034653621241517d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1118733076078493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6844950911493235d + "'", double1 == 1.6844950911493235d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.038410362468802896d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        double double2 = org.apache.commons.math.util.FastMath.atan2(23.0d, 1.4678297255314154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5070640727304592d + "'", double2 == 1.5070640727304592d);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7017203400855395d), 1.4462570642904802E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4462570642904802E12d + "'", double2 == 1.4462570642904802E12d);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9617542719885632d + "'", double1 == 0.9617542719885632d);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1375934887012633d) + "'", double1 == (-1.1375934887012633d));
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        double double1 = org.apache.commons.math.util.FastMath.expm1(21.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3188157334832146E9d + "'", double1 == 1.3188157334832146E9d);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math.util.FastMath.abs(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        long long1 = org.apache.commons.math.util.FastMath.round(49.80857186097813d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50L + "'", long1 == 50L);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2918341927023468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2877093470337708d + "'", double1 == 0.2877093470337708d);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double1 = org.apache.commons.math.util.FastMath.sinh(38.98173152733166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2512916689489144E16d + "'", double1 == 4.2512916689489144E16d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (-36.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.007161457659452098d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2499101539960593E-4d) + "'", double1 == (-1.2499101539960593E-4d));
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6500740785981898d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double2 = org.apache.commons.math.util.FastMath.pow(231.58466047909457d, (-0.9228850149325126d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006571201286809242d + "'", double2 == 0.006571201286809242d);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double1 = org.apache.commons.math.util.FastMath.cosh(18.132482812877438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7480660290338874E7d + "'", double1 == 3.7480660290338874E7d);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2863696021375706d + "'", double1 == 0.2863696021375706d);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9351539719278551d, (-0.2635551479263493d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.935153971927855d + "'", double2 == 0.935153971927855d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9291998984986712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03189084631204042d) + "'", double1 == (-0.03189084631204042d));
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.127171016908329E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8726936208978296d, 2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8726936208978298d + "'", double2 == 0.8726936208978298d);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.24619002710729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49617539953860107d + "'", double1 == 0.49617539953860107d);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5605553882446344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.025470578295336027d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1877020959207132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2795364819153474d + "'", double1 == 3.2795364819153474d);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.5091729483939074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.509172948393908d + "'", double1 == 2.509172948393908d);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4636456564559828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43414353309358d + "'", double1 == 0.43414353309358d);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.412565217356853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.3025459603122967E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.276858964458209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.00000000000003d + "'", double1 == 36.00000000000003d);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 84677176L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7179618940241767d + "'", double1 == 0.7179618940241767d);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5844399164946341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.584439916494634d) + "'", double1 == (-0.584439916494634d));
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1898547757074525d + "'", double1 == 2.1898547757074525d);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4824196727343814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4654324806454215d + "'", double1 == 0.4654324806454215d);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        double double1 = org.apache.commons.math.util.FastMath.log((-4.632512904931238d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.162447351509626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1624473515096259d) + "'", double1 == (-1.1624473515096259d));
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.03839147839332005d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6091972423514112d + "'", double1 == 1.6091972423514112d);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9408416071039944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3716567276347662d + "'", double1 == 1.3716567276347662d);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578815d + "'", double1 == 2005.3522829578815d);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04697231777987949d) + "'", double1 == (-0.04697231777987949d));
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (-36.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.750470905699148d) + "'", double1 == (-7.750470905699148d));
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5102465086551836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4718111746082003d + "'", double1 == 0.4718111746082003d);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6283575265889236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.09549862066012d + "'", double1 == 4.09549862066012d);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779513082344d + "'", double1 == 57.295779513082344d);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2536458786393914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0498685513154722d + "'", double1 == 1.0498685513154722d);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7029641237193509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012269038482299441d + "'", double1 == 0.012269038482299441d);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 32, 1.0038841287955307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }
}

