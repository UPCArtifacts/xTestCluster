import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.5409367175424972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5677061957752959d + "'", double1 == 0.5677061957752959d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-17));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.49904707604701226d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6912431464778742d) + "'", double1 == (-0.6912431464778742d));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        long long1 = org.apache.commons.math3.util.FastMath.round(10.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.4532640331862171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1003725920327005d + "'", double1 == 1.1003725920327005d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.8184464592320668d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(10240.0f, (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 320.0f + "'", float2 == 320.0f);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5665273139641338d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5665273139641338d + "'", double2 == 1.5665273139641338d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.8382668271306453E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double1 = org.apache.commons.math3.util.FastMath.asin(9.38970161056691E-191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.38970161056691E-191d + "'", double1 == 9.38970161056691E-191d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.0517578125E-5d, 8.864996893061638E35d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.961040229770445d) + "'", double2 == (-7.961040229770445d));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 1.34217728E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.34217728E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 512.0d + "'", double1 == 512.0d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.50359936E15f) + "'", float1 == (-4.50359936E15f));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 100, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) ' ', (-2147483648));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.9242223034090244d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 15L, 1.3598938172877042d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3598938172877042d + "'", double2 == 1.3598938172877042d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.2500000298023224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25534195296645534d + "'", double1 == 0.25534195296645534d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math3.util.FastMath.exp(10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37648.55483291208d + "'", double1 == 37648.55483291208d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        float float1 = org.apache.commons.math3.util.FastMath.abs(0.003906251f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.003906251f + "'", float1 == 0.003906251f);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(8.470329472543003E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.470329472543003E-22d + "'", double1 == 8.470329472543003E-22d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int int2 = org.apache.commons.math3.util.FastMath.max((-511), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double1 = org.apache.commons.math3.util.FastMath.rint(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8203432320660448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2712792796397068d + "'", double1 == 1.2712792796397068d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.9956802361437771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4778137746277245d + "'", double1 == 1.4778137746277245d);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2147483648), (float) 23L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.34187198E17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.71798692E10f + "'", float1 == 1.71798692E10f);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        long long1 = org.apache.commons.math3.util.FastMath.abs(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 2147483647, 20L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.1661186E11f, 0.0234375f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1661186E11f + "'", float2 == 4.1661186E11f);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.024600920295739914d, (double) 5120.0005f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.04965465756202388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.833101217706723E65d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.6764125919282525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5947194678480481d) + "'", double1 == (-0.5947194678480481d));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double1 = org.apache.commons.math3.util.FastMath.floor(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.0d + "'", double1 == 99.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9801475222605264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989023072965d + "'", double1 == 2.3012989023072965d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.34217728E8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 16.0f + "'", float1 == 16.0f);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185506798576E-7d + "'", double1 == 2.384185506798576E-7d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.123868210250173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.014317690396004406d, 5.686278854741452E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014317690396004406d + "'", double2 == 0.014317690396004406d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 5.421011E-20f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-19.265919722494797d) + "'", double1 == (-19.265919722494797d));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int int1 = org.apache.commons.math3.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double1 = org.apache.commons.math3.util.FastMath.cos(7.930127763409804E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.559492086485665d) + "'", double1 == (-0.559492086485665d));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.8493111942973237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2670099985546604d + "'", double1 == 0.2670099985546604d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(126.99999f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(9.223372036854776E18d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8414675156134572d, 6.0744591563843855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8414675156134572d + "'", double2 == 0.8414675156134572d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9225959148113836d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7451597002743676d + "'", double2 == 0.7451597002743676d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.059306170823243d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.6090486460720004d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.37140692824026045d, 511);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4898763788476926E153d + "'", double2 == 2.4898763788476926E153d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double2 = org.apache.commons.math3.util.FastMath.pow(9.587379894910212E-5d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9280538062512563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.032426843737390965d) + "'", double1 == (-0.032426843737390965d));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-8.042848410283348d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4470970802797667d) + "'", double1 == (-1.4470970802797667d));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2189617844006455d + "'", double1 == 1.2189617844006455d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.49904707604701226d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.59329123583804d) + "'", double1 == (-28.59329123583804d));
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9150314823146174d, (-511.49999999999994d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 511.50081845742295d + "'", double2 == 511.50081845742295d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 126.99999f, 1.788733916312187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 126.99999237060547d + "'", double2 == 126.99999237060547d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double2 = org.apache.commons.math3.util.FastMath.pow(18824.27742973676d, 6208);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) '#', 80.00000012160547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double1 = org.apache.commons.math3.util.FastMath.signum(40.74862735876591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0018277045187202517d, 1.3882400312478556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001316561561093711d + "'", double2 == 0.001316561561093711d);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 32768L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32768.004f + "'", float1 == 32768.004f);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double1 = org.apache.commons.math3.util.FastMath.exp(8.864996893061638E35d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.8354356841543302d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.366970946469284d + "'", double2 == 29.366970946469284d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8813735870195445d, (-0.44271534973740406d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.004057112455263634d) + "'", double2 == (-0.004057112455263634d));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 4.5035996E15f, 1.626504523747204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9074467814501962d + "'", double1 == 0.9074467814501962d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 15, 0.031134283544730468d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.000032311418927d + "'", double2 == 15.000032311418927d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        int int2 = org.apache.commons.math3.util.FastMath.min(20, (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math3.util.FastMath.asin(99.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.687693995581348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 268.5850815956288d + "'", double1 == 268.5850815956288d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.49993310426429d + "'", double1 == 4.49993310426429d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.7995660637267406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7170536970566798d) + "'", double1 == (-0.7170536970566798d));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(97.0051545022222d, 2.7711415651109443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00515450222218d + "'", double2 == 97.00515450222218d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5703319211292674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1623327810976913d + "'", double1 == 1.1623327810976913d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.015050303523504572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.059306170823242965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.5035996E15f, 1024.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994957367078d + "'", double1 == 0.9149994957367078d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 2, (double) 57.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.7364591792920476d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7364591792920474d + "'", double2 == 1.7364591792920474d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 4.1661186E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.231911890816295d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.8646647167633873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9765085859520761d) + "'", double1 == (-0.9765085859520761d));
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.31036104568165535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double2 = org.apache.commons.math3.util.FastMath.log(17.863451288869854d, (double) (-126.99999f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.5796122477778827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8337692064667246d + "'", double1 == 0.8337692064667246d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9436221923009624d) + "'", double1 == (-0.9436221923009624d));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 61L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.810249675906654d + "'", double1 == 7.810249675906654d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        int int2 = org.apache.commons.math3.util.FastMath.min(8, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.059306170823243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34272165058632437d + "'", double1 == 0.34272165058632437d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-4.821637045374455E-17d), 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6567018738452282E-6d) + "'", double2 == (-1.6567018738452282E-6d));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7538351096760478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6459510640684992d + "'", double1 == 0.6459510640684992d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.89628095729292E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2163925864078933d + "'", double1 == 2.2163925864078933d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0039062505f, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0039062505f) + "'", float2 == (-0.0039062505f));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3580.4237429416758d, (-0.8837563087406048d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3580.423852010498d + "'", double2 == 3580.423852010498d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.12816970312934028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12887618051864808d) + "'", double1 == (-0.12887618051864808d));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math3.util.FastMath.asin(7.737545114640002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(10.000002f, (-20.34331808359165d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.89628095729292E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886102.046056483d + "'", double1 == 8886102.046056483d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.192093037616354E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0049215667967173185d + "'", double1 == 0.0049215667967173185d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-48.499996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 48.499996f + "'", float1 == 48.499996f);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double2 = org.apache.commons.math3.util.FastMath.log((-56.72239180482502d), 6.012089888557484d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1.9999999f), 6208);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.192093E-7f, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-3), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        long long1 = org.apache.commons.math3.util.FastMath.abs(2147483648L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483648L + "'", long1 == 2147483648L);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 4503599627370496L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(320.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0517578E-5f + "'", float1 == 3.0517578E-5f);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 61, 2.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 61.0f + "'", float2 == 61.0f);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.7210377105017316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32706384001122574d) + "'", double1 == (-0.32706384001122574d));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, (long) (-64));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2980.95656561053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570460864019617d + "'", double1 == 1.570460864019617d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.8203432320660448d, (-4.821637045374455E-17d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8203432320660448d) + "'", double2 == (-0.8203432320660448d));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        long long2 = org.apache.commons.math3.util.FastMath.max(52L, (long) (-64));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-64));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64) + "'", int1 == (-64));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-64), 0.759169725377571d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.999996f) + "'", float2 == (-63.999996f));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6497827368478742d, (-511.49999999999994d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-64L), 5.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-64.0f) + "'", float2 == (-64.0f));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.33656885961385924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.057175989960846d + "'", double1 == 1.057175989960846d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6208.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(57.29577951308244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.4994475824457005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.991872622830142d + "'", double1 == 13.991872622830142d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.2519653700568933d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2519653700568933d + "'", double2 == 1.2519653700568933d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9960689204702708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7076170222418037d + "'", double1 == 1.7076170222418037d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 15L, (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.234375f + "'", float2 == 0.234375f);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (-0.9999956364727363d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.710505431213761E-20d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int int2 = org.apache.commons.math3.util.FastMath.max((-5), 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.19611984407111288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6290293572681904d) + "'", double1 == (-1.6290293572681904d));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.99999994f), (-7));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0078124995f) + "'", float2 == (-0.0078124995f));
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.08942837070713458d, 1.0000380832193412d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000380832193412d + "'", double2 == 1.0000380832193412d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.342161576411106E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000002742861d + "'", double1 == 1.0000000002742861d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(97.00001f, (float) 10240);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00001f + "'", float2 == 97.00001f);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        int int2 = org.apache.commons.math3.util.FastMath.max(8, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.742001862925077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.680043680710111d + "'", double1 == 1.680043680710111d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.8234668322384443d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(29.8285307045427d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.2755538279996634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.647849120599649d) + "'", double1 == (-0.647849120599649d));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5874010519681996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027705374906466698d + "'", double1 == 0.027705374906466698d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9999999954041073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735837697563d + "'", double1 == 0.8813735837697563d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 40);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7451131604793488d + "'", double1 == 0.7451131604793488d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 6.830189170012751E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.03835134389875404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007355029325014d + "'", double1 == 1.0007355029325014d);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.25132724169328774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.03109752538365459d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-3.6032287479334557d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6032287479334557d + "'", double1 == 3.6032287479334557d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-6.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8171205928321397d) + "'", double1 == (-1.8171205928321397d));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1.4210855E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        int int2 = org.apache.commons.math3.util.FastMath.min((-20), 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20) + "'", int2 == (-20));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-3), (long) (-43));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-43L) + "'", long2 == (-43L));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.0000002384185793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.086065389836995d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-4.663853435426824d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4359738368E10d, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.2601359015483735E210d + "'", double2 == 5.2601359015483735E210d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.7322058522179385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6685117558576993d + "'", double1 == 0.6685117558576993d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (-22.999999999999996d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.999999999999996d + "'", double2 == 22.999999999999996d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.6139677044391678d, 18.566355334451117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.576504158403857d + "'", double2 == 18.576504158403857d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0000005f + "'", float1 == 6.0000005f);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.932447891572509d + "'", double1 == 6.932447891572509d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 2147483648L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9713101757929392d) + "'", double1 == (-0.9713101757929392d));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 35.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860255526819485E15d + "'", double1 == 1.5860255526819485E15d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        int int2 = org.apache.commons.math3.util.FastMath.max(12, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1341L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double1 = org.apache.commons.math3.util.FastMath.log(217.3083407086277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.381317269906468d + "'", double1 == 5.381317269906468d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.5163575235272857E305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(127.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2165681500327987d + "'", double1 == 2.2165681500327987d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.7615941559557649d), (-0.03835134389875404d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005432722019315939d + "'", double2 == 0.005432722019315939d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.2165681500327987d, (-1023.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.139425923696039d + "'", double2 == 3.139425923696039d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.49361759023450513d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.000000000000001d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.6090486460720002d), 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6090486460720002d) + "'", double2 == (-1.6090486460720002d));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.05240777928304121d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3L, 0.3619730303123131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4883498444102827d + "'", double2 == 1.4883498444102827d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.289294390337419E-13d + "'", double1 == 7.289294390337419E-13d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8447979300678613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.006187413933411d + "'", double1 == 1.006187413933411d);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-4.9999995f), (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double2 = org.apache.commons.math3.util.FastMath.log(201.71315737027922d, 0.003905821484290615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0449307262679572d) + "'", double2 == (-1.0449307262679572d));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6098212688914123d, 0.9320815615055481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6098212688914123d + "'", double2 == 0.6098212688914123d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 4.60943587E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(44.742945770445154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6890168014772655d + "'", double1 == 6.6890168014772655d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-2L), 1.570796207585607d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9999999999999998d) + "'", double2 == (-1.9999999999999998d));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.8171205928321397d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8171205928321394d) + "'", double1 == (-1.8171205928321394d));
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 4096);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5705521861747473d + "'", double1 == 1.5705521861747473d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 0L, (-10.000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.000001f) + "'", float2 == (-10.000001f));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 61, (long) (-64));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 2147483647, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0017421870264488835d, (double) 1.71798692E10f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7179869184E10d + "'", double2 == 1.7179869184E10d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9988315234449244d, 0.15683098746077087d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9988315234449244d + "'", double2 == 0.9988315234449244d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(10.000000381469718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 2147483648L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 57, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.530993900237115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.71948894385969d + "'", double1 == 87.71948894385969d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4419647419307422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.228996546770822d + "'", double1 == 3.228996546770822d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.570743203905968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2532929441698648d + "'", double1 == 1.2532929441698648d);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.451956339039805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 23L, 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.1054274E-15f + "'", float2 == 7.1054274E-15f);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7771212476539429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175201377593356d + "'", double1 == 1.175201377593356d);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.48005689602103446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4475662160204272d) + "'", double1 == (-0.4475662160204272d));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8855630621884312d + "'", double1 == 1.8855630621884312d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4281861168052193d) + "'", double1 == (-0.4281861168052193d));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double1 = org.apache.commons.math3.util.FastMath.sin(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.30033084129497156d, 1.9242223034090244d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30033084129497156d + "'", double2 == 0.30033084129497156d);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        float float2 = org.apache.commons.math3.util.FastMath.max(20.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1920928955078128E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078071E-7d + "'", double1 == 1.1920928955078071E-7d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.25132724169328774d), (-43));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.8572599341406174E-14d) + "'", double2 == (-2.8572599341406174E-14d));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        float float2 = org.apache.commons.math3.util.FastMath.max(13.0f, (float) 511);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 511.0f + "'", float2 == 511.0f);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double2 = org.apache.commons.math3.util.FastMath.min(178.72171540421934d, 1.1742984407142925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1742984407142925d + "'", double2 == 1.1742984407142925d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        double double2 = org.apache.commons.math3.util.FastMath.min(5.686278854741452E8d, (-0.7422546989427481d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7422546989427481d) + "'", double2 == (-0.7422546989427481d));
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double2 = org.apache.commons.math3.util.FastMath.pow(97.00337450631281d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00337450631281d + "'", double2 == 97.00337450631281d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1023.5003663897733d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.304165199749413E-25d + "'", double2 == 8.304165199749413E-25d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-47));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-46.999996f) + "'", float1 == (-46.999996f));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-3.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.001739547024314626d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001739547024314626d + "'", double2 == 0.001739547024314626d);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5501637768927253E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 4096);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4096L + "'", long1 == 4096L);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 4.7683716E-7f, (double) 127.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.0d + "'", double2 == 127.0d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.855938105439101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.66662102809951d + "'", double1 == 8.66662102809951d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.770311529081762E34d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.477888730288475d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4778887302884747d + "'", double2 == 2.4778887302884747d);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.041914989933878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3282591674459436d + "'", double1 == 1.3282591674459436d);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        float float2 = org.apache.commons.math3.util.FastMath.min((-4.50359936E15f), 52.000008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.50359936E15f) + "'", float2 == (-4.50359936E15f));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.3407807929942597E154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.375668978229577E51d + "'", double1 == 2.375668978229577E51d);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.8146827137745345E-6d, 918246.8633045758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.100473137824136d) + "'", double2 == (-1.100473137824136d));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.038341943233852725d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.3679217745530282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.716558794242393d + "'", double1 == 0.716558794242393d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716549E22d + "'", double1 == 3.831008000716549E22d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.7037660722156223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6067528124138599d + "'", double1 == 0.6067528124138599d);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-6.0000005f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-6.0f) + "'", float1 == (-6.0f));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.25398147417648104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.827590827657173d + "'", double1 == 1.827590827657173d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.0690169939145268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06901699391452681d + "'", double1 == 0.06901699391452681d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (-5));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8.429369702178807E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.429369702178828E-8d + "'", double1 == 8.429369702178828E-8d);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.011377788717773903d), 0.001316561561093711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011453707279761109d + "'", double2 == 0.011453707279761109d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1.3642422E-12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.364242161078679E-12d + "'", double1 == 1.364242161078679E-12d);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.8146899896858893E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.759169725377571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7254077548329161d + "'", double1 == 0.7254077548329161d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.2500000298023224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25261234754667417d + "'", double1 == 0.25261234754667417d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(342.77469083470083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.839986474284048d + "'", double1 == 5.839986474284048d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5729.578388440339d, 2.251799813685248E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.578388440339d + "'", double2 == 5729.578388440339d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math3.util.FastMath.signum(37.58199470190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 511);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.624434178907251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 15L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.5703319211292674d, 2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5703319211292674d + "'", double2 == 1.5703319211292674d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265634252E-6d + "'", double1 == 3.814697265634252E-6d);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        double double1 = org.apache.commons.math3.util.FastMath.asin(308815.6692812608d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.989740156313126d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.008837862706914782d), (-64));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7150382808092726E131d + "'", double2 == 2.7150382808092726E131d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 4.547475E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.936841376125404E-15d + "'", double1 == 7.936841376125404E-15d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.6126152570659732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9114311069796792d + "'", double1 == 0.9114311069796792d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.5991832340437723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4694930201844715d + "'", double1 == 0.4694930201844715d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.31604169520790676d), 2.770311529081762E34d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.770311529081762E34d + "'", double2 == 2.770311529081762E34d);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.4152103671875394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007246787995837191d + "'", double1 == 0.007246787995837191d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8203432320660448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9057280121902186d + "'", double1 == 0.9057280121902186d);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-2.333512291668548E-8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3370040575450859E-6d) + "'", double1 == (-1.3370040575450859E-6d));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double1 = org.apache.commons.math3.util.FastMath.exp(39.960969282839415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.26374993599281344E17d + "'", double1 == 2.26374993599281344E17d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8342244122679194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9867247700414619d + "'", double1 == 0.9867247700414619d);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(83.9889793008241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.442521592799921d + "'", double1 == 4.442521592799921d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.2207031E-4f, 1.4377039151369548d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207033E-4f + "'", float2 == 1.2207033E-4f);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.7686346899325218d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7686346899325217d) + "'", double1 == (-0.7686346899325217d));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 20L, 3.1622777204840373d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999998f + "'", float2 == 19.999998f);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2291.83681708314d, 4.139937718785167E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267768328d + "'", double2 == 1.5707963267768328d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.710505431213761E-20d, 0.9319894546747586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.710505431213761E-20d + "'", double2 == 2.710505431213761E-20d);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.14748365E9f, 126.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        int int2 = org.apache.commons.math3.util.FastMath.max(61, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.05235987755982989d, (double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        int int2 = org.apache.commons.math3.util.FastMath.max(13, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.0078124995f), 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.6843544E8f) + "'", float2 == (-2.6843544E8f));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-2.9999995f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.298292365610485d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(167.65805815345627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.948283984893761d + "'", double1 == 12.948283984893761d);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 51.999992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9154893862782917E22d + "'", double1 == 1.9154893862782917E22d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-0.9999999f), 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.0017395461469968258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017410600350943942d + "'", double1 == 0.0017410600350943942d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(32768.004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.00390625f + "'", float1 == 0.00390625f);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.02711025494194475d, (double) 1341L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02711025494194475d + "'", double2 == 0.02711025494194475d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.000000000000002d, (-1.4731414029041368d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5452223306482584d + "'", double2 == 2.5452223306482584d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(58.99687729321487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6809424742810615d + "'", double1 == 7.6809424742810615d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(35.000003814697266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291206950246d + "'", double1 == 4.248291206950246d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.833101217706723E65d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.769163017341341E67d + "'", double1 == 2.769163017341341E67d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.04649127608358614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04647454434494028d + "'", double1 == 0.04647454434494028d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.3679217745530282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065655566820689d + "'", double1 == 0.6065655566820689d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(7.990534932436728E-20d, (-45));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.271046620432096E-33d + "'", double2 == 2.271046620432096E-33d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double2 = org.apache.commons.math3.util.FastMath.log(5120.0d, 0.04669075745245177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.35876846240963683d) + "'", double2 == (-0.35876846240963683d));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double2 = org.apache.commons.math3.util.FastMath.min(61.48000813767197d, 0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0689622149987218d + "'", double2 == 0.0689622149987218d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.24179962938945632d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.85409825184331d) + "'", double1 == (-13.85409825184331d));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(36.34183433862237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2082.2337273666712d + "'", double1 == 2082.2337273666712d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-5.9999995f), (-1.26765045E30f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 7, 1341L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1341L + "'", long2 == 1341L);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.9689257325599363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.51535513730588d + "'", double1 == 55.51535513730588d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.36008937454964746d, (-0.1469512391741817d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1619462940944618d + "'", double2 == 1.1619462940944618d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.9436221923009624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2334073464102067d) + "'", double1 == (-1.2334073464102067d));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(25.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math3.util.FastMath.asin(86.23874129193797d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double1 = org.apache.commons.math3.util.FastMath.tan(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5045996724459267d) + "'", double1 == (-2.5045996724459267d));
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2082.2337273666712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 13.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.003905821484290615d, 217.3083407086277d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-4.451746403021009d), 5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.505149978319906d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.001739547024314626d, 0.2160804420868575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2533449363319665d + "'", double2 == 0.2533449363319665d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.059306170823242965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0010350879476157858d + "'", double1 == 0.0010350879476157858d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.15748111057722322d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        long long2 = org.apache.commons.math3.util.FastMath.min(41L, (long) 17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0003709130602427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.0f, 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320668d + "'", double1 == 1.8184464592320668d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.36008937454964746d, 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7091941783435723d) + "'", double2 == (-0.7091941783435723d));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 100, 127L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.048297543927715d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 3.43597384E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2082.2337273666712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.34183433862237d + "'", double1 == 36.34183433862237d);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.17540341900446973d, (double) 6208);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.60943614E18f, (-0.25000003f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943614E18f + "'", float2 == 4.60943614E18f);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.8493111942973237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        long long2 = org.apache.commons.math3.util.FastMath.max(6L, (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.06901699391452681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4101902625061654d + "'", double1 == 0.4101902625061654d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.479213990324464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.1653466182558d + "'", double1 == 87.1653466182558d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 4L, 167.61264592409196d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0000005f + "'", float2 == 4.0000005f);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(40.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.324555320336759d + "'", double1 == 6.324555320336759d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.8813735870195429d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-41), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double2 = org.apache.commons.math3.util.FastMath.pow(32.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9226350743220142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5159112760417044d + "'", double1 == 1.5159112760417044d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.37140692824026045d, (-1.8171205928321397d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.048315279876172d + "'", double2 == 6.048315279876172d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-8));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.0d) + "'", double1 == (-8.0d));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073485E-6f + "'", float1 == 1.9073485E-6f);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.4495239865639748d, 0.5675658254707852d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7083824214526705d + "'", double2 == 0.7083824214526705d);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.477888730288475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3940818004634935d + "'", double1 == 0.3940818004634935d);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-7.139470776250983E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 6, (long) 32768);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.2879033166650653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.34724712939362723d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        long long2 = org.apache.commons.math3.util.FastMath.min(2147483647L, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(12.963213729101282d, 1.057175989960846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2771018495711308d + "'", double2 == 0.2771018495711308d);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.0787619161000124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6050373689981057d + "'", double1 == 0.6050373689981057d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.234375f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 15L, 1.609844813961006E59d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.609844813961006E59d + "'", double2 == 1.609844813961006E59d);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.335442656797612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.170182146449354d + "'", double1 == 4.170182146449354d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-7.961040229770445d), (-0.3619730303123131d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int int1 = org.apache.commons.math3.util.FastMath.round(6.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        int int2 = org.apache.commons.math3.util.FastMath.min((-10), (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 32768);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 1.0000002f, 3580.4237429416758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.792966096227409E-4d + "'", double2 == 2.792966096227409E-4d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.007246787995837191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.264803107213601E-4d + "'", double1 == 1.264803107213601E-4d);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-4.451746403021009d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1988261943012386d) + "'", double1 == (-2.1988261943012386d));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.25215889490171217d), (-0.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.930127763409804E14d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.136179572894461E74d + "'", double2 == 3.136179572894461E74d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(32768.0f, 20.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double1 = org.apache.commons.math3.util.FastMath.cos(5.2678643598200185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5273472658386653d + "'", double1 == 0.5273472658386653d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.4191249916881351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.431504208113316d + "'", double1 == 0.431504208113316d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(20.951580740511496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.28240466732647E8d + "'", double1 == 6.28240466732647E8d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        float float1 = org.apache.commons.math3.util.FastMath.abs(13.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.000002f + "'", float1 == 13.000002f);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(126.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.0f + "'", float1 == 127.0f);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.6764125919282525d), (-3.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6764125919282526d) + "'", double2 == (-0.6764125919282526d));
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7236894193081456d + "'", double1 == 1.7236894193081456d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-20.34331808359165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.0d) + "'", double1 == (-20.0d));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.6668288393884205d, (double) 41L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.033867943198054d + "'", double2 == 41.033867943198054d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2678316663569955d + "'", double1 == 5.2678316663569955d);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681098d + "'", double1 == 1.0986122886681098d);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-45));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 52.000008f, 0.7542142871583881d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.00000762939453d + "'", double2 == 52.00000762939453d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.150722216996343d + "'", double1 == 13.150722216996343d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.264803107213601E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2647231276124256E-4d + "'", double1 == 1.2647231276124256E-4d);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6931472401645883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1591745016093062d) + "'", double1 == (-0.1591745016093062d));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(8.414240048492133E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 1.827590827657173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 20);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.000000000000004d + "'", double1 == 20.000000000000004d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 143 + "'", int1 == 143);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.8203867151263053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6870488395503531d) + "'", double1 == (-0.6870488395503531d));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.4202879887985945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4202879887985946d + "'", double1 == 0.4202879887985946d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) -1, 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.8828125E-4f + "'", float2 == 4.8828125E-4f);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.34187215E17f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        int int2 = org.apache.commons.math3.util.FastMath.min((-45), (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-45) + "'", int2 == (-45));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        long long1 = org.apache.commons.math3.util.FastMath.round(10.000001907348633d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.209318697132464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.3106652354108d + "'", double1 == 66.3106652354108d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9998902999783974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014812294038651173d + "'", double1 == 0.014812294038651173d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.34187232E17f, (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.318351E15f + "'", float2 == 7.318351E15f);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.8354356841543302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2637391709123275d + "'", double1 == 0.2637391709123275d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-40));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 40, 5.2678316663569955d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.999996f + "'", float2 == 39.999996f);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.570796446004186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.3978727715165242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(61.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-5.026525594659021d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3176272142905816d) + "'", double1 == (-2.3176272142905816d));
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.435973836800001E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-64.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2726.8473976782693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.9527251448743153d, 1.059306170823243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.092207916817751d + "'", double2 == 4.092207916817751d);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-6));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double1 = org.apache.commons.math3.util.FastMath.log((-12.652395426951061d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.8295742568552614d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(918246.8633045758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.149548905166106d + "'", double1 == 1.149548905166106d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        int int1 = org.apache.commons.math3.util.FastMath.round(13.000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.5474735E-13f, 10.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5474735E-13f + "'", float2 == 4.5474735E-13f);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-64));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(127.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.7724538509055159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03093515553795393d + "'", double1 == 0.03093515553795393d);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0406192001624515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2388667589823472d + "'", double1 == 1.2388667589823472d);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.1858299335526885d, (-0.07466556700256388d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.033905810375780665d + "'", double2 == 0.033905810375780665d);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.31603134891816875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.107262486837385d + "'", double1 == 18.107262486837385d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.7179869184E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.998452823227115E8d + "'", double1 == 2.998452823227115E8d);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164059608E-7d + "'", double1 == 9.536743164059608E-7d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(20.0d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.0d + "'", double2 == 40.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1044889974911134d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double1 = org.apache.commons.math3.util.FastMath.log10(511.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.708420900134713d + "'", double1 == 2.708420900134713d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.1591745016093062d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15784367794247295d) + "'", double1 == (-0.15784367794247295d));
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.03109752538365459d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.7790360334325874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6521530660860766d + "'", double1 == 0.6521530660860766d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2400.8743011177776d, (-0.6332359729824427d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2400.8743011177776d) + "'", double2 == (-2400.8743011177776d));
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2430665.0174340946d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.8446744073709552E19d), 6.6917246496340396E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.844674407370955E19d) + "'", double2 == (-1.844674407370955E19d));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.9867717342662448d, 1.111657402027768E-64d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        float float1 = org.apache.commons.math3.util.FastMath.signum(52.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 52, 6208L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6208L + "'", long2 == 6208L);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 4.60943614E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 512.0d + "'", double1 == 512.0d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 8, (double) 3.43597384E11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.000001f + "'", float2 == 8.000001f);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.004363323650134475d, (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.817693203335117E-5d + "'", double2 == 6.817693203335117E-5d);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7852981633977816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657118983783288d + "'", double1 == 0.6657118983783288d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-5L), 0.49361759023450513d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.9999995f) + "'", float2 == (-4.9999995f));
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        float float1 = org.apache.commons.math3.util.FastMath.abs(126.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 126.99999f + "'", float1 == 126.99999f);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.1920928955078125E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.192092895507818E-7d) + "'", double1 == (-1.192092895507818E-7d));
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-2.067786496795693E-15d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.1411200080598672d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1411200080598672d + "'", double2 == 0.1411200080598672d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double1 = org.apache.commons.math3.util.FastMath.asin(52.00000762939454d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        long long2 = org.apache.commons.math3.util.FastMath.min(17L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.5641241260040846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2709183367248988d + "'", double1 == 1.2709183367248988d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.00883774765274219d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1023.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.0d) + "'", double1 == (-1023.0d));
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-50.416784829666135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double1 = org.apache.commons.math3.util.FastMath.log10(6.53313149942335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8151213997938502d + "'", double1 == 0.8151213997938502d);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.574743748882615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double1 = org.apache.commons.math3.util.FastMath.cos(96.99999237060547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251446403922804d) + "'", double1 == (-0.9251446403922804d));
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        int int1 = org.apache.commons.math3.util.FastMath.abs(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-47), 511L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 511L + "'", long2 == 511L);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-48.499996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(52.00000125906247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.7292653317441247d), 97.00317877887011d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7292653317441247d) + "'", double2 == (-0.7292653317441247d));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-18), (float) (-45));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-45.0f) + "'", float2 == (-45.0f));
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(97.0f, 10240);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5625f, 234683.5128855852d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5625001f + "'", float2 == 1.5625001f);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        long long2 = org.apache.commons.math3.util.FastMath.max((-20L), 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6483272471874993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9150314823146174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.5765379570909391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6144851831225425d + "'", double1 == 0.6144851831225425d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9316196464217202d, (double) 3.43597384E11f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9316196464217202d + "'", double2 == 0.9316196464217202d);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        int int2 = org.apache.commons.math3.util.FastMath.max((-2147483648), 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.07963789922157d) + "'", double1 == (-40.07963789922157d));
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 15);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }
}

