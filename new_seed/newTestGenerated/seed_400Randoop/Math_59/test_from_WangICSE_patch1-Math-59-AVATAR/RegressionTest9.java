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
        double double2 = org.apache.commons.math.util.FastMath.min(1.7219410057229039d, 0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27629111752846225d + "'", double2 == 0.27629111752846225d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 13);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0911052960943115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4615050993047794d + "'", double1 == 0.4615050993047794d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(38.862916798421296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2226.6811121176097d + "'", double1 == 2226.6811121176097d);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6562860065218095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8690225542171961d + "'", double1 == 0.8690225542171961d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2290625248799195d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double2 = org.apache.commons.math.util.FastMath.max(0.978364500953377d, 1.5571330292496455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5571330292496455d + "'", double2 == 1.5571330292496455d);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        long long1 = org.apache.commons.math.util.FastMath.round(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math.util.FastMath.log(0.32349849299466304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.128560823492023d) + "'", double1 == (-1.128560823492023d));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5108256237659906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5361448966820073d) + "'", double1 == (-0.5361448966820073d));
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        double double1 = org.apache.commons.math.util.FastMath.expm1(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.772063284881507E45d + "'", double1 == 3.772063284881507E45d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.27746265011900656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.25096172890041585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6307672929645823d) + "'", double1 == (-0.6307672929645823d));
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.450294699102237E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.079986106087252E-5d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.079986106087253E-5d + "'", double2 == 9.079986106087253E-5d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double1 = org.apache.commons.math.util.FastMath.log10(77.9699955054746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8919275091860766d + "'", double1 == 1.8919275091860766d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7372146681639586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7372146681639586d + "'", double1 == 0.7372146681639586d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8265969029962065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4626307887385793d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0517566775810385d + "'", double1 == 2.0517566775810385d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1189396031849523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6941159641785049d + "'", double1 == 1.6941159641785049d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4844603454294543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85.05331264764003d + "'", double1 == 85.05331264764003d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6303775321964172d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7420423771974395d) + "'", double1 == (-0.7420423771974395d));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 13);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.167375502789719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4511825231905657d + "'", double1 == 1.4511825231905657d);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.728323488481854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7462913692181242d + "'", double1 == 0.7462913692181242d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.062052529727388075d + "'", double1 == 0.062052529727388075d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18345697474330172d + "'", double1 == 0.18345697474330172d);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341003d + "'", double1 == 1.6094379124341003d);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9379924444723454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.661652614839894d + "'", double1 == 0.661652614839894d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.01794144829647875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01794144829647875d + "'", double1 == 0.01794144829647875d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.010308182854118622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308547980779962d + "'", double1 == 0.010308547980779962d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        double double1 = org.apache.commons.math.util.FastMath.abs(76.75804819986975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.75804819986975d + "'", double1 == 76.75804819986975d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4511825231905657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16172203947373598d + "'", double1 == 0.16172203947373598d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.9318256327243257d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.45188139334621774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9234637104758648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6541275766302981d + "'", double1 == 0.6541275766302981d);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5293379817722998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.415899791088396d + "'", double1 == 2.415899791088396d);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7321095807146255d, (-18.71497387511852d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1024936689230778d + "'", double2 == 3.1024936689230778d);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.40517925701617413d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double1 = org.apache.commons.math.util.FastMath.tanh(30.95704158868318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double1 = org.apache.commons.math.util.FastMath.log(2.144718287100234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7630082090696197d + "'", double1 == 0.7630082090696197d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2005.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.60339933974067d + "'", double1 == 7.60339933974067d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math.util.FastMath.cos(526.8331299048269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5780691499402505d + "'", double1 == 0.5780691499402505d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.15481538423886812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5369551824260808d + "'", double1 == 0.5369551824260808d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.544406443719329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1598987305185837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.859294024659841d + "'", double1 == 0.859294024659841d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.485329946666348d, 1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8407336306735491d + "'", double2 == 1.8407336306735491d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.06571071737855876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06580554056218163d) + "'", double1 == (-0.06580554056218163d));
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8082960603483018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000000041223074d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.13355056135114907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1339479113291493d + "'", double1 == 0.1339479113291493d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.866258807710104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.652900463031381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.39593320820718014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6292322371010406d + "'", double1 == 0.6292322371010406d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2973397658232583E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2973397658596506E-5d + "'", double1 == 1.2973397658596506E-5d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.021982458226793896d), 0.02017149514354095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02017149514354095d + "'", double2 == 0.02017149514354095d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3042395695680862d, (double) 8L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.038011628146107666d + "'", double2 == 0.038011628146107666d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.01745240643728351d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.9002193888246004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.238609999152241d + "'", double1 == 1.238609999152241d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1906899454435431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7523557927644398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.851630931467367d + "'", double1 == 0.851630931467367d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9717769481908543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02862897802551553d) + "'", double1 == (-0.02862897802551553d));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math.util.FastMath.log(0.017533279424944842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.043654522534227d) + "'", double1 == (-4.043654522534227d));
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0899577325456637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.974148360226309d + "'", double1 == 2.974148360226309d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.009088214590764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003020273627107d + "'", double1 == 1.003020273627107d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.383182435886996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 136.54629538603177d + "'", double1 == 136.54629538603177d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8506908681373769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07022822916621943d) + "'", double1 == (-0.07022822916621943d));
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.25096172890041585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double2 = org.apache.commons.math.util.FastMath.atan2(18936.71296522655d, (-0.8454210262244998d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708409713447304d + "'", double2 == 1.5708409713447304d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double1 = org.apache.commons.math.util.FastMath.ulp(56.4814618818951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6745085168424229d, 1.4585955050518922E86d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4585955050518922E86d + "'", double2 == 1.4585955050518922E86d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.1544346897358424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.253522696032608d + "'", double1 == 4.253522696032608d);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.325835187949904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.166463332052284d + "'", double1 == 5.166463332052284d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.718281828459045d, 0.32349849299466304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7182818284590446d + "'", double2 == 2.7182818284590446d);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424779445183978E-4d) + "'", double1 == (-1.5424779445183978E-4d));
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5792.618751480198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.66451237559137d + "'", double1 == 8.66451237559137d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6576913458149567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6576913458149567d + "'", double1 == 0.6576913458149567d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1259023567118747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.097434105410637d + "'", double1 == 2.097434105410637d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        long long2 = org.apache.commons.math.util.FastMath.min(21L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21L + "'", long2 == 21L);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.374629511804778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1118901625713087d) + "'", double1 == (-1.1118901625713087d));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.035274726494074E-14d + "'", double1 == 4.035274726494074E-14d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        long long2 = org.apache.commons.math.util.FastMath.min(689081821154L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7084604840787458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.017533279424944842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.060134546374655E-4d + "'", double1 == 3.060134546374655E-4d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6931463954650435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999984298108128d + "'", double1 == 0.9999984298108128d);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double2 = org.apache.commons.math.util.FastMath.max(0.998078147430638d, 1.5438317534371178d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5438317534371178d + "'", double2 == 1.5438317534371178d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4260624389053682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.860919794144364d + "'", double1 == 6.860919794144364d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double1 = org.apache.commons.math.util.FastMath.floor(92.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.0d + "'", double1 == 92.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.459459785700431d, 20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1453889904491738E17d + "'", double2 == 3.1453889904491738E17d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        float float2 = org.apache.commons.math.util.FastMath.min(6559.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7869557758875051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6018150242418875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9208386184553307d) + "'", double1 == (-0.9208386184553307d));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double2 = org.apache.commons.math.util.FastMath.min(2.0418354108384595d, 128.11725781509188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0418354108384595d + "'", double2 == 2.0418354108384595d);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33333333333333337d + "'", double1 == 0.33333333333333337d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3025850929940461d, 0.24154560853011509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3025850929940461d + "'", double2 == 1.3025850929940461d);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.02037631460522075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02037631460522075d + "'", double1 == 0.02037631460522075d);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        float float2 = org.apache.commons.math.util.FastMath.max(48.0f, (float) 13L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.06214609673410903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0621061016647649d + "'", double1 == 0.0621061016647649d);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9221952083958849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7269342546799581d + "'", double1 == 0.7269342546799581d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.041446469648192756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.042317364742837864d + "'", double1 == 0.042317364742837864d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091341L, 138L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091341L + "'", long2 == 39481480091341L);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5707963267948968d, 0.7717278381943499d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7717278381943499d + "'", double2 == 0.7717278381943499d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8996379399296265d, 0.02037631460522075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8996379399296264d + "'", double2 == 0.8996379399296264d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 78962960182681L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.930313428991271d, 4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9303134289912713d + "'", double2 == 2.9303134289912713d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.860919794144364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8363823423457781d + "'", double1 == 0.8363823423457781d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9142246332006481d, (-0.22331704219228246d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0202287245984625d + "'", double2 == 1.0202287245984625d);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8302490352228528d) + "'", double1 == (-0.8302490352228528d));
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6632456843634444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8720836498654725d + "'", double1 == 0.8720836498654725d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double2 = org.apache.commons.math.util.FastMath.min(0.33144561670275613d, 1.167375502789719d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33144561670275613d + "'", double2 == 0.33144561670275613d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2973397658596506E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2973397658232583E-5d + "'", double1 == 1.2973397658232583E-5d);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.718989392409238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0523580336179443d + "'", double1 == 1.0523580336179443d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.716003343634799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029949908321658922d + "'", double1 == 0.029949908321658922d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.028730419947965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1128.596856190806d + "'", double1 == 1128.596856190806d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        int int1 = org.apache.commons.math.util.FastMath.round(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6340499054521955d, 2453.035678413897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6340499054521955d + "'", double2 == 0.6340499054521955d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3376337436860346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1263372159201503d + "'", double1 == 0.1263372159201503d);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.22517783153706364d), (-0.7123889803846899d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8193243886355482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2689663801081434d + "'", double1 == 1.2689663801081434d);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.799542231457883d, (-0.04524305768215654d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9544922709393602d + "'", double2 == 0.9544922709393602d);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double2 = org.apache.commons.math.util.FastMath.max(8.095576025053138d, 0.5856586910882368d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.095576025053138d + "'", double2 == 8.095576025053138d);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 35.0f, 0.01794144829647875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570283714031326d + "'", double2 == 1.570283714031326d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0079835661910628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.187558063188375d + "'", double1 == 1.187558063188375d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7071067811865476d + "'", double1 == 0.7071067811865476d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        int int1 = org.apache.commons.math.util.FastMath.round(48.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0517566775810385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4323954333845939d + "'", double1 == 1.4323954333845939d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0928900516588147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.092890051658815d + "'", double1 == 1.092890051658815d);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.75d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7316888688738209d + "'", double1 == 0.7316888688738209d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7869557758875051d, 1.0038696050023177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6648602977348568d + "'", double2 == 0.6648602977348568d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double2 = org.apache.commons.math.util.FastMath.max(0.999999999733659d, 0.9165965529836673d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999999733659d + "'", double2 == 0.999999999733659d);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.22906366042640255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3781636423089612E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.042966354410623006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35024840708547117d + "'", double1 == 0.35024840708547117d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2634178653612851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2603820347123027d + "'", double1 == 0.2603820347123027d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.04742516418921198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3815006871452328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0736582926862177d + "'", double1 == 1.0736582926862177d);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.39707373807201474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9221965889218102d + "'", double1 == 0.9221965889218102d);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.702048418162471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.308886292985948d + "'", double1 == 1.308886292985948d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.485329946666348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17182293722218117d + "'", double1 == 0.17182293722218117d);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.1494732094266326d), 4.539242869750105E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5677595090714231d) + "'", double2 == (-1.5677595090714231d));
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5563025007672873d + "'", double1 == 1.5563025007672873d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.704478375596432d + "'", double1 == 2.704478375596432d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515096203d + "'", double1 == 1.1624473515096203d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7062823395533953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.76277671411759d + "'", double1 == 97.76277671411759d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3728048593649236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.451801006818307d + "'", double1 == 1.451801006818307d);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int int2 = org.apache.commons.math.util.FastMath.min(48, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9960122203732344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9823029524291397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.28181337742978d + "'", double1 == 56.28181337742978d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.267884728309446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.23107092469448914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23317825265159667d) + "'", double1 == (-0.23317825265159667d));
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.04144646964819275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3825124561295252d) + "'", double1 == (-1.3825124561295252d));
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double1 = org.apache.commons.math.util.FastMath.cos(1128.596856190806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7213175660100344d) + "'", double1 == (-0.7213175660100344d));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7816340724367478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013642088109793105d) + "'", double1 == (-0.013642088109793105d));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091341L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091341L + "'", long1 == 39481480091341L);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9202613644617779d), 0.9538957088157914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9202613644617779d) + "'", double2 == (-0.9202613644617779d));
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17979457111788427d) + "'", double1 == (-0.17979457111788427d));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.16146084948443995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.85089984398085d + "'", double1 == 0.85089984398085d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5177811015637935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6782995388565882d + "'", double1 == 1.6782995388565882d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double2 = org.apache.commons.math.util.FastMath.min(0.40589920499183396d, 7.046745412134694E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40589920499183396d + "'", double2 == 0.40589920499183396d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.713130608547954d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5607088415259998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.762195691083632d + "'", double1 == 3.762195691083632d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1088821403655396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8952010569859762d + "'", double1 == 0.8952010569859762d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.14027452341391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.14027452341391E-6d + "'", double1 == 3.14027452341391E-6d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int int2 = org.apache.commons.math.util.FastMath.min(13, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5586330769741252d) + "'", double1 == (-0.5586330769741252d));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.07496085456049556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07496085456049556d + "'", double1 == 0.07496085456049556d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0418354108384595d, 1.630949191594277d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8968081308039324d + "'", double2 == 0.8968081308039324d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4723407343250855d, 2.2944381644478575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20302699008167405d + "'", double2 == 0.20302699008167405d);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.44699510894891675d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7645999354632541d) + "'", double1 == (-0.7645999354632541d));
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6778717693998078d, 0.7630082090696197d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6778717693998079d + "'", double2 == 0.6778717693998079d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0049514518537068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.004951451853707d + "'", double1 == 1.004951451853707d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.7281588344338537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4387198049856621d) + "'", double1 == (-0.4387198049856621d));
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9L, 2005.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.665374127698126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6362835124898862d + "'", double1 == 1.6362835124898862d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.7816340724367478d), 1.8086089434116457d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6144289961559061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8171027592644233d + "'", double1 == 0.8171027592644233d);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1074946319245942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8031749989302421d + "'", double1 == 0.8031749989302421d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1063634786066832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10107849161054686d + "'", double1 == 0.10107849161054686d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.596172423257359E84d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.596172423257359E84d + "'", double1 == 5.596172423257359E84d);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4937744707606272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-3.6030305945752334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-206.43844652567248d) + "'", double1 == (-206.43844652567248d));
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        float float2 = org.apache.commons.math.util.FastMath.max(13.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1674689322429517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06724533229170335d + "'", double1 == 0.06724533229170335d);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0071451610978088d, 0.013506249250649143d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013506249250649143d + "'", double2 == 0.013506249250649143d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.17182293722218117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.757983587242636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9989119456406313d + "'", double1 == 0.9989119456406313d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2705251993740962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8200111700955113d + "'", double1 == 0.8200111700955113d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3678794411714424d, 0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36787944117144245d + "'", double2 == 0.36787944117144245d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42826253011881144d) + "'", double1 == (-0.42826253011881144d));
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        double double1 = org.apache.commons.math.util.FastMath.atanh(299669.7281315037d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9306695450583735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8020200379631092d + "'", double1 == 0.8020200379631092d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.419949789789507E-4d, (-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1398597617912154d + "'", double2 == 3.1398597617912154d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        long long2 = org.apache.commons.math.util.FastMath.max(7872L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7872L + "'", long2 == 7872L);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        double double1 = org.apache.commons.math.util.FastMath.atan((-38.816242111356935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5450396126018462d) + "'", double1 == (-1.5450396126018462d));
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.187558063188375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.605554840023869E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8115174400709695d) + "'", double1 == (-0.8115174400709695d));
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5092033284084692d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.509203328408469d + "'", double2 == 1.509203328408469d);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double2 = org.apache.commons.math.util.FastMath.max(4.615120516841261d, 0.978364500953377d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120516841261d + "'", double2 == 4.615120516841261d);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4640783251232936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.334890599636882d + "'", double1 == 9.334890599636882d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.13355056135114907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1428790501832544d + "'", double1 == 1.1428790501832544d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double2 = org.apache.commons.math.util.FastMath.min(0.14275056796999336d, 0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14275056796999336d + "'", double2 == 0.14275056796999336d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9960122203732344d), (-22.241446094972964d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9960122203732344d) + "'", double2 == (-0.9960122203732344d));
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.966092663504925d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9688145798019268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9688145798019269d + "'", double1 == 0.9688145798019269d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4731300494385142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025710969672768917d + "'", double1 == 0.025710969672768917d);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.11742496684289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.840797912233077d) + "'", double1 == (-0.840797912233077d));
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4319786974204731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.359057192324782d + "'", double1 == 0.359057192324782d);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.998078147430638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999448616881847d) + "'", double1 == (-0.999448616881847d));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5408665591104282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6006081631935432d + "'", double1 == 0.6006081631935432d);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.48885097713844194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008532059102657339d + "'", double1 == 0.008532059102657339d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        double double2 = org.apache.commons.math.util.FastMath.pow(38.8629167984213d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0613810862211954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8903600704689714d + "'", double1 == 2.8903600704689714d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        double double2 = org.apache.commons.math.util.FastMath.min(0.012025108203109165d, 1.7992447670407306E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7992447670407306E-4d + "'", double2 == 1.7992447670407306E-4d);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double2 = org.apache.commons.math.util.FastMath.max(0.027066513565235144d, 1.5702200276960678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5702200276960678d + "'", double2 == 1.5702200276960678d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.30360435125676755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3216115088844413E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.306647226228379E-13d + "'", double1 == 2.306647226228379E-13d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        long long2 = org.apache.commons.math.util.FastMath.max(48L, 7872L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7872L + "'", long2 == 7872L);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.443498367137542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6659567306796605d + "'", double1 == 0.6659567306796605d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5811141142770077d, 1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082317d + "'", double2 == 1.5607966601082317d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7326150325826912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.05593807141461213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.999999999999873d + "'", double1 == 4.999999999999873d);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6006081631935432d, 0.14191465995125369d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14191465995125369d + "'", double2 == 0.14191465995125369d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double1 = org.apache.commons.math.util.FastMath.asinh(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6204139929528845d + "'", double1 == 5.6204139929528845d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8265969029962065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9730337692042502d) + "'", double1 == (-0.9730337692042502d));
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-10.878896188075114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.878896188075112d) + "'", double1 == (-10.878896188075112d));
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.337337939299603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9702230771871827d + "'", double1 == 0.9702230771871827d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double1 = org.apache.commons.math.util.FastMath.log(2.2668439577566954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8183885371125537d + "'", double1 == 0.8183885371125537d);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1674689322429517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2138478686780076d + "'", double1 == 2.2138478686780076d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9970901348720806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.129056522300246d + "'", double1 == 57.129056522300246d);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3440585709083352E43d, 0.06214609673410902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.344058570908335E43d + "'", double2 == 1.344058570908335E43d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0278589874552748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.027858987455275d + "'", double1 == 1.027858987455275d);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        double double2 = org.apache.commons.math.util.FastMath.max(2.345632762712187d, 15.830314951333888d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.830314951333888d + "'", double2 == 15.830314951333888d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double1 = org.apache.commons.math.util.FastMath.acos(18.51629785054141d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        float float1 = org.apache.commons.math.util.FastMath.abs(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.021982458226793896d), 3.0000000000000004d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1361158038315415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0658873316779507d + "'", double1 == 1.0658873316779507d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.970856367774133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1307229674874573d + "'", double1 == 1.1307229674874573d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        double double1 = org.apache.commons.math.util.FastMath.log(1.568058636590814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4498383170139691d + "'", double1 == 0.4498383170139691d);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.3554432E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.021826694558577d + "'", double1 == 18.021826694558577d);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.764612681954403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8704401477824153d + "'", double1 == 0.8704401477824153d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1145715838129047d + "'", double1 == 1.1145715838129047d);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        long long1 = org.apache.commons.math.util.FastMath.round(3.2296263093844666d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.02717745857346494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02717411308730122d + "'", double1 == 0.02717411308730122d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5506433159893342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5586330769741252d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1423973302809369d + "'", double1 == 0.1423973302809369d);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1752012000048544d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1752012000048542d + "'", double2 == 1.1752012000048542d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9231784609934364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39725437476826614d + "'", double1 == 0.39725437476826614d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double2 = org.apache.commons.math.util.FastMath.min(3.239582291948687d, 5.6985241514062685E262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.239582291948687d + "'", double2 == 3.239582291948687d);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7316888688738209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.279841951811275d + "'", double1 == 1.279841951811275d);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8407336306735491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2884160242990499d, 2.038399603650754E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2884160242990499d + "'", double2 == 0.2884160242990499d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02717745857346494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027180805295673138d + "'", double1 == 0.027180805295673138d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-1.0f), 0.3453962389097756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9180983857629266d + "'", double1 == 0.9180983857629266d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.6880974875514901d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6026929539651039d) + "'", double1 == (-0.6026929539651039d));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6745085168424229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8769923652551843d + "'", double1 == 0.8769923652551843d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        double double1 = org.apache.commons.math.util.FastMath.log(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.513709247839705d + "'", double1 == 7.513709247839705d);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.357415841954476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999881038089d + "'", double1 == 0.9999999881038089d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3216115088844413E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3216115088757081E-11d + "'", double1 == 1.3216115088757081E-11d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2623230294954737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9527981936894913d + "'", double1 == 0.9527981936894913d);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        long long2 = org.apache.commons.math.util.FastMath.min(9L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.443498367137542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1112981767904855d + "'", double1 == 1.1112981767904855d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.09861228866811d + "'", double1 == 1.09861228866811d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8788470742801933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6306583303604348d + "'", double1 == 0.6306583303604348d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double1 = org.apache.commons.math.util.FastMath.tan(795.0145481146601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1939865394334408d + "'", double1 == 0.1939865394334408d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.998078147430638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9980781474306382d + "'", double1 == 0.9980781474306382d);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.30685281944005d + "'", double1 == 99.30685281944005d);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.675896985065022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.346431770829404d + "'", double1 == 1.346431770829404d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43149438362640363d + "'", double1 == 0.43149438362640363d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        double double1 = org.apache.commons.math.util.FastMath.log(0.019526698037128812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9359726197072855d) + "'", double1 == (-3.9359726197072855d));
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7357191005950772d, 1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7357191005950771d + "'", double2 == 0.7357191005950771d);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5092033284084692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.21507542101404d + "'", double1 == 16.21507542101404d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3453962389097756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3388731471685563d + "'", double1 == 0.3388731471685563d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.338726674323305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4031597732005529d + "'", double1 == 0.4031597732005529d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5408665591104282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5148790537933274d + "'", double1 == 0.5148790537933274d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3705561619927477d + "'", double1 == 0.3705561619927477d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        double double1 = org.apache.commons.math.util.FastMath.expm1(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0278589874552748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.795075132980568d + "'", double1 == 2.795075132980568d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1905871603838296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6079856442870905d + "'", double1 == 0.6079856442870905d);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3396806684922336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8025238656068191d + "'", double1 == 0.8025238656068191d);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2739L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2739 + "'", int1 == 2739);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.08760630539897361d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.419949789789507E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.417198367988675E-4d + "'", double1 == 7.417198367988675E-4d);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8548425446316326d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3881771663389437d + "'", double1 == 1.3881771663389437d);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double1 = org.apache.commons.math.util.FastMath.sin(794.3624897466268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4443527293734063d + "'", double1 == 0.4443527293734063d);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 51L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 48, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48L + "'", long2 == 48L);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, 13.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0811447892938331E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8869536263957728E-6d + "'", double1 == 1.8869536263957728E-6d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.739146853975915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7584073102891926d + "'", double1 == 2.7584073102891926d);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999984298108128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615934965158062d + "'", double1 == 0.7615934965158062d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1958111284153483d, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007529576510892934d + "'", double2 == 0.007529576510892934d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6079856442870905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6079856442870906d + "'", double1 == 0.6079856442870906d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.2296263093844666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0049514518537068d, 1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.005455428395243d + "'", double2 == 1.005455428395243d);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1932800507380157d, 1.0958239871017827d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8279463591541083d + "'", double2 == 0.8279463591541083d);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.01794144829647875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01794337375926178d + "'", double1 == 0.01794337375926178d);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9730337692042502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8621764626146363d) + "'", double1 == (-0.8621764626146363d));
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6079856442870906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8208003129928877d + "'", double1 == 0.8208003129928877d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) 2739);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2739L + "'", long2 == 2739L);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5785098535614418d, 0.01030873056448192d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01030873056448192d + "'", double2 == 0.01030873056448192d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double1 = org.apache.commons.math.util.FastMath.acos(21.445599564021325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.23527328223197624d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.62466259314447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7209715252803081d + "'", double1 == 0.7209715252803081d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5111502441944042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4708409288505783d + "'", double1 == 0.4708409288505783d);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078965d + "'", double1 == 0.8414709848078965d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 51);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.134280534824291d + "'", double1 == 1.134280534824291d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8115174400709695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6817244223382299d) + "'", double1 == (-0.6817244223382299d));
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5934873005853873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2623340685354996d + "'", double1 == 1.2623340685354996d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9322410534856177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01627067580558459d) + "'", double1 == (-0.01627067580558459d));
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.758078531386372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030684258881318663d) + "'", double1 == (-0.030684258881318663d));
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0358050874256768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8029840298005738d + "'", double1 == 0.8029840298005738d);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        double double2 = org.apache.commons.math.util.FastMath.min(19.781104616480253d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.7131306085479543d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7715216602443775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.336526259515547d + "'", double1 == 1.336526259515547d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7400532113272699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8331494738632393d + "'", double1 == 0.8331494738632393d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7849272209484637d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double1 = org.apache.commons.math.util.FastMath.asin(2454.0356784138958d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.513709247839705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999994047424171d + "'", double1 == 0.9999994047424171d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8262159668530399d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        int int2 = org.apache.commons.math.util.FastMath.max(48, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.451801006818307d, 0.012097700501686678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5624636279974324d + "'", double2 == 1.5624636279974324d);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7869557758875051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.196698993141692d + "'", double1 == 1.196698993141692d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.12209950109463034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12240493707646952d + "'", double1 == 0.12240493707646952d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.027241040673019475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027247780965780947d + "'", double1 == 0.027247780965780947d);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9896517787489434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01040213636547643d) + "'", double1 == (-0.01040213636547643d));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.07496085456049556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.294940595010385d) + "'", double1 == (-4.294940595010385d));
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1719235979111335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1736377574871662d + "'", double1 == 0.1736377574871662d);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.739146853975915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16755642436808318d) + "'", double1 == (-0.16755642436808318d));
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.1295108078425922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.008398253529292d + "'", double1 == 1.008398253529292d);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1304934675488664d + "'", double1 == 0.1304934675488664d);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.005455428395243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7638757934705693d + "'", double1 == 0.7638757934705693d);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7992447670407306E-4d, (-0.9454760404994205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3473.14123414212d + "'", double2 == 3473.14123414212d);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.20472119276137932d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22906252487991943d) + "'", double1 == (-0.22906252487991943d));
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2884160242990499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2845600963063681d + "'", double1 == 0.2845600963063681d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.605554840023869E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.24416936194356d + "'", double1 == 70.24416936194356d);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.45961320728596883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4297689122403663d + "'", double1 == 0.4297689122403663d);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8830864942993886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3896165340101005d + "'", double1 == 1.3896165340101005d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.03538849883217154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5354004373570103d + "'", double1 == 1.5354004373570103d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.66451237559137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double2 = org.apache.commons.math.util.FastMath.max(0.610564700497503d, 0.6340499054521955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6340499054521955d + "'", double2 == 0.6340499054521955d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8358515696195364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2072463208408322d + "'", double1 == 1.2072463208408322d);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math.util.FastMath.asin(59.76184719737747d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2739L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1272994544561892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1272994544561892d + "'", double1 == 1.1272994544561892d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        float float2 = org.apache.commons.math.util.FastMath.max(51.0f, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double2 = org.apache.commons.math.util.FastMath.max(18.87267627911232d, 0.7561726915035568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.87267627911232d + "'", double2 == 18.87267627911232d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2671.5132386145165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.583547562472901d + "'", double1 == 8.583547562472901d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1763382298382675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.393531189495465d + "'", double1 == 1.393531189495465d);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7373603731804845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8291543123170407d + "'", double1 == 0.8291543123170407d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1124045972580494d, 0.020483828884450862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0021844012343644d + "'", double2 == 1.0021844012343644d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.3831824358869964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        int int1 = org.apache.commons.math.util.FastMath.abs(48);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(136.54629538603177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.149439664879342d + "'", double1 == 5.149439664879342d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5108256237659906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6000000000000001d + "'", double1 == 0.6000000000000001d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.7070340408585634d, (-0.01040213636547643d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.574638940153364d + "'", double2 == 1.574638940153364d);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2739, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7584073102891926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.223004554472192d + "'", double1 == 1.223004554472192d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.75228229788744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.10260067135368d + "'", double1 == 43.10260067135368d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.357415841954476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.706142388099178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0261600244039246d + "'", double1 == 2.0261600244039246d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double1 = org.apache.commons.math.util.FastMath.expm1(57.577493508324686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.012949308932035E25d + "'", double1 == 1.012949308932035E25d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 2739.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2739.0f + "'", float2 == 2739.0f);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.06561630304380342d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4033393424100513d) + "'", double1 == (-0.4033393424100513d));
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9298471527633106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8015285542481075d + "'", double1 == 0.8015285542481075d);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.22331704219228246d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9423260789913604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.229513485786148d + "'", double1 == 1.229513485786148d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        long long2 = org.apache.commons.math.util.FastMath.min(3280L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.4920792588618803E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.992072975089487E-9d + "'", double1 == 4.992072975089487E-9d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6017821704857126d, (-1.2005577706253316d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8399068767672204d + "'", double2 == 1.8399068767672204d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4940244355251187d + "'", double1 == 1.4940244355251187d);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9144143970315091d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7407220192091893d + "'", double2 == 0.7407220192091893d);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        float float1 = org.apache.commons.math.util.FastMath.abs(36.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 3280L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3280L + "'", long2 == 3280L);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) 48);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48L + "'", long2 == 48L);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9688145798019268d, 1.3759428780910867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9688145798019268d + "'", double2 == 0.9688145798019268d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-34.62065524210653d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5063656411097466d), 0.3111149807940147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0198501856620485d) + "'", double2 == (-1.0198501856620485d));
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.41934812792152054d, 0.7689468296853795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.499269126284287d + "'", double2 == 0.499269126284287d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.12329359244987054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3511318733038494d + "'", double1 == 0.3511318733038494d);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2603820347123027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5843889836002637d) + "'", double1 == (-0.5843889836002637d));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.44523769810820424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double1 = org.apache.commons.math.util.FastMath.log(0.757421577635591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27783527483180026d) + "'", double1 == (-0.27783527483180026d));
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6931463954650435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7692394030089755d + "'", double1 == 0.7692394030089755d);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.06975687732553194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5009827521482064d + "'", double1 == 1.5009827521482064d);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double1 = org.apache.commons.math.util.FastMath.cosh(18.021826694558577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3554431999999966E7d + "'", double1 == 3.3554431999999966E7d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7992447670407303E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091341L, 2005L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8621764626146363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17182293722218117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4145153039661879d + "'", double1 == 0.4145153039661879d);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.415899791088396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.09861228866811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01917440164012891d + "'", double1 == 0.01917440164012891d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4057245130309275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5003891578566944d + "'", double1 == 0.5003891578566944d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double1 = org.apache.commons.math.util.FastMath.asin(12.609701103711254d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6558.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 13L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.079986118564083E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        int int1 = org.apache.commons.math.util.FastMath.abs(2739);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2739 + "'", int1 == 2739);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7618861378765684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.6528601698497d + "'", double1 == 43.6528601698497d);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.268356063861754E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.24395830743395697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3243509267782625d + "'", double1 == 1.3243509267782625d);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7456282765000656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8166645746236464d + "'", double1 == 0.8166645746236464d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7189893924092379d, (-0.8302490352228528d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7189893924092378d + "'", double2 == 0.7189893924092378d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5209620005493156d, 0.6648602977348568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6648602977348568d + "'", double2 == 0.6648602977348568d);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5567229026732161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.74325165022966d + "'", double1 == 4.74325165022966d);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8797429772373989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5851104659669798d) + "'", double1 == (-0.5851104659669798d));
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6483608274590866d, 0.5473651378551417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.788851143097469d + "'", double2 == 0.788851143097469d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.07022822916621943d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07011300117644312d) + "'", double1 == (-0.07011300117644312d));
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 2739.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5737618316160396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9176220725460068d + "'", double1 == 0.9176220725460068d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        double double1 = org.apache.commons.math.util.FastMath.floor((-10.992355853476756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.0d) + "'", double1 == (-11.0d));
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04746078367186166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04747860345348137d + "'", double1 == 0.04747860345348137d);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.079985974466559E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5707963215265406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274741984375d + "'", double1 == 1.0232274741984375d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7316113039382015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6680694712365226d + "'", double1 == 0.6680694712365226d);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.279841951811275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075334264523753d + "'", double1 == 0.9075334264523753d);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6508397703249049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.795575300319434d + "'", double1 == 0.795575300319434d);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2739L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2739.0f + "'", float1 == 2739.0f);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7638757934705693d, 0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7638757934705693d + "'", double2 == 0.7638757934705693d);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2923710782526353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2740910090504158d + "'", double1 == 1.2740910090504158d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.3554432E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.328679543800956d + "'", double1 == 17.328679543800956d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.0590011172720796d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0393768734000801d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.012957015132661d + "'", double1 == 1.012957015132661d);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0025497213454224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1905871603838296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7841696176577152d + "'", double1 == 0.7841696176577152d);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0014863595869859044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5693099666606165d + "'", double1 == 1.5693099666606165d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) 51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0000908039833682d, 0.15344430643143228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000139328187463d + "'", double2 == 1.0000139328187463d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.06571071737855876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06575809819992705d) + "'", double1 == (-0.06575809819992705d));
    }
}

