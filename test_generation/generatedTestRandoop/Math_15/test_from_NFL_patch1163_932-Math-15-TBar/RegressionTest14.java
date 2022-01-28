import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 84666.09786958633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.4551915E-11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.814697265625E-6d, (-0.33656885961385924d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.33656885961385924d) + "'", double2 == (-0.33656885961385924d));
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 2.34187232E17f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6515104748804021d + "'", double1 == 0.6515104748804021d);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.192092895507818E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.192092895507821E-7d) + "'", double1 == (-1.192092895507821E-7d));
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7615941540256079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7050268465336258d + "'", double1 == 0.7050268465336258d);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4096.0005f, (-2.333512291668548E-8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998059039201d + "'", double2 == 0.9999998059039201d);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-3.6268604078470186d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.44459372763082317d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.031087507813438716d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03109251732533168d) + "'", double1 == (-0.03109251732533168d));
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.288818359375E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-3L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.43155358513611025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46180425250149204d + "'", double1 == 0.46180425250149204d);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.831008000716549E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.83100800071655E22d + "'", double1 == 3.83100800071655E22d);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        int int1 = org.apache.commons.math3.util.FastMath.round(35839.996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35840 + "'", int1 == 35840);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-2.68435408E8f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.68435408E8f + "'", float1 == 2.68435408E8f);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1932800507380152d + "'", double1 == 2.1932800507380152d);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.5796341894982169d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.017452669828398083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745444215495065d + "'", double1 == 0.01745444215495065d);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.032154967811066235d), 8.87638363640206d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03215496781106623d) + "'", double2 == (-0.03215496781106623d));
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        int int2 = org.apache.commons.math3.util.FastMath.min((-19), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19) + "'", int2 == (-19));
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(7.151039979174052E54d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.92659192354110566E18d + "'", double1 == 1.92659192354110566E18d);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.8E-45f, (-511));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-2.68435424E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6843542399999997E8d) + "'", double1 == (-2.6843542399999997E8d));
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.68435408E8f, 78.75051396768342d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.68435392E8f + "'", float2 == 2.68435392E8f);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9738830555738022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22904770395268184d + "'", double1 == 0.22904770395268184d);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9780821240516806d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-40.999996f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-41L) + "'", long1 == (-41L));
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.4382762607469872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4382762607469874d + "'", double1 == 1.4382762607469874d);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-3.1362673894330163E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.136267338018237E-4d) + "'", double1 == (-3.136267338018237E-4d));
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.849105967630261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2529398612261406d + "'", double1 == 1.2529398612261406d);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(127.000015f, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.00001f + "'", float2 == 127.00001f);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-10));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.02711357689300422d, (-0.9999999979388464d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999979388464d) + "'", double2 == (-0.9999999979388464d));
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483647L, (long) (-40));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 68);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 68.0f + "'", float1 == 68.0f);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-2.723903237213851E155d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7634102635436893E139d + "'", double1 == 4.7634102635436893E139d);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.3642422E-12f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.3642422E-12f + "'", float1 == 1.3642422E-12f);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.7711415651109443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6646746123825353d + "'", double1 == 1.6646746123825353d);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        long long2 = org.apache.commons.math3.util.FastMath.max(6208L, (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6208L + "'", long2 == 6208L);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.639057329615259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.8026817217694402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.551874396886614d) + "'", double1 == (-0.551874396886614d));
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(10239.999f, (float) 45);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10239.999f + "'", float2 == 10239.999f);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 512L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2709183367248988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.8443635619146716E-5d, 0.17540341900446973d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.761840941435124E-4d + "'", double2 == 2.761840941435124E-4d);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.3619730303123131d, (-4.3706546600041213E-8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796447540209d + "'", double2 == 1.570796447540209d);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 2.4414065E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5505064009954972d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.504749933725006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1459212620093018d + "'", double1 == 1.1459212620093018d);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(221206.90696257527d, 3.616243728115757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 221206.90696257525d + "'", double2 == 221206.90696257525d);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9074467814501962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9526000112587634d + "'", double1 == 0.9526000112587634d);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.0017406711789691592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017391579666414208d + "'", double1 == 0.0017391579666414208d);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 12, (-2401L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        float float2 = org.apache.commons.math3.util.FastMath.min(320.0f, 1.3642423E-12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3642423E-12f + "'", float2 == 1.3642423E-12f);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.3698290846768875E30d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-40.07963789922157d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.27097094748400474d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.192093E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.192093E-7f + "'", float1 == 1.192093E-7f);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.028848784397557E-44d) + "'", double1 == (-8.028848784397557E-44d));
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 87L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9395192526186185d + "'", double1 == 1.9395192526186185d);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        float float1 = org.apache.commons.math3.util.FastMath.signum(32768.004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.1948839253625035d, 2.4898763788476926E153d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4898763788476926E153d + "'", double2 == 2.4898763788476926E153d);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(32.000003814697266d, (-0.008837862706914782d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.571072509964542d + "'", double2 == 1.571072509964542d);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        double double1 = org.apache.commons.math3.util.FastMath.asin(5.815082611411228d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(13.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1.71798692E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        double double1 = org.apache.commons.math3.util.FastMath.cos(14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5366892736837541d) + "'", double1 == (-0.5366892736837541d));
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(16.0f, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5353012E30f + "'", float2 == 2.5353012E30f);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1087.5625210660835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62312.742413694265d + "'", double1 == 62312.742413694265d);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(47.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        double double1 = org.apache.commons.math3.util.FastMath.exp(50.416784829666135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.865592573631599E21d + "'", double1 == 7.865592573631599E21d);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.311231547115194E15d + "'", double1 == 4.311231547115194E15d);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(8.429369702178828E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004384617376208492d + "'", double1 == 0.004384617376208492d);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.271066547867196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.150725351665727d + "'", double1 == 13.150725351665727d);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0232274785475504d, (-1.8855630621884312d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9576279173168242d + "'", double2 == 0.9576279173168242d);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.25301447720775033d, (-0.6839128558975155d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25301447720775033d + "'", double2 == 0.25301447720775033d);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9912174443839007d, (double) (-5.999999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.081323916546467d + "'", double2 == 6.081323916546467d);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1353352832366127d + "'", double1 == 0.1353352832366127d);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.8369630128952054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.684197121245287d + "'", double1 == 0.684197121245287d);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 57.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.736121559693738d + "'", double1 == 4.736121559693738d);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.06977848420636461d, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.297793657478942E-16d + "'", double2 == 9.297793657478942E-16d);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 41, 32768.008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-24.611645180793627d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5740181068107043d + "'", double1 == 0.5740181068107043d);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.831008000716549E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.162447350492738d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 6208L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 0.99999994f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.452669847162036E-4d + "'", double1 == 3.452669847162036E-4d);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(7.1054274E-15f, 0.7772183518530855d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.105428E-15f + "'", float2 == 7.105428E-15f);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.48865461858873344d, (-1.5881530833912738d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.48865461858873344d) + "'", double2 == (-0.48865461858873344d));
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        double double1 = org.apache.commons.math3.util.FastMath.signum(8886102.046056483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 35840);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35840L + "'", long1 == 35840L);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.17540341900446973d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.049875621120892d) + "'", double1 == (-10.049875621120892d));
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        float float2 = org.apache.commons.math3.util.FastMath.min(200.0f, 61.000008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 61.000008f + "'", float2 == 61.000008f);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8601661668175334d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 1024L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.5424980429823686E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.8184464592320668d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3593642103115025d) + "'", double1 == (-1.3593642103115025d));
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9287117556395867d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(99.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2882925373199d + "'", double1 == 5.2882925373199d);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-4.274718314790358d), 28.59329174674238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.911062754335582d + "'", double2 == 28.911062754335582d);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.8203867151263053d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.3880595140739382d, 1.1449205926874495d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3880595140739382d + "'", double2 == 0.3880595140739382d);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        long long2 = org.apache.commons.math3.util.FastMath.min(188090948814L, (long) (-43));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-43L) + "'", long2 == (-43L));
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-46));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.384185791015625E-7d, (-0.5688922622699d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5688922622699499d + "'", double2 == 0.5688922622699499d);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1024L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.99999994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.08942837070713458d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08942837070713458d + "'", double2 == 0.08942837070713458d);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28366218546322625d + "'", double1 == 0.28366218546322625d);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2388667589823472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2388667589823474d + "'", double1 == 1.2388667589823474d);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(48.499996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.49999618530274d + "'", double1 == 48.49999618530274d);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-7.9999995f), (-0.8203867151263053d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.999999f) + "'", float2 == (-7.999999f));
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.046457816219764414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5243217824499564d + "'", double1 == 1.5243217824499564d);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.6166163396713061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.66443743043271d + "'", double1 == 0.66443743043271d);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.99998113349351d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.737545114640002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(8.66334748188207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999402769512d + "'", double1 == 0.9999999402769512d);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.3733969509475266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3733969509475268d + "'", double1 == 1.3733969509475268d);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9636420976395077d, 2.337626812764623E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.337626812764623E-12d + "'", double2 == 2.337626812764623E-12d);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.2755538279996634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874144594285d + "'", double1 == 1.5604874144594285d);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 9.094948E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.688727508824753E-5d + "'", double1 == 9.688727508824753E-5d);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.004415935682487392d, (double) 9.094948E-13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326588939d + "'", double2 == 1.570796326588939d);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(25.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9116227652145885d + "'", double1 == 3.9116227652145885d);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 87.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        int int2 = org.apache.commons.math3.util.FastMath.min(101, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-2.0f), 96.99999237060547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-42.999996f), 97.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42.999996f + "'", float2 == 42.999996f);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 23L, (float) (-4L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.031087507813438716d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031097528290505033d) + "'", double1 == (-0.031097528290505033d));
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.4210856E-14f, 4.60497014597542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0859823101541017E-15d + "'", double2 == 3.0859823101541017E-15d);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(233472.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 233472.02f + "'", float1 == 233472.02f);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0277272261966697E-6d + "'", double1 == 3.0277272261966697E-6d);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8601661668175334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8601661668175334d + "'", double1 == 0.8601661668175334d);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 87L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 87.0f + "'", float2 == 87.0f);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.227466811481334E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.227466811481334E-9d + "'", double1 == 8.227466811481334E-9d);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.554368000990087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997786354150009d + "'", double1 == 0.9997786354150009d);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.046457830652862575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5381057602120832d) + "'", double1 == (-0.5381057602120832d));
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-40.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7451131604793488d) + "'", double1 == (-0.7451131604793488d));
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6090128311061331d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37089662845190746d + "'", double2 == 0.37089662845190746d);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        float float2 = org.apache.commons.math3.util.FastMath.min((-57.0f), 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-57.0f) + "'", float2 == (-57.0f));
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2048.500122040519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.753071857112715d + "'", double1 == 35.753071857112715d);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9988315234449244d, 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8620144121560452d + "'", double2 == 0.8620144121560452d);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 35, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.3012989023072965d, (-0.43480940134145385d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43480940134145385d) + "'", double2 == (-0.43480940134145385d));
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.264803107213601E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2648031072136012E-4d + "'", double1 == 1.2648031072136012E-4d);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(10.000000381469718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999995877696d + "'", double1 == 0.999999995877696d);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.4990470760470123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0232274263581917d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.4990470760470123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6931520947921855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012097786271219478d + "'", double1 == 0.012097786271219478d);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.701561928800418E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.6193427181221283d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6193427181221283d) + "'", double2 == (-1.6193427181221283d));
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.4414065E-4f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.882813E-4f + "'", float2 == 4.882813E-4f);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 4503599627370496L, (-0.0036934004848983132d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.50359936E15f + "'", float2 == 4.50359936E15f);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7336545584598234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 46.999992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12358069366042898d + "'", double1 == 0.12358069366042898d);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.999999999999998d, 1.5707963150940687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999981d + "'", double2 == 0.9999999999999981d);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.8632392928434405d, 0.08276253029821971d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08276253029821971d + "'", double2 == 0.08276253029821971d);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(48.5f, 0.4402805101795452d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.499996f + "'", float2 == 48.499996f);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        double double1 = org.apache.commons.math3.util.FastMath.abs(57.336116942011905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.336116942011905d + "'", double1 == 57.336116942011905d);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.4475662160204272d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7649254293983021d) + "'", double1 == (-0.7649254293983021d));
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0014614065750416256d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.5553480614894135d, 1.0001726483883735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.555348061489413d + "'", double2 == 3.555348061489413d);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 6208.00048828125d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 14.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        long long2 = org.apache.commons.math3.util.FastMath.min(212L, 2560L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 212L + "'", long2 == 212L);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(75.04851188756716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4299.962989894985d + "'", double1 == 4299.962989894985d);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.004921526865299477d), 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.8873491301707162E-12d) + "'", double2 == (-2.8873491301707162E-12d));
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 6.4851829E18f, (-56.72239180482502d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.4851829136577004E18d + "'", double2 == 6.4851829136577004E18d);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        float float2 = org.apache.commons.math3.util.FastMath.min(96.99998f, (float) 62L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 62.0f + "'", float2 == 62.0f);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.35251342178425454d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(57.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.000004f + "'", float1 == 57.000004f);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-64));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 64L + "'", long1 == 64L);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(43.0f, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42.999996f + "'", float2 == 42.999996f);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141247386605077d + "'", double1 == 3.141247386605077d);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.07573419573678206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07558989659224725d + "'", double1 == 0.07558989659224725d);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.0505424149115388E-232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.930495410524605d, 61.48000813767197d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.899985472938766E51d + "'", double2 == 4.899985472938766E51d);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.017947881070324214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017948844791185976d + "'", double1 == 0.017948844791185976d);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.43597363E10f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.236696324052198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.15325942061648d + "'", double1 == 128.15325942061648d);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.9999999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.849105967630261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6147022615417284d + "'", double1 == 0.6147022615417284d);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.421011E-20f, 1024.0001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.421011E-20f + "'", float2 == 5.421011E-20f);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.8146972656527556E-6d, 262.6992857325621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8146972656527556E-6d + "'", double2 == 3.8146972656527556E-6d);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.600444344825681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (byte) 1, (double) 1.1920933E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 2.8E-45f, 89.00080483214516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.802596928649634E-45d + "'", double2 == 2.802596928649634E-45d);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        int int2 = org.apache.commons.math3.util.FastMath.max(1024, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.00390625f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0f, (-0.07813771351531074d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        int int1 = org.apache.commons.math3.util.FastMath.round((-200.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-200) + "'", int1 == (-200));
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2560L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2560.0002f + "'", float1 == 2560.0002f);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        double double1 = org.apache.commons.math3.util.FastMath.asin(35.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.431220880786615d + "'", double1 == 0.431220880786615d);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(268.5850815956288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 268.5850815956289d + "'", double1 == 268.5850815956289d);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.126011262856224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.083333333333333d + "'", double1 == 3.083333333333333d);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52, (-46.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-50.416784829666135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9327962868157996E21d + "'", double1 == 3.9327962868157996E21d);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2532929441698648d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2532929441698648d + "'", double2 == 1.2532929441698648d);
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.8855630621884312d), 0.2981479726743438d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.885563062188431d) + "'", double2 == (-1.885563062188431d));
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1251345322701862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8093474830565534d + "'", double1 == 0.8093474830565534d);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(93.91751797698988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        double double2 = org.apache.commons.math3.util.FastMath.max(8.042848410283348d, 3.9327962868157996E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9327962868157996E21d + "'", double2 == 3.9327962868157996E21d);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.25215889490171217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29056474991251774d) + "'", double1 == (-0.29056474991251774d));
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(128.15325942061648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 129.0d + "'", double1 == 129.0d);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(6.657902503559762E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697138635589E-6d + "'", double1 == 3.814697138635589E-6d);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8342244122679194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6717524212136611d + "'", double1 == 0.6717524212136611d);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 6400.0005f, (-0.08869752394637864d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6400.00048828125d) + "'", double2 == (-6400.00048828125d));
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.40737488E14f, 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.9999999999999998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03490658503988659d) + "'", double1 == (-0.03490658503988659d));
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (byte) 100, (-23));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-5f + "'", float2 == 1.1920929E-5f);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5845633E30f + "'", float2 == 1.5845633E30f);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        int int2 = org.apache.commons.math3.util.FastMath.max(12, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.6668288393884205d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.5649493574615367d, 5.575406590848711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5649493574615367d + "'", double2 == 2.5649493574615367d);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.9999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.9999998f + "'", float1 == 2.9999998f);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9912174443839006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6887462327720729d + "'", double1 == 0.6887462327720729d);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.3283067E-10f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.2951129234784172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2585978909470706d + "'", double1 == 0.2585978909470706d);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 23L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 23.0f + "'", float1 == 23.0f);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.7686346899325218d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6.4851835E18f, 4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.4851835E18f + "'", float2 == 6.4851835E18f);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 35840L, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(13.000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        double double1 = org.apache.commons.math3.util.FastMath.rint(6.5375054863290842E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.5375054863290842E17d + "'", double1 == 6.5375054863290842E17d);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-2.5343896302784006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.374455756373859d, (double) (-64));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1201200831337323d + "'", double2 == 3.1201200831337323d);
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6487212707001282d + "'", double1 == 1.6487212707001282d);
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0571243112754385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 87L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        double double1 = org.apache.commons.math3.util.FastMath.cos(365942.161553766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9997002410546625d) + "'", double1 == (-0.9997002410546625d));
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0452982054695486E-58d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1888248625213111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.793899839915711d + "'", double1 == 1.793899839915711d);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.02857142857142857d), (-0.6553210298687463d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02857142857142857d) + "'", double2 == (-0.02857142857142857d));
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 212.00002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.962732100800401d + "'", double1 == 5.962732100800401d);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.630771320682699E-207d, (double) 1.1920933E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.630771320682699E-207d + "'", double2 == 4.630771320682699E-207d);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-46.999992f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        int int2 = org.apache.commons.math3.util.FastMath.min(32, 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 655360);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.392939981953171d + "'", double1 == 13.392939981953171d);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999925494195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.4414065E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414065E-4f + "'", float1 == 2.4414065E-4f);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 41, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        int int1 = org.apache.commons.math3.util.FastMath.abs(46);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 6.4851829E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.31605169691615d + "'", double1 == 43.31605169691615d);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.37245959530521877d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0001726483883735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.30567153707586d + "'", double1 == 57.30567153707586d);
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.3841855067986212E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3841855067985987E-7d + "'", double1 == 2.3841855067985987E-7d);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        double double2 = org.apache.commons.math3.util.FastMath.log(71.55417527999327d, 402.6643192868472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4045584037867593d + "'", double2 == 1.4045584037867593d);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6441739259957566d, 48.49999618530274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.52785733857724d + "'", double2 == 48.52785733857724d);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.540302305868138d, 0.027705374906466698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9830884707081561d + "'", double2 == 0.9830884707081561d);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 8L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.000001f + "'", float1 == 8.000001f);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        int int1 = org.apache.commons.math3.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        long long2 = org.apache.commons.math3.util.FastMath.min(87L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.5273472658386653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2779033013539853d) + "'", double1 == (-0.2779033013539853d));
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        double double1 = org.apache.commons.math3.util.FastMath.abs(11.236841232438037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.236841232438037d + "'", double1 == 11.236841232438037d);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.7669541186975022d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.1932800507380152d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 51.999992f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.1920933E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.11638109333444258d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.431220880786615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5391354778687696d + "'", double1 == 1.5391354778687696d);
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        double double1 = org.apache.commons.math3.util.FastMath.atan(824.324737255184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5695832132435776d + "'", double1 == 1.5695832132435776d);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.126011262856224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05154273454005702d + "'", double1 == 0.05154273454005702d);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.7564161665363514d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.63523341108007d) + "'", double1 == (-100.63523341108007d));
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9830884707081561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9943307438415052d + "'", double1 == 0.9943307438415052d);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-2025.4348094013412d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.472484930606858E170d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9073486E-6f, (double) 0.0625f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073489E-6f + "'", float2 == 1.9073489E-6f);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32768L, 1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32767.998f + "'", float2 == 32767.998f);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.085536923187668d + "'", double1 == 19.085536923187668d);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.7592186E13f, (-1.9999999f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.7592186E13f + "'", float2 == 1.7592186E13f);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(23.004963541505774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.32706384001122574d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        double double1 = org.apache.commons.math3.util.FastMath.floor(8.429369702178807E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        long long2 = org.apache.commons.math3.util.FastMath.max(23L, 19121396171L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19121396171L + "'", long2 == 19121396171L);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.92659192354110566E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.92659192354110566E18d + "'", double1 == 1.92659192354110566E18d);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.290822861412639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.883066730425028d + "'", double1 == 8.883066730425028d);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.6508453542261259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028812686872497984d + "'", double1 == 0.028812686872497984d);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(128.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.770311529081762E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5872715855281858E36d + "'", double1 == 1.5872715855281858E36d);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        double double1 = org.apache.commons.math3.util.FastMath.log10(6.905339522827515E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.160814963100496d) + "'", double1 == (-3.160814963100496d));
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(155.29174634533626d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.0678195859292554E40d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.3999655238984033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41071505488599364d + "'", double1 == 0.41071505488599364d);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-7L), (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.1832315E-12f) + "'", float2 == (-3.1832315E-12f));
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-5.4210105393100954E-20d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-65) + "'", int1 == (-65));
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.8146899896673862E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.0927532476461188d), 2.2165681500327987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0927532476461188d) + "'", double2 == (-0.0927532476461188d));
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.311231863899687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5747478070839012d + "'", double1 == 1.5747478070839012d);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.6405261402250986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 93.99522401578521d + "'", double1 == 93.99522401578521d);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(5557.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.315960845744076d + "'", double1 == 9.315960845744076d);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.6197751905438615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.40064126793296d) + "'", double1 == (-20.40064126793296d));
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-13.854098251843308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999981486d) + "'", double1 == (-0.9999999999981486d));
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.31544313338951296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31544313338951296d + "'", double1 == 0.31544313338951296d);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 4.5474746E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.7621186826519104d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 451.10238275888906d + "'", double2 == 451.10238275888906d);
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-4503599627370496L), 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.0071993E15f) + "'", float2 == (-9.0071993E15f));
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9228674459840319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        double double1 = org.apache.commons.math3.util.FastMath.exp(28.28673724526161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9265216621674575E12d + "'", double1 == 1.9265216621674575E12d);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-23.0f), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(4.899985472938766E51d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 10240L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10240.0d + "'", double1 == 10240.0d);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.02460092029573991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.293670581813586E-4d + "'", double1 == 4.293670581813586E-4d);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.718281954078841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        float float2 = org.apache.commons.math3.util.FastMath.min(51.999996f, 1.0000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.09271474921759197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0924500000709567d + "'", double1 == 0.0924500000709567d);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.33289488384E12d, 0.31036104568165535d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948035d + "'", double2 == 1.5707963267948035d);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(4.547474593066815E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.743496565630337E-7d + "'", double1 == 6.743496565630337E-7d);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000000000727596d, 4.736121492758925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000727598d + "'", double2 == 1.0000000000727598d);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        float float2 = org.apache.commons.math3.util.FastMath.min((-10.0f), (-1.0000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.533131499423351d, 2.3120848586373612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.230650044924111d + "'", double2 == 1.230650044924111d);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 5L, 3.6654455286575885E148d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0000005f + "'", float2 == 5.0000005f);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.25215889490171217d), 1.6197751905438615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25215889490171217d) + "'", double2 == (-0.25215889490171217d));
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9921955351779619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        int int2 = org.apache.commons.math3.util.FastMath.max(4096, (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        double double1 = org.apache.commons.math3.util.FastMath.log10(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3010299956639813d + "'", double1 == 2.3010299956639813d);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.16609967099985212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0028989861454267614d + "'", double1 == 0.0028989861454267614d);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8813616205677707d, (-0.025974927644697554d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8813616205677707d + "'", double2 == 0.8813616205677707d);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.9999998f), 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.50359882E15f) + "'", float2 == (-4.50359882E15f));
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 32768.008f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(97.00337450631281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(7.957135859585879d, 4.72097405257708E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6854860397383982E-23d + "'", double2 == 1.6854860397383982E-23d);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 128.0f, 1.4557962137284877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4557962137284877d + "'", double2 == 1.4557962137284877d);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 1.3642423E-12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.812402071214698d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.08444504313177d + "'", double2 == 42.08444504313177d);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2422869359501354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.15748111057722322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15748111057722322d + "'", double1 == 0.15748111057722322d);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        double double1 = org.apache.commons.math3.util.FastMath.signum(5.071208929787076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3580.423852010498d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        float float2 = org.apache.commons.math3.util.FastMath.max(75.0f, (-8191.9995f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.0f + "'", float2 == 75.0f);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 2.68435408E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.0859823101541017E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7681376202386184E-13d + "'", double1 == 1.7681376202386184E-13d);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-64));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5551725981744198d) + "'", double1 == (-1.5551725981744198d));
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32768L, 4.1661186E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.77404314254283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.66662102809951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.726104507534205d) + "'", double1 == (-0.726104507534205d));
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.570796326793987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0994376074027013E12d + "'", double1 == 1.0994376074027013E12d);
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 45L, (-0.42883146644423187d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02730397664434614d) + "'", double2 == (-0.02730397664434614d));
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.6094364176369577E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7692616088541462d + "'", double1 == 0.7692616088541462d);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.2550831292576428d, 0.027235643304099708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027235643304099708d + "'", double2 == 0.027235643304099708d);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.20962587148475365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21119231414061537d + "'", double1 == 0.21119231414061537d);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.2678316663569955d, (-19));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.945333725863183E-14d + "'", double2 == 1.945333725863183E-14d);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.675103092651911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6751030926519112d + "'", double1 == 0.6751030926519112d);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        double double1 = org.apache.commons.math3.util.FastMath.exp(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.00027467077621d, (double) 0.013916016f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.00027467077621d + "'", double2 == 1.00027467077621d);
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7654351309956355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9578169874281d + "'", double1 == 572.9578169874281d);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.3866586828239366d, 0.25398147417648104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25398147417648104d + "'", double2 == 0.25398147417648104d);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(13.532970926169133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 775.3821183427401d + "'", double1 == 775.3821183427401d);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-41L), 3.146668361052285E-15d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.999996f) + "'", float2 == (-40.999996f));
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-18L), 4.1661186E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-18.0f) + "'", float2 == (-18.0f));
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 3.33289488E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8828125E-4d + "'", double1 == 4.8828125E-4d);
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8601661668175334d, (double) (-8.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.046109981508927d + "'", double2 == 8.046109981508927d);
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.8446744073709552E19d), (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.191809349008403E-193d + "'", double2 == 2.191809349008403E-193d);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        long long1 = org.apache.commons.math3.util.FastMath.abs(5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.9184614E21f), 46.999992f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.999992f + "'", float2 == 46.999992f);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 52.0f, 143);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4461221473323677E245d + "'", double2 == 2.4461221473323677E245d);
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7805758055913187d, 0.5206304090742055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7805758055913186d + "'", double2 == 0.7805758055913186d);
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0f), 3.9512438653005417d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.8344648652598696d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(51.999992f, 1023.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.999992f + "'", float2 == 51.999992f);
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 212);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.375283914348145d, (-0.9999515809042512d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9692587070146972d + "'", double2 == 1.9692587070146972d);
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 51.999992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.951243571862291d + "'", double1 == 3.951243571862291d);
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.6690316852237952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6690316852237953d + "'", double1 == 0.6690316852237953d);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5012874926078866d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5012874926078866d + "'", double2 == 0.5012874926078866d);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.304165199749413E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.1127192427669E-13d + "'", double1 == 9.1127192427669E-13d);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(57.30567153707586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001726483883735d + "'", double1 == 1.0001726483883735d);
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1024, (-1.5707437519090326d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.99994f + "'", float2 == 1023.99994f);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.999999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.1623327810976913d, 1.3733969509475266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1623327810976913d + "'", double2 == 1.1623327810976913d);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-23));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-22.999998f) + "'", float1 == (-22.999998f));
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        float float2 = org.apache.commons.math3.util.FastMath.max(15.0f, (-10.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(41.0f, (-45.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-41.0f) + "'", float2 == (-41.0f));
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-40) + "'", int1 == (-40));
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 5.8546799E16f, 451.10238275888906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 451.10238275888906d + "'", double2 == 451.10238275888906d);
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02722891101406463d + "'", double1 == 0.02722891101406463d);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9285393776488637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.20138745098397d + "'", double1 == 53.20138745098397d);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.3841855067986212E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3841855067986665E-7d + "'", double1 == 2.3841855067986665E-7d);
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.0f), 1.364242E-12f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.364242E-12f + "'", float2 == 1.364242E-12f);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        double double1 = org.apache.commons.math3.util.FastMath.cos(53.59817606757715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9817957145754773d) + "'", double1 == (-0.9817957145754773d));
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.6764125919282525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3136772638949124d + "'", double1 == 2.3136772638949124d);
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        double double2 = org.apache.commons.math3.util.FastMath.max(35.753071857112715d, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000001d + "'", double2 == 100.00000000000001d);
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.6849051369068575d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0532308853238453E27d + "'", double2 == 1.0532308853238453E27d);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 2.4414065E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4414065167851037E-4d + "'", double1 == 2.4414065167851037E-4d);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        int int1 = org.apache.commons.math3.util.FastMath.abs(127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        double double1 = org.apache.commons.math3.util.FastMath.asin(89.00080483214516d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1024L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15853338004399595d) + "'", double1 == (-0.15853338004399595d));
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9604221081779567E-308d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        double double1 = org.apache.commons.math3.util.FastMath.rint(11.536651757164861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.6673940248314076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09644754073458855d) + "'", double1 == (-0.09644754073458855d));
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6931472401645883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000001192092896d + "'", double1 == 2.0000001192092896d);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.192093E-7f, 63.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.192093E-7f + "'", float2 == 1.192093E-7f);
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1023.0f, 3.814697265671259E-6d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1022.99994f + "'", float2 == 1022.99994f);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        int int1 = org.apache.commons.math3.util.FastMath.abs(68);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 68 + "'", int1 == 68);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        int int2 = org.apache.commons.math3.util.FastMath.max((-8), (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-65), (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-65L) + "'", long2 == (-65L));
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        int int2 = org.apache.commons.math3.util.FastMath.min(15, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-4.5035996E15f), (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.452669727114854E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-32.57791748631743d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(6.135079543932437E113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.421011E-20f + "'", float1 == 5.421011E-20f);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.6469779601696886E-23d, (double) 75L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 68);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        double double1 = org.apache.commons.math3.util.FastMath.atan(16.887228676022904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5116490496640975d + "'", double1 == 1.5116490496640975d);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-8192.0f), 0.7601702599438814d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6144540405395877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7055693934522876d + "'", double1 == 0.7055693934522876d);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.547475E-13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(15.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        long long2 = org.apache.commons.math3.util.FastMath.min(41L, 17L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(10239.999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.765625E-4f + "'", float1 == 9.765625E-4f);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 12L, 89.00080483214516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.806363797662987d + "'", double2 == 1.806363797662987d);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.236696324052198d, (-0.4800568960210344d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 18L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6751030926519112d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6751030926519112d + "'", double2 == 0.6751030926519112d);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0994376074027013E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10321.041622256667d + "'", double1 == 10321.041622256667d);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.337626812764623E-12d, 7.124936073533697E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.280909173975576E-55d + "'", double2 == 3.280909173975576E-55d);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9992781084116672d, 37648.55483291215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9992781084116672d + "'", double2 == 0.9992781084116672d);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        double double1 = org.apache.commons.math3.util.FastMath.signum(34.999996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5395564877821442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.662521926913489d + "'", double1 == 4.662521926913489d);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.9999961853027344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(8.372274544049185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998931032008d + "'", double1 == 0.9999998931032008d);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(511.00003f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6.8719477E10f, (-0.7091551466656096d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.8719473E10f + "'", float2 == 6.8719473E10f);
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 35.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710665478671954d + "'", double1 == 3.2710665478671954d);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6673940248314076d, 0.9115170270339398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5936451933731657d + "'", double2 == 1.5936451933731657d);
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 212);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(41.0f, (-45));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1652901E-12f + "'", float2 == 1.1652901E-12f);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.1469512391741817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0025647829634751437d) + "'", double1 == (-0.0025647829634751437d));
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        float float2 = org.apache.commons.math3.util.FastMath.max(510.99997f, (-42.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 510.99997f + "'", float2 == 510.99997f);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        double double1 = org.apache.commons.math3.util.FastMath.asin(12.810233304022598d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.4657359027997265d, 57.30442320325666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.30442320325666d + "'", double2 == 57.30442320325666d);
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.9073485E-6f, (float) 212);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073485E-6f + "'", float2 == 1.9073485E-6f);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-6.4851835E18f), 221206.90696257525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.4851834634135142E18d + "'", double2 == 6.4851834634135142E18d);
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.5803725126501968E17d, (-0.7218595826821476d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7218595826821476d) + "'", double2 == (-0.7218595826821476d));
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 343.4678242590538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 127L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        int int2 = org.apache.commons.math3.util.FastMath.max((-19), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        long long1 = org.apache.commons.math3.util.FastMath.round(13.532970926169133d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 655359.9f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9912174443839007d, 1.1097402702744097d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11.80386248573483d) + "'", double2 == (-11.80386248573483d));
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-2.067786496795693E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.067786496795693E-15d) + "'", double1 == (-2.067786496795693E-15d));
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.827590827657173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.363762072491844d + "'", double1 == 1.363762072491844d);
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(100.00000762939452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440688253002766E43d + "'", double1 == 1.3440688253002766E43d);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.461594994075238E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002908882086657216d + "'", double1 == 0.002908882086657216d);
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.10411460403768223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-46));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.32580079669902784d, 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.946319091736439E-8d + "'", double2 == 4.946319091736439E-8d);
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) ' ', (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0204957449291814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020288533664930875d + "'", double1 == 0.020288533664930875d);
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(35.00000762939454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.000007629394545d + "'", double1 == 35.000007629394545d);
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 87L, (-20));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.2969666E-5f + "'", float2 == 8.2969666E-5f);
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.6672894683293485d), 0.9999999402769512d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3327104719476026d + "'", double2 == 0.3327104719476026d);
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(7.124936073533697E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.124936073533697E42d + "'", double1 == 7.124936073533697E42d);
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6779492465849286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.509178478658057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1915519518391806d + "'", double1 == 1.1915519518391806d);
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-35L), (-0.008798923595576503d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-34.999996f) + "'", float2 == (-34.999996f));
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(6.611939562281496E10d, 8.046109981508927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326673206d + "'", double2 == 1.570796326673206d);
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        double double1 = org.apache.commons.math3.util.FastMath.log(10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3548026956597936d + "'", double1 == 2.3548026956597936d);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.311231683859136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        double double1 = org.apache.commons.math3.util.FastMath.log10(6.743496565630337E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.171114859339684d) + "'", double1 == (-6.171114859339684d));
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.09966865249116201d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(29.5761829363623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.0d + "'", double1 == 30.0d);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.07336779761599267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-10.000000953674316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.000000953674315d) + "'", double1 == (-10.000000953674315d));
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-2.8873491301707162E-12d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0389678347315804E-28d + "'", double1 == 4.0389678347315804E-28d);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9989085983435377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0010919976689489374d) + "'", double1 == (-0.0010919976689489374d));
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0000000000727596d, (double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.287434785351853E10d + "'", double2 == 6.287434785351853E10d);
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 2, (-1022.9999389648438d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.0018939973054d + "'", double2 == 1023.0018939973054d);
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) -1, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        float float2 = org.apache.commons.math3.util.FastMath.max(40.0f, 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.0f + "'", float2 == 40.0f);
    }
}

