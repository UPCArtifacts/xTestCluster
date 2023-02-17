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
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5473244135939721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4365272545793937d + "'", double1 == 0.4365272545793937d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.674292154581808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.17315251817319363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5573691630451039d) + "'", double1 == (-0.5573691630451039d));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999995854505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        int int2 = org.apache.commons.math.util.FastMath.min(28, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.825659180793972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.381919166334245d + "'", double1 == 2.381919166334245d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8281369575165142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5950205904857503d + "'", double1 == 0.5950205904857503d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 61, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double double2 = org.apache.commons.math.util.FastMath.pow(1477896.0d, 0.25407782155012953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.94619134889437d + "'", double2 == 36.94619134889437d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.11275809360067207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11299841282199304d + "'", double1 == 0.11299841282199304d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double double1 = org.apache.commons.math.util.FastMath.acos((-53.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.980232238769531E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.52574989159953d) + "'", double1 == (-7.52574989159953d));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.2804875905732958d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5374883357278658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5960206033850242d + "'", double1 == 0.5960206033850242d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.761594155751147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.141687684311122d + "'", double1 == 1.141687684311122d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.641588833612779d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 61, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 61.0f + "'", float2 == 61.0f);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.12307781635714636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9924354818345209d + "'", double1 == 0.9924354818345209d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.3505504618025204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 134.67662099381104d + "'", double1 == 134.67662099381104d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8253806476966538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2827495233215394d + "'", double1 == 2.2827495233215394d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7734654088517433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.369491427691418d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.2734626020942639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9051076669497566d) + "'", double1 == (-0.9051076669497566d));
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5831805218535747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1934347873901916d + "'", double1 == 2.1934347873901916d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9402927170540545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9402927170540544d) + "'", double1 == (-0.9402927170540544d));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9686168251319445d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.624682373096312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6661105887658553d + "'", double1 == 0.6661105887658553d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.0316268884157165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3564266222814876d + "'", double1 == 0.3564266222814876d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3222442443718263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005624223059889575d + "'", double1 == 0.005624223059889575d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4472118490899239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9016563503921403d + "'", double1 == 0.9016563503921403d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6094379124341003d, 0.9286112600478652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9286112600478652d + "'", double2 == 0.9286112600478652d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.051085085955435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3028042777699618d + "'", double1 == 2.3028042777699618d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5504919694000701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5504919694000701d + "'", double1 == 0.5504919694000701d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485196d) + "'", double1 == (-0.6995216443485196d));
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.6899857126771447d), 0.7337858288394479d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6899857126771445d) + "'", double2 == (-1.6899857126771445d));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7105940846527334d + "'", double1 == 1.7105940846527334d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.32577747641597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.144102928345479d + "'", double1 == 2.144102928345479d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 7.9300672E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.529468828731893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9917391466214525d + "'", double1 == 0.9917391466214525d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.493777178147216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        long long2 = org.apache.commons.math.util.FastMath.min(11013L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.041905639223649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double2 = org.apache.commons.math.util.FastMath.max(0.11299841282199304d, 30.000000000000092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.000000000000092d + "'", double2 == 30.000000000000092d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int int2 = org.apache.commons.math.util.FastMath.max(61, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.015058070638819365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01505863975516233d) + "'", double1 == (-0.01505863975516233d));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8700360014895149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015184992836878325d + "'", double1 == 0.015184992836878325d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9226350743220142d) + "'", double1 == (-0.9226350743220142d));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        int int1 = org.apache.commons.math.util.FastMath.round((-36.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000775229078724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5431717444660054d + "'", double1 == 1.5431717444660054d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.904340862875605E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.904340862875948E-7d + "'", double1 == 5.904340862875948E-7d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double double1 = org.apache.commons.math.util.FastMath.exp(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.7260621198151926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.272626674815957d + "'", double1 == 15.272626674815957d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.008977384716240355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008977384716240355d + "'", double1 == 0.008977384716240355d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.468462369872704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5975358844115611d + "'", double1 == 0.5975358844115611d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9939266104413662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6901058656674172d + "'", double1 == 0.6901058656674172d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double1 = org.apache.commons.math.util.FastMath.log10(1262023.5276316951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.101067451441691d + "'", double1 == 6.101067451441691d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2460098192572937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2722988564826722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2792346534116863d + "'", double1 == 0.2792346534116863d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1526029135263929d, 0.6418121870003564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6418121870003564d + "'", double2 == 0.6418121870003564d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.2245999714347802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double double1 = org.apache.commons.math.util.FastMath.log(3.7983568845157207E-103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-235.83169600397733d) + "'", double1 == (-235.83169600397733d));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 61L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.634202896939395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43323115153831737d + "'", double1 == 0.43323115153831737d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.003778621850415507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8693235746902677d + "'", double1 == 0.8693235746902677d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.685719999335932E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.016031504549832633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.798025384430308E-4d + "'", double1 == 2.798025384430308E-4d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0038806863757765916d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0500567432162665E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.5435938325608288E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.016011074256884285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016012442567499265d + "'", double1 == 0.016012442567499265d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7017203400855395d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.205613885386214d) + "'", double1 == (-40.205613885386214d));
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9867228626928289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5040991004948214d + "'", double1 == 2.5040991004948214d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7037024113814048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.021222267573487d + "'", double1 == 2.021222267573487d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.011869972069403028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.115445474195378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.839916738498857d + "'", double1 == 0.839916738498857d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6416164750242573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.598491228324284d + "'", double1 == 0.598491228324284d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.016592775780932937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998623430542969d + "'", double1 == 0.9998623430542969d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.332204510175204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8734651779958067d + "'", double1 == 1.8734651779958067d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9387214167925974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.017067660857999937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706683222077747d + "'", double1 == 0.01706683222077747d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.786775498263975d + "'", double1 == 16.786775498263975d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8849970445005177d, 0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8849970445005176d + "'", double2 == 0.8849970445005176d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double double2 = org.apache.commons.math.util.FastMath.pow(350773.07414689334d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9555903714699527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.751295228566846d + "'", double1 == 54.751295228566846d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.969616689786745E-17d + "'", double1 == 4.969616689786745E-17d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6560777742274478d, 2.465190328815662E-32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.306831688654869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306831688654869d + "'", double1 == 9.306831688654869d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9997774193665461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852868606942678d + "'", double1 == 0.7852868606942678d);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5896069690147184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.781990896044064d + "'", double1 == 33.781990896044064d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2837077863503052d) + "'", double1 == (-0.2837077863503052d));
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.sinh(22.18070977791825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1474836479999983E9d + "'", double1 == 2.1474836479999983E9d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 61);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 61L + "'", long1 == 61L);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3858499999805942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6865729626547228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414436595433751d + "'", double1 == 0.8414436595433751d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.983031862437426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7543753792902596d + "'", double1 == 0.7543753792902596d);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0920413661465178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.829365768464211d + "'", double1 == 0.829365768464211d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 31.306852819440046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.306852819440046d + "'", double2 == 31.306852819440046d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810474126015542d + "'", double1 == 4.810474126015542d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2155615773557598L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.663528081877013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 267.20047673229305d + "'", double1 == 267.20047673229305d);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557598L, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557598L + "'", long2 == 2155615773557598L);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92560.48544260226d + "'", double1 == 92560.48544260226d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6033115552004982d, 0.011614301805863666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.563552507824052d + "'", double2 == 1.563552507824052d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.3628287378324058d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02378584861597409d) + "'", double1 == (-0.02378584861597409d));
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.007423096440071042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8887992509694498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0105291415464854d + "'", double1 == 1.0105291415464854d);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.000000000002d + "'", double1 == 11013.000000000002d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.008837747656337245d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 61);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4936329393655345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.191226210224389d + "'", double1 == 1.191226210224389d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.49320544130525545d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2005.3522829578822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578824d + "'", double1 == 2005.3522829578824d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int int1 = org.apache.commons.math.util.FastMath.round(2.15561577E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.702331196945153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8718862068518762d + "'", double1 == 0.8718862068518762d);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        double double2 = org.apache.commons.math.util.FastMath.max(0.011869972069403028d, 0.015406296237756672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015406296237756672d + "'", double2 == 0.015406296237756672d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.3852968325547366d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9810147281934775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019167806080466043d) + "'", double1 == (-0.019167806080466043d));
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.691781362855433d, 2.185039863261519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.691781362855432d + "'", double2 == 5.691781362855432d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.12208469106610245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.913338791438829d) + "'", double1 == (-0.913338791438829d));
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math.util.FastMath.signum(15.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6979906844392165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2883311413111977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00503232775191344d + "'", double1 == 0.00503232775191344d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.5659969E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0596843711268005d + "'", double1 == 1.0596843711268005d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963274966374d, 0.030044150150702355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.013659873692965d + "'", double2 == 1.013659873692965d);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2915496650148839d + "'", double1 == 1.2915496650148839d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5690509993150914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8020888451018577d + "'", double1 == 3.8020888451018577d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.31712849292107215d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7337858288394479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double double1 = org.apache.commons.math.util.FastMath.log10(11.077668423659947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.044448361719681d + "'", double1 == 1.044448361719681d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.01718962461003295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9848929415691015d) + "'", double1 == (-0.9848929415691015d));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) ' ', 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.69314718055994d + "'", double1 == 35.69314718055994d);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.0081355681289063E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0081355951223216E-4d + "'", double1 == 2.0081355951223216E-4d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1881062682776882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3113615847218745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080872397649996d + "'", double1 == 0.6080872397649996d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5831805218535748d), 1.719463918234335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5831805218535747d) + "'", double2 == (-0.5831805218535747d));
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 53.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-7.234213228460136E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4190581615792427d + "'", double1 == 0.4190581615792427d);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590837d + "'", double1 == 2.7182818284590837d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8977884248618486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2544505614529586d + "'", double1 == 1.2544505614529586d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        float float2 = org.apache.commons.math.util.FastMath.max(28.0f, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double double2 = org.apache.commons.math.util.FastMath.max(3.7983568845157207E-103d, (-0.8245796280639899d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7983568845157207E-103d + "'", double2 == 3.7983568845157207E-103d);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999346490652955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430038376137702d + "'", double1 == 1.5430038376137702d);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double2 = org.apache.commons.math.util.FastMath.max(0.816416721453645d, 4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.644483341943246d + "'", double2 == 4.644483341943246d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8431082790768843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9447011658624149d + "'", double1 == 0.9447011658624149d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20994852478785d + "'", double1 == 74.20994852478785d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.47948744445313884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.407481337357587E65d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.027663626743604E-20d + "'", double1 == 3.027663626743604E-20d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.2706241612948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.2706241612948d + "'", double1 == 8.2706241612948d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.850338976445283E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.570796326794893d) + "'", double1 == (-1.570796326794893d));
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.4872649669851485d), 0.846168432333387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4872649669851485d) + "'", double2 == (-1.4872649669851485d));
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double double2 = org.apache.commons.math.util.FastMath.pow(11013.232874703415d, 1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83492.815131474d + "'", double2 == 83492.815131474d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.48879314574081656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008531049754357747d + "'", double1 == 0.008531049754357747d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5417012959232971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5181962706832005d + "'", double1 == 0.5181962706832005d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.852784546951458E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8087154501960998d + "'", double1 == 0.8087154501960998d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        long long1 = org.apache.commons.math.util.FastMath.abs(28L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7162532403593261d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.003873175936571774d, 0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10982774863576981d + "'", double2 == 0.10982774863576981d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        double double2 = org.apache.commons.math.util.FastMath.max(88.46858222228961d, (-1.4214298233873417d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 88.46858222228961d + "'", double2 == 88.46858222228961d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9198684.01795415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.03457109897233d + "'", double1 == 16.03457109897233d);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9715993241920361d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 28);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.3305834282671767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4657022738769552d + "'", double1 == 1.4657022738769552d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 28);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 28.0f + "'", float1 == 28.0f);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.12246193736803732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1302760979721156d + "'", double1 == 1.1302760979721156d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        int int1 = org.apache.commons.math.util.FastMath.abs(61);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.287543329097423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.287543329097423d + "'", double1 == 0.287543329097423d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999999992766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.323965890257375d + "'", double1 == 14.323965890257375d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double2 = org.apache.commons.math.util.FastMath.max(5506.500045400885d, (-0.7403781783870954d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5506.500045400885d + "'", double2 == 5506.500045400885d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.850400315662227d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.850400315662227d + "'", double1 == 0.850400315662227d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2162489520625863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3058323384932887d + "'", double1 == 0.3058323384932887d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8235999793529158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7335970689168808d + "'", double1 == 0.7335970689168808d);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.756960248770389E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8714530459221005E-5d + "'", double1 == 3.8714530459221005E-5d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2690414063907078d + "'", double1 == 0.2690414063907078d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1653756234894295d, (-1.633123935319537E16d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.633123935319537E16d) + "'", double2 == (-1.633123935319537E16d));
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.1751860816182014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math.util.FastMath.log1p(100.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.621959918095506d + "'", double1 == 4.621959918095506d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double double1 = org.apache.commons.math.util.FastMath.asin(1833.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.2366321052384454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.972133021969204d + "'", double1 == 0.972133021969204d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.5474914758024213E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9623483673129102d + "'", double1 == 0.9623483673129102d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8805489308698096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4122234869888466d + "'", double1 == 2.4122234869888466d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.4750868533986696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7859867255787167d) + "'", double1 == (-0.7859867255787167d));
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1474836470000002E9d + "'", double1 == 2.1474836470000002E9d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(34.30685281944005d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.306852819440046d + "'", double2 == 34.306852819440046d);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.180709777452588d + "'", double1 == 22.180709777452588d);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1653756234894295d, 1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.017406662205076E-7d + "'", double2 == 6.017406662205076E-7d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4412763792521019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0989526189341596d + "'", double1 == 1.0989526189341596d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7859867255787167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7216882908745974d) + "'", double1 == (-0.7216882908745974d));
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.403108691970989E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 28L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 28.0f + "'", float1 == 28.0f);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9854342165774551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6858376391226194d + "'", double1 == 0.6858376391226194d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1653756234894295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020339641652372314d + "'", double1 == 0.020339641652372314d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        long long1 = org.apache.commons.math.util.FastMath.round(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-9223372036854775808L) + "'", long1 == (-9223372036854775808L));
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double double1 = org.apache.commons.math.util.FastMath.atanh(13.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999835100737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double double1 = org.apache.commons.math.util.FastMath.floor(14.32394487827058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5417012959232971d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5417012959232971d + "'", double2 == 0.5417012959232971d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.7408756471404097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.13486929389731d + "'", double1 == 42.13486929389731d);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.0110925050025188E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.478724097855846d + "'", double1 == 22.478724097855846d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9086935997460159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0390143537125156d + "'", double1 == 1.0390143537125156d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9880063794199373d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7208852476093055d, (-0.5578300447656457d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8842619154287341d + "'", double2 == 1.8842619154287341d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6138893069268365d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.311729952787136d + "'", double1 == 4.311729952787136d);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5963866438669847d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) 2063L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0000573996218827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752897678248004d + "'", double1 == 1.1752897678248004d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0489207050997464d, 0.7653233053981704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9404604255716669d + "'", double2 == 0.9404604255716669d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.59470089220704d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math.util.FastMath.log10(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7558748556724915d + "'", double1 == 1.7558748556724915d);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01831563888873418d + "'", double1 == 0.01831563888873418d);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7527328986738668d + "'", double1 == 0.7527328986738668d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6931471805599463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.121587127777053E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.505624538809027d) + "'", double1 == (-4.505624538809027d));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3074614241103386d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9397458386915911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.550361514265363d + "'", double1 == 3.550361514265363d);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5661631704961736d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3799380148686868d, 0.003778621850415507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3799380148686868d + "'", double2 == 1.3799380148686868d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.32394487827058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 820.7015875029359d + "'", double1 == 820.7015875029359d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.038579145276530495d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992559170697481d + "'", double1 == 0.9992559170697481d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8668856945829329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3794888473189277d + "'", double1 == 1.3794888473189277d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1752897678248004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16151472810737288d + "'", double1 == 0.16151472810737288d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(83492.815131474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 288.95123313714026d + "'", double1 == 288.95123313714026d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1301927452503904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3866411157110812d + "'", double1 == 1.3866411157110812d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5837461910522398d, 36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5837461910522398d + "'", double2 == 0.5837461910522398d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9905441402385452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8746714534546823d) + "'", double1 == (-0.8746714534546823d));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double double1 = org.apache.commons.math.util.FastMath.log(0.829365768464211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18709400467144954d) + "'", double1 == (-0.18709400467144954d));
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1748021039363987d + "'", double1 == 3.1748021039363987d);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.12185520336050866d, (-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12185520336050865d + "'", double2 == 0.12185520336050865d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3282591577868472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.287543329097423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5362306678076357d + "'", double1 == 0.5362306678076357d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9939266104413662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1658510805516356d + "'", double1 == 1.1658510805516356d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4601792271763016d + "'", double1 == 0.4601792271763016d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        double double1 = org.apache.commons.math.util.FastMath.exp(33.4907608171425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.506328628316943E14d + "'", double1 == 3.506328628316943E14d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.34736225845333263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9170656115321792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7421640100660715d + "'", double1 == 0.7421640100660715d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6297336780960754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6297336780960755d + "'", double1 == 0.6297336780960755d);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3217992116817487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3164891445841542d + "'", double1 == 0.3164891445841542d);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        int int1 = org.apache.commons.math.util.FastMath.abs(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6569265110688361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8540613333825726d + "'", double1 == 0.8540613333825726d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.7013126796226725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.701312679622673d + "'", double1 == 2.701312679622673d);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.8539967282194916E-36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8539967282194916E-36d + "'", double1 == 4.8539967282194916E-36d);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.01573708249221756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015614538593136463d + "'", double1 == 0.015614538593136463d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double1 = org.apache.commons.math.util.FastMath.cosh(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344058570908125E43d + "'", double1 == 1.344058570908125E43d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104828573131138d + "'", double1 == 2.104828573131138d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7161260676499148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14481870237280076d) + "'", double1 == (-0.14481870237280076d));
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        float float2 = org.apache.commons.math.util.FastMath.max(2.15561577E15f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.05197427970224781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9779068701712603d + "'", double1 == 2.9779068701712603d);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0159880658191136d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.22160826669200384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3473328898889474d + "'", double1 == 1.3473328898889474d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5169642656554078d, 0.2199463009580406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2199463009580406d + "'", double2 == 0.2199463009580406d);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double double2 = org.apache.commons.math.util.FastMath.atan2(88.46858222228961d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.674292154581808d, 4.8679319012240025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 563.9323559833009d + "'", double2 == 563.9323559833009d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.899291721913687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9272133894790864d + "'", double1 == 0.9272133894790864d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-9.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-515.6620156177408d) + "'", double1 == (-515.6620156177408d));
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        double double1 = org.apache.commons.math.util.FastMath.atanh(42.12656474461543d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.45737502830978294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4427658101751764d + "'", double1 == 0.4427658101751764d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7552933256536749d) + "'", double1 == (-0.7552933256536749d));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9831917613609232d + "'", double1 == 0.9831917613609232d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.017453292519943295d), 1.4936329393655345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017453292519943295d) + "'", double2 == (-0.017453292519943295d));
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 404.07700410813203d + "'", double1 == 404.07700410813203d);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(820.7015875029359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.323944878270579d + "'", double1 == 14.323944878270579d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        long long1 = org.apache.commons.math.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        long long2 = org.apache.commons.math.util.FastMath.min(793006726156715L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8263231853045113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1907693164837155d) + "'", double1 == (-0.1907693164837155d));
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5563025007672873d + "'", double1 == 1.5563025007672873d);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8414436595433751d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.570846898832425d + "'", double1 == 0.570846898832425d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7208852476093055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        long long2 = org.apache.commons.math.util.FastMath.max(2063L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2063L + "'", long2 == 2063L);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.027415567793051467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027412133604287382d + "'", double1 == 0.027412133604287382d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7859867255787167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0011778177175026d) + "'", double1 == (-1.0011778177175026d));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7811352629728695E-34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7811352629728695E-34d + "'", double1 == 2.7811352629728695E-34d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6190869198926164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.7950337271198835d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5504919694000701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009607897371819097d + "'", double1 == 0.009607897371819097d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.11108683601087364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1113154508957882d) + "'", double1 == (-0.1113154508957882d));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.421175735948942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8898439427379993d + "'", double1 == 0.8898439427379993d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.121587125749206E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999995127847d + "'", double1 == 0.9999999995127847d);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1160510480284926d, 3.674292154581808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1160510480284929d + "'", double2 == 1.1160510480284929d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9443504370351304d + "'", double1 == 0.9443504370351304d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double double1 = org.apache.commons.math.util.FastMath.atanh(54.875235843642685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.math.util.FastMath.acos(57.29347069670921d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9381038193126576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.788321920828275d + "'", double1 == 0.788321920828275d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double1 = org.apache.commons.math.util.FastMath.abs(13.596393425240073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393425240073d + "'", double1 == 13.596393425240073d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6904153131565023d + "'", double1 == 0.6904153131565023d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double1 = org.apache.commons.math.util.FastMath.sinh(28.458847799916853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.144170023011829E12d + "'", double1 == 1.144170023011829E12d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.955817372303998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7749413721868142d + "'", double1 == 0.7749413721868142d);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        float float1 = org.apache.commons.math.util.FastMath.abs(36.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703395d + "'", double1 == 11013.232874703395d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.40459526003396906d, 3.5528283781107654E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.404595260033969d + "'", double2 == 0.404595260033969d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.969616689786745E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9696166897867456E-17d + "'", double1 == 4.9696166897867456E-17d);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0477652126995582d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.969914391648719d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.22541995827491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.40322401739334d + "'", double1 == 67.40322401739334d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4604047707757553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7756492399470994d) + "'", double1 == (-0.7756492399470994d));
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.866875981405849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.366336701331648d + "'", double1 == 1.366336701331648d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6377023445868331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8792846300053567d + "'", double1 == 0.8792846300053567d);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.exp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.159457545654789d + "'", double1 == 0.159457545654789d);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        double double1 = org.apache.commons.math.util.FastMath.expm1(69.9857113690718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4797520596972178E30d + "'", double1 == 2.4797520596972178E30d);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        long long1 = org.apache.commons.math.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 61L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7244640698111079d + "'", double1 == 0.7244640698111079d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 84.73931296875567d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 84.73931296875567d + "'", double2 == 84.73931296875567d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        long long1 = org.apache.commons.math.util.FastMath.abs(11013L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7215087615242686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6250159944861234d + "'", double1 == 0.6250159944861234d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9402927170540545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.490498035175377d + "'", double1 == 6.490498035175377d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.248291097914389d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999999995127848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1215866387059485E-5d + "'", double1 == 3.1215866387059485E-5d);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math.util.FastMath.cosh(14.899277193215994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0000003395d + "'", double1 == 1477896.0000003395d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        int int1 = org.apache.commons.math.util.FastMath.round(4477855.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4477855 + "'", int1 == 4477855);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.09944863851122218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1045617373477326d + "'", double1 == 1.1045617373477326d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6567305011816795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.608155121443248d + "'", double1 == 11.608155121443248d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9023219280642616d, 23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23151.90693368639d + "'", double2 == 23151.90693368639d);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 61, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.49320544130525545d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8323529090607977d + "'", double1 == 0.8323529090607977d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0834779204067602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08017616375873246d + "'", double1 == 0.08017616375873246d);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.050056743216267E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6227021789904291d) + "'", double1 == (-0.6227021789904291d));
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.16983711268242813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0029642168083889894d + "'", double1 == 0.0029642168083889894d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7885839348184186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2002784814230718d + "'", double1 == 1.2002784814230718d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.847965897671543d + "'", double1 == 0.847965897671543d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.1011775851339626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10135029771220193d) + "'", double1 == (-0.10135029771220193d));
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6780340105920696d + "'", double1 == 0.6780340105920696d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.07752552270710597d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.965976906313293E-6d), 26.205658776827104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.965976906313292E-6d) + "'", double2 == (-4.965976906313292E-6d));
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.17632698070846498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9844946338415412d + "'", double1 == 0.9844946338415412d);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7047238563609084d), 3.3305834282671767d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3305834282671767d + "'", double2 == 3.3305834282671767d);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        long long1 = org.apache.commons.math.util.FastMath.round(4.115167303285961d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8206157134569715d + "'", double1 == 0.8206157134569715d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.175190277575942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07010818985113715d + "'", double1 == 0.07010818985113715d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.24650636127268888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.030536856379932d + "'", double1 == 1.030536856379932d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4412763792521019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4147018718856047d + "'", double1 == 0.4147018718856047d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        long long1 = org.apache.commons.math.util.FastMath.round(0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3560551570236352d + "'", double1 == 1.3560551570236352d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7653530282311698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8715896637366357d + "'", double1 == 0.8715896637366357d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0989526189341596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019180341523815665d + "'", double1 == 0.019180341523815665d);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6709920726797248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8025482319007339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9315543776556867d + "'", double1 == 0.9315543776556867d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(134.67662099381104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7716.401982028351d + "'", double1 == 7716.401982028351d);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41394522878666795d + "'", double1 == 0.41394522878666795d);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.488068777620869d + "'", double1 == 7.488068777620869d);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5635321918516419d), (-0.5063656411097343d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.633123935319537E16d), 0.46294531990550564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46294531990550564d + "'", double2 == 0.46294531990550564d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3153655518886576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6699684639824476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0986122886681098d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.4650188248182272d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8986229735386518d) + "'", double1 == (-0.8986229735386518d));
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double1 = org.apache.commons.math.util.FastMath.log(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6536735398025657d + "'", double1 == 2.6536735398025657d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995520374d + "'", double1 == 9.999999995520374d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3564266222814876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5970147588472898d + "'", double1 == 0.5970147588472898d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6377023445868331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4498836490378548d) + "'", double1 == (-0.4498836490378548d));
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2005.3522829578824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.296722269256984d + "'", double1 == 8.296722269256984d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 34, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.999999995877003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8898968261331758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8898968261331758d + "'", double1 == 0.8898968261331758d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5106730734832936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3752699908573467d + "'", double1 == 2.3752699908573467d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        double double1 = org.apache.commons.math.util.FastMath.atanh(96.10655605346268d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.15360022690981506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8542183491034947d + "'", double1 == 0.8542183491034947d);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7653530282311698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11613819511123712d) + "'", double1 == (-0.11613819511123712d));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5851102438039824d, 5.899291721913687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09885980944252423d + "'", double2 == 0.09885980944252423d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5259944849453191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27901880940210105d) + "'", double1 == (-0.27901880940210105d));
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-15.797624686386575d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.0d) + "'", double1 == (-15.0d));
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9172007050216672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9172007050216672d + "'", double1 == 0.9172007050216672d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0011778177175026d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.47948744445313884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.692450319122707d + "'", double1 == 0.692450319122707d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9623033716478188d + "'", double1 == 0.9623033716478188d);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 61, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1309659398685175d + "'", double1 == 1.1309659398685175d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.030706839516532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2063L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2063.0f + "'", float2 == 2063.0f);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.881355914711719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05484867662649185d) + "'", double1 == (-0.05484867662649185d));
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0550256221829202d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.051085085955435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.49555014055642926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.934180721754538d + "'", double1 == 0.934180721754538d);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9982229502979694d + "'", double1 == 3.9982229502979694d);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.7621956910836314d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1309659398685175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.098648162807935d + "'", double1 == 2.098648162807935d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.187299190145385d, 1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.419216020537747d + "'", double2 == 3.419216020537747d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11012.99999999999d, (-0.4850747061979428d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11012.999999999989d + "'", double2 == 11012.999999999989d);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1624473515096263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020288533664930854d + "'", double1 == 0.020288533664930854d);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7731845027218617d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.7456418720467646d), 2.7260621198151926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7456418720467644d) + "'", double2 == (-1.7456418720467644d));
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        double double1 = org.apache.commons.math.util.FastMath.ceil(20.085536923187668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        long long2 = org.apache.commons.math.util.FastMath.min(53L, (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2222844543037337d + "'", double1 == 1.2222844543037337d);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.01505863975516233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6282284459929546E-4d) + "'", double1 == (-2.6282284459929546E-4d));
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7522515716783279d + "'", double1 == 0.7522515716783279d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2130532941206642d, 0.9429862169662604d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.910009865769752d + "'", double2 == 0.910009865769752d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6904153131565023d, 3.1215866387059485E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1215866387059485E-5d + "'", double2 == 3.1215866387059485E-5d);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.40429714988426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8713868162390155d + "'", double1 == 0.8713868162390155d);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.2267098339889183d), 0.3083596576175056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3083596576175056d + "'", double2 == 0.3083596576175056d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5662191695169732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5152102145743461d + "'", double1 == 0.5152102145743461d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-115L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-115) + "'", int1 == (-115));
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.321264196906668d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.5402550837019153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6620786215414698d + "'", double1 == 1.6620786215414698d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2809338454620642d + "'", double1 == 1.2809338454620642d);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.529468828731893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1995368577224608d + "'", double1 == 2.1995368577224608d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9822255582717379d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18882451043491247d + "'", double1 == 0.18882451043491247d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8150650454920118d + "'", double1 == 0.8150650454920118d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.804138441060347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.561057036324046d + "'", double1 == 1.561057036324046d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double2 = org.apache.commons.math.util.FastMath.min(1477896.0000003395d, 5.051085085955435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.051085085955435d + "'", double2 == 5.051085085955435d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(32034.985999653978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 559.1159815242489d + "'", double1 == 559.1159815242489d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4286723297002584d + "'", double1 == 0.4286723297002584d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.7950337271198835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08368912628241729d + "'", double1 == 0.08368912628241729d);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.8000374548825615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4000621965738769d + "'", double1 == 1.4000621965738769d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7756492399470994d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7001797585188416d) + "'", double1 == (-0.7001797585188416d));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11.54872970901283d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        float float2 = org.apache.commons.math.util.FastMath.max(2.15561577E15f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }
}

