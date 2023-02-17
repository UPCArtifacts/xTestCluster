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
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6769292032740716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6769292032740717d + "'", double1 == 0.6769292032740717d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double2 = org.apache.commons.math.util.FastMath.min(3.7626139187213443d, 1.3732849892136236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3732849892136236d + "'", double2 == 1.3732849892136236d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.49260818941222645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45771669378667196d + "'", double1 == 0.45771669378667196d);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999995127847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8331526722825443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9847840356703351d + "'", double1 == 0.9847840356703351d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.041914822473389d, 83.93939556930012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.048115609504801635d + "'", double2 == 0.048115609504801635d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9956156978709082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.706390147061685d + "'", double1 == 1.706390147061685d);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.242605345373291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8805489308698095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8805489308698096d + "'", double1 == 0.8805489308698096d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1301927452503904d, (-0.8898968261331758d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8898968261331758d) + "'", double2 == (-0.8898968261331758d));
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1814240655113062d + "'", double1 == 1.1814240655113062d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double1 = org.apache.commons.math.util.FastMath.cos((-5.854275151361752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.909419533987008d + "'", double1 == 0.909419533987008d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.24757445151075d + "'", double1 == 16.24757445151075d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.089706959422758d + "'", double1 == 4.089706959422758d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double2 = org.apache.commons.math.util.FastMath.max(0.998336557950689d, 3.348459106948174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.348459106948174d + "'", double2 == 3.348459106948174d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        float float2 = org.apache.commons.math.util.FastMath.max(2063.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2063.0f + "'", float2 == 2063.0f);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8986761182296239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10683257835552494d) + "'", double1 == (-0.10683257835552494d));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5259944849453191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5538840018563328d + "'", double1 == 0.5538840018563328d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11776318452497536d) + "'", double1 == (-0.11776318452497536d));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double1 = org.apache.commons.math.util.FastMath.expm1(71.98610843089314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8330303899624652E31d + "'", double1 == 1.8330303899624652E31d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.02393945884531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.624682373096312d + "'", double1 == 0.624682373096312d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.055651037105448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8124637725080135d + "'", double1 == 0.8124637725080135d);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.1731525181731936d), 0.013780436725687925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17315251817319358d) + "'", double2 == (-0.17315251817319358d));
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.461578766216512E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.927451401512739d + "'", double1 == 13.927451401512739d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7556616167207904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7556616167207904d + "'", double1 == 0.7556616167207904d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.1143659906583754d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double1 = org.apache.commons.math.util.FastMath.ceil(52.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8245796280639899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5402550837019153d + "'", double1 == 2.5402550837019153d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.321264196906668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.143347961885159d + "'", double1 == 5.143347961885159d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(88.46858222228961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5068.8763808433d + "'", double1 == 5068.8763808433d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.202429048488105d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.7182625987939137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.5439907640537776d + "'", double1 == 7.5439907640537776d);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.19174708835953738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816727834140248d + "'", double1 == 0.9816727834140248d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9173669803900304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016011074256884285d + "'", double1 == 0.016011074256884285d);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02672510010597802d + "'", double1 == 0.02672510010597802d);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6497173593097066d + "'", double1 == 0.6497173593097066d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9679651155126135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.677000072615545d + "'", double1 == 0.677000072615545d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7653233053981704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.050056743216267E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.050056743216267E7d + "'", double1 == 2.050056743216267E7d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double1 = org.apache.commons.math.util.FastMath.tan(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1059531447487012d) + "'", double1 == (-1.1059531447487012d));
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.04248624667210518d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.31113287105457993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3217992116817487d + "'", double1 == 0.3217992116817487d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.592236257454505d) + "'", double1 == (-2.592236257454505d));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3550914891488244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.067519675285737d + "'", double1 == 2.067519675285737d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4477855L, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.612434767874704E-6d, 2.2829673798684508E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2105002693593424E-29d + "'", double2 == 4.2105002693593424E-29d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5223184878037187d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.981514553174113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993040480673591d + "'", double1 == 0.9993040480673591d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1731525181731936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7535824649348466d) + "'", double1 == (-1.7535824649348466d));
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42224075283774537d) + "'", double1 == (-0.42224075283774537d));
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0517578125E-5d + "'", double1 == 3.0517578125E-5d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.2792211365930393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.999999995877003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.471127674262913d + "'", double1 == 1.471127674262913d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.157240911549055d, (-0.9754001961551925d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16983711268242813d + "'", double2 == 0.16983711268242813d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math.util.FastMath.atanh(98.65301223419652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        int int1 = org.apache.commons.math.util.FastMath.abs(11013);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9816727834140248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1143659906583754d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.918513704344091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.99489795918369d + "'", double1 == 48.99489795918369d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 11013.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math.util.FastMath.signum(34.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8461684323333869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9198741393980956d + "'", double1 == 0.9198741393980956d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7215087615242686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.057535199918883d + "'", double1 == 2.057535199918883d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double double2 = org.apache.commons.math.util.FastMath.max(0.033377737685972374d, 1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4657022738769552d + "'", double2 == 1.4657022738769552d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double2 = org.apache.commons.math.util.FastMath.atan2(89.42706130231652d, 1.544068044350276d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5535318141433303d + "'", double2 == 1.5535318141433303d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.829298395868054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.798425027260655d + "'", double1 == 0.798425027260655d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0028361878855967383d) + "'", double1 == (-0.0028361878855967383d));
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3282591577868472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2838691809510444d + "'", double1 == 0.2838691809510444d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.070289829259562d + "'", double1 == 3.070289829259562d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.433064486228815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7565730320325229d + "'", double1 == 0.7565730320325229d);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308231d + "'", double1 == 572.9577951308231d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8402550739104362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.075588856347743d) + "'", double1 == (-0.075588856347743d));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double1 = org.apache.commons.math.util.FastMath.ulp(43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double2 = org.apache.commons.math.util.FastMath.atan2(25794.14288947931d, 0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707857701790928d + "'", double2 == 1.5707857701790928d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5708871266543591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.49555014055642926d), 1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1599753909038675d + "'", double2 == 1.1599753909038675d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9999902065507035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1751860816182014d) + "'", double1 == (-1.1751860816182014d));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int int2 = org.apache.commons.math.util.FastMath.min(34, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999999999992766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348143935d + "'", double1 == 1.5430806348143935d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4380253164811876d, 1.4354737487211742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43802531648118764d + "'", double2 == 0.43802531648118764d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.4441141450677315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2366667291834312d + "'", double1 == 1.2366667291834312d);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2146848510894035E-8d + "'", double1 == 4.2146848510894035E-8d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.516258181075712E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5812207903548794d) + "'", double1 == (-1.5812207903548794d));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3361261908684114d + "'", double1 == 1.3361261908684114d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7895608642289975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7895608642289976d + "'", double1 == 0.7895608642289976d);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 61, (-115L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115L) + "'", long2 == (-115L));
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.051085085955435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.8679319012240025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08496143943922622d + "'", double1 == 0.08496143943922622d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.934990176680789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.923976038617366d + "'", double1 == 5.923976038617366d);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.17139683014300192d), 0.6931471805599462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931471805599462d + "'", double2 == 0.6931471805599462d);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064928217585d + "'", double1 == 0.017455064928217585d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double1 = org.apache.commons.math.util.FastMath.floor(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.7905015022311375d, 0.0063607470924259965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0065488851213134d + "'", double2 == 1.0065488851213134d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 793006726156715L, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 4477855L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4477855.0f + "'", float2 == 4477855.0f);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9154657226686728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6499607902809772d + "'", double1 == 0.6499607902809772d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        double double2 = org.apache.commons.math.util.FastMath.min(11.54872970901283d, 1.0374193018868239d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0374193018868239d + "'", double2 == 1.0374193018868239d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1271307019409333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05197427970224781d + "'", double1 == 0.05197427970224781d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double2 = org.apache.commons.math.util.FastMath.max(0.1912734868318314d, (double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483647E9d + "'", double2 == 2.147483647E9d);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9617542719885632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9617542719885632d + "'", double1 == 0.9617542719885632d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 793006726156715L, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9300672E14f + "'", float2 == 7.9300672E14f);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double1 = org.apache.commons.math.util.FastMath.sin(38.38636539305675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6344165955564073d + "'", double1 == 0.6344165955564073d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6190869198926164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5504919694000701d + "'", double1 == 0.5504919694000701d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1851160204964712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2710663101885897d + "'", double1 == 2.2710663101885897d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double2 = org.apache.commons.math.util.FastMath.max(0.37990878017946567d, (-0.07459659470484177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37990878017946567d + "'", double2 == 0.37990878017946567d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9617542719885632d, 0.9816727834140248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9617542719885633d + "'", double2 == 0.9617542719885633d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 793006726156715L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.798425027260655d, 96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7984250272606551d + "'", double2 == 0.7984250272606551d);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5344733951434961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (-2L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9617542719885633d, 0.32786670017476716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9872958016641343d + "'", double2 == 0.9872958016641343d);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.900849165587834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.278947656501517d + "'", double1 == 0.278947656501517d);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.449489742783178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3480061545972777d + "'", double1 == 1.3480061545972777d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7653233053981704d, (-0.23664550481769292d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.23664550481769292d) + "'", double2 == (-0.23664550481769292d));
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6931433986678658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6389583671305571d + "'", double1 == 0.6389583671305571d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.015058070638819365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01494526481561403d) + "'", double1 == (-0.01494526481561403d));
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5504919694000701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.010657397841739896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9893991910142437d + "'", double1 == 0.9893991910142437d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.015736432937059376d), (-0.4823133060975066d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4823133060975066d) + "'", double2 == (-0.4823133060975066d));
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9428090415820635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025576261223690597d) + "'", double1 == (-0.025576261223690597d));
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.002160686891321d, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.001817844198028d + "'", double2 == 1.001817844198028d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8551949204304973d) + "'", double1 == (-0.8551949204304973d));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.2204460492503128E-16d, (-4.155599707401653d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.121833536484325E65d + "'", double2 == 1.121833536484325E65d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.017435626545756002d), (-2.1928939093273927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017435626545756002d) + "'", double2 == (-0.017435626545756002d));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double2 = org.apache.commons.math.util.FastMath.atan2(90.0d, 1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5512127510085636d + "'", double2 == 1.5512127510085636d);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.509011168189731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.41047360972816d + "'", double1 == 45.41047360972816d);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8140679949148034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6718282560736888d) + "'", double1 == (-0.6718282560736888d));
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9350771598391504d + "'", double1 == 0.9350771598391504d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5344733951434961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5344733951434962d + "'", double1 == 0.5344733951434962d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.07459659470484177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9972189640128911d + "'", double1 == 0.9972189640128911d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.46530948110595355d, 0.9429862169662604d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.45838786510164564d + "'", double2 == 0.45838786510164564d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double2 = org.apache.commons.math.util.FastMath.max(3.1415926535897927d, 0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1415926535897927d + "'", double2 == 3.1415926535897927d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4189118803430434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.716749058368794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0477652126995582d + "'", double1 == 1.0477652126995582d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.013125840905313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.004356275608051d + "'", double1 == 1.004356275608051d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6499607902809772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6051551910487805d + "'", double1 == 0.6051551910487805d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5878518034529052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.41333646188643103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0866466588126182d + "'", double1 == 1.0866466588126182d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7273829205199929d) + "'", double1 == (-0.7273829205199929d));
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.41592402552475427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3477823395416573d + "'", double1 == 0.3477823395416573d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.007582068426303211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1202123004909867d) + "'", double1 == (-2.1202123004909867d));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8726001743881419d, 1477896.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.904340862875605E-7d + "'", double2 == 5.904340862875605E-7d);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18866643501183092d + "'", double1 == 0.18866643501183092d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.332204510175204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4936329393655345d + "'", double1 == 1.4936329393655345d);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70515.43768240388d + "'", double1 == 70515.43768240388d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.4872649669851485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1876782681528486d) + "'", double1 == (-1.1876782681528486d));
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14459361016100902d + "'", double1 == 0.14459361016100902d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7075472925031877E-6d + "'", double1 == 1.7075472925031877E-6d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.20325541915325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.330942906955118d + "'", double1 == 3.330942906955118d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double1 = org.apache.commons.math.util.FastMath.rint(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9154657226686728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.45232219780884d + "'", double1 == 52.45232219780884d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2924316695611777d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double1 = org.apache.commons.math.util.FastMath.signum(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.850338976445283E14d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.848864208384537E-40d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2861574922647803E-250d) + "'", double1 == (-1.2861574922647803E-250d));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1555698629817919d, 0.14459361016100902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14459361016100902d + "'", double2 == 0.14459361016100902d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8410093358548899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07519918317027052d) + "'", double1 == (-0.07519918317027052d));
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.32577747641597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.6242861082825d + "'", double1 == 75.6242861082825d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.015737732063462555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9843854589461036d + "'", double1 == 0.9843854589461036d);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5574077246549018d), 0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5574077246549018d) + "'", double2 == (-1.5574077246549018d));
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034913677698806274d + "'", double1 == 0.034913677698806274d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.01976389133388643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019960490083693105d + "'", double1 == 0.019960490083693105d);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.070289829259562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.070289829259562d + "'", double1 == 3.070289829259562d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2538007084319281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.595507169996839d) + "'", double1 == (-0.595507169996839d));
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-16d + "'", double1 == 8.881784197001254E-16d);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double1 = org.apache.commons.math.util.FastMath.abs(49.80857186097813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.80857186097813d + "'", double1 == 49.80857186097813d);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.47562539683640714d, 1.2521872254166764E102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7983568845157207E-103d + "'", double2 == 3.7983568845157207E-103d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1814240655113062d, (-0.2107289687910285d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7473086252997854d + "'", double2 == 1.7473086252997854d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.270624161294801d, 0.0032155680495951195d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.2706241612948d + "'", double2 == 8.2706241612948d);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3320915232243828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33209152322438285d + "'", double1 == 0.33209152322438285d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7311284168939934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8969517247856423d + "'", double1 == 0.8969517247856423d);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.898979485566356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.875911840413956d + "'", double1 == 2.875911840413956d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9406701758307914d), 1.3550914891488244d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4120062944864213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9163192498513427d + "'", double1 == 0.9163192498513427d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.tanh(75.13548422015074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9754001961551926d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26948244944680966d + "'", double1 == 0.26948244944680966d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.691649480399158E41d + "'", double1 == 4.691649480399158E41d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8887992509694499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.92444591493832d + "'", double1 == 50.92444591493832d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 34, 7.9300672E14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.9300672E14f + "'", float2 == 7.9300672E14f);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.4792782221696E13d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double2 = org.apache.commons.math.util.FastMath.min(1.718281828459084d, 0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999929257765152d + "'", double2 == 0.9999929257765152d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.1898547757074525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1898547757074525d + "'", double1 == 2.1898547757074525d);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double1 = org.apache.commons.math.util.FastMath.asinh(16.305565311881857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4855926407920474d + "'", double1 == 3.4855926407920474d);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        long long2 = org.apache.commons.math.util.FastMath.max(4477855L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4477855L + "'", long2 == 4477855L);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.66352808187712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998220482235222d + "'", double1 == 0.9998220482235222d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6919147517828992d + "'", double1 == 0.6919147517828992d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7603734074051981d), 0.9154657226686728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.760373407405198d) + "'", double2 == (-0.760373407405198d));
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.016609097373236268d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01660986102055906d) + "'", double1 == (-0.01660986102055906d));
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5404895876275592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5145558535766026d + "'", double1 == 0.5145558535766026d);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.016931824990597796d, 0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.021360150830069147d + "'", double2 == 0.021360150830069147d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        long long2 = org.apache.commons.math.util.FastMath.max(53L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double1 = org.apache.commons.math.util.FastMath.atan(61.48941136975552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5545347976893902d + "'", double1 == 1.5545347976893902d);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5084833071825032d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.015737732063462555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998761644507076d + "'", double1 == 0.9998761644507076d);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(50.498986710526204d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.4989867105262d + "'", double2 == 50.4989867105262d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4257210334580655d, 0.7895608642289974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7895608642289974d + "'", double2 == 0.7895608642289974d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        float float1 = org.apache.commons.math.util.FastMath.abs((-36.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0001456277756542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5579066885106783d + "'", double1 == 1.5579066885106783d);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.264618055022479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.627446743855277d + "'", double1 == 9.627446743855277d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-1L), 0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4430227241169226d, 1.000072811237089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000072811237089d + "'", double2 == 1.000072811237089d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9441186631554072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.774666783141593d + "'", double1 == 1.774666783141593d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5851102438039822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5851102438039824d + "'", double1 == 0.5851102438039824d);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(91.1017061152064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5900247258946043d + "'", double1 == 1.5900247258946043d);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40982277797958866d + "'", double1 == 0.40982277797958866d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7672312144687762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5694140362027117d + "'", double1 == 0.5694140362027117d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.2706241612948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 473.8718583811182d + "'", double1 == 473.8718583811182d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double1 = org.apache.commons.math.util.FastMath.ceil(405.30084950781344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 406.0d + "'", double1 == 406.0d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.2829673798684508E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.78493321803375d + "'", double1 == 53.78493321803375d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7970747335500249d + "'", double1 == 0.7970747335500249d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2911401090912527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4821105247023754d + "'", double1 == 3.4821105247023754d);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5420777404922403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 61);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.475919246252206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.025759650340653972d) + "'", double1 == (-0.025759650340653972d));
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7653530282311698d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3564962504917153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8825659038653866d + "'", double1 == 3.8825659038653866d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double2 = org.apache.commons.math.util.FastMath.min(0.016592775780932937d, 1.221037751377339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.016592775780932937d + "'", double2 == 0.016592775780932937d);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6520789543272818d, 1.5480419174142943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5480419174142943d + "'", double2 == 1.5480419174142943d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.3012989023039965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04016524291773606d) + "'", double1 == (-0.04016524291773606d));
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1916668692906738d + "'", double1 == 0.1916668692906738d);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double2 = org.apache.commons.math.util.FastMath.max(1.433704240591099d, 61.48941136975552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 61.48941136975552d + "'", double2 == 61.48941136975552d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8850917695760475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5149779865389813d + "'", double1 == 0.5149779865389813d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1814240655113062d, 140.3454242220617d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1814240655113062d + "'", double2 == 1.1814240655113062d);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8292136654695167d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7553181134071862d) + "'", double1 == (-0.7553181134071862d));
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double1 = org.apache.commons.math.util.FastMath.asin(96.10655605346268d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.541701295923297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5417012959232971d + "'", double1 == 0.5417012959232971d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.037558523604740435d) + "'", double1 == (-0.037558523604740435d));
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double1 = org.apache.commons.math.util.FastMath.log(3.1215871267631296E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.374583898014649d) + "'", double1 == (-10.374583898014649d));
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9250245035569947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5219300558579005d + "'", double1 == 1.5219300558579005d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1877626999044049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.05378976758614d + "'", double1 == 68.05378976758614d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.035124005767007416d, (-0.2717628242082613d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03512400576700741d + "'", double2 == 0.03512400576700741d);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        float float1 = org.apache.commons.math.util.FastMath.abs(28.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 28.0f + "'", float1 == 28.0f);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.458847799916853d + "'", double1 == 28.458847799916853d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.900263084763043E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948917d + "'", double1 == 1.5707963267948917d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double2 = org.apache.commons.math.util.FastMath.max(0.31326970789315417d, (-0.6576833375608168d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31326970789315417d + "'", double2 == 0.31326970789315417d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4080652728465024d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        long long1 = org.apache.commons.math.util.FastMath.abs(793006726156715L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 793006726156715L + "'", long1 == 793006726156715L);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0866466588126182d, 0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0344564187202214d + "'", double2 == 1.0344564187202214d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0000287440185127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000143719059804d + "'", double1 == 1.0000143719059804d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7037024113814048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7632360637504044d + "'", double1 == 0.7632360637504044d);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double1 = org.apache.commons.math.util.FastMath.log((-5.854275151361752d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double1 = org.apache.commons.math.util.FastMath.acosh(28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473389d + "'", double1 == 4.041914822473389d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math.util.FastMath.ulp(18501.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.637978807091713E-12d + "'", double1 == 3.637978807091713E-12d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007812579475042568d + "'", double1 == 0.007812579475042568d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1160510480284926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0372768527383285d + "'", double1 == 1.0372768527383285d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        long long1 = org.apache.commons.math.util.FastMath.round(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.7950337271198835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9965868662679572d) + "'", double1 == (-0.9965868662679572d));
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double1 = org.apache.commons.math.util.FastMath.signum(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5344733951434962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5963866438669847d + "'", double1 == 0.5963866438669847d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.746938918904175d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7612639340924646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7021339779461073d + "'", double1 == 0.7021339779461073d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.27281660270156344d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2728166027015634d + "'", double2 == 0.2728166027015634d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1096.6331584284585d + "'", double1 == 1096.6331584284585d);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double2 = org.apache.commons.math.util.FastMath.min(1.114722093336851d, 0.8414709827920579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8414709827920579d + "'", double2 == 0.8414709827920579d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.541950429394781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.443830238464286d + "'", double1 == 2.443830238464286d);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.015390197088988328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double2 = org.apache.commons.math.util.FastMath.min(8388608.0d, 1.7592646625426185d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7592646625426185d + "'", double2 == 1.7592646625426185d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.605170185988093d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7805951733159242d, 1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7805951733159242d + "'", double2 == 0.7805951733159242d);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (-36L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017064347177812814d) + "'", double1 == (-0.017064347177812814d));
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double1 = org.apache.commons.math.util.FastMath.log(0.20350434138645834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5920679407326555d) + "'", double1 == (-1.5920679407326555d));
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int int2 = org.apache.commons.math.util.FastMath.max(36, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.774666783141593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8263231853045113d + "'", double1 == 0.8263231853045113d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5049643868687765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4087692347107456d + "'", double1 == 0.4087692347107456d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.580874073435181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999949219941102d + "'", double1 == 0.999949219941102d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        long long2 = org.apache.commons.math.util.FastMath.min((-115L), (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-115L) + "'", long2 == (-115L));
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.49320544130525545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0550256221829202d + "'", double1 == 1.0550256221829202d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9778913495481287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.977891349548129d + "'", double1 == 1.977891349548129d);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double1 = org.apache.commons.math.util.FastMath.log(4.8539967282194916E-36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-81.31326091451947d) + "'", double1 == (-81.31326091451947d));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5259944849453191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5805489787767156d + "'", double1 == 0.5805489787767156d);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.1224619373680373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12246193736803732d + "'", double1 == 0.12246193736803732d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8998668269691937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10550849664070105d) + "'", double1 == (-0.10550849664070105d));
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double1 = org.apache.commons.math.util.FastMath.floor(4973.752448262787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4973.0d + "'", double1 == 4973.0d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9591348389208239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8521803661001237d + "'", double1 == 0.8521803661001237d);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2063L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2063.0f + "'", float2 == 2063.0f);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6334239030790434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45661540785828797d) + "'", double1 == (-0.45661540785828797d));
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999995127847d, 1.6301187513103574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999995127848d + "'", double2 == 0.9999999995127848d);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double1 = org.apache.commons.math.util.FastMath.tan(50.498986710526204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23784278001407477d + "'", double1 == 0.23784278001407477d);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double1 = org.apache.commons.math.util.FastMath.asinh(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.27996198883595164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2441875297784895d) + "'", double1 == (-0.2441875297784895d));
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.1976967646632825E-38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1976967646632825E-38d + "'", double1 == 3.1976967646632825E-38d);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5604053336141724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5315295752520452d + "'", double1 == 0.5315295752520452d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.030044150150702355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030500029680797045d + "'", double1 == 0.030500029680797045d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1866192619566323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2759872104089567d + "'", double1 == 3.2759872104089567d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7734654088517433d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8029955704341625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.5528283781107654E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        double double1 = org.apache.commons.math.util.FastMath.log1p(71.98610843089314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.290269127572694d + "'", double1 == 4.290269127572694d);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6846269172035435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.881355914711719d + "'", double1 == 0.881355914711719d);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4936329393655345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.338899955114298d + "'", double1 == 2.338899955114298d);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5012360108561111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9975816565831466d + "'", double1 == 0.9975816565831466d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        int int2 = org.apache.commons.math.util.FastMath.max(34, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 61L, 28.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005509242377730479d + "'", double1 == 0.005509242377730479d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.021360150830069147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021361775150108318d + "'", double1 == 0.021361775150108318d);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.951779799197592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999864675382403d + "'", double1 == 0.9999864675382403d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7453292519943295d, 0.027415567793051467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0153860800779513d + "'", double2 == 1.0153860800779513d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-48.18608569304648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-48.18608569304647d) + "'", double1 == (-48.18608569304647d));
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.22403837382938316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double2 = org.apache.commons.math.util.FastMath.pow(36.0d, 0.37284288447085207d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.804138441060347d + "'", double2 == 3.804138441060347d);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.295644233174035d + "'", double1 == 2.295644233174035d);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.697222728536797d, 83.93939556930012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0677691116349401d + "'", double2 == 0.0677691116349401d);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.431733408790851d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9508218731216451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8461684323333872d + "'", double1 == 0.8461684323333872d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9298000805439273d + "'", double1 == 0.9298000805439273d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1102230246251565E-16d, 0.033377737685972374d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1102230246251565E-16d + "'", double2 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.0196617707395668d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8005182678076421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8947168646044636d + "'", double1 == 0.8947168646044636d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7933286322891901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0159880658191136d + "'", double1 == 1.0159880658191136d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7905015022311375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9924907337673078d + "'", double1 == 0.9924907337673078d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9494131316918538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8130739933623714d + "'", double1 == 0.8130739933623714d);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        float float1 = org.apache.commons.math.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8025772433836376d + "'", double1 == 0.8025772433836376d);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5481514696830391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7403725208859653d + "'", double1 == 0.7403725208859653d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.825659180793972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1714901038836636d + "'", double1 == 0.1714901038836636d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6169827255860206d) + "'", double1 == (-0.6169827255860206d));
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.980232238769531E-8d + "'", double1 == 2.980232238769531E-8d);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5638717219103803d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.016931824990597796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01693263411648491d + "'", double1 == 0.01693263411648491d);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.257464668395979d) + "'", double1 == (-0.257464668395979d));
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.1474836479999998E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.18070977791825d + "'", double1 == 22.18070977791825d);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.457669233211857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47537200089104603d) + "'", double1 == (-0.47537200089104603d));
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.00671091585859779d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9754001961551926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3485292390836008d + "'", double1 == 1.3485292390836008d);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 4477855L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5344733951434962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48879314574081656d + "'", double1 == 0.48879314574081656d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.floor(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8414709848078965d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        int int1 = org.apache.commons.math.util.FastMath.abs(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 61L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.605170185988092d, 0.8805489308698096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.381867984729549d + "'", double2 == 1.381867984729549d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.93006726156716E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.013125840905313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6033115552004982d + "'", double1 == 1.6033115552004982d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999999999992766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.234213228460136E-13d) + "'", double1 == (-7.234213228460136E-13d));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9476074427019164E250d + "'", double1 == 1.9476074427019164E250d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double1 = org.apache.commons.math.util.FastMath.tan(18.861169701161394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011614301805863666d + "'", double1 == 0.011614301805863666d);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.663528081877013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.048841459179349705d) + "'", double1 == (-0.048841459179349705d));
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 1477896.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5223184878037187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47948744445313884d + "'", double1 == 0.47948744445313884d);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7895608642289974d, 0.7861862102264855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8304738932761382d + "'", double2 == 0.8304738932761382d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double1 = org.apache.commons.math.util.FastMath.log1p(57.29347069670921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0654900921739d + "'", double1 == 4.0654900921739d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1479579986039938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9822255582717379d + "'", double1 == 0.9822255582717379d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1574173240260226d + "'", double1 == 1.1574173240260226d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8995489723601522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9561988290282105d + "'", double1 == 0.9561988290282105d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8025482319007339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9293023757676241d + "'", double1 == 0.9293023757676241d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.31153476727509205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3222442443718263d + "'", double1 == 0.3222442443718263d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6061093801777692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9196364215772618d + "'", double1 == 0.9196364215772618d);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double2 = org.apache.commons.math.util.FastMath.max(0.28738952988751526d, 0.19692511252438968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28738952988751526d + "'", double2 == 0.28738952988751526d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000000000000007d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.105427357601003E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601003E-15d + "'", double1 == 7.105427357601003E-15d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double2 = org.apache.commons.math.util.FastMath.max(31.0d, (-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.0d + "'", double2 == 31.0d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7560632008621517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6979906844392165d + "'", double1 == 0.6979906844392165d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.276858964458209d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.267396586565031d, 0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.475425814853955d + "'", double2 == 3.475425814853955d);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.41592402552475427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.115167303285961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6024918597475375d + "'", double1 == 1.6024918597475375d);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.9815145531741134d, (-0.8884066601218983d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.790332872804115d + "'", double2 == 1.790332872804115d);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.26062568111729484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25495403243969855d + "'", double1 == 0.25495403243969855d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5430806348152437d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.40429714988426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.46029987061848d + "'", double1 == 80.46029987061848d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-59.10786673843407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-59.0d) + "'", double1 == (-59.0d));
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9016684086532855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40589190094865796d + "'", double1 == 0.40589190094865796d);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.93006726156716E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.381867984729549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1138383968617465d + "'", double1 == 1.1138383968617465d);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5799018512655504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.702331196945153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0076108850910483d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6979906844392165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8354583678671347d + "'", double1 == 0.8354583678671347d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.41671114415975286d, 4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024263246105009198d + "'", double2 == 0.024263246105009198d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8195908673690073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6865729626547228d + "'", double1 == 0.6865729626547228d);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double2 = org.apache.commons.math.util.FastMath.atan2(235.781718468518d, 5557.690612768986d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04239898039779179d + "'", double2 == 0.04239898039779179d);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.2052372928768276d), 34.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2052372928768276d) + "'", double2 == (-1.2052372928768276d));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.615724430838339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9587436407861396d + "'", double1 == 1.9587436407861396d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.007812579475042568d, 0.5403023058681384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014458637267179124d + "'", double2 == 0.014458637267179124d);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6630829213736404d, 0.7010979104724595d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7575388410152742d + "'", double2 == 0.7575388410152742d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double1 = org.apache.commons.math.util.FastMath.sinh(23.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.872401723124452E9d + "'", double1 == 4.872401723124452E9d);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9975865056243414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9987925238127994d + "'", double1 == 0.9987925238127994d);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1129787402495097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04648686866489089d + "'", double1 == 0.04648686866489089d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math.util.FastMath.log(8.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0794415416798357d + "'", double1 == 2.0794415416798357d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double1 = org.apache.commons.math.util.FastMath.cos(13509.297354587858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9009058579506204d + "'", double1 == 0.9009058579506204d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.016609097373236268d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016610624899655847d) + "'", double1 == (-0.016610624899655847d));
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9867228626928289d + "'", double1 == 0.9867228626928289d);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4771212547196624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3043058189097385d + "'", double1 == 2.3043058189097385d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double1 = org.apache.commons.math.util.FastMath.rint(39.82204982013094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.0d + "'", double1 == 40.0d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        int int2 = org.apache.commons.math.util.FastMath.max(61, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7612180281375921d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533141373155001d + "'", double1 == 1.2533141373155001d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2924316695611777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9397458386915911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.033854951537027084d + "'", double1 == 0.033854951537027084d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7227249945840306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.599767027166628d + "'", double1 == 4.599767027166628d);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02563295851681163d) + "'", double1 == (-0.02563295851681163d));
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41306960089031847d) + "'", double1 == (-0.41306960089031847d));
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        int int2 = org.apache.commons.math.util.FastMath.max(36, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8452989082960941d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        int int1 = org.apache.commons.math.util.FastMath.round(28.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6297336780960754d + "'", double1 == 0.6297336780960754d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        double double1 = org.apache.commons.math.util.FastMath.sinh(52.45232219780884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0110925050025188E22d + "'", double1 == 3.0110925050025188E22d);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        int int2 = org.apache.commons.math.util.FastMath.max(28, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.7678470809183597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0037786218504155065d, 0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003778621850415507d + "'", double2 == 0.003778621850415507d);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double2 = org.apache.commons.math.util.FastMath.min(0.761594155751147d, 0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4344205208065718d + "'", double2 == 0.4344205208065718d);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.18061693582446d + "'", double1 == 21.18061693582446d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.013780436725687925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013875824602429277d + "'", double1 == 0.013875824602429277d);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2063L, 2.645154496685698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.852784546951458E8d + "'", double2 == 5.852784546951458E8d);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8572314663028362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.95242234695147d + "'", double1 == 0.95242234695147d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double1 = org.apache.commons.math.util.FastMath.tanh(34.99999999540764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.307560258420629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.162197055786747E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.2557610379370634d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30985002355293195d + "'", double1 == 0.30985002355293195d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7052062927726025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double1 = org.apache.commons.math.util.FastMath.sin(30.772666314109507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5998072729900116d) + "'", double1 == (-0.5998072729900116d));
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double1 = org.apache.commons.math.util.FastMath.atan(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430593066703113d + "'", double1 == 1.5430593066703113d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5448995862811551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8551793427577394d + "'", double1 == 0.8551793427577394d);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7215087615242686d, 0.8245835710368516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7215087615242686d + "'", double2 == 0.7215087615242686d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8741924549777425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5070260619707063d + "'", double1 == 0.5070260619707063d);
    }
}

