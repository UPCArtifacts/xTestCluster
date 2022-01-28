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
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.37765183291026694d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6699175736806617d + "'", double1 == 1.6699175736806617d);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.159705192572887d, 0.761594155955765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1597051925728867d + "'", double2 == 1.1597051925728867d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.40604869080352307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43087067877290774d) + "'", double1 == (-0.43087067877290774d));
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        double double1 = org.apache.commons.math.util.FastMath.ceil(17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-89.44933880139808d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.2266354000930777d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29327768157142287d + "'", double1 == 0.29327768157142287d);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.40604869080352307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39564551412012366d) + "'", double1 == (-0.39564551412012366d));
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7326482596096648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.855948748237688d + "'", double1 == 0.855948748237688d);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4464413322481353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.000000000000009d + "'", double1 == 8.000000000000009d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6726587729611843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17220518926998146d) + "'", double1 == (-0.17220518926998146d));
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.541950429394781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-3), 7.432697160980512d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0d) + "'", double2 == (-3.0d));
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016388539363305053d + "'", double1 == 0.016388539363305053d);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3346634130618275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34774378171770004d) + "'", double1 == (-0.34774378171770004d));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.13400211995708533d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13360428992833798d) + "'", double1 == (-0.13360428992833798d));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        double double1 = org.apache.commons.math.util.FastMath.exp((-3.620554677378945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026767824867151232d + "'", double1 == 0.026767824867151232d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.21127011215504418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21287422124955813d + "'", double1 == 0.21287422124955813d);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 72);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2522644298967984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8920561553023092d + "'", double1 == 1.8920561553023092d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(192.2131105221355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3547516441110217d + "'", double1 == 3.3547516441110217d);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.220446049250319E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948963d + "'", double1 == 1.5707963267948963d);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2947960259678524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.89056810518696d + "'", double1 == 16.89056810518696d);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.768115672379143E13d + "'", double1 == 2.768115672379143E13d);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2333828709502029E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.908902087289203d) + "'", double1 == (-17.908902087289203d));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9316507487548492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3455027793528098d + "'", double1 == 1.3455027793528098d);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0413759433029089E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4676097652834482E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4664332861696255d + "'", double1 == 0.4664332861696255d);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        double double1 = org.apache.commons.math.util.FastMath.expm1(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.28834004602265E12d + "'", double1 == 2.28834004602265E12d);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        double double1 = org.apache.commons.math.util.FastMath.tanh(286.82547115569156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7311284168939934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.279394493926661d + "'", double1 == 1.279394493926661d);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.00875022181505636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0579809376252336d) + "'", double1 == (-2.0579809376252336d));
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1672838871475522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994859114337768d + "'", double1 == 0.994859114337768d);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 3, 2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.688117141816173E43d + "'", double2 == 2.688117141816173E43d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.05372904237133229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6726669944799356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8201627853541854d + "'", double1 == 0.8201627853541854d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        double double2 = org.apache.commons.math.util.FastMath.max(0.30651527099946596d, 21.487562597823967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.487562597823967d + "'", double2 == 21.487562597823967d);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 53, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.13394365429496144d, 0.512774268133115d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2555045537071452d + "'", double2 == 0.2555045537071452d);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.147104553392378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7333083296531462d + "'", double1 == 1.7333083296531462d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4426335746777788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44263357467777886d + "'", double1 == 0.44263357467777886d);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9960820508065507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7599438017965855d + "'", double1 == 0.7599438017965855d);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.101000478591089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.011032585021104841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01103258502110484d) + "'", double1 == (-0.01103258502110484d));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double double1 = org.apache.commons.math.util.FastMath.atan((-26.551214976773192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5331510601832288d) + "'", double1 == (-1.5331510601832288d));
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.04617424497707E-4d) + "'", double1 == (-3.04617424497707E-4d));
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.29054468128588473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3371556133482585d + "'", double1 == 0.3371556133482585d);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1508493389168752d) + "'", double1 == (-1.1508493389168752d));
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.328887050212274E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5600776728471155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9154330388409943d + "'", double1 == 0.9154330388409943d);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        long long1 = org.apache.commons.math.util.FastMath.round(0.2134887868481213d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.446441332248135d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        double double1 = org.apache.commons.math.util.FastMath.log(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16143935615846078d + "'", double1 == 0.16143935615846078d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.723044407228643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.723044407228643d + "'", double1 == 0.723044407228643d);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.397318034091222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0069345078724429d) + "'", double1 == (-0.0069345078724429d));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.36620409622270317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.631800352235365E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9996703618789198d) + "'", double1 == (-0.9996703618789198d));
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.696065812452068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.052312080781770166d + "'", double1 == 0.052312080781770166d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.158010543951033d, 2.671727410451328d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.807285461085242d + "'", double2 == 7.807285461085242d);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9551472471031407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02741502296107092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0277942724823426d + "'", double1 == 1.0277942724823426d);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0145592787614723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.159705192572887d, 0.9832834877495503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8675380076947303d + "'", double2 == 0.8675380076947303d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6569847686310842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927978d + "'", double1 == 7.211102550927978d);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7970546072131296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4163477582874449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8822572094027574d + "'", double1 == 0.8822572094027574d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1578212823495775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.33827290905562d + "'", double1 == 66.33827290905562d);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.21481175810568434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2396285249797687d + "'", double1 == 0.2396285249797687d);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.980984492908097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.050742853286975496d + "'", double1 == 0.050742853286975496d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(232.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13292.620847035098d + "'", double1 == 13292.620847035098d);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9036922050915067d), 1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9036922050915067d) + "'", double2 == (-0.9036922050915067d));
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        double double1 = org.apache.commons.math.util.FastMath.signum(286.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8177863461186085d), 12.35981384720823d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6406162314544411d, 1.2522644298967984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6406162314544411d + "'", double2 == 0.6406162314544411d);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6212891090067323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6212891090067325d + "'", double1 == 1.6212891090067325d);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.000168222518137E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.3499748049257176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3499748049257176d + "'", double1 == 2.3499748049257176d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130532941206642d + "'", double1 == 1.2130532941206642d);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7235232133665007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7619036782447475d + "'", double1 == 0.7619036782447475d);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.685719999335932E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6944137478171459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6480841250043182d + "'", double1 == 0.6480841250043182d);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1630.5718687404037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.1781424084962125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4269587715167061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.2285327801518604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.996866129772292d + "'", double1 == 0.996866129772292d);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3744449E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3744449E7d + "'", double1 == 1.3744449E7d);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7201927932561937d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.05042853879473771d), 0.22469894983086627d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.810327220066308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.193245818431283d + "'", double1 == 2.193245818431283d);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.009430054193516505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00947465724738848d + "'", double1 == 0.00947465724738848d);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        double double1 = org.apache.commons.math.util.FastMath.exp(57.29291493894794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.62073412629056E24d + "'", double1 == 7.62073412629056E24d);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.1207822376352453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.920312456645728d) + "'", double1 == (-6.920312456645728d));
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9445209155423233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5715810788975262d + "'", double1 == 1.5715810788975262d);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0010571609087238003d, 0.029840280115945614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.029840280115945614d + "'", double2 == 0.029840280115945614d);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.293358726420639E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.621997083449871E29d + "'", double1 == 1.621997083449871E29d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5025652899631845d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1961853422678859d) + "'", double1 == (-1.1961853422678859d));
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.009606545630105158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9904394498257181d + "'", double1 == 0.9904394498257181d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        float float1 = org.apache.commons.math.util.FastMath.abs(232.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 232.0f + "'", float1 == 232.0f);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 72L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 72.0f + "'", float1 == 72.0f);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999919051407145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.151665335034499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7397833213468092d + "'", double1 == 1.7397833213468092d);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7179170498164851d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7842626635876098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8855860565679712d + "'", double1 == 0.8855860565679712d);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.31133746861371714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3113374686137172d + "'", double1 == 0.3113374686137172d);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        long long1 = org.apache.commons.math.util.FastMath.round(0.019279300992748737d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9290452453166923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9867447596767658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4077955424908757d) + "'", double1 == (-1.4077955424908757d));
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6738111919958594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39480533788366884d) + "'", double1 == (-0.39480533788366884d));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        double double2 = org.apache.commons.math.util.FastMath.max((-53.00704927389939d), 0.2976534827417239d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2976534827417239d + "'", double2 == 0.2976534827417239d);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        double double2 = org.apache.commons.math.util.FastMath.max(0.023781545449259364d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023781545449259364d + "'", double2 == 0.023781545449259364d);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.21749753606973166d, 1.3734007669450161d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12304367228535418d + "'", double2 == 0.12304367228535418d);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.574710978503383d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5584988834922742d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5467250970042679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2436740316514885d + "'", double1 == 1.2436740316514885d);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-66.06783209628024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-66.06783209628023d) + "'", double1 == (-66.06783209628023d));
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9984579799537394d + "'", double1 == 0.9984579799537394d);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.11887045430169285d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8879228198934183d + "'", double1 == 0.8879228198934183d);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.403648339910223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2682239112306401d + "'", double1 == 0.2682239112306401d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2334031175112103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.850573542591402d + "'", double1 == 2.850573542591402d);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.461870529191683E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.461870529191683E-4d + "'", double1 == 5.461870529191683E-4d);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2, 0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7370079472344264d + "'", double2 == 1.7370079472344264d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.01883280792598242d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.018833921356972847d) + "'", double1 == (-0.018833921356972847d));
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.11943352419502769d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11257700198353757d) + "'", double1 == (-0.11257700198353757d));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        long long1 = org.apache.commons.math.util.FastMath.round(102.39369977975828d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 102L + "'", long1 == 102L);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4161468365471422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.340416587577421d) + "'", double1 == (-0.340416587577421d));
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5551126252984884d + "'", double1 == 1.5551126252984884d);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-6.810594032269465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 453.7053897732997d + "'", double1 == 453.7053897732997d);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.9251568576324245d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9251568576324245d) + "'", double2 == (-1.9251568576324245d));
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7207960780149949d + "'", double1 == 0.7207960780149949d);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.7672312144687762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.017453292519943295d), 0.24662339848588008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017453292519943295d) + "'", double2 == (-0.017453292519943295d));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 35L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.51718181260188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1367462175933816d + "'", double1 == 1.1367462175933816d);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        long long2 = org.apache.commons.math.util.FastMath.min(28L, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2479811090512842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.117130748413669d + "'", double1 == 1.117130748413669d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        double double1 = org.apache.commons.math.util.FastMath.expm1(97.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192043265E42d + "'", double1 == 1.3383347192043265E42d);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7871071944553747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21462793138890232d) + "'", double1 == (-0.21462793138890232d));
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        double double1 = org.apache.commons.math.util.FastMath.log10(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.744894366675417d + "'", double1 == 3.744894366675417d);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9171523356672716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.755246472440062d + "'", double1 == 0.755246472440062d);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4676097652834482E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.61555864286098d + "'", double1 == 35.61555864286098d);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.03402992459718327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03401679776016197d + "'", double1 == 0.03401679776016197d);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-6.778786642387399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 439.50133562451674d + "'", double1 == 439.50133562451674d);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        double double1 = org.apache.commons.math.util.FastMath.log(4.4164666005855215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4853399647575003d + "'", double1 == 1.4853399647575003d);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.393331768257697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.07532458034302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.30364342573864755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005299577531174295d + "'", double1 == 0.005299577531174295d);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.635872723119861d + "'", double1 == 1.635872723119861d);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        double double2 = org.apache.commons.math.util.FastMath.max(0.024078697432024926d, (-1.0106146460254415d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024078697432024926d + "'", double2 == 0.024078697432024926d);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.6699175736806617d, 0.25008839294063845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6699175736806615d + "'", double2 == 1.6699175736806615d);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        float float1 = org.apache.commons.math.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.054079817020544E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3968271116979769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39682711169797696d + "'", double1 == 0.39682711169797696d);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9980845732903537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8800185270285333d + "'", double1 == 0.8800185270285333d);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        double double1 = org.apache.commons.math.util.FastMath.log10(601302.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.77909264836158d + "'", double1 == 5.77909264836158d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1283261188573166d, 8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1283261188573166d + "'", double2 == 1.1283261188573166d);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 338.9664028342795d + "'", double1 == 338.9664028342795d);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5498622334799267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43816604535509573d + "'", double1 == 0.43816604535509573d);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3227.9292774459186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 184946.72416436448d + "'", double1 == 184946.72416436448d);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.30651527099946596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.008837747659931517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.989740156313126d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4486454104648996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1659350422353598d + "'", double1 == 1.1659350422353598d);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        double double2 = org.apache.commons.math.util.FastMath.min((-4194303.9999999413d), (-1.3829261109163618d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4194303.9999999413d) + "'", double2 == (-4194303.9999999413d));
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.4417418312298101d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        double double1 = org.apache.commons.math.util.FastMath.atan(199.0049998750063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5657713697140057d + "'", double1 == 1.5657713697140057d);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        long long1 = org.apache.commons.math.util.FastMath.round(968.9859567243174d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 969L + "'", long1 == 969L);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014686439244896977d + "'", double1 == 0.014686439244896977d);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.098293393647366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.92757612309441d + "'", double1 == 62.92757612309441d);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8371582714590907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8371582714590908d + "'", double1 == 0.8371582714590908d);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1592828834995985d + "'", double1 == 2.1592828834995985d);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1781424084962125d, 10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.953280866830926E-8d + "'", double2 == 2.953280866830926E-8d);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9561770880181973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6017312479085728d + "'", double1 == 1.6017312479085728d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8623188722876839d, 5729.577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.06254420428363118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06262594923388144d + "'", double1 == 0.06262594923388144d);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9019228933850969d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5206130698160022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.542524056185831d, 1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.931664488226305d + "'", double2 == 4.931664488226305d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        double double2 = org.apache.commons.math.util.FastMath.min(5506.500045400885d, 2.9283350632110237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9283350632110237d + "'", double2 == 2.9283350632110237d);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.778873676342487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7613123351430517d + "'", double1 == 0.7613123351430517d);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.041914824263686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.93525951038506d + "'", double1 == 56.93525951038506d);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.101000478591089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3734007669450161d + "'", double1 == 1.3734007669450161d);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2592664089300267d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.1490617565057812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.230106993761132d + "'", double1 == 4.230106993761132d);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4664332861696255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5942976368321509d + "'", double1 == 1.5942976368321509d);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.78552109133562d + "'", double1 == 171.78552109133562d);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9830787956514044d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.677403252426197d + "'", double1 == 14.677403252426197d);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.15654434213077018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4136054464127965d + "'", double1 == 1.4136054464127965d);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        float float2 = org.apache.commons.math.util.FastMath.max((-53.0f), (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0068754614506148d + "'", double1 == 1.0068754614506148d);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.598780889335082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0118543769141768d + "'", double1 == 1.0118543769141768d);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        double double1 = org.apache.commons.math.util.FastMath.rint(435.6527582312547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 436.0d + "'", double1 == 436.0d);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.344162252208615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8519280895446752d + "'", double1 == 0.8519280895446752d);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8800185270285333d, 0.16820452546122452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8800185270285332d + "'", double2 == 0.8800185270285332d);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.272392748970048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2939947103772145d + "'", double1 == 0.2939947103772145d);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1872284502270583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1872284502270585d + "'", double1 == 1.1872284502270585d);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.1752011936438012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        double double1 = org.apache.commons.math.util.FastMath.ulp(19.071130515668326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        double double1 = org.apache.commons.math.util.FastMath.tanh(215.251057912766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 53);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0073755965079926366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999728004113795d + "'", double1 == 0.9999728004113795d);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.8985248817088516d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8985248817088514d) + "'", double1 == (-1.8985248817088514d));
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.43087067877290774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.406832638109662d) + "'", double1 == (-0.406832638109662d));
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.429982300184234d, 0.5579004906280912d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4299823001842333d + "'", double2 == 2.4299823001842333d);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9063641612633266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089405E-8d + "'", double1 == 4.214684851089405E-8d);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5929264334035065d, 0.008750221815056362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008750221815056362d + "'", double2 == 0.008750221815056362d);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707963267948795d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        double double1 = org.apache.commons.math.util.FastMath.exp(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3112315471152565E15d + "'", double1 == 4.3112315471152565E15d);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9674630275799633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.823448910981979d + "'", double1 == 0.823448910981979d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0514262063398037d + "'", double1 == 1.0514262063398037d);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (-53L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        double double1 = org.apache.commons.math.util.FastMath.log1p(6.115016634173588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9622075694412033d + "'", double1 == 1.9622075694412033d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.403648339910223d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8009077307264113d), 1.5700548602583582d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5700548602583582d + "'", double2 == 1.5700548602583582d);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        double double1 = org.apache.commons.math.util.FastMath.sin(103.00961449578338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6154391978627103d + "'", double1 == 0.6154391978627103d);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.000304663820384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4690168630587714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4690168630587714d + "'", double1 == 1.4690168630587714d);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5766474848126442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 232L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 232.0f + "'", float2 == 232.0f);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.569397566060484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5265129967102895d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110908904786674E-5d + "'", double1 == 1.2110908904786674E-5d);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        long long1 = org.apache.commons.math.util.FastMath.abs(969L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 969L + "'", long1 == 969L);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        double double1 = org.apache.commons.math.util.FastMath.exp(13292.620847035098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.260052243696693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.49154750458044d + "'", double1 == 192.49154750458044d);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.103458524115279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.322933953041652d + "'", double1 == 0.322933953041652d);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1189396031849523d + "'", double1 == 1.1189396031849523d);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2648394832966439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.852392823283385d + "'", double1 == 0.852392823283385d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7874899863726001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7228697444076502d + "'", double1 == 0.7228697444076502d);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8052085614665847d + "'", double1 == 0.8052085614665847d);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        double double2 = org.apache.commons.math.util.FastMath.min(43.0d, (-0.14192893333928602d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14192893333928602d) + "'", double2 == (-0.14192893333928602d));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9704682670117347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.603735851147455d + "'", double1 == 55.603735851147455d);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9904513401802029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.015085296975380386d, 0.010671753160346287d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9551028717351946d + "'", double2 == 0.9551028717351946d);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.04134068757158039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        long long1 = org.apache.commons.math.util.FastMath.round(3.946997808922293d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        double double1 = org.apache.commons.math.util.FastMath.log(3.0461741978670857E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.096453930081621d) + "'", double1 == (-8.096453930081621d));
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.574710978503383d, 1.941208504361988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1694893490615264d + "'", double2 == 1.1694893490615264d);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        long long1 = org.apache.commons.math.util.FastMath.round(0.015085296975380386d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2490457723982544d) + "'", double1 == (-1.2490457723982544d));
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        float float2 = org.apache.commons.math.util.FastMath.max((-53.0f), 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        double double2 = org.apache.commons.math.util.FastMath.pow(147.4131591025766d, 103504.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2086845112949163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7923970945438066d + "'", double1 == 0.7923970945438066d);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.2638973976934564E18d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        double double2 = org.apache.commons.math.util.FastMath.min(5.729577951308232d, 0.6323562492563314d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6323562492563314d + "'", double2 == 0.6323562492563314d);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4472118490899239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43350576899781335d + "'", double1 == 0.43350576899781335d);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.269017577653561d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1915368798022847d + "'", double1 == 1.1915368798022847d);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.014930974924027406d), 0.8322083902453671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.014930974924027405d) + "'", double2 == (-0.014930974924027405d));
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.08609295595102832d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        double double1 = org.apache.commons.math.util.FastMath.sin(13247.898147933502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19677964403589276d + "'", double1 == 0.19677964403589276d);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.3933489534882026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.606876793035825d + "'", double1 == 1.606876793035825d);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9568614257960677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.603512320247417d + "'", double1 == 2.603512320247417d);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.5632546790890485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8539880479975238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7068047800279598d + "'", double1 == 0.7068047800279598d);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0010571609087238003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.852168352153305d) + "'", double1 == (-6.852168352153305d));
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.41671114415975274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707055415023634d, 1.0000305177333457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707055415023634d + "'", double2 == 1.5707055415023634d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        double double1 = org.apache.commons.math.util.FastMath.acosh(215.55793480139613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.066371512547204d + "'", double1 == 6.066371512547204d);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(286.82547115569156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.8254711556916d + "'", double1 == 286.8254711556916d);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0864361697580084E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23831255152376624d + "'", double1 == 0.23831255152376624d);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        double double1 = org.apache.commons.math.util.FastMath.tanh(41.32317658130462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        double double1 = org.apache.commons.math.util.FastMath.rint(28.725283738478318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.0d + "'", double1 == 29.0d);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.440892098500626E-16d, 0.07616912206432258d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06770352567956632d + "'", double2 == 0.06770352567956632d);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6944137478171459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999536041141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999845347045d + "'", double1 == 0.9999999845347045d);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-100.30909595621492d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8308672778518115E43d + "'", double1 == 1.8308672778518115E43d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4328606952063188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8822572094027574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.772175097777117d + "'", double1 == 0.772175097777117d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6384917413123372d, 7.569397566060481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08415251450978896d + "'", double2 == 0.08415251450978896d);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4464413322481353d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.559512775607752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0138559185957692d + "'", double1 == 1.0138559185957692d);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9445209155423233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4802234523765396d + "'", double1 == 1.4802234523765396d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        double double2 = org.apache.commons.math.util.FastMath.min((-6.843036868748689d), 5.260052243696693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.843036868748689d) + "'", double2 == (-6.843036868748689d));
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        double double1 = org.apache.commons.math.util.FastMath.signum(35.61555864286098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.052312080781770166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.88178419700125E-16d + "'", double1 == 8.88178419700125E-16d);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0149280275816275d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.60978210179491616E17d + "'", double1 == 1.60978210179491616E17d);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8539880479975238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1475302824694982d + "'", double1 == 1.1475302824694982d);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707952637376876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707952637376879d + "'", double1 == 1.5707952637376879d);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 601302L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.2266354000930775d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9413588930953838d) + "'", double1 == (-0.9413588930953838d));
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.466391323325752E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.68435456E8d + "'", double1 == 2.68435456E8d);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        double double2 = org.apache.commons.math.util.FastMath.pow(12.35981384720823d, 2.8353789697787954d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1248.1525277673024d + "'", double2 == 1248.1525277673024d);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.817884356931778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0678840230978797d + "'", double1 == 1.0678840230978797d);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9316507487548492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.538696470620462d + "'", double1 == 2.538696470620462d);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        float float2 = org.apache.commons.math.util.FastMath.max(601302.0f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.21462793138890232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2900710226066557d + "'", double1 == 0.2900710226066557d);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9834580564863409d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.328887050212274E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9963790917388103d + "'", double1 == 0.9963790917388103d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        double double1 = org.apache.commons.math.util.FastMath.acos((-77.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.008837632613846286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.781572054374191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06912789873045781d + "'", double1 == 0.06912789873045781d);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.155615773557597E15d, 2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.366912598987926E39d + "'", double2 == 7.366912598987926E39d);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5712986229603103d + "'", double1 == 0.5712986229603103d);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.06136814014227283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06136814014227283d + "'", double1 == 0.06136814014227283d);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.44041151091558656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6636350736026438d + "'", double1 == 0.6636350736026438d);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.137830415726692E-34d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.949844845080285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1562042600892928d + "'", double1 == 0.1562042600892928d);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        int int2 = org.apache.commons.math.util.FastMath.max(72, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.15009016663239344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1495322886557004d + "'", double1 == 0.1495322886557004d);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7730965638572164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6487264418909354d) + "'", double1 == (-0.6487264418909354d));
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        double double1 = org.apache.commons.math.util.FastMath.log(88.76920606279324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.486039811284383d + "'", double1 == 4.486039811284383d);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        int int2 = org.apache.commons.math.util.FastMath.max(72, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2246467991473532E-16d) + "'", double1 == (-1.2246467991473532E-16d));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9961652815068444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9961652815068444d + "'", double1 == 0.9961652815068444d);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.4683328494106918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3388866618191672d + "'", double1 == 0.3388866618191672d);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.138127355756959d, 0.9903210539364167d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4329395021738325d + "'", double2 == 1.4329395021738325d);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.01883280792598242d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.018656578630326694d) + "'", double1 == (-0.018656578630326694d));
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9496962111038966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9496962111038967d + "'", double1 == 0.9496962111038967d);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4288764780867376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.572812126805d + "'", double1 == 24.572812126805d);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.575441381684169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5754413816841691d + "'", double1 == 0.5754413816841691d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.31133746861371714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4190581615792427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6473470178963079d + "'", double1 == 0.6473470178963079d);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.4164666005855215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.80319110677961d + "'", double1 == 81.80319110677961d);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        double double1 = org.apache.commons.math.util.FastMath.tan(29.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8871428437982151d + "'", double1 == 0.8871428437982151d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8414709848078971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9173172759781084d + "'", double1 == 0.9173172759781084d);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.724495677915209d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.801668109017674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8016681090176743d + "'", double1 == 2.8016681090176743d);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.7249979868612266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.196225985111386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.240517442917666d + "'", double1 == 12.240517442917666d);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8104773809653505d + "'", double1 == 4.8104773809653505d);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        double double1 = org.apache.commons.math.util.FastMath.sinh(270.3546380008244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2956790750136956E117d + "'", double1 == 1.2956790750136956E117d);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9950915100179344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.471675079909133d + "'", double1 == 1.471675079909133d);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.20638559288074199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20350434138645834d + "'", double1 == 0.20350434138645834d);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(Double.NEGATIVE_INFINITY, (-1.055287372175112d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3156563365585749d, 2.68435456E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3156563365585749d + "'", double2 == 0.3156563365585749d);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9950915100179344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1676411246422755d + "'", double1 == 1.1676411246422755d);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1207822376352453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8735346502596506d, 36.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8735346502596506d + "'", double2 == 0.8735346502596506d);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7923970945438066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23269263081791292d) + "'", double1 == (-0.23269263081791292d));
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 72L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8573324964312685d + "'", double1 == 1.8573324964312685d);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, 28.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5519306407732258d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.192092895507818E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092895507818E-7d + "'", double1 == 1.192092895507818E-7d);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.07192917717322632d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07205361290155955d) + "'", double1 == (-0.07205361290155955d));
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.3262569125794328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023147549851845705d) + "'", double1 == (-0.023147549851845705d));
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        double double2 = org.apache.commons.math.util.FastMath.min(0.03401679776016197d, 0.06136814014227283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03401679776016197d + "'", double2 == 0.03401679776016197d);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1832.543877233447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9916299884373266d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1659350422353598d, 1.1523647554462573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1659350422353596d + "'", double2 == 1.1659350422353596d);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.3693207897104474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.797850593225596d), 171.78552109133565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7978505932255959d) + "'", double2 == (-0.7978505932255959d));
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5019419896466207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28, (float) 74L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.0f + "'", float2 == 74.0f);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) 102L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.999999999998d + "'", double1 == 11013.999999999998d);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.305048990018662d, 0.6032754731892245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.314818645033839d + "'", double2 == 1.314818645033839d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.1972245773362196d, (-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09427068336986845d + "'", double2 == 0.09427068336986845d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.5347252927908293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03606321239200799d + "'", double1 == 0.03606321239200799d);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        long long1 = org.apache.commons.math.util.FastMath.round(55.603735851147455d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 56L + "'", long1 == 56L);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.8318928232769873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990613875426092d + "'", double1 == 0.9990613875426092d);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.31617702417284754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3060460874463667d + "'", double1 == 0.3060460874463667d);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        double double1 = org.apache.commons.math.util.FastMath.acosh(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.13808802977004d + "'", double1 == 6.13808802977004d);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.206879716514544E22d, 0.43350576899781335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2068797165145434E22d + "'", double2 == 5.2068797165145434E22d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.008798582499187173d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        double double1 = org.apache.commons.math.util.FastMath.floor(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.11886886458581854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.126548815752537d) + "'", double1 == (-0.126548815752537d));
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.6035750265302235d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(286.4788975654116d, (-28.268076694535583d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 286.47889756541156d + "'", double2 == 286.47889756541156d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8414709848078971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 72L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        long long1 = org.apache.commons.math.util.FastMath.round(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7085733084162253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06472681478344226d + "'", double1 == 0.06472681478344226d);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5429496506759195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.60978210179491616E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        double double1 = org.apache.commons.math.util.FastMath.log(1.310610594469108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.270493131269137d + "'", double1 == 0.270493131269137d);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7468039524918473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7135781201111424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7756969903949167d + "'", double1 == 0.7756969903949167d);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7923970945438066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6560676710276013d + "'", double1 == 0.6560676710276013d);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5466217204533386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9132263633319788d + "'", double1 == 0.9132263633319788d);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.012822137910701758d, 0.9410106931720924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016579466273335598d + "'", double2 == 0.016579466273335598d);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0522257274488631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8685285336718198d + "'", double1 == 0.8685285336718198d);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        double double1 = org.apache.commons.math.util.FastMath.abs(1604.281826366305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1604.281826366305d + "'", double1 == 1604.281826366305d);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.3977072091439116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3977072091439116d + "'", double1 == 2.3977072091439116d);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.06057085833608861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060570858336088614d + "'", double1 == 0.060570858336088614d);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3235780930645507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023100795631244335d + "'", double1 == 0.023100795631244335d);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        long long2 = org.apache.commons.math.util.FastMath.max(232L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 232L + "'", long2 == 232L);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        double double1 = org.apache.commons.math.util.FastMath.ceil(286.4788975654116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 287.0d + "'", double1 == 287.0d);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 56L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.04305126783455d + "'", double1 == 4.04305126783455d);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        long long1 = org.apache.commons.math.util.FastMath.abs(1477896L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6809167416070823d, 1.6212891090067323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6809167416070823d + "'", double2 == 0.6809167416070823d);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.05448755243389763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05305491663174207d + "'", double1 == 0.05305491663174207d);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8425647914073723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.275406513963d + "'", double1 == 48.275406513963d);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        double double2 = org.apache.commons.math.util.FastMath.max(2.103458524115279d, 1.2493184782545368d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.103458524115279d + "'", double2 == 2.103458524115279d);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.21189945982621552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21348878684812145d + "'", double1 == 0.21348878684812145d);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8539880479975237d, 0.08415251450978896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9868053513896203d + "'", double2 == 0.9868053513896203d);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        double double2 = org.apache.commons.math.util.FastMath.max(0.24779790579557007d, 1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.883259400089535E100d + "'", double2 == 1.883259400089535E100d);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.399216241149525E248d + "'", double1 == 3.399216241149525E248d);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8425647914073723d, 73.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8425647914073724d + "'", double2 == 0.8425647914073724d);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8577073882411156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1561843215406364d) + "'", double1 == (-1.1561843215406364d));
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610486d + "'", double1 == 5.298292365610486d);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        double double2 = org.apache.commons.math.util.FastMath.min(1.314818645033839d, 0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7212254887267799d + "'", double2 == 0.7212254887267799d);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5579004906280911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.508888604796824d + "'", double1 == 0.508888604796824d);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.03489241440794944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }
}

