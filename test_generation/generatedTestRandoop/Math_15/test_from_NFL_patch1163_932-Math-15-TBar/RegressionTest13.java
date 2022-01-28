import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double double1 = org.apache.commons.math3.util.FastMath.floor(46.999532327864166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.0d + "'", double1 == 46.0d);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.012696609983792819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012697292275491644d + "'", double1 == 0.012697292275491644d);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.8026817217694402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014009438890453776d) + "'", double1 == (-0.014009438890453776d));
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.951243865300542d, 1.5261528955311234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6272148212928281d) + "'", double2 == (-0.6272148212928281d));
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        int int2 = org.apache.commons.math3.util.FastMath.max(32768, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(6.907723159073521E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2056251294209696E-5d + "'", double1 == 1.2056251294209696E-5d);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3396159781079675d + "'", double1 == 1.3396159781079675d);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-64.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.26765045E30f) + "'", float1 == (-1.26765045E30f));
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8364287485695048d), (-18));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.904560119111945d + "'", double2 == 24.904560119111945d);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8657695131881509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9304673627742946d + "'", double1 == 0.9304673627742946d);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        double double1 = org.apache.commons.math3.util.FastMath.acos(4.034512373570679d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9999999809265139d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        long long2 = org.apache.commons.math3.util.FastMath.min(13L, 10240L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13L + "'", long2 == 13L);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.4546560101297226E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(512.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 212, (-35L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 212L + "'", long2 == 212L);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.3619730303123131d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-23L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 23L + "'", long1 == 23L);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 5.421011E-20f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        long long2 = org.apache.commons.math3.util.FastMath.min(1L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.5705521861747473d, 1.192092895507818E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.3706546600041213E-8d) + "'", double2 == (-4.3706546600041213E-8d));
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-17.789481822638468d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-3.33289488E12f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        double double1 = org.apache.commons.math3.util.FastMath.abs(16026.431110775147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16026.431110775147d + "'", double1 == 16026.431110775147d);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-9.492202528278994E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0054386314315379575d) + "'", double1 == (-0.0054386314315379575d));
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.9589242746631385d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(8.66334748188207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.5625f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        double double2 = org.apache.commons.math3.util.FastMath.log(2430664.0174340927d, (-0.9495627235668462d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5.293955920339377E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 75.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.01067973557803d + "'", double1 == 5.01067973557803d);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.058571630099851d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.05857163009985d + "'", double2 == 6.05857163009985d);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        double double2 = org.apache.commons.math3.util.FastMath.pow(15.58087669728624d, 143);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.472484930606858E170d + "'", double2 == 3.472484930606858E170d);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.0919948905169028d, 4.600444344825681d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23305414892472004d + "'", double2 == 0.23305414892472004d);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 7L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.3678794411789759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35251342178425454d + "'", double1 == 0.35251342178425454d);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.34187198E17f, (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.8546799E16f + "'", float2 == 5.8546799E16f);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5507969934215662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01999800019997996d + "'", double1 == 0.01999800019997996d);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.536745E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        long long1 = org.apache.commons.math3.util.FastMath.abs(43L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 43L + "'", long1 == 43L);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.5688922622699d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.3829808035826506E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.4694930201844715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7772183518530855d + "'", double1 == 0.7772183518530855d);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.3733969509475266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023970298730885395d + "'", double1 == 0.023970298730885395d);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-57.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.2710663101885906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-12L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.8464950758027222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0093671289582804d) + "'", double1 == (-1.0093671289582804d));
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        double double1 = org.apache.commons.math3.util.FastMath.signum(10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.43155358513611025d, (-0.17260786905128284d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43155358513611025d) + "'", double2 == (-0.43155358513611025d));
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.7686346899325218d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6553210298687463d) + "'", double1 == (-0.6553210298687463d));
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.7522460694432564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7301560165494215d + "'", double1 == 0.7301560165494215d);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1920928244535418E-7d, 9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1444316557594562d) + "'", double2 == (-0.1444316557594562d));
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 45.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.4786097723456752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6138292518641623d + "'", double1 == 0.6138292518641623d);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0232274785475504d, 6.236369590203704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0232274785475504d + "'", double2 == 1.0232274785475504d);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(268.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6774823953448035d + "'", double1 == 4.6774823953448035d);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.20962587148475365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-35.350506208557206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.12816970312934028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.053671212772351E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.053671212772351E-8d + "'", double1 == 1.053671212772351E-8d);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.936841376125404E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.936841376125405E-15d + "'", double1 == 7.936841376125405E-15d);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.374455756373859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19508152394421943d + "'", double1 == 0.19508152394421943d);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        double double1 = org.apache.commons.math3.util.FastMath.sin(99.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992068341863537d) + "'", double1 == (-0.9992068341863537d));
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.03271908904668641d, 0.15748111057722322d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5835918847935891d + "'", double2 == 0.5835918847935891d);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.679522618351296d, (double) 8L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.0787619161000124d), 8.971567242793748d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0787619161000124d + "'", double2 == 1.0787619161000124d);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7601702599438814d, (double) 23L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7601702599438814d + "'", double2 == 0.7601702599438814d);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.2351647362715017E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2351647362715017E-22d + "'", double1 == 4.2351647362715017E-22d);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        int int1 = org.apache.commons.math3.util.FastMath.round(100.00001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.609844813961006E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.7364591792920474d, 0.111232584350277d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.506826601299442d + "'", double2 == 1.506826601299442d);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.5707963267948915d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672735d) + "'", double1 == (-0.9171523356672735d));
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        long long2 = org.apache.commons.math3.util.FastMath.min(1L, (long) (-23));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23L) + "'", long2 == (-23L));
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 4.547474E-13f, 1.2533140897578763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.547474050965727E-13d + "'", double2 == 4.547474050965727E-13d);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.017452669828398083d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017452669828398083d + "'", double2 == 0.017452669828398083d);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5557.000000066743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 7.0f, (-7.105427357601027E-15d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.0d) + "'", double2 == (-7.0d));
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        double double2 = org.apache.commons.math3.util.FastMath.pow(58.996877293214865d, (-45));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.05444194675276E-80d + "'", double2 == 2.05444194675276E-80d);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.619670639138117d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5342913977175717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.146161606456767d + "'", double1 == 1.146161606456767d);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-8), 1024.0001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0001f + "'", float2 == 1024.0001f);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        int int2 = org.apache.commons.math3.util.FastMath.min((-47), (-45));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-7), 692.7645379031695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 692.7645379031695d + "'", double2 == 692.7645379031695d);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.384186E-7f, (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842023E-19f + "'", float2 == 1.0842023E-19f);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.374455756373859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.75051396768342d + "'", double1 == 78.75051396768342d);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928244535418E-7d + "'", double1 == 1.1920928244535418E-7d);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.2550831292576428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8131868366909719d + "'", double1 == 0.8131868366909719d);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7601702599438814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.21608044208685753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.014009438890453776d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014009897189899851d) + "'", double1 == (-0.014009897189899851d));
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9073485191245059E-6d, (-3.2819493855383146d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9073485191245057E-6d + "'", double2 == 1.9073485191245057E-6d);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.014317690396004406d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.124936073533697E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.67217465972877d + "'", double1 == 98.67217465972877d);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 143);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 143L + "'", long1 == 143L);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.335442656797612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.0007040209466105d, 19.085536923187668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4190.171849337931d + "'", double2 == 4190.171849337931d);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6674572160283838d + "'", double1 == 0.6674572160283838d);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-1.4E-45f), (-1.4240688290837617E-306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.401298464324817E-45d) + "'", double2 == (-1.401298464324817E-45d));
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.0588446827334096E-5d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-15) + "'", int1 == (-15));
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.264803107213601E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8979770761529635d) + "'", double1 == (-3.8979770761529635d));
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) Float.POSITIVE_INFINITY, 29.366970946469284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.366970946469284d + "'", double2 == 29.366970946469284d);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        int int2 = org.apache.commons.math3.util.FastMath.min(62, 511);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 61L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0552874272350832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        int int2 = org.apache.commons.math3.util.FastMath.min((-43), (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.4414065E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4414068E-4f + "'", float1 == 2.4414068E-4f);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 10, 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        int int2 = org.apache.commons.math3.util.FastMath.max(40, 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.6685117558576993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5892788854382901d + "'", double1 == 0.5892788854382901d);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.575741909831946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5757419098319465d + "'", double1 == 4.5757419098319465d);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 8);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 458.3662361046586d + "'", double1 == 458.3662361046586d);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.835991609699039d, 2.3205128404736515E-25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.835991609699039d + "'", double2 == 2.835991609699039d);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.000583639724013d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 12, (float) 143);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 12.0f + "'", float2 == 12.0f);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.05272236634611254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.020769077574816d + "'", double1 == 3.020769077574816d);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.7542142871583881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2820787508761703d) + "'", double1 == (-0.2820787508761703d));
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.248291206950246d, 0.0688530993622138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.248291206950245d + "'", double2 == 4.248291206950245d);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 13.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1607866859909812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5.68627886E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.68627886E8d + "'", double1 == 5.68627886E8d);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-19), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-19.0f) + "'", float2 == (-19.0f));
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9780821240516806d) + "'", double1 == (-0.9780821240516806d));
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.4650191511034982d, 4.547474050965727E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4650191511034982d + "'", double2 == 1.4650191511034982d);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5625001192092896d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.43597363E10f, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.8823852309817808E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267943654d + "'", double1 == 1.5707963267943654d);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.7997797671276863d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(7.737545114640003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1146.418626612039d + "'", double1 == 1146.418626612039d);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8447979300678613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2376985413131514d + "'", double1 == 1.2376985413131514d);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9225959148113836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.2840254166877415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2766265871686438d + "'", double1 == 0.2766265871686438d);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.0059490826533332725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005949047562151882d + "'", double1 == 0.005949047562151882d);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 68);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.135016052687385E72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.72630597023276E70d + "'", double1 == 3.72630597023276E70d);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.880909488144193E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-4.45174640302101d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-49.25280982485735d), 143);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.4918718110791474E44d) + "'", double2 == (-5.4918718110791474E44d));
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.7970546072131232d), 4.2351647362715017E-22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2351647362715017E-22d + "'", double2 == 4.2351647362715017E-22d);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.6482076576793505d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483648E9d + "'", double1 == 2.147483648E9d);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.290822861412639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8289110811510474d + "'", double1 == 0.8289110811510474d);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.017452669828398083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(205151.36246232543d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(25.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-1.120171201020976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43552834177790306d + "'", double1 == 0.43552834177790306d);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        long long2 = org.apache.commons.math3.util.FastMath.max((-2L), 6208L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6208L + "'", long2 == 6208L);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.4359738E10f, 4.547475E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4359738E10f + "'", float2 == 3.4359738E10f);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(50.74612251401343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.466772362498544E21d + "'", double1 == 5.466772362498544E21d);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-2.68435424E8f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.68435424E8d) + "'", double1 == (-2.68435424E8d));
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9781088370666045d, 0.21511909301433307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3543092643820707d + "'", double2 == 1.3543092643820707d);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-7));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, (-12));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.6931472401645883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8325546469539331d + "'", double1 == 0.8325546469539331d);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.609435868686549E18d, 4.248291206950245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.880909488144193E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0517578125E-5d + "'", double1 == 3.0517578125E-5d);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.668042644536231E-8d, 2.2105354941985667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.668042644536231E-8d + "'", double2 == 2.668042644536231E-8d);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.6929693744344998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(61.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 61.000008f + "'", float1 == 61.000008f);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(6400.0f, (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.048828125f + "'", float2 == 0.048828125f);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5533570812458124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.00080483214516d + "'", double1 == 89.00080483214516d);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9389941379013969d + "'", double1 == 0.9389941379013969d);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.4414068E-4f, (-1.9184615E21f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4414068E-4f + "'", float2 == 2.4414068E-4f);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0f), (-1.656701873845986E-6d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-511), (long) (-40));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40L) + "'", long2 == (-40L));
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.213921938007921E-4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.5514266812416906d, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5514266812416906d + "'", double2 == 0.5514266812416906d);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9999935791925075d, 64.01562118716426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999935791925075d + "'", double2 == 0.9999935791925075d);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.6193427181221283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7522460694432564d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(187.4182940812372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 188.0d + "'", double1 == 188.0d);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.298342441900717d, 0.3999655238984033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5495863078526962d) + "'", double2 == (-0.5495863078526962d));
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        float float2 = org.apache.commons.math3.util.FastMath.min(510.99997f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.0000002f, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.6508453542261259d, 2.384185791015625E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707961823727807d + "'", double2 == 1.5707961823727807d);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.12887618051864808d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12852206859890744d) + "'", double1 == (-0.12852206859890744d));
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.536744E-7f, (-12));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3283067E-10f + "'", float2 == 2.3283067E-10f);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-50.41678482966614d), 3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.51664637483384d + "'", double2 == 50.51664637483384d);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8745129512124615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124615d + "'", double1 == 0.8745129512124615d);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-17.789481822638468d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 41984.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.5835918847935891d, 1.4658842241887455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7101591953981637d) + "'", double2 == (-0.7101591953981637d));
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0018903591682419658d, 0.7522460694432564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001890359168241966d + "'", double2 == 0.001890359168241966d);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-5.4210105393100954E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.4210105393100954E-20d) + "'", double1 == (-5.4210105393100954E-20d));
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.1568553487765425E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.2207031189367021E-4d, (-0.6870488395503531d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6870488395503531d) + "'", double2 == (-0.6870488395503531d));
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.4495239865639748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.102748784455539d + "'", double1 == 1.102748784455539d);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-0.9999998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752009177195009d) + "'", double1 == (-1.1752009177195009d));
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.72630597023276E70d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20164164698747905d) + "'", double1 == (-0.20164164698747905d));
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-4L), 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776927d + "'", double2 == 0.9999999958776927d);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.814811717347948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.08037538236017183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4903341516806188d + "'", double1 == 1.4903341516806188d);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.0017421870264488835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017406711789691592d + "'", double1 == 0.0017406711789691592d);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9304673627742946d, (-0.9999996940976795d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.392197324730251d + "'", double2 == 2.392197324730251d);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.2984702407800952d), 217.3083407086277d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        long long2 = org.apache.commons.math3.util.FastMath.min(47L, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        double double1 = org.apache.commons.math3.util.FastMath.rint(17.863451288869854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.010404662760165878d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-74.20321057778875d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.4484615082261164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7654351309956355d + "'", double1 == 0.7654351309956355d);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.30530773052749755d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3053077305274975d) + "'", double1 == (-0.3053077305274975d));
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-20));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 10240, 0.7451808536350516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03185255806154576d) + "'", double2 == (-0.03185255806154576d));
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7627471740390863d + "'", double1 == 1.7627471740390863d);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.3716924396446455d), 6.05857163009985d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(14.703675859011925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 842.4585700497786d + "'", double1 == 842.4585700497786d);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5707962635746238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477076845669d + "'", double1 == 4.810477076845669d);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9999515809042513d), 1.1129900353232505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7319509702808326d) + "'", double2 == (-0.7319509702808326d));
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 1.40737488E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52015.957670893964d + "'", double1 == 52015.957670893964d);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.5000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.656701873845986E-6d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6567018738444703E-6d) + "'", double1 == (-1.6567018738444703E-6d));
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.663853435426824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        double double1 = org.apache.commons.math3.util.FastMath.signum(10.04074995214716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.000001f, (-2401.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2401.0f) + "'", float2 == (-2401.0f));
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.5452223306482584d, 2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5452223306482584d + "'", double2 == 2.5452223306482584d);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 6208, (-127.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6208.0f + "'", float2 == 6208.0f);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.0017395479016332227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-2026.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.653572186604574d) + "'", double1 == (-12.653572186604574d));
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        double double1 = org.apache.commons.math3.util.FastMath.abs(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.999999999999996d + "'", double1 == 31.999999999999996d);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.99631285343356E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8804748037501915d + "'", double1 == 0.8804748037501915d);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-8191.9995f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-8191.999f) + "'", float1 == (-8191.999f));
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        float float1 = org.apache.commons.math3.util.FastMath.signum(24.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.799080308109824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0960627939926773d + "'", double1 == 1.0960627939926773d);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0010886293480585d, 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.148183039252292d + "'", double2 == 1.148183039252292d);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) Float.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.05758226931636758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.057646038412670686d + "'", double1 == 0.057646038412670686d);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(71.55417527999327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.963553207875055d + "'", double1 == 4.963553207875055d);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198908d + "'", double1 == 1.3862943611198908d);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-43.0f), (double) 3.33289488E12f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-43.0d) + "'", double2 == (-43.0d));
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.7111977130787057d, (double) (-0.9999998f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7111977130787057d + "'", double2 == 0.7111977130787057d);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        double double2 = org.apache.commons.math3.util.FastMath.min(54.598150033144236d, (-1.6668288393884205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6668288393884205d) + "'", double2 == (-1.6668288393884205d));
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7451131604793488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.69183935512069d + "'", double1 == 42.69183935512069d);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        float float1 = org.apache.commons.math3.util.FastMath.signum(39.999996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4436354751788103d, 0.6090128311061332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.44363547517881d + "'", double2 == 1.44363547517881d);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.0546853767611393E33d), (double) 21.5f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-43.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 43.0f + "'", float1 == 43.0f);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.05038397583716259d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0504053172238956d) + "'", double1 == (-0.0504053172238956d));
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.8369630128952054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1779753995584329d) + "'", double1 == (-0.1779753995584329d));
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.987846675914698E-16d, 1.8354356841543302d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.987846675914698E-16d + "'", double2 == 1.987846675914698E-16d);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(35.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.00001f + "'", float1 == 35.00001f);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.0234375f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(96.999985f, 0.0017410600350943942d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99998f + "'", float2 == 96.99998f);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        long long2 = org.apache.commons.math3.util.FastMath.min((-18L), 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18L) + "'", long2 == (-18L));
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-0.9999999f), (float) 17L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4096.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.003905821484290615d, (double) 47L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.463716920009902E-114d + "'", double2 == 6.463716920009902E-114d);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(6.53313149942335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 343.77322263437395d + "'", double1 == 343.77322263437395d);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.5330253887606938E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5330253887606938E-15d + "'", double1 == 3.5330253887606938E-15d);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        long long1 = org.apache.commons.math3.util.FastMath.abs(13L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 51.999992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7160032799154878d + "'", double1 == 1.7160032799154878d);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.060135240003378346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9981924212743167d + "'", double1 == 0.9981924212743167d);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.004921526865106985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0049094359950778346d) + "'", double1 == (-0.0049094359950778346d));
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        int int2 = org.apache.commons.math3.util.FastMath.max((-2147483648), 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-47));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47 + "'", int1 == 47);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 35L, 32.000003814697266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9999961853027344d + "'", double2 == 2.9999961853027344d);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.008185385812899518d), 0.001565000444055422d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008333652698301651d + "'", double2 == 0.008333652698301651d);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        double double1 = org.apache.commons.math3.util.FastMath.asin(39.960969282839415d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.7949487914783152d, 0.4402805101795452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9039018424576895d + "'", double2 == 0.9039018424576895d);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(40.999992f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(97.00317877887012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6930248545919762d + "'", double1 == 1.6930248545919762d);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8804748037501915d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.087596860003064d + "'", double2 == 14.087596860003064d);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.000018866625139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7237368419565787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.02711025494194475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5436827499018924d + "'", double1 == 1.5436827499018924d);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9036922050915067d), (-0.00628577581071199d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0014595116510198597d + "'", double2 == 0.0014595116510198597d);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-19.265919722494797d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0007040209466105d, 1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0007040209466105d + "'", double2 == 1.0007040209466105d);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 48.5f, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5841920509422844E-12d + "'", double2 == 1.5841920509422844E-12d);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.7592186E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.7592186E13f + "'", float1 == 1.7592186E13f);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.9242223034090244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9242223034090244d + "'", double1 == 1.9242223034090244d);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.420082935610902E10d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0678195859292554E40d + "'", double2 == 3.0678195859292554E40d);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-1.1E-44f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1E-44f + "'", float1 == 1.1E-44f);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.499686190671499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 655359.9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.39293979121829d + "'", double1 == 13.39293979121829d);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.128246484915729E-277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.128246484915729E-277d + "'", double1 == 1.128246484915729E-277d);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-511));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6455314445180025d, (-19));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.765733319381213E-5d + "'", double2 == 7.765733319381213E-5d);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        int int2 = org.apache.commons.math3.util.FastMath.min(52, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.36748109589494815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.4245783453278988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5289455966723935d + "'", double1 == 0.5289455966723935d);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-3.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.374455756373859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.318057839217392d + "'", double1 == 0.318057839217392d);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.570743203905968d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 52.000008f, 7.610081594096771E-189d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.610081594096771E-189d + "'", double2 == 7.610081594096771E-189d);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        double double1 = org.apache.commons.math3.util.FastMath.atan(8.881784197001254E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-26d + "'", double1 == 8.881784197001254E-26d);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 11L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11.0f + "'", float1 == 11.0f);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-46.999992f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.999992f + "'", float2 == 46.999992f);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.8994711377630404d, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0070271182637737534d + "'", double2 == 0.0070271182637737534d);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.7073506891130978d, (double) (-2401.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2401.000104195124d + "'", double2 == 2401.000104195124d);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7336545584598331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2814145124371803d + "'", double1 == 1.2814145124371803d);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 5.8546799E16f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.880909488144193E11d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 188090948814L + "'", long1 == 188090948814L);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.038341943233852725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007351423602022d + "'", double1 == 1.0007351423602022d);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.9911569720921272d, 18.107262486837385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9911569720921273d + "'", double2 == 0.9911569720921273d);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 48.5f, 2.9913014866745815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5091980343946367d + "'", double2 == 1.5091980343946367d);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0315726969549555d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.028690618287860615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028282950549067154d) + "'", double1 == (-0.028282950549067154d));
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.58037251265019648E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9073486E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        float float2 = org.apache.commons.math3.util.FastMath.max(46.999992f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.999992f + "'", float2 == 46.999992f);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(41.90316148102299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2400.874301117777d + "'", double1 == 2400.874301117777d);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.010200069899324198d, 3.2555982551476657d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010200069899324198d + "'", double2 == 0.010200069899324198d);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.17453292519943295d, (double) 4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1745336082170135d + "'", double2 == 0.1745336082170135d);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 4.60943587E18f, 1.570796446004186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6094358678811438E18d + "'", double2 == 4.6094358678811438E18d);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0000000000004547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870198646d + "'", double1 == 0.8813735870198646d);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.769163017341341E67d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 67.44234852289901d + "'", double1 == 67.44234852289901d);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.012697292275491644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000806116985823d + "'", double1 == 1.0000806116985823d);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(842.4585700497786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.737510784063431d + "'", double1 == 6.737510784063431d);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(34.30686044883459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930127763409779E14d + "'", double1 == 7.930127763409779E14d);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.4975581E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (byte) 100, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 2, (-0.3188855888203308d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0252624567589477d + "'", double2 == 2.0252624567589477d);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3.0678195859292554E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 93.91751797698988d + "'", double1 == 93.91751797698988d);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, (-2.535301E30f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0f) + "'", float2 == (-0.0f));
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-4.50359936E15f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-45));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.431504208113316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9083376611362666d + "'", double1 == 0.9083376611362666d);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-15));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4210855E-14f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46) + "'", int1 == (-46));
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-3.0d), 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59049.0d + "'", double2 == 59049.0d);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.000001f + "'", float1 == 6.000001f);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.374455756373859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1118433123489078d + "'", double1 == 1.1118433123489078d);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.4870211444092283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6144540405395877d + "'", double1 == 0.6144540405395877d);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-0.0039062505f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.010200777470529932d, 1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7036459018864084E-4d + "'", double2 == 2.7036459018864084E-4d);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 35840.0f, (-0.4103302129827671d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35840.0d + "'", double2 == 35840.0d);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.11611854943761853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11559945345516076d) + "'", double1 == (-0.11559945345516076d));
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5750864740467807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.255024491413128d + "'", double1 == 1.255024491413128d);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453290855467615d + "'", double1 == 0.17453290855467615d);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        long long2 = org.apache.commons.math3.util.FastMath.max(212L, (long) (-45));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 212L + "'", long2 == 212L);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.055985424956187115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9999515809042513d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999515809042512d) + "'", double1 == (-0.9999515809042512d));
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        long long1 = org.apache.commons.math3.util.FastMath.abs(57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9417844128659681d), (-24.191690961245197d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.1E-44f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.2105354941985667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1920928955078071E-7d, 0.6483608274590867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078071E-7d + "'", double2 == 1.1920928955078071E-7d);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.49904707604701226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.548036385036598d + "'", double1 == 0.548036385036598d);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(90.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.102016471589291E38d + "'", double1 == 6.102016471589291E38d);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.23305414892472004d, (-0.6764125919282526d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6764125919282526d) + "'", double2 == (-0.6764125919282526d));
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 61L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.0d + "'", double1 == 61.0d);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.926359837370816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0646536782475367d + "'", double1 == 1.0646536782475367d);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-10.000001f), (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01247687654289864d) + "'", double2 == (-0.01247687654289864d));
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(340.4399400146707d, (double) 1.4551915E-11f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 340.43994001467064d + "'", double2 == 340.43994001467064d);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        double double1 = org.apache.commons.math3.util.FastMath.floor(135.9230282999094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 135.0d + "'", double1 == 135.0d);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0014595116510198597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0014595106146826926d + "'", double1 == 0.0014595106146826926d);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 40, 15L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(24.191690961245197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.9985859267674833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9985859267674833d + "'", double1 == 0.9985859267674833d);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.1624473221032003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.311231683859136d + "'", double1 == 2.311231683859136d);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.5851764690934549d), 0.4348584890312084d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4348584890312084d + "'", double2 == 0.4348584890312084d);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9319894546747586d, (double) 212.00002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 212.00001525878906d + "'", double2 == 212.00001525878906d);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999957691935532d, 0.4786097723456752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999979750924562d + "'", double2 == 0.9999979750924562d);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        double double1 = org.apache.commons.math3.util.FastMath.rint(27.028944477141252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.0d + "'", double1 == 27.0d);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0044884011988755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.536520016785182d + "'", double1 == 0.536520016785182d);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(167.65805815345627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.815082611411228d + "'", double1 == 5.815082611411228d);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        double double2 = org.apache.commons.math3.util.FastMath.log(5.421010862427522E-20d, (double) 1.7592186E13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6875d) + "'", double2 == (-0.6875d));
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-126.99999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.888490349608754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.955253155753324d + "'", double1 == 8.955253155753324d);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.017453292519943292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.722369115788189d, (-19));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 482.58717134678835d + "'", double2 == 482.58717134678835d);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.530993900237115d, (double) 96.999985f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015782134307057112d + "'", double2 == 0.015782134307057112d);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.9184615E21f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.9184614E21f) + "'", float1 == (-1.9184614E21f));
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        float float2 = org.apache.commons.math3.util.FastMath.max((-8191.999f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 57L, 0.17364817766693036d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 56.999996f + "'", float2 == 56.999996f);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.03703703703703703d, (double) (-1.9184614E21f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-2.726510528000143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44068679350977147d + "'", double1 == 0.44068679350977147d);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(3.897326848573678E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.470329472543003E-22d + "'", double1 == 8.470329472543003E-22d);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(17.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.7853981633974483d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1.8855630621884312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        double double1 = org.apache.commons.math3.util.FastMath.cos(46340.95001184158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7755431812723019d) + "'", double1 == (-0.7755431812723019d));
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(25.249017180612423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.618264892288864E10d + "'", double1 == 4.618264892288864E10d);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.5774089634154596d, 3.3800863156250025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5774089634154596d + "'", double2 == 3.5774089634154596d);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-6.1572651E13f), 11.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.1572651E13f + "'", float2 == 6.1572651E13f);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3580.423852010498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(12347.228980451639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.421267929380438d + "'", double1 == 9.421267929380438d);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.536744E-7f, 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536744E-7f + "'", float2 == 9.536744E-7f);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-16.999998f), 0.004408917195881684d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.999996f) + "'", float2 == (-16.999996f));
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-200.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 200.0f + "'", float1 == 200.0f);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.000000000007276d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000002546585d + "'", double2 == 1.0000000002546585d);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0552874272350832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0552874272350832d + "'", double1 == 1.0552874272350832d);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.540302305868138d + "'", double1 == 0.540302305868138d);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.881784197001254E-26d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(263.856815596594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.85681559659406d + "'", double1 == 263.85681559659406d);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        int int2 = org.apache.commons.math3.util.FastMath.min(63, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-6.693572235978968E-4d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5120.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.0f, 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.1054274E-15f + "'", float2 == 7.1054274E-15f);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.49205974021214605d, 0.6918184078520577d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49205974021214605d + "'", double2 == 0.49205974021214605d);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        double double2 = org.apache.commons.math3.util.FastMath.max(1087.5625210660835d, 22.18070977791825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1087.5625210660835d + "'", double2 == 1087.5625210660835d);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.006142729981775034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99998113349351d + "'", double1 == 0.99998113349351d);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.6951219826018177d, 0.054136940598407145d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6951219826018177d + "'", double2 == 0.6951219826018177d);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.2442042457880407d, 1.191835637525998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1863384408130501d + "'", double2 == 0.1863384408130501d);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.0434448108017733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.744547164969114d + "'", double1 == 1.744547164969114d);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 2.9999998f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.950488987782623d, (-0.09254195563405843d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9504889877826229d + "'", double2 == 0.9504889877826229d);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        long long2 = org.apache.commons.math3.util.FastMath.max((-7L), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1.8880249E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4577670266704841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3393554931179893d) + "'", double1 == (-0.3393554931179893d));
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.7592186E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.8880249E22f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(7.6293945E-6f, (float) (-18));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.6293945E-6f) + "'", float2 == (-7.6293945E-6f));
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.3598938172877042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.671017080997485d + "'", double1 == 4.671017080997485d);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.192092895507821E-7d, 0.08966792038047539d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1512723587519333d + "'", double2 == 0.1512723587519333d);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0000169231422558d, (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.3589153218773262d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44459372763082317d) + "'", double1 == (-0.44459372763082317d));
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        double double1 = org.apache.commons.math3.util.FastMath.asin(340.4399400146707d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-57.0f), (double) 1.0000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-56.99999999999999d) + "'", double2 == (-56.99999999999999d));
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (double) 24L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.061975901106484765d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        int int2 = org.apache.commons.math3.util.FastMath.min((-15), (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-64));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.000001f + "'", float1 == 5.000001f);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.5538479001269114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.034512373570679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6166163396713061d, 13.000000953674316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6166163396713061d + "'", double2 == 0.6166163396713061d);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.042848410283348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.77404314254283d + "'", double1 == 2.77404314254283d);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.765733319381213E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.765733319381215E-5d + "'", double1 == 7.765733319381215E-5d);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.6090156828024733d, (-0.2513272416932877d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6588364624977272d + "'", double2 == 0.6588364624977272d);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-45.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 45.0f + "'", float1 == 45.0f);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 17, (-42.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.0f) + "'", float2 == (-17.0f));
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(22.395565749013024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.732395350032901d + "'", double1 == 4.732395350032901d);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.000018866625139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 63L, 143);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 64L, (-0.032426843737390965d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.3364599966985454E91d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0000000000000324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246550133d + "'", double1 == 1.5574077246550133d);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 101);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(0.062499996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0625f + "'", float1 == 0.0625f);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 40L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.9999976526417022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.962219990689325d) + "'", double1 == (-12.962219990689325d));
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0960627939926773d, (-1.4313637641589874d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3353009701663101d) + "'", double2 == (-0.3353009701663101d));
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(99.99999f, 1.3383449299268079E42d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1044889974911134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        int int2 = org.apache.commons.math3.util.FastMath.max(24, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(10.000000381469718d, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.000000762939436d + "'", double2 == 20.000000762939436d);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.66662102809951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9469495741507528d) + "'", double1 == (-0.9469495741507528d));
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9304673627742946d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9304673627742946d + "'", double2 == 0.9304673627742946d);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.509178478658057d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-64) + "'", int2 == (-64));
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.765625E-4f, (-0.7830044631770386d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7656244E-4f + "'", float2 == 9.7656244E-4f);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.9999999999999984d, 0.012695927780078789d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0088389816696353d + "'", double2 == 1.0088389816696353d);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.000345326584213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001726483883735d + "'", double1 == 1.0001726483883735d);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 127.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2165681500327987d + "'", double1 == 2.2165681500327987d);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0546853767611393E33d), (double) (-44.999996f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0546853767611392E33d) + "'", double2 == (-1.0546853767611392E33d));
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        long long2 = org.apache.commons.math3.util.FastMath.min((-20L), (long) 511);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 6.4851835E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 32768);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32768.00000000001d + "'", double1 == 32768.00000000001d);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.046457830652862575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5243217680012573d + "'", double1 == 1.5243217680012573d);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.0234375f), 9.536745E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0234375f) + "'", float2 == (-0.0234375f));
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.421011E-20f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.5474757E-13f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-4.5035996E15f), (-2.68435424E8d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.50359936E15f) + "'", float2 == (-4.50359936E15f));
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8325546469539331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-1.9999999f), 212);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.581935058209835E63d + "'", double2 == 6.581935058209835E63d);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-20.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999979388464d) + "'", double1 == (-0.9999999979388464d));
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 47L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12452756813273719d) + "'", double1 == (-0.12452756813273719d));
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5707962635746238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.2388667589823472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021622303937752996d + "'", double1 == 0.021622303937752996d);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1449205926874495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0461447716438386d + "'", double1 == 1.0461447716438386d);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(185.4759706643647d, 0.3619730303123131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 185.47632387548268d + "'", double2 == 185.47632387548268d);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.594719467848048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9031757796819829d) + "'", double1 == (-0.9031757796819829d));
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-13.85409825184331d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.854098251843308d) + "'", double1 == (-13.854098251843308d));
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.17453292519943295d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        int int2 = org.apache.commons.math3.util.FastMath.max(6, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.057646038412670686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05764603841267069d + "'", double1 == 0.05764603841267069d);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.995732273553991d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.004408917195881684d, 0.8804748037501915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004408917195881684d + "'", double2 == 0.004408917195881684d);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.7669541186975022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6967153009108552d + "'", double1 == 0.6967153009108552d);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.143536929821772E28d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0007040209466105d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.782069053352967d, 0.0885816328207447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4580112556208586d + "'", double2 == 1.4580112556208586d);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 1.5625f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1998848.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1413.8062101999694d + "'", double1 == 1413.8062101999694d);
    }
}

