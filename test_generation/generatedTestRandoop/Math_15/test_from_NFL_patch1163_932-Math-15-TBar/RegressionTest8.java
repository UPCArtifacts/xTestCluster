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
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7177382808046957d + "'", double1 == 2.7177382808046957d);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.2478137996138078d, 8.461594994075238E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.372274544049185d + "'", double2 == 8.372274544049185d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 320.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.585053606381854d + "'", double1 == 5.585053606381854d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double1 = org.apache.commons.math3.util.FastMath.log10(57.30442320325666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.758188145503637d + "'", double1 == 1.758188145503637d);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 4.5035996E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(84.73931296875567d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.25534195296645534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004456557797737148d + "'", double1 == 0.004456557797737148d);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6139677044391678d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.7336545584598331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9015205657400475d + "'", double1 == 0.9015205657400475d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.4546560101297226E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 262144.0d + "'", double1 == 262144.0d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0001015515136908d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.948148009134034E13d, (-0.12887618051864808d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481480091340336E13d + "'", double2 == 3.9481480091340336E13d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-4.5035996E15f), (double) (-4.9999995f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948977d) + "'", double2 == (-1.5707963267948977d));
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.0234375f), 5120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0234375f) + "'", float2 == (-0.0234375f));
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.064456315889266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4096.001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.001f + "'", float1 == 4096.001f);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.09254195563405843d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double1 = org.apache.commons.math3.util.FastMath.tan(74.20324596385817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5343896302784006d) + "'", double1 == (-2.5343896302784006d));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-24.191690961245197d), (double) 32768);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-41));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-40.999996f) + "'", float1 == (-40.999996f));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1368683772161603E-13d, 1.0000000002742861d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368683772161603E-13d + "'", double2 == 1.1368683772161603E-13d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-7.930067261567154E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2153.28968210235d + "'", double1 == 2153.28968210235d);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-35.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.792966096227409E-4d, (-0.6332359729824427d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1411515911684713d + "'", double2 == 3.1411515911684713d);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        double double1 = org.apache.commons.math3.util.FastMath.floor(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.8962960182679E13d + "'", double1 == 7.8962960182679E13d);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.080594601624405E-9d + "'", double1 == 2.080594601624405E-9d);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-63.999996f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.006257565908601255d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006257647585990107d) + "'", double1 == (-0.006257647585990107d));
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(8.429369702178828E-8d, 8.403887936206959E221d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.429369702178828E-8d + "'", double2 == 8.429369702178828E-8d);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double double1 = org.apache.commons.math3.util.FastMath.abs(184.91157758310626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 184.91157758310626d + "'", double1 == 184.91157758310626d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4245783453278988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0000001192092896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001192092898d + "'", double1 == 1.0000001192092898d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.499686190671499d + "'", double1 == 4.499686190671499d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        long long2 = org.apache.commons.math3.util.FastMath.max(57L, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9801475222605265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5200525368625861d + "'", double1 == 1.5200525368625861d);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2), (float) 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double1 = org.apache.commons.math3.util.FastMath.log10(58.99687729321487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.770829025028315d + "'", double1 == 1.770829025028315d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(4.60943642E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.74877907E11f + "'", float1 == 2.74877907E11f);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.808243886679093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0471240931949395d + "'", double1 == 2.0471240931949395d);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 1.5625f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999655856782489d + "'", double1 == 0.9999655856782489d);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.6870488395503531d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.328215999439508d + "'", double1 == 2.328215999439508d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.0593060930408005d), 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.019794456841902d + "'", double2 == 10.019794456841902d);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(31.999998f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        double double1 = org.apache.commons.math3.util.FastMath.log(10240.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.234056898593499d + "'", double1 == 9.234056898593499d);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-40.999996f), 3.744894366675417d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.999992f) + "'", float2 == (-40.999992f));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(48.50134311978857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2778.922261479758d + "'", double1 == 2778.922261479758d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.8596236973023724d), 1.9729356641052036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8596236973023723d) + "'", double2 == (-0.8596236973023723d));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.680043680710111d, 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.1752273075851822d, 3.9481480091340336E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481480091340336E13d + "'", double2 == 3.9481480091340336E13d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-2.6843544E8f), 44.742945770445154d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.03703703703703703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4313637641589874d) + "'", double1 == (-1.4313637641589874d));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1664.0d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0452982054695486E-58d + "'", double2 == 1.0452982054695486E-58d);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-40.999996f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.586013452313441E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.010200069899324196d, 97.00515450222218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.05149771824736E-4d + "'", double2 == 1.05149771824736E-4d);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math3.util.FastMath.abs(14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.703675447601967d + "'", double1 == 14.703675447601967d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1429.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        float float2 = org.apache.commons.math3.util.FastMath.max(35.000008f, (float) 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-1023.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        int int1 = org.apache.commons.math3.util.FastMath.round(24.249994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4.0000005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.59817606757715d + "'", double1 == 53.59817606757715d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(328280.6350011745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.9840077059649d + "'", double1 == 68.9840077059649d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        long long2 = org.apache.commons.math3.util.FastMath.max(2147483647L, (long) 511);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.5641241260040846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.533131499423351d + "'", double1 == 6.533131499423351d);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(97.00317877887012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267917496947436d + "'", double1 == 5.267917496947436d);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.598150033144236d + "'", double1 == 54.598150033144236d);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078964d) + "'", double1 == (-0.8414709848078964d));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.8742173026236352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9561803165529644d + "'", double1 == 0.9561803165529644d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9515334276328968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(7.990534932436728E-20d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.990534932436728E-20d + "'", double2 == 7.990534932436728E-20d);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        double double2 = org.apache.commons.math3.util.FastMath.min((-6.354130026164064d), 0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.354130026164064d) + "'", double2 == (-6.354130026164064d));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.0787619161000124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6405261402250986d + "'", double1 == 1.6405261402250986d);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.9673559108511897E64d, 511);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3188965091265011E218d + "'", double2 == 1.3188965091265011E218d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.7995660637267406d), (-41));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9615.492430918484d) + "'", double2 == (-9615.492430918484d));
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.7970546072131232d), (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.900062269423057d + "'", double2 == 3.900062269423057d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.03274454486619997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03221986513718908d + "'", double1 == 0.03221986513718908d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(20.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4258259770489514E8d + "'", double1 == 2.4258259770489514E8d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-45.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.2755538279996634d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.759258273186885E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.6332359729824426d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6332359729824425d) + "'", double1 == (-0.6332359729824425d));
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1), (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0957085725200884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5557.0d, 0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.000000066743d + "'", double2 == 5557.000000066743d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.575741909831946d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-3.6557203087106535E-15d), (-0.41032129904824216d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0688530993622138d, (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.566343246671086E-8d + "'", double2 == 6.566343246671086E-8d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math3.util.FastMath.atan(128.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5629839857347956d + "'", double1 == 1.5629839857347956d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.8202965860187448d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8202965860187448d + "'", double2 == 0.8202965860187448d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5295813285302078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.910352920567738d + "'", double1 == 0.910352920567738d);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-6.053272382793105d), 0.2533449363319665d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.058571630099851d + "'", double2 == 6.058571630099851d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        long long1 = org.apache.commons.math3.util.FastMath.round((-1.220703125E-4d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9689257325599362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7696171274276661d + "'", double1 == 0.7696171274276661d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6126152570659732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5538479001269114d, (-0.07074101207510715d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5538479001269114d) + "'", double2 == (-1.5538479001269114d));
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.49369669957632584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47556688642350203d + "'", double1 == 0.47556688642350203d);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.21619335216456886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21791392265914586d + "'", double1 == 0.21791392265914586d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(71.02915737294383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5199873736154695E30d + "'", double1 == 3.5199873736154695E30d);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 48.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.07141277342831d + "'", double1 == 5.07141277342831d);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.951243865300542d, 0.010200600563003249d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9512438653005417d + "'", double2 == 3.9512438653005417d);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 63, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 63L + "'", long2 == 63L);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.7292653317441247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.630098322598115d) + "'", double1 == (-0.630098322598115d));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.479213990324464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.479213990324464d + "'", double1 == 4.479213990324464d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.06901699391452681d, (-23));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.227466811481334E-9d + "'", double2 == 8.227466811481334E-9d);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.021044332826869627d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27608642547780293d) + "'", double1 == (-0.27608642547780293d));
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 127);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2560.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.540909679886578d + "'", double1 == 8.540909679886578d);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-2.9999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1449205926874493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8528601831630559d + "'", double1 == 0.8528601831630559d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.810249675906654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990439103118804d + "'", double1 == 0.9990439103118804d);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.2415914299460307E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-64));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.012412741725877353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0124900995473165d + "'", double1 == 1.0124900995473165d);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-127));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.0505424149115388E-232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0505424149115388E-232d + "'", double1 == 2.0505424149115388E-232d);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.00000000000004d + "'", double1 == 99.00000000000004d);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.010913332378127d + "'", double1 == 9.010913332378127d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.5409367175424972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6007036339115129d + "'", double1 == 0.6007036339115129d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.2478137996138078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25301447720775033d + "'", double1 == 0.25301447720775033d);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.00390625f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-100.0f), 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-200.0f) + "'", float2 == (-200.0f));
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(198.57204013738644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.4210856E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210856409267898E-14d + "'", double1 == 1.4210856409267898E-14d);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 17, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        int int2 = org.apache.commons.math3.util.FastMath.max((-18), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0000001f, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5036002E15f + "'", float2 == 4.5036002E15f);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 52, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.19486509830693569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.4475662160204272d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.2138714234833596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.21387142348336d + "'", double1 == 2.21387142348336d);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.9999995f), (-1.6090486460720004d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999993f) + "'", float2 == (-2.9999993f));
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9515334276328968d, 0.080371891003315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.74612251401343d + "'", double2 == 50.74612251401343d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.716558794242393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403215857277239d + "'", double1 == 0.5403215857277239d);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.8203432320660448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4402805101795452d + "'", double1 == 0.4402805101795452d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double double2 = org.apache.commons.math3.util.FastMath.log(53.0d, 28.28673724526161d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8418507049350537d + "'", double2 == 0.8418507049350537d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.6653951063773365E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.397321299277233E146d + "'", double1 == 6.397321299277233E146d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 8.0f, (double) (-3.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double1 = org.apache.commons.math3.util.FastMath.sin(9.234056898593499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18956693192887608d + "'", double1 == 0.18956693192887608d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.5707963267948977d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672745d) + "'", double1 == (-0.9171523356672745d));
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-13.85409825184331d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-793.7813587901935d) + "'", double1 == (-793.7813587901935d));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) (-43L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7451131604793488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9618775004334906d + "'", double1 == 0.9618775004334906d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        long long1 = org.apache.commons.math3.util.FastMath.abs(6L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.000000000007276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000024254d + "'", double1 == 1.0000000000024254d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.163604101989393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.163604101989394d + "'", double1 == 4.163604101989394d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.685889667019445E-5d) + "'", double1 == (-8.685889667019445E-5d));
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9515334276328968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.51884946898193d + "'", double1 == 54.51884946898193d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6067528124138599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8344648652598696d + "'", double1 == 1.8344648652598696d);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.6497827368478742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.806091022681604d + "'", double1 == 0.806091022681604d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 24);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(511.50081845742295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.930495410524605d + "'", double1 == 6.930495410524605d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.716558794242393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.765625E-4f, (float) 63);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 63.0f + "'", float2 == 63.0f);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.8632392928434405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3807463595665448d + "'", double1 == 1.3807463595665448d);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        double double2 = org.apache.commons.math3.util.FastMath.pow(512.0d, (-1.5424980429823686E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9990382024714676d + "'", double2 == 0.9990382024714676d);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        double double1 = org.apache.commons.math3.util.FastMath.exp(6.830189170012752E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000068302124958d + "'", double1 == 1.0000068302124958d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(342.7746908347008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6654455286575885E148d + "'", double1 == 3.6654455286575885E148d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(511.0f, 0.5d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 510.99997f + "'", float2 == 510.99997f);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8919599252153066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6278878161546924d + "'", double1 == 0.6278878161546924d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 8);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.251799813685248E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(37648.55483291208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.536076409331102d + "'", double1 == 10.536076409331102d);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.742001862925077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) ' ', (long) (-64));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9689257325599362d, 1833.464944418635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9689257325599362d + "'", double2 == 0.9689257325599362d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2147483648L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.898979485566356d + "'", double1 == 4.898979485566356d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-45), 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.4851835E18f) + "'", float2 == (-6.4851835E18f));
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.5705521861747473d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.499686190671499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.499686190671499d + "'", double1 == 4.499686190671499d);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.1920929E-7f, (float) 32768);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5000000000000001d + "'", double1 == 0.5000000000000001d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 6400.0f, (-1.6668288393884205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5710567687951624d + "'", double2 == 1.5710567687951624d);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.855938105439101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double2 = org.apache.commons.math3.util.FastMath.pow(18824.277429736758d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.312288897847933E-5d + "'", double2 == 5.312288897847933E-5d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.47556688642350203d, 32768);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-45.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.2912042544237448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8290775546364043d + "'", double1 == 0.8290775546364043d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1368683772161603E-13d, 17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.852647460508905E-221d + "'", double2 == 8.852647460508905E-221d);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2430665.0174340927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.703675859011925d + "'", double1 == 14.703675859011925d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.8805870712594983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988880079339814d + "'", double1 == 0.9988880079339814d);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9576594803233847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8511152085348412d) + "'", double1 == (-0.8511152085348412d));
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math3.util.FastMath.abs(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.99999999999999d + "'", double1 == 99.99999999999999d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5159112760417044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5159112760417044d + "'", double1 == 1.5159112760417044d);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.679522618351296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8236845783289657d + "'", double1 == 0.8236845783289657d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.2160804420868575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21280863569583866d + "'", double1 == 0.21280863569583866d);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.008837862706914782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008798923595576503d) + "'", double1 == (-0.008798923595576503d));
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(36.34183433862237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.285927376196905d + "'", double1 == 4.285927376196905d);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.27608642547780293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(48.499992f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.524157902758725E-4d + "'", double2 == 1.524157902758725E-4d);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9149994957367078d, 1.1742984407142925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9149994957367078d + "'", double2 == 0.9149994957367078d);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0874453647522562d, (double) 63.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.4223222493412d + "'", double2 == 49.4223222493412d);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-5.4210105393100954E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.018531076210112E-36d + "'", double1 == 6.018531076210112E-36d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.126011262856224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, 19121396171L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.0007355029325014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.352325827733839E-4d + "'", double1 == 7.352325827733839E-4d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        int int2 = org.apache.commons.math3.util.FastMath.max(10240, 143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.163604101989394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-97.00337450631281d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-10.0f), 0.8758186937926167d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9811077006099485d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9811077006099483d) + "'", double2 == (-0.9811077006099483d));
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.99999994f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4096.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4096.0d + "'", double1 == 4096.0d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.139425923696039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999976526417022d) + "'", double1 == (-0.9999976526417022d));
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-6L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double1 = org.apache.commons.math3.util.FastMath.cos(57.29577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336545584598234d + "'", double1 == 0.7336545584598234d);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7451131604793488d, 8.227466811481334E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.07804867017443E-10d + "'", double2 == 5.07804867017443E-10d);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        long long2 = org.apache.commons.math3.util.FastMath.max(100L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.0174532946005379d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5882505076133933d + "'", double1 == 1.5882505076133933d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double2 = org.apache.commons.math3.util.FastMath.pow(96.99999237060547d, (double) 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000324d + "'", double2 == 1.0000000000000324d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.948148009134034E13d, (-0.7686346899325218d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.542748765629085E-11d + "'", double2 == 3.542748765629085E-11d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1429.7186889891823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.95838028577866d + "'", double1 == 7.95838028577866d);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.08966792038047539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001565000444055422d + "'", double1 == 0.001565000444055422d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9947461586351523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9947461586351523d + "'", double1 == 0.9947461586351523d);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        long long2 = org.apache.commons.math3.util.FastMath.min((-10L), (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 23L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-13.85409825184331d), (-6.99094246966695d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-13.85409825184331d) + "'", double2 == (-13.85409825184331d));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.29180551394311227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.026048934789964995d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6104048481741295d) + "'", double1 == (-0.6104048481741295d));
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-10L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999958776927d) + "'", double1 == (-0.9999999958776927d));
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-0.99999994f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(13.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1, 1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9693810292091063d, 0.007174494246179776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.243059748365023E-4d + "'", double2 == 8.243059748365023E-4d);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2207031E-4f, 1.7724538509055159d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207033E-4f + "'", float2 == 1.2207033E-4f);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        int int2 = org.apache.commons.math3.util.FastMath.max(57, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.26765060022823E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(20.0f, 0.055192158084907385d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999998f + "'", float2 == 19.999998f);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10240, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.769163017341341E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.29174634533626d + "'", double1 == 155.29174634533626d);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.234375f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.234375f + "'", float1 == 0.234375f);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.8596236973023723d), 20.951580740511496d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8596236973023723d) + "'", double2 == (-0.8596236973023723d));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.331371450960497d, 200.5576604135868d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021593282575829296d + "'", double2 == 0.021593282575829296d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(33.08858916388626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.08858916388627d + "'", double1 == 33.08858916388627d);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 13.000001f, (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.000000953674316d + "'", double2 == 13.000000953674316d);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9320815615055481d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 10, (double) 40.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8414675156134572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414675156134573d + "'", double1 == 0.8414675156134573d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.7037660722156223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-0.0039062505f), 0.012696609983792819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2984702407800952d) + "'", double2 == (-0.2984702407800952d));
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.708420900134713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7084209001347133d + "'", double1 == 2.7084209001347133d);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.032426843737390965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3188855888203308d) + "'", double1 == (-0.3188855888203308d));
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.779595846079306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 320.0f, (-0.4821177017291658d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.061975901106484765d + "'", double2 == 0.061975901106484765d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.708420900134713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0055615162482d + "'", double1 == 14.0055615162482d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9947461586351523d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9791496723130869d + "'", double2 == 0.9791496723130869d);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.25132724169328774d), 0.25261234754667417d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.04647454434494028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046457816219764414d + "'", double1 == 0.046457816219764414d);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.4546560101297226E21d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.6764125919282526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011805626831096828d) + "'", double1 == (-0.011805626831096828d));
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.3589153218773263d), 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) '#', (float) 4503599627370496L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        long long2 = org.apache.commons.math3.util.FastMath.min(32L, (long) (-23));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23L) + "'", long2 == (-23L));
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        long long2 = org.apache.commons.math3.util.FastMath.max(61L, (-43L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61L + "'", long2 == 61L);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.30988320573923506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.102748784455539d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        double double1 = org.apache.commons.math3.util.FastMath.asin(5557.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.0741994506493335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1230445261115651d + "'", double1 == 1.1230445261115651d);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.8382668271306453E9d, 167.65805815345627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8382668271306453E9d + "'", double2 == 1.8382668271306453E9d);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.07466556700256388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.278021864198175d) + "'", double1 == (-4.278021864198175d));
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.005432722019315939d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 5120.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.36651292058166435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3068528194400547d) + "'", double1 == (-0.3068528194400547d));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.0f, (float) 2147483648L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0721086324294562E-4d, (-4.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0d) + "'", double2 == (-4.0d));
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.4968538574062324d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        long long1 = org.apache.commons.math3.util.FastMath.round(87.1653466182558d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 87L + "'", long1 == 87L);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.74877907E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32768.0f + "'", float1 == 32768.0f);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.289294390337419E-13d, 17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.630771320682699E-207d + "'", double2 == 4.630771320682699E-207d);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6090128311061331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7073506891130978d + "'", double1 == 0.7073506891130978d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-7.930067261567154E14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.5947194678480481d), 1.570796263574624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.594719467848048d) + "'", double2 == (-0.594719467848048d));
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.21387142348336d, 9.201788821823161E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2138716147160418d + "'", double2 == 2.2138716147160418d);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.6197751905438615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6197751905438618d + "'", double1 == 1.6197751905438618d);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 51.999992f, 74.54992027339121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 90.89383818121013d + "'", double2 == 90.89383818121013d);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        int int2 = org.apache.commons.math3.util.FastMath.min(32768, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9357051343132584d, 1.05149771824736E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706839518943791d + "'", double2 == 1.5706839518943791d);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 10240);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.715340932759254d + "'", double1 == 21.715340932759254d);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-46.999996f), 0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-46.999992f) + "'", float2 == (-46.999992f));
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.25534195296645534d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 100, 0.8202965860187448d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073485191268187E-6d + "'", double1 == 1.9073485191268187E-6d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.9985859267674833d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(48.499996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 48.5f + "'", float1 == 48.5f);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.4210856409267898E-14d, 24);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3841860752327193E-7d + "'", double2 == 2.3841860752327193E-7d);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.7170536970566798d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        float float1 = org.apache.commons.math3.util.FastMath.abs(127.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6400.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.117010721276371d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.145966026289347d, (double) 10240.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.092954545158424d + "'", double2 == 12.092954545158424d);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.11638109333444258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0067799268563065d + "'", double1 == 1.0067799268563065d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9801475222605265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6831713481231805d + "'", double1 == 0.6831713481231805d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.2981479726743438d), 23.004963541505774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2981479726743438d + "'", double2 == 0.2981479726743438d);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 5, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5507969934215662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.715226690089209d + "'", double1 == 4.715226690089209d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        float float1 = org.apache.commons.math3.util.FastMath.signum(61.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.04647454434494028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046457830652862575d + "'", double1 == 0.046457830652862575d);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.051204454117964975d, 17.863451288869854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.051204454117964975d + "'", double2 == 0.051204454117964975d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(33.08858916388627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1895.8365091329927d + "'", double1 == 1895.8365091329927d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(7.8962960182679E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.4917798526449118d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08276253029821971d + "'", double1 == 0.08276253029821971d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.930127763409804E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(103.00961449578338d, 5.026525795967933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 103.1321804295218d + "'", double2 == 103.1321804295218d);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.248291206950246d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-64), 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9.536744E-7f, 2048.500122040519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2048.500122040519d + "'", double2 == 2048.500122040519d);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.147483648E9d, 3.141592653577698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653577698d + "'", double2 == 3.141592653577698d);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.33289488E12f, (-6.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.33289488E12f) + "'", float2 == (-3.33289488E12f));
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5.916079783099615d, 1.5507969934215662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.749546042573087d + "'", double2 == 15.749546042573087d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.9999999999795215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.611645180793627d) + "'", double1 == (-24.611645180793627d));
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-0.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.8366804040972828d), 8.429369702178828E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8366804040972827d) + "'", double2 == (-0.8366804040972827d));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.04669075745245177d, (-6.053272382793105d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04669075745245177d) + "'", double2 == (-0.04669075745245177d));
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.32706384001122574d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.8354356841543302d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 1.0465285740688983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.4288314664442319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42883146644423187d) + "'", double1 == (-0.42883146644423187d));
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(99.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.0017395461469968258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5690567797705814d + "'", double1 == 1.5690567797705814d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2.0000000066669989E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00000002d + "'", double1 == 1.00000002d);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.5947194678480481d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5602764101657366d) + "'", double1 == (-0.5602764101657366d));
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.092207916817751d, 0.9999485054281845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.091910996119958d + "'", double2 == 4.091910996119958d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-4.476961205229636d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8.435352933112958E63d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 212 + "'", int1 == 212);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.4402805101795452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-0.25000003f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7788007598613332d + "'", double1 == 0.7788007598613332d);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.0533959519657112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2543011339274215d + "'", double1 == 1.2543011339274215d);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.32580079669902784d, 1.4994475824457005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32580079669902784d + "'", double2 == 0.32580079669902784d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-12.34222982222313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073486328113436E-6d + "'", double1 == 1.9073486328113436E-6d);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        int int2 = org.apache.commons.math3.util.FastMath.min(8, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 61L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.917242934814409E30d, (-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.917242934814408E30d + "'", double2 == 2.917242934814408E30d);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.9999956364727363d), 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999956364727361d) + "'", double2 == (-0.9999956364727361d));
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.3475105776468364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.9999999999999966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.99798027287595d) + "'", double1 == (-16.99798027287595d));
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.60943587E18f, 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8880249E22f + "'", float2 == 1.8880249E22f);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9999998807907104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281504414619d + "'", double1 == 2.718281504414619d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        double double2 = org.apache.commons.math3.util.FastMath.max((-4.278021864198175d), (double) 3.43597384E11f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368E11d + "'", double2 == 3.4359738368E11d);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6197751905438618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988007752196233d + "'", double1 == 0.9988007752196233d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7313481348387146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012764432931255018d + "'", double1 == 0.012764432931255018d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-45));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8625185805493937E-20d + "'", double1 == 2.8625185805493937E-20d);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.5765379570909391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.8855630621884312d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        float float2 = org.apache.commons.math3.util.FastMath.max(52.000008f, (float) (-2147483648));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000008f + "'", float2 == 52.000008f);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-57.295779513082316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4301970842553728E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8477481924511037d, 6208);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-45), (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.285927376196905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 4.60943587E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.97463715202101d + "'", double1 == 42.97463715202101d);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 2L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        int int2 = org.apache.commons.math3.util.FastMath.min(24, (-40));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-40) + "'", int2 == (-40));
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 32.000004f, 11.536651757164861d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7056305099667786d + "'", double2 == 0.7056305099667786d);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.3369954337691163d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000007d + "'", double1 == 1.000000000000007d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0000001192092898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430807749101543d + "'", double1 == 1.5430807749101543d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-5.314369626254345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999515809042513d) + "'", double1 == (-0.9999515809042513d));
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 1.364242E-12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267935323d + "'", double1 == 1.5707963267935323d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.0517578E-5f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.897326848573678E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.897326848573678E-6d + "'", double1 == 3.897326848573678E-6d);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.594928188335995d), (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39873204708399873d) + "'", double2 == (-0.39873204708399873d));
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.2532929441698648d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        int int2 = org.apache.commons.math3.util.FastMath.min((-8), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int int1 = org.apache.commons.math3.util.FastMath.round(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(127.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(7.737545114640002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 443.32867886094084d + "'", double1 == 443.32867886094084d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        float float2 = org.apache.commons.math3.util.FastMath.max(4096.0f, (float) 41L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.4095289050836257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 57, 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 233472.0f + "'", float2 == 233472.0f);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8780601356668734d, (-0.07813771351531074d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8815299791389564d + "'", double2 == 0.8815299791389564d);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        float float2 = org.apache.commons.math3.util.FastMath.max(6400.0f, 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(181.01933598375618d, 3.4972095184551337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.551479194223533d + "'", double2 == 1.551479194223533d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.547474593066815E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0097419586828951E-28d + "'", double1 == 1.0097419586828951E-28d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.951243865300542d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.951243865300542d + "'", double2 == 3.951243865300542d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.6021822422061627d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.008837862706914782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00883774765993097d) + "'", double1 == (-0.00883774765993097d));
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 212);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.8828125E-4f, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828125E-4f + "'", float2 == 4.8828125E-4f);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-0.0039062505f), 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4240688290837617E-306d) + "'", double2 == (-1.4240688290837617E-306d));
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        float float1 = org.apache.commons.math3.util.FastMath.signum(48.5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.03490658295929199d), 0.3880595140739382d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3880595140739382d + "'", double2 == 0.3880595140739382d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.4E-45f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8E-45f + "'", float1 == 2.8E-45f);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.017947881070324214d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.126011262856224d, (-1.5705521861747473d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.44454092331852335d) + "'", double2 == (-0.44454092331852335d));
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7451131604793488d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.30969878586487914d, (double) (-1022.99994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1022.9999389648438d) + "'", double2 == (-1022.9999389648438d));
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        int int1 = org.apache.commons.math3.util.FastMath.round((-46.999992f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-22.999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5881530833912614d) + "'", double1 == (-1.5881530833912614d));
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(3.33289488E12f, (-2147483648));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) '#', (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        int int1 = org.apache.commons.math3.util.FastMath.round(35.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5786.873730821316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 143, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 143L + "'", long2 == 143L);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 61L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 61.0f + "'", float1 == 61.0f);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        long long2 = org.apache.commons.math3.util.FastMath.min(57L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.401592968989893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.5474746E-13f, (-5.9999995f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 1.4210856E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092966562084E-7d + "'", double1 == 1.192092966562084E-7d);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 3, 0.9947461586351523d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.9999998f + "'", float2 == 2.9999998f);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.092207916817751d, 3.33289488384E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.092207916817751d + "'", double2 == 4.092207916817751d);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.452669727114854E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000345326584213d + "'", double1 == 1.000345326584213d);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.34272165058632437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34272165058632437d + "'", double1 == 0.34272165058632437d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6098212688914123d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6400.0f, 5120.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.75351649555287E-4d + "'", double1 == 4.75351649555287E-4d);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.00818538581289952d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4286193298112916E-4d) + "'", double1 == (-1.4286193298112916E-4d));
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.220446049250313E-16d, 24.191690961245197d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.6090486460720004d), (-0.8414709848078964d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07389332354379241d + "'", double2 == 0.07389332354379241d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 6208L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.4101902625061654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43583995307413204d + "'", double1 == 0.43583995307413204d);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.48611438053413E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5707963226725814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162447350492738d + "'", double1 == 1.162447350492738d);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7615941559557649d, (-0.35876846240963683d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.35876846240963683d) + "'", double2 == (-0.35876846240963683d));
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.708420900134713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9911569720921272d + "'", double1 == 0.9911569720921272d);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6278878161546924d, 0.4694930201844715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6278878161546924d + "'", double2 == 0.6278878161546924d);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-2.9999993f), (-2147483648));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.8827567980377764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4598080049531081d + "'", double1 == 0.4598080049531081d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.003906251f, 17);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 512.0001f + "'", float2 == 512.0001f);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 1, 64L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64L + "'", long2 == 64L);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8504114074081472d) + "'", double1 == (-0.8504114074081472d));
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-23));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5.123868210250173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3999655238984033d + "'", double1 == 0.3999655238984033d);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.4994475824457005d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-1.1E-44f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1210387714598537E-44d) + "'", double1 == (-1.1210387714598537E-44d));
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-6.4851835E18f), (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.4851835E18f + "'", float2 == 6.4851835E18f);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.6654455286575885E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.059306170823242965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.059306170823242965d + "'", double1 == 0.059306170823242965d);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.6657118983783288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657118983783288d + "'", double1 == 0.6657118983783288d);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.4212655272004053d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.4821177017291658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        double double2 = org.apache.commons.math3.util.FastMath.max((-74.20321057778875d), (double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.000003814697266d + "'", double2 == 32.000003814697266d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.7601702599438814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1386403142805372d + "'", double1 == 2.1386403142805372d);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 127.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103803720955957d + "'", double1 == 2.103803720955957d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5106521020275598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 15L, 0.001316561561093711d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(8.227466811481334E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7139912438183694E-7d + "'", double1 == 4.7139912438183694E-7d);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.21619335216456886d, 0.5033290854469099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21619335216456886d + "'", double2 == 0.21619335216456886d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.09298255216717233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.477679266591183d + "'", double1 == 1.477679266591183d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-40.999996f), (-0.4103302129827671d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-100.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-10), (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-20L), 10239.999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.09254195563405843d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(320.0f, 511.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 320.0f + "'", float2 == 320.0f);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 32768L, 12347.228980451639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12347.228980451639d + "'", double2 == 12347.228980451639d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.930127763409804E14d, (-15));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.420082935610902E10d + "'", double2 == 2.420082935610902E10d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-40.999996f), 10.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.999996f + "'", float2 == 40.999996f);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.8146827137745345E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1856521968079224E-4d + "'", double1 == 2.1856521968079224E-4d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.102748784455539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6721962689631755d + "'", double1 == 1.6721962689631755d);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-48.499996f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.575741909831946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.575741909831946d + "'", double1 == 4.575741909831946d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        long long2 = org.apache.commons.math3.util.FastMath.max(1024L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        float float2 = org.apache.commons.math3.util.FastMath.min(7.0f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1.0000002f, 0.16609967099985212d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000238418579d + "'", double2 == 1.000000238418579d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(41.90316148102299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.473265132915768d + "'", double1 == 6.473265132915768d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.75921877E14f, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.75921877E14f + "'", float2 == 1.75921877E14f);
    }
}

