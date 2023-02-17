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
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.881784197001252E-16d, 1.0546274546035364d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001254E-16d + "'", double2 == 8.881784197001254E-16d);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.004608877478660571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0046089101124813904d + "'", double1 == 0.0046089101124813904d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.23513817840335524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23513817840335527d + "'", double1 == 0.23513817840335527d);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        double double2 = org.apache.commons.math.util.FastMath.min(21.45336887641879d, (-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4333079051049607d) + "'", double2 == (-0.4333079051049607d));
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2005);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2005.0f + "'", float1 == 2005.0f);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.893061714674763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4027064290749747d + "'", double1 == 1.4027064290749747d);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.290774892867231d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        double double1 = org.apache.commons.math.util.FastMath.asin(1833.464944418635d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.570668051033129d, 1.1491303139564657d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9391633295943148d + "'", double2 == 0.9391633295943148d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-323.3062153431158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4602546797556596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7403654500754642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7403654500754643d + "'", double1 == 0.7403654500754643d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        double double2 = org.apache.commons.math.util.FastMath.min(3.121131255272116d, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876839d + "'", double2 == 0.8623188722876839d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 37L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.41060979278765175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9939190592738272d + "'", double1 == 1.9939190592738272d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int int1 = org.apache.commons.math.util.FastMath.abs(51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.706873037043774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7603964251352016d + "'", double1 == 0.7603964251352016d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.207110122769961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 470.23277203381366d + "'", double1 == 470.23277203381366d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(89.42706130231652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.471874976475479d + "'", double1 == 4.471874976475479d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.34980999246079125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        double double2 = org.apache.commons.math.util.FastMath.max(1.373400766945016d, (-0.41060979278765175d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.373400766945016d + "'", double2 == 1.373400766945016d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3641021037370766d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2166539525524803d) + "'", double1 == (-0.2166539525524803d));
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7089878066060047d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        double double1 = org.apache.commons.math.util.FastMath.tanh(526.8331299048269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5242004660685926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.591471064445103d + "'", double1 == 3.591471064445103d);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7483443290970895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4127649780327654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.122078669996656d + "'", double1 == 1.122078669996656d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9131871133554458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7400532113272699d + "'", double1 == 0.7400532113272699d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6113119967914531d, 0.7615165085805535d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6113119967914532d + "'", double2 == 0.6113119967914532d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3081720045294924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.116664850797739d + "'", double1 == 0.116664850797739d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.8485804212570964d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.2166539525524803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3588470982042273d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.03921734824062372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007690987667845d + "'", double1 == 1.0007690987667845d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5877618172544402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.67627148761899d) + "'", double1 == (-33.67627148761899d));
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        double double1 = org.apache.commons.math.util.FastMath.atanh(70.09526929955547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24154560853011509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24390127082068516d + "'", double1 == 0.24390127082068516d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6783203845295841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7786277519370818d + "'", double1 == 0.7786277519370818d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34993634420390274d + "'", double1 == 0.34993634420390274d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5474370435735482d + "'", double1 == 0.5474370435735482d);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0000000041223074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.693147182621099d + "'", double1 == 0.693147182621099d);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1341338259903953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7580608622489934d + "'", double1 == 0.7580608622489934d);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        double double1 = org.apache.commons.math.util.FastMath.tan((-18.299999884790676d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6124945313217917d + "'", double1 == 0.6124945313217917d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5960035785549811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5960035785549811d + "'", double1 == 0.5960035785549811d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.954589770191003d) + "'", double1 == (-15.954589770191003d));
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.675894270215288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8215162026997922d + "'", double1 == 0.8215162026997922d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        double double1 = org.apache.commons.math.util.FastMath.rint(12.010147458377778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.030617546607945655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030158182390908228d + "'", double1 == 0.030158182390908228d);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8740480958578509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.406925951207619d + "'", double1 == 1.406925951207619d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1472859194620699d, 0.9030746578456205d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.161670418578225d + "'", double2 == 0.161670418578225d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.3091542734486868d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9773206322293115d + "'", double1 == 0.9773206322293115d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0020088234623122656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.210206070423941d) + "'", double1 == (-6.210206070423941d));
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        double double1 = org.apache.commons.math.util.FastMath.log(288.3206630503136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6640732741201365d + "'", double1 == 5.6640732741201365d);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        double double1 = org.apache.commons.math.util.FastMath.cos(13.067188648029997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8771900820709495d + "'", double1 == 0.8771900820709495d);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.644483341943227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6684472092677365d + "'", double1 == 1.6684472092677365d);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.40498456639956293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.14027452341391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1402745234035877E-6d + "'", double1 == 3.1402745234035877E-6d);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9234637104758648d, 0.2642899025042186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9791761149522404d + "'", double2 == 0.9791761149522404d);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 105L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.0d + "'", double1 == 105.0d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7609889586512912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8648361267541332d + "'", double1 == 0.8648361267541332d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.18148297420509218d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2982952388073998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3027386825521336d + "'", double1 == 0.3027386825521336d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5067775983634798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8770365420904747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3648534103948403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6040309680760088d + "'", double1 == 0.6040309680760088d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1932800507380157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4973278323358539d + "'", double1 == 1.4973278323358539d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999986859385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818248870557d + "'", double1 == 2.7182818248870557d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6696927901138922d, (-0.9349399089766403d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6696927901138922d + "'", double2 == 0.6696927901138922d);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5975274432265277d), (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1189414060601215d) + "'", double2 == (-0.1189414060601215d));
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.3185862410962617d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707963267946692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515095703d + "'", double1 == 1.1624473515095703d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5607088415259998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9998150716581506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5515643720383434d + "'", double1 == 1.5515643720383434d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8721824073781502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13675669417571504d) + "'", double1 == (-0.13675669417571504d));
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.29488975471104756d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999197990932152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999732656496859d + "'", double1 == 0.9999732656496859d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.3501232012518495d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.060581741340517d) + "'", double1 == (-20.060581741340517d));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int int1 = org.apache.commons.math.util.FastMath.round(51.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1361158038315415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05542260109486248d + "'", double1 == 0.05542260109486248d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3012989023072947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        double double2 = org.apache.commons.math.util.FastMath.atan2(199.0d, 5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5443307250557672d + "'", double2 == 1.5443307250557672d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        double double2 = org.apache.commons.math.util.FastMath.max(1.373400766945016d, 57.28518781699162d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.28518781699162d + "'", double2 == 57.28518781699162d);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9939190592738272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6040496347932036d + "'", double1 == 3.6040496347932036d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.29488975471104756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.043795983292628d + "'", double1 == 1.043795983292628d);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(22.24871540768837d, 4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.248715407688366d + "'", double2 == 22.248715407688366d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6894198109289533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6360896066027169d + "'", double1 == 0.6360896066027169d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6113119967914531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47704875198110924d + "'", double1 == 0.47704875198110924d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.34770688124939175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34770688124939175d + "'", double1 == 0.34770688124939175d);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5515643720383434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.990383726224344d + "'", double1 == 51.990383726224344d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        long long2 = org.apache.commons.math.util.FastMath.min(37L, 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37L + "'", long2 == 37L);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0000000000002274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000757d + "'", double1 == 1.0000000000000757d);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.45358995168228144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4535899516822815d + "'", double1 == 0.4535899516822815d);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 3280);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.16601303451652813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5719165983462795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02743512020789183d + "'", double1 == 0.02743512020789183d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9976952979536658d), 0.7922638897815387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7922638897815387d + "'", double2 == 0.7922638897815387d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4535899516822815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.487490415099576d + "'", double1 == 0.487490415099576d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.7353126200110887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.31419995203572465d), 0.2708164357864931d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.974424233965079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6802768287445087d + "'", double1 == 0.6802768287445087d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        double double2 = org.apache.commons.math.util.FastMath.min(45.603769410297964d, (-0.877060243390276d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.877060243390276d) + "'", double2 == (-0.877060243390276d));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        double double1 = org.apache.commons.math.util.FastMath.log10(564.2988711233952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.751509181467329d + "'", double1 == 2.751509181467329d);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        double double2 = org.apache.commons.math.util.FastMath.max(3.6597188392706284d, 0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6597188392706284d + "'", double2 == 3.6597188392706284d);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5872139151569291d + "'", double1 == 0.5872139151569291d);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        float float2 = org.apache.commons.math.util.FastMath.max(3280.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.493210561926633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4734562420520403d + "'", double1 == 0.4734562420520403d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int int1 = org.apache.commons.math.util.FastMath.abs(37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5540437953657898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5035448147047986d) + "'", double1 == (-0.5035448147047986d));
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        double double1 = org.apache.commons.math.util.FastMath.expm1(8.875921921551335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7156.542118998581d + "'", double1 == 7156.542118998581d);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) 2005);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3722988115580157d, (-2.4685219244217045d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3722988115580157d + "'", double2 == 1.3722988115580157d);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1833.4649444186343d, 3.475279369318095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1833.464944418634d + "'", double2 == 1833.464944418634d);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        float float2 = org.apache.commons.math.util.FastMath.min(36.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999535225788d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999535225789d + "'", double2 == 0.9999999535225789d);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1777006370537189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5073232748473712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2947152127744397d) + "'", double1 == (-0.2947152127744397d));
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        double double2 = org.apache.commons.math.util.FastMath.pow(328280.63500117435d, 19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.310462728666588E109d + "'", double2 == 1.310462728666588E109d);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1491303139564657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06036928144991057d + "'", double1 == 0.06036928144991057d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7317114834832753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9011144562406516d + "'", double1 == 0.9011144562406516d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        double double2 = org.apache.commons.math.util.FastMath.min(0.1719235979111335d, 1.4127649780327654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1719235979111335d + "'", double2 == 0.1719235979111335d);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.04747859541485403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04746075958226597d + "'", double1 == 0.04746075958226597d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.999848038217972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017450640286509708d + "'", double1 == 0.017450640286509708d);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 83L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.0d + "'", double1 == 83.0d);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590833d + "'", double1 == 2.7182818284590833d);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4651773501465964d, 0.7786277519370818d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4651773501465964d + "'", double2 == 0.4651773501465964d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        double double1 = org.apache.commons.math.util.FastMath.log10((-323.3062153431158d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1884117453587528d, 0.35824732390650105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5499324805615463d + "'", double2 == 0.5499324805615463d);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3280L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3280.0f + "'", float1 == 3280.0f);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5063788250893344d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3973259797855731d) + "'", double1 == (-0.3973259797855731d));
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0020112434070183d, 1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.6597188392706284d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999092042625951d, (-33.67627148761899d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999092042625951d + "'", double2 == 0.9999092042625951d);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7807183390706619d, (-0.029875845395236918d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.60904478795651d + "'", double2 == 1.60904478795651d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.406925951207619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.919244312085985d + "'", double1 == 1.919244312085985d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.28003064688945284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2729334447213535d + "'", double1 == 0.2729334447213535d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.1312066203280915d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6860864438010045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6860864438010046d + "'", double1 == 0.6860864438010046d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1113677062085956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44343604857384694d + "'", double1 == 0.44343604857384694d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.07270966677774479d, 2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024231811661011956d + "'", double2 == 0.024231811661011956d);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9525912254636142d, 0.43469360908676247d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9525912254636142d + "'", double2 == 0.9525912254636142d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.12952606822871066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.34980999246079125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41879794067495774d + "'", double1 == 0.41879794067495774d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.115026405460952d + "'", double1 == 1.115026405460952d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7384229611146216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6731224799838768d + "'", double1 == 0.6731224799838768d);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.315628919625611E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0587911840678754E-22d + "'", double1 == 1.0587911840678754E-22d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.773775678340353d + "'", double1 == 1.773775678340353d);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        double double1 = org.apache.commons.math.util.FastMath.cos(206762.68551422175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32953831721022764d) + "'", double1 == (-0.32953831721022764d));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.19486506597972084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17803326350989765d + "'", double1 == 0.17803326350989765d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.194992268641593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07736509549574183d + "'", double1 == 0.07736509549574183d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0609297062414165d, 1.1219529208307404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.757450107592721d + "'", double2 == 0.757450107592721d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1912543356541123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07600449429463453d + "'", double1 == 0.07600449429463453d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7580423413226773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.206914329201134d + "'", double1 == 1.206914329201134d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9233096377747994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9737537046498245d + "'", double1 == 0.9737537046498245d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.7182818284590446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523148d + "'", double1 == 1.7253825588523148d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        double double1 = org.apache.commons.math.util.FastMath.log(198.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293304824724492d + "'", double1 == 5.293304824724492d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 661.9876068032265d + "'", double1 == 661.9876068032265d);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.9588076367332303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.3948150358289d + "'", double1 == 52.3948150358289d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8429918589553218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.791759469228055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8036668909554542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424779567514729E-4d) + "'", double1 == (-1.5424779567514729E-4d));
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        double double1 = org.apache.commons.math.util.FastMath.log10(15.830314951333888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.199489555435047d + "'", double1 == 1.199489555435047d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5087348157117294d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8733614431664554d + "'", double1 == 0.8733614431664554d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-96.87824279114196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6908443102518884d) + "'", double1 == (-1.6908443102518884d));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5707963267948788d), 1.3669495678698107d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948788d) + "'", double2 == (-1.5707963267948788d));
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        double double1 = org.apache.commons.math.util.FastMath.log10(11602.806055674742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.064563032944344d + "'", double1 == 4.064563032944344d);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.745295347905096d + "'", double1 == 3.745295347905096d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.151795873695697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.600289570626579d + "'", double1 == 8.600289570626579d);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        double double2 = org.apache.commons.math.util.FastMath.min(1.413416950619977d, (-0.7937339868319561d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7937339868319561d) + "'", double2 == (-0.7937339868319561d));
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.23695510898143343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23923049735223084d + "'", double1 == 0.23923049735223084d);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1106811952307287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0364260890741943d + "'", double1 == 2.0364260890741943d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5239029773179922d + "'", double1 == 0.5239029773179922d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1074946319245942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1074946319245942d + "'", double1 == 1.1074946319245942d);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        float float1 = org.apache.commons.math.util.FastMath.abs(83.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 83.0f + "'", float1 == 83.0f);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1933463270565558d + "'", double1 == 0.1933463270565558d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1344439571520295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1344439571520295d + "'", double1 == 0.1344439571520295d);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5160141294778328d), 1.9785097773144031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2551261440342657d) + "'", double2 == (-0.2551261440342657d));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2005, 0.6826353005177082d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5704558603240033d + "'", double2 == 1.5704558603240033d);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.4796647197391239d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7827911832928298d) + "'", double1 == (-0.7827911832928298d));
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.44603181533298825d, (double) 36L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4460318153329883d + "'", double2 == 0.4460318153329883d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7858371377510551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7858371377510552d + "'", double1 == 0.7858371377510552d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int int2 = org.apache.commons.math.util.FastMath.min(51, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0011273202561264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5612761748756014d + "'", double1 == 1.5612761748756014d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2118662346608502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6399701756875782d + "'", double1 == 0.6399701756875782d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.7584601417043006E-4d, 0.9586654676184497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.528325605543861E-4d + "'", double2 == 6.528325605543861E-4d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.47420105633127485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8896578254184928d + "'", double1 == 0.8896578254184928d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9126365759632116d + "'", double1 == 0.9126365759632116d);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8896578254184928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11691835600380243d) + "'", double1 == (-0.11691835600380243d));
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7555996620388388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5628104863272747d + "'", double1 == 0.5628104863272747d);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.2539945895800114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7609889586512912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2982952388073998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.091058232511013d + "'", double1 == 17.091058232511013d);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.4696098011142062d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 1, (-3.6923537059133387d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6923537059133387d) + "'", double2 == (-3.6923537059133387d));
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9557606135662686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9557606135662686d + "'", double1 == 0.9557606135662686d);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.016380052907402187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016379320517716164d + "'", double1 == 0.016379320517716164d);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.09711515743188391d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6356818791600741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.561952222929018d + "'", double1 == 0.561952222929018d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.753263026440201d + "'", double1 == 0.753263026440201d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.564538235027751d), 1.5268171949666718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5645382350277508d) + "'", double2 == (-1.5645382350277508d));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.018549468453479d + "'", double1 == 2.018549468453479d);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.587340257E9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.280434632619868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27677332849140146d) + "'", double1 == (-0.27677332849140146d));
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        long long1 = org.apache.commons.math.util.FastMath.abs(37L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 37L + "'", long1 == 37L);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.13355056135114904d, (-0.9355520242262295d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9998000664264803d + "'", double2 == 2.9998000664264803d);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1610795826858162d + "'", double1 == 1.1610795826858162d);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        double double1 = org.apache.commons.math.util.FastMath.ceil(97.0051545022222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.0d + "'", double1 == 98.0d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.019464135019843936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998105797042748d + "'", double1 == 0.9998105797042748d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0986122886681098d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0986122886681096d + "'", double2 == 1.0986122886681096d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000000041223074d, 0.6017821704857126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000041223074d + "'", double2 == 1.0000000041223074d);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        double double1 = org.apache.commons.math.util.FastMath.exp(47.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.581312886190086E20d + "'", double1 == 2.581312886190086E20d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6433908135793367d, 6.17645900500726E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.17645900500726E-4d + "'", double2 == 6.17645900500726E-4d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        double double2 = org.apache.commons.math.util.FastMath.max(1227.4057772177239d, 1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1227.4057772177239d + "'", double2 == 1227.4057772177239d);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.38197629326263133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40237151655383085d + "'", double1 == 0.40237151655383085d);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6536436208636118d) + "'", double1 == (-0.6536436208636118d));
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6335140007329974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011056905170272574d + "'", double1 == 0.011056905170272574d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.766302783569967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6538535065465055d + "'", double1 == 0.6538535065465055d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6433908135793367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9720624921064078d + "'", double1 == 0.9720624921064078d);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7050189848914605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.39461231087824d + "'", double1 == 40.39461231087824d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5398933564353804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8577635057812734d + "'", double1 == 0.8577635057812734d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        double double1 = org.apache.commons.math.util.FastMath.tan(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8255205413933215d) + "'", double1 == (-0.8255205413933215d));
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.315628919625611E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6258839654146914E-8d + "'", double1 == 1.6258839654146914E-8d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.6151205168412615d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3678794411714424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4446678610097663d + "'", double1 == 1.4446678610097663d);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        double double2 = org.apache.commons.math.util.FastMath.min(2.494840085597921d, 0.8235811162606056d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8235811162606056d + "'", double2 == 0.8235811162606056d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        double double2 = org.apache.commons.math.util.FastMath.max(5.267831587699267d, (double) 6559.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6559.0d + "'", double2 == 6559.0d);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0078125d + "'", double1 == 0.0078125d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8559725029698935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014939538483361582d + "'", double1 == 0.014939538483361582d);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9997917751171265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998958821382987d + "'", double1 == 0.9998958821382987d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3788396218579066d, 1.406925951207619d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.406925951207619d + "'", double2 == 1.406925951207619d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.25096172890041585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-45.80155157257448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5707963267816805d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9997917751171265d, 57.295779276891516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9997917751171265d + "'", double2 == 0.9997917751171265d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7580608622489934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6995833984094717d + "'", double1 == 0.6995833984094717d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        double double1 = org.apache.commons.math.util.FastMath.asin(24.19638901669072d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3314955002296927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314955002296929d + "'", double1 == 1.3314955002296929d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1719235979111335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7646645087741661d) + "'", double1 == (-0.7646645087741661d));
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.05105018795236219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.052375708539775356d + "'", double1 == 0.052375708539775356d);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9030746578456205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.74236647977493d + "'", double1 == 51.74236647977493d);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 49, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.605170185988092d, 1.3967916312027995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.605170185988091d + "'", double2 == 4.605170185988091d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3280);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3280.0f + "'", float1 == 3280.0f);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6356818791600741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6356818791600742d + "'", double1 == 0.6356818791600742d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.5362067139382427d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7992447670407306E-4d, 0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8486007400083447d + "'", double2 == 0.8486007400083447d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.17950655952279498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3903114864067188d + "'", double1 == 1.3903114864067188d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.012097700501686678d, (-0.01745240643728351d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0800937412236662d + "'", double2 == 1.0800937412236662d);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.024913294410754107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15783945771179686d + "'", double1 == 0.15783945771179686d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.620387737964422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.99637676402958d + "'", double1 == 137.99637676402958d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5398933564353804d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785475501d + "'", double1 == 1.0232274785475501d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.135079852099922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8554013581256903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0263252183666915d + "'", double1 == 1.0263252183666915d);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        long long1 = org.apache.commons.math.util.FastMath.round(0.04540802173355351d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8101858850092454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7244153292787553d) + "'", double1 == (-0.7244153292787553d));
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9791146345645385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2756780870602893d + "'", double1 == 2.2756780870602893d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7615165085805535d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.1598639151884341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15919070276695985d) + "'", double1 == (-0.15919070276695985d));
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9952731515503573d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9952731515503572d) + "'", double2 == (-0.9952731515503572d));
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9730337692042502d), 5.097284778145676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9730337692042502d) + "'", double2 == (-0.9730337692042502d));
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.26241365373669573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0346284930294705d + "'", double1 == 1.0346284930294705d);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0611064769287215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 83L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9730337692042502d), 2.663310606035718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9730337692042502d) + "'", double2 == (-0.9730337692042502d));
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.082130173350885d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        double double2 = org.apache.commons.math.util.FastMath.min(4.064563032944344d, 0.974424233965079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.974424233965079d + "'", double2 == 0.974424233965079d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.390874944925892E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3908749359569132E-4d + "'", double1 == 1.3908749359569132E-4d);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3318317004563125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1002290708765434d + "'", double1 == 1.1002290708765434d);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int int1 = org.apache.commons.math.util.FastMath.abs(83);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        double double1 = org.apache.commons.math.util.FastMath.log(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9459101490553132d + "'", double1 == 1.9459101490553132d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2005, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.19031501614144256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.725178994914957d + "'", double1 == 0.725178994914957d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9683140799247235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6771773793540653d + "'", double1 == 0.6771773793540653d);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.510506427637088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8703261436731974d) + "'", double1 == (-0.8703261436731974d));
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.231690697458971d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5068676300960874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5068676300960875d + "'", double1 == 0.5068676300960875d);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7384229611146216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.303238500509594d) + "'", double1 == (-0.303238500509594d));
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.806059476593382E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7795156514337906d) + "'", double1 == (-1.7795156514337906d));
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0020173301013517594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00201733010135176d + "'", double1 == 0.00201733010135176d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        double double1 = org.apache.commons.math.util.FastMath.log(81.78552109133564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.404100224168282d + "'", double1 == 4.404100224168282d);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314536537354545E42d + "'", double1 == 1.3314536537354545E42d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.026006127044727836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02600319653175999d + "'", double1 == 0.02600319653175999d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        float float2 = org.apache.commons.math.util.FastMath.max(83.0f, (float) 105L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 105.0f + "'", float2 == 105.0f);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9355520242262295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0020112434070183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0020092235648066256d + "'", double1 == 0.0020092235648066256d);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-45.80155157257448d), 0.016251890378381414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-45.801551572574475d) + "'", double2 == (-45.801551572574475d));
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9202613644617779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3139760735500892d) + "'", double1 == (-1.3139760735500892d));
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544328376E-13d + "'", double1 == 2.2737367544328376E-13d);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.09221082649558883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09208020644278125d + "'", double1 == 0.09208020644278125d);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9092974268256817d + "'", double1 == 0.9092974268256817d);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7110135287323527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.036053812280867d + "'", double1 == 1.036053812280867d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.1734036004608d + "'", double1 == 10.1734036004608d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7037401198988091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1259469553800836d + "'", double1 == 1.1259469553800836d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        int int1 = org.apache.commons.math.util.FastMath.round(9.223372E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5258665137193053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852091021909104d + "'", double1 == 0.9852091021909104d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        double double1 = org.apache.commons.math.util.FastMath.log1p(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.006715348489118d + "'", double1 == 5.006715348489118d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7063058773712644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8905622325430438d + "'", double1 == 0.8905622325430438d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7400532113272699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2865677866520293d + "'", double1 == 1.2865677866520293d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5504171915615343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997923526102078d + "'", double1 == 0.9997923526102078d);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        long long2 = org.apache.commons.math.util.FastMath.max((-5L), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2080984037677835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003632002313892395d + "'", double1 == 0.003632002313892395d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.3831824358869964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.373543519361118d + "'", double1 == 5.373543519361118d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.3501232012518495d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3364848010221395d) + "'", double1 == (-0.3364848010221395d));
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.45961320728596883d, 1.122078669996656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41800148565597645d + "'", double2 == 0.41800148565597645d);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.10904522841698205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1088821403655396d, 0.8036668909554542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0866080067999329d + "'", double2 == 1.0866080067999329d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.22579135264471936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22970832805819363d + "'", double1 == 0.22970832805819363d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.6040496347932036d, 4.281623811241125E59d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.417483164520446E-60d + "'", double2 == 8.417483164520446E-60d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7182818284589487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.141916586172396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14144447837758223d + "'", double1 == 0.14144447837758223d);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.4597216805978954E218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.33510070059132296d) + "'", double1 == (-0.33510070059132296d));
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 37, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        double double2 = org.apache.commons.math.util.FastMath.min(0.01965354335811999d, 1.7715216602443777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01965354335811999d + "'", double2 == 0.01965354335811999d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        double double1 = org.apache.commons.math.util.FastMath.acos(10.000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.17803326350989765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17993839247941096d + "'", double1 == 0.17993839247941096d);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7456282765000656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.632533598810219d + "'", double1 == 0.632533598810219d);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0866080067999329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8850530696478036d + "'", double1 == 0.8850530696478036d);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1499206005993003d + "'", double1 == 1.1499206005993003d);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.554925098283228E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.204514762682535E9d + "'", double1 == 6.204514762682535E9d);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.12119940557253528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002115328678700704d + "'", double1 == 0.002115328678700704d);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5440211074304587d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.498241304416574d) + "'", double1 == (-0.498241304416574d));
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7089878066060047d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7826070881910157d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.6374395623641513d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0016003481560184533d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.19192409582154932d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19312231484859171d) + "'", double1 == (-0.19312231484859171d));
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5130380898365219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.570794982590176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232263688840315d + "'", double1 == 1.0232263688840315d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        int int1 = org.apache.commons.math.util.FastMath.round(37.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2873554892516914d, 1.5258665137193053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9825023553843627d + "'", double2 == 0.9825023553843627d);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6632456843634446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410822616658446d + "'", double1 == 0.9410822616658446d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9929402025489149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4519004066366514d + "'", double1 == 1.4519004066366514d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.013611086516481827d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013611927116341722d) + "'", double1 == (-0.013611927116341722d));
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        double double1 = org.apache.commons.math.util.FastMath.log(3.948148009134101E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.30685281944007d + "'", double1 == 31.30685281944007d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1152127885098424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.896986040629635d + "'", double1 == 63.896986040629635d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0232274785475501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6399756034953652d + "'", double1 == 1.6399756034953652d);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8805765261215637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6367066872377056d + "'", double1 == 0.6367066872377056d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3254103039381046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0534147971775811d + "'", double1 == 1.0534147971775811d);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6898045020253281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8095773352318997d + "'", double1 == 0.8095773352318997d);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.0871877068532768E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.13453038206307233d, 0.7775315238017035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21019887103087667d + "'", double2 == 0.21019887103087667d);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8941431647226753E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8939637984555872E-4d + "'", double1 == 1.8939637984555872E-4d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8819048085939799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7953562398751209d + "'", double1 == 0.7953562398751209d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        double double1 = org.apache.commons.math.util.FastMath.tanh(38.00117849429131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.006419120665304706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18584826590581568d + "'", double1 == 0.18584826590581568d);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5473651378551417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.614611547869542d + "'", double1 == 0.614611547869542d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        double double1 = org.apache.commons.math.util.FastMath.acos(35.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8052085614665847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        double double2 = org.apache.commons.math.util.FastMath.max(7.635078747156649E-9d, (-0.008879214226770233d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.635078747156649E-9d + "'", double2 == 7.635078747156649E-9d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.5300284545496456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.757421577635591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8593549916052095d + "'", double1 == 0.8593549916052095d);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        float float2 = org.apache.commons.math.util.FastMath.min(37.0f, (float) 49L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.016379903021458187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016379903021458187d + "'", double1 == 0.016379903021458187d);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        double double2 = org.apache.commons.math.util.FastMath.max(0.024649111432356895d, 1.1574928494310313d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1574928494310313d + "'", double2 == 1.1574928494310313d);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.99997885478613d + "'", double1 == 9.99997885478613d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1809708426156516d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.1622776601683795d, 0.7483443290970895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.366857789636033d + "'", double2 == 2.366857789636033d);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.3477068812493917d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9791761149522404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9930099581450239d + "'", double1 == 0.9930099581450239d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2577689529157872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2940397999592368d + "'", double1 == 1.2940397999592368d);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000000000002274d, 1.0232263688840315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.773918801024612d + "'", double2 == 0.773918801024612d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.036053812280867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8031040041762045d + "'", double1 == 0.8031040041762045d);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 97.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 824.4505734611646d + "'", double1 == 824.4505734611646d);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7418580584129385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.14836503173587057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1599362326291829d + "'", double1 == 1.1599362326291829d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5574075654456325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7465002900392412d + "'", double1 == 3.7465002900392412d);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.719301677299958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40985124626279884d + "'", double1 == 0.40985124626279884d);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.930067261567154E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8446.151861268154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8447.0d + "'", double1 == 8447.0d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.19486506597972084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987703015216d + "'", double1 == 0.19611987703015216d);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091341L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.024649111432356895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15700035487971642d + "'", double1 == 0.15700035487971642d);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        double double2 = org.apache.commons.math.util.FastMath.pow(28.92036009556794d, 0.9440892412430648d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.961096533707853d + "'", double2 == 23.961096533707853d);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        double double1 = org.apache.commons.math.util.FastMath.atan(57.271284253105414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.553337343543345d + "'", double1 == 1.553337343543345d);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9992790497916413d), 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00999245790494023d) + "'", double2 == (-0.00999245790494023d));
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8740480958578509d, 0.9825023553843627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8740480958578509d + "'", double2 == 0.8740480958578509d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2169902071303054d + "'", double1 == 2.2169902071303054d);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3440585709080678E43d, 0.7345106490374571d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        double double2 = org.apache.commons.math.util.FastMath.atan2(631011.7651164598d, 1.036053812280867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707946849018772d + "'", double2 == 1.5707946849018772d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.598966569616076d + "'", double1 == 3.598966569616076d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.26381901300017374d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999999999999837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.08780687629274E-15d) + "'", double1 == (-7.08780687629274E-15d));
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7612912090796752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        double double1 = org.apache.commons.math.util.FastMath.log(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.93032191099978d) + "'", double1 == (-33.93032191099978d));
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.12586921067986145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9920889238170656d + "'", double1 == 0.9920889238170656d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        double double1 = org.apache.commons.math.util.FastMath.atanh(43.51625986486027d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.079986118564083E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04494641542602665d + "'", double1 == 0.04494641542602665d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        double double1 = org.apache.commons.math.util.FastMath.acos(12.019343107182594d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.020377724655755693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00020763301592d + "'", double1 == 1.00020763301592d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        double double1 = org.apache.commons.math.util.FastMath.rint(20.938628468106426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3280, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.003632002313892395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9455557866374293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9723969285417501d + "'", double1 == 0.9723969285417501d);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4920344106948838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008587620499735722d + "'", double1 == 0.008587620499735722d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.121131255272116d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.672012975728713d + "'", double1 == 21.672012975728713d);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6527019197008838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7111453323670134d + "'", double1 == 0.7111453323670134d);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.12270990624068587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12209768293718985d + "'", double1 == 0.12209768293718985d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.4109596116102156d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1760939939322341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.38522216300166d + "'", double1 == 67.38522216300166d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-5L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        double double1 = org.apache.commons.math.util.FastMath.acos(81.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        double double1 = org.apache.commons.math.util.FastMath.sinh(63.11171283996957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2824446619699143E27d + "'", double1 == 1.2824446619699143E27d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8656496755126944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-24.53305982277447d), 102.66025548936805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-24.533059822774465d) + "'", double2 == (-24.533059822774465d));
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        double double2 = org.apache.commons.math.util.FastMath.min(2.7182818284590833d, (-0.2166539525524803d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2166539525524803d) + "'", double2 == (-0.2166539525524803d));
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.0068699188553262855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9931536250913602d + "'", double1 == 0.9931536250913602d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        int int2 = org.apache.commons.math.util.FastMath.min((-5), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        double double1 = org.apache.commons.math.util.FastMath.expm1(12.239326967783477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 206761.6855142214d + "'", double1 == 206761.6855142214d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.99188518905606d + "'", double1 == 31.99188518905606d);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.757450107592721d, 0.03505838110136253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9903081373611482d + "'", double2 == 0.9903081373611482d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-5));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999092042625951d) + "'", double1 == (-0.9999092042625951d));
    }
}

