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
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1523647554462573d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5597919847479074d, 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01076481464331043d + "'", double2 == 0.01076481464331043d);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2592664089300267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5228362180255495d + "'", double1 == 2.5228362180255495d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6726669944799356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.15529712916720415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15529712916720417d + "'", double1 == 0.15529712916720417d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        double double2 = org.apache.commons.math.util.FastMath.min(1.172247689798102d, 232.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.172247689798102d + "'", double2 == 1.172247689798102d);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.04617424497707E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999536041128d + "'", double1 == 0.9999999536041128d);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.18422346241992238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.55522688394848d + "'", double1 == 10.55522688394848d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.781572054374191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6847038494719164d + "'", double1 == 1.6847038494719164d);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9182260640190093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0035006424347173598d, (-1.4077955424908757d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0035006424347173598d + "'", double2 == 0.0035006424347173598d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 601302L, 74.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7361507318256206d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4190581615792427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43240775807801074d + "'", double1 == 0.43240775807801074d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8800185270285333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7064286017935518d + "'", double1 == 0.7064286017935518d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        double double1 = org.apache.commons.math.util.FastMath.expm1(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.003480087166787292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15154096227471378d + "'", double1 == 0.15154096227471378d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.464727648867038d + "'", double1 == 0.464727648867038d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.691649480399158E41d, (-0.9722461073327932d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.691649480399157E41d + "'", double2 == 4.691649480399157E41d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4748409916077942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32345179675065633d) + "'", double1 == (-0.32345179675065633d));
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1672838871475522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1672838871475522d + "'", double1 == 1.1672838871475522d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.009606545630105158d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.40859244341429657d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-3L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8014237616909528d + "'", double1 == 1.8014237616909528d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8537394163269078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2697851668076674d + "'", double1 == 1.2697851668076674d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.09178033532574068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09190924353780147d + "'", double1 == 0.09190924353780147d);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7099378310397425d + "'", double1 == 0.7099378310397425d);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7730965638572164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01349308047516302d) + "'", double1 == (-0.01349308047516302d));
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.564317279302415E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9268252999478868d) + "'", double1 == (-0.9268252999478868d));
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9224287714823782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535893717671493d + "'", double1 == 0.6535893717671493d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.006281968213695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.100704088732632d + "'", double1 == 1.100704088732632d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 53.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11943352419502769d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11943352419502769d + "'", double1 == 0.11943352419502769d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3383347192043265E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.297849673894007d + "'", double1 == 14.297849673894007d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double1 = org.apache.commons.math.util.FastMath.abs(16.89056810518696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.89056810518696d + "'", double1 == 16.89056810518696d);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.009999500037496552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0000217136384455d) + "'", double1 == (-2.0000217136384455d));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3388866618191672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35283420416747496d + "'", double1 == 0.35283420416747496d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6699175736806617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.13394365429496144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12570151650051137d + "'", double1 == 0.12570151650051137d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 72, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.024066581448410507d, (-0.5945153260434693d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1011337331248416d + "'", double2 == 3.1011337331248416d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9387628649611217d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7593534431810431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6406959682088752d + "'", double1 == 0.6406959682088752d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math.util.FastMath.log(1.941208504361988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6633107195211883d + "'", double1 == 0.6633107195211883d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5579004906280911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.583574664711627d) + "'", double1 == (-0.583574664711627d));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.54983443527075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29947962419316054d + "'", double1 == 0.29947962419316054d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 232.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.144633651371694d + "'", double1 == 6.144633651371694d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5632546790890485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double1 = org.apache.commons.math.util.FastMath.atan((-21.168078002603806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.523590477869305d) + "'", double1 == (-1.523590477869305d));
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5677016102904182d, 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.16899590978479806d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17063287284085768d) + "'", double1 == (-0.17063287284085768d));
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math.util.FastMath.ceil(88.28977010367272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.0d + "'", double1 == 89.0d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9868053513896203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.408169345019964d + "'", double1 == 1.408169345019964d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.06066622498266398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06070344440102943d + "'", double1 == 0.06070344440102943d);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0777759905763586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49617539953860107d + "'", double1 == 0.49617539953860107d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double1 = org.apache.commons.math.util.FastMath.sinh(57.29577951308243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.821297790542173E24d + "'", double1 == 3.821297790542173E24d);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0068754614506148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.737035667152499d + "'", double1 == 2.737035667152499d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4913849717236785d, 0.7592181952216696d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7592181952216696d + "'", double2 == 0.7592181952216696d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double2 = org.apache.commons.math.util.FastMath.atan2(52.0d, (-0.013028828529253068d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.571046881184447d + "'", double2 == 1.571046881184447d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.13400211995708533d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int int1 = org.apache.commons.math.util.FastMath.round(72.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4901161193847673E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002460783300575925d + "'", double1 == 0.002460783300575925d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9568614257960677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        int int1 = org.apache.commons.math.util.FastMath.round(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7842626635876098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9015068026836573d + "'", double1 == 0.9015068026836573d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math.util.FastMath.log(2.1490617565057812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7650313545698383d + "'", double1 == 0.7650313545698383d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.log(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.624342922017807d + "'", double1 == 23.624342922017807d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.953280866830926E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003091018354570943d + "'", double1 == 0.003091018354570943d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.508377516798939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.42366562500264d + "'", double1 == 86.42366562500264d);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 232L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 232 + "'", int1 == 232);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5754413816841691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23999890992767545d) + "'", double1 == (-0.23999890992767545d));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4251.530792427802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.094947017729282E-13d + "'", double1 == 9.094947017729282E-13d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double2 = org.apache.commons.math.util.FastMath.atan2(57.260440365722204d, 0.9465430622761263d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5542673435415335d + "'", double2 == 1.5542673435415335d);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8855630621884312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0542128609568502d, 7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.557407724654902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4785912770698397d + "'", double1 == 2.4785912770698397d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.27229885648267216d, 4.596489008890833E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2722988564826722d + "'", double2 == 0.2722988564826722d);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.00878861691279533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008788503774748855d + "'", double1 == 0.008788503774748855d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.523590477869305d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8874498938378453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8874498938378453d + "'", double1 == 0.8874498938378453d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double1 = org.apache.commons.math.util.FastMath.tan(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.1477917752131d) + "'", double1 == (-7.1477917752131d));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.41438749389108315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7455364476418086d + "'", double1 == 0.7455364476418086d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999998508398553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998508398554d + "'", double1 == 0.9999998508398554d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.009730277093455045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3883106012234607d + "'", double1 == 0.3883106012234607d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3010711152883965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.984871677804444d + "'", double1 == 8.984871677804444d);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double double2 = org.apache.commons.math.util.FastMath.max(57.29577951308243d, 4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308243d + "'", double2 == 57.29577951308243d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.41438749389108315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.066371512547204d, 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42842.07030090556d + "'", double2 == 42842.07030090556d);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int int2 = org.apache.commons.math.util.FastMath.max(28, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        float float2 = org.apache.commons.math.util.FastMath.min(28.0f, (float) 28);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 28);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3371556133482585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29054468128588473d + "'", double1 == 0.29054468128588473d);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double2 = org.apache.commons.math.util.FastMath.min(2.3046231798951236d, 5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3046231798951236d + "'", double2 == 2.3046231798951236d);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3333254119364666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12493615643642433d + "'", double1 == 0.12493615643642433d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2479811090512842d, 0.39682711169797696d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2479811090512842d + "'", double2 == 1.2479811090512842d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7219634380306929d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7219634380306929d + "'", double1 == 0.7219634380306929d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 969L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 969.0f + "'", float2 == 969.0f);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3744449684274126E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6244090200701623d + "'", double1 == 0.6244090200701623d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int int1 = org.apache.commons.math.util.FastMath.abs(232);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 232 + "'", int1 == 232);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.496773992873097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9865282378222304d + "'", double1 == 0.9865282378222304d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double2 = org.apache.commons.math.util.FastMath.max(2.768115672379143E13d, 0.21317875147664192d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.768115672379143E13d + "'", double2 == 2.768115672379143E13d);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.685719999335932E24d, 1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.685719999335931E24d + "'", double2 == 5.685719999335931E24d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.605170185988092d, (-0.36945265746442124d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.605170185988091d + "'", double2 == 4.605170185988091d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999609473623688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (-53));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double2 = org.apache.commons.math.util.FastMath.pow(55.603735851147455d, 16.646983997654825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1238746832737802E29d + "'", double2 == 1.1238746832737802E29d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4576692332118568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7706382705810251d + "'", double1 == 0.7706382705810251d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double2 = org.apache.commons.math.util.FastMath.min(6.769991363293242d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.105427357601002E-15d + "'", double2 == 7.105427357601002E-15d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2645189576252271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9534625892455924d + "'", double1 == 0.9534625892455924d);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4472118490899239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5639455846427255d + "'", double1 == 0.5639455846427255d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05483113556160754d + "'", double1 == 0.05483113556160754d);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.0021027160061187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4415943645925386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.491347542702698d + "'", double1 == 11.491347542702698d);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double2 = org.apache.commons.math.util.FastMath.min(2.6260580840928345d, (-0.005440211108893698d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.005440211108893698d) + "'", double2 == (-0.005440211108893698d));
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3300895400924683d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48136823741490475d) + "'", double1 == (-0.48136823741490475d));
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6027624231806457d), 0.7330383821741316d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 102L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 102.0f + "'", float1 == 102.0f);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.25194576097040833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2865262554567682d + "'", double1 == 0.2865262554567682d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.027978420033734935d), 6.779623299504136E11d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 56L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 56.0f + "'", float1 == 56.0f);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9139954154840256d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9139954154840256d + "'", double2 == 0.9139954154840256d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0996411683627738d, 1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5993925892227773d + "'", double2 == 0.5993925892227773d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0286185349173835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9659946953128855d + "'", double1 == 0.9659946953128855d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 102L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102 + "'", int1 == 102);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10862815709014047d + "'", double1 == 0.10862815709014047d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(57.23253594375779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.232535943757796d + "'", double1 == 57.232535943757796d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9960820508065507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5435949910968588d + "'", double1 == 0.5435949910968588d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.008760540373344821d, 1.8219164086149127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004808383532658226d + "'", double2 == 0.004808383532658226d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9622075694412033d, 2.3046231798951236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3046231798951236d + "'", double2 == 2.3046231798951236d);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.0393938154819877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.663335481368682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.38614487937318d + "'", double1 == 1.38614487937318d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.44958547969513046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4345922431451043d + "'", double1 == 0.4345922431451043d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.48469922679209587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6190869198926165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1978336572884363d + "'", double1 == 1.1978336572884363d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 102);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10158570369662134d + "'", double1 == 0.10158570369662134d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5579004906280911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44333907546532597d + "'", double1 == 0.44333907546532597d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8092506500953682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09191694304343966d) + "'", double1 == (-0.09191694304343966d));
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.4442923814189608d), (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0412420976514144d) + "'", double2 == (-0.0412420976514144d));
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.004808383532658226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3180008988518255d) + "'", double1 == (-2.3180008988518255d));
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.0628837175857748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0205366001332101d) + "'", double1 == (-1.0205366001332101d));
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3878540873687678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7292718625455186d + "'", double1 == 0.7292718625455186d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.352281190436129d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9243269488615513d) + "'", double1 == (-1.9243269488615513d));
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double1 = org.apache.commons.math.util.FastMath.log(43.886867273679584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7816151243853176d + "'", double1 == 3.7816151243853176d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9950026437156599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.00945208926645d + "'", double1 == 57.00945208926645d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38905609893065d + "'", double1 == 7.38905609893065d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7970546072131296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.29327768157142287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.80357337942421d + "'", double1 == 16.80357337942421d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.434381731912222d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math.util.FastMath.log10(286.00000000000006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.456366033129043d + "'", double1 == 2.456366033129043d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4802234523765396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09044909026103848d + "'", double1 == 0.09044909026103848d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.43350576899781335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007566102995401802d + "'", double1 == 0.007566102995401802d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double2 = org.apache.commons.math.util.FastMath.min(0.00875022181505636d, 1.6055965365175096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00875022181505636d + "'", double2 == 0.00875022181505636d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5634006723940185E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.194070294404359d + "'", double1 == 8.194070294404359d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double1 = org.apache.commons.math.util.FastMath.exp(215.251057912766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0363139531632224E93d + "'", double1 == 3.0363139531632224E93d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.101000478591089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.17434407909384d + "'", double1 == 8.17434407909384d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3525692555035917d, (-25.170419727719406d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-25.170419727719406d) + "'", double2 == (-25.170419727719406d));
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.23999890992767545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2423647281479279d) + "'", double1 == (-0.2423647281479279d));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double1 = org.apache.commons.math.util.FastMath.expm1(12.406370728930153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 244352.37846310862d + "'", double1 == 244352.37846310862d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0514262063398037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8681319821391921d + "'", double1 == 0.8681319821391921d);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.054079817020544E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.054079817020544E49d + "'", double1 == 4.054079817020544E49d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8871428437982151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7099796578574171d + "'", double1 == 0.7099796578574171d);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.018833921198998405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.018833921198998405d + "'", double1 == 0.018833921198998405d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 56L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 56.0f + "'", float2 == 56.0f);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5302764730926062d, 0.5894902375914016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.203097529169366d + "'", double2 == 1.203097529169366d);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5507.0d, 0.755246472440062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706591838009425d + "'", double2 == 1.5706591838009425d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515096263d + "'", double1 == 1.1624473515096263d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6560676710276013d, 0.026981183359624506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6560676710276012d + "'", double2 == 0.6560676710276012d);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130532941206644d + "'", double1 == 1.2130532941206644d);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.466391323325752E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9742985252307768d + "'", double1 == 1.9742985252307768d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7469273663670996d, (-4194303.9999999413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        float float2 = org.apache.commons.math.util.FastMath.min(57.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.49283610173314196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8809945689944431d + "'", double1 == 0.8809945689944431d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4753536287620253d + "'", double1 == 0.4753536287620253d);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3878540873687678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9471260735710254d) + "'", double1 == (-0.9471260735710254d));
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9916299884373267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6982980140748426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.30802495663275425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1659350422353598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 66.8031571064935d + "'", double1 == 66.8031571064935d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        float float2 = org.apache.commons.math.util.FastMath.max(102.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 102.0f + "'", float2 == 102.0f);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.log10(74.93583069052579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.874689525981298d + "'", double1 == 1.874689525981298d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8577073882411156d), 1.146128035678238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8577073882411156d) + "'", double2 == (-0.8577073882411156d));
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double1 = org.apache.commons.math.util.FastMath.abs((-4426.960349240149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4426.960349240149d + "'", double1 == 4426.960349240149d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9224287714823782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8254454175048238d + "'", double1 == 0.8254454175048238d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 74L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 74L + "'", long2 == 74L);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 7.478987859894819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.017507307769456783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017505519291455614d + "'", double1 == 0.017505519291455614d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9410106931720924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.663208813276331d + "'", double1 == 0.663208813276331d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.054079817020544E49d, 1.408169345019964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0540798170205437E49d + "'", double2 == 4.0540798170205437E49d);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.38113293712154d) + "'", double1 == (-51.38113293712154d));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double1 = org.apache.commons.math.util.FastMath.atanh(100.69314718055996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8201627853541854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7312568756599237d + "'", double1 == 0.7312568756599237d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.219022125506721d, 28.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.043509028963738254d + "'", double2 == 0.043509028963738254d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 102, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4163477582874449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9560273016457693d + "'", double1 == 0.9560273016457693d);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2642218198404007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9117339147869651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6123758953651972d + "'", double1 == 0.6123758953651972d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1286764106923521d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12867641069235208d + "'", double2 == 0.12867641069235208d);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double2 = org.apache.commons.math.util.FastMath.max((-27.657308694642932d), 1.5715810788975262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5715810788975262d + "'", double2 == 1.5715810788975262d);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1531969697659333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15440680443502755d + "'", double1 == 0.15440680443502755d);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.005299577531174295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0053136451319804d + "'", double1 == 1.0053136451319804d);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9132181497465549d, 0.22469894983086627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22469894983086627d + "'", double2 == 0.22469894983086627d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double2 = org.apache.commons.math.util.FastMath.max(8.467717607067357E7d, 0.755246472440062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.467717607067357E7d + "'", double2 == 8.467717607067357E7d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        long long2 = org.apache.commons.math.util.FastMath.max(72L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.306831672164945d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4163477582874449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.416347758287445d + "'", double1 == 1.416347758287445d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1578212823495775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020207793526663034d + "'", double1 == 0.020207793526663034d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9704682670117347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7704121203896118d + "'", double1 == 0.7704121203896118d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 102);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.634728988229636d + "'", double1 == 4.634728988229636d);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44762327744595565d + "'", double1 == 0.44762327744595565d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.882468649088755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2753131426959097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8221176880717497d + "'", double1 == 0.8221176880717497d);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8322083902453671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0982933936473662d + "'", double1 == 1.0982933936473662d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math.util.FastMath.signum(13.596393407513997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.15529712916720417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0027104462228626325d + "'", double1 == 0.0027104462228626325d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.47381472041445105d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0488079432890174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8542466654236813d + "'", double1 == 2.8542466654236813d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.3485292390836008d), 71.50405046069433d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3485292390836008d) + "'", double2 == (-1.3485292390836008d));
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3383347192042697E42d, 1.5441790509547393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3383347192042697E42d + "'", double2 == 1.3383347192042697E42d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17540341900446965d + "'", double1 == 0.17540341900446965d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 601302L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 601302L + "'", long2 == 601302L);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.18422346241992235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4292126074801652d + "'", double1 == 0.4292126074801652d);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double2 = org.apache.commons.math.util.FastMath.max(57.29577951308243d, 0.83752767994986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308243d + "'", double2 == 57.29577951308243d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1531969697659333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.4164666005855215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.4415943645925386d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double2 = org.apache.commons.math.util.FastMath.min(0.017505519291455614d, 0.29225491648198393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017505519291455614d + "'", double2 == 0.017505519291455614d);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double1 = org.apache.commons.math.util.FastMath.asinh(57.47310111718266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.744539888821176d + "'", double1 == 4.744539888821176d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.832208390245367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9830787956514045d + "'", double1 == 0.9830787956514045d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074085d + "'", double1 == 1.4422495703074085d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.8760308014670004d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1781424084962125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7251720008261127d) + "'", double1 == (-1.7251720008261127d));
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016921204348595564d) + "'", double1 == (-0.016921204348595564d));
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9961652815068444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.07606632780374d + "'", double1 == 57.07606632780374d);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.05375489702567273d, (-0.6399307720594023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.053754897025672724d + "'", double2 == 0.053754897025672724d);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.24748960330606537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2474896033060654d + "'", double1 == 0.2474896033060654d);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.2710663101885893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double2 = org.apache.commons.math.util.FastMath.max(0.31617702417284754d, 0.9903301413773639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9903301413773639d + "'", double2 == 0.9903301413773639d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2475522144038352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3206433118857337d + "'", double1 == 1.3206433118857337d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.741450291257946d, (-265.4234379924486d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.956626286028327E-180d + "'", double2 == 3.956626286028327E-180d);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.393331768257697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8420998258122976d + "'", double1 == 1.8420998258122976d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.393331768257697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.865680316662962d + "'", double1 == 14.865680316662962d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7842626635876098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2430112846555396d) + "'", double1 == (-0.2430112846555396d));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.5240616266093142d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double1 = org.apache.commons.math.util.FastMath.asin(88.28977010367272d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(28.725283738478314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0625847036200735d + "'", double1 == 3.0625847036200735d);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8623188722876841d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4276814831852547d) + "'", double1 == (-0.4276814831852547d));
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9495963644937304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double2 = org.apache.commons.math.util.FastMath.atan2(57.29577951308242d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.46364760900080604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44846327963393373d + "'", double1 == 0.44846327963393373d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2228507766040782d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22285077660407818d + "'", double2 == 0.22285077660407818d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7456418720467646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.729577951308232d + "'", double1 == 5.729577951308232d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double2 = org.apache.commons.math.util.FastMath.min(48.275406513963d, 5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.421010862427522E-20d + "'", double2 == 5.421010862427522E-20d);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7235232133665008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2733622622248477d + "'", double1 == 1.2733622622248477d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math.util.FastMath.ulp(28.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double2 = org.apache.commons.math.util.FastMath.min(0.060496865085628314d, 0.9988961914845736d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.060496865085628314d + "'", double2 == 0.060496865085628314d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.03402992459718327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03403649600053511d + "'", double1 == 0.03403649600053511d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        double double2 = org.apache.commons.math.util.FastMath.min(0.03401679776016197d, 0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03401679776016197d + "'", double2 == 0.03401679776016197d);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1559057424196283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1546606711325055d) + "'", double1 == (-0.1546606711325055d));
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9916299884373266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9972021756248309d) + "'", double1 == (-0.9972021756248309d));
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 72);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 72.0f + "'", float1 == 72.0f);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double1 = org.apache.commons.math.util.FastMath.log(23.871490496694555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1726848806591383d + "'", double1 == 3.1726848806591383d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double1 = org.apache.commons.math.util.FastMath.rint(103504.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103504.0d + "'", double1 == 103504.0d);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.475783864064788d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09486957516151237d + "'", double1 == 0.09486957516151237d);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6809167416070823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5193393241142585d + "'", double1 == 0.5193393241142585d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.2266354000930777d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9413588930953838d) + "'", double1 == (-0.9413588930953838d));
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0769647493626147d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.11886886458581854d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.8014237616909528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.258847785313325d) + "'", double1 == (-4.258847785313325d));
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5748946607304181d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.574894660730418d) + "'", double1 == (-0.574894660730418d));
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.11158130719039049d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2664920422852502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.540947184137944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2172640916691473d + "'", double1 == 1.2172640916691473d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6610060414837733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41399229925728265d) + "'", double1 == (-0.41399229925728265d));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2493184782545368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2225981852327883d + "'", double1 == 0.2225981852327883d);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2461900271072904d, 0.8221176880717497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24619002710729043d + "'", double2 == 0.24619002710729043d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.tan(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.0027106300438728367d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0027106267244845546d) + "'", double1 == (-0.0027106267244845546d));
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.06390872240731825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.065995092854762d + "'", double1 == 0.065995092854762d);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.44041151091558656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42631174417624496d + "'", double1 == 0.42631174417624496d);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7893184915864662d) + "'", double1 == (-0.7893184915864662d));
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11.147713248144797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.10236374558935d + "'", double1 == 3.10236374558935d);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02914555989764255d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 74L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.298292365610486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3515046736041096d + "'", double1 == 2.3515046736041096d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.3112315471152565E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.000000000000014d + "'", double1 == 36.000000000000014d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.173925000801372d + "'", double1 == 1.173925000801372d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.23893697320392468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.028681504300924d + "'", double1 == 1.028681504300924d);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9903210539364166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8362020945501539d + "'", double1 == 0.8362020945501539d);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        int int2 = org.apache.commons.math.util.FastMath.max(102, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1477896L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 56L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56L + "'", long2 == 56L);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 74L, 969.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.0f + "'", float2 == 74.0f);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2956790750136956E117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.261386590818358E115d + "'", double1 == 2.261386590818358E115d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1011337331248416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.089066974010715d + "'", double1 == 11.089066974010715d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5632546790890485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9159461637162919d + "'", double1 == 0.9159461637162919d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double2 = org.apache.commons.math.util.FastMath.pow(326.4268172911656d, 1.550163776892725E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.720075976020836E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5860134523134308E15d, (-8.096453930081621d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.539171409161512E-124d + "'", double2 == 8.539171409161512E-124d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double1 = org.apache.commons.math.util.FastMath.tan(14.778873676342487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3383296635310251d) + "'", double1 == (-1.3383296635310251d));
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1295788105004783d, 32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.035284687279155354d + "'", double2 == 0.035284687279155354d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.016388539363305053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016390006834163424d + "'", double1 == 0.016390006834163424d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.10862815709014047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10841564684329023d + "'", double1 == 0.10841564684329023d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.322933953041652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9483084103447266d + "'", double1 == 0.9483084103447266d);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        long long2 = org.apache.commons.math.util.FastMath.max(6L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.0461741978670873E-4d), (-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.219022125506721d) + "'", double2 == (-1.219022125506721d));
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4292036732051034d + "'", double1 == 1.4292036732051034d);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6244090200701623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7901955581184713d + "'", double1 == 0.7901955581184713d);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14254654307427825d + "'", double1 == 0.14254654307427825d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.079905868209936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998081716072d + "'", double1 == 0.9999998081716072d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6548866146797762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6090693194205808d + "'", double1 == 0.6090693194205808d);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4251.530792427802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.200003546749976d + "'", double1 == 16.200003546749976d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4136054464127965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9551138546812727d + "'", double1 == 0.9551138546812727d);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.550163776892725E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.937211928373586E-9d + "'", double1 == 3.937211928373586E-9d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.686370328274955E20d + "'", double1 == 6.686370328274955E20d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3104037125409256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02287085931419646d + "'", double1 == 0.02287085931419646d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0730374999763912d + "'", double1 == 1.0730374999763912d);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double2 = org.apache.commons.math.util.FastMath.min((-265.4234379924486d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-265.4234379924486d) + "'", double2 == (-265.4234379924486d));
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999998d + "'", double1 == 0.9999999999999998d);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.30720038919415704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6747464171883842d + "'", double1 == 0.6747464171883842d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.11886728987977911d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11858913363418261d) + "'", double1 == (-0.11858913363418261d));
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.538696470620462d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        double double1 = org.apache.commons.math.util.FastMath.acosh(43.886867273679584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.474632480815888d + "'", double1 == 4.474632480815888d);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.000000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1469544105044815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8167426244157665d + "'", double1 == 0.8167426244157665d);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math.util.FastMath.floor(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0426842879669972d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8855860565679712d, (-0.340416587577421d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9377798691963888d + "'", double2 == 1.9377798691963888d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05890272379107848d + "'", double1 == 0.05890272379107848d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1310377402202207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3113374686137172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3218028439150607d + "'", double1 == 0.3218028439150607d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6480841250043182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4337347685185506d) + "'", double1 == (-0.4337347685185506d));
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.05047132954481966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8917941693321048d) + "'", double1 == (-2.8917941693321048d));
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double1 = org.apache.commons.math.util.FastMath.tan(35.61555864286098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7762501555396697d + "'", double1 == 1.7762501555396697d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double1 = org.apache.commons.math.util.FastMath.cos((-5.260052243696693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5206936783915806d + "'", double1 == 0.5206936783915806d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.16243485560816776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.013221573872519d + "'", double1 == 1.013221573872519d);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.15319696976593333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.416993700614301d + "'", double1 == 1.416993700614301d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.20057203709370552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19792501033653406d + "'", double1 == 0.19792501033653406d);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.009999500037496552d, (-3.04617424497707E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0014038147382547d + "'", double2 == 1.0014038147382547d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9394207128713856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6623893268722106d + "'", double1 == 0.6623893268722106d);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1477896);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5436613490374845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5199189970054047d + "'", double1 == 0.5199189970054047d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3734007669450161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1224236947215338d + "'", double1 == 1.1224236947215338d);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672743d) + "'", double1 == (-0.9171523356672743d));
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8328934556322386d) + "'", double1 == (-0.8328934556322386d));
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.48469922679209587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5291083670041681d + "'", double1 == 0.5291083670041681d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.362407451161307E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3998097478732469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.48136823741490475d), 0.2951731125517142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2951731125517142d + "'", double2 == 0.2951731125517142d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.57108749076139d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.0019709346146880593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001970935890733557d) + "'", double1 == (-0.001970935890733557d));
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5900247258946039d + "'", double1 == 1.5900247258946039d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double2 = org.apache.commons.math.util.FastMath.max(7.737125245533627E25d, (double) 56.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533627E25d + "'", double2 == 7.737125245533627E25d);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5574077246549045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835183d + "'", double1 == 1.2261911708835183d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5441790509547393d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9132263633319788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1511334730668343d + "'", double1 == 1.1511334730668343d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5498622334799267d, 0.6483608274590867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.678563973676752d + "'", double2 == 0.678563973676752d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.1546606711325055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.11887045430169285d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49168992279899687d) + "'", double1 == (-0.49168992279899687d));
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.07401831913620054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0768265318474357d + "'", double1 == 1.0768265318474357d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.3639197341146732E18d, 1.146128035678238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        long long2 = org.apache.commons.math.util.FastMath.min(601302L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2420709504904546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.892949116787485d + "'", double1 == 0.892949116787485d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.28357366964177444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28751871345990776d + "'", double1 == 0.28751871345990776d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9729356641053681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000004547d + "'", double1 == 1.0000000000004547d);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.718281828459047d + "'", double1 == 1.718281828459047d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3968271116979769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7348529557280805d + "'", double1 == 0.7348529557280805d);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double1 = org.apache.commons.math.util.FastMath.sin(43.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8317747426285983d) + "'", double1 == (-0.8317747426285983d));
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3288870502122705E12d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2592664089300267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9387214167925974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2189018535383644d + "'", double1 == 1.2189018535383644d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.14254654307427825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37755336453841626d + "'", double1 == 0.37755336453841626d);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7599438017965855d, 171.78552109133565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3111887256522343E-21d + "'", double2 == 3.3111887256522343E-21d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double1 = org.apache.commons.math.util.FastMath.atan(601302.1420828041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707946637374584d + "'", double1 == 1.5707946637374584d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9226350743220142d, 0.5029298180234462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0717216918481256d + "'", double2 == 1.0717216918481256d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 969L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 969L + "'", long2 == 969L);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0009877980461306d, 14.899277193215994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0009877980461306d + "'", double2 == 1.0009877980461306d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.960170286650366d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2.14748365E9f, 0.45593812776599624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326582584d + "'", double2 == 1.570796326582584d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9712667366571679d), 0.9649955887750582d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7886369424989467d) + "'", double2 == (-0.7886369424989467d));
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.464727648867038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48163722963116584d + "'", double1 == 0.48163722963116584d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4802234523765396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2166443409544712d + "'", double1 == 1.2166443409544712d);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9951585358453275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0021077275374186714d) + "'", double1 == (-0.0021077275374186714d));
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double1 = org.apache.commons.math.util.FastMath.log(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.419034402957756d) + "'", double1 == (-28.419034402957756d));
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.1559057424196283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9878712969215325d + "'", double1 == 0.9878712969215325d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.817884356931778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3237787393690108d + "'", double1 == 1.3237787393690108d);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double1 = org.apache.commons.math.util.FastMath.acos(29.169558789096715d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.9283350632110237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.374981066404604d + "'", double1 == 9.374981066404604d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2956790750136956E117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2956790750136956E117d + "'", double1 == 1.2956790750136956E117d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        int int2 = org.apache.commons.math.util.FastMath.max(232, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 232 + "'", int2 == 232);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.95237014951114d + "'", double1 == 104.95237014951114d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.1726848806591383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.35283420416747496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006158118576376336d + "'", double1 == 0.006158118576376336d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7370079472344264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.680322147502893d + "'", double1 == 4.680322147502893d);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4711276743037347d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7619036782447475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6421968982441293d + "'", double1 == 0.6421968982441293d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.23511536410737136d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-4.550646685718122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-260.73284914684433d) + "'", double1 == (-260.73284914684433d));
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        int int1 = org.apache.commons.math.util.FastMath.round(969.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 969 + "'", int1 == 969);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.270493131269137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2968911060773807d + "'", double1 == 1.2968911060773807d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.289917197127753d + "'", double1 == 27.289917197127753d);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 232 + "'", int2 == 232);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 969);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 969 + "'", int2 == 969);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6244090200701623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.319776824715853d, 0.7922335744099077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3197768247158526d + "'", double2 == 2.3197768247158526d);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6178334732240378d, (double) 72.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6178334732240378d + "'", double2 == 1.6178334732240378d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 232L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.705842789336087E100d + "'", double1 == 5.705842789336087E100d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.023147549851845705d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.022881700523970604d) + "'", double1 == (-0.022881700523970604d));
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.883230432587404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015415279102464019d + "'", double1 == 0.015415279102464019d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1644247616460815d, 0.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9859950710226582d + "'", double2 == 0.9859950710226582d);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-10.162168244741062d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999970195433d) + "'", double1 == (-0.9999999970195433d));
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3046231798951236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.020401652118721d + "'", double1 == 10.020401652118721d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09934057489936098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09901507724404694d + "'", double1 == 0.09901507724404694d);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9946861854499426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7853965042607342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8686687637796333d + "'", double1 == 0.8686687637796333d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04050876663449861d + "'", double1 == 0.04050876663449861d);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.005299577531174295d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9227673888116062d) + "'", double1 == (-0.9227673888116062d));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.854849316209146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2338710309486518d + "'", double1 == 1.2338710309486518d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        int int1 = org.apache.commons.math.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }
}

