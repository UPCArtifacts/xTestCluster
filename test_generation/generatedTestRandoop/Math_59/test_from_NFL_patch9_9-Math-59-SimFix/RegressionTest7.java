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
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7017203400855395d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6054586098430138d) + "'", double1 == (-0.6054586098430138d));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16174140574189208d) + "'", double1 == (-0.16174140574189208d));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8691858264600905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.954342383797684d + "'", double1 == 0.954342383797684d);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9232595127935677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1764802111308692d + "'", double1 == 1.1764802111308692d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double1 = org.apache.commons.math.util.FastMath.abs((-77.26503394947865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.26503394947865d + "'", double1 == 77.26503394947865d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8554182836643192d) + "'", double1 == (-0.8554182836643192d));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70187.3299035258d + "'", double1 == 70187.3299035258d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2583723393689585d, 12.319647397271215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.967337547743597d + "'", double2 == 16.967337547743597d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.948148009134034E13d, 0.8633639145424554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.47816931894628E11d + "'", double2 == 5.47816931894628E11d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9768658979378976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5163039218686447d + "'", double1 == 1.5163039218686447d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8525.954375188212d + "'", double1 == 8525.954375188212d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9428090415820635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025576261223690597d) + "'", double1 == (-0.025576261223690597d));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double1 = org.apache.commons.math.util.FastMath.atanh(14.476482730108396d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6808814524786906d + "'", double1 == 0.6808814524786906d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9092974268256817d + "'", double1 == 0.9092974268256817d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4415944677216688d, (-0.9023698529915597d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4415944677216688d + "'", double2 == 0.4415944677216688d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6089008978477989d + "'", double1 == 0.6089008978477989d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4898102688480725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.105419161903974d + "'", double1 == 2.105419161903974d);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.02109767107454078d, 0.10600733624570037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19645390067470775d + "'", double2 == 0.19645390067470775d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-9.289321943344232E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.62129253189115E-6d) + "'", double1 == (-1.62129253189115E-6d));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2199463009580406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6808814524786906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3843670665782926d) + "'", double1 == (-0.3843670665782926d));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.717637540215414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5513081531541428d + "'", double1 == 1.5513081531541428d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.0159436322367794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8604282210872225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0652853536757234d) + "'", double1 == (-0.0652853536757234d));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.294956681159677d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.expm1(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.79843248229905E248d + "'", double1 == 6.79843248229905E248d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.83543858857243d + "'", double1 == 75.83543858857243d);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.3015966351452155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.596393407513998d + "'", double1 == 13.596393407513998d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9964183022495265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1616365426019666d + "'", double1 == 3.1616365426019666d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        long long1 = org.apache.commons.math.util.FastMath.round(8.881784197001256E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        long long1 = org.apache.commons.math.util.FastMath.round(2.080594601624405E-9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.953499812724235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.760402149420859d + "'", double1 == 0.760402149420859d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.69314718055993d + "'", double1 == 32.69314718055993d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.208435730874367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8650367765308644d + "'", double1 == 2.8650367765308644d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4311581967195641d + "'", double1 == 0.4311581967195641d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8523926839062378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.83850327565627d + "'", double1 == 48.83850327565627d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 128.05875780734718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6997597439205169d, 0.03337773768597237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6997597439205169d + "'", double2 == 0.6997597439205169d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.000007100844429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000023669425406d + "'", double1 == 1.0000023669425406d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02012615298501282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02012343619844111d + "'", double1 == 0.02012343619844111d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double2 = org.apache.commons.math.util.FastMath.max(57.29577951308232d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308232d + "'", double2 == 57.29577951308232d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9708235100106998d, 0.02109767107454078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02109767107454078d + "'", double2 == 0.02109767107454078d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.2141704030607639d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.2015841995251388E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2015841995251386E-10d) + "'", double1 == (-1.2015841995251386E-10d));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8656424292007401d + "'", double1 == 0.8656424292007401d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1073424338879928E-8d + "'", double1 == 2.1073424338879928E-8d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double2 = org.apache.commons.math.util.FastMath.pow(19.0d, 0.8668856945829329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.839059264996925d + "'", double2 == 12.839059264996925d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6139438239961824d + "'", double1 == 0.6139438239961824d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double1 = org.apache.commons.math.util.FastMath.log(7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-103.97207708399179d) + "'", double1 == (-103.97207708399179d));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0893507405929967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2722988564826722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2950149647750298d + "'", double1 == 1.2950149647750298d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7203775199467526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 53.0f, 4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9297971986812833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2045352723380653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18609382644482833d + "'", double1 == 0.18609382644482833d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.003215579132524195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0032207546530480537d + "'", double1 == 0.0032207546530480537d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017067660809719984d) + "'", double1 == (-0.017067660809719984d));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9023126767261935d + "'", double1 == 0.9023126767261935d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        long long2 = org.apache.commons.math.util.FastMath.min(11013L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double2 = org.apache.commons.math.util.FastMath.min(7.737125245533627E25d, 0.5803861773395897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5803861773395897d + "'", double2 == 0.5803861773395897d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double2 = org.apache.commons.math.util.FastMath.min(2.4484495608966435d, 1.0000000002328306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000002328306d + "'", double2 == 1.0000000002328306d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6988504325041327d + "'", double1 == 0.6988504325041327d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8864461663714668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.426490964964291d + "'", double1 == 2.426490964964291d);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8214948155164382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9365585701583761d + "'", double1 == 0.9365585701583761d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double2 = org.apache.commons.math.util.FastMath.min(1.175201187282749d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.49500734438069d + "'", double1 == 1.49500734438069d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2958646320794195d) + "'", double1 == (-0.2958646320794195d));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8364454861264231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1076852414311276d + "'", double1 == 1.1076852414311276d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.477053318335443E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 72L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5702159837110962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.987888475352904d + "'", double1 == 32.987888475352904d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.39585386311332965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.2040758220049488d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.1711987928317563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1711987928317563d + "'", double1 == 0.1711987928317563d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7853981633974483d), 0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7853981633974483d) + "'", double2 == (-0.7853981633974483d));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.7260621198151926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5146893481167585d + "'", double1 == 0.5146893481167585d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5995504841726447d, (-0.008838207883813802d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5995504841726446d + "'", double2 == 0.5995504841726446d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.052455059316914306d) + "'", double1 == (-0.052455059316914306d));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7966043547446022d, (-0.45642327729008136d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7966043547446021d + "'", double2 == 0.7966043547446021d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 36L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.270624161294803d + "'", double1 == 8.270624161294803d);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.273637993943258d + "'", double1 == 1.273637993943258d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24356506942966236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24598042946131934d + "'", double1 == 0.24598042946131934d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8214948155164382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6811275173611405d + "'", double1 == 0.6811275173611405d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(23.620277154609447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.869205555527689d + "'", double1 == 2.869205555527689d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double2 = org.apache.commons.math.util.FastMath.max(215.5579348013961d, 100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 215.5579348013961d + "'", double2 == 215.5579348013961d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.8957199490291566E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597823967d + "'", double1 == 21.487562597823967d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.016591253173120855d, 1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016591253173120858d + "'", double2 == 0.016591253173120858d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double1 = org.apache.commons.math.util.FastMath.log(613.0004078303422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.418365601238342d + "'", double1 == 6.418365601238342d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5403023058681384d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9916299884373267d), 5.431733408790851d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18057375527870234d) + "'", double2 == (-0.18057375527870234d));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.02012343619844111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02032727757427939d + "'", double1 == 0.02032727757427939d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.08456102495932247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1289051803966543d, 8.208435730874367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1289051803966543d + "'", double2 == 1.1289051803966543d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706517535661036d + "'", double1 == 0.01706517535661036d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22.248715407688383d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1301927452503904d + "'", double1 == 1.1301927452503904d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.58601345231343E15d + "'", double1 == 1.58601345231343E15d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1241113544309131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.40683631162594d + "'", double1 == 64.40683631162594d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.724161534186775d + "'", double1 == 2.724161534186775d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7926396995186359d, 61.48941136975552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.226322265462393E-7d + "'", double2 == 6.226322265462393E-7d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9337643921132142d + "'", double1 == 0.9337643921132142d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2014038779280567d, (-9.289321943344232E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001488671729364d + "'", double2 == 1.0001488671729364d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        int int1 = org.apache.commons.math.util.FastMath.round(11013.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.954342383797684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.259921049894873d) + "'", double1 == (-1.259921049894873d));
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.01573708249221756d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-3), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.87975471928711d + "'", double1 == 43.87975471928711d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        int int1 = org.apache.commons.math.util.FastMath.round(57.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.388267471840756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7801576829951964d) + "'", double1 == (-0.7801576829951964d));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double1 = org.apache.commons.math.util.FastMath.log(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8296131186240886d + "'", double1 == 0.8296131186240886d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9584036466699126d, 0.9179618963970241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9179618963970241d + "'", double2 == 0.9179618963970241d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double1 = org.apache.commons.math.util.FastMath.abs(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3036.676314193363d + "'", double1 == 3036.676314193363d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.17119879283175632d), 1.594973153695066E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1711987928317563d) + "'", double2 == (-0.1711987928317563d));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5433467420946743d + "'", double1 == 1.5433467420946743d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.11022806535638537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.110676677762472d + "'", double1 == 0.110676677762472d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1594624155482454d + "'", double1 == 1.1594624155482454d);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9997894669934126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7853981633974483d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9258949934053917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7541941649741823d + "'", double1 == 2.7541941649741823d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9643200333078156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7461976388130027d + "'", double1 == 0.7461976388130027d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33925861454291717d + "'", double1 == 0.33925861454291717d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double2 = org.apache.commons.math.util.FastMath.atan2(14.206130012655933d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14542111457707005d + "'", double2 == 0.14542111457707005d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-11.046068560414216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0972644080713274d) + "'", double1 == (-3.0972644080713274d));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7612492183413337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.263814502040431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9107344921579834d + "'", double1 == 1.9107344921579834d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9754001961551926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8509245826731492d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7556616167207904d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7035872612422763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.646957225053178d + "'", double1 == 0.646957225053178d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22689432686663263d + "'", double1 == 0.22689432686663263d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7215087615242685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7508100196049882d + "'", double1 == 0.7508100196049882d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.958177806871242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1116752822606313d + "'", double1 == 1.1116752822606313d);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0880877875686703d + "'", double1 == 1.0880877875686703d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.089135847258365d + "'", double1 == 1.089135847258365d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.2177221477573357d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(31.531082122259832d, 1.176259623626705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.53108212225983d + "'", double2 == 31.53108212225983d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9849610023458857d + "'", double1 == 0.9849610023458857d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 72, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5507.499954607353d + "'", double1 == 5507.499954607353d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.1745267124417875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1745267124417875d + "'", double1 == 2.1745267124417875d);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2374628952287586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2130632313576612d + "'", double1 == 0.2130632313576612d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.5347252927908293d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.895646744719586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4497667602778919d + "'", double1 == 1.4497667602778919d);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8632695193447204d, (-0.5943927097962464d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1737872698256573d + "'", double2 == 2.1737872698256573d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5068440202380022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735605461531053d + "'", double1 == 0.9735605461531053d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8525.954375188212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.470017988445906E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.4259206265092E24d + "'", double1 == 5.4259206265092E24d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.010477800994405333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10236113029077655d + "'", double1 == 0.10236113029077655d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.893622651558004d + "'", double1 == 1.893622651558004d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6085491459180241d, 0.18609382644482833d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18609382644482833d + "'", double2 == 0.18609382644482833d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998151400298467d + "'", double1 == 0.9998151400298467d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.21842712107840842d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0012941034727495249d, (-0.3394482820132315d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.557342734345765d + "'", double2 == 9.557342734345765d);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double1 = org.apache.commons.math.util.FastMath.log10(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5563025007672873d + "'", double1 == 1.5563025007672873d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.01976389133388643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019765178226982465d + "'", double1 == 0.019765178226982465d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8593867635096132d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007812658949600008d + "'", double1 == 0.007812658949600008d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2405439607132595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.782153736230454d + "'", double1 == 13.782153736230454d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        float float2 = org.apache.commons.math.util.FastMath.max((-53.0f), (float) 1833L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.01574932500543992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7487757631160047E-4d) + "'", double1 == (-2.7487757631160047E-4d));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double1 = org.apache.commons.math.util.FastMath.tan((-39.206747378977376d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.811548117507941d) + "'", double1 == (-15.811548117507941d));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.53567232102789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.98754270995735d + "'", double1 == 87.98754270995735d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9453625312870415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.024401614617990376d) + "'", double1 == (-0.024401614617990376d));
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        long long1 = org.apache.commons.math.util.FastMath.round(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4856741544225798d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7679249258932203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2640633033557785d) + "'", double1 == (-0.2640633033557785d));
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9989094548811008d + "'", double1 == 0.9989094548811008d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.327255548039541d + "'", double1 == 4.327255548039541d);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.08558186793850525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0854774356036348d + "'", double1 == 0.0854774356036348d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        float float1 = org.apache.commons.math.util.FastMath.abs((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 11013, 1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 642935.4876213886d + "'", double2 == 642935.4876213886d);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.41032129904824216d), 1.586013452313442E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.586013452313442E15d + "'", double2 == 1.586013452313442E15d);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4573750283097829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4427658101751764d + "'", double1 == 0.4427658101751764d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        long long1 = org.apache.commons.math.util.FastMath.round(8.213053064948797d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        long long2 = org.apache.commons.math.util.FastMath.max((-36L), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        double double1 = org.apache.commons.math.util.FastMath.asin(4477855.166669106d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-86.33580274416312d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.563625436674731E37d) + "'", double1 == (-1.563625436674731E37d));
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.4521234009544473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.49632171995557d + "'", double1 == 140.49632171995557d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10862815709014047d + "'", double1 == 0.10862815709014047d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.581170436626687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010373923752115983d) + "'", double1 == (-0.010373923752115983d));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257741d + "'", double1 == 11.548739357257741d);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.003761435487319938d, 1.1437757162199678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016855760327141626d + "'", double2 == 0.0016855760327141626d);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8366617438896834d), 0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8366617438896834d) + "'", double2 == (-0.8366617438896834d));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6191415215594434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.2015841995251386E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.934593734201322E-4d) + "'", double1 == (-4.934593734201322E-4d));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double2 = org.apache.commons.math.util.FastMath.min(51781.33605353302d, (-0.16954561468575624d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16954561468575624d) + "'", double2 == (-0.16954561468575624d));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5654575915353359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5701199791021948d) + "'", double1 == (-0.5701199791021948d));
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8146443499937901d + "'", double1 == 0.8146443499937901d);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5169642656554078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.61987058113476d + "'", double1 == 29.61987058113476d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1745267124417875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.174526712441788d + "'", double1 == 2.174526712441788d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double2 = org.apache.commons.math.util.FastMath.atan2(72.00000000000001d, 0.015066895444674253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705870643612196d + "'", double2 == 1.5705870643612196d);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2056480705506754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(28.458847799916846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.334683477013125d + "'", double1 == 5.334683477013125d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5273248225058396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5864322888707242d + "'", double1 == 0.5864322888707242d);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.6960335481567532d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.63039286521482d + "'", double1 == 49.63039286521482d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.594985873324243E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.16954561468575624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.714248156445102d) + "'", double1 == (-9.714248156445102d));
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4133588461770283d + "'", double1 == 1.4133588461770283d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.586013452313419E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.9982229502979694d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.7626139187213443d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7251533457729202d + "'", double1 == 0.7251533457729202d);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.1711987928317563d), 0.6666666666666667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.251366653795176d) + "'", double2 == (-0.251366653795176d));
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.45745887055879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 140.80202161000474d + "'", double1 == 140.80202161000474d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0828994398682557d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math.util.FastMath.atanh(14.206129690390002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5259944849453191d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5845913205073007d) + "'", double1 == (-0.5845913205073007d));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4744784643265698d + "'", double1 == 0.4744784643265698d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5176229516918588d, 1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40910736701644745d + "'", double2 == 0.40910736701644745d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.26736317900222273d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27392141095817213d) + "'", double1 == (-0.27392141095817213d));
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2992643663336907d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1531436238758581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7418898236506195d + "'", double1 == 1.7418898236506195d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.21095412737801214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19140858390139603d + "'", double1 == 0.19140858390139603d);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01745417873758517d + "'", double1 == 0.01745417873758517d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double2 = org.apache.commons.math.util.FastMath.max(5729.5779513082325d, (-1.563625436674731E37d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.5779513082325d + "'", double2 == 5729.5779513082325d);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.39550023939513446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6288880976732939d + "'", double1 == 0.6288880976732939d);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38879069538562044d + "'", double1 == 0.38879069538562044d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.023974957339495964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023970365332605832d + "'", double1 == 0.023970365332605832d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double2 = org.apache.commons.math.util.FastMath.min(2.164473663317525E39d, (-4.278070357299329d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.278070357299329d) + "'", double2 == (-4.278070357299329d));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5757472671756005d, (-4.965964575870387E-6d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000027416456947d + "'", double2 == 1.0000027416456947d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6535657774206833d, (-59.10786673843407d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6535657774206832d + "'", double2 == 0.6535657774206832d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.01976389133388643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019766465270917646d + "'", double1 == 0.019766465270917646d);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5803861773395897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.613523051633679d + "'", double1 == 0.613523051633679d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1833.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double1 = org.apache.commons.math.util.FastMath.rint(70187.3299035258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70187.0d + "'", double1 == 70187.0d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5146893481167585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8013982568176501d + "'", double1 == 0.8013982568176501d);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.01037448200916367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21809990377316002d) + "'", double1 == (-0.21809990377316002d));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0489207050997464d, 0.6283185307179586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0311019009248779d + "'", double2 == 1.0311019009248779d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6763796495118177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39100074888013286d) + "'", double1 == (-0.39100074888013286d));
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double1 = org.apache.commons.math.util.FastMath.log10(218.34317366865955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3391396185867572d + "'", double1 == 2.3391396185867572d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2374628952287586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2680279460309557d + "'", double1 == 0.2680279460309557d);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0016855760327141626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016855752345481393d + "'", double1 == 0.0016855752345481393d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2887644981019058d + "'", double1 == 0.2887644981019058d);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9918956474731391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.194206803317586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.194206803317587d + "'", double1 == 4.194206803317587d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8668856945829329d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8668856945829327d + "'", double2 == 0.8668856945829327d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9107344921579834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3822932005034183d + "'", double1 == 1.3822932005034183d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2520209545994675d + "'", double1 == 0.2520209545994675d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5878356581161792d + "'", double1 == 1.5878356581161792d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double1 = org.apache.commons.math.util.FastMath.log(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7776740307447068d + "'", double1 == 1.7776740307447068d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.280109889280518d + "'", double1 == 7.280109889280518d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.39592515018183416d), 0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8182092927093308d) + "'", double2 == (-0.8182092927093308d));
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double2 = org.apache.commons.math.util.FastMath.min(28.4764116085372d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.07463853704904692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07450039694134916d + "'", double1 == 0.07450039694134916d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double1 = org.apache.commons.math.util.FastMath.tanh(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6861038807844514d + "'", double1 == 0.6861038807844514d);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9258949934053917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1833978381792858d) + "'", double1 == (-1.1833978381792858d));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.07752552270710597d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double2 = org.apache.commons.math.util.FastMath.atan2(53.598150033144236d, 3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5138952820284055d + "'", double2 == 1.5138952820284055d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.40561604068401425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1531436238758581d + "'", double1 == 1.1531436238758581d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.675024856842625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.38816984899935d) + "'", double1 == (-1.38816984899935d));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.01037448200916367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374668118881438d) + "'", double1 == (-0.010374668118881438d));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344058570908087E43d + "'", double1 == 1.344058570908087E43d);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3235780930645504d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.056630991823551025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.056630991823551025d + "'", double1 == 0.056630991823551025d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.100327553785448E-17d + "'", double1 == 3.100327553785448E-17d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2636600956930295d + "'", double1 == 0.2636600956930295d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.30726023062048147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.013310924178631d + "'", double1 == 2.013310924178631d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        long long1 = org.apache.commons.math.util.FastMath.round(0.251952459411674d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.20638559288074199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20494781863014405d + "'", double1 == 0.20494781863014405d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.727787050299033d + "'", double1 == 5.727787050299033d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24929524866556063d, 0.24598042946131934d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.71056440958446d + "'", double2 == 0.71056440958446d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.042291128921215566d, (-0.7171092768909919d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.082686426854594d + "'", double2 == 3.082686426854594d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double1 = org.apache.commons.math.util.FastMath.asinh(31.531082122259832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.144372335284569d + "'", double1 == 4.144372335284569d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3106472496723416d + "'", double1 == 1.3106472496723416d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9434257847789064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7367922631517189d) + "'", double1 == (-0.7367922631517189d));
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.444945510686242d, 0.2636600956930295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5224112125982794d + "'", double2 == 1.5224112125982794d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.000007100844429d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7978269761159673E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.541950429394781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        float float1 = org.apache.commons.math.util.FastMath.abs((-3.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double2 = org.apache.commons.math.util.FastMath.max(0.011869972069403028d, 0.9735605461531053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9735605461531053d + "'", double2 == 0.9735605461531053d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2039425986338603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0133874022879147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0134774147872523d + "'", double1 == 1.0134774147872523d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.10862815709014047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10820388341878928d + "'", double1 == 0.10820388341878928d);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5670176959525735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5005006120658075d + "'", double1 == 2.5005006120658075d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0311019009248779d, 0.042291128921215566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5298038334472441d + "'", double2 == 1.5298038334472441d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 3);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8426540432368208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5686029556540668d + "'", double1 == 0.5686029556540668d);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5395389476264498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.982025710274982d + "'", double1 == 31.982025710274982d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9997894669934126d, 0.5146893481167585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5146893481167585d + "'", double2 == 0.5146893481167585d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9176021804981276d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8125492953065081d, 8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.812549295306508d + "'", double2 == 0.812549295306508d);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5298038334472441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5298038334472444d + "'", double1 == 1.5298038334472444d);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double1 = org.apache.commons.math.util.FastMath.acos(34.982780458176066d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.680482178387855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.330643198305168d + "'", double1 == 31.330643198305168d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4413226701961004d) + "'", double1 == (-1.4413226701961004d));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11012.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306922469822426d + "'", double1 == 9.306922469822426d);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.1745267124417875d, 64.40683631162594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03374953896461893d + "'", double2 == 0.03374953896461893d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        long long1 = org.apache.commons.math.util.FastMath.abs(72L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72L + "'", long1 == 72L);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7746914034386123d + "'", double1 == 0.7746914034386123d);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.0972644080713274d), 0.999303822951033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0972644080713274d) + "'", double2 == (-3.0972644080713274d));
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1223881891967115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12300481949001142d + "'", double1 == 0.12300481949001142d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.53567232102789d, 3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39415474995637106d + "'", double2 == 0.39415474995637106d);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066027288565E7d + "'", double1 == 3.748066027288565E7d);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.0349065850398866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03492076949174774d) + "'", double1 == (-0.03492076949174774d));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double1 = org.apache.commons.math.util.FastMath.exp(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103646.29347944363d + "'", double1 == 103646.29347944363d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.11083531506113443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.35039577400577d) + "'", double1 == (-6.35039577400577d));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4137774971580666d + "'", double1 == 1.4137774971580666d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.26848296087954215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double1 = org.apache.commons.math.util.FastMath.rint(271.6563638137265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 272.0d + "'", double1 == 272.0d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.6254645332759822E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6254645332759822E-9d + "'", double1 == 1.6254645332759822E-9d);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.7626139187213443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1301927452503904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1208093923028257d + "'", double1 == 2.1208093923028257d);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 218.82393831231084d + "'", double1 == 218.82393831231084d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1772213045900053d, (-1.541950429394781d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.541950429394781d) + "'", double2 == (-1.541950429394781d));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double1 = org.apache.commons.math.util.FastMath.acosh(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.145877209140337d + "'", double1 == 4.145877209140337d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9997894669934126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0032207546530480537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5675755665735347d + "'", double1 == 1.5675755665735347d);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double1 = org.apache.commons.math.util.FastMath.log1p(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double2 = org.apache.commons.math.util.FastMath.max(4.327255548039541d, (-0.6759364361843173d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.327255548039541d + "'", double2 == 4.327255548039541d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double2 = org.apache.commons.math.util.FastMath.max(0.28630352695323197d, (-0.9999999522687615d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28630352695323197d + "'", double2 == 0.28630352695323197d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1477896L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9964183022495265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988046725113348d + "'", double1 == 0.9988046725113348d);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.8957199490291566E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.24434609527920614d, (double) 1477896L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24434609527920617d + "'", double2 == 0.24434609527920617d);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4.155599707401653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9995086225327711d) + "'", double1 == (-0.9995086225327711d));
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.59470089220704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.00883809281975468d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9912008483163551d + "'", double1 == 0.9912008483163551d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.31440167219953424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6799781366958019d + "'", double1 == 0.6799781366958019d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.041914824263685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707055250154314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171379122748513d + "'", double1 == 0.9171379122748513d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7614700421419335d + "'", double1 == 0.7614700421419335d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double1 = org.apache.commons.math.util.FastMath.asin(68.40322401739336d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0741466672417709d + "'", double1 == 0.0741466672417709d);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.016963691108386116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25694496900608355d + "'", double1 == 0.25694496900608355d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.024401614617990376d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.024704267641731482d) + "'", double1 == (-0.024704267641731482d));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0051542672067486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6089008978477989d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1758128730549149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8660262953611549d + "'", double1 == 0.8660262953611549d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        long long2 = org.apache.commons.math.util.FastMath.max(72L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5654575915353359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5146333371963339d + "'", double1 == 0.5146333371963339d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.016455121993179136d, 0.5702159837110962d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01645512199317914d + "'", double2 == 0.01645512199317914d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.016963691108386116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0171083915764383d + "'", double1 == 1.0171083915764383d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.402867870327277d + "'", double1 == 1.402867870327277d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6242716385733329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6656171301354403d + "'", double1 == 0.6656171301354403d);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5589356908721315d) + "'", double1 == (-0.5589356908721315d));
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.226322265462393E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.89070482622585E-4d + "'", double1 == 7.89070482622585E-4d);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5574077246549018d), 3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5574077246549016d) + "'", double2 == (-1.5574077246549016d));
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double1 = org.apache.commons.math.util.FastMath.log(48.83850327565627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.888519003311339d + "'", double1 == 3.888519003311339d);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math.util.FastMath.sinh(70187.3299035258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8633639145424554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.262451664828748d, 0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0948417664383636d + "'", double2 == 1.0948417664383636d);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.762195691083632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5815258540844127d) + "'", double1 == (-0.5815258540844127d));
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.11083531506113443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11038368322811289d) + "'", double1 == (-0.11038368322811289d));
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1240849833762582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.992311331305609d + "'", double1 == 0.992311331305609d);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6199936158896424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5858935063788343d) + "'", double1 == (-0.5858935063788343d));
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.358364510279281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5671826220878478d + "'", double1 == 2.5671826220878478d);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963263292353d + "'", double1 == 1.5707963263292353d);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7251533457729202d, 4.621316807284695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7251533457729203d + "'", double2 == 0.7251533457729203d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8958717222609799d + "'", double1 == 0.8958717222609799d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        float float1 = org.apache.commons.math.util.FastMath.abs((-36.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.326356932486623d) + "'", double1 == (-6.326356932486623d));
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.13850408558812574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9904236327584265d + "'", double1 == 0.9904236327584265d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5704685469035022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171002582110388d) + "'", double1 == (-0.9171002582110388d));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8555035296395695d, 0.995950244065464d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8555035296395697d + "'", double2 == 0.8555035296395697d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.log1p(442413.3920089205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.000002260326852d + "'", double1 == 13.000002260326852d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.43087067877290786d), (-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.589527355068891d) + "'", double2 == (-2.589527355068891d));
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9991396955517629d + "'", double1 == 0.9991396955517629d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.09807249034549381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9936224697175191d + "'", double1 == 0.9936224697175191d);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4142135623730951d, (-49.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4142135623730951d + "'", double2 == 1.4142135623730951d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.4521234009544473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2389895202515557d + "'", double1 == 1.2389895202515557d);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double1 = org.apache.commons.math.util.FastMath.expm1(43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3756877578035446E18d + "'", double1 == 5.3756877578035446E18d);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9297971986812833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6574149189921918d + "'", double1 == 0.6574149189921918d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(12.839059264996925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.839059264996926d + "'", double1 == 12.839059264996926d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.010374668122887303d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374482021181462d) + "'", double1 == (-0.010374482021181462d));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8746486203042796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8746486203042797d + "'", double1 == 0.8746486203042797d);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        double double1 = org.apache.commons.math.util.FastMath.expm1(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134298E15d + "'", double1 == 1.5860134523134298E15d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        int int1 = org.apache.commons.math.util.FastMath.round(1477896.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5898595141626499d + "'", double1 == 0.5898595141626499d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double1 = org.apache.commons.math.util.FastMath.log1p(12.319647397271215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.589240193085527d + "'", double1 == 2.589240193085527d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.105865973135149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0341118110464225d + "'", double1 == 1.0341118110464225d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double2 = org.apache.commons.math.util.FastMath.min(0.344459247866038d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.344459247866038d + "'", double2 == 0.344459247866038d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double1 = org.apache.commons.math.util.FastMath.acosh(32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.180078690030054d + "'", double1 == 4.180078690030054d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.69314718055996d + "'", double1 == 100.69314718055996d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4.278070357299329d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999615353518653d) + "'", double1 == (-0.999615353518653d));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double1 = org.apache.commons.math.util.FastMath.cosh(350773.07414689334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9210509322442526d), 4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.963170812508975E-42d) + "'", double2 == (-1.963170812508975E-42d));
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9998151400298467d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(54.631515035613056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3130.1552399461275d + "'", double1 == 3130.1552399461275d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707956501570803d + "'", double1 == 1.5707956501570803d);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6440339106610352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5480419174142943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2442033263957681d + "'", double1 == 1.2442033263957681d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9700496918579988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5085698741017626d + "'", double1 == 1.5085698741017626d);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.3015966351452155d, 0.9506628842154309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.301596635145215d + "'", double2 == 3.301596635145215d);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.000423867565398E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.000424080966578E-4d + "'", double1 == 4.000424080966578E-4d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8765007606992337d) + "'", double1 == (-0.8765007606992337d));
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double2 = org.apache.commons.math.util.FastMath.min(2.2350469597522027d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.24425607142663947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6250984987600411d + "'", double1 == 0.6250984987600411d);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36L), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6535657774206832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8585102001747416d + "'", double1 == 0.8585102001747416d);
    }
}

