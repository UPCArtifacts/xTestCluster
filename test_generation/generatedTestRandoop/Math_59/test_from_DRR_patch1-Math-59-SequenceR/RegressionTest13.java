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
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6889561611808576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6889561611808577d + "'", double1 == 0.6889561611808577d);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3355291332626371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8020071827314963d + "'", double1 == 3.8020071827314963d);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        double double1 = org.apache.commons.math.util.FastMath.atan((-100.01791180959569d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5607984507893795d) + "'", double1 == (-1.5607984507893795d));
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        long long2 = org.apache.commons.math.util.FastMath.min(12L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.44958547969513046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43567162955703354d + "'", double1 == 0.43567162955703354d);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.021171773984568765d), (-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43930669835763825d) + "'", double2 == (-0.43930669835763825d));
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 77703727489273L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 969);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 969L + "'", long1 == 969L);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9328179793623326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06954518895509636d) + "'", double1 == (-0.06954518895509636d));
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4764016559700286d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.062364267144095646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.062364267144095646d + "'", double1 == 0.062364267144095646d);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6020599913279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2203602319903436d) + "'", double1 == (-0.2203602319903436d));
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2228507766040782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22473781349273705d + "'", double1 == 0.22473781349273705d);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.250656177740729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5189448670992995d), (-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097343d) + "'", double2 == (-0.5063656411097343d));
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7226995482024658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6614118026597341d + "'", double1 == 0.6614118026597341d);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.31133746861371714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31660012669051746d + "'", double1 == 0.31660012669051746d);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7312568756599237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0776903657094035d + "'", double1 == 1.0776903657094035d);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.442702015629826d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3671645675901346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43513923608342747d) + "'", double1 == (-0.43513923608342747d));
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.06254420428363117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.001956526411342d + "'", double1 == 1.001956526411342d);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9407428152797754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5618837180839398d + "'", double1 == 1.5618837180839398d);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5359784961929428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6458692719698256d + "'", double1 == 3.6458692719698256d);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2642218198404007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5780313205406049d) + "'", double1 == (-0.5780313205406049d));
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        double double1 = org.apache.commons.math.util.FastMath.atan(14.778873676342487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5032351543629754d + "'", double1 == 1.5032351543629754d);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9904394498257181d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0426842879669972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.042658383987838534d + "'", double1 == 0.042658383987838534d);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-4.238865337353114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        double double1 = org.apache.commons.math.util.FastMath.acos(12.240517442917666d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.855948748237688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5434133768588044d + "'", double1 == 0.5434133768588044d);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.02287085931419646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997384732972796d + "'", double1 == 0.9997384732972796d);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1952491596692922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.304380986415101d + "'", double1 == 2.304380986415101d);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.03769633946808679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03769633946808679d + "'", double1 == 0.03769633946808679d);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.017190812494679297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01733942487965239d + "'", double1 == 0.01733942487965239d);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.6458692719698256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.539100682544985d + "'", double1 == 1.539100682544985d);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        double double2 = org.apache.commons.math.util.FastMath.min(0.38579264111060985d, (-77.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-77.0d) + "'", double2 == (-77.0d));
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        double double1 = org.apache.commons.math.util.FastMath.log(5.788205780533459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.755822361097415d + "'", double1 == 1.755822361097415d);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.0466382509707714E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999535899772d + "'", double1 == 0.9999999535899772d);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0171533999278615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0085402321810775d + "'", double1 == 1.0085402321810775d);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3355291332626371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        double double1 = org.apache.commons.math.util.FastMath.acos(28.4764116085372d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.06254420428363118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.203812928404715d) + "'", double1 == (-1.203812928404715d));
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6437942581999371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8023679070102051d + "'", double1 == 0.8023679070102051d);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.06057085833608861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060645096529850825d + "'", double1 == 0.060645096529850825d);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.016390006834163424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.86059583680524E-4d + "'", double1 == 2.86059583680524E-4d);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4328606952063188d, (-1.1752011936438012d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6752482282855063d + "'", double2 == 2.6752482282855063d);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        long long2 = org.apache.commons.math.util.FastMath.min(232L, 89L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7389538577032342d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6842868307608122d) + "'", double1 == (-0.6842868307608122d));
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2146848510894015E-8d + "'", double1 == 4.2146848510894015E-8d);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        double double1 = org.apache.commons.math.util.FastMath.floor(16.350231202722476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-36.7368005696771d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21320856864113585d + "'", double1 == 0.21320856864113585d);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.86076131526265E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.35414242816297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6329299089739802d + "'", double1 == 1.6329299089739802d);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5424860955797707E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5424860955797707E22d + "'", double1 == 1.5424860955797707E22d);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        double double1 = org.apache.commons.math.util.FastMath.tan(42842.07030090556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1729788473316412d + "'", double1 == 0.1729788473316412d);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.030546391905364526d), 0.7122015233786483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.030546391905364526d) + "'", double2 == (-0.030546391905364526d));
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.017190812494679297d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6535017414499469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.1924336773023863d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(57.29291493894794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3282.642222003741d + "'", double1 == 3282.642222003741d);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        double double1 = org.apache.commons.math.util.FastMath.floor(57.232535943757796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4819946344796317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4491398401088468d + "'", double1 == 0.4491398401088468d);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        double double1 = org.apache.commons.math.util.FastMath.log(192.2131105221355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2586047071241335d + "'", double1 == 5.2586047071241335d);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.066379232596407d, 1.6847038494719164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8867998942728866d + "'", double2 == 0.8867998942728866d);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3964729204944982d + "'", double1 == 0.3964729204944982d);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 601302);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4292036732051034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1548399088885177d + "'", double1 == 1.1548399088885177d);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.640412574791911d, 0.5230715269149525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8859114568793057d + "'", double2 == 0.8859114568793057d);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9645397928556648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074087d + "'", double1 == 1.4422495703074087d);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.688523605579533E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5424860955797707E22d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        float float2 = org.apache.commons.math.util.FastMath.max(28.0f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8646647167633873d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.055287372175112d), 0.010671955722607658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5606838283221867d) + "'", double2 == (-1.5606838283221867d));
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        double double1 = org.apache.commons.math.util.FastMath.asinh(601302.1420828041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.000000000001384d + "'", double1 == 14.000000000001384d);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5754413816841691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.970362527679605d + "'", double1 == 32.970362527679605d);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.10332511048643829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10369438987766068d + "'", double1 == 0.10369438987766068d);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6412553438258041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        double double1 = org.apache.commons.math.util.FastMath.asinh(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.69310178011491d + "'", double1 == 10.69310178011491d);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4143028416180226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1783563265944834d + "'", double1 == 2.1783563265944834d);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.852392823283385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6164782213367697d + "'", double1 == 0.6164782213367697d);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1659350422353596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1659350422353596d + "'", double1 == 1.1659350422353596d);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2723278394410604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9865282378222304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8718154580485049d + "'", double1 == 0.8718154580485049d);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.7156361224559d + "'", double1 == 201.7156361224559d);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.594421546054633d + "'", double1 == 31.594421546054633d);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.001970935890733557d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000019422947715d + "'", double1 == 1.0000019422947715d);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.691673596021443E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021443E41d + "'", double1 == 6.691673596021443E41d);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4667411450004123E-10d, 1.2543319811638522d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.627459987478598E-13d + "'", double2 == 4.627459987478598E-13d);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.046174103647121E-4d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        int int2 = org.apache.commons.math.util.FastMath.max((-53), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.4415943645925386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9518155064321638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5904082957457892d + "'", double1 == 2.5904082957457892d);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.4221817809573358E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4221817811941835E-5d + "'", double1 == 2.4221817811941835E-5d);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8700016166449096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13926020912269435d) + "'", double1 == (-0.13926020912269435d));
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.564317279302414E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.564317279302414E38d + "'", double1 == 3.564317279302414E38d);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1270.8610568525928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.840596973007444d + "'", double1 == 7.840596973007444d);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.03529934148039703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.452233396427968d) + "'", double1 == (-1.452233396427968d));
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.49617539953860107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5167863873761607d + "'", double1 == 0.5167863873761607d);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4200548580917883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4477586330788777d + "'", double1 == 0.4477586330788777d);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.740687539890472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2715542753135176d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        double double1 = org.apache.commons.math.util.FastMath.log1p(16.350231202722476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8536058321094107d + "'", double1 == 2.8536058321094107d);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        int int2 = org.apache.commons.math.util.FastMath.min(89, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 74L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 74L + "'", long2 == 74L);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        double double1 = org.apache.commons.math.util.FastMath.acos(439.50133562451674d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.125588153733179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.9209970573119084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21881082522809006d + "'", double1 == 0.21881082522809006d);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        double double2 = org.apache.commons.math.util.FastMath.min(11014.999999999998d, 0.9845506032000481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9845506032000481d + "'", double2 == 0.9845506032000481d);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.42706130231652d + "'", double1 == 89.42706130231652d);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.542524056185831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5638735088551485d + "'", double1 == 0.5638735088551485d);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.03756258900618957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03757142776318948d + "'", double1 == 0.03757142776318948d);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7490362681090366d, 0.015085296975380387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7490362681090365d + "'", double2 == 0.7490362681090365d);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.006281968213695d, (-1.8985248817088516d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3286054827537064d + "'", double2 == 2.3286054827537064d);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948954d + "'", double1 == 1.5707963267948954d);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1916485442408997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8310894464081642d + "'", double1 == 0.8310894464081642d);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.14858898277219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5943169106002987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6364160121609366d + "'", double1 == 0.6364160121609366d);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        double double1 = org.apache.commons.math.util.FastMath.floor(12.232006459765387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.0d + "'", double1 == 12.0d);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.9073513337952335d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        double double1 = org.apache.commons.math.util.FastMath.exp(12.232006459765389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 205254.60431215185d + "'", double1 == 205254.60431215185d);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        double double1 = org.apache.commons.math.util.FastMath.abs(56.33799391295282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.33799391295282d + "'", double1 == 56.33799391295282d);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9556244815546298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6707095703362789d + "'", double1 == 0.6707095703362789d);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5940920277793489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.811385510344456d + "'", double1 == 1.811385510344456d);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.651907619133025d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.055287372175112d) + "'", double1 == (-1.055287372175112d));
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9999999999882881d), 1.0171533999278615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.999999999988288d) + "'", double2 == (-0.999999999988288d));
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        double double1 = org.apache.commons.math.util.FastMath.log((-27.657308694642932d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.01706766071317347d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9508218731216449d + "'", double1 == 0.9508218731216449d);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        double double2 = org.apache.commons.math.util.FastMath.min(3.403648339910223d, 103.00961449578338d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.403648339910223d + "'", double2 == 3.403648339910223d);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-171.88733853924697d) + "'", double1 == (-171.88733853924697d));
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2975000227598567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.0038848218538872d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        double double1 = org.apache.commons.math.util.FastMath.log(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2307682298545886d + "'", double1 == 2.2307682298545886d);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        long long1 = org.apache.commons.math.util.FastMath.abs(102L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 102L + "'", long1 == 102L);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4798640040970981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0702966298025378d + "'", double1 == 1.0702966298025378d);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.852392823283385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1938614780827772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.368072233840639d + "'", double1 == 0.368072233840639d);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3337230008031363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3470120302787675d + "'", double1 == 0.3470120302787675d);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.840596973007444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.748370426540489d + "'", double1 == 2.748370426540489d);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8247892170023737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7344047376585783d + "'", double1 == 0.7344047376585783d);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9830787956514045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.326265919629385d + "'", double1 == 56.326265919629385d);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.005299577531174295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30364342573864755d + "'", double1 == 0.30364342573864755d);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 57);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.13360428992833798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14294045709815814d + "'", double1 == 0.14294045709815814d);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.4987086185814076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.498708618581408d + "'", double1 == 2.498708618581408d);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.3870041092853976d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37741578664099856d) + "'", double1 == (-0.37741578664099856d));
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-2.980984492908097d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7850896760339817d + "'", double1 == 0.7850896760339817d);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, (long) 969);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9290452453166923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37897255609534153d + "'", double1 == 0.37897255609534153d);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.008837747659931517d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999609473623371d + "'", double1 == 0.9999609473623371d);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.416347758287445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        long long2 = org.apache.commons.math.util.FastMath.min((-3L), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        double double1 = org.apache.commons.math.util.FastMath.log10(12.240517442917666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0877997771113341d + "'", double1 == 1.0877997771113341d);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3774620981682702d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.073578558640289d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2053667352260216d + "'", double1 == 2.2053667352260216d);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 102);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 102.0f + "'", float1 == 102.0f);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, 4252L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6190869198926165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48186236064945037d + "'", double1 == 0.48186236064945037d);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.46026355771252025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4313562476010705d + "'", double1 == 0.4313562476010705d);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.986323777050765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1918237706995551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020801248902241158d + "'", double1 == 0.020801248902241158d);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.583313058969097d + "'", double1 == 22.583313058969097d);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1317761108019555d + "'", double1 == 2.1317761108019555d);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.606218482252364d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7469280195077934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9659700754028167d) + "'", double1 == (-0.9659700754028167d));
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2601990116806102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0340431846930802d + "'", double1 == 1.0340431846930802d);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3688545382643078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.93084548259936d + "'", double1 == 3.93084548259936d);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.08619966571131166d), 0.8837332115237154d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09723278831166944d) + "'", double2 == (-0.09723278831166944d));
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994957367078d + "'", double1 == 0.9149994957367078d);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.465566310769166E8d, 1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796319870359d + "'", double2 == 1.570796319870359d);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.374981066404604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9283350632110237d + "'", double1 == 2.9283350632110237d);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8683270054592955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6250433809417831d + "'", double1 == 0.6250433809417831d);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        double double1 = org.apache.commons.math.util.FastMath.sin((-33.47108260928763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8849732592528778d) + "'", double1 == (-0.8849732592528778d));
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0776903657094035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8227734086052096d + "'", double1 == 0.8227734086052096d);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4426335746777788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        double double1 = org.apache.commons.math.util.FastMath.tanh(102.39369977975828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        double double1 = org.apache.commons.math.util.FastMath.signum(435.6527582312547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.43087067877290774d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        double double1 = org.apache.commons.math.util.FastMath.sin(74.93583069052579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44609108351134635d) + "'", double1 == (-0.44609108351134635d));
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4128308409485173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9320568499896043d + "'", double1 == 1.9320568499896043d);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.4492542898406535d, 0.6726669944799356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.128309020755677d + "'", double2 == 3.128309020755677d);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4260624389053682d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2968911060773807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        int int2 = org.apache.commons.math.util.FastMath.min(74, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        long long1 = org.apache.commons.math.util.FastMath.round(8.000000000000009d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.2423647281479279d), 1.4163477582874449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4163477582874449d + "'", double2 == 1.4163477582874449d);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 181.9027613448098d + "'", double1 == 181.9027613448098d);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.027978420033734935d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02798207039044345d) + "'", double1 == (-0.02798207039044345d));
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.01706766071317347d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017066832172509233d) + "'", double1 == (-0.017066832172509233d));
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9659976907478611d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0134681161954513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9712667366571679d), 0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9712667366571679d) + "'", double2 == (-0.9712667366571679d));
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5940920277793489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8286570837797791d + "'", double1 == 0.8286570837797791d);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3276291673075579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.327629167307558d + "'", double1 == 0.327629167307558d);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171473774587547d + "'", double1 == 0.9171473774587547d);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-7.090523728538517E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.090524322671557E-4d) + "'", double1 == (-7.090524322671557E-4d));
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6, 102.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.570491709370399d, 0.024066581448410507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5704917093703987d + "'", double2 == 1.5704917093703987d);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        int int2 = org.apache.commons.math.util.FastMath.max(12, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        long long2 = org.apache.commons.math.util.FastMath.max(8L, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6944137478171459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012119806270522783d + "'", double1 == 0.012119806270522783d);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.42180106329902095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.135365503154222d + "'", double1 == 1.135365503154222d);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        double double1 = org.apache.commons.math.util.FastMath.log10(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.956626286028327E-180d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.44609108351134635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.9950915100179344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.306852817378903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5506.616391951779d + "'", double1 == 5506.616391951779d);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9101657252259991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.7542080484400255d + "'", double1 == 5.7542080484400255d);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4664332861696255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8931779295345256d + "'", double1 == 0.8931779295345256d);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.21749753606973166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21921638985458616d + "'", double1 == 0.21921638985458616d);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 72, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        int int1 = org.apache.commons.math.util.FastMath.abs(1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24497082768837525d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000013d + "'", double1 == 2.0000000000000013d);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8685285336718198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6251512407242175d + "'", double1 == 0.6251512407242175d);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        double double1 = org.apache.commons.math.util.FastMath.sin(34.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5290826861200238d + "'", double1 == 0.5290826861200238d);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5451401275587432d, 0.050742853286975496d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4779815485926806d + "'", double2 == 1.4779815485926806d);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5374184941250892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        double double2 = org.apache.commons.math.util.FastMath.atan2(153.91803466365488d, 0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5679504995664342d + "'", double2 == 1.5679504995664342d);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 28);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5606838283221867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0009549590653368d) + "'", double1 == (-1.0009549590653368d));
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5597919847479074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5597919847479075d + "'", double1 == 0.5597919847479075d);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.029840280115945614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        long long1 = org.apache.commons.math.util.FastMath.round(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) 601302);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3887317335324654d + "'", double1 == 1.3887317335324654d);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.857734145372121E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.304380986415101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.959077249105675d + "'", double1 == 4.959077249105675d);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 89, 102L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89L + "'", long2 == 89L);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        long long1 = org.apache.commons.math.util.FastMath.round(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.924924246850124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9249242468501242d + "'", double1 == 1.9249242468501242d);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        double double1 = org.apache.commons.math.util.FastMath.sin((-6.923689900271567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5976000972965376d) + "'", double1 == (-0.5976000972965376d));
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999998508398554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.461870527159005E-4d + "'", double1 == 5.461870527159005E-4d);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.013388602139994326d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.696065812452068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.251020534531953d + "'", double1 == 2.251020534531953d);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5321159072301354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2124468960126986d) + "'", double1 == (-1.2124468960126986d));
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.2146848510894015E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000421468493d + "'", double1 == 1.0000000421468493d);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.103458524115279d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.113278222196781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.077242024715385d + "'", double1 == 4.077242024715385d);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        long long1 = org.apache.commons.math.util.FastMath.round(0.05723320573453926d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.959077249105675d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7008869622428106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7642704897432505d + "'", double1 == 0.7642704897432505d);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9224287714823782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7450694027549438d + "'", double1 == 0.7450694027549438d);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707963267929435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45158270528821143d + "'", double1 == 0.45158270528821143d);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0760956615136925d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.06070344440102943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.07428299663566632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07435148197226377d + "'", double1 == 0.07435148197226377d);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.09485891347262353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09485891347262354d + "'", double1 == 0.09485891347262354d);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.22283193883788277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22468060813060853d + "'", double1 == 0.22468060813060853d);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        long long1 = org.apache.commons.math.util.FastMath.abs(77703727489273L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 77703727489273L + "'", long1 == 77703727489273L);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 6, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        double double1 = org.apache.commons.math.util.FastMath.asinh(73.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.983653531524327d + "'", double1 == 4.983653531524327d);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        double double1 = org.apache.commons.math.util.FastMath.ulp(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.403648339910223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.073618929049104d + "'", double1 == 30.073618929049104d);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9046745947545269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.652593359483139d), 0.5476523162282666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8726093545129302d) + "'", double2 == (-0.8726093545129302d));
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.881373587019543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130532941206644d + "'", double1 == 1.2130532941206644d);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        double double1 = org.apache.commons.math.util.FastMath.asinh(192.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.950649334202769d + "'", double1 == 5.950649334202769d);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        double double1 = org.apache.commons.math.util.FastMath.log(2.103458524115279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7435829062953471d + "'", double1 == 0.7435829062953471d);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5477745439281119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.742299409068664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 12, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4161468365471422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42920367320510316d) + "'", double1 == (-0.42920367320510316d));
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0605708583360886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06053388199816653d + "'", double1 == 0.06053388199816653d);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.42751178833719056d, 0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7575096507365445d + "'", double2 == 0.7575096507365445d);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8311436343658638d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7920437201135672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2079041565509856d + "'", double1 == 1.2079041565509856d);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        double double2 = org.apache.commons.math.util.FastMath.max(3.855146420814101d, 4.946997808922293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.946997808922293d + "'", double2 == 4.946997808922293d);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        double double1 = org.apache.commons.math.util.FastMath.abs((-28.72385800275325d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.72385800275325d + "'", double1 == 28.72385800275325d);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.24748960330606537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6064430404542255d) + "'", double1 == (-0.6064430404542255d));
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        double double1 = org.apache.commons.math.util.FastMath.rint(28.725283738478314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.0d + "'", double1 == 29.0d);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        double double1 = org.apache.commons.math.util.FastMath.cos(27.377021598522727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.623713080974777d) + "'", double1 == (-0.623713080974777d));
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.02287085931419646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3104404468750332d + "'", double1 == 0.3104404468750332d);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7207960780149949d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8489971012995244d + "'", double1 == 0.8489971012995244d);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7592181952216696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0850660077377812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        double double1 = org.apache.commons.math.util.FastMath.abs((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3878540873687678d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38785408736876786d + "'", double2 == 0.38785408736876786d);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5228075827238494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.954667987513222d + "'", double1 == 29.954667987513222d);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 74);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 74.0f + "'", float1 == 74.0f);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2189018535383644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1979503333433301d + "'", double1 == 0.1979503333433301d);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        long long1 = org.apache.commons.math.util.FastMath.round(4.8104773809653505d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4690168630587714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02563918102769422d + "'", double1 == 0.02563918102769422d);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.008798582499187173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008798355458637962d) + "'", double1 == (-0.008798355458637962d));
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1248.1525277673024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.766863822439706d + "'", double1 == 10.766863822439706d);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7080612825215288d + "'", double1 == 0.7080612825215288d);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.72122548872678d + "'", double1 == 0.72122548872678d);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        double double1 = org.apache.commons.math.util.FastMath.cosh(401613.8070818261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7901955581184713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9245098189301155d + "'", double1 == 0.9245098189301155d);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 12L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        double double2 = org.apache.commons.math.util.FastMath.max(102.00000000000001d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.00000000000001d + "'", double2 == 102.00000000000001d);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2228498343677317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2228498343677317d + "'", double1 == 0.2228498343677317d);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.02563918102769422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025633564382238294d + "'", double1 == 0.025633564382238294d);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707963267929435d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.948148009134062E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9815477015624721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9907308926052887d + "'", double1 == 0.9907308926052887d);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7340722322122621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6803562319377844d + "'", double1 == 0.6803562319377844d);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0760956615136925d, 0.8675380076947303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07609566151369251d + "'", double2 == 0.07609566151369251d);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14436016288910877d) + "'", double1 == (-0.14436016288910877d));
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4021802218490915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1841369100948975d + "'", double1 == 1.1841369100948975d);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8640917881917065d, 2.3499748049257176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7094426789644694d + "'", double2 == 0.7094426789644694d);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        double double1 = org.apache.commons.math.util.FastMath.sin((-14.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9906073556948704d) + "'", double1 == (-0.9906073556948704d));
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9674630275799633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6312605490481655d + "'", double1 == 1.6312605490481655d);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        double double2 = org.apache.commons.math.util.FastMath.max(0.20785406859215974d, (-1.9754930146748417d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20785406859215974d + "'", double2 == 0.20785406859215974d);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9568614257960677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.671341876400475d + "'", double1 == 0.671341876400475d);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707952637376879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999999435d + "'", double1 == 0.999999999999435d);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.0937355862524263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8322083902453671d, (-0.28442109966604967d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.832208390245367d + "'", double2 == 0.832208390245367d);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2583723393689585d, (-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2583723393689583d + "'", double2 == 1.2583723393689583d);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3348502961992308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9444595170440677d + "'", double1 == 0.9444595170440677d);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        double double1 = org.apache.commons.math.util.FastMath.log1p(62.945847461890764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158036591778788d + "'", double1 == 4.158036591778788d);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-2L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5189448670992995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.733350684767274d) + "'", double1 == (-29.733350684767274d));
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.9971422632833347E7d), (-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9971422632833347E7d) + "'", double2 == (-2.9971422632833347E7d));
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.696065812452068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2592664089300267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5860134523134185E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.17540341900446965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19172688492398907d + "'", double1 == 0.19172688492398907d);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6027624231806457d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        long long2 = org.apache.commons.math.util.FastMath.min(56L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.035284687279155354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6494073147094549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.774273095146928d + "'", double1 == 0.774273095146928d);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4417418312298101d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9410106931720924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5889715304774968d + "'", double1 == 0.5889715304774968d);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 250.82519887411394d + "'", double1 == 250.82519887411394d);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6590624120079316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4169370418200143d) + "'", double1 == (-0.4169370418200143d));
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.2285327801518604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 184.98130232233967d + "'", double1 == 184.98130232233967d);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.3383296635310251d), 3.970242640033142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.970242640033142d + "'", double2 == 3.970242640033142d);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.146655416868485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2146015535359855d + "'", double1 == 2.2146015535359855d);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5860134523134308E15d, 1.7621186826519104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5860134523134305E15d + "'", double2 == 1.5860134523134305E15d);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        long long1 = org.apache.commons.math.util.FastMath.round(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.656854249492381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7615940933123242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615940933123242d + "'", double1 == 0.7615940933123242d);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9645397928556648d, 0.014686439244896977d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9645397928556647d + "'", double2 == 0.9645397928556647d);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.07165345917579712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07153108232841508d + "'", double1 == 0.07153108232841508d);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5993925892227773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.185078726658764d + "'", double1 == 1.185078726658764d);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        double double1 = org.apache.commons.math.util.FastMath.cos(286.8254711556916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5893521169987908d) + "'", double1 == (-0.5893521169987908d));
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3365629458057544d) + "'", double1 == (-0.3365629458057544d));
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.2171749524547d + "'", double1 == 192.2171749524547d);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.374981066404604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1636242869208895d + "'", double1 == 0.1636242869208895d);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.3981687043439948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9217725892681158d + "'", double1 == 0.9217725892681158d);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9139954154840256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2970310479543554d + "'", double1 == 1.2970310479543554d);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        double double1 = org.apache.commons.math.util.FastMath.log(2.6644140673107377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9799841712722461d + "'", double1 == 0.9799841712722461d);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        double double1 = org.apache.commons.math.util.FastMath.cosh(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1556157735575975E15d + "'", double1 == 2.1556157735575975E15d);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.077242024715385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.620554677378945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9983225672924982d) + "'", double1 == (-1.9983225672924982d));
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.17063287284085768d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7592181952216696d, 1.343298655311511d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7592181952216697d + "'", double2 == 0.7592181952216697d);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6871254771677591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5961321820676713d + "'", double1 == 0.5961321820676713d);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1224236947215338d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        double double1 = org.apache.commons.math.util.FastMath.floor(86.42366562500264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.0d + "'", double1 == 86.0d);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4168587241160415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4168587241160415d + "'", double1 == 1.4168587241160415d);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 969L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 969.0f + "'", float1 == 969.0f);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6476017675391463d, 1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4903679999195601d + "'", double2 == 0.4903679999195601d);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 56L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.821297790542173E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.9872832367514643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.86294216295647d + "'", double1 == 113.86294216295647d);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0010894137496062042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10289579273129601d + "'", double1 == 0.10289579273129601d);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        double double1 = org.apache.commons.math.util.FastMath.expm1(147.41315910257657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0488697448867254E64d + "'", double1 == 1.0488697448867254E64d);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6212891090067325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.430982375386799d + "'", double1 == 2.430982375386799d);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.18422346241992235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18528174380196655d + "'", double1 == 0.18528174380196655d);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0025761453442203607d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4102002216622384d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.12363060526841456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0076520022715454d + "'", double1 == 1.0076520022715454d);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        double double2 = org.apache.commons.math.util.FastMath.min(57.00945208926645d, (-0.9218565439993888d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9218565439993888d) + "'", double2 == (-0.9218565439993888d));
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.1317761108019555d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1248L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1248.0f + "'", float2 == 1248.0f);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0171533999278615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7939017241426287d + "'", double1 == 0.7939017241426287d);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.166552341720382d, (-0.12796368962739058d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8104685930289559d + "'", double2 == 0.8104685930289559d);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0034800731177357003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.429982300184234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.62090858658536d + "'", double1 == 1.62090858658536d);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        double double1 = org.apache.commons.math.util.FastMath.asin(28.45884779991685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1759576279657875d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6888366918779438d) + "'", double1 == (-0.6888366918779438d));
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 12, 77703727489273L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77703727489273L + "'", long2 == 77703727489273L);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.017654826942511064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7531365351544583d) + "'", double1 == (-1.7531365351544583d));
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0769647493626147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07414666724177091d + "'", double1 == 0.07414666724177091d);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4491398401088468d, (-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4491398401088468d + "'", double2 == 0.4491398401088468d);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-260.7328491468443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.586331264134198E112d + "'", double1 == 8.586331264134198E112d);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5374184941250892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.433749687851006d + "'", double1 == 2.433749687851006d);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7958192892471013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8825222985596652d + "'", double1 == 0.8825222985596652d);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 232, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8683270054592955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.382920903210355d + "'", double1 == 2.382920903210355d);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5562468617341296d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.15529712916720417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1546795860581682d + "'", double1 == 0.1546795860581682d);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0741466672417709d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3383347192042886E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042886E42d + "'", double1 == 1.3383347192042886E42d);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7615718391387468d, 0.8425647914073723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615718391387468d + "'", double2 == 0.7615718391387468d);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36970320137659857d + "'", double1 == 0.36970320137659857d);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        double double1 = org.apache.commons.math.util.FastMath.atan(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5037794860076608d + "'", double1 == 1.5037794860076608d);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896L, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9227388543494366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.8690419469595d + "'", double1 == 52.8690419469595d);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.570796319870359d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 8L, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5083775167989395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.42366562500266d + "'", double1 == 86.42366562500266d);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.968419268845377E-15d + "'", double1 == 3.968419268845377E-15d);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        double double1 = org.apache.commons.math.util.FastMath.atan(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5664782783423665d + "'", double1 == 1.5664782783423665d);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.41394522878666795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9891437136247577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891437136247578d + "'", double1 == 0.9891437136247578d);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.675911201832825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9534625892455924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4086660150090866d + "'", double1 == 1.4086660150090866d);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.017654826942511064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(164.7986056066652d, 0.9903301413773639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 164.79860560666518d + "'", double2 == 164.79860560666518d);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11013.232874703413d, 0.6099169425432279d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707409464221342d + "'", double2 == 1.5707409464221342d);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5874010519681996d, 99.9949998749938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5874010519681996d + "'", double2 == 1.5874010519681996d);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999998508398554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999998508398555d + "'", double1 == 0.9999998508398555d);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.26661184065549276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6436154751038378d) + "'", double1 == (-0.6436154751038378d));
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.005392346297227792d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.124144993981348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.19172688492398907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21133963666581526d + "'", double1 == 0.21133963666581526d);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7853965042607342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657727238739369d + "'", double1 == 0.6657727238739369d);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        int int1 = org.apache.commons.math.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4190581615792427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43143142265425977d + "'", double1 == 0.43143142265425977d);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        int int2 = org.apache.commons.math.util.FastMath.max(6, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        double double1 = org.apache.commons.math.util.FastMath.ceil(153.91803466365488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 154.0d + "'", double1 == 154.0d);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2470891678547125d) + "'", double1 == (-1.2470891678547125d));
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8718154580485049d, 0.28751871345990776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9613265738253431d + "'", double2 == 0.9613265738253431d);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.07609566151369251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07624305250852768d + "'", double1 == 0.07624305250852768d);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.100704088732632d, (-0.1546606711325055d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9852698656938713d + "'", double2 == 0.9852698656938713d);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09983440995178777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950404679582d + "'", double1 == 0.09950404679582d);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.265902127447376d, (double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5772961402540013d + "'", double2 == 2.5772961402540013d);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.3870041092853976d), 0.16143935615846078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3870041092853975d) + "'", double2 == (-0.3870041092853975d));
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3766010463442277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45732278912476326d + "'", double1 == 0.45732278912476326d);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2135291168781825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.001956526411342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8425264892918983d + "'", double1 == 0.8425264892918983d);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        long long1 = org.apache.commons.math.util.FastMath.round(100.69314718055996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 101L + "'", long1 == 101L);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.5757640260722034d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.200473741977537d) + "'", double1 == (-1.200473741977537d));
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2975569575896544d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9906073556948704d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7464968867258404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5259757919358272d) + "'", double1 == (-0.5259757919358272d));
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.005440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005455062946594065d) + "'", double1 == (-0.005455062946594065d));
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9154330388409943d, 1.143630746302462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9154330388409944d + "'", double2 == 0.9154330388409944d);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.640412574791911d, 4.480699513047791d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14196543421208507d + "'", double2 == 0.14196543421208507d);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7672312144687762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013390710816554902d + "'", double1 == 0.013390710816554902d);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.14196543421208507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14196543421208507d + "'", double1 == 0.14196543421208507d);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4464413322481353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8946344511807994d + "'", double1 == 0.8946344511807994d);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.118237670498366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.45085013506507d + "'", double1 == 61.45085013506507d);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.665329995925052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7382730121798176d + "'", double1 == 2.7382730121798176d);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.018833921356972847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019013538492767164d) + "'", double1 == (-0.019013538492767164d));
    }
}

