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
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000000000002307d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double1 = org.apache.commons.math.util.FastMath.atan(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.489266706472057d + "'", double1 == 1.489266706472057d);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3280L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3280 + "'", int1 == 3280);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.024913294410754107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.348190149863598E-4d + "'", double1 == 4.348190149863598E-4d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, 48.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9382419275631133d + "'", double1 == 0.9382419275631133d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.734862149100379d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.550927957274187d + "'", double1 == 0.550927957274187d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.42949179560133843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40489650736847077d) + "'", double1 == (-0.40489650736847077d));
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double2 = org.apache.commons.math.util.FastMath.min(2.7755575615628914E-17d, 2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7755575615628914E-17d + "'", double2 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6244127849728577d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.6977688890979814E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.432060235774456d) + "'", double1 == (-3.432060235774456d));
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.40205067186377547d), 1.5092033284084692d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0601505205018036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.785721461272498d + "'", double1 == 0.785721461272498d);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1735.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.281462522101616d + "'", double1 == 30.281462522101616d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        long long2 = org.apache.commons.math.util.FastMath.max(25L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25L + "'", long2 == 25L);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0205867680149634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7748224634453518d + "'", double1 == 2.7748224634453518d);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.9857113690718d + "'", double1 == 34.9857113690718d);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.587213915156929d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8373983731296123d) + "'", double1 == (-0.8373983731296123d));
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.28354302476765203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.327826008490388d + "'", double1 == 1.327826008490388d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.596172423257358E84d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3049096362829775d + "'", double1 == 0.3049096362829775d);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.3605285430676521d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7434748434770647d) + "'", double1 == (-0.7434748434770647d));
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0115210545205378d, 1.5293379817723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0176732163688718d + "'", double2 == 1.0176732163688718d);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.075591090954697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3271562356670095d + "'", double1 == 2.3271562356670095d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2778843899054422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9067906569835544d + "'", double1 == 0.9067906569835544d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.020483828884450862d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02048382888445086d + "'", double2 == 0.02048382888445086d);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 51L, 6559.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5972229600067989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20336554453043146d + "'", double1 == 0.20336554453043146d);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        int int1 = org.apache.commons.math.util.FastMath.round(51.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6649730557631149d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8393096933013352d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7630705606673658d) + "'", double1 == (-0.7630705606673658d));
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        long long1 = org.apache.commons.math.util.FastMath.abs(56L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56L + "'", long1 == 56L);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.14728591946206993d, 0.01917440164012891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1472859194620699d + "'", double2 == 0.1472859194620699d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.1226684192464662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8084950813485873d) + "'", double1 == (-0.8084950813485873d));
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5230427998625113d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4403028592460303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9747047669009431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9747047669009431d + "'", double1 == 0.9747047669009431d);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.716003343634799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.31974922061148d + "'", double1 == 98.31974922061148d);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.01745329251529477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2593935199224023d + "'", double1 == 0.2593935199224023d);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9596936803142382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 194L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 194L + "'", long2 == 194L);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4596132072859689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42976891224036634d + "'", double1 == 0.42976891224036634d);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.7152266900892013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.20336554453043146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20336554453043146d + "'", double1 == 0.20336554453043146d);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.602651435823948d, 1.54784011275668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8027941135615804d + "'", double2 == 0.8027941135615804d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.024918450020804755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29208348937451567d + "'", double1 == 0.29208348937451567d);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6826353005177082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 3280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3280 + "'", int2 == 3280);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.036480464389695044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03648046438969505d + "'", double1 == 0.03648046438969505d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.013642088109793105d), 1.9867717342662448d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.092409887937381d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8524543594406487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3453962389097758d + "'", double1 == 1.3453962389097758d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6562860065218095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5758864569160731d + "'", double1 == 0.5758864569160731d);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794884d + "'", double1 == 1.570796326794884d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double2 = org.apache.commons.math.util.FastMath.min(1.773775678340353d, 0.029000719225137573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.029000719225137573d + "'", double2 == 0.029000719225137573d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.394489509276126E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.3944895093E10d + "'", double1 == 8.3944895093E10d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04299281412108692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009243333966407d + "'", double1 == 1.0009243333966407d);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862269254527579d + "'", double1 == 0.8862269254527579d);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0263499943255474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011295484250035709d + "'", double1 == 0.011295484250035709d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3205004784536856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2780108150826522d + "'", double1 == 0.2780108150826522d);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        long long1 = org.apache.commons.math.util.FastMath.round(0.46517735014659645d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8830864942993886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.log(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.30685281944005d + "'", double1 == 96.30685281944005d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.0928900516588147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0928900516588147d + "'", double2 == 1.0928900516588147d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.616250773934756d + "'", double1 == 5.616250773934756d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.346431770829404d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9976952979536658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.04747860345348137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3235020639669561d) + "'", double1 == (-1.3235020639669561d));
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double2 = org.apache.commons.math.util.FastMath.min(85.05331264764003d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.tan(24.75055620175193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40194854403020486d) + "'", double1 == (-0.40194854403020486d));
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9176220725460068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016015526454902083d + "'", double1 == 0.016015526454902083d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.6977688890979814E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.697768720559912E-4d + "'", double1 == 3.697768720559912E-4d);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.18160580090340211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18060919901507108d + "'", double1 == 0.18060919901507108d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7294801232296593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2780808451765193d + "'", double1 == 1.2780808451765193d);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.970856367774133d, 2.8005374133426096E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5733302243794455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-7.685862315671209d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.736735232068027d) + "'", double1 == (-2.736735232068027d));
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6929693744345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6423001758318426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        double double2 = org.apache.commons.math.util.FastMath.max(2.034315407113705d, 1.1504125183324254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.034315407113705d + "'", double2 == 2.034315407113705d);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9322410534856177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.675239636479919d) + "'", double1 == (-1.675239636479919d));
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9596936803142382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9796395665316087d + "'", double1 == 0.9796395665316087d);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0983327715633302d, (-56.72239180482502d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-56.72239180482502d) + "'", double2 == (-56.72239180482502d));
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (byte) -1, (double) 51.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6559, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.535680137218971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9304618997631937d + "'", double1 == 0.9304618997631937d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4274266235030735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1679596500040814d + "'", double1 == 3.1679596500040814d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5972433421706609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.566459647198336d + "'", double1 == 0.566459647198336d);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.010503080254773528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010558431217663988d + "'", double1 == 0.010558431217663988d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.5251431659552352d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6864135387770072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.037409656768053565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03741838796061746d + "'", double1 == 0.03741838796061746d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        double double1 = org.apache.commons.math.util.FastMath.tan((-5.377465624848392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.275068378811894d + "'", double1 == 1.275068378811894d);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4213280739250442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        float float2 = org.apache.commons.math.util.FastMath.min(6559.0f, 13.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.92801823594317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3353436548526647d + "'", double1 == 1.3353436548526647d);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2845600963063681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27712027882251117d + "'", double1 == 0.27712027882251117d);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        int int2 = org.apache.commons.math.util.FastMath.min(21, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.000000000000014d + "'", double1 == 32.000000000000014d);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.5300284545496456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        long long2 = org.apache.commons.math.util.FastMath.max(9L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9991698414004467d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410006739839668d + "'", double1 == 0.5410006739839668d);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.012321329878749128d), 1.1737190189178428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010497297139311006d) + "'", double2 == (-0.010497297139311006d));
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7638757934705693d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.605554840023866E30d, (-1.5701287081656916d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7435256496752734E-48d + "'", double2 == 3.7435256496752734E-48d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(57.816495852442316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3312.6411985805735d + "'", double1 == 3312.6411985805735d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7213175660100344d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5743037220874823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.012957015132661d, 1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.020427955807159d + "'", double2 == 1.020427955807159d);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3678794411714424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0684342442825563d + "'", double1 == 1.0684342442825563d);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9298471527633106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9760465301190099d + "'", double1 == 0.9760465301190099d);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.000000000000485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695612768d + "'", double1 == 2.2924316695612768d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4567608960260546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42846204504183943d + "'", double1 == 0.42846204504183943d);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.435403483148737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4504864255903538d + "'", double1 == 0.4504864255903538d);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.795075132980568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 21L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.1494732094266326d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7294801232296593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3154231585054351d) + "'", double1 == (-0.3154231585054351d));
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8720836498654725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9869050076848014d + "'", double1 == 0.9869050076848014d);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double1 = org.apache.commons.math.util.FastMath.expm1(18.021826694558577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.710886299999992E7d + "'", double1 == 6.710886299999992E7d);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.06214609673410902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24929118864113312d + "'", double1 == 0.24929118864113312d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.840797912233077d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9438374559417473d) + "'", double1 == (-0.9438374559417473d));
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 51, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2240401467946807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.840841906020732d) + "'", double1 == (-0.840841906020732d));
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1174415923921306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0570910993817566d + "'", double1 == 1.0570910993817566d);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.969161728757356E-8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.6011050627869963d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8919275091860766d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3896165340101005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3896165340101005d + "'", double1 == 1.3896165340101005d);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.047344526031532254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0484831766082408d + "'", double1 == 1.0484831766082408d);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double1 = org.apache.commons.math.util.FastMath.tan(299669.7281315037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5618678471292241d) + "'", double1 == (-0.5618678471292241d));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9155040003582885E22d, (-0.0027017875255622562d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8705585908440373d + "'", double2 == 0.8705585908440373d);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8183885371125537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8183885371125537d + "'", double1 == 0.8183885371125537d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.9318256327243257d, (-0.6015665163590591d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9318256327243253d + "'", double2 == 3.9318256327243253d);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.512599360064637d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23858466273326467d + "'", double2 == 0.23858466273326467d);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.232360905325761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2707642517312325d + "'", double1 == 1.2707642517312325d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5574075654456325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        long long2 = org.apache.commons.math.util.FastMath.min(2739L, (long) 2739);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2739L + "'", long2 == 2739L);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double1 = org.apache.commons.math.util.FastMath.acos(89.40933232296601d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0012882081413053d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43501325177952693d) + "'", double1 == (-0.43501325177952693d));
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.995045299569872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        double double2 = org.apache.commons.math.util.FastMath.max(9.357486930108681d, 1.5534301753820028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.357486930108681d + "'", double2 == 9.357486930108681d);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        float float2 = org.apache.commons.math.util.FastMath.max(13.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5735827215807552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02746419954407741d + "'", double1 == 0.02746419954407741d);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.509203328408469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1998574867931386d + "'", double1 == 1.1998574867931386d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.11918867249339503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49212828590833685d + "'", double1 == 0.49212828590833685d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        double double1 = org.apache.commons.math.util.FastMath.acos(4024.6944398415308d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4425944484799542d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.027835478861093d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0263497319331099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01791318209919395d + "'", double1 == 0.01791318209919395d);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.167375502789719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2135476146553668d + "'", double1 == 3.2135476146553668d);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.706142388099178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6082521254535456d + "'", double1 == 0.6082521254535456d);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1679173671934143E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        int int2 = org.apache.commons.math.util.FastMath.min(6559, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0030228084133541687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003022817620228166d + "'", double1 == 0.003022817620228166d);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.010308913146243286d, 1.7062823395533953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010308913146243288d + "'", double2 == 0.010308913146243288d);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9999984298108128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853973783022383d + "'", double1 == 0.7853973783022383d);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5780691499402505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9544358982583311d + "'", double1 == 0.9544358982583311d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.3958432288613232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5707963215265406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.509178466533995d + "'", double1 == 2.509178466533995d);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5230427998625113d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8988151898170457d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1735.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1735.0000000000002d + "'", double1 == 1735.0000000000002d);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        long long2 = org.apache.commons.math.util.FastMath.min(2739L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.474827305953062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.958781910705103d + "'", double1 == 1.958781910705103d);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double1 = org.apache.commons.math.util.FastMath.abs(103.99038372622381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.99038372622381d + "'", double1 == 103.99038372622381d);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        int int1 = org.apache.commons.math.util.FastMath.abs(21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0023050533232358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0011518632671248d + "'", double1 == 1.0011518632671248d);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        long long1 = org.apache.commons.math.util.FastMath.round(0.27712027882251117d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.15912713462618d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5742437113278376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9455557866374292d + "'", double1 == 0.9455557866374292d);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4925138349840654d, 1.5635488491325358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7621583831123857d + "'", double2 == 0.7621583831123857d);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math.util.FastMath.tan(48.20977135024594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8979877852813627d + "'", double1 == 1.8979877852813627d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.1118901625713087d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9534853411343631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016641458572295962d + "'", double1 == 0.016641458572295962d);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7966806685070602d, 0.009528896040185642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5654927651409778d + "'", double2 == 1.5654927651409778d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 2739L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2739L + "'", long2 == 2739L);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.19754023952113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.282932090538714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1579384524855079d) + "'", double1 == (-1.1579384524855079d));
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.04537685793879663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.045361287268853405d + "'", double1 == 0.045361287268853405d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        double double1 = org.apache.commons.math.util.FastMath.acos(32.009338481576d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3254103039381046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3199248214855003d + "'", double1 == 0.3199248214855003d);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5294442277710718d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1287416326655246d + "'", double1 == 2.1287416326655246d);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.expm1(38.862916798421296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.550058492006592E16d + "'", double1 == 7.550058492006592E16d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7869557758875051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23958322542507748d) + "'", double1 == (-0.23958322542507748d));
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8039745794464932d, 1.0114159693713736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8039745794464932d + "'", double2 == 1.8039745794464932d);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 78L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 78.0f + "'", float2 == 78.0f);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.45224619022500656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4380971564252552d + "'", double1 == 0.4380971564252552d);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4343536696908125d, (-2.5045996724459267d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9698781241568852d + "'", double2 == 2.9698781241568852d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6015665163590591d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45204741327883524d) + "'", double1 == (-0.45204741327883524d));
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.653029967135041E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2739, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7615525631804252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6419905424291071d + "'", double1 == 0.6419905424291071d);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.306852817378902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4637592732921716d + "'", double1 == 1.4637592732921716d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.94421359643267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442135964326701d + "'", double1 == 0.9442135964326701d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8570531296713235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3627373663590954d + "'", double1 == 1.3627373663590954d);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-3.432060235774456d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.17645900500726E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.17645900500726E-4d + "'", double1 == 6.17645900500726E-4d);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.2847130244570347d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2808820402978842d) + "'", double1 == (-0.2808820402978842d));
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.09711515743188391d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 3280);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6559L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8171027592644233d, 1.008398253529292d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8171027592644233d + "'", double2 == 0.8171027592644233d);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, 78962960182681L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02724472556210625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02688019424603562d + "'", double1 == 0.02688019424603562d);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.04742516418921198d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double1 = org.apache.commons.math.util.FastMath.cosh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7872L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double1 = org.apache.commons.math.util.FastMath.log(30.281462522101616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4105357273401493d + "'", double1 == 3.4105357273401493d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.0342796520587982d, 1.7062823395533953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.034279652058798d + "'", double2 == 2.034279652058798d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8478168810902531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01479719602901417d + "'", double1 == 0.01479719602901417d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.002755167601444163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999962045281449d + "'", double1 == 0.9999962045281449d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0001181575986342d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(70.09526929955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2233932393493423d + "'", double1 == 1.2233932393493423d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.5735331849572494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46097180818407013d + "'", double1 == 0.46097180818407013d);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0911874016151137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.020486694162895648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.38818646476211366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9255970235962943d + "'", double1 == 0.9255970235962943d);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08962753618571082d) + "'", double1 == (-0.08962753618571082d));
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2923710782526353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29237107825263536d + "'", double1 == 0.29237107825263536d);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.37712359523644484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.45808451053483d + "'", double1 == 1.45808451053483d);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4031597732005529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38322734809692005d + "'", double1 == 0.38322734809692005d);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.6908443102518884d), 1.1174415923921306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6908443102518882d) + "'", double2 == (-1.6908443102518882d));
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.106250657255404d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2053551699703147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 194L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6567734310571898d, 0.8476800315355498d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8476800315355498d + "'", double2 == 0.8476800315355498d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.665374127698126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04651955432580409d + "'", double1 == 0.04651955432580409d);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 21);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0635006452872446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06341543083613489d + "'", double1 == 0.06341543083613489d);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 21, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        long long1 = org.apache.commons.math.util.FastMath.round(2.104510911076623d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2780808451765193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9574638454894463d + "'", double1 == 0.9574638454894463d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2371630361712516d + "'", double1 == 1.2371630361712516d);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.005455428395243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 3280L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.759676672786255E-11d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9683140799247235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.31838918959721d + "'", double1 == 1.31838918959721d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 2147483647L, 1.5095237688959358E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483647E9d + "'", double2 == 2.147483647E9d);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8769923652551843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9938135945063965d + "'", double1 == 0.9938135945063965d);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 9L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(70.09526929955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.372291759103685d + "'", double1 == 8.372291759103685d);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.008879097553696258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5504171915615343d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0973040326685208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9517255091335404d + "'", double1 == 1.9517255091335404d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.570283714031326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.401998708484765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02446949357176731d + "'", double1 == 0.02446949357176731d);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.501929622595483d, 1.4925138349840654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1679117788481266d + "'", double2 == 1.1679117788481266d);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.577493508324686d) + "'", double1 == (-57.577493508324686d));
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-34.62065524210653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.426621558901204E14d) + "'", double1 == (-5.426621558901204E14d));
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, 7872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7872L + "'", long2 == 7872L);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2855095071632904E140d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.12333144183930954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0076149673166543d + "'", double1 == 1.0076149673166543d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math.util.FastMath.tan(2454.0356784138958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48529673491737035d + "'", double1 == 0.48529673491737035d);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double1 = org.apache.commons.math.util.FastMath.signum(41.9757493748275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02718080430674016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02718749997638615d + "'", double1 == 0.02718749997638615d);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.1336397384090254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6680694712365226d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0009243333966407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003080162484632d + "'", double1 == 1.0003080162484632d);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.22194785209959902d), 1.0001799406640834d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001799406640834d + "'", double2 == 1.0001799406640834d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.1124045972580494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double1 = org.apache.commons.math.util.FastMath.ceil(81.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.0d + "'", double1 == 81.0d);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0348955683853929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.710444499831022d + "'", double1 == 0.710444499831022d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9382419275631133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7344134650461465d + "'", double1 == 0.7344134650461465d);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.010308547980779962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        double double1 = org.apache.commons.math.util.FastMath.ulp(60.29567386299461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.104510911076623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.09726846354343018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4598935852510695d) + "'", double1 == (-0.4598935852510695d));
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5743037220874823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5743037220874823d + "'", double1 == 0.5743037220874823d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.exp(32.29225137547852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0576612193048961E14d + "'", double1 == 1.0576612193048961E14d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.7131306085479543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7131306085479543d + "'", double1 == 2.7131306085479543d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        float float2 = org.apache.commons.math.util.FastMath.max(7.8962957E13f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.8962957E13f + "'", float2 == 7.8962957E13f);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.016015526454902083d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004896078820622033d + "'", double2 == 0.004896078820622033d);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.6375861597263857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47590567099932785d) + "'", double1 == (-0.47590567099932785d));
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0621061016647649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.06407523889308d + "'", double1 == 1.06407523889308d);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(57.28518781699162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.5686978944195955d + "'", double1 == 7.5686978944195955d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0038696050023177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003869605002318d + "'", double1 == 1.003869605002318d);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.02048526137339397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020485261373393973d + "'", double1 == 0.020485261373393973d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7621583831123857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.340690375060061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07575933885442562d + "'", double1 == 0.07575933885442562d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.02746419954407741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027460747047886525d + "'", double1 == 0.027460747047886525d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double1 = org.apache.commons.math.util.FastMath.acos(43.6528601698497d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8101858850092454d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double1 = org.apache.commons.math.util.FastMath.tan(32.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837835d + "'", double1 == 0.6610060414837835d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9867717342662448d, (-0.38818646476211366d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7660603640139828d + "'", double2 == 0.7660603640139828d);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0143000217145544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017702874981968954d + "'", double1 == 0.017702874981968954d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.273736754432062E-13d + "'", double1 == 2.273736754432062E-13d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9830277404112437d + "'", double1 == 0.9830277404112437d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5221964908180761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.9196550004178d + "'", double1 == 29.9196550004178d);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0261600244039246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1123264956016625d + "'", double1 == 1.1123264956016625d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double1 = org.apache.commons.math.util.FastMath.log(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341003d + "'", double1 == 1.6094379124341003d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8414709846639918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.028471562981618036d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.6503846142007115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6503846142007115d + "'", double1 == 2.6503846142007115d);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0824766957749856d + "'", double1 == 1.0824766957749856d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7878677702215401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10354666510167267d) + "'", double1 == (-0.10354666510167267d));
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.03011360650845773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 56L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.541576288123802E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.541576288123802E-20d + "'", double1 == 2.541576288123802E-20d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.093079357587117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4597529371303731d + "'", double1 == 0.4597529371303731d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.07496085456049556d, 102.84020584868686d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07496085456049557d + "'", double2 == 0.07496085456049557d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math.util.FastMath.log1p(22.758958277746018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1679596500040805d + "'", double1 == 3.1679596500040805d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.675896985065022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6632456843634444d, (-0.4626307887385793d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2092021141404896d + "'", double2 == 1.2092021141404896d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7615525631804252d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615525631804252d + "'", double2 == 0.7615525631804252d);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math.util.FastMath.ceil(49.52813017280076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.306852821501208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103315d + "'", double1 == 11013.232920103315d);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6082521254535456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6248693519093275d, 1.0824766957749856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6248693519093276d + "'", double2 == 0.6248693519093276d);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.6977688890979814E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6977688048289427E-4d + "'", double1 == 3.6977688048289427E-4d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        long long1 = org.apache.commons.math.util.FastMath.round(0.2774626501190066d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999609453287691d + "'", double1 == 0.9999609453287691d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.35024917996074695d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        long long2 = org.apache.commons.math.util.FastMath.max(2005L, 78962960182681L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78962960182681L + "'", long2 == 78962960182681L);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 138.0f, 0.6778717693998079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.0d + "'", double2 == 138.0d);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        double double1 = org.apache.commons.math.util.FastMath.rint(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.0d + "'", double1 == 43.0d);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.14827828493928633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1472010533919828d) + "'", double1 == (-0.1472010533919828d));
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.217373703740946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1362.9049641099027d + "'", double1 == 1362.9049641099027d);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 3280.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        long long1 = org.apache.commons.math.util.FastMath.round(0.047496451376835516d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        long long2 = org.apache.commons.math.util.FastMath.max(6559L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.592095927580033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.207401907702447d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.0117525015297403E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.608210095044356d) + "'", double1 == (-0.608210095044356d));
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.18650080065297936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18436814306226207d + "'", double1 == 0.18436814306226207d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8174606429094702d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.166013034516528d, 0.3648534103948403d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0576378019354957d + "'", double2 == 1.0576378019354957d);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.06222628822952982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06226651621291121d + "'", double1 == 0.06226651621291121d);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.23310874770420992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.356147411031147d) + "'", double1 == (-13.356147411031147d));
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 2739L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        long long1 = org.apache.commons.math.util.FastMath.round(4.605170185988091d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2924316695612768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.898979485567336d + "'", double1 == 8.898979485567336d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        int int2 = org.apache.commons.math.util.FastMath.max(13, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04651955432580409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046536349273453084d + "'", double1 == 0.046536349273453084d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7053686466330485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2592596815453478d + "'", double1 == 1.2592596815453478d);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7609889586512912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8723468109939367d + "'", double1 == 0.8723468109939367d);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1494681981443936d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.3348404966530283d), 1.756742458327018d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2039980656902276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.87769338515402d + "'", double1 == 0.87769338515402d);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5689313209506868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2525698866533104d + "'", double1 == 1.2525698866533104d);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 1, 0.9123687177766381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.7131306085479543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9336711682668523d) + "'", double1 == (-0.9336711682668523d));
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7305226257794997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7305226257794997d + "'", double1 == 0.7305226257794997d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.7281588344338537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6517139081674688d + "'", double1 == 1.6517139081674688d);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 56L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.3331934173358142d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0355549961366507E-13d + "'", double1 == 2.0355549961366507E-13d);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.302321175433678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0798655112312594d + "'", double1 == 1.0798655112312594d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5542664846177344d + "'", double1 == 0.5542664846177344d);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8704401477824153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0560957258999235d + "'", double1 == 1.0560957258999235d);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09260582453650028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09234200528229825d + "'", double1 == 0.09234200528229825d);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5618678471292241d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5618678471292241d + "'", double1 == 0.5618678471292241d);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5293379817723003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.25643891956011705d), 0.928519628251389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2694632850851157d) + "'", double2 == (-0.2694632850851157d));
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9066335230777041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01582374008666193d + "'", double1 == 0.01582374008666193d);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double2 = org.apache.commons.math.util.FastMath.max(198.57204013738647d, 0.8690225542171961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.57204013738647d + "'", double2 == 198.57204013738647d);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5412502135621129d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.17633822983826752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8476800315355498d, 7.550058492006592E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7003561790124813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759030814824197d + "'", double1 == 0.759030814824197d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1485728867362902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13852020368127715d + "'", double1 == 0.13852020368127715d);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.619165243970861d + "'", double1 == 1.619165243970861d);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6682419027059644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.511770319024455d + "'", double1 == 0.511770319024455d);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double1 = org.apache.commons.math.util.FastMath.atanh(347.00701654883756d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4637592732921716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.276771072704841d + "'", double1 == 2.276771072704841d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double1 = org.apache.commons.math.util.FastMath.tanh(299669.7281315037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.119741647423155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9095422111520758d + "'", double1 == 0.9095422111520758d);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.33986957931062006d, 0.1747425010840047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.095896262089524d + "'", double2 == 1.095896262089524d);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double2 = org.apache.commons.math.util.FastMath.max(50.50495049504956d, (-1.5438317534371178d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.50495049504956d + "'", double2 == 50.50495049504956d);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7660603640139828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6537007564950391d + "'", double1 == 0.6537007564950391d);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4575013994861012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9694563980085383d + "'", double1 == 0.9694563980085383d);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5230427998625113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5472196136890736d + "'", double1 == 0.5472196136890736d);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1752012000048544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.238794523760724d + "'", double1 == 2.238794523760724d);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4403028592460303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4403028592460303d + "'", double1 == 1.4403028592460303d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01952918020653624d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6928719750090248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6387495533038128d + "'", double1 == 0.6387495533038128d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6519412826634519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42780077837552744d) + "'", double1 == (-0.42780077837552744d));
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.060134546374655E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0601345941353147E-4d + "'", double1 == 3.0601345941353147E-4d);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3243509267782625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.014325667963125883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.500300735040163E-4d + "'", double1 == 2.500300735040163E-4d);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.6908443102518884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0367091609341395d) + "'", double1 == (-1.0367091609341395d));
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double1 = org.apache.commons.math.util.FastMath.atanh(23.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) 0, 1.4120398112486696d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9035086050663308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4366968555003559d + "'", double1 == 1.4366968555003559d);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0552873721751121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8700419317040157d + "'", double1 == 0.8700419317040157d);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(73.0000375341532d, 0.396569932281676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 73.00003753415318d + "'", double2 == 73.00003753415318d);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2063750287430021d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7189893924092379d, 2.034315407113705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.718989392409238d + "'", double2 == 0.718989392409238d);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1482831556480773d + "'", double1 == 2.1482831556480773d);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9091342957581129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1412008176973512d + "'", double1 == 1.1412008176973512d);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.24395830743395697d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7523557927644398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.121993108970349d + "'", double1 == 2.121993108970349d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8166645746236463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014253485711581559d + "'", double1 == 0.014253485711581559d);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7269342546799581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7269342546799582d + "'", double1 == 0.7269342546799582d);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1936227590745503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(20.049875621120897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.477708746794604d + "'", double1 == 4.477708746794604d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.020486694162895648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020488127253061015d + "'", double1 == 0.020488127253061015d);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.862923886687095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2750760152580213d + "'", double1 == 0.2750760152580213d);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.038011628146107666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03801162814610767d + "'", double1 == 0.03801162814610767d);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        float float2 = org.apache.commons.math.util.FastMath.max(194.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 194.0f + "'", float2 == 194.0f);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4009957838586076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4933109724764848d + "'", double1 == 0.4933109724764848d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5497922893701128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.222069397417434d + "'", double1 == 1.222069397417434d);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        int int2 = org.apache.commons.math.util.FastMath.min(51, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double1 = org.apache.commons.math.util.FastMath.log(9.079985961989729E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.306852818394596d) + "'", double1 == (-9.306852818394596d));
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5718388723129227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5718388723129229d + "'", double1 == 0.5718388723129229d);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        float float2 = org.apache.commons.math.util.FastMath.max(3280.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5108256237659907d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.106941223476904d + "'", double1 == 2.106941223476904d);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.487997868885413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.049907512864634d + "'", double1 == 12.049907512864634d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9952731515503573d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9952731515503572d) + "'", double1 == (-0.9952731515503572d));
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.548665972822148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9649664986122871d + "'", double1 == 0.9649664986122871d);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5417572838488922d + "'", double1 == 1.5417572838488922d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7500546590807314d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9316985613076827d) + "'", double1 == (-0.9316985613076827d));
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2092021141404896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7003561790124813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6109649707082522d + "'", double1 == 0.6109649707082522d);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        long long1 = org.apache.commons.math.util.FastMath.abs(25L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 25L + "'", long1 == 25L);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9565307084111944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.602651435823948d + "'", double1 == 1.602651435823948d);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.489266706472057d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2005.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114878.03792373005d + "'", double1 == 114878.03792373005d);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.587213915156929d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5578300447656788d) + "'", double1 == (-0.5578300447656788d));
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7601526319909638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013267166245943098d + "'", double1 == 0.013267166245943098d);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0621061016647649d, 1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5507969934215644d + "'", double2 == 1.5507969934215644d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(52.425609362311924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7426667798599293d + "'", double1 == 3.7426667798599293d);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.166463332052284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0488021689809415d) + "'", double1 == (-2.0488021689809415d));
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5574077246549505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2679097686564256d + "'", double1 == 2.2679097686564256d);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7503561819538955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1177541881181556d + "'", double1 == 1.1177541881181556d);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2844895915767354d + "'", double1 == 0.2844895915767354d);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6872483617622163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6872483617622164d + "'", double1 == 0.6872483617622164d);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4953487812212205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.460892156963543d + "'", double1 == 4.460892156963543d);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7182817021203185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2182828899573317d + "'", double1 == 1.2182828899573317d);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.4105357273401493d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9867486543660318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4376935385749028d + "'", double1 == 1.4376935385749028d);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.08596965880719257d), 0.6659567306796605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08596965880719257d) + "'", double2 == (-0.08596965880719257d));
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        int int1 = org.apache.commons.math.util.FastMath.round(13.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        int int1 = org.apache.commons.math.util.FastMath.round(2739.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2739 + "'", int1 == 2739);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3779956797524746d + "'", double1 == 0.3779956797524746d);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.059903262040248d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        double double1 = org.apache.commons.math.util.FastMath.abs(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 573.0d + "'", double1 == 573.0d);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.166013034516528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06670340530032116d + "'", double1 == 0.06670340530032116d);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8020200379631092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9306695450583735d + "'", double1 == 0.9306695450583735d);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0114159693713736d, 2.0980829010588262E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0114159693713736d + "'", double2 == 1.0114159693713736d);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        double double1 = org.apache.commons.math.util.FastMath.sin(33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7782672228833125d + "'", double1 == 0.7782672228833125d);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.267831587699267d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        double double1 = org.apache.commons.math.util.FastMath.expm1(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.798430876571451E248d + "'", double1 == 6.798430876571451E248d);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.860919794144364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5574077105338615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232050397113d + "'", double1 == 0.19240232050397113d);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9760465301190099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5153705032632332d + "'", double1 == 1.5153705032632332d);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.14946329799279776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1612108512608644d + "'", double1 == 0.1612108512608644d);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9165965529836673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5007646696938879d + "'", double1 == 1.5007646696938879d);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3216115088757081E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.36787944117144245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4342944819032517d) + "'", double1 == (-0.4342944819032517d));
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5582527903380249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5091572386252318d + "'", double1 == 0.5091572386252318d);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        long long1 = org.apache.commons.math.util.FastMath.round(4.553484793848369E29d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }
}

