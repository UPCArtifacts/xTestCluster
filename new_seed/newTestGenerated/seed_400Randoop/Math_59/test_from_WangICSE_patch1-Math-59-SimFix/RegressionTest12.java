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
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6250159944861234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        double double2 = org.apache.commons.math.util.FastMath.min(1.20325541915325d, (-0.11030121080009957d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11030121080009957d) + "'", double2 == (-0.11030121080009957d));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        double double2 = org.apache.commons.math.util.FastMath.pow(57.29577951308232d, 2.0847193829771844d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4625.858344427256d + "'", double2 == 4625.858344427256d);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61L + "'", long2 == 61L);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4354737487211744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13490994704196763d + "'", double1 == 0.13490994704196763d);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9584036466699127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7641614281058108d + "'", double1 == 0.7641614281058108d);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.307560258420629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1962108355622934d + "'", double1 == 1.1962108355622934d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.1268741377911216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.983866769659365d + "'", double1 == 60.983866769659365d);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5851102438039824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5545347976893902d, 0.033377737685972374d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5545347976893902d + "'", double2 == 1.5545347976893902d);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.0014414133113334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3673495568308867d + "'", double1 == 0.3673495568308867d);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8125492953065081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6222839233857677d + "'", double1 == 0.6222839233857677d);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6765125521465637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7430166646475238d + "'", double1 == 0.7430166646475238d);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8414436595433751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0146859623290621d + "'", double1 == 0.0146859623290621d);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.904340862875605E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.1731525181731936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17315251817319358d) + "'", double1 == (-0.17315251817319358d));
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1613322090065665d + "'", double1 == 3.1613322090065665d);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.6109179126442243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5284269505599697d + "'", double1 == 1.5284269505599697d);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        double double2 = org.apache.commons.math.util.FastMath.min(3.0110925050025188E22d, 7.750470905699148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.750470905699148d + "'", double2 == 7.750470905699148d);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6360780298312221d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4354737487211742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15699525472887976d + "'", double1 == 0.15699525472887976d);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9991396955517629d), 6.756960248771418E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5181962706832005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4763066899814426d + "'", double1 == 0.4763066899814426d);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06566270191375284d + "'", double1 == 0.06566270191375284d);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 28, 2155615773557598L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557598L + "'", long2 == 2155615773557598L);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 36, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7632360637504044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.145207026879623d + "'", double1 == 2.145207026879623d);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5669767943827976d + "'", double1 == 0.5669767943827976d);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6138893069268365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8498912464906306d) + "'", double1 == (-0.8498912464906306d));
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080872397649995d + "'", double1 == 0.6080872397649995d);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9196364215772618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6521358043462664d + "'", double1 == 0.6521358043462664d);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8300978655089688d, 0.09950339648414802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9816419068403193d + "'", double2 == 0.9816419068403193d);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.021361775150108318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021360150830069147d + "'", double1 == 0.021360150830069147d);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.997695297953666d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7842444834412545d) + "'", double1 == (-0.7842444834412545d));
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.02136177515010832d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021361775150108318d + "'", double2 == 0.021361775150108318d);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3058323384932887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5145165945069615d) + "'", double1 == (-0.5145165945069615d));
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-3L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        double double1 = org.apache.commons.math.util.FastMath.acosh(14.899277193215994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.393331789936231d + "'", double1 == 3.393331789936231d);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2539748267768518d + "'", double1 == 1.2539748267768518d);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.653142644460657d, 1.5106730734832936d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.653142644460656d + "'", double2 == 4.653142644460656d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.567436903106386d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5134744417260221d) + "'", double1 == (-0.5134744417260221d));
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7105940846527334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.130900600544555d + "'", double1 == 1.130900600544555d);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.010657397841739896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.141380652391393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141380652391393d + "'", double1 == 3.141380652391393d);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8195908673690073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.95909762771054d + "'", double1 == 46.95909762771054d);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.918513704344091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7006357143034063d + "'", double1 == 1.7006357143034063d);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7652264863963173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9315543776556867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7313177749345641d + "'", double1 == 0.7313177749345641d);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8805489308698096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6223472360131463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6223472360131463d + "'", double1 == 0.6223472360131463d);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-3L), 22.478724097855846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.13267552465419724d) + "'", double2 == (-0.13267552465419724d));
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2935526259687648E13d + "'", double1 == 1.2935526259687648E13d);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.025443373427532223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.5920679407326555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5920679407326552d) + "'", double1 == (-1.5920679407326552d));
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.691781362855432d, 0.45737502830978294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.215295529553956d + "'", double2 == 2.215295529553956d);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.258625852338093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8339606486095772d + "'", double1 == 1.8339606486095772d);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5066986545189869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.511811133091391d + "'", double1 == 3.511811133091391d);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        long long1 = org.apache.commons.math.util.FastMath.abs((-3L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        double double1 = org.apache.commons.math.util.FastMath.tanh(44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        double double1 = org.apache.commons.math.util.FastMath.atan((-122.141774015765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.562609302613341d) + "'", double1 == (-1.562609302613341d));
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        double double2 = org.apache.commons.math.util.FastMath.min((-10.017874927409903d), (-0.5329806043723968d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.017874927409903d) + "'", double2 == (-10.017874927409903d));
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7527328986738668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.050056743216267E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9387214167925974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9688763681670626d + "'", double1 == 0.9688763681670626d);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        double double1 = org.apache.commons.math.util.FastMath.log10((-5.671281819617711d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        double double1 = org.apache.commons.math.util.FastMath.log(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9581452714622315d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.22574212779940497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        double double1 = org.apache.commons.math.util.FastMath.log(0.030500029680797045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.4900276222283577d) + "'", double1 == (-3.4900276222283577d));
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.03553765937419076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03553765937419076d + "'", double2 == 0.03553765937419076d);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9748575314241001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.338696365588977d) + "'", double1 == (-2.338696365588977d));
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.3112315471152565E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9916299884373267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        float float1 = org.apache.commons.math.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.232874695796d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.33632941342054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.389130911488429d) + "'", double1 == (-1.389130911488429d));
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008608058839528346d + "'", double1 == 0.008608058839528346d);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7938702090612697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6605959163879956d + "'", double1 == 0.6605959163879956d);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        int int2 = org.apache.commons.math.util.FastMath.max(2063, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2063 + "'", int2 == 2063);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999597035524652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414492118611893d + "'", double1 == 0.8414492118611893d);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.900263084763043E-15d, (-0.11613819511123712d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.91050730295085d + "'", double2 == 45.91050730295085d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1016892267331362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.691029831908528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2499711302001137d + "'", double1 == 2.2499711302001137d);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.012377838852570225d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6190869198926164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0093823567077387d, 1.2539748267768518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2539748267768518d + "'", double2 == 1.2539748267768518d);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.09912061004526737d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09944715371179307d) + "'", double1 == (-0.09944715371179307d));
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.1901966454565756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.27820030845766d + "'", double1 == 2.27820030845766d);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3440585709080869E43d, 14.899277193215994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.899277193215994d + "'", double2 == 14.899277193215994d);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4427658101751764d, 0.06132629483063868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44276581017517636d + "'", double2 == 0.44276581017517636d);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1309659398685175d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7313177749345641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.548882838163893d + "'", double1 == 0.548882838163893d);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5525092244297581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7376075997095711d + "'", double1 == 0.7376075997095711d);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.457194883916838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.200019639737684d + "'", double1 == 2.200019639737684d);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.4122234869888466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.158744905779733d + "'", double1 == 10.158744905779733d);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        int int2 = org.apache.commons.math.util.FastMath.max((-3), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5127742681331149d + "'", double1 == 0.5127742681331149d);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4763066899814426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.950821873121645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2558786252840992d + "'", double1 == 1.2558786252840992d);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6769292032740716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8035950473828616d + "'", double1 == 0.8035950473828616d);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.3854156042398065E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6142115809594618d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        double double1 = org.apache.commons.math.util.FastMath.tan((-14.119669143560207d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.1442168600299d) + "'", double1 == (-57.1442168600299d));
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.0013530756255686267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0013530747998261239d) + "'", double1 == (-0.0013530747998261239d));
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1624473515096263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 4477855, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4477855L + "'", long2 == 4477855L);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 2063);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2063 + "'", int2 == 2063);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.449489742783178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7699057297498929d) + "'", double1 == (-0.7699057297498929d));
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.164473663317525E39d, 0.19127348683183137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2162489520625863d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.10885756869875891d), (-1.3485292390836008d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9893991910142437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.68839789877413d + "'", double1 == 56.68839789877413d);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.645154496685698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42245104313814197d + "'", double1 == 0.42245104313814197d);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        double double1 = org.apache.commons.math.util.FastMath.signum(88.41200782328137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9556244815546298d, 0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.965154275119354d + "'", double2 == 0.965154275119354d);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.645154496685698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.078307740648642d + "'", double1 == 7.078307740648642d);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7227249945840306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1987776893180473d + "'", double1 == 1.1987776893180473d);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.9802322387695326E-8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.12307781635714636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1224619373680373d + "'", double1 == 0.1224619373680373d);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        double double1 = org.apache.commons.math.util.FastMath.asin(65.3011208856134d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9124034991009713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36), 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        long long1 = org.apache.commons.math.util.FastMath.round((-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-10L) + "'", long1 == (-10L));
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9556244815546298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04539024481863856d) + "'", double1 == (-0.04539024481863856d));
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9023219280642616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0298470193517195d + "'", double1 == 1.0298470193517195d);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        double double1 = org.apache.commons.math.util.FastMath.expm1(148.2089053595242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.324394111573494E64d + "'", double1 == 2.324394111573494E64d);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.006052854641401612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07780009409635448d + "'", double1 == 0.07780009409635448d);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.121833536484325E65d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.822913501261767E21d + "'", double1 == 4.822913501261767E21d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        long long2 = org.apache.commons.math.util.FastMath.min(28L, 2063L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9960858836069668d) + "'", double1 == (-0.9960858836069668d));
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(68.05378976758614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.249472090236207d + "'", double1 == 8.249472090236207d);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.027663626743604E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.3028042777699618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.476397682642024d + "'", double1 == 1.476397682642024d);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.011055332669562755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.55974076891512d + "'", double1 == 1.55974076891512d);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        double double1 = org.apache.commons.math.util.FastMath.abs(3121.3640828137964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3121.3640828137964d + "'", double1 == 3121.3640828137964d);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36), (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6520789543272818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.919527293312253d + "'", double1 == 1.919527293312253d);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25534192122103627d + "'", double1 == 0.25534192122103627d);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0081355681289063E-4d, 2.3028042777699618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.062358072476272E-9d + "'", double2 == 3.062358072476272E-9d);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000009d + "'", double1 == 1.0000000000000009d);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2063);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2063 + "'", int1 == 2063);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.20350434138645834d, (double) 36L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20350434138645837d + "'", double2 == 0.20350434138645837d);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.8867207287394443d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2373198740967832d + "'", double2 == 1.2373198740967832d);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09885980944252423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09853962397257558d + "'", double1 == 0.09853962397257558d);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2062.6480624709634d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8373564163103412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5783670750072386d + "'", double1 == 0.5783670750072386d);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8540613333825726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0237436272580824d + "'", double1 == 1.0237436272580824d);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.051085085955435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.838727600510853d) + "'", double1 == (-2.838727600510853d));
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        double double1 = org.apache.commons.math.util.FastMath.rint(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 471.0d + "'", double1 == 471.0d);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4989311994917956d, 0.244075746423698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4989311994917956d + "'", double2 == 0.4989311994917956d);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.017064347081341257d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.978290412724896E-4d) + "'", double1 == (-2.978290412724896E-4d));
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.01362395589953866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013623534472724621d + "'", double1 == 0.013623534472724621d);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9924354818345209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9974721090970264d + "'", double1 == 0.9974721090970264d);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6222839233857677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8991393306940653d + "'", double1 == 0.8991393306940653d);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.7405700602011438d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7405700602011438d) + "'", double2 == (-1.7405700602011438d));
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0477652126995582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0236040312052108d + "'", double1 == 1.0236040312052108d);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012097700501686678d + "'", double1 == 0.012097700501686678d);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2863696021375706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2787899833821571d + "'", double1 == 0.2787899833821571d);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8393241772657645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6982634552829992d + "'", double1 == 0.6982634552829992d);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.505624538809027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.76730282809273d) + "'", double1 == (-4.76730282809273d));
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6499607902809772d, 0.5140883340610262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6499607902809771d + "'", double2 == 0.6499607902809771d);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.017064347177812814d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706269113365984d) + "'", double1 == (-0.01706269113365984d));
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.894806889943192E27d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9924907337673078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.448169386217278d + "'", double1 == 1.448169386217278d);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.31113287105457993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0487935500444296d + "'", double1 == 1.0487935500444296d);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.1474836470000002E9d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.7905015022311375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.790501502231138d + "'", double1 == 2.790501502231138d);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) (-115));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115L) + "'", long2 == (-115L));
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735841046317d + "'", double1 == 0.8813735841046317d);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        double double1 = org.apache.commons.math.util.FastMath.abs((-59.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.0d + "'", double1 == 59.0d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6780340105920696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8254661191709086d + "'", double1 == 0.8254661191709086d);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.940877490667089d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9932694174888552d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.16035232751746503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1610475890720457d + "'", double1 == 0.1610475890720457d);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        double double1 = org.apache.commons.math.util.FastMath.log1p(36.94619134889437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6361691390923374d + "'", double1 == 3.6361691390923374d);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8005182678076421d, 1.1302760979721156d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.616241574343367d + "'", double2 == 0.616241574343367d);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.01660986102055906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01661138867339406d) + "'", double1 == (-0.01661138867339406d));
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.015706363640220756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 4L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9998623430542969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745088995300254d + "'", double1 == 0.01745088995300254d);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7774898930433891d), 2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.5920506043567072E-40d) + "'", double2 == (-3.5920506043567072E-40d));
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1526029135263929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.025759650340653972d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025753954920396786d) + "'", double1 == (-0.025753954920396786d));
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.45771669378667196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4419009892498196d + "'", double1 == 0.4419009892498196d);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4210854715201906E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948823d + "'", double1 == 1.5707963267948823d);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.010715004697646389d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        double double1 = org.apache.commons.math.util.FastMath.asinh(15.942385272088025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.463110668965387d + "'", double1 == 3.463110668965387d);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        double double1 = org.apache.commons.math.util.FastMath.log(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9457568095296385d) + "'", double1 == (-1.9457568095296385d));
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5574077246549023d), 0.761594155751147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.761594155751147d + "'", double2 == 0.761594155751147d);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.9696166897867456E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9696166897867456E-17d + "'", double1 == 4.9696166897867456E-17d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6547583753982603d), 74.20994852478785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008822824958639347d) + "'", double2 == (-0.008822824958639347d));
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1284219259116488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.090775177372908d + "'", double1 == 2.090775177372908d);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.278947656501517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.039158830928161d + "'", double1 == 1.039158830928161d);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5479174221765761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4989577353438995d + "'", double1 == 0.4989577353438995d);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2460098192572937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8944952053512556d + "'", double1 == 0.8944952053512556d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9128128099614456d + "'", double1 == 3.9128128099614456d);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7184726744159351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8476276744042369d + "'", double1 == 0.8476276744042369d);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.1474836479999998E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.18070977791825d + "'", double1 == 22.18070977791825d);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.393331789936231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.393331789936231d + "'", double1 == 3.393331789936231d);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4477855, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4477855.0f + "'", float2 == 4477855.0f);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.3012989023072947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7448391559015919d) + "'", double1 == (-0.7448391559015919d));
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.6332258730806833E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.41047360972814d + "'", double1 == 45.41047360972814d);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0965832309956893d, (double) 2063L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0965832309956893d + "'", double2 == 0.0965832309956893d);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8755136329925575d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.1321790744880604d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7123698152507008d + "'", double1 == 1.7123698152507008d);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013, (float) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.223372E18f) + "'", float2 == (-9.223372E18f));
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        double double1 = org.apache.commons.math.util.FastMath.log(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0482269650408105d) + "'", double1 == (-4.0482269650408105d));
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(16.305565311881857d, 2.098648162807935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.305565311881853d + "'", double2 == 16.305565311881853d);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.798025384430308E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8834755512688955E-6d + "'", double1 == 4.8834755512688955E-6d);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        float float1 = org.apache.commons.math.util.FastMath.abs(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.750997096321691d + "'", double1 == 0.750997096321691d);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11.548739357257748d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9165654068163128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015997084158825937d + "'", double1 == 0.015997084158825937d);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.311729952787136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.360883372295585d + "'", double1 == 2.360883372295585d);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.010715004697646389d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8375930412496614d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6692532159287145d + "'", double1 == 0.6692532159287145d);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5747767842239402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19721900368121273d + "'", double1 == 0.19721900368121273d);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(13.596393425240073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393425240075d + "'", double1 == 13.596393425240075d);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        double double1 = org.apache.commons.math.util.FastMath.asin(10.566701978945693d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4814032181812175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6183436989631361d + "'", double1 == 1.6183436989631361d);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5344733951434961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.490844497424634d + "'", double1 == 0.490844497424634d);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.257328148668907d, 31.359378923407302d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2573281486689072d + "'", double2 == 1.2573281486689072d);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.866875981405849d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8461684323333872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        double double2 = org.apache.commons.math.util.FastMath.max(13.596393407513998d, 1.1016892267331362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.596393407513998d + "'", double2 == 13.596393407513998d);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6138893069268366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7151390827176082d) + "'", double1 == (-0.7151390827176082d));
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7642469915557847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013338626301109744d + "'", double1 == 0.013338626301109744d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8427269113676636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6872507146091852d + "'", double1 == 0.6872507146091852d);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        long long1 = org.apache.commons.math.util.FastMath.round(0.999949219941102d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7987095471340483d) + "'", double1 == (-0.7987095471340483d));
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.075588856347743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07280266049565533d) + "'", double1 == (-0.07280266049565533d));
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.37284288447085207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7959200327197421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8281369575165142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9757757363091464d + "'", double1 == 0.9757757363091464d);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4548324228266097d, 0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7162579075638862d + "'", double2 == 0.7162579075638862d);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.239555818331752d + "'", double1 == 2.239555818331752d);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7403781783870954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4937771781472162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2222017747275677d + "'", double1 == 1.2222017747275677d);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7010979104724594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999995127848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707651109285095d + "'", double1 == 1.5707651109285095d);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9631092280360398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4378523801702012d) + "'", double1 == (-1.4378523801702012d));
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.533811507790112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707963267948917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780803687d + "'", double1 == 0.027415567780803687d);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0718547487488204d, 0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2011558894516137d + "'", double2 == 1.2011558894516137d);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.817884356931778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.964440738224975d) + "'", double1 == (-3.964440738224975d));
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.17512404686688d + "'", double1 == 1.17512404686688d);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        long long2 = org.apache.commons.math.util.FastMath.max(793006726156715L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 793006726156715L + "'", long2 == 793006726156715L);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9155040003582885E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6223472360131463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1999898726923162d + "'", double1 == 1.1999898726923162d);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0000004893466914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557409400922481d + "'", double1 == 1.557409400922481d);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.12978368762258294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.816416721453645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0640442167534199d + "'", double1 == 1.0640442167534199d);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6718282560736888d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2733360428781544d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.20023258787546835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5850301568455275d + "'", double1 == 0.5850301568455275d);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        float float1 = org.apache.commons.math.util.FastMath.abs((-115.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 115.0f + "'", float1 == 115.0f);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8168979791449944d, 0.63064585426075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8168979791449944d + "'", double2 == 0.8168979791449944d);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.4419009892498196d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306943613116555d + "'", double1 == 9.306943613116555d);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6448247459530039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6448247459530039d + "'", double1 == 0.6448247459530039d);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9589242746631385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7437966536915237d) + "'", double1 == (-0.7437966536915237d));
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8410058489917948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.904340862875948E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0587911840678754E-22d + "'", double1 == 1.0587911840678754E-22d);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.017435626545756002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8426112706321625d + "'", double1 == 0.8426112706321625d);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4023892583804743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4023892583804743d + "'", double1 == 0.4023892583804743d);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9085046217255329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4806103077241852d + "'", double1 == 2.4806103077241852d);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6765125521465636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6765125521465636d + "'", double1 == 0.6765125521465636d);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8969517247856423d, 14.476482730108396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.061880126194168064d + "'", double2 == 0.061880126194168064d);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2538411278428352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9501888091071048d + "'", double1 == 0.9501888091071048d);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0032155680495951195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0032207435344236d + "'", double1 == 1.0032207435344236d);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.70538286340545d + "'", double1 == 21.70538286340545d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5111254139617192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5111254139617194d + "'", double1 == 1.5111254139617194d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6424645511942247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6424645511942246d) + "'", double1 == (-0.6424645511942246d));
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8833206860228293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1714901038836636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17065078438533676d + "'", double1 == 0.17065078438533676d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.049853137223771d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        double double1 = org.apache.commons.math.util.FastMath.log(7.111512116496156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9617148958157902d + "'", double1 == 1.9617148958157902d);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.06310629616292701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06319020142504345d + "'", double1 == 0.06319020142504345d);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963274966377d, (-0.32468210900718336d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8636213787274234d + "'", double2 == 0.8636213787274234d);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2024664181803648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02098699814191037d + "'", double1 == 0.02098699814191037d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        double double1 = org.apache.commons.math.util.FastMath.log1p(34.768015146316124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5770540623915577d + "'", double1 == 3.5770540623915577d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        double double1 = org.apache.commons.math.util.FastMath.sin((-4.155599707401653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8489562348854366d + "'", double1 == 0.8489562348854366d);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.22160826669200384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.697218386661397d + "'", double1 == 12.697218386661397d);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3217992116817487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3113341772233063d + "'", double1 == 0.3113341772233063d);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.582952257831639d) + "'", double1 == (-5.582952257831639d));
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9998761644507076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        float float2 = org.apache.commons.math.util.FastMath.min(115.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6448247459530039d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5195675877329186d + "'", double1 == 0.5195675877329186d);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2149882416150459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21664819721024015d + "'", double1 == 0.21664819721024015d);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999999995127847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.115949024994715E-10d) + "'", double1 == (-2.115949024994715E-10d));
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9905441402385452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2063, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9679651155126135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8585391322716084d + "'", double1 == 0.8585391322716084d);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3119232597915513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.039158830928161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.50694550581865d + "'", double1 == 0.50694550581865d);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6509498349092765d, 0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6509498349092764d + "'", double2 == 0.6509498349092764d);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        int int1 = org.apache.commons.math.util.FastMath.round((-115.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-115) + "'", int1 == (-115));
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.021361775150108318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021136810554323582d + "'", double1 == 0.021136810554323582d);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5855174436770063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5563666036830428d + "'", double1 == 0.5563666036830428d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4289700495324938d, (double) 36L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.852898018082656E-14d + "'", double2 == 5.852898018082656E-14d);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        double double2 = org.apache.commons.math.util.FastMath.max(7.280109889280518d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.280109889280518d + "'", double2 == 7.280109889280518d);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.768115672379123E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7681156723792E13d + "'", double1 == 2.7681156723792E13d);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        double double1 = org.apache.commons.math.util.FastMath.exp(13.927451401512739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1118446.6953502845d + "'", double1 == 1118446.6953502845d);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0965832309956893d, 0.008977384716240355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09658323099568929d + "'", double2 == 0.09658323099568929d);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        double double1 = org.apache.commons.math.util.FastMath.sin(31.359378923407302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.056517480894809596d) + "'", double1 == (-0.056517480894809596d));
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0028361878855967383d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6158008682147178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04498935085960583d) + "'", double1 == (-0.04498935085960583d));
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.070289829259562d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8726001743881419d, 1.2735244882819095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2735244882819095d + "'", double2 == 1.2735244882819095d);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.013597097873114517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        double double1 = org.apache.commons.math.util.FastMath.tanh(83.93939556930012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        double double1 = org.apache.commons.math.util.FastMath.exp(288.95123313714026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0897695624953325E125d + "'", double1 == 3.0897695624953325E125d);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.050056743216267E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3276291673075579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3337931480558234d + "'", double1 == 0.3337931480558234d);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        long long1 = org.apache.commons.math.util.FastMath.round(68.05378976758614d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 68L + "'", long1 == 68L);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8944952053512556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.779893223227042d + "'", double1 == 0.779893223227042d);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36057130885140404d + "'", double1 == 0.36057130885140404d);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2722988564826722d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        double double2 = org.apache.commons.math.util.FastMath.pow(22.60451646247372d, (-0.9796516822121061d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.047136830097219494d + "'", double2 == 0.047136830097219494d);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4577979139729036d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.7678470809183597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-101.29017656114453d) + "'", double1 == (-101.29017656114453d));
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.010714389643952717d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8227302654111287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2767073749610631d + "'", double1 == 1.2767073749610631d);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1161530356493914d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2063, 4477855L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2063L + "'", long2 == 2063L);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        double double1 = org.apache.commons.math.util.FastMath.cosh(135.79913804720726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7400869195310774E58d + "'", double1 == 4.7400869195310774E58d);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8588413721833611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9267369487526442d + "'", double1 == 0.9267369487526442d);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8842619154287341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2751412702824697d + "'", double1 == 0.2751412702824697d);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.1321790744880604d), 1.0986122886681098d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.2557610379370634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8982972903877555d) + "'", double1 == (-0.8982972903877555d));
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9932694174888552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4118319367009855d + "'", double1 == 1.4118319367009855d);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7581226324091722d, 3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40331010331674993d + "'", double2 == 0.40331010331674993d);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.938699128765109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5566533772860698d + "'", double1 == 1.5566533772860698d);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.155615765921792E15d + "'", double1 == 2.155615765921792E15d);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.230178009514076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4933780531111591d + "'", double1 == 1.4933780531111591d);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2499711302001137d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.06566270191375284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        double double1 = org.apache.commons.math.util.FastMath.asinh(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3043013731747495d + "'", double1 == 3.3043013731747495d);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490457723982544d + "'", double1 == 1.2490457723982544d);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.4016515733337434d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8944271909999159d + "'", double1 == 0.8944271909999159d);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        double double1 = org.apache.commons.math.util.FastMath.acos(22.24855859029184d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9349901766807889d, 1.5219300558579005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9043222232332944d + "'", double2 == 0.9043222232332944d);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 61L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 61.0f + "'", float2 == 61.0f);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9843854589461036d, 3282.8063500117437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3282.8063500117437d + "'", double2 == 3282.8063500117437d);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7487731841429789d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        double double2 = org.apache.commons.math.util.FastMath.pow(75.13548422015074d, 1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000078d + "'", double2 == 1.0000000000000078d);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.22403837382938316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22591728328003433d + "'", double1 == 0.22591728328003433d);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.218882338219149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.797003617857419d + "'", double1 == 0.797003617857419d);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.449489742783178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8288776281165955d) + "'", double1 == (-0.8288776281165955d));
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1302760979721156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.756251594782026d + "'", double1 == 0.756251594782026d);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.381919166334245d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.017436510074825058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001520197933083d + "'", double1 == 1.0001520197933083d);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5138639830274463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18008685662095153d + "'", double1 == 0.18008685662095153d);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        double double2 = org.apache.commons.math.util.FastMath.atan2(404.07700410813203d, 0.8805489308698095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.568617169040093d + "'", double2 == 1.568617169040093d);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9960858836069668d), 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567154E14d + "'", double2 == 7.930067261567154E14d);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.567436903106386d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5161318365338295d) + "'", double1 == (-0.5161318365338295d));
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9965868662679572d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7836886808475337d) + "'", double1 == (-0.7836886808475337d));
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8718862068518762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866276225424493d + "'", double1 == 0.9866276225424493d);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        double double1 = org.apache.commons.math.util.FastMath.expm1(42.04283105900939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8153883016113024E18d + "'", double1 == 1.8153883016113024E18d);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.111040995153103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.111040995153103d + "'", double1 == 1.111040995153103d);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7075472925031875E-6d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5712986229603103d + "'", double1 == 0.5712986229603103d);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        double double1 = org.apache.commons.math.util.FastMath.log(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4339872044851463d + "'", double1 == 3.4339872044851463d);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24619002710729032d + "'", double1 == 0.24619002710729032d);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.249472090236207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.015737732063462555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.746752413041028E-4d) + "'", double1 == (-2.746752413041028E-4d));
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.10982774863576981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10938933154880198d + "'", double1 == 0.10938933154880198d);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007812658951540421d + "'", double1 == 0.007812658951540421d);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6424645511942247d), 1.2558786252840992d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        int int2 = org.apache.commons.math.util.FastMath.max((-115), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.561057036324046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999952573485446d + "'", double1 == 0.999952573485446d);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.2804875905732958d), 0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2804875905732955d) + "'", double2 == (-1.2804875905732955d));
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9577535432799731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.018746232637399787d) + "'", double1 == (-0.018746232637399787d));
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9329417505747774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.881969237093158d), 34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.881969237093157d) + "'", double2 == (-4.881969237093157d));
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2573281486689072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1213064472609204d + "'", double1 == 1.1213064472609204d);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.12246193736803732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12277011380080734d + "'", double1 == 0.12277011380080734d);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.675024856842625d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0059308383512293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7344514207990276d + "'", double1 == 2.7344514207990276d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9810147281934775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017121937017533426d + "'", double1 == 0.017121937017533426d);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9404604255716669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.940460425571667d + "'", double1 == 0.940460425571667d);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        double double1 = org.apache.commons.math.util.FastMath.atan(14.323944878270579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5010962464952833d + "'", double1 == 1.5010962464952833d);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4926081894122265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.13490994704196763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36730089442032077d + "'", double1 == 0.36730089442032077d);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0564224263707882E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0564224283357839E-4d + "'", double1 == 1.0564224283357839E-4d);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9998623430542969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8413966004702496d + "'", double1 == 0.8413966004702496d);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.013338626301109744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013338626301109746d + "'", double1 == 0.013338626301109746d);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        float float2 = org.apache.commons.math.util.FastMath.max(61.0f, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 61.0f + "'", float2 == 61.0f);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.14481870237280076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13482086618304895d) + "'", double1 == (-0.13482086618304895d));
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        long long1 = org.apache.commons.math.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1411917790307853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9777737598513075d + "'", double1 == 0.9777737598513075d);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5669767943827976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5669767943827977d + "'", double1 == 0.5669767943827977d);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7960684423756491d + "'", double1 == 0.7960684423756491d);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.0847193829771844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.771414605139463d) + "'", double1 == (-1.771414605139463d));
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.653142644460657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.653142644460658d + "'", double1 == 4.653142644460658d);
    }
}

