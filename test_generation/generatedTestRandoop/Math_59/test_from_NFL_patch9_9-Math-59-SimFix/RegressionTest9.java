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
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5716776679087392d + "'", double1 == 0.5716776679087392d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double2 = org.apache.commons.math.util.FastMath.min(0.023974957339495964d, 0.16033135365260598d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023974957339495964d + "'", double2 == 0.023974957339495964d);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.39415474995637106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1656483629774919d + "'", double1 == 1.1656483629774919d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027446137712611524d + "'", double1 == 0.027446137712611524d);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-265.42343799244867d) + "'", double1 == (-265.42343799244867d));
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8958717222609799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9335082459300553d), 0.7413633920040708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7413633920040708d + "'", double2 == 0.7413633920040708d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0948417664383636d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math.util.FastMath.log(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9544163159728498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2676980971301346d + "'", double1 == 1.2676980971301346d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1876059358425726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.82983489855724d + "'", double1 == 0.82983489855724d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.049787068367863944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051047271336216435d + "'", double1 == 0.051047271336216435d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.33784800591283637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.210078523883574E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.210078523881729E-7d + "'", double1 == 8.210078523881729E-7d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0893507405929967d, 1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.089350740592997d + "'", double2 == 1.089350740592997d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9200340278708842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0361961097813307d) + "'", double1 == (-0.0361961097813307d));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.03492076949174774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03492076949174774d + "'", double1 == 0.03492076949174774d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.24398053114331036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 813.9512929393157d + "'", double1 == 813.9512929393157d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4416248142133119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4742474936366583d + "'", double1 == 0.4742474936366583d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.253522697326158d + "'", double1 == 4.253522697326158d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.425305228849993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14497835658369837d + "'", double1 == 0.14497835658369837d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8029179645860509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014013562105437818d + "'", double1 == 0.014013562105437818d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.6540468455730294E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.9797298543946944d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9633078296451877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.305191888512945d) + "'", double1 == (-3.305191888512945d));
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.121789138159636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01980610467877187d) + "'", double1 == (-0.01980610467877187d));
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6321205588285577d + "'", double1 == 0.6321205588285577d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.01037448200916367d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-4.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.632512904931238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.728555684476762d + "'", double1 == 1.728555684476762d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double1 = org.apache.commons.math.util.FastMath.cosh(218.82393831231084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.40752980333197E94d + "'", double1 == 5.40752980333197E94d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.564939354012384d, 0.5436613490374845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8045893767924371d + "'", double2 == 0.8045893767924371d);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double1 = org.apache.commons.math.util.FastMath.tanh(14.476482730108394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999994668d + "'", double1 == 0.9999999999994668d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.49824130708557135d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double1 = org.apache.commons.math.util.FastMath.log(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.584730797999763d + "'", double1 == 3.584730797999763d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.53567232102789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03511678415619611d + "'", double1 == 0.03511678415619611d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8627965031787168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.951998196031877d) + "'", double1 == (-0.951998196031877d));
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.40310869196405E-6d + "'", double1 == 2.40310869196405E-6d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5552712721030326d, 7.280109889280518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.909777598820128d + "'", double2 == 24.909777598820128d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7648174594177056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0077202802708558d + "'", double1 == 1.0077202802708558d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0133874022879147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double1 = org.apache.commons.math.util.FastMath.asin((-53.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9918956474731391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9562328011312552d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1087690812447109d) + "'", double1 == (-1.1087690812447109d));
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5160777855982221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0038586335035662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3130883967082236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.2015841995251386E-10d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5507.499954607353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double1 = org.apache.commons.math.util.FastMath.exp(11.591953275521519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 108223.44191876269d + "'", double1 == 108223.44191876269d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double2 = org.apache.commons.math.util.FastMath.max(49.808571860978134d, 0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.808571860978134d + "'", double2 == 49.808571860978134d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.38879069538562044d, 0.016454379408150685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.528499620429362d + "'", double2 == 1.528499620429362d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.3706102964440734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5396786341454742d + "'", double1 == 1.5396786341454742d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int int1 = org.apache.commons.math.util.FastMath.round(72.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.488782676588032E52d + "'", double1 == 4.488782676588032E52d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9600876852440052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        int int1 = org.apache.commons.math.util.FastMath.round(1833.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1833 + "'", int1 == 1833);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math.util.FastMath.asin((-9.289321970063883E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.28932198342371E-5d) + "'", double1 == (-9.28932198342371E-5d));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math.util.FastMath.log(227.54506429048948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.427348303568163d + "'", double1 == 5.427348303568163d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double1 = org.apache.commons.math.util.FastMath.log(1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0021583559643982317d + "'", double1 == 0.0021583559643982317d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43107595064559234d + "'", double1 == 0.43107595064559234d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0277272261966697E-6d + "'", double1 == 3.0277272261966697E-6d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.24434609527920614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int int1 = org.apache.commons.math.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3357169013797953d + "'", double1 == 0.3357169013797953d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double1 = org.apache.commons.math.util.FastMath.ulp(64.40683631162594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.051047271336216435d, 0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06523639976822383d + "'", double2 == 0.06523639976822383d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.6540468455730294E-27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.1746481373430634E-43d + "'", double1 == 7.1746481373430634E-43d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5607966601082317d, 0.9696515784005106d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082317d + "'", double2 == 1.5607966601082317d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9171379122748513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.051228788528155d + "'", double1 == 1.051228788528155d);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3308556102312834d, 11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3308556102312836d + "'", double2 == 1.3308556102312836d);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7184726744159351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6582356512126448d + "'", double1 == 0.6582356512126448d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double1 = org.apache.commons.math.util.FastMath.log1p(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.30685281944005d + "'", double1 == 96.30685281944005d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.164473663317525E39d + "'", double1 == 2.164473663317525E39d);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.455841039450451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8120133682438273d + "'", double1 == 3.8120133682438273d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8871621889968087d + "'", double1 == 0.8871621889968087d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.060987412311592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0609874123115923d + "'", double1 == 1.0609874123115923d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        long long2 = org.apache.commons.math.util.FastMath.min((-3L), 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.4413226701961004d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025155826178558296d) + "'", double1 == (-0.025155826178558296d));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 1833, (-0.9210509322442526d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1833.0d + "'", double2 == 1833.0d);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6250984987600411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7216342229204444d + "'", double1 == 0.7216342229204444d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double double1 = org.apache.commons.math.util.FastMath.floor(43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.0d + "'", double1 == 43.0d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.810477380965351d, 10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7379721.674479278d + "'", double2 == 7379721.674479278d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.03374953896461893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.61926014637646d + "'", double1 == 0.61926014637646d);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.0476958419065934d), 1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0476958419065934d) + "'", double2 == (-1.0476958419065934d));
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double2 = org.apache.commons.math.util.FastMath.max(533.252579626545d, 3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 533.252579626545d + "'", double2 == 533.252579626545d);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.41653661616751786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41653661616751786d + "'", double1 == 0.41653661616751786d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.020019819738813043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020018482464401233d + "'", double1 == 0.020018482464401233d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 72L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 72.0f + "'", float1 == 72.0f);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0016855752345481393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016855736382181338d + "'", double1 == 0.0016855736382181338d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.869205555527689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.62301213247846d + "'", double1 == 16.62301213247846d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double2 = org.apache.commons.math.util.FastMath.max(2.8421709430404007E-14d, 0.6719977351570301d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6719977351570301d + "'", double2 == 0.6719977351570301d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.010320668518630319d), 0.7071067811865475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010320668518630317d) + "'", double2 == (-0.010320668518630317d));
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8412503381137896d, (-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8412503381137895d + "'", double2 == 0.8412503381137895d);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.3398626545797663E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3500296991663472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13034332260033038d + "'", double1 == 0.13034332260033038d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999999999999701d, (-1.267013246259975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000377d + "'", double2 == 1.0000000000000377d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double1 = org.apache.commons.math.util.FastMath.log10((-39.206747378977376d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(28.476411608537195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0537144249814574d + "'", double1 == 3.0537144249814574d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2680279460309557d, 9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2680279460309557d + "'", double2 == 0.2680279460309557d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.011900427241491611d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011900146353395336d) + "'", double1 == (-0.011900146353395336d));
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 442412.3920089205d + "'", double1 == 442412.3920089205d);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(28.458847850898053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4967005963222833d + "'", double1 == 0.4967005963222833d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double double1 = org.apache.commons.math.util.FastMath.floor(206.89035656270292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 206.0d + "'", double1 == 206.0d);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8746486203042797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.398032525970685d + "'", double1 == 2.398032525970685d);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double2 = org.apache.commons.math.util.FastMath.min(0.30559714930590764d, 0.025080161104123633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025080161104123633d + "'", double2 == 0.025080161104123633d);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.03490658503988659d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.111512116496156d, (-0.9355072424226104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15958182281264355d + "'", double2 == 0.15958182281264355d);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        float float1 = org.apache.commons.math.util.FastMath.abs(72.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 72.0f + "'", float1 == 72.0f);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0146903407800787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7585090673415833d + "'", double1 == 1.7585090673415833d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.3394482820132315d), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double1 = org.apache.commons.math.util.FastMath.atanh(28.458847799916846d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double2 = org.apache.commons.math.util.FastMath.max(0.26411443765382414d, 0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8261522787674126d + "'", double2 == 0.8261522787674126d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.025630151592603893d), 2.7681156723791426E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.259060901373123E-16d) + "'", double2 == (-9.259060901373123E-16d));
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.694732228393676d + "'", double1 == 6.694732228393676d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1527522897170941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1515752048564124d + "'", double1 == 0.1515752048564124d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(70187.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 264.9282921848854d + "'", double1 == 264.9282921848854d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.516258181075712E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.5162581810757125E96d + "'", double1 == 7.5162581810757125E96d);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5409928174322843d + "'", double1 == 0.5409928174322843d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8554182836643192d), (-0.41653661616751786d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.023940734093681d) + "'", double2 == (-2.023940734093681d));
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double2 = org.apache.commons.math.util.FastMath.max(0.01976389133388643d, 0.16033135365260598d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16033135365260598d + "'", double2 == 0.16033135365260598d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7508100196049882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.004793305720016481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16860807748755743d + "'", double1 == 0.16860807748755743d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7134535544390084d + "'", double1 == 0.7134535544390084d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5790336546285149d + "'", double1 == 0.5790336546285149d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.043734674009951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7147788566799335d + "'", double1 == 0.7147788566799335d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4497667602778919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1612981381853015d + "'", double1 == 0.1612981381853015d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6971815150945762d, 0.21551488653168735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4444883410681757d + "'", double2 == 1.4444883410681757d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.3485292390836008d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(227.54506429048948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.105048801286173d + "'", double1 == 6.105048801286173d);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4689057088038128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7768941300252812d + "'", double1 == 0.7768941300252812d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.418840607796598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.191588758865744d + "'", double1 == 2.191588758865744d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707963267948954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4515827052894541d + "'", double1 == 0.4515827052894541d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.807544493573296d + "'", double1 == 32.807544493573296d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.014821210656408876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.1103453443603275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-120.9138815469291d) + "'", double1 == (-120.9138815469291d));
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double1 = org.apache.commons.math.util.FastMath.asin(28.45884779991685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.01037448200916367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double1 = org.apache.commons.math.util.FastMath.asin(41.67132555791601d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9930737478319205d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.022920740387489907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997373313299885d + "'", double1 == 0.9997373313299885d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.07463853704904692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0013026882203776412d + "'", double1 == 0.0013026882203776412d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 1833.0f, (-0.999615353518653d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.999615353518653d) + "'", double2 == (-0.999615353518653d));
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5574077246549018d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5898595141626499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8037349983759179d + "'", double1 == 1.8037349983759179d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double2 = org.apache.commons.math.util.FastMath.min(22.248715407688383d, 0.5702159837110962d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5702159837110962d + "'", double2 == 0.5702159837110962d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9938640517322503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4599610117337625d + "'", double1 == 1.4599610117337625d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2763281510370124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5834576238765345d + "'", double1 == 2.5834576238765345d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.691076096637946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5222467817471549d) + "'", double1 == (-0.5222467817471549d));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4944324908505626d + "'", double1 == 0.4944324908505626d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19484471582527388d) + "'", double1 == (-0.19484471582527388d));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5995504841726446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5367296243148151d + "'", double1 == 0.5367296243148151d);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8351015231807235d + "'", double1 == 1.8351015231807235d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.71056440958446d, (-0.5701199791021948d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.246967376963645d + "'", double2 == 2.246967376963645d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.41653661616751786d, 91.10170611520638d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004572183457134842d + "'", double2 == 0.004572183457134842d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5929264334035065d + "'", double1 == 1.5929264334035065d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.34657359027997275d), 0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3465735902799727d) + "'", double2 == (-0.3465735902799727d));
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9705211365109137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9705211365109138d + "'", double1 == 0.9705211365109138d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.1987501543833528d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20140916094505582d) + "'", double1 == (-0.20140916094505582d));
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 72, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.010374668122887303d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double2 = org.apache.commons.math.util.FastMath.pow(27.722354182756217d, 0.02012343619844111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0691402988655025d + "'", double2 == 1.0691402988655025d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8246078684416017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6788449528131406d + "'", double1 == 0.6788449528131406d);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7162633894119443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9374115152313492d + "'", double1 == 0.9374115152313492d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0473087914622721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.051059134745216d) + "'", double1 == (-3.051059134745216d));
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9103910184992512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09388108110331789d) + "'", double1 == (-0.09388108110331789d));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5479174221765761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000061571306742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3308556102312836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.25240960756025d + "'", double1 == 76.25240960756025d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), 72.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2245999714347802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08799424496928993d + "'", double1 == 0.08799424496928993d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1527522897170941d, 0.0013026882203776412d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0013026882203776412d + "'", double2 == 0.0013026882203776412d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6345784979980641d + "'", double1 == 0.6345784979980641d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-100.01791180959569d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.298521458713987d) + "'", double1 == (-5.298521458713987d));
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.19140858390139603d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4772282118533498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44402103419177824d) + "'", double1 == (-0.44402103419177824d));
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2763281510370124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8225636847100722d + "'", double1 == 0.8225636847100722d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(231.5846604790946d, 0.8146443499937901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 231.58466047909457d + "'", double2 == 231.58466047909457d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6789474239703004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7323253214474795d + "'", double1 == 0.7323253214474795d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 14L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double1 = org.apache.commons.math.util.FastMath.atanh(10.049875621120885d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5552712721030326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998794887589783d + "'", double1 == 0.9998794887589783d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1410583570401092d, (-0.9686168251319445d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2746373725611457d + "'", double2 == 2.2746373725611457d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 1833L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1833L + "'", long2 == 1833L);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6042872728524414d) + "'", double1 == (-0.6042872728524414d));
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5705870643612196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.677261497848975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.859927432626148d) + "'", double1 == (-0.859927432626148d));
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.45642327729008136d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4564232772900813d) + "'", double2 == (-0.4564232772900813d));
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double2 = org.apache.commons.math.util.FastMath.max(0.27631948176648663d, 2.426490964964291d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.426490964964291d + "'", double2 == 2.426490964964291d);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6199936158896424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7138993688283736d) + "'", double1 == (-0.7138993688283736d));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double1 = org.apache.commons.math.util.FastMath.exp(4477855.166669105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1647182772090332d, 1.5133236589758516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1647182772090332d + "'", double2 == 1.1647182772090332d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (short) 10, 9.998983441196998E-26d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.4376760684376033d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6370255026277432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6370255026277434d + "'", double1 == 1.6370255026277434d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(23.140692632779267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4038812776339933d + "'", double1 == 0.4038812776339933d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089401E-8d + "'", double1 == 4.214684851089401E-8d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9434257847789064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.872201959037427d) + "'", double1 == (-2.872201959037427d));
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3072602306204817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.90049393985227d + "'", double1 == 74.90049393985227d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.262451664828748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7346568543593086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.550809615370825d + "'", double1 == 0.550809615370825d);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9698479895022746d + "'", double1 == 0.9698479895022746d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9696515784005106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4581113771324175d + "'", double1 == 1.4581113771324175d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8660262953611549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1229215998502982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01959867915914997d + "'", double1 == 0.01959867915914997d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3396374043288992d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.3297526675165189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7191015686156517d + "'", double1 == 0.7191015686156517d);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double2 = org.apache.commons.math.util.FastMath.min(3.121587127777053E-5d, 10.1796701242299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121587127777053E-5d + "'", double2 == 3.121587127777053E-5d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double2 = org.apache.commons.math.util.FastMath.max(2.0222383329741738d, 0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0222383329741738d + "'", double2 == 2.0222383329741738d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.398032525970685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9422278221222946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9706842030868199d + "'", double1 == 0.9706842030868199d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double2 = org.apache.commons.math.util.FastMath.max(0.06488501547250208d, 198.57204013738644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.57204013738644d + "'", double2 == 198.57204013738644d);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1076852414311276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3398626545797663E25d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double2 = org.apache.commons.math.util.FastMath.min(74.90049393985227d, 3.121587127777053E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121587127777053E-5d + "'", double2 == 3.121587127777053E-5d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3441486949905643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3513319442338458d + "'", double1 == 0.3513319442338458d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(174.92896910346727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 174.9289691034673d + "'", double1 == 174.9289691034673d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.189933027900477d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double1 = org.apache.commons.math.util.FastMath.expm1(68.40322401739334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0949829516048426E29d + "'", double1 == 5.0949829516048426E29d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.41653661616751786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.865790119059504d + "'", double1 == 23.865790119059504d);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.6237264565928684d, 1.167906788198742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.623726456592868d + "'", double2 == 3.623726456592868d);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        float float1 = org.apache.commons.math.util.FastMath.abs(1833.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1833.0f + "'", float1 == 1833.0f);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5826970349443759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.582697034944376d + "'", double1 == 1.582697034944376d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.2640633033557785d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8380289519085355d + "'", double1 == 1.8380289519085355d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double2 = org.apache.commons.math.util.FastMath.max(5.3052495822221415d, 7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.2638973976934564E18d + "'", double2 == 7.2638973976934564E18d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double1 = org.apache.commons.math.util.FastMath.acos((-16.7137425111567d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1833);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1833L + "'", long1 == 1833L);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6509498349092765d, 0.0021583559643982317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9990737979836914d + "'", double2 == 0.9990737979836914d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(533.252579626545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.09226233236027d + "'", double1 == 23.09226233236027d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.228279826110952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.29227537470679d + "'", double1 == 34.29227537470679d);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3860292320770566d + "'", double1 == 0.3860292320770566d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1555516045788385d + "'", double1 == 1.1555516045788385d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.03492076949174774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03492787080375338d) + "'", double1 == (-0.03492787080375338d));
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7418898236506195d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.668250757176408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6196139432498801d + "'", double1 == 0.6196139432498801d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1240849833762582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double1 = org.apache.commons.math.util.FastMath.atanh(61.48941136975552d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5222467817471549d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.035362234366688d + "'", double1 == 2.035362234366688d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(12.839059264996925d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.839059264996923d + "'", double2 == 12.839059264996923d);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.038206829516291d + "'", double1 == 15.038206829516291d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double2 = org.apache.commons.math.util.FastMath.min(0.17542037193601015d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17542037193601015d + "'", double2 == 0.17542037193601015d);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0115104269844304d + "'", double1 == 2.0115104269844304d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double2 = org.apache.commons.math.util.FastMath.min(5.40752980333197E94d, 1.8222596433035483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8222596433035483d + "'", double2 == 1.8222596433035483d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5949858734594968E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5949858735271235E-5d + "'", double1 == 1.5949858735271235E-5d);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.010374668122887301d), (-77.26503394947865d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-77.26503394947865d) + "'", double2 == (-77.26503394947865d));
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5701199791021948d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double1 = org.apache.commons.math.util.FastMath.atan(29.61987058113476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5370480253245054d + "'", double1 == 1.5370480253245054d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.10841464634038782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4768289910255038d + "'", double1 == 0.4768289910255038d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        float float1 = org.apache.commons.math.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12092714017201109d + "'", double1 == 0.12092714017201109d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.023940734093681d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8837010712667019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7730917365506929d + "'", double1 == 0.7730917365506929d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 72);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.00000000000001d + "'", double1 == 72.00000000000001d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5851102438039822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5359549985579515d) + "'", double1 == (-0.5359549985579515d));
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5729255106521538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-469.66281725733313d) + "'", double1 == (-469.66281725733313d));
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1656483629774919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.165648362977492d + "'", double1 == 1.165648362977492d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math.util.FastMath.log(4.810040610124878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570705526935434d + "'", double1 == 1.570705526935434d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2.30756025842063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8412503381137895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7645563169587528d + "'", double1 == 0.7645563169587528d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1833L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5063656411097343d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double1 = org.apache.commons.math.util.FastMath.log(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.565457534809151d + "'", double1 == 4.565457534809151d);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.0d, 5.40752980333197E94d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.000000000000001d + "'", double2 == 7.000000000000001d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.020019819738813043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02002249477008881d + "'", double1 == 0.02002249477008881d);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7010979104724594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535657774206833d + "'", double1 == 0.6535657774206833d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7189991032004813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0523779637351338d + "'", double1 == 1.0523779637351338d);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.506328628316939E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4923478352873684d) + "'", double1 == (-0.4923478352873684d));
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6370255026277432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9978076496695681d + "'", double1 == 0.9978076496695681d);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.958263399558255d + "'", double1 == 11.958263399558255d);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.0476958419065936d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.9349327016694437E-28d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8660262953611549d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.276858964458209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.013886210738235d + "'", double1 == 36.013886210738235d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7456241416655579d + "'", double1 == 0.7456241416655579d);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, 1833.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3074614241103386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022819506693539382d + "'", double1 == 0.022819506693539382d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.3305834282671767d, 1.594973153695066E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000191900636288d + "'", double2 == 1.0000191900636288d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.626860407847018d) + "'", double1 == (-3.626860407847018d));
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2543511479919077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 57L, 0.21839450088746076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.418095298905577d + "'", double2 == 2.418095298905577d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.663528081877013d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.449973455871277d) + "'", double1 == (-20.449973455871277d));
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0361094321962743d, 0.004793305720016481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.566170105494617d + "'", double2 == 1.566170105494617d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.589240193085527d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.043734674009951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9119630497674487d + "'", double1 == 0.9119630497674487d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01282218098091439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999177969636942d + "'", double1 == 0.9999177969636942d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.025155826178558296d), 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.025155826178558296d) + "'", double2 == (-0.025155826178558296d));
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1909687900195496d + "'", double1 == 1.1909687900195496d);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 57);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.4134332111535645d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double1 = org.apache.commons.math.util.FastMath.tan(128.05875780734718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251561992529562d) + "'", double1 == (-0.9251561992529562d));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6156264703860141d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5480755859418556d) + "'", double1 == (-0.5480755859418556d));
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double1 = org.apache.commons.math.util.FastMath.sin(42.042831059009366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9328075542772654d) + "'", double1 == (-0.9328075542772654d));
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.01580851019182626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2509749142499485d + "'", double1 == 0.2509749142499485d);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7162633894119446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0432235505597705d + "'", double1 == 1.0432235505597705d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9992015815530141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01743935748923473d + "'", double1 == 0.01743935748923473d);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.5834576238765345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0450898416223948d + "'", double1 == 0.0450898416223948d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3314525951486865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32005693607304564d + "'", double1 == 0.32005693607304564d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-36L), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-36.0d) + "'", double2 == (-36.0d));
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2558786252840988d + "'", double1 == 1.2558786252840988d);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0416396550849298d + "'", double1 == 1.0416396550849298d);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5142773362439195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2026568540739422d) + "'", double1 == (-1.2026568540739422d));
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9063773800902429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.13462871407679d) + "'", double1 == (-1.13462871407679d));
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.174526712441788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4123217725605077d + "'", double1 == 1.4123217725605077d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9852791038997014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3989990275141384d + "'", double1 == 1.3989990275141384d);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7138993688283736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6131162037426348d) + "'", double1 == (-0.6131162037426348d));
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.267013246259975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.509011168189731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.186695467346167d + "'", double1 == 2.186695467346167d);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.25694496900608355d, 2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.558548063589361E-45d + "'", double2 == 9.558548063589361E-45d);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8032795313693358d + "'", double1 == 0.8032795313693358d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.2213312276126236d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7189991032004813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8752986176944212d + "'", double1 == 0.8752986176944212d);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8746486203042797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13393305007318584d) + "'", double1 == (-0.13393305007318584d));
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(108223.44191876269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6200746.466324298d + "'", double1 == 6200746.466324298d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.17107384637538d + "'", double1 == 40.17107384637538d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.11097837805695132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.993848217574073d + "'", double1 == 0.993848217574073d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1349753073117674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7162633894119443d + "'", double1 == 1.7162633894119443d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double1 = org.apache.commons.math.util.FastMath.acos(35.000000000000014d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.030467198227893608d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030457774666224156d) + "'", double1 == (-0.030457774666224156d));
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.15335264995992576d, 0.21092668861480754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6733495267909052d + "'", double2 == 0.6733495267909052d);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double1 = org.apache.commons.math.util.FastMath.log1p(41.67132555791601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.753527162054068d + "'", double1 == 3.753527162054068d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.046638250970772E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0466382038392566E-4d) + "'", double1 == (-3.0466382038392566E-4d));
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double1 = org.apache.commons.math.util.FastMath.tanh(14.476482730108396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999994668d + "'", double1 == 0.9999999999994668d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(83.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.362070671454838d + "'", double1 == 4.362070671454838d);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706848956764434d) + "'", double1 == (-0.01706848956764434d));
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5065900109542124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0395711984465767d + "'", double1 == 1.0395711984465767d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.548739357257741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7162579075638863d, 1.334840017296235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.334840017296235d + "'", double2 == 1.334840017296235d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.48627885708638907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5311751345663922d + "'", double1 == 0.5311751345663922d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.1616365426019666d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.445650060521281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.445650060521281d + "'", double1 == 2.445650060521281d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double2 = org.apache.commons.math.util.FastMath.max(2.398032525970685d, 0.6288880976732939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.398032525970685d + "'", double2 == 2.398032525970685d);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2389254154223536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23670870951017994d + "'", double1 == 0.23670870951017994d);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-36.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double1 = org.apache.commons.math.util.FastMath.asin(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9918956474731392d, (-0.030555897991319556d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.00024867560232d + "'", double2 == 1.00024867560232d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4280746061686456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1290.159154892091d + "'", double1 == 1290.159154892091d);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double1 = org.apache.commons.math.util.FastMath.exp(14.476482730108396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1936674.200214743d + "'", double1 == 1936674.200214743d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2147483647, (-0.5845913205073007d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963270671181d + "'", double2 == 1.5707963270671181d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.21842712107840842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21504954471869261d + "'", double1 == 0.21504954471869261d);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.762195691083632d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-3.305191888512945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-189.37354569266589d) + "'", double1 == (-189.37354569266589d));
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math.util.FastMath.ceil(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2358573269771982d + "'", double1 == 1.2358573269771982d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4999068558183408d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3934128428542537d) + "'", double1 == (-0.3934128428542537d));
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 1833L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1833.0f + "'", float2 == 1833.0f);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.7217112730781983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3961990902973522d + "'", double1 == 1.3961990902973522d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2442033263957681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.947140865203826d + "'", double1 == 0.947140865203826d);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-16.857679757182947d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6988504325041327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.7621956910836314d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        long long2 = org.apache.commons.math.util.FastMath.min(1833L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2039819363249487d + "'", double1 == 1.2039819363249487d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9993832155237184d, 0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999387116494891d + "'", double2 == 0.9999387116494891d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.810327220066308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3141397774108465d + "'", double1 == 1.3141397774108465d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707963267948954d, (-0.6759364361843173d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9771597781758796d + "'", double2 == 1.9771597781758796d);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 1833L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1833L + "'", long2 == 1833L);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        long long2 = org.apache.commons.math.util.FastMath.max(14L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double2 = org.apache.commons.math.util.FastMath.min(3.692229922941576d, 1.00024867560232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.00024867560232d + "'", double2 == 1.00024867560232d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.169629910668275d + "'", double1 == 15.169629910668275d);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24929524866556063d, (-0.8646647167633873d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.860890812949043d + "'", double2 == 2.860890812949043d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6855685475011852d, 0.768287758044532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2921584812524973d + "'", double2 == 1.2921584812524973d);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5689411523163806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6001355778661108d + "'", double1 == 0.6001355778661108d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6370255026277432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.279462974309043d + "'", double1 == 1.279462974309043d);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9328075542772654d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.358364510279281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.20140916094505582d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.344459247866038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.941258195581237d + "'", double1 == 0.941258195581237d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473369d + "'", double1 == 4.041914822473369d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9754001961551926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22226708771129583d + "'", double1 == 0.22226708771129583d);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7706382705810251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.311931422028702d + "'", double1 == 1.311931422028702d);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8359028870534029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8814971.780401375d + "'", double1 == 8814971.780401375d);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.7703727489273E13d + "'", double1 == 7.7703727489273E13d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.1711987928317563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002987982610353814d) + "'", double1 == (-0.002987982610353814d));
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double1 = org.apache.commons.math.util.FastMath.asin((-35.99999999999999d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2568711084276258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2513666537951759d) + "'", double1 == (-0.2513666537951759d));
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0051542672067486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10148739367448334d + "'", double1 == 0.10148739367448334d);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7061325845105428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.458416869119034d) + "'", double1 == (-40.458416869119034d));
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.floor((-16.857679757182947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.0d) + "'", double1 == (-17.0d));
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        int int1 = org.apache.commons.math.util.FastMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9711243963529564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9006957856321915d + "'", double1 == 2.9006957856321915d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        int int2 = org.apache.commons.math.util.FastMath.max(1477896, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        int int2 = org.apache.commons.math.util.FastMath.max((-36), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8364454861264231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9149994957367078d, (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9149994957367079d + "'", double2 == 0.9149994957367079d);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0484411939287768d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0484411939287768d + "'", double2 == 1.0484411939287768d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.016591253173120855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0167296523599423d + "'", double1 == 1.0167296523599423d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        int int2 = org.apache.commons.math.util.FastMath.min(53, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        int int2 = org.apache.commons.math.util.FastMath.min(1833, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.15456620010518718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1671515410548442d + "'", double1 == 0.1671515410548442d);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.7487757631160047E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.797518746539399E-6d) + "'", double1 == (-4.797518746539399E-6d));
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5998406268185329d, 5.551115123125784E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9609825412972041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7447148114163482d + "'", double1 == 0.7447148114163482d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7508100196049882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6356319499883114d + "'", double1 == 0.6356319499883114d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707963270671181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double1 = org.apache.commons.math.util.FastMath.cos(46340.95001184158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7755431812723019d) + "'", double1 == (-0.7755431812723019d));
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7179557518537436d + "'", double1 == 1.7179557518537436d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9597713318903205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.819060401153666d + "'", double1 == 0.819060401153666d);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double1 = org.apache.commons.math.util.FastMath.atan((-265.42343799244867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5670287798288525d) + "'", double1 == (-1.5670287798288525d));
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        int int1 = org.apache.commons.math.util.FastMath.abs(1833);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1833 + "'", int1 == 1833);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.017451520543541533d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998477260800739d + "'", double1 == 0.9998477260800739d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 175L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 175.0f + "'", float1 == 175.0f);
    }
}

