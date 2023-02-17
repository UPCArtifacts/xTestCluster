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
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.02187509047518678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7386198489108358d, 24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.738619848910836d + "'", double2 == 1.738619848910836d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int int2 = org.apache.commons.math.util.FastMath.min(57, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int int1 = org.apache.commons.math.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int int2 = org.apache.commons.math.util.FastMath.max(84677176, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84677176 + "'", int2 == 84677176);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double double1 = org.apache.commons.math.util.FastMath.sinh(23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.35708453783909466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34990093648368725d + "'", double1 == 0.34990093648368725d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.16256464224861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6316845824854256d + "'", double1 == 1.6316845824854256d);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 149L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.173186268412274d + "'", double1 == 2.173186268412274d);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.3431851641374776E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.343185164137478E20d + "'", double1 == 3.343185164137478E20d);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7068886140376748d, 0.007582068426303211d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5600707647582166d + "'", double2 == 1.5600707647582166d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22160826669200384d + "'", double1 == 0.22160826669200384d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014686439244896978d) + "'", double1 == (-0.014686439244896978d));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.17230617170547372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5564595639981197d) + "'", double1 == (-0.5564595639981197d));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.366006587752973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43651109766838614d) + "'", double1 == (-0.43651109766838614d));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8492499565656627d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9991396955517629d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double double1 = org.apache.commons.math.util.FastMath.log(966980.6941481612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.781933809549642d + "'", double1 == 13.781933809549642d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.20825283396989785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20529357054986405d) + "'", double1 == (-0.20529357054986405d));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.4677176E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.9277663657849295d + "'", double1 == 7.9277663657849295d);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.5068440202380022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1464525897078246d) + "'", double1 == (-1.1464525897078246d));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.842859999667966E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0537144249814574d + "'", double1 == 3.0537144249814574d);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.021373301521365424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2245999714347802d + "'", double1 == 1.2245999714347802d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double double1 = org.apache.commons.math.util.FastMath.tan(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22481137595997358d) + "'", double1 == (-0.22481137595997358d));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5564595639981197d), 0.618990892446662d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        float float2 = org.apache.commons.math.util.FastMath.max(1.58601345E15f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.729577951308232d, 0.29540897515091935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.674774076371737d + "'", double2 == 1.674774076371737d);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.7711377407401363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.72623702062758d + "'", double1 == 21.72623702062758d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.6332258730806833E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5087272903217452E21d + "'", double1 == 1.5087272903217452E21d);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double double1 = org.apache.commons.math.util.FastMath.log10(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041984501486787d + "'", double1 == 4.041984501486787d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.041984501486787d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9048544643595436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9672221742711605d + "'", double1 == 0.9672221742711605d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8607616271094027d + "'", double1 == 0.8607616271094027d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double double2 = org.apache.commons.math.util.FastMath.max(0.49670059543249345d, 0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49670059543249345d + "'", double2 == 0.49670059543249345d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(89.42706130231652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.456588248534274d + "'", double1 == 9.456588248534274d);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.363655626077857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4343980560668567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4098038795832663d + "'", double1 == 0.4098038795832663d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.053286411214247056d, (-0.7091979782135539d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.066597411041876d + "'", double2 == 3.066597411041876d);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009841418106225986d + "'", double1 == 0.009841418106225986d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7207960780149949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32739901385847947d) + "'", double1 == (-0.32739901385847947d));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5430806348152446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5026209698040973d + "'", double1 == 0.5026209698040973d);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6312937620005052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double double1 = org.apache.commons.math.util.FastMath.log10(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.954242509439325d + "'", double1 == 1.954242509439325d);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.01706517535661036d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 11013L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041905639223649d + "'", double1 == 4.041905639223649d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.6237264565928684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.72514057803899d + "'", double1 == 18.72514057803899d);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4652950030131615d + "'", double1 == 1.4652950030131615d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23585732697719813d + "'", double1 == 0.23585732697719813d);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4919711769362983d + "'", double1 == 0.4919711769362983d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5953649790673516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.40768008353618d + "'", double1 == 91.40768008353618d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2155615773557597L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.21348529365373875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24014385818911937d) + "'", double1 == (-0.24014385818911937d));
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double double1 = org.apache.commons.math.util.FastMath.rint(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 295.0d + "'", double1 == 295.0d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double double1 = org.apache.commons.math.util.FastMath.rint(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0d + "'", double1 == 2048.0d);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5015887158341327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416907d + "'", double1 == 0.5514266812416907d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 36);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.7835271334741006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5564595639981197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995920864606948d + "'", double1 == 0.9995920864606948d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.340144407361754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586168716780134d + "'", double1 == 1.586168716780134d);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.006625453383639586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08139688804640867d + "'", double1 == 0.08139688804640867d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double double1 = org.apache.commons.math.util.FastMath.abs(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000003d + "'", double1 == 100.00000000000003d);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3533464791127894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.245261958970328d + "'", double1 == 20.245261958970328d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double double2 = org.apache.commons.math.util.FastMath.max(4.267909605184542d, 1.803279531369336d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.267909605184542d + "'", double2 == 4.267909605184542d);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4641588833612779d + "'", double1 == 0.4641588833612779d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515679276951895d + "'", double1 == 1.5515679276951895d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double double2 = org.apache.commons.math.util.FastMath.max(0.09950371902099892d, 0.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09950371902099892d + "'", double2 == 0.09950371902099892d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6982396029335985d, 2.2387944825564388d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6982396029335985d + "'", double2 == 0.6982396029335985d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.310651852518919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30120026204161976d + "'", double1 == 0.30120026204161976d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7185289533415847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7185289533415848d + "'", double1 == 0.7185289533415848d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7360711750351105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8272477843621638d + "'", double1 == 0.8272477843621638d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7185289533415848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6159972758633804d + "'", double1 == 0.6159972758633804d);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.872556723861298d, 0.3735403569930398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9503510221825101d + "'", double2 == 0.9503510221825101d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.965964575870387E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706087125665432d) + "'", double1 == (-0.01706087125665432d));
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6283428.879192634d + "'", double1 == 6283428.879192634d);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001248E-16d + "'", double1 == 8.881784197001248E-16d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double double1 = org.apache.commons.math.util.FastMath.acos(96.10655605346268d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7386198489108358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double double2 = org.apache.commons.math.util.FastMath.max(0.15315376700887107d, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.584967478670572d + "'", double2 == 4.584967478670572d);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1586013452313419L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557597L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8065735609271023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21496017549925742d) + "'", double1 == (-0.21496017549925742d));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9633078296451878d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6183715660152171d) + "'", double1 == (-0.6183715660152171d));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double double1 = org.apache.commons.math.util.FastMath.atanh(92560.48544260226d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6528291579754729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8674940695502573d + "'", double1 == 0.8674940695502573d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9165654068163128d, 0.33965297617976387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33965297617976387d + "'", double2 == 0.33965297617976387d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1559274280097633d, 1.7063851457511368d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1559274280097633d + "'", double2 == 1.1559274280097633d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4528691957923933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46998083208689106d + "'", double1 == 0.46998083208689106d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double double1 = org.apache.commons.math.util.FastMath.exp(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double double2 = org.apache.commons.math.util.FastMath.min(14.899277193215763d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.302190676759448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8171930763568982d + "'", double1 == 1.8171930763568982d);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5169642656554081d + "'", double1 == 0.5169642656554081d);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.421085471520201E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.421085471520201E-14d + "'", double1 == 1.421085471520201E-14d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11858991704089483d) + "'", double1 == (-0.11858991704089483d));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156715E14d + "'", double1 == 7.93006726156715E14d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.466615248004345d + "'", double1 == 41.466615248004345d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double double1 = org.apache.commons.math.util.FastMath.floor(14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 149);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.173186268412274d + "'", double1 == 2.173186268412274d);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double double1 = org.apache.commons.math.util.FastMath.abs(17.187624532325845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.187624532325845d + "'", double1 == 17.187624532325845d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double double2 = org.apache.commons.math.util.FastMath.min(0.477141806555308d, 1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.477141806555308d + "'", double2 == 0.477141806555308d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.03552297094428488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4847391043420942d + "'", double1 == 0.4847391043420942d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 1477896.0f, (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1477895.9999999998d + "'", double2 == 1477895.9999999998d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (-36.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9171523356672744d, 0.03353507713878987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9171523356672743d + "'", double2 == 0.9171523356672743d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3893722612835904d + "'", double1 == 0.3893722612835904d);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2129005211903137d + "'", double1 == 1.2129005211903137d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.2771399790034055d + "'", double1 == 6.2771399790034055d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.06343324090259d + "'", double1 == 6.06343324090259d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7247019508083927d + "'", double1 == 0.7247019508083927d);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3867553648319086d + "'", double1 == 2.3867553648319086d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        float float2 = org.apache.commons.math.util.FastMath.min((-36.0f), 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double double2 = org.apache.commons.math.util.FastMath.max(8.467717600000001E7d, 0.02411494803001423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.467717600000001E7d + "'", double2 == 8.467717600000001E7d);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.16703684659955795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18276587140654418d) + "'", double1 == (-0.18276587140654418d));
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(13.596393407513998d, 199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.596393407514d + "'", double2 == 13.596393407514d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.25128902086761173d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.23606797749979d, 34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06508640097638713d + "'", double2 == 0.06508640097638713d);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.004407855229809197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004398154893738475d) + "'", double1 == (-0.004398154893738475d));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5157707046119765d, 0.6283185307179586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5157707046119765d + "'", double2 == 0.5157707046119765d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9645836595696896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0079311580289634d + "'", double1 == 2.0079311580289634d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9975366607028199d + "'", double1 == 0.9975366607028199d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4067132730318201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0012941034727495246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0741466672417709d + "'", double1 == 0.0741466672417709d);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2438303468812233d + "'", double1 == 2.2438303468812233d);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3832555251977612d, 9.825659180793972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.235896763958813d + "'", double2 == 24.235896763958813d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5923232378589242d + "'", double1 == 0.5923232378589242d);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 11013L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double double2 = org.apache.commons.math.util.FastMath.pow(49.80857186097813d, 1.3694345116302007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 211.03126243924578d + "'", double2 == 211.03126243924578d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.19259360859684702d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7365898990208961d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.736589899020896d) + "'", double1 == (-0.736589899020896d));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        long long1 = org.apache.commons.math.util.FastMath.round(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.614586012538512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.21318466623103d + "'", double1 == 35.21318466623103d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.042749499570736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7586713254405011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6879577661240026d + "'", double1 == 0.6879577661240026d);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double double1 = org.apache.commons.math.util.FastMath.log((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double double2 = org.apache.commons.math.util.FastMath.min(9.999999999999998d, 1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2715542753135176d + "'", double2 == 1.2715542753135176d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9848929415691016d), 0.0066253564415875025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9848929415691015d) + "'", double2 == (-0.9848929415691015d));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.07483161956956147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07483161956956147d + "'", double1 == 0.07483161956956147d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7010302935299408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8440511458041081d + "'", double1 == 0.8440511458041081d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double double1 = org.apache.commons.math.util.FastMath.atan(105.44019367551631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5613125617868582d + "'", double1 == 1.5613125617868582d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2972814671821473d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        double double1 = org.apache.commons.math.util.FastMath.acos(53.90638748024775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21317875147664192d + "'", double1 == 0.21317875147664192d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        double double1 = org.apache.commons.math.util.FastMath.atanh(14.899276870949834d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 100, 0.08838879722590735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569912439052819d + "'", double2 == 1.569912439052819d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5860134523134338E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.69314718055995d + "'", double1 == 35.69314718055995d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9650846656626807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2793491738997593d + "'", double1 == 2.2793491738997593d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        long long1 = org.apache.commons.math.util.FastMath.round(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6839595246897313d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5552986459319043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9381691036867329d + "'", double1 == 0.9381691036867329d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.544753606236012E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.1137231068183593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.079110090920021d) + "'", double1 == (-4.079110090920021d));
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        double double1 = org.apache.commons.math.util.FastMath.asin(104.9439511105971d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1574270622069016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7763568394002505E-15d, 6.072857379539184d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.776356839400251E-15d + "'", double2 == 1.776356839400251E-15d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.546282921127314d + "'", double1 == 0.546282921127314d);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9483570980585009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.097044078157508d + "'", double1 == 1.097044078157508d);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8096100974766685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8096100974766685d + "'", double1 == 0.8096100974766685d);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        double double1 = org.apache.commons.math.util.FastMath.log1p(6.594078672416073E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.306852820956568d + "'", double1 == 20.306852820956568d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8065735609271023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.898094405353414d + "'", double1 == 0.898094405353414d);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        long long1 = org.apache.commons.math.util.FastMath.abs(1586013452313419L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1586013452313419L + "'", long1 == 1586013452313419L);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3235780930645504d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.4219132975121505d, (-0.16703684659955795d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6396562447182141d + "'", double2 == 1.6396562447182141d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075638110497826d + "'", double1 == 0.9075638110497826d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8029909809443063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.0962532307185966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 177.4022424239215d + "'", double1 == 177.4022424239215d);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(26.82951141006688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.179721171073485d + "'", double1 == 5.179721171073485d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.837131699124806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4329505766739904d + "'", double1 == 0.4329505766739904d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0866878023604363d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.109163004257367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.000000000002d, 0.43442052080657173d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43442052080657173d + "'", double2 == 0.43442052080657173d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8178843569317782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.35708453783909466d, 1.674774076371737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17823481522447054d + "'", double2 == 0.17823481522447054d);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.1662915285707838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33571690137979543d + "'", double1 == 0.33571690137979543d);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.044522437723423d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8607616271094027d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9562645537814451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4644670694724846d) + "'", double1 == (-2.4644670694724846d));
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.3327099519782247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-19.06287605035257d) + "'", double1 == (-19.06287605035257d));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2), 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04471068736246359d + "'", double1 == 0.04471068736246359d);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1918237706995551d + "'", double1 == 1.1918237706995551d);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.30909595621492d) + "'", double1 == (-100.30909595621492d));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5511122896377538d) + "'", double1 == (-0.5511122896377538d));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6085674966810348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        long long1 = org.apache.commons.math.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.30685281944005d + "'", double1 == 51.30685281944005d);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.18276587140654418d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18075770071274028d) + "'", double1 == (-0.18075770071274028d));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6879830786861454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2992240294445547d + "'", double1 == 1.2992240294445547d);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29650404217143717d + "'", double1 == 0.29650404217143717d);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7010302935299408d, 0.9996074585101945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7011280466651266d + "'", double2 == 0.7011280466651266d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9672221742711605d, 2.6701224592653805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6701224592653805d + "'", double2 == 2.6701224592653805d);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7852435337894877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7211038773899042d + "'", double1 == 0.7211038773899042d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0580220586617817d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        long long2 = org.apache.commons.math.util.FastMath.max((-36L), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.025196192240463114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02519885896150951d + "'", double1 == 0.02519885896150951d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.118870081899753d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0604117958350738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2706233294706026d + "'", double1 == 1.2706233294706026d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.10757413843619562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.1635441171500585d) + "'", double1 == (-6.1635441171500585d));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5514266812416907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7425810940508051d + "'", double1 == 0.7425810940508051d);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9980569874847491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5419362735933929d + "'", double1 == 0.5419362735933929d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.07483161956956147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07490147911901063d) + "'", double1 == (-0.07490147911901063d));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        double double2 = org.apache.commons.math.util.FastMath.pow(22.24855859029184d, 2.5321070224790865E26d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9515228542117641d), 0.8440511458041081d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9515228542117641d) + "'", double2 == (-0.9515228542117641d));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8332128969929774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.50632862831694E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70515.43768240389d + "'", double1 == 70515.43768240389d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7853981633974483d), 0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7853981633974483d) + "'", double2 == (-0.7853981633974483d));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        double double1 = org.apache.commons.math.util.FastMath.log(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6597815255174291d) + "'", double1 == (-0.6597815255174291d));
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        double double1 = org.apache.commons.math.util.FastMath.log1p(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.03490658503988659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000000000001d + "'", double1 == 52.00000000000001d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7813863964118539d, (-0.34555558058171215d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.98717325326644d + "'", double2 == 1.98717325326644d);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3268153559855746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1887890305557882d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.6691802474911265E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570793657614649d + "'", double1 == 1.570793657614649d);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6727467649882994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1870711025780865d + "'", double1 == 1.1870711025780865d);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.24757445151075d + "'", double1 == 16.24757445151075d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        double double1 = org.apache.commons.math.util.FastMath.floor(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        double double1 = org.apache.commons.math.util.FastMath.ulp(10.862286466674373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8508659131646942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-48.75102575588176d) + "'", double1 == (-48.75102575588176d));
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.0962532307185966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.045370515966924575d) + "'", double1 == (-0.045370515966924575d));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9912373278715739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.161724629793691d + "'", double1 == 1.161724629793691d);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7266953932355397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7572971775997339d + "'", double1 == 0.7572971775997339d);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3268153559855746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3158729493062495d + "'", double1 == 0.3158729493062495d);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7692389013639721d, (double) 53L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014512922521601742d + "'", double2 == 0.014512922521601742d);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-39.55982877225075d) + "'", double1 == (-39.55982877225075d));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8776491462349513d + "'", double1 == 0.8776491462349513d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4964448729282672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.2792211365930397d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        double double1 = org.apache.commons.math.util.FastMath.atanh(24.678686683130433d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7133729108990164d) + "'", double1 == (-0.7133729108990164d));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.33932123363772365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3529733609987885d + "'", double1 == 0.3529733609987885d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5564595639981197d), 0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3938507359907495d) + "'", double2 == (-1.3938507359907495d));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1558241215220355d + "'", double1 == 1.1558241215220355d);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1302020149984197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00848826368395d + "'", double1 == 1.00848826368395d);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.0106352940962555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7935304491330344d + "'", double1 == 1.7935304491330344d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 2147483647, 0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483647E9d + "'", double2 == 2.147483647E9d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-46.780218848748426d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.346791714598718d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34679171459871794d) + "'", double1 == (-0.34679171459871794d));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8735346502596505d + "'", double1 == 0.8735346502596505d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        double double2 = org.apache.commons.math.util.FastMath.min(20.13501082303189d, 0.9165654068163128d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9165654068163128d + "'", double2 == 0.9165654068163128d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5408212093041704d, 0.04471068736246359d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9728920355318299d + "'", double2 == 0.9728920355318299d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7212254887267799d, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7212254887267798d + "'", double2 == 0.7212254887267798d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7852435337894877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0589027237910782d + "'", double1 == 1.0589027237910782d);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4761519398724137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.073779252550484d + "'", double1 == 2.073779252550484d);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.340144407361754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7247019508083927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8982277679825335d + "'", double1 == 0.8982277679825335d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3694345116302007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1104877091793368d + "'", double1 == 1.1104877091793368d);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.306943613116557d, 0.921688867296064d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4720857957497826d + "'", double2 == 1.4720857957497826d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9171523356672744d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        double double1 = org.apache.commons.math.util.FastMath.log10(91.40768008353618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9609826867379376d + "'", double1 == 1.9609826867379376d);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.233403117511217d) + "'", double1 == (-1.233403117511217d));
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(35.69314718055995d, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.69314718055994d + "'", double2 == 35.69314718055994d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4046957684235926d + "'", double1 == 3.4046957684235926d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.0529697638030147E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.173186268412274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.518508514962757d + "'", double1 == 1.518508514962757d);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8408964152537146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.31844433442071d + "'", double1 == 1.31844433442071d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        double double1 = org.apache.commons.math.util.FastMath.log(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306852821501208d + "'", double1 == 9.306852821501208d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.346791714598718d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9173172759781081d + "'", double1 == 0.9173172759781081d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4210854715202004E-14d, 1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1626470961947334E-14d + "'", double2 == 1.1626470961947334E-14d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0057916796039132d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        int int1 = org.apache.commons.math.util.FastMath.round(1477896.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.31271990805652194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3030851991129396d + "'", double1 == 0.3030851991129396d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6528291579754729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5735714562646549d + "'", double1 == 0.5735714562646549d);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-2));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8508659131646942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0176312571014268d) + "'", double1 == (-1.0176312571014268d));
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6316845824854256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48961296732686727d + "'", double1 == 0.48961296732686727d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.002205218707991866d, (-0.011028760958182176d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.944243605747584d + "'", double2 == 2.944243605747584d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.147483647E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.727787050299033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6783632786807827d + "'", double1 == 1.6783632786807827d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9503510221825101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2543619974793934d + "'", double1 == 1.2543619974793934d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-77.26503394947865d) + "'", double1 == (-77.26503394947865d));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1626470961947334E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1626470961947334E-14d + "'", double1 == 1.1626470961947334E-14d);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2304174954646191E11d + "'", double1 == 1.2304174954646191E11d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7138320036389565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012458718769607935d + "'", double1 == 0.012458718769607935d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8580016718173996d + "'", double1 == 0.8580016718173996d);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.1137231068183593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3098650979711013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9877651168459853d + "'", double1 == 1.9877651168459853d);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 2.15561577E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        int int1 = org.apache.commons.math.util.FastMath.abs(1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3132616875182228d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        long long1 = org.apache.commons.math.util.FastMath.round(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 115L + "'", long1 == 115L);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20006653970519866d + "'", double1 == 0.20006653970519866d);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.03422749178784308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9663516425671944d + "'", double1 == 0.9663516425671944d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.007582141074206305d, (-0.9182827862121189d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 88.50150121198526d + "'", double2 == 88.50150121198526d);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5818264294871955d, 0.9986081305645496d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0076789965809125d + "'", double2 == 1.0076789965809125d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7017203400855395d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4957317426056835d + "'", double1 == 0.4957317426056835d);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0001353885748059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.8794530986865425E-5d + "'", double1 == 5.8794530986865425E-5d);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8492499565656627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7706658400087724d + "'", double1 == 0.7706658400087724d);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7581226324091722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5642465536043678d + "'", double1 == 0.5642465536043678d);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02519885896150951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025201526529530238d + "'", double1 == 0.025201526529530238d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4671086505232536d) + "'", double1 == (-0.4671086505232536d));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.22459997143478d, 10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12125448166360303d + "'", double2 == 0.12125448166360303d);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707651109236087d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7613732471081224d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.432854651161728d) + "'", double1 == (-1.432854651161728d));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4628824377340256d, 0.02519885896150951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4628824377340256d + "'", double2 == 0.4628824377340256d);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8148723167088862d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4426958486157781d + "'", double1 == 0.4426958486157781d);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8587033066171034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7569959146612817d + "'", double1 == 0.7569959146612817d);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6982396029335985d, (-0.18075770071274028d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8241115710409757d + "'", double2 == 1.8241115710409757d);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.33965297617976387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        double double1 = org.apache.commons.math.util.FastMath.atanh(6.072857379539184d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 2155615773557597L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.366006587752973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1960821131474104d + "'", double1 == 1.1960821131474104d);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7098212011473782d, (-0.5520864868395452d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5520864868395452d) + "'", double2 == (-0.5520864868395452d));
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        long long1 = org.apache.commons.math.util.FastMath.round(0.09969305692768458d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6105647004975028d, 2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6105647004975027d + "'", double2 == 0.6105647004975027d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.16644796274347667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1664479627434767d + "'", double1 == 0.1664479627434767d);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1277423141222618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.442704017851834d + "'", double1 == 1.442704017851834d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.383255525197761d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2669359115016086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27346213804538994d + "'", double1 == 0.27346213804538994d);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.9277663657849295d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8803786840634489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6314731842513477d + "'", double1 == 0.6314731842513477d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.546282921127314d, 1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36056635633382056d + "'", double2 == 0.36056635633382056d);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7510746283820815d + "'", double1 == 0.7510746283820815d);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        double double2 = org.apache.commons.math.util.FastMath.min(3.1720269046268675E15d, 1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8189894035458565E-12d + "'", double2 == 1.8189894035458565E-12d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 8.4677176E7f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-1L), 0.6263395248148259d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0112343375115525d) + "'", double2 == (-1.0112343375115525d));
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9158328057966899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01598429785893005d + "'", double1 == 0.01598429785893005d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9616411655135638d + "'", double1 == 0.9616411655135638d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9672221742711605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.417748437204494d + "'", double1 == 55.417748437204494d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        double double1 = org.apache.commons.math.util.FastMath.cosh(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344058570908106E43d + "'", double1 == 1.344058570908106E43d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.0106352940962555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6998927931783815d + "'", double1 == 0.6998927931783815d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.7703727489272E13d + "'", double1 == 7.7703727489272E13d);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09240868099498095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.724275869600789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7150780923637137d + "'", double1 == 2.7150780923637137d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.6475439282580142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9285198206877272d + "'", double1 == 0.9285198206877272d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7219067166708869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4311581967195641d) + "'", double1 == (-0.4311581967195641d));
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.467141881863116d + "'", double1 == 1.467141881863116d);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2791426222204005d, 3.6237264565928684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2791426222204005d + "'", double2 == 1.2791426222204005d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        double double1 = org.apache.commons.math.util.FastMath.acosh(16.786775498263975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.512850234199533d + "'", double1 == 3.512850234199533d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1046225788468809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4967005954324935d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9021393831114582d) + "'", double1 == (-0.9021393831114582d));
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        double double2 = org.apache.commons.math.util.FastMath.max(6.766375983152367E-7d, 49.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.0d + "'", double2 == 49.0d);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double double2 = org.apache.commons.math.util.FastMath.max(2.5321070224790865E26d, 3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5321070224790865E26d + "'", double2 == 2.5321070224790865E26d);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9650846656626807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8765627394638167d + "'", double1 == 2.8765627394638167d);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.01706087125665432d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25743468985150686d) + "'", double1 == (-0.25743468985150686d));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1215.6874598349693d + "'", double1 == 1215.6874598349693d);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8404766374262675d), 1.3732849892136236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8404766374262674d) + "'", double2 == (-0.8404766374262674d));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        double double1 = org.apache.commons.math.util.FastMath.tanh(24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4779900867225375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.384125108329897d + "'", double1 == 4.384125108329897d);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6554718113440092d + "'", double1 == 2.6554718113440092d);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8503325208986047d) + "'", double1 == (-0.8503325208986047d));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8650983882673103d + "'", double1 == 0.8650983882673103d);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.302190676759448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2767458950387724d + "'", double1 == 1.2767458950387724d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        double double1 = org.apache.commons.math.util.FastMath.asin((-39.55982877225075d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2123899885214408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2123899885214408d + "'", double1 == 0.2123899885214408d);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.449550274765371d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3480172585170018d) + "'", double1 == (-1.3480172585170018d));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16162584696387075d + "'", double1 == 0.16162584696387075d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7542679379177583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9999999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6930307115608683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.037275197285801d + "'", double1 == 1.037275197285801d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24939471654360185d + "'", double1 == 0.24939471654360185d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.768115672379123E13d, 1.0206698826055747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7681156723791227E13d + "'", double2 == 2.7681156723791227E13d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5116765896885653d + "'", double1 == 1.5116765896885653d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.037396450599555d + "'", double1 == 1.037396450599555d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        double double1 = org.apache.commons.math.util.FastMath.log1p(16.24757445151075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.847671522084021d + "'", double1 == 2.847671522084021d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5321070224790865E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5912595710565535E13d + "'", double1 == 1.5912595710565535E13d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8686709614860095d), 0.97089000816281d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8686709614860094d) + "'", double2 == (-0.8686709614860094d));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0589027237910784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.057233205734539196d + "'", double1 == 0.057233205734539196d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5226189557364096d + "'", double1 == 0.5226189557364096d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0363623432113664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8943859157098326d, 1.4967005954324935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8461500143568639d + "'", double2 == 0.8461500143568639d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.2517998136852422E15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999991877127801d) + "'", double1 == (-0.9999991877127801d));
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080833035834908d + "'", double1 == 0.6080833035834908d);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6930491557595924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.030522580755008157d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9699385298756114d + "'", double1 == 0.9699385298756114d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4738147204144684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4424808105122886d + "'", double1 == 0.4424808105122886d);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5013507798060323d, (-0.4909189283808535d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5013507798060322d + "'", double2 == 0.5013507798060322d);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.34990093648368725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33628768678162146d + "'", double1 == 0.33628768678162146d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.9323667197459253d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.1255150095460777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5267041877018416d) + "'", double1 == (-0.5267041877018416d));
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7629292891930135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6427991330798924d + "'", double1 == 0.6427991330798924d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9127276113196982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.632512904931238d), 0.8623188722876837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.632512904931237d) + "'", double2 == (-4.632512904931237d));
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.344058570908106E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.30685281944008d + "'", double1 == 99.30685281944008d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.644483341943245d, 1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.179794913231601d + "'", double2 == 1.179794913231601d);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9589242746631385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9589242746631385d + "'", double1 == 0.9589242746631385d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5600707647582166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999424817108994d + "'", double1 == 0.9999424817108994d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0206698826055747d, 0.8336269685240393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0206698826055747d + "'", double2 == 1.0206698826055747d);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 36.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4214027519155643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8843470217885709d + "'", double1 == 0.8843470217885709d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2743356563668091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3156563365585749d + "'", double1 == 0.3156563365585749d);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.24928153889173274d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2492815388917327d) + "'", double1 == (-0.2492815388917327d));
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2138239491732021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0247930161489514d + "'", double1 == 1.0247930161489514d);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 191.82954647182038d + "'", double1 == 191.82954647182038d);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4967005954324935d + "'", double1 == 0.4967005954324935d);
    }
}

