import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.29180551394311227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(39.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.0f + "'", float1 == 40.0f);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-103.27892990343184d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9947461586351523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8386207217913931d + "'", double1 == 0.8386207217913931d);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.0690169939145268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07145441719841798d + "'", double1 == 0.07145441719841798d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -1, 32768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32768L + "'", long2 == 32768L);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9630809759170001d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3373311242674155E15d + "'", double2 == 4.3373311242674155E15d);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.896280957292998E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-1.192092895507818E-7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-2L), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6482076576793505d, 0.15156283651453492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0786758194172248d + "'", double2 == 1.0786758194172248d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.5012874926078866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.045710243667332d + "'", double1 == 1.045710243667332d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.33656885961385924d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5639495664692888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9415488690011974d + "'", double1 == 0.9415488690011974d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0010350879476157858d, (double) 511L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0256124219459297E-6d + "'", double2 == 2.0256124219459297E-6d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 35.000004f, (double) 127.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000381469727d + "'", double2 == 35.00000381469727d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5705521861747473d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.559492086485665d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.999999995877696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718281817253461d + "'", double1 == 1.718281817253461d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(8.318010277546872d, 75.04851188756716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.318010277546872d + "'", double2 == 8.318010277546872d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.5565058722645064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2545302486183726d) + "'", double1 == (-0.2545302486183726d));
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0d, 2.855938105439101d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3557196474339015d + "'", double1 == 1.3557196474339015d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        long long2 = org.apache.commons.math3.util.FastMath.max(97L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.4778572443836295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5202037405680986d + "'", double1 == 0.5202037405680986d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.231911890816295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.231911890816295d + "'", double1 == 2.231911890816295d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double double1 = org.apache.commons.math3.util.FastMath.cos(49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9636420976395077d + "'", double1 == 0.9636420976395077d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.08037189100331499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08028561264079306d + "'", double1 == 0.08028561264079306d);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-2.9999993f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.761594175364013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657695131881509d + "'", double1 == 0.8657695131881509d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.3282591674459436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3282591674459439d + "'", double1 == 1.3282591674459439d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.6312874611808647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6312874611808648d + "'", double1 == 0.6312874611808648d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double1 = org.apache.commons.math3.util.FastMath.acos(71.55417527999327d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.7592186044416E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26007.978835446982d + "'", double1 == 26007.978835446982d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(4.248291097914389d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1087.5625210660835d + "'", double2 == 1087.5625210660835d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.998096277817887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9638928334035648d) + "'", double1 == (-0.9638928334035648d));
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.4212655272004053d), 1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0442461145352135E-15d) + "'", double2 == (-4.0442461145352135E-15d));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-103.27892990343184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.271046620432096E-33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-43L), 1.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-43.0f) + "'", float2 == (-43.0f));
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-5.418539921951662d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.6459510640684992d, 17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 84666.09786958633d + "'", double2 == 84666.09786958633d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 1.1129900353232505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1129900353232505d + "'", double2 == 1.1129900353232505d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.024600920295739914d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.07804867017443E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0780486688851E-10d + "'", double1 == 5.0780486688851E-10d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.465190328815662E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.465190328815662E-32d + "'", double1 == 2.465190328815662E-32d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9226938919179323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7972307452260529d + "'", double1 == 0.7972307452260529d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.011035410141815d, 0.5889395478952119d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17694219171363745d + "'", double2 == 0.17694219171363745d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.2351647362715017E-22d, 0.8202965860187449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8202965860187449d + "'", double2 == 0.8202965860187449d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.006142729981775035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000018866625139d + "'", double1 == 1.000018866625139d);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int int1 = org.apache.commons.math3.util.FastMath.abs(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int int2 = org.apache.commons.math3.util.FastMath.max(127, (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.3589153218773263d), 0.010200777470529932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3589153218773262d) + "'", double2 == (-0.3589153218773262d));
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math3.util.FastMath.tan(26.028944477141252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2503789711675604d + "'", double1 == 1.2503789711675604d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.6890168014772655d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.05930617082324296d, (double) 97.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6193427181221283d) + "'", double2 == (-1.6193427181221283d));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17364817766693036d + "'", double1 == 0.17364817766693036d);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int int2 = org.apache.commons.math3.util.FastMath.max(4096, 143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.004433615348723692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00000982848863d + "'", double1 == 1.00000982848863d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8758186937926167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.790784730303113d + "'", double1 == 0.790784730303113d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-50.416784829666135d), (double) 57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.416784829666135d + "'", double2 == 50.416784829666135d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 35L, 0.9990439103118804d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double2 = org.apache.commons.math3.util.FastMath.pow(26007.978835446982d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.917242934814408E30d, 3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0586440673137732E108d + "'", double2 == 2.0586440673137732E108d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9689257325599362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2499461922437631d + "'", double1 == 0.2499461922437631d);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.8446744073709552E19d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.844674407370955E19d) + "'", double1 == (-1.844674407370955E19d));
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int int1 = org.apache.commons.math3.util.FastMath.abs(63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1787.2171540421934d, (-0.9999999958776927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.59529114079855E-4d + "'", double2 == 5.59529114079855E-4d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2461900271072904d + "'", double1 == 0.2461900271072904d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(13.991872622830142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2442042457880407d + "'", double1 == 0.2442042457880407d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 48.499992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574817085510256d + "'", double1 == 4.574817085510256d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-43));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(262.6992857325621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.135079543932437E113d + "'", double1 == 6.135079543932437E113d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.2500000298023224d, 4.60259780461459d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2500000298023224d + "'", double2 == 0.2500000298023224d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.086065389836995d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-0.0234375f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(97.00337450631281d, 1.3383449299268079E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3383449299268079E42d + "'", double2 == 1.3383449299268079E42d);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8886102.046056528d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.003906251f, 51.999992f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.999992f + "'", float2 == 51.999992f);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5707963233903062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963233903064d + "'", double1 == 1.5707963233903064d);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.18710109962234836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 3.4359738E10f, 2.2138714234833596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4359738368E10d + "'", double2 == 3.4359738368E10d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.0d), (-0.3475105776468364d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int int1 = org.apache.commons.math3.util.FastMath.round(127.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.11146324526556185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.111232584350277d + "'", double1 == 0.111232584350277d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5707894966057265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707894966057265d + "'", double1 == 1.5707894966057265d);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7949487914783152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.926359837370816d + "'", double1 == 0.926359837370816d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6050373689981057d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.8823852309817808E12d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963150940687d + "'", double2 == 1.5707963150940687d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.917242934814409E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-41));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 41.0f + "'", float1 == 41.0f);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885906d + "'", double1 == 3.2710663101885906d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.849105967630261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0730285661552832d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5365142830776416d + "'", double2 == 0.5365142830776416d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.3807463595665448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8470815039964497d + "'", double1 == 0.8470815039964497d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        double double1 = org.apache.commons.math3.util.FastMath.floor(200.5576604135868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.9637866463273798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9817263602080673d + "'", double1 == 0.9817263602080673d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.34187232E17f, (float) (-2147483648));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748365E9f) + "'", float2 == (-2.14748365E9f));
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.236696324052198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3077829609715157d + "'", double1 == 1.3077829609715157d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double1 = org.apache.commons.math3.util.FastMath.log(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(99.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.9498743710662d + "'", double1 == 9.9498743710662d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.8E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.830189984234749E-6d + "'", double1 == 6.830189984234749E-6d);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.431504208113316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(7.8962960182679E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.693147180559926d + "'", double1 == 32.693147180559926d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.2449186904183345d), 0.7771212476539429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.30530773052749755d) + "'", double2 == (-0.30530773052749755d));
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double1 = org.apache.commons.math3.util.FastMath.log((-16.99798027287595d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.010200423675724124d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.24179962938945632d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2768075870968782d) + "'", double1 == (-0.2768075870968782d));
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.09983440995178776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950404679581999d + "'", double1 == 0.09950404679581999d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 143L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 143 + "'", int1 == 143);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0017410600350943942d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 20.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.0d + "'", double1 == 20.0d);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5538479001269114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.729634373889186d + "'", double1 == 3.729634373889186d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 3, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.6102871923992833E-232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6102871923992833E-232d + "'", double1 == 1.6102871923992833E-232d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.243059748365023E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.24305788136677E-4d + "'", double1 == 8.24305788136677E-4d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9738830555738022d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5027863216186397d + "'", double1 == 0.5027863216186397d);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0919948905169028d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0919948905169028d + "'", double2 == 1.0919948905169028d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (-0.9251446403922804d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-35.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.248699261236361d) + "'", double1 == (-4.248699261236361d));
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) '#', (float) 20L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-9.094947017543031E-13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326795806d + "'", double1 == 1.570796326795806d);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.66334748188207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7238497818898454d) + "'", double1 == (-0.7238497818898454d));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.9999999f), (-4.50359936E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9999999f) + "'", float2 == (-1.9999999f));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(142.97737232337548d, 0.2504230129550942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5690448415576774d + "'", double2 == 1.5690448415576774d);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.5907060326513854d), 0.047442967903742035d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.9729356641052036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2951129234784172d + "'", double1 == 0.2951129234784172d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int int2 = org.apache.commons.math3.util.FastMath.max((-511), (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-511) + "'", int2 == (-511));
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.6839128558975155d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6318307327098474d) + "'", double1 == (-0.6318307327098474d));
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.3012989023072956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012989023072956d + "'", double1 == 2.3012989023072956d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 61L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.9638928334035648d), 3.8146899896858893E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8146899896858893E-6d + "'", double2 == 3.8146899896858893E-6d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8813616205677707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(52.00000762939453d, 14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.00000762939453d + "'", double2 == 52.00000762939453d);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9999976526417022d), 0.4202879887985945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1594216750445131d) + "'", double2 == (-0.1594216750445131d));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-64));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 64.0f + "'", float1 == 64.0f);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(13.000000953674316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 221206.90696257527d + "'", double1 == 221206.90696257527d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.04672471609974032d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092895507807E-7d + "'", double1 == 1.192092895507807E-7d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double2 = org.apache.commons.math3.util.FastMath.min((-4.0d), 1.838266827E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.0d) + "'", double2 == (-4.0d));
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 0.9999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574073163013131d + "'", double1 == 1.5574073163013131d);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double2 = org.apache.commons.math3.util.FastMath.pow(9.587379894910212E-5d, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.135016052687385E72d + "'", double2 == 2.135016052687385E72d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.8414675156134573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17260786905128284d) + "'", double1 == (-0.17260786905128284d));
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.010200069899324196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010200069899324198d + "'", double1 == 0.010200069899324198d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5395564933646286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9120458137799814d + "'", double1 == 0.9120458137799814d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.07336779761599267d), 1.162447350492738d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.986771734266245d, 3.1411515911684713d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6672556629700335d + "'", double2 == 1.6672556629700335d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0957085725200884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9474571177029998d + "'", double1 == 0.9474571177029998d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.018531076210112E-36d, (-0.07459621024323529d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 423.95184634229605d + "'", double2 == 423.95184634229605d);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6400.0f, (double) 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6399.9995f + "'", float2 == 6399.9995f);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(42875.01401901398d, 1.570796326793987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707596901578709d + "'", double2 == 1.5707596901578709d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-2.9999993f), 27.028944477141252d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.999999f) + "'", float2 == (-2.999999f));
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.6881171418161356E43d, (-40.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.0d) + "'", double2 == (-40.0d));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.025974927644697554d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02564048120945308d) + "'", double1 == (-0.02564048120945308d));
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double2 = org.apache.commons.math3.util.FastMath.min(1664.0d, (double) 2147483648L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1664.0d + "'", double2 == 1664.0d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.026187963170189E-10d, (-40));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.333125155264397E-23d + "'", double2 == 9.333125155264397E-23d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        float float2 = org.apache.commons.math3.util.FastMath.max(6399.9995f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6399.9995f + "'", float2 == 6399.9995f);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.5036002E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(74.54992027339121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0689622149987218d, 1.2676506002282294E30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0689622149987218d + "'", double2 == 0.0689622149987218d);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-0.0078124995f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0078124200636759305d) + "'", double1 == (-0.0078124200636759305d));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 0.00390625f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003906250000000001d + "'", double1 == 0.003906250000000001d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.5677061957752959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9670794998512874d + "'", double1 == 0.9670794998512874d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1087.5625210660835d, 0.038581122605965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3096336127335875d + "'", double2 == 1.3096336127335875d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.298342441900717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6673940248314076d + "'", double1 == 1.6673940248314076d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-16.99798027287595d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2053107787393773E7d + "'", double1 == 1.2053107787393773E7d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.9999957691935532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math3.util.FastMath.exp(35840.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(12.963213729101282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999890017d + "'", double1 == 0.9999999999890017d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.10471975511965978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09959168752759735d + "'", double1 == 0.09959168752759735d);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.917242934814408E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int int2 = org.apache.commons.math3.util.FastMath.max(143, (-511));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 143 + "'", int2 == 143);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2430665.0174340946d, 6208);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.010200069899324198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7802480367677377E-4d + "'", double1 == 1.7802480367677377E-4d);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.3589153218773262d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35162459398204665d) + "'", double1 == (-0.35162459398204665d));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.08037538236017183d, (double) 7.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01148169291234465d + "'", double2 == 0.01148169291234465d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0039062505f, (-0.0174532946005379d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.00390625f + "'", float2 == 0.00390625f);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.986771734266245d, 1.059306170823243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0693311117004427d + "'", double2 == 2.0693311117004427d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.5000000000000001d, 1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9867717342662448d + "'", double2 == 1.9867717342662448d);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5707962075856141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962075856141d + "'", double1 == 1.5707962075856141d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-2025.4348094013415d), 45.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43480940134145385d) + "'", double2 == (-0.43480940134145385d));
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        float float2 = org.apache.commons.math3.util.FastMath.max(13.000002f, (float) (-15));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.000002f + "'", float2 == 13.000002f);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.033905810375780665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-43L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(52.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 6.236369590203704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(37648.554832912145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 61, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1998848.0f + "'", float2 == 1998848.0f);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-40));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 40L + "'", long1 == 40L);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) -1, (float) (-20L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-20.0f) + "'", float2 == (-20.0f));
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.145966026289347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.216671029936877d + "'", double1 == 4.216671029936877d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.028690618287860615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02869849442074743d) + "'", double1 == (-0.02869849442074743d));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.0000005f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0000005f + "'", float2 == 4.0000005f);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5271361867276063d, (double) (-64L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5271361867276063d + "'", double2 == 1.5271361867276063d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math3.util.FastMath.tan(9.38970161056691E-191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.38970161056691E-191d + "'", double1 == 9.38970161056691E-191d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.012777554145719352d, 0.7451131604793488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012777554145719352d + "'", double2 == 0.012777554145719352d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 97, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.4210856E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9115170270339398d, 8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 233.34835892068858d + "'", double2 == 233.34835892068858d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        long long1 = org.apache.commons.math3.util.FastMath.abs(19121396171L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 19121396171L + "'", long1 == 19121396171L);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7310884693105406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.49174338951939384d, 3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13743892845200512d + "'", double2 == 0.13743892845200512d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double2 = org.apache.commons.math3.util.FastMath.min(54.598150033144236d, 9.9498743710662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.9498743710662d + "'", double2 == 9.9498743710662d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5106521020275598d, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3572921578340105d + "'", double2 == 3.3572921578340105d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-5.314369626254345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662760623689684d + "'", double1 == 0.5662760623689684d);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int int1 = org.apache.commons.math3.util.FastMath.round(24.249996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(32768.004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 9.536744E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6644758797204874E-8d + "'", double1 == 1.6644758797204874E-8d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.8104779544189764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3377546286248103d + "'", double1 == 1.3377546286248103d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.048315279876172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double1 = org.apache.commons.math3.util.FastMath.asin(342.7746908347008d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        float float2 = org.apache.commons.math3.util.FastMath.max(1024.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int int2 = org.apache.commons.math3.util.FastMath.min((-5), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(18.566355334451117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6152227308893874d + "'", double1 == 3.6152227308893874d);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.4301970842553728E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.9999515809042513d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 2.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.551479194223533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 4096L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7396130970112139d) + "'", double1 == (-0.7396130970112139d));
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.6067528124138599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5418372822686712d + "'", double1 == 0.5418372822686712d);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double1 = org.apache.commons.math3.util.FastMath.signum(83.99396873060411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.1592259218842048d), (-0.9888410855273345d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0015785474074175d + "'", double2 == 1.0015785474074175d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-2025.4348094013415d), 1.0044884011988755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2025.4348094013415d + "'", double2 == 2025.4348094013415d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-7.961040229770445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.151039979174052E54d + "'", double1 == 7.151039979174052E54d);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9637866463273798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5704138929841513d + "'", double1 == 0.5704138929841513d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-57.29577951308232d), 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.295779513082316d) + "'", double2 == (-57.295779513082316d));
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-3), (long) 20);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.5424980429823686E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424980368655922E-4d) + "'", double1 == (-1.5424980368655922E-4d));
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.8386207217913931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6090156828024733d + "'", double1 == 0.6090156828024733d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-40.63159692392033d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.63159692392033d + "'", double1 == 40.63159692392033d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.547475E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5474757E-13f + "'", float1 == 4.5474757E-13f);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1230445261115651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.374455756373859d + "'", double1 == 1.374455756373859d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.403906158347758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41578279837355414d + "'", double1 == 0.41578279837355414d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.033905810375780665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03391880910465605d + "'", double1 == 0.03391880910465605d);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9226350743220142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7451808536350516d + "'", double1 == 0.7451808536350516d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9561803165529644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4168078270786288d + "'", double1 == 1.4168078270786288d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.8813735870195429d), 0.9515334276328968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195428d) + "'", double2 == (-0.8813735870195428d));
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.530993900237115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9921955351779619d + "'", double1 == 0.9921955351779619d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.8104779544189764d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0274087022410345d) + "'", double1 == (-0.0274087022410345d));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 5120.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.234056889056756d + "'", double1 == 9.234056889056756d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(7.936841376125404E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3852401422190596E-16d + "'", double1 == 1.3852401422190596E-16d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        int int2 = org.apache.commons.math3.util.FastMath.max((-20), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6931471805599463d, 6208);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-17.789481822638468d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        int int1 = org.apache.commons.math3.util.FastMath.abs(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.2334031175107285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.66879307164307d + "'", double1 == 70.66879307164307d);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.2755538279996634d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2755538279996634d + "'", double2 == 2.2755538279996634d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 212);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 212.0f + "'", float2 == 212.0f);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.1175823681357508E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357513E-22d + "'", double1 == 2.1175823681357513E-22d);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(35.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.8987804897672533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 4.60943642E18f, (double) (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6094364176369577E18d + "'", double2 == 4.6094364176369577E18d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.141592653577698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8115262724567918d + "'", double1 == 1.8115262724567918d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.08037538236017183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0836937908647455d + "'", double1 == 1.0836937908647455d);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.49904707604701226d, 37648.55483291208d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-15.158587692981909d) + "'", double2 == (-15.158587692981909d));
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.661538308752004E-256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.661538308752004E-256d + "'", double1 == 1.661538308752004E-256d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math3.util.FastMath.asin(403.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(200.5576604135868d, (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.133713443962294d + "'", double2 == 3.133713443962294d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.34187232E17f, (double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.34187215E17f + "'", float2 == 2.34187215E17f);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(8.372274544049185d, 0.9670794998512874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4557962137284877d + "'", double2 == 1.4557962137284877d);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 16.0f, 0.5012874926078866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.007850859820163d + "'", double2 == 16.007850859820163d);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.046457816219764414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.15683098746077087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14568435928763313d + "'", double1 == 0.14568435928763313d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.6459510640684992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6918184078520578d + "'", double1 == 0.6918184078520578d);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.017453292519943292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745152054354153d + "'", double1 == 0.01745152054354153d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32, (-6.4851835E18f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.364242E-12f, 2.769163017341341E67d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.3642422E-12f + "'", float2 == 1.3642422E-12f);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.43480940134145385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double1 = org.apache.commons.math3.util.FastMath.acos(22.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2840254166877415d + "'", double1 == 0.2840254166877415d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 'a', 2.451956339039805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.451956339039805d + "'", double2 == 2.451956339039805d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.3589153218773263d), 0.7037660722156223d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        long long1 = org.apache.commons.math3.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.007246787995837191d, 1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007246787995837191d + "'", double2 == 0.007246787995837191d);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.6321205369012336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2550831292576428d + "'", double1 == 2.2550831292576428d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.216671029936877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1178264797638153d + "'", double1 == 2.1178264797638153d);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.141592653577698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.4281861168052193d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.43583995307413204d, 2980.95656561053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43583995307413204d + "'", double2 == 0.43583995307413204d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.4821177017291658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38252562031484383d) + "'", double1 == (-0.38252562031484383d));
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(35840.0d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.23145302310912E15d + "'", double2 == 1.23145302310912E15d);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.2461900271072904d, 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1087413143427254E15d + "'", double2 == 1.1087413143427254E15d);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int int2 = org.apache.commons.math3.util.FastMath.max((-15), 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2147483648), (-10.000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.000001f) + "'", float2 == (-10.000001f));
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-2.6843544E8f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.68435424E8f) + "'", float1 == (-2.68435424E8f));
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.07466556700256388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6455314445180025d + "'", double1 == 1.6455314445180025d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-45));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45L + "'", long1 == 45L);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-6));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999237060547d + "'", double1 == 96.99999237060547d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.19366190374515743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.896280957292919E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999998092651367d + "'", double1 == 31.999998092651367d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double2 = org.apache.commons.math3.util.FastMath.min((-1.0593060930408005d), 0.22034127188586755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0593060930408005d) + "'", double2 == (-1.0593060930408005d));
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 32768L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 48.499992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 4.1661186E11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1661186048E11d + "'", double1 == 4.1661186048E11d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.4990470760470123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008710014599470893d + "'", double1 == 0.008710014599470893d);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-47), (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47L) + "'", long2 == (-47L));
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-40.999992f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.999992f + "'", float1 == 40.999992f);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(10.536049848239344d, 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.04665687272850968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04662306166012417d + "'", double1 == 0.04662306166012417d);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.917242934814408E30d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 101 + "'", int1 == 101);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9974947163822921d), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9228674459840319d + "'", double2 == 0.9228674459840319d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.1920932E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4210855E-14f + "'", float1 == 1.4210855E-14f);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.000000238418579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8203432320660448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8203432320660448d + "'", double1 == 0.8203432320660448d);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.9999999999795215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794411789759d + "'", double1 == 0.3678794411789759d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.1386403142805372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2883857609048466d + "'", double1 == 1.2883857609048466d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.60943614E18f, 40.74862735876591d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943587E18f + "'", float2 == 4.60943587E18f);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5707962635746238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158266504217837d + "'", double1 == 0.45158266504217837d);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 63);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.25301447720775033d, 5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25301447720775033d + "'", double2 == 0.25301447720775033d);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.0000001f, 6208.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6208.0005f + "'", float2 == 6208.0005f);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.369491427691419d, 4.2351647362715017E-22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.369491427691419d + "'", double2 == 4.369491427691419d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.34217728E8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.34217728E8f + "'", float1 == 1.34217728E8f);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.2900529801620624E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16384.0d + "'", double1 == 16384.0d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.4598080049531081d, 0.19486509830693569d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4598080049531081d + "'", double2 == 0.4598080049531081d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.9999999f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double1 = org.apache.commons.math3.util.FastMath.sin(9.331929865381182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09271474921759197d + "'", double1 == 0.09271474921759197d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.34187198E17f, (float) (-5));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.34187198E17f) + "'", float2 == (-2.34187198E17f));
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-2.34187198E17f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.839986434268865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.839986434268865d + "'", double1 == 5.839986434268865d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double2 = org.apache.commons.math3.util.FastMath.pow(14.740893838589704d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47216.661210973005d + "'", double2 == 47216.661210973005d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.7419819752357887d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.12887618051864808d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.045710243667332d, 7.642595581082662E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.42826253011881144d), 100.00000762939452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42826253011881144d + "'", double2 == 0.42826253011881144d);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        int int2 = org.apache.commons.math3.util.FastMath.max(10, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-40.999996f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7310884693105406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7310884693105406d + "'", double1 == 0.7310884693105406d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, 143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 143 + "'", int2 == 143);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.07946262386988323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.552872976779822d + "'", double1 == 4.552872976779822d);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        long long2 = org.apache.commons.math3.util.FastMath.min(52L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        int int1 = org.apache.commons.math3.util.FastMath.round(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 17);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(10.536076409331102d, 1.9073485191245059E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.5360764093311d + "'", double2 == 10.5360764093311d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9988007752196233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1733515377169321d + "'", double1 == 1.1733515377169321d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-40.63159692392033d), 511);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.723903237213851E155d) + "'", double2 == (-2.723903237213851E155d));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.008837747656336603d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837747656336603d) + "'", double2 == (-0.008837747656336603d));
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(41.0f, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41984.0f + "'", float2 == 41984.0f);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6098212688914123d, (double) 20.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0588446827334096E-5d + "'", double2 == 5.0588446827334096E-5d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.02711025494194475d, 10.142417859574152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0026729514355119965d + "'", double2 == 0.0026729514355119965d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(205143.1693389912d, (-16.99798027287595d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.454574348638161d) + "'", double2 == (-5.454574348638161d));
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-6.4851835E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.95838028577866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1429.7186889891823d + "'", double1 == 1429.7186889891823d);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 100, (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0204957449291814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7745699020368657d + "'", double1 == 2.7745699020368657d);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math3.util.FastMath.asin(221206.90696257527d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 40, 35840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.0f + "'", float2 == 40.0f);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.04669075745245177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04672473093607536d) + "'", double1 == (-0.04672473093607536d));
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01186997206940303d + "'", double1 == 0.01186997206940303d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.008727310882701312d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(35.000003814697266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 128.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.2566139548000526d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5295813285302078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.616243728115757d + "'", double1 == 3.616243728115757d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.000000000000002d, 0.02711357689300422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0003675054958237d + "'", double2 == 1.0003675054958237d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8813616205677708d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-64.0d), (-0.9713101757929392d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-63.99999999999999d) + "'", double2 == (-63.99999999999999d));
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9801475222605264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-7), 43);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1572651E13f) + "'", float2 == (-6.1572651E13f));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(58.996877293214865d, 5.26788464966007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.996877293214865d + "'", double2 == 58.996877293214865d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.01148169291234465d, (double) (-20.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011481692912344648d + "'", double2 == 0.011481692912344648d);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 20);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5208379310729538d + "'", double1 == 1.5208379310729538d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32, 6400.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.991989996645917E-56d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.991989996645917E-56d + "'", double1 == 6.991989996645917E-56d);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.7755575615628914E-17d, 103.1321804295218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.691262368354216E-19d + "'", double2 == 2.691262368354216E-19d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 2.9999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122091952468d + "'", double1 == 1.0986122091952468d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double2 = org.apache.commons.math3.util.FastMath.pow(39.960969282839415d, 4.476961205229636d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4806837110361924E7d + "'", double2 == 1.4806837110361924E7d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.6332359729824425d), 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000001d + "'", double2 == 100.00000000000001d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(13.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.5956484387948465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.51810465375112d) + "'", double1 == (-0.51810465375112d));
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.741450291257945d) + "'", double1 == (-4.741450291257945d));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        int int2 = org.apache.commons.math3.util.FastMath.min((-20), (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.7396130970112139d), 1.530993900237115d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.530993900237115d + "'", double2 == 1.530993900237115d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        long long1 = org.apache.commons.math3.util.FastMath.round(2560.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2560L + "'", long1 == 2560L);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.3282591674459439d, (double) 40.999992f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.0215022494985d + "'", double2 == 41.0215022494985d);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.318351E15f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 2147483648L, 14.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.2533140897578763d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.0039062505f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.656613E-10f + "'", float1 == 4.656613E-10f);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.216671029936877d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        float float2 = org.apache.commons.math3.util.FastMath.min((-40.0f), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.0f) + "'", float2 == (-40.0f));
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.00000982848863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931520947921855d + "'", double1 == 0.6931520947921855d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(39.99489718105814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6980426398060633d + "'", double1 == 0.6980426398060633d);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.005405263502771015d, (-28.59329123583804d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.59329174674238d + "'", double2 == 28.59329174674238d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6399.9995f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.5146893481167586d, (double) 20L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5146893481167586d + "'", double2 == 0.5146893481167586d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double1 = org.apache.commons.math3.util.FastMath.abs(178.72171540421934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 178.72171540421934d + "'", double1 == 178.72171540421934d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(10.754065986323363d, 3580.56673991988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3580.582889552442d + "'", double2 == 3580.582889552442d);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.25398147417648104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25398147417648104d + "'", double1 == 0.25398147417648104d);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.570796263574624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415566677401863d + "'", double1 == 0.027415566677401863d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-5.314369626254345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3722982078608363d) + "'", double1 == (-2.3722982078608363d));
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-3.1362674922625857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1362673894330163E-4d) + "'", double1 == (-3.1362673894330163E-4d));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(214.56664193281875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.657351729889458E92d + "'", double1 == 7.657351729889458E92d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double1 = org.apache.commons.math3.util.FastMath.log((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.34187232E17f, 26.028944477141252d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.34187215E17f + "'", float2 == 2.34187215E17f);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5403023058681398d, 101);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3698290846768875E30d + "'", double2 == 1.3698290846768875E30d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0007355029325014d, 1.0571243112754385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0571243112754385d + "'", double2 == 1.0571243112754385d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 212);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 212L + "'", long1 == 212L);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, (-43));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.6809424742810615d, 2.3012989023072956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3012989023072956d + "'", double2 == 2.3012989023072956d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0272356433040997d, 37.58199470190802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027235643304099704d + "'", double2 == 0.027235643304099704d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.163604101989394d, 0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.163604101989394d + "'", double2 == 4.163604101989394d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-4.9999995f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.04647454434494028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.30033084129497156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.20768966381521d + "'", double1 == 17.20768966381521d);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 10240, 4096.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(53.598150033144286d, (-0.7170536970566798d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1808772461066962d) + "'", double2 == (-0.1808772461066962d));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.8234668322384443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6769523912947569d) + "'", double1 == (-0.6769523912947569d));
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-4.45174640302101d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011658189284762348d + "'", double1 == 0.011658189284762348d);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double1 = org.apache.commons.math3.util.FastMath.log10(10.754065986323363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0315726969549555d + "'", double1 == 1.0315726969549555d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3365629458057544d) + "'", double1 == (-0.3365629458057544d));
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.48005689602103446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7830044631770386d) + "'", double1 == (-0.7830044631770386d));
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-15));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 23.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.35283248861753d + "'", double1 == 1.35283248861753d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9689257325599363d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(268.5850815956288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 269.0d + "'", double1 == 269.0d);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 5, (float) 17L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double2 = org.apache.commons.math3.util.FastMath.log(234.24476918014662d, 2560.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4382762607469872d + "'", double2 == 1.4382762607469872d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7046939980071439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8765643933442516d + "'", double1 == 0.8765643933442516d);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.897326848573678E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015737012016824304d + "'", double1 == 0.015737012016824304d);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 143, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.9073485191245059E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9073467001376322E-6d + "'", double1 == 1.9073467001376322E-6d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.5403021052458078d, 0.8742173026236351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5535794068709521d + "'", double2 == 0.5535794068709521d);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.5947194678480481d), 0.8621853758445391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.594719467848048d) + "'", double2 == (-0.594719467848048d));
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.661538308752004E-256d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math3.util.FastMath.exp(18.576504158403857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1686198234960486E8d + "'", double1 == 1.1686198234960486E8d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.630098322598115d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        long long1 = org.apache.commons.math3.util.FastMath.abs(4096L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4096L + "'", long1 == 4096L);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        int int1 = org.apache.commons.math3.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(234683.5128855852d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.7364591792920476d, 2153.2980413900355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7364591792920478d + "'", double2 == 1.7364591792920478d);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.1386403142805372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5039721130981178d + "'", double1 == 1.5039721130981178d);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.657902946836444E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962602158672d + "'", double1 == 1.5707962602158672d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        long long2 = org.apache.commons.math3.util.FastMath.min(2147483648L, (long) 4096);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.7076170222418037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9906546409887176d + "'", double1 == 0.9906546409887176d);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 6L, (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.288818359375E-5d + "'", double2 == 2.288818359375E-5d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.1920929E-7f, (-5.9999995f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(Double.NaN, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        long long2 = org.apache.commons.math3.util.FastMath.max(40L, 87L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 87L + "'", long2 == 87L);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7788007598613332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6616802494589067d + "'", double1 == 0.6616802494589067d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.7019294127099711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7019294127099713d + "'", double1 == 1.7019294127099713d);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6390573296152584d + "'", double1 == 2.6390573296152584d);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 13.000003f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 511, (long) (-18));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 40, (double) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.000004f + "'", float2 == 40.000004f);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0175545319252317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7664212902364116d + "'", double1 == 2.7664212902364116d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.759258273186885E-38d, 0.8337692064667246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.321378896348242E-32d + "'", double2 == 3.321378896348242E-32d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.25000003f), 8192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.25000003f) + "'", float2 == (-0.25000003f));
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6.4851835E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6207.9995f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6207.9995f + "'", float1 == 6207.9995f);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 6.8719477E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 262144.0d + "'", double1 == 262144.0d);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.000583639724013d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.000583639724013d + "'", double2 == 6.000583639724013d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.42826253011881144d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41614683654714246d) + "'", double1 == (-0.41614683654714246d));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-45), 48.499996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-4.821637045374455E-17d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }
}

