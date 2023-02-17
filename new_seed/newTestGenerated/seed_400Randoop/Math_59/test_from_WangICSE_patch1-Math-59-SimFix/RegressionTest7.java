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
        double double1 = org.apache.commons.math.util.FastMath.log10(10.566701978945693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.02393945884531d + "'", double1 == 1.02393945884531d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double double1 = org.apache.commons.math.util.FastMath.sin(31.306852819440046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10885756869875891d) + "'", double1 == (-0.10885756869875891d));
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6634478624283493d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6634478624283492d) + "'", double1 == (-0.6634478624283492d));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5661631704961736d, 1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31973401013896247d + "'", double2 == 0.31973401013896247d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11012.99999999999d + "'", double1 == 11012.99999999999d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.2171749524547d + "'", double1 == 192.2171749524547d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9584036466699127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01845154248647563d) + "'", double1 == (-0.01845154248647563d));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double double1 = org.apache.commons.math.util.FastMath.log(192.2171749524547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.258625852338093d + "'", double1 == 5.258625852338093d);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double1 = org.apache.commons.math.util.FastMath.log(0.706549328424579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34736225845333263d) + "'", double1 == (-0.34736225845333263d));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.326458826000224E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5799018512655504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23664550481769292d) + "'", double1 == (-0.23664550481769292d));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8328575610666067d + "'", double1 == 1.8328575610666067d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 5L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32179921168174863d + "'", double1 == 0.32179921168174863d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.2646180550224786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.264618055022479d + "'", double1 == 2.264618055022479d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(235.781718468518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13509.297354587858d + "'", double1 == 13509.297354587858d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7037024113814048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8486372946337355d + "'", double1 == 0.8486372946337355d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2025.4348094013415d), 0.2106815084135339d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5638717219103803d, 1.470434916701856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43065237603874346d + "'", double2 == 0.43065237603874346d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.60451646247372d + "'", double1 == 22.60451646247372d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5430806348152448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.41200782328137d + "'", double1 == 88.41200782328137d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double1 = org.apache.commons.math.util.FastMath.log10(631011.7625152355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8000374548825615d + "'", double1 == 5.8000374548825615d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.03327228511758094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.033284571251210544d) + "'", double1 == (-0.033284571251210544d));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999902065507035d) + "'", double1 == (-0.9999902065507035d));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7010979104724595d, (-0.1731525181731936d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7010979104724595d + "'", double2 == 0.7010979104724595d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.967764757225369d + "'", double1 == 4.967764757225369d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3012989023072947d) + "'", double1 == (-2.3012989023072947d));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3282591577868472d + "'", double1 == 1.3282591577868472d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.248291097914389d, 0.2538007084319281d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5111254139617192d + "'", double2 == 1.5111254139617192d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01362395589953866d + "'", double1 == 0.01362395589953866d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double1 = org.apache.commons.math.util.FastMath.log(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1851160204964712d + "'", double1 == 1.1851160204964712d);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.111512116496156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6190869198926164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4818623606494503d + "'", double1 == 0.4818623606494503d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.5435938325608288E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2066742274911189d + "'", double1 == 0.2066742274911189d);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.570796326794803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785474735d + "'", double1 == 1.0232274785474735d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16765036534441544d + "'", double1 == 0.16765036534441544d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.054663569220438d + "'", double1 == 20.054663569220438d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8884814209157137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4146685492575237d + "'", double1 == 1.4146685492575237d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.762195691083632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.04283105900939d + "'", double1 == 42.04283105900939d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8792846300053567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7702828829128011d) + "'", double1 == (-0.7702828829128011d));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.1011775851339626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.797048609501637d) + "'", double1 == (-5.797048609501637d));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), (float) 34L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.018848131789186d + "'", double1 == 8.018848131789186d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5851102438039822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7208852476093055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.884191021882157d + "'", double1 == 2.884191021882157d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8498912464906307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.145976303209723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7874470920119091d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.010715004697646389d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double1 = org.apache.commons.math.util.FastMath.signum(22.18070977745259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.663528081877013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998220482235222d + "'", double1 == 0.9998220482235222d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9494131316918538d + "'", double1 == 0.9494131316918538d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6765125521465636d + "'", double1 == 0.6765125521465636d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681098d + "'", double1 == 1.0986122886681098d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(115.35421880301885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6609.309886441623d + "'", double1 == 6609.309886441623d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.5860134523134338E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0484411939287768d, 0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0484411939287768d + "'", double2 == 1.0484411939287768d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1275951258796755d + "'", double1 == 1.1275951258796755d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6094298995694992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5473244135939721d + "'", double1 == 0.5473244135939721d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        long long1 = org.apache.commons.math.util.FastMath.abs(57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3113615847218745d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6547583753982603d), 1.4223708422464203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6547583753982603d) + "'", double2 == (-0.6547583753982603d));
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        long long1 = org.apache.commons.math.util.FastMath.round(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8887992509694498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8887992509694499d + "'", double1 == 0.8887992509694499d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        long long2 = org.apache.commons.math.util.FastMath.max(2063L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2063L + "'", long2 == 2063L);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8575532158463938d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5473244135939721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4985122297124996d + "'", double1 == 0.4985122297124996d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.003215579132524195d, 43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4006055941673354E-109d + "'", double2 == 1.4006055941673354E-109d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.03422749178784308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32468210900718336d) + "'", double1 == (-0.32468210900718336d));
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5795227773499363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7612639340924646d + "'", double1 == 0.7612639340924646d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double1 = org.apache.commons.math.util.FastMath.log(10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.307560258420629d + "'", double1 == 2.307560258420629d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        int int1 = org.apache.commons.math.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2775405404515378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.289563200948447d + "'", double1 == 1.289563200948447d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 61L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 61.0f + "'", float1 == 61.0f);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5712556729872575d), 11014.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11014.0d + "'", double2 == 11014.0d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(91.10170611520638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.1017061152064d + "'", double1 == 91.1017061152064d);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 28L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.332204510175204d + "'", double1 == 3.332204510175204d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103645.29347944363d + "'", double1 == 103645.29347944363d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7047238563609084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8766237084496562d) + "'", double1 == (-0.8766237084496562d));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9991461404922782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997152991171921d + "'", double1 == 0.9997152991171921d);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        long long2 = org.apache.commons.math.util.FastMath.min(4477855L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4251053392695819d, 0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3156563365585749d + "'", double2 == 0.3156563365585749d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.007421261501110636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double2 = org.apache.commons.math.util.FastMath.min(3.6109179126442243d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6109179126442243d + "'", double2 == 3.6109179126442243d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.010714184646452608d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010714389643952717d) + "'", double1 == (-0.010714389643952717d));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6416164750242573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8995489723601522d + "'", double1 == 1.8995489723601522d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(28.458847799916846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0530864679749365d + "'", double1 == 3.0530864679749365d);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3023186765274488d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.40429714988426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1850304425981046d + "'", double1 == 1.1850304425981046d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double double1 = org.apache.commons.math.util.FastMath.sinh(148.2089053595242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162197055786747E64d + "'", double1 == 1.162197055786747E64d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9205508739623456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3147657312070724d + "'", double1 == 1.3147657312070724d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.46627444884951624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4850747061979428d) + "'", double1 == (-0.4850747061979428d));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.43065237603874346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.723728965735361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.4650188248182272d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.680482178387855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.163442205927363d + "'", double1 == 2.163442205927363d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.2734626020942639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2734626020942639d + "'", double1 == 1.2734626020942639d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8813735870195429d), 4.741297982545108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195429d) + "'", double2 == (-0.8813735870195429d));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.465190328815662E-32d + "'", double1 == 2.465190328815662E-32d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041905639223649d + "'", double1 == 4.041905639223649d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.541950429394781d), (-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5419504293947808d) + "'", double2 == (-1.5419504293947808d));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987703015257d + "'", double1 == 0.19611987703015257d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.155599707401653d), 1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.155599707401652d) + "'", double2 == (-4.155599707401652d));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.25135294326645075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25407782155012953d + "'", double1 == 0.25407782155012953d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.461578766216512E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9198684.01795415d + "'", double1 == 9198684.01795415d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.008799151683644863d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9912394475550458d + "'", double1 == 0.9912394475550458d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175190277575942d + "'", double1 == 1.175190277575942d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5669767943827968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8435285439294575d + "'", double1 == 0.8435285439294575d);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        float float2 = org.apache.commons.math.util.FastMath.min(4477855.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6931471805599453d, 43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.12841819466121d + "'", double2 == 43.12841819466121d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931436434419473d + "'", double1 == 0.6931436434419473d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.4944324908505626d), (-1.6567305011816795d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4944324908505627d) + "'", double2 == (-0.4944324908505627d));
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7052062927726025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3492649051111073d) + "'", double1 == (-0.3492649051111073d));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.013388202148675738d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-17.123726230311483d), 1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4872649669851485d) + "'", double2 == (-1.4872649669851485d));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7933286322891901d + "'", double1 == 0.7933286322891901d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6866289917030872d, (-4.965964575870387E-6d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.965964575870387E-6d) + "'", double2 == (-4.965964575870387E-6d));
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.167906788198742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8235999793529158d + "'", double1 == 0.8235999793529158d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.16243485560816776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16388652634107947d + "'", double1 == 0.16388652634107947d);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 793006726156715L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6699684639824475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6699684639824476d + "'", double1 == 0.6699684639824476d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-35.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308241d + "'", double1 == 57.29577951308241d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double1 = org.apache.commons.math.util.FastMath.exp(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.8000374548825615d, (-0.7649452892668915d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26062568111729484d + "'", double2 == 0.26062568111729484d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.425305228849993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8859573840357964d + "'", double1 == 0.8859573840357964d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8726936208978296d, 0.28738952988751526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9616218014898972d + "'", double2 == 0.9616218014898972d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6138893069268366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6138893069268365d) + "'", double1 == (-0.6138893069268365d));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1158173859015895d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-53), 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768986d + "'", double1 == 5557.690612768986d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078964d) + "'", double1 == (-0.8414709848078964d));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double1 = org.apache.commons.math.util.FastMath.log(0.010714594648513057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.536148481055609d) + "'", double1 == (-4.536148481055609d));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.2557610379370634d), 0.5662191695169732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2557610379370634d) + "'", double2 == (-1.2557610379370634d));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double1 = org.apache.commons.math.util.FastMath.abs(39.82204982013094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.82204982013094d + "'", double1 == 39.82204982013094d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.980232238769532E-8d, 88.41200782328137d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9802322387695326E-8d + "'", double2 == 2.9802322387695326E-8d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3147657312070724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3147657312070724d + "'", double1 == 1.3147657312070724d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0032155680495951195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0032155791325012752d + "'", double1 == 0.0032155791325012752d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        int int2 = org.apache.commons.math.util.FastMath.max(34, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6061093801777692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5448995862811551d + "'", double1 == 0.5448995862811551d);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.0013530756255686267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0013530760384405207d) + "'", double1 == (-0.0013530760384405207d));
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double1 = org.apache.commons.math.util.FastMath.acos(11013.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6732878491822778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5871384658255191d + "'", double1 == 0.5871384658255191d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.016591253173120855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016592775780932937d + "'", double1 == 0.016592775780932937d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.912812809961445d, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5528283781107654E-4d + "'", double2 == 3.5528283781107654E-4d);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.087344633461887d + "'", double1 == 2.087344633461887d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7010979104724595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.011869972069403028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000704489456242d + "'", double1 == 1.0000704489456242d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.7507239941348802d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double1 = org.apache.commons.math.util.FastMath.floor(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        long long1 = org.apache.commons.math.util.FastMath.round(3.414062290979883d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        long long1 = org.apache.commons.math.util.FastMath.round(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0664977916380836d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.484141155511086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9419017124241984d) + "'", double1 == (-0.9419017124241984d));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800350358700291d + "'", double1 == 0.011800350358700291d);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.369491427691419d + "'", double1 == 4.369491427691419d);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313429E15d + "'", double1 == 1.586013452313429E15d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.11275809360067206d, 0.7642469915557847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11275809360067207d + "'", double2 == 0.11275809360067207d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.414062290979883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9631092280360398d) + "'", double1 == (-0.9631092280360398d));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.27767826196252E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0316268884157165d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.258625852338093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2931693902409593d + "'", double1 == 2.2931693902409593d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        float float2 = org.apache.commons.math.util.FastMath.max(4477855.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4477855.0f + "'", float2 == 4477855.0f);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.041886155779305d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4477855.166669106d, 1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707960340995768d + "'", double2 == 1.5707960340995768d);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double1 = org.apache.commons.math.util.FastMath.ulp(199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.155615773557598E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1310377402202207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.80368898463264d + "'", double1 == 64.80368898463264d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.1898547757074525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.47981579114005d + "'", double1 == 1.47981579114005d);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17364817766693033d + "'", double1 == 0.17364817766693033d);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9672751491015754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0481349678163028d + "'", double1 == 2.0481349678163028d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.00671091585859779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        double double2 = org.apache.commons.math.util.FastMath.min(25794.151202054116d, (-0.8410058489917948d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8410058489917948d) + "'", double2 == (-0.8410058489917948d));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double1 = org.apache.commons.math.util.FastMath.floor(41.67132555791601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.0d + "'", double1 == 41.0d);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 61L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.0413863622181858d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8809373872769856d, (double) 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010423690582926685d + "'", double2 == 0.010423690582926685d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.017437393630756623d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.560391584864855d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double1 = org.apache.commons.math.util.FastMath.acosh(31.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1268741377911216d + "'", double1 == 4.1268741377911216d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.1215871267631296E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.121587127777053E-5d + "'", double1 == 3.121587127777053E-5d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 229.1831180523293d + "'", double1 == 229.1831180523293d);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.32220799131551875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005623590324693097d) + "'", double1 == (-0.005623590324693097d));
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.226694653653776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7905015022311375d + "'", double1 == 2.7905015022311375d);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999597035524652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29347069670921d + "'", double1 == 57.29347069670921d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.8867207287394443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4604047707757553d + "'", double1 == 0.4604047707757553d);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 53L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 34);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double1 = org.apache.commons.math.util.FastMath.log(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7013126796226725d + "'", double1 == 2.7013126796226725d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9640275800758169d) + "'", double1 == (-0.9640275800758169d));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7560632008621517d + "'", double1 == 0.7560632008621517d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999999962690542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709827920579d + "'", double1 == 0.8414709827920579d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, 61L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61L + "'", long2 == 61L);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.9815145531741134d, 1.1071487177940904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61681757188183d + "'", double2 == 4.61681757188183d);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3153519440251744d, 1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3153519440251744d + "'", double2 == 1.3153519440251744d);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.230178009514076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5420777404922401d + "'", double1 == 1.5420777404922401d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8125492953065081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9485124034091289d + "'", double1 == 0.9485124034091289d);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double1 = org.apache.commons.math.util.FastMath.asin(14.593078804542712d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.6332258730806833E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-265.42343799244867d) + "'", double1 == (-265.42343799244867d));
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.850400315662227d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double1 = org.apache.commons.math.util.FastMath.cos(471.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9715993241920361d + "'", double1 == 0.9715993241920361d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7311284168939934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7980289913843086d + "'", double1 == 0.7980289913843086d);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9930737478319205d), 0.6719977351570302d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double2 = org.apache.commons.math.util.FastMath.min(0.12208469106610245d, (-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008838092819754681d) + "'", double2 == (-0.008838092819754681d));
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46313536681893186d + "'", double1 == 0.46313536681893186d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5249732550858636d), 1.4189118803430434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5249732550858636d) + "'", double2 == (-0.5249732550858636d));
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double1 = org.apache.commons.math.util.FastMath.log(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.22541995827491d + "'", double1 == 4.22541995827491d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597358306d + "'", double1 == 21.487562597358306d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.7811352629728695E-34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.78113526297287E-34d + "'", double1 == 2.78113526297287E-34d);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.12208469106610245d, 4.2351647362715017E-22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.013310924178631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796106d + "'", double1 == 9.848857801796106d);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9187506059390845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5809530818320503d + "'", double1 == 1.5809530818320503d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5777218104420236E-30d + "'", double1 == 1.5777218104420236E-30d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5740962263285927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9592964011265267d + "'", double1 == 0.9592964011265267d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(115.35421880301885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8679319012240025d + "'", double1 == 4.8679319012240025d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4573750283097829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.205658776827104d + "'", double1 == 26.205658776827104d);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6540753540578407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.22835733688570242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2333184128133814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9727829084506698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.73635503668452d + "'", double1 == 55.73635503668452d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8059788673771909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.042032398977615d + "'", double1 == 1.042032398977615d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2574599505487548d + "'", double1 == 0.2574599505487548d);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.476482730108396d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5253829059023629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5837461910522398d + "'", double1 == 0.5837461910522398d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7938702090612697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6709920726797248d + "'", double1 == 0.6709920726797248d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5707963267948963d), 0.9592964011265267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0225411652981327d) + "'", double2 == (-1.0225411652981327d));
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-122.141774015765d) + "'", double1 == (-122.141774015765d));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.4441141450677315d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9402927170540545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.718281828459045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5249732550858636d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5831805218535748d) + "'", double1 == (-0.5831805218535748d));
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.01505863975516233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015058070638819365d) + "'", double1 == (-0.015058070638819365d));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0413863622181858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7090374285794947d + "'", double1 == 1.7090374285794947d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.8421709430404007E-14d, 5.8000374548825615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.900263084763043E-15d + "'", double2 == 4.900263084763043E-15d);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9402241834946017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3698791623868107d + "'", double1 == 1.3698791623868107d);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091340L, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2538411278428352d + "'", double1 == 1.2538411278428352d);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.log1p(103645.29347944363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257746d + "'", double1 == 11.548739357257746d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6138893069268366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.660978172148109d) + "'", double1 == (-0.660978172148109d));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3773411238234914d, 7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3773411238234914d + "'", double2 == 1.3773411238234914d);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.321264196906668d + "'", double1 == 2.321264196906668d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8214948155164382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6877108094869118d + "'", double1 == 0.6877108094869118d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9394827641334688d), 0.2199463009580406d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9394827641334688d) + "'", double2 == (-0.9394827641334688d));
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6416164750242573d, 0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9992066252797287d + "'", double2 == 0.9992066252797287d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6769292032740716d, 31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6769292032740717d + "'", double2 == 0.6769292032740717d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8766237084496562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3609952876549178d) + "'", double1 == (-1.3609952876549178d));
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.18349077126961408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18452216030183452d + "'", double1 == 0.18452216030183452d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.643056057042617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double1 = org.apache.commons.math.util.FastMath.floor(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999962690542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999987563514d + "'", double1 == 0.9999999987563514d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.6578275518955335E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 405.30084950781344d + "'", double1 == 405.30084950781344d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.000072811237089d, 0.9893663289106042d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7907797700779194d + "'", double2 == 0.7907797700779194d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double1 = org.apache.commons.math.util.FastMath.log10(229.1831180523293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.360182623737135d + "'", double1 == 2.360182623737135d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.918513704344091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 135.79913804720726d + "'", double1 == 135.79913804720726d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double1 = org.apache.commons.math.util.FastMath.asinh(192.2171749524547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.951779799197592d + "'", double1 == 5.951779799197592d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.41333646188643103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4023892583804743d + "'", double1 == 0.4023892583804743d);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8005182678076421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.030706839516532d + "'", double1 == 1.030706839516532d);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9748575314241001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.7678470809183597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7678470809183595d) + "'", double1 == (-1.7678470809183595d));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(208.2575111000242d, 1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 208.25751110002417d + "'", double2 == 208.25751110002417d);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1739244040089578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0834779204067602d + "'", double1 == 1.0834779204067602d);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.033284571251210544d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.033278428524032025d) + "'", double1 == (-0.033278428524032025d));
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1749148048147111d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.010714594648513058d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.4176620615017429d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2688363802786087d, 0.1912734868318314d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.421175735948942d + "'", double2 == 1.421175735948942d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double2 = org.apache.commons.math.util.FastMath.min(4.3777255673228614d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1321790744880604d) + "'", double1 == (-1.1321790744880604d));
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1881062682776882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.185918577997794d + "'", double1 == 0.185918577997794d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double1 = org.apache.commons.math.util.FastMath.atanh(405.30084950781344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.6481783560655225d, 1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2703763609027428d + "'", double2 == 1.2703763609027428d);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.3305834282671767d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3052998807949199d + "'", double1 == 1.3052998807949199d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5837461910522398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6233349779445013d + "'", double1 == 0.6233349779445013d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037614443570399268d + "'", double1 == 0.0037614443570399268d);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 793006726156715L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156715E14d + "'", double1 == 7.93006726156715E14d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.1731525181731936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0030220815502415457d) + "'", double1 == (-0.0030220815502415457d));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6739119692147136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17139683014300192d) + "'", double1 == (-0.17139683014300192d));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.590038910379708E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5831805218535748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1749242172945042d + "'", double1 == 1.1749242172945042d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double1 = org.apache.commons.math.util.FastMath.sinh(75.13548422015074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.137451141482001E32d + "'", double1 == 2.137451141482001E32d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8792846300053567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.645154496685698d + "'", double1 == 2.645154496685698d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6866289917030872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.641678208992432d + "'", double1 == 0.641678208992432d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6190869198926164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8572314663028362d + "'", double1 == 1.8572314663028362d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        double double2 = org.apache.commons.math.util.FastMath.pow(70.0d, (-0.1749148048147111d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.47562539683640714d + "'", double2 == 0.47562539683640714d);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double2 = org.apache.commons.math.util.FastMath.atan2(26.564939304500307d, 44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5355249473625149d + "'", double2 == 0.5355249473625149d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.6540753540578407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5199225847045832d + "'", double1 == 0.5199225847045832d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.883847335314108d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5872139151568908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5578300447656457d) + "'", double1 == (-0.5578300447656457d));
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.604073567738472d + "'", double1 == 7.604073567738472d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24874731882562595d + "'", double1 == 0.24874731882562595d);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        double double1 = org.apache.commons.math.util.FastMath.tanh(14.32394487827058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999992766d + "'", double1 == 0.9999999999992766d);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.1321790744880604d), 1.5186530699855672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6406247064240178d) + "'", double2 == (-0.6406247064240178d));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7895608642289975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9100930808226745d + "'", double1 == 0.9100930808226745d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.465190328815662E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8059788673771909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5911027535847991d + "'", double1 == 0.5911027535847991d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4537710156022707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2792211365930393d + "'", double1 == 3.2792211365930393d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2646180550224786d, 0.0965832309956893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2646180550224786d + "'", double2 == 2.2646180550224786d);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.8651416687828506E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.86514166878E11d + "'", double1 == 1.86514166878E11d);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4062887760379899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5012360108561111d + "'", double1 == 1.5012360108561111d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3564962504917153d + "'", double1 == 1.3564962504917153d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        double double1 = org.apache.commons.math.util.FastMath.sin(42.042831059009366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9328075542772654d) + "'", double1 == (-0.9328075542772654d));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double2 = org.apache.commons.math.util.FastMath.atan2(34.99999999540764d, 1.4645918875615231d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5289752430914307d + "'", double2 == 1.5289752430914307d);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.8995489723601522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999999962690542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.049875627632678d + "'", double1 == 10.049875627632678d);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), 793006726156715L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.8572314663028362d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03513845701100175d + "'", double1 == 0.03513845701100175d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1752011936438014d, (-57.295779513082316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-57.295779513082316d) + "'", double2 == (-57.295779513082316d));
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 36L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.950821873121645d, 1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9508218731216451d + "'", double2 == 0.9508218731216451d);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7047238563609084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.35283017853041d + "'", double1 == 2.35283017853041d);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8850917695760475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2222844543037337d + "'", double1 == 1.2222844543037337d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.145976303209723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0038806863757765916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003873175936571774d + "'", double1 == 0.003873175936571774d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.634202896939395d, 0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4149155116131065d + "'", double2 == 1.4149155116131065d);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6810646106438578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9939266104413662d + "'", double1 == 0.9939266104413662d);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        double double2 = org.apache.commons.math.util.FastMath.min(0.43065237603874346d, 0.8726001743881419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43065237603874346d + "'", double2 == 0.43065237603874346d);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5604053336141724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6334239030790434d + "'", double1 == 0.6334239030790434d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.2599210498948732d), 0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0579128778628137d) + "'", double2 == (-1.0579128778628137d));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3340213222681154E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999999999999992d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246548996d) + "'", double1 == (-1.5574077246548996d));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.20350434138645834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2256904788257033d + "'", double1 == 1.2256904788257033d);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9577535432799731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.875235843642685d + "'", double1 == 54.875235843642685d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9023219280642616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4354737487211742d + "'", double1 == 1.4354737487211742d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 793006726156715L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899276870949832d + "'", double1 == 14.899276870949832d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4771212547196624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.01573708249221756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015737732063462555d) + "'", double1 == (-0.015737732063462555d));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1215871267631296E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.121587125749206E-5d + "'", double1 == 3.121587125749206E-5d);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        int int1 = org.apache.commons.math.util.FastMath.round(61.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.854275151361752d) + "'", double1 == (-5.854275151361752d));
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.476411608537195d + "'", double1 == 28.476411608537195d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double2 = org.apache.commons.math.util.FastMath.min(11014.0d, 4.3112315471152565E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11014.0d + "'", double2 == 11014.0d);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9154657226686728d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double1 = org.apache.commons.math.util.FastMath.floor(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8936827444199411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46530948110595355d + "'", double1 == 0.46530948110595355d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999929257765152d, (-1.570796326793582d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999929257765152d + "'", double2 == 0.9999929257765152d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5410520681182421d, 1.4577979139729038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4577979139729038d + "'", double2 == 1.4577979139729038d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.25135294326645075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3167185052447672d + "'", double1 == 1.3167185052447672d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 11013L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.22403837382938316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6073524726172997d + "'", double1 == 0.6073524726172997d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(68.40322401739334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.270624161294801d + "'", double1 == 8.270624161294801d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5169642656554078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.030035113619780257d, 0.8588413721833611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03003511361978026d + "'", double2 == 0.03003511361978026d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8636125475150462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6981142704849399d + "'", double1 == 0.6981142704849399d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8178372899398717d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44138521123769286d + "'", double1 == 0.44138521123769286d);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.35283017853041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3300364017644222d + "'", double1 == 1.3300364017644222d);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9998220482235222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.66352808187712d + "'", double1 == 4.66352808187712d);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7013126796226725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2162489520625863d + "'", double1 == 1.2162489520625863d);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.27922113659304d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.185918577997794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.185918577997794d + "'", double1 == 0.185918577997794d);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990550507841017d + "'", double1 == 0.9990550507841017d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4772282118533498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6486102616822905d) + "'", double1 == (-0.6486102616822905d));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.242924991852436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.3166616956814557d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.756960248771417E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.756960248770389E-7d + "'", double1 == 6.756960248770389E-7d);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8373564163103412d, 1.048804093852466d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8373564163103413d + "'", double2 == 0.8373564163103413d);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9102712041190427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4024150726078907d + "'", double1 == 0.4024150726078907d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.003761435487319938d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.4120080778437435E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4120080778437435E-10d) + "'", double1 == (-1.4120080778437435E-10d));
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.021099236524914633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020879729880431727d + "'", double1 == 0.020879729880431727d);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-34.768015146316124d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5544646780753981d), 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.554464678075398d) + "'", double2 == (-1.554464678075398d));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.565996913733098E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        float float2 = org.apache.commons.math.util.FastMath.min(28.0f, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4412763792521019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7699888226765638d, 57.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3854156042398065E-7d + "'", double2 == 3.3854156042398065E-7d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9589242746631385d) + "'", double1 == (-0.9589242746631385d));
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5711009442099724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9172007050216672d + "'", double1 == 0.9172007050216672d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5370843467987585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8592040757872879d + "'", double1 == 0.8592040757872879d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999999999992766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870190316d + "'", double1 == 0.8813735870190316d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.7174132092735896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.085536923187668d + "'", double1 == 20.085536923187668d);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.27922113659304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2748040350427206d + "'", double1 == 1.2748040350427206d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.77037274892726E13d, 4.61681757188183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.770372748927258E13d + "'", double2 == 7.770372748927258E13d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.467720335926631E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math.util.FastMath.log(179.50384807756595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.1901966454565756d + "'", double1 == 5.1901966454565756d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1454450659800949d) + "'", double1 == (-0.1454450659800949d));
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7612492183413337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6418121870003564d + "'", double1 == 0.6418121870003564d);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.008360251176708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double1 = org.apache.commons.math.util.FastMath.ceil(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(97.00000000000001d, 3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5224670302876948d + "'", double1 == 1.5224670302876948d);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 9223372036854775807L, 0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double1 = org.apache.commons.math.util.FastMath.abs(26.564939304500307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.564939304500307d + "'", double1 == 26.564939304500307d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5896069690147184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double1 = org.apache.commons.math.util.FastMath.sin((-17.123726230311483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9880063794199373d + "'", double1 == 0.9880063794199373d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double2 = org.apache.commons.math.util.FastMath.max(1.529468828731893d, (-8.51313365841725d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.529468828731893d + "'", double2 == 1.529468828731893d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5195675877329186d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9508218731216451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6682507571764081d + "'", double1 == 0.6682507571764081d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double1 = org.apache.commons.math.util.FastMath.expm1(41.67132555791601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.25206461907182003E18d + "'", double1 == 1.25206461907182003E18d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9328075542772654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.700194452612313d) + "'", double1 == (-2.700194452612313d));
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4354737487211742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4354737487211744d + "'", double1 == 1.4354737487211744d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2376976788168585d) + "'", double1 == (-2.2376976788168585d));
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 4477855.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5656219277155325E8d + "'", double1 == 2.5656219277155325E8d);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.544068044350276d + "'", double1 == 1.544068044350276d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27996198883595164d) + "'", double1 == (-0.27996198883595164d));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32786670017476716d + "'", double1 == 0.32786670017476716d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0686474581524463E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.000000000000092d + "'", double1 == 30.000000000000092d);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.46627444884951624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7754382253313955d) + "'", double1 == (-0.7754382253313955d));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 3.0f, 2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.381919166334245d + "'", double2 == 2.381919166334245d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.69314718055995d + "'", double1 == 100.69314718055995d);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49260818941222645d + "'", double1 == 0.49260818941222645d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double1 = org.apache.commons.math.util.FastMath.ceil(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999995127847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761594155751147d + "'", double1 == 0.761594155751147d);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        double double1 = org.apache.commons.math.util.FastMath.cosh(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2829673798684508E23d + "'", double1 == 2.2829673798684508E23d);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5403023058681398d, 0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0420593050711329d + "'", double2 == 1.0420593050711329d);
    }
}

