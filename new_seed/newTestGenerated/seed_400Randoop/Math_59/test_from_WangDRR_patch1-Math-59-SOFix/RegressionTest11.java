import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7529602598008407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03059492819013987d + "'", double1 == 0.03059492819013987d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3165695056594996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.43878905260671d), 3.292518932727564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4387890526067095d) + "'", double2 == (-2.4387890526067095d));
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4879294468412729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        long long2 = org.apache.commons.math.util.FastMath.min(11013L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 416128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416128 + "'", int1 == 416128);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.796992001228429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132776489198879d + "'", double1 == 1.3132776489198879d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        int int2 = org.apache.commons.math.util.FastMath.max(149, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.44986261998611243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007851583900405709d + "'", double1 == 0.007851583900405709d);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1134536045423387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7483233888283961d + "'", double1 == 0.7483233888283961d);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.544951074455595d, 4.194206803317586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7017018488003463d + "'", double2 == 0.7017018488003463d);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        double double2 = org.apache.commons.math.util.FastMath.min(1.192242010190033d, 0.011697165240742895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011697165240742895d + "'", double2 == 0.011697165240742895d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.6691802474911265E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8924232090626708d, (-0.009153147489909813d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8924232090626708d + "'", double2 == 0.8924232090626708d);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.372454264330465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4359790670488917d + "'", double1 == 1.4359790670488917d);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 793006726156715L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 11013L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5552986459319043d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5296128765905401d + "'", double1 == 0.5296128765905401d);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.292518932727564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9071021938414463d + "'", double1 == 1.9071021938414463d);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.5320370859115992d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        double double1 = org.apache.commons.math.util.FastMath.log1p(803227.6141649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596394652490343d + "'", double1 == 13.596394652490343d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0709129329002653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2876733722806268d + "'", double1 == 1.2876733722806268d);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5711009442193944d + "'", double1 == 1.5711009442193944d);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0007048074194658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002348806332573d + "'", double1 == 1.0002348806332573d);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4201108309961966d + "'", double1 == 0.4201108309961966d);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5128928810496862d), (-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5872139151569291d) + "'", double2 == (-0.5872139151569291d));
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.010868826047427144d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.89696800354125E-4d) + "'", double1 == (-1.89696800354125E-4d));
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5343928609612147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5093186428238677d + "'", double1 == 0.5093186428238677d);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8924232090626707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015575723319357302d + "'", double1 == 0.015575723319357302d);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5687740504363148d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5171427256366303d) + "'", double1 == (-0.5171427256366303d));
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        double double1 = org.apache.commons.math.util.FastMath.sin(17.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9613974918795568d) + "'", double1 == (-0.9613974918795568d));
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        double double1 = org.apache.commons.math.util.FastMath.atanh(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.984096369658629E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.000691235693605d) + "'", double1 == (-3.000691235693605d));
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.162447351509626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.687280091943478d) + "'", double1 == (-0.687280091943478d));
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.18982918240695817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18982918240695817d + "'", double1 == 0.18982918240695817d);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        double double1 = org.apache.commons.math.util.FastMath.log((-7.016709298534876E-15d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        double double2 = org.apache.commons.math.util.FastMath.max(236.0628816681138d, (double) 53);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 236.0628816681138d + "'", double2 == 236.0628816681138d);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        double double2 = org.apache.commons.math.util.FastMath.max(17.986111111111118d, 1.431181872803843d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.986111111111118d + "'", double2 == 17.986111111111118d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4359790670488917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15714810903482027d + "'", double1 == 0.15714810903482027d);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.23269451697447066d), (-5.895315751447931d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.895315751447931d) + "'", double2 == (-5.895315751447931d));
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0746720081896708d, 0.24468093598772878d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0177769840670288d + "'", double2 == 1.0177769840670288d);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05519215703220057d + "'", double1 == 0.05519215703220057d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.0043535365743673626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.623609135857365E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003624265742324d + "'", double1 == 1.0003624265742324d);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        double double1 = org.apache.commons.math.util.FastMath.cosh(45.41638539636288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.648839048010502E19d + "'", double1 == 2.648839048010502E19d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7478095771555198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9679670821822391d + "'", double1 == 0.9679670821822391d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.224391898887561d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9972523950133705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8399832730954756d + "'", double1 == 0.8399832730954756d);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.020676134077764915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02067318846680487d + "'", double1 == 0.02067318846680487d);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        float float2 = org.apache.commons.math.util.FastMath.max((-53.0f), (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        double double1 = org.apache.commons.math.util.FastMath.cos(189.3225229221956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.677113221763675d + "'", double1 == 0.677113221763675d);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        double double2 = org.apache.commons.math.util.FastMath.max(41.32317658130462d, 4.6755933871952235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.32317658130462d + "'", double2 == 41.32317658130462d);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        double double1 = org.apache.commons.math.util.FastMath.log10(77.26503394947866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8879829997609285d + "'", double1 == 1.8879829997609285d);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6127838567197355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4779617893704469d + "'", double1 == 0.4779617893704469d);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5191129625505976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5191129625505976d + "'", double1 == 0.5191129625505976d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        double double1 = org.apache.commons.math.util.FastMath.log(1.170616649243588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15753066060280643d + "'", double1 == 0.15753066060280643d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.36341525809683245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21689041524151353d + "'", double1 == 0.21689041524151353d);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.010869254081131837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8970427095158144E-4d) + "'", double1 == (-1.8970427095158144E-4d));
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.24779790579557093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2453295642474505d + "'", double1 == 0.2453295642474505d);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3478079812383207d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483608274590866d + "'", double2 == 0.6483608274590866d);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9520464219027572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9757286620279007d + "'", double1 == 0.9757286620279007d);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6283185307179586d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        double double2 = org.apache.commons.math.util.FastMath.max((-39.62126752483498d), 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61512051684126d + "'", double2 == 4.61512051684126d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        float float1 = org.apache.commons.math.util.FastMath.abs(53.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2744626885882167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2780308883829101d + "'", double1 == 0.2780308883829101d);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        double double1 = org.apache.commons.math.util.FastMath.floor(21.278971706197215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.1072845368400976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.970873079849869d + "'", double1 == 0.970873079849869d);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.046174056537147E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6199895080879192d, 803226.6141649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.718737117947564E-7d + "'", double2 == 7.718737117947564E-7d);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.755246472440062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.856030078759292d + "'", double1 == 0.856030078759292d);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6105647004975029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9908886150478887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003975161446914431d) + "'", double1 == (-0.003975161446914431d));
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1477895.5237245467d, (-0.010869896173410578d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963341498794d + "'", double2 == 1.5707963341498794d);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        double double1 = org.apache.commons.math.util.FastMath.sin(35.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6811510331724726d) + "'", double1 == (-0.6811510331724726d));
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7282657137693636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5471184281029954d + "'", double1 == 0.5471184281029954d);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.11803632173468953d, 0.9891893911299775d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1207946620589112d + "'", double2 == 0.1207946620589112d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1525610382590352d + "'", double1 == 1.1525610382590352d);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1046225788468809d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8052881239252931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3114437720352931d, (-0.25457675705027805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25457675705027805d) + "'", double2 == (-0.25457675705027805d));
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17452218322646063d + "'", double1 == 0.17452218322646063d);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.000000000000014d + "'", double1 == 35.000000000000014d);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8622018919156007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3018626251784622d + "'", double1 == 1.3018626251784622d);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.6034653621241517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        double double2 = org.apache.commons.math.util.FastMath.min(1.351950794486537d, 0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27631948176648663d + "'", double2 == 0.27631948176648663d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.08007999700658493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4906304922703415d + "'", double1 == 1.4906304922703415d);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.17278201040941962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.8996799722452d + "'", double1 == 9.8996799722452d);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5537286659368967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1582217765373468d + "'", double1 == 1.1582217765373468d);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        double double2 = org.apache.commons.math.util.FastMath.min(1.137792216825654d, 1.757427526873428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.137792216825654d + "'", double2 == 1.137792216825654d);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        double double1 = org.apache.commons.math.util.FastMath.log((-11.745681216144897d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.013909423133397792d), 3.1780538303479458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01390942313339779d) + "'", double2 == (-0.01390942313339779d));
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7581226324091722d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7581226324091723d + "'", double2 == 0.7581226324091723d);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5600972363155949d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.09120775782509d) + "'", double1 == (-32.09120775782509d));
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5170338832197212d + "'", double1 == 0.5170338832197212d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        float float2 = org.apache.commons.math.util.FastMath.min(8.4677176E7f, 416128.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416128.0f + "'", float2 == 416128.0f);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        double double2 = org.apache.commons.math.util.FastMath.min(10640.37463429509d, 3.302190676759448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.302190676759448d + "'", double2 == 3.302190676759448d);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.28162208224762103d, 0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.270308524846545d + "'", double2 == 1.270308524846545d);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8307652072016097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7565120018659114d + "'", double1 == 0.7565120018659114d);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53L), (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9985859267674833d) + "'", double1 == (-0.9985859267674833d));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017885386318795538d + "'", double1 == 0.0017885386318795538d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.3792468199971823d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1399766769213089d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3296867882556773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.779859305817836d + "'", double1 == 3.779859305817836d);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5356463583707127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1537111009271863d + "'", double1 == 1.1537111009271863d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.8097187196293865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706386041602216d + "'", double1 == 1.5706386041602216d);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39434810579542623d) + "'", double1 == (-0.39434810579542623d));
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8189894035458565E-12d, 1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8189894035458565E-12d + "'", double2 == 1.8189894035458565E-12d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5679890550656346d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.30554713851424564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.50656147916544d + "'", double1 == 17.50656147916544d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.296975996234255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36026147306099493d + "'", double1 == 0.36026147306099493d);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.5544646780753981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4719274375428872d + "'", double1 == 2.4719274375428872d);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9908886150478887d, 0.492549213298881d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9955017718746278d + "'", double2 == 0.9955017718746278d);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.013865150856733838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6949948789359283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707651109236087d + "'", double1 == 1.5707651109236087d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8552072360648283d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.612913581045847d, 28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.8699601552557558E18d + "'", double2 == 7.8699601552557558E18d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3020049587260321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.303609527024264d + "'", double1 == 17.303609527024264d);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.40310869196405E-6d + "'", double1 == 2.40310869196405E-6d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        double double1 = org.apache.commons.math.util.FastMath.log10(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.744894366675417d + "'", double1 == 3.744894366675417d);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.833213344056216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.993103448275862d + "'", double1 == 0.993103448275862d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9165654068163128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        double double1 = org.apache.commons.math.util.FastMath.acos(55.48980635932044d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1525610382590352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1662915285707833d + "'", double1 == 3.1662915285707833d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1558241215220355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5512484735585962d + "'", double1 == 0.5512484735585962d);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.17180554051289512d), 0.296285546110827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.296285546110827d + "'", double2 == 0.296285546110827d);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.026102280813798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2158840636970496d + "'", double1 == 1.2158840636970496d);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        double double2 = org.apache.commons.math.util.FastMath.max(0.797839565109256d, 1.567739246697935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.567739246697935d + "'", double2 == 1.567739246697935d);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        long long1 = org.apache.commons.math.util.FastMath.round(0.15324353114379408d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.08856646710337d), 0.11803632173468953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5325977297491826d) + "'", double2 == (-1.5325977297491826d));
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.09966865249116198d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3778459445864686d) + "'", double1 == (-1.3778459445864686d));
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        double double2 = org.apache.commons.math.util.FastMath.max(49.80857186097813d, 0.9221885224184981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.80857186097813d + "'", double2 == 49.80857186097813d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7055494495807497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6949948789359283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6073589181600084d + "'", double1 == 0.6073589181600084d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-10.017874927409903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999554043807747d) + "'", double1 == (-0.9999554043807747d));
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        double double2 = org.apache.commons.math.util.FastMath.min(1.570796326794902d, 9.994072887542587E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.994072887542587E-4d + "'", double2 == 9.994072887542587E-4d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.006589358495248128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000217099012423d + "'", double1 == 1.0000217099012423d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.50632862831693E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 107.06009304343756d + "'", double1 == 107.06009304343756d);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.287781549441661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.924732504654114d + "'", double1 == 2.924732504654114d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2717628242082612d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26526438319276563d) + "'", double1 == (-0.26526438319276563d));
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        int int2 = org.apache.commons.math.util.FastMath.max(416128, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.899450800738734d), 77.49669753985923d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3010299956639812d + "'", double1 == 0.3010299956639812d);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.680482178387856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6727467649882994d + "'", double1 == 1.6727467649882994d);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.559213651529111d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5592136515291108d + "'", double2 == 0.5592136515291108d);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-24.092316404524105d), 1.14406895795477d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-24.0923164045241d) + "'", double2 == (-24.0923164045241d));
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.1338468571120415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4633872154732288d + "'", double1 == 1.4633872154732288d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 45, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(327.1084999525159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.709120335431118d + "'", double1 == 5.709120335431118d);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936026854386766d + "'", double1 == 1.9936026854386766d);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-14.04469065108256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-804.7014988738749d) + "'", double1 == (-804.7014988738749d));
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1161530356493914d + "'", double1 == 1.1161530356493914d);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.570796326794902d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        long long1 = org.apache.commons.math.util.FastMath.round(254.2467003209809d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 254L + "'", long1 == 254L);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3709715186580659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3629501273968767d + "'", double1 == 0.3629501273968767d);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9991655171663728d, 0.4996289686340808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9995829811209932d + "'", double2 == 0.9995829811209932d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.166594879293176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7612328011432905d + "'", double1 == 1.7612328011432905d);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        double double1 = org.apache.commons.math.util.FastMath.ceil(32788.349092089964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32789.0d + "'", double1 == 32789.0d);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 32035L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6930491557595923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6388858687541804d + "'", double1 == 0.6388858687541804d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(30751.49537331838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30751.495373318383d + "'", double1 == 30751.495373318383d);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.46628183159475434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38272983027743895d + "'", double1 == 0.38272983027743895d);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3264961224259655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24187736759082779d + "'", double1 == 0.24187736759082779d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.941845847960965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0301603128736367d + "'", double1 == 1.0301603128736367d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(53.598150033144236d, 0.6930491557595923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.59815003314423d + "'", double2 == 53.59815003314423d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2277207513970612d, 0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5716776679087391d + "'", double2 == 0.5716776679087391d);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7095251320497278d, 0.11803632173468953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.405946425539694d + "'", double2 == 1.405946425539694d);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5568315867464496d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-36L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.9823021454200065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.81086873831038d + "'", double1 == 26.81086873831038d);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5720011145449331d + "'", double1 == 0.5720011145449331d);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-36.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1556157735575975E15d) + "'", double1 == (-2.1556157735575975E15d));
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        double double2 = org.apache.commons.math.util.FastMath.min(17.490740823090167d, (-0.8695168523156485d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8695168523156485d) + "'", double2 == (-0.8695168523156485d));
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.5435938534266392E16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        double double1 = org.apache.commons.math.util.FastMath.atan(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5657963684609384d + "'", double1 == 1.5657963684609384d);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-86.33580274416313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.151425094329944d) + "'", double1 == (-5.151425094329944d));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9659700754028167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9885255319736725d) + "'", double1 == (-0.9885255319736725d));
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        double double1 = org.apache.commons.math.util.FastMath.abs((-52.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.99999999999999d + "'", double1 == 52.99999999999999d);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0316268884157165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8581354070995874d + "'", double1 == 0.8581354070995874d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6515632030701123d + "'", double1 == 0.6515632030701123d);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6081226496766364E-16d) + "'", double1 == (-1.6081226496766364E-16d));
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7944146264030466d + "'", double1 == 0.7944146264030466d);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(51.51359987037848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.177297532524236d + "'", double1 == 7.177297532524236d);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8587920411303291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.619926836494928d + "'", double1 == 0.619926836494928d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6301544225398108d + "'", double1 == 0.6301544225398108d);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.038410356896381344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03839147839332005d) + "'", double1 == (-0.03839147839332005d));
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707963341498794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.81047741634633d + "'", double1 == 3.81047741634633d);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.924732504654114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.241345292894887d + "'", double1 == 1.241345292894887d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        double double2 = org.apache.commons.math.util.FastMath.min(192.9948452238572d, 3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 192.9948452238572d + "'", double2 == 192.9948452238572d);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        int int1 = org.apache.commons.math.util.FastMath.abs(15472906);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15472906 + "'", int1 == 15472906);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.4387890526067095d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        double double2 = org.apache.commons.math.util.FastMath.min(1.719463918234335d, 0.09118740161511363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09118740161511363d + "'", double2 == 0.09118740161511363d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.5098796108399273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.303448769483154d + "'", double1 == 11.303448769483154d);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010530083072367401d + "'", double1 == 0.010530083072367401d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.154033342591204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.655902595883316d + "'", double1 == 2.655902595883316d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.541950429394781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.155287667680613d) + "'", double1 == (-1.155287667680613d));
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.20893765340601256d, 0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20893765340601259d + "'", double2 == 0.20893765340601259d);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6065871571457463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010586943092505522d + "'", double1 == 0.010586943092505522d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.351950794486537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9761487379879814d + "'", double1 == 0.9761487379879814d);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0006324214414275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.23413167693625433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9727161576112257d + "'", double1 == 0.9727161576112257d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        double double1 = org.apache.commons.math.util.FastMath.asin(53.9156620210734d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.11100049204224008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1001094562563805d + "'", double1 == 3.1001094562563805d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.496025759922821d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.3004939424875053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.010869468089133274d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.581666008924904d + "'", double1 == 1.581666008924904d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6868023880361244d, 0.4824196727343814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342273974022554d + "'", double2 == 0.8342273974022554d);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.188688139030397d + "'", double1 == 13.188688139030397d);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9950915100179343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.704971861977569d + "'", double1 == 2.704971861977569d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.11776318452497536d, 0.9780533157623794d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11776318452497538d + "'", double2 == 0.11776318452497538d);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7558748556724915d + "'", double1 == 1.7558748556724915d);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.162447351509626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8603793191172027d) + "'", double1 == (-0.8603793191172027d));
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2893113549836797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2852922674838619d + "'", double1 == 0.2852922674838619d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-53L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        double double1 = org.apache.commons.math.util.FastMath.acosh(13.596393425240073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.30159663645249d + "'", double1 == 3.30159663645249d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        double double2 = org.apache.commons.math.util.FastMath.min(3.8097187196293865d, 0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5195675877329186d + "'", double2 == 0.5195675877329186d);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        float float2 = org.apache.commons.math.util.FastMath.max(6.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1481461824783568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021171773984568765d + "'", double1 == 0.021171773984568765d);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.0637969690534153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3669495678698107d + "'", double1 == 1.3669495678698107d);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.007057036850945338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0070570954265778444d + "'", double1 == 0.0070570954265778444d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        double double1 = org.apache.commons.math.util.FastMath.log(7.042749499570736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9519986478399194d + "'", double1 == 1.9519986478399194d);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.017066003704239316d), 639.6272283571994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017066003704239312d) + "'", double2 == (-0.017066003704239312d));
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4650188248182274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.93939556930013d + "'", double1 == 83.93939556930013d);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 45, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 45.0f + "'", float2 == 45.0f);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.6691802474911265E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.669180247494296E-6d + "'", double1 == 2.669180247494296E-6d);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8687425280815093d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-3.04617424497707E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000046395888d + "'", double1 == 1.000000046395888d);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4074639732020709d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6653354208710169d + "'", double1 == 0.6653354208710169d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8785415760154557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.995998936421439d + "'", double1 == 0.995998936421439d);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.301297204502775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012972045027755d + "'", double1 == 2.3012972045027755d);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.15561577E15f + "'", float1 == 2.15561577E15f);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35016104929231356d + "'", double1 == 0.35016104929231356d);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        double double1 = org.apache.commons.math.util.FastMath.tanh(79.5438826761901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6270804372411973d), 0.02930072909258234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02930072909258234d + "'", double2 == 0.02930072909258234d);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.755246472440062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.829120600623248d + "'", double1 == 0.829120600623248d);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3023186765274488d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.2717628242082612d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.570862855689084d) + "'", double1 == (-15.570862855689084d));
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5842599568378692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0342627427229836d + "'", double1 == 1.0342627427229836d);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.0415522815958145d), (-1.2031992972018404d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2031992972018404d) + "'", double2 == (-1.2031992972018404d));
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        double double2 = org.apache.commons.math.util.FastMath.min(7.2638973976934564E18d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9972523950133705d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9767326955602935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9864413478936669d) + "'", double1 == (-0.9864413478936669d));
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2844493651764597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9598163222490755d + "'", double1 == 0.9598163222490755d);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.693001794357499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6388494328384761d + "'", double1 == 0.6388494328384761d);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 45L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9745875937954159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6500740785981898d + "'", double1 == 1.6500740785981898d);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160033436347992d + "'", double1 == 1.7160033436347992d);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.779859305817836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0659709901486685d + "'", double1 == 0.0659709901486685d);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.017066003704239312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017066832220777466d) + "'", double1 == (-0.017066832220777466d));
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6044791236121515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8227982407773817d + "'", double1 == 0.8227982407773817d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5729700885805267d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707939236862047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038841287955307d + "'", double1 == 1.0038841287955307d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        double double1 = org.apache.commons.math.util.FastMath.asin((-3.6702312852883354d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.57079057929641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611828795625333d + "'", double1 == 0.19611828795625333d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5716315636979223d, 0.5578948219222873d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.797559069755228d + "'", double2 == 0.797559069755228d);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.276858964458208d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07464527057323088d) + "'", double1 == (-0.07464527057323088d));
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.583175998895534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        double double2 = org.apache.commons.math.util.FastMath.max(0.20893765340601259d, 10.619376640742772d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.619376640742772d + "'", double2 == 10.619376640742772d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        double double1 = org.apache.commons.math.util.FastMath.sin(323.0328345212857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5237173771380453d + "'", double1 == 0.5237173771380453d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.09994695977117724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0002304118978682d) + "'", double1 == (-1.0002304118978682d));
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.172026904626868E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (-36));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.010869254060903364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999409302396284d + "'", double1 == 0.9999409302396284d);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4369873807744509d + "'", double1 == 1.4369873807744509d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.10981533732452632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11003618844778293d + "'", double1 == 0.11003618844778293d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7017018488003463d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.403108691970989E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(148.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7853981633974483d, 2.3529804386339674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974484d + "'", double2 == 0.7853981633974484d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.006968429058501292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.216220307624961E-4d + "'", double1 == 1.216220307624961E-4d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6509498349092766d + "'", double1 == 1.6509498349092766d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.877634861813576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08513078804870552d + "'", double1 == 0.08513078804870552d);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        long long2 = org.apache.commons.math.util.FastMath.min(254L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5343928609612147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27213935230245856d) + "'", double1 == (-0.27213935230245856d));
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.1498040080478718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5471936295407962d) + "'", double1 == (-0.5471936295407962d));
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.313261687518223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936116249145206d + "'", double1 == 1.9936116249145206d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6668333172919337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9480586591986286d + "'", double1 == 1.9480586591986286d);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.566701978945693d + "'", double1 == 10.566701978945693d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9533010145860434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2778919526316612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2778919526316612d + "'", double1 == 1.2778919526316612d);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0255162991293005d, 148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.80597572185025d + "'", double2 == 148.80597572185025d);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.306110394417042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.6858379720917758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9787131869824313d + "'", double1 == 1.9787131869824313d);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5344625446055697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.706530811546827d + "'", double1 == 1.706530811546827d);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.012577602239430928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012657032945080478d + "'", double1 == 0.012657032945080478d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3867406483931928d + "'", double1 == 0.3867406483931928d);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.3458247401995457E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0942365391222653E39d + "'", double1 == 4.0942365391222653E39d);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, 32035L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32035L + "'", long2 == 32035L);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1787594507721955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.53794159040572d + "'", double1 == 67.53794159040572d);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.003975161446914431d), 0.18352087838274772d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.724275869600789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.054858647341251204d + "'", double1 == 0.054858647341251204d);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8916040425905878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9251475365964139d), 0.29251651548170565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2645590728681655d) + "'", double2 == (-1.2645590728681655d));
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.026687906044515184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027050493904618365d) + "'", double1 == (-0.027050493904618365d));
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        double double1 = org.apache.commons.math.util.FastMath.asin(77.26503394947866d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.079331342726163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1225257824954484d + "'", double1 == 1.1225257824954484d);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.021252051384784545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2744626885882167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2677724687651877d + "'", double1 == 0.2677724687651877d);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5860134523134298E15d, 0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7813863964118539d + "'", double2 == 0.7813863964118539d);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.1317761108019546d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8996977230841076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1190765398976545d) + "'", double1 == (-1.1190765398976545d));
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0402137955774267d, 1.557976516321996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0633509490794109d + "'", double2 == 1.0633509490794109d);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.725101101257968E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4184272923915598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4307444304921171d + "'", double1 == 0.4307444304921171d);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.012160781755097083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.42467291074436d + "'", double1 == 127.42467291074436d);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.20612969039d + "'", double1 == 14.20612969039d);
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1559274280097633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2704971236440916d + "'", double1 == 2.2704971236440916d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        double double1 = org.apache.commons.math.util.FastMath.log(72.01388621073826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.276858964458209d + "'", double1 == 4.276858964458209d);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4881954908148405d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.958263399558255d + "'", double1 == 11.958263399558255d);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.23269451697447066d), 0.7839193895720422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.23269451697447063d) + "'", double2 == (-0.23269451697447063d));
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.594085743744213d + "'", double1 == 0.594085743744213d);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9996141230803657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.276473161941265d + "'", double1 == 4.276473161941265d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 15472906);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4419647419307422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4419647419307422d + "'", double1 == 1.4419647419307422d);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7568024953079282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6866002607386249d) + "'", double1 == (-0.6866002607386249d));
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.1720269046268675E15d, 0.7005202664493964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.227708505501907E10d + "'", double2 == 7.227708505501907E10d);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.172026904626868E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.172026904626868E15d + "'", double1 == 3.172026904626868E15d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-10.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.008837862706915424d), (-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837862706915426d) + "'", double2 == (-0.008837862706915426d));
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6042152549280319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8229481775644426d + "'", double1 == 0.8229481775644426d);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.569333463754976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1620863818545415d + "'", double1 == 1.1620863818545415d);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5544646780753981d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1102230246251565E-16d, 7.603575026530223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.876179281316129E-122d + "'", double2 == 4.876179281316129E-122d);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3953649341158527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.395364934115853d + "'", double1 == 1.395364934115853d);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5179955251134185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4951396190449744d + "'", double1 == 0.4951396190449744d);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999995015891399d, 1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7598828301566699d + "'", double2 == 0.7598828301566699d);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3279301050129204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9706526774609869d + "'", double1 == 0.9706526774609869d);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7871127525111785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7871127525111785d + "'", double1 == 0.7871127525111785d);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.709975946676697d, 0.10263239608867235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.056604174305478d + "'", double2 == 1.056604174305478d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 84677176, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.287543329097423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8624571765569269d + "'", double1 == 1.8624571765569269d);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        float float1 = org.apache.commons.math.util.FastMath.abs((-53.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        double double1 = org.apache.commons.math.util.FastMath.asinh(148.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.697104747069222d + "'", double1 == 5.697104747069222d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.26535415056108935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.203672903429425d) + "'", double1 == (-15.203672903429425d));
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.012657256633849E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034920772952347814d + "'", double1 == 0.034920772952347814d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9294662936171667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07314473539674805d) + "'", double1 == (-0.07314473539674805d));
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.38257481612112954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006677190176525592d + "'", double1 == 0.006677190176525592d);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        float float1 = org.apache.commons.math.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9740733519705822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7504888361866489d + "'", double1 == 0.7504888361866489d);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9918472337211128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0035552135928133485d) + "'", double1 == (-0.0035552135928133485d));
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3673722261798014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6707931770950559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.433617973718306d + "'", double1 == 38.433617973718306d);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7581226324091722d, (-0.1016572581144659d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7040920051570956d + "'", double2 == 1.7040920051570956d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6967614701467567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8609784862914356d + "'", double1 == 0.8609784862914356d);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.17107384637538d + "'", double1 == 40.17107384637538d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8399832730954756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014660473777194752d + "'", double1 == 0.014660473777194752d);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2194070299562692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8394791737266158d + "'", double1 == 0.8394791737266158d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.151425094329944d) + "'", double1 == (-5.151425094329944d));
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4900780917150722d, 0.03672792646886562d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.490078091715072d + "'", double2 == 1.490078091715072d);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9851462604682474d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.755285058671236d) + "'", double1 == (-0.755285058671236d));
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2431671594873386d + "'", double1 == 1.2431671594873386d);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 15472906, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15472906L + "'", long2 == 15472906L);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8172096612475641d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1483588221342766d) + "'", double1 == (-1.1483588221342766d));
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.322143471596449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6855141834231403d + "'", double1 == 0.6855141834231403d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        long long2 = org.apache.commons.math.util.FastMath.min(15472906L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        double double1 = org.apache.commons.math.util.FastMath.expm1(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5143952585235492d + "'", double1 == 0.5143952585235492d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9102712041190427d) + "'", double1 == (-0.9102712041190427d));
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.616250773934756d + "'", double1 == 5.616250773934756d);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5844399164946341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6615327351520852d + "'", double1 == 0.6615327351520852d);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5657963684609384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0190888386256904d + "'", double1 == 1.0190888386256904d);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44761628698542416d) + "'", double1 == (-0.44761628698542416d));
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1316153248585041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1316153248585044d + "'", double1 == 1.1316153248585044d);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1477896.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.05042677562564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8588709541865835d + "'", double1 == 2.8588709541865835d);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        long long1 = org.apache.commons.math.util.FastMath.abs((-53L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(13.596394652490343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3867554376809794d + "'", double1 == 2.3867554376809794d);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 84677176L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9508218731216449d + "'", double1 == 0.9508218731216449d);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.12717101690833E64d, 5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.127171016908329E64d + "'", double2 == 5.127171016908329E64d);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        double double1 = org.apache.commons.math.util.FastMath.rint(24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.0d + "'", double1 == 24.0d);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.170616649243588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2239800905693152d + "'", double1 == 2.2239800905693152d);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899276870949835d + "'", double1 == 14.899276870949835d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5430256902014756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7649423546396938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9599030060384935d + "'", double1 == 0.9599030060384935d);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        double double2 = org.apache.commons.math.util.FastMath.pow(3036.676314193363d, (-1.5010608089539732d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.9252692169618576E-6d + "'", double2 == 5.9252692169618576E-6d);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5799018512655504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5515146580525895d + "'", double1 == 0.5515146580525895d);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4652950030131615d, 0.2753612114631538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3850407111136214d + "'", double2 == 1.3850407111136214d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        double double1 = org.apache.commons.math.util.FastMath.rint(17.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4184272923915598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0888254058387774d + "'", double1 == 1.0888254058387774d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.11776318452497538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11831214619987153d + "'", double1 == 0.11831214619987153d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9117339147869651d), 1.5796345346787104d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8693235746902678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7010302935299408d + "'", double1 == 0.7010302935299408d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7103669532614669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8922658057404818d + "'", double1 == 0.8922658057404818d);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.637986554446436d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6527531305852572d, 0.29225491648198393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8827942052772485d + "'", double2 == 0.8827942052772485d);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.005178496136374047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0051784498466004745d + "'", double1 == 0.0051784498466004745d);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7076312586751927d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

