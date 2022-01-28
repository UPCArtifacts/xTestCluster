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
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5039575531546748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5514523214622923d) + "'", double1 == (-0.5514523214622923d));
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.210535494198567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.505478596660864d + "'", double1 == 4.505478596660864d);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3197768247158532d + "'", double1 == 1.3197768247158532d);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2073305257621814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2073305257621816d + "'", double1 == 1.2073305257621816d);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.07600449429463453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07600449429463454d + "'", double1 == 0.07600449429463454d);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9641154037397511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.62246680578897d + "'", double1 == 2.62246680578897d);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.07600449429463453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07585864817207552d + "'", double1 == 0.07585864817207552d);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3801063813513533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3899113077380959d + "'", double1 == 0.3899113077380959d);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 3280.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.78874590517579d + "'", double1 == 8.78874590517579d);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5330688992857334d, (-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8414709848078965d) + "'", double2 == (-0.8414709848078965d));
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 83);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 83L + "'", long1 == 83L);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6113119967914531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4921478170926629d) + "'", double1 == (-0.4921478170926629d));
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04645474909357235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04648820955616639d + "'", double1 == 0.04648820955616639d);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        double double1 = org.apache.commons.math.util.FastMath.abs(25.339410356026747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.339410356026747d + "'", double1 == 25.339410356026747d);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3290834795645636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12355225978068597d + "'", double1 == 0.12355225978068597d);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.753263026440201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.853009206904207d + "'", double1 == 0.853009206904207d);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.01629691212170672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        double double2 = org.apache.commons.math.util.FastMath.max(263.25696924845715d, 4.505478596660864d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 263.25696924845715d + "'", double2 == 263.25696924845715d);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        double double1 = org.apache.commons.math.util.FastMath.sin(3280.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17634267404187864d + "'", double1 == 0.17634267404187864d);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3899113077380959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4005352753446404d + "'", double1 == 0.4005352753446404d);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        double double1 = org.apache.commons.math.util.FastMath.expm1(47.107771483580954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.875048730083813E20d + "'", double1 == 2.875048730083813E20d);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6186254796916717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20857219642206395d) + "'", double1 == (-0.20857219642206395d));
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091341L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091341L + "'", long1 == 39481480091341L);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7769994643832112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.040617626173774d + "'", double1 == 3.040617626173774d);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.423022573449436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.14964410796935d + "'", double1 == 3.14964410796935d);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.1341992117730424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        double double1 = org.apache.commons.math.util.FastMath.log10(39.40807381381274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5955852079568007d + "'", double1 == 1.5955852079568007d);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        long long1 = org.apache.commons.math.util.FastMath.round(16.21975758172915d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16L + "'", long1 == 16L);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.19546435506906037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19301249470048104d + "'", double1 == 0.19301249470048104d);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2261911708835167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8708761885459468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5138141380889977d + "'", double1 == 0.5138141380889977d);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.19334632705655572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.376224634367275d + "'", double1 == 1.376224634367275d);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.40985124626279884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171801072967319d + "'", double1 == 0.9171801072967319d);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6144289961559061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8486007400083447d + "'", double1 == 0.8486007400083447d);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0752968405690968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0752968405690968d + "'", double1 == 1.0752968405690968d);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7604870043227957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1393178238716182d + "'", double1 == 1.1393178238716182d);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.3079900215284027E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028471562982460605d) + "'", double1 == (-0.028471562982460605d));
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        double double2 = org.apache.commons.math.util.FastMath.min(5729.577951308247d, 1.4142135623730951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4142135623730951d + "'", double2 == 1.4142135623730951d);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-16d + "'", double1 == 8.881784197001254E-16d);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4387689880853682d + "'", double1 == 0.4387689880853682d);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6312239307697934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8073058308799063d + "'", double1 == 0.8073058308799063d);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.14239733028093693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3773557078950005d + "'", double1 == 0.3773557078950005d);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.13417614850536844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7322313444854719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7492038193675175d + "'", double1 == 0.7492038193675175d);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5535566556003668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2464175285996129d + "'", double1 == 1.2464175285996129d);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.09761754175421355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09792939860433146d + "'", double1 == 0.09792939860433146d);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(102.66025548936804d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0026467312379548666d, 0.002115328678700704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9875251938728817d + "'", double2 == 0.9875251938728817d);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2240401467946809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33984885275923643d + "'", double1 == 0.33984885275923643d);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 83, 16L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5608425149227073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5349590412599404d + "'", double1 == 0.5349590412599404d);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5334825240161821d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8218458394920244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        double double1 = org.apache.commons.math.util.FastMath.acosh(75.65910426040207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.019341284360254d + "'", double1 == 5.019341284360254d);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1124045972580494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8385597057989701d + "'", double1 == 0.8385597057989701d);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5574077246549027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.13348192268523312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5110626601792173d + "'", double1 == 0.5110626601792173d);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6944597378512866E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6944597378512866E23d + "'", double1 == 1.6944597378512866E23d);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.929160175351254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6699700266515074d) + "'", double1 == (-2.6699700266515074d));
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        double double2 = org.apache.commons.math.util.FastMath.min(52.3948150358289d, 0.41800148565597645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41800148565597645d + "'", double2 == 0.41800148565597645d);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01030854798077996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9804989946001318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7715216602443777d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.1341992117730424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0428690538615393d) + "'", double1 == (-1.0428690538615393d));
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        long long1 = org.apache.commons.math.util.FastMath.round(23.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 23L + "'", long1 == 23L);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.44699510894891675d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.610933205763345d) + "'", double1 == (-25.610933205763345d));
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.019341284360254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6414234112961992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5703223366017848d + "'", double1 == 0.5703223366017848d);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        long long2 = org.apache.commons.math.util.FastMath.min(41L, 83L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7775220823415316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2516432336066266d) + "'", double1 == (-0.2516432336066266d));
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5108256237659906d), 0.18650080065297936d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2207360540984227d) + "'", double2 == (-1.2207360540984227d));
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8215162026997922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.273944986628134d + "'", double1 == 2.273944986628134d);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        long long2 = org.apache.commons.math.util.FastMath.min(16L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5702509114577314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.233110177319106d + "'", double1 == 1.233110177319106d);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5707963267948966d), 0.6592094219745299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1734524968868303d) + "'", double2 == (-1.1734524968868303d));
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 51);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7023108900190393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8462464419076898d) + "'", double1 == (-0.8462464419076898d));
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.37287332357954484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1886925787525875d + "'", double1 == 1.1886925787525875d);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6632456843634444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8495990210054282d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.116272937678812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.454741536383289d + "'", double1 == 1.454741536383289d);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.410101716065497d, 0.04589025719138692d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5603909883382936d + "'", double2 == 1.5603909883382936d);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        double double1 = org.apache.commons.math.util.FastMath.asinh(22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.795936115902098d + "'", double1 == 3.795936115902098d);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0546274546035364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.42570210740745d + "'", double1 == 60.42570210740745d);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3815006871452328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4011538589357885d + "'", double1 == 0.4011538589357885d);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.22275386159456181d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7621584293004213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3319142862090196d + "'", double1 == 1.3319142862090196d);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.45361203411340467d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1046581985685953d + "'", double1 == 1.1046581985685953d);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1833.4649444186348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.514508134546872d + "'", double1 == 7.514508134546872d);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.003635494454249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003635494454249d + "'", double1 == 1.003635494454249d);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5504171915615343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2224081575243824d + "'", double1 == 1.2224081575243824d);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7456282765000656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7456282765000657d + "'", double1 == 0.7456282765000657d);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.4796647197391239d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1172617738080048d + "'", double1 == 1.1172617738080048d);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5473651378551416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.10701348355876977d), 0.0016003481560184533d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0232263688840315d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5603171037625536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        double double1 = org.apache.commons.math.util.FastMath.asin(27.951773034959196d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1189414060601215d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.23886037395044873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2435651823220197d + "'", double1 == 0.2435651823220197d);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.060399309368239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.4638744139941062d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.954589770191006d) + "'", double1 == (-15.954589770191006d));
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.653029967135041E-13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7061840813690602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1510820764238645d) + "'", double1 == (-0.1510820764238645d));
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7580423413226773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.814343878837711d + "'", double1 == 2.814343878837711d);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.555348061489414d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.1679596500040805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.104278850811079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104278850811079d + "'", double1 == 2.104278850811079d);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5702200276960676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.433780830483027d) + "'", double1 == (-1.433780830483027d));
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.11078857541188203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.681812801731165d + "'", double1 == 1.681812801731165d);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.350812057622624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5834613951988717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5509159758062575d + "'", double1 == 0.5509159758062575d);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        double double2 = org.apache.commons.math.util.FastMath.min(0.005559374061838583d, 0.23066270610605835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005559374061838583d + "'", double2 == 0.005559374061838583d);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1415649026741144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.111071450407016d + "'", double1 == 8.111071450407016d);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6191249712398811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5803227711292354d + "'", double1 == 0.5803227711292354d);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.132294165874122d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.7866720044340358d), 2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7866720044340357d) + "'", double2 == (-0.7866720044340357d));
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1675576188544794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2141329065947826d + "'", double1 == 2.2141329065947826d);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7253825588523148d, 661.9876068032265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0026063609563232015d + "'", double2 == 0.0026063609563232015d);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.435403483148737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41064938824712754d + "'", double1 == 0.41064938824712754d);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5975274432265277d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5352878147661538d) + "'", double1 == (-0.5352878147661538d));
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        double double1 = org.apache.commons.math.util.FastMath.floor(1350.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1350.0d + "'", double1 == 1350.0d);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9186187449731414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.164570593600284d) + "'", double1 == (-1.164570593600284d));
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2754679320391344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.14239733028093693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1428830068633334d + "'", double1 == 0.1428830068633334d);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3030247335881318d + "'", double1 == 2.3030247335881318d);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9455557866374293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9455557866374293d + "'", double1 == 0.9455557866374293d);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 51, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.2891939498759002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34135567102697634d) + "'", double1 == (-0.34135567102697634d));
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2005L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.08620304488139699d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9174079373219536d + "'", double1 == 0.9174079373219536d);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-5), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.8495160374040984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.668644773586124d + "'", double1 == 8.668644773586124d);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3280.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0959035329611d + "'", double1 == 8.0959035329611d);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9251475365964139d), 104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9251475365964138d) + "'", double2 == (-0.9251475365964138d));
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        double double1 = org.apache.commons.math.util.FastMath.log(0.019831596490547193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.9204788308384892d) + "'", double1 == (-3.9204788308384892d));
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.004619531120223835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06796713264677152d + "'", double1 == 0.06796713264677152d);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9114895236038993d + "'", double1 == 3.9114895236038993d);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        double double2 = org.apache.commons.math.util.FastMath.min(32.009338481576d, 0.5268115195427748d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5268115195427748d + "'", double2 == 0.5268115195427748d);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.433780830483027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-82.14959033343958d) + "'", double1 == (-82.14959033343958d));
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2566275487052346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 105L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 105.0f + "'", float1 == 105.0f);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.273736754432579E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5751658111626728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5530969125151965d) + "'", double1 == (-0.5530969125151965d));
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 49);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 49L + "'", long1 == 49L);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.010320479063999152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604756645124758d + "'", double1 == 1.5604756645124758d);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.12236703082541885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6536436208636119d) + "'", double1 == (-0.6536436208636119d));
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2389916350019468d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7436495683290354d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.48654169271239384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46757170178452995d + "'", double1 == 0.46757170178452995d);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.3784176643307493d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-136.27329408551486d) + "'", double1 == (-136.27329408551486d));
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.3947302928006944d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-79.91215933652533d) + "'", double1 == (-79.91215933652533d));
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2023903267012446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.328062579442678d + "'", double1 == 2.328062579442678d);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0866080067999329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.086608006799933d + "'", double1 == 1.086608006799933d);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.5344870970745856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.03476270436970922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03474871156814455d + "'", double1 == 0.03474871156814455d);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (-5.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3574201034116572E28d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        double double1 = org.apache.commons.math.util.FastMath.cos(60.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9524129804151563d) + "'", double1 == (-0.9524129804151563d));
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.007466274221142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6020599913279624d + "'", double1 == 0.6020599913279624d);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6576913458149567d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.725178994914957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5453308102681814d + "'", double1 == 0.5453308102681814d);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8446.151861268154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.041584605696372d + "'", double1 == 9.041584605696372d);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.027413680827173704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027406816704501333d + "'", double1 == 0.027406816704501333d);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9433259196114583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5085350159312789d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3665789367467411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4358324927765946d) + "'", double1 == (-0.4358324927765946d));
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.532080789133015d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.2012013828810146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.035862511757223d + "'", double1 == 9.035862511757223d);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.39165310745452653d, 0.2844895915767354d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9425831650773902d + "'", double2 == 0.9425831650773902d);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9997923526102078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997923526102078d + "'", double1 == 0.9997923526102078d);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.017533279424944842d, 1.199489555435047d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014616243014575953d + "'", double2 == 0.014616243014575953d);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0213710154485947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20637502874300256d + "'", double1 == 0.20637502874300256d);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9586654676184496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6722633574675934d + "'", double1 == 0.6722633574675934d);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999550340122696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414466887303463d + "'", double1 == 0.8414466887303463d);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        double double1 = org.apache.commons.math.util.FastMath.atan(1833.464944418635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702509114577314d + "'", double1 == 1.5702509114577314d);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.091500380984786E248d + "'", double1 == 7.091500380984786E248d);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.055735923596816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9677609086429343d + "'", double1 == 0.9677609086429343d);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.211267075873332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.25199819833424153d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        long long2 = org.apache.commons.math.util.FastMath.max(83L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.149497948085797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8371734872779307d + "'", double1 == 0.8371734872779307d);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5253536785057736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.549855326068054d) + "'", double1 == (-0.549855326068054d));
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9030861493754311d, 1.319776824715853d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8741227025743155d + "'", double2 == 0.8741227025743155d);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.688117141816441E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        double double1 = org.apache.commons.math.util.FastMath.ulp(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9973649157540598d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 564L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 564 + "'", int1 == 564);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        double double1 = org.apache.commons.math.util.FastMath.floor(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.0d + "'", double1 == 137.0d);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9586654676184496d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1598565775321763d, 1.6371840522608367d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6371840522608367d + "'", double2 == 1.6371840522608367d);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.20351781291274756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.660711735633523d) + "'", double1 == (-11.660711735633523d));
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.23934930027803344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24164116587899462d + "'", double1 == 0.24164116587899462d);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.015373606509534388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015373000987645918d + "'", double1 == 0.015373000987645918d);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 51.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7321095807146255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.1312066203280915d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7110135287323527d, 7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7110135287323527d + "'", double2 == 0.7110135287323527d);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3280L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6031002539686936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9440892412430648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5864808031646639d + "'", double1 == 0.5864808031646639d);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8345607153475648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9348683417474852d + "'", double1 == 0.9348683417474852d);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.007843097206448d, 1.5586983311819098d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0078430972064483d + "'", double2 == 1.0078430972064483d);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        int int2 = org.apache.commons.math.util.FastMath.min(105, 105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        long long2 = org.apache.commons.math.util.FastMath.max(16L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.009574147965999787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6710040507981441E-4d + "'", double1 == 1.6710040507981441E-4d);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        double double1 = org.apache.commons.math.util.FastMath.acos(24.19638901669072d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01030818285411862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9868178862183032d) + "'", double1 == (-1.9868178862183032d));
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.85186683311429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2853242860200621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.2457500122259584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5268171949666718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.197874973409682E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.197874973409682E-16d + "'", double1 == 7.197874973409682E-16d);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.11078857541188204d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10487201901113562d) + "'", double1 == (-0.10487201901113562d));
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5877618172544402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8321838344202771d + "'", double1 == 0.8321838344202771d);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9560051261391512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.108429166826756d + "'", double1 == 1.108429166826756d);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.903339110766513d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3280);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3280L + "'", long1 == 3280L);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(21.88870456646193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.888704566461932d + "'", double1 == 21.888704566461932d);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.03538849883217154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034776717477448635d + "'", double1 == 0.034776717477448635d);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9811044999457954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.010320479063999152d, 9.357486930108681d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0011029109585115303d + "'", double2 == 0.0011029109585115303d);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999550340122695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.19546435506906037d, (double) 51L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003832615647318026d + "'", double2 == 0.003832615647318026d);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.03898115247832509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0397508867381076d + "'", double1 == 1.0397508867381076d);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 51L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.009528896040185643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000045400273399d + "'", double1 == 1.000045400273399d);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        int int1 = org.apache.commons.math.util.FastMath.abs(105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 105 + "'", int1 == 105);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3253218418939707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9243999553637673d + "'", double1 == 0.9243999553637673d);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.03602212401092414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.036022124010924146d + "'", double1 == 0.036022124010924146d);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0000000000000069d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        long long2 = org.apache.commons.math.util.FastMath.min(23L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9155494254642262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9155494254642264d + "'", double1 == 0.9155494254642264d);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7380632774182745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8301954736191637d + "'", double1 == 0.8301954736191637d);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5834613951988717d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        int int2 = org.apache.commons.math.util.FastMath.max(41, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.463837428330972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0455841460358557d + "'", double1 == 2.0455841460358557d);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8530464537403997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.66161881444429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0906976775271494d) + "'", double1 == (-0.0906976775271494d));
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.2539945895800114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25399458958001137d) + "'", double1 == (-0.25399458958001137d));
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        double double1 = org.apache.commons.math.util.FastMath.sin(30.295139316469992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.900443140924601d) + "'", double1 == (-0.900443140924601d));
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6633689306847952d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.9836542011042855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2340211944100186d + "'", double1 == 2.2340211944100186d);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7727985235349918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6875573919608692d + "'", double1 == 0.6875573919608692d);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.7552508693369808d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3284999850297097d) + "'", double1 == (-1.3284999850297097d));
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.715226690089201d + "'", double1 == 4.715226690089201d);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4652349587552296d + "'", double1 == 2.4652349587552296d);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.1763025667199225E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.605170185988093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1459660262893476d + "'", double1 == 2.1459660262893476d);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.532679550248382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5617635528052694d) + "'", double1 == (-0.5617635528052694d));
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.13838687427840005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9904398083453424d + "'", double1 == 0.9904398083453424d);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2667091410902068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26064204587279477d + "'", double1 == 0.26064204587279477d);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        double double1 = org.apache.commons.math.util.FastMath.log(2.1162729376788123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7496564932387482d + "'", double1 == 0.7496564932387482d);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06981317007977318d + "'", double1 == 0.06981317007977318d);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5461447186340243d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7351801576829817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7351801576829818d + "'", double1 == 0.7351801576829818d);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2865677866520293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.672061117850454d + "'", double1 == 1.672061117850454d);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 6559, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999092042625952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813093832805758d + "'", double1 == 0.8813093832805758d);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8429018484132338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.493423335506387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 243.08795571058016d + "'", double1 == 243.08795571058016d);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.29393556482342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8414709848078964d, (-0.5309649148733837d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1336958337520535d + "'", double2 == 2.1336958337520535d);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3939063732470823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4156287007687237d + "'", double1 == 0.4156287007687237d);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        double double1 = org.apache.commons.math.util.FastMath.floor(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5108256237659905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49087353345098134d) + "'", double1 == (-0.49087353345098134d));
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 49L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8813417909072616d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5239029773179922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 564);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 564L + "'", long1 == 564L);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 2005);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.296546582489277d + "'", double1 == 8.296546582489277d);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1428790501832544d, 243.08795571058016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.828541871391929E-206d + "'", double2 == 3.828541871391929E-206d);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        long long1 = org.apache.commons.math.util.FastMath.round(58.966624055319045d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 59L + "'", long1 == 59L);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.745295347905096d + "'", double1 == 2.745295347905096d);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        double double2 = org.apache.commons.math.util.FastMath.max(27.289917197127753d, 7.046745412134694E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.046745412134694E21d + "'", double2 == 7.046745412134694E21d);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4558849058654814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4558849058654814d + "'", double1 == 0.4558849058654814d);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.028471562982460605d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7061840813690602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6113119967914532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8188957123469786d + "'", double1 == 0.8188957123469786d);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6186254796916717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7015156767002263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6453762003037252d + "'", double1 == 0.6453762003037252d);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.27774466632759137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5270148634788125d + "'", double1 == 0.5270148634788125d);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.9982229502979716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        int int1 = org.apache.commons.math.util.FastMath.abs(564);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 564 + "'", int1 == 564);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.013709499838954644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013709499838954644d + "'", double1 == 0.013709499838954644d);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.233773586888595E-4d, 0.723945865132188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.233773586888596E-4d + "'", double2 == 7.233773586888596E-4d);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.17993839247941096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.3097104614388d + "'", double1 == 10.3097104614388d);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01687178265730875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.082112717745632d) + "'", double1 == (-4.082112717745632d));
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6392632558071726d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.2516432336066266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00439200296680088d) + "'", double1 == (-0.00439200296680088d));
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1760939939322341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8262159668530399d + "'", double1 == 0.8262159668530399d);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.04645474909357235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35948163331408645d + "'", double1 == 0.35948163331408645d);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.09711515743188391d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.229038087540316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2290380875403162d + "'", double1 == 1.2290380875403162d);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2216038060437409d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0246547722204353d + "'", double1 == 1.0246547722204353d);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        int int1 = org.apache.commons.math.util.FastMath.abs((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.12355225978068597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4980621791103912d + "'", double1 == 0.4980621791103912d);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267948597d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948597d + "'", double2 == 1.5707963267948597d);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        int int2 = org.apache.commons.math.util.FastMath.min(41, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        long long1 = org.apache.commons.math.util.FastMath.abs(564L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 564L + "'", long1 == 564L);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.3947554940834146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3947554940834146d + "'", double1 == 2.3947554940834146d);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-4.082112717745632d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7538462758109956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6374379826580956d + "'", double1 == 0.6374379826580956d);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.06650537637061356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06655449936435871d + "'", double1 == 0.06655449936435871d);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.04282343610080969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0437535893767107d + "'", double1 == 1.0437535893767107d);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8714941266556386d + "'", double1 == 0.8714941266556386d);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6399701756875782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6027956124760251d + "'", double1 == 0.6027956124760251d);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.46134103366334883d, 0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4613410336633489d + "'", double2 == 0.4613410336633489d);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9978058928475745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9978058928475746d + "'", double1 == 0.9978058928475746d);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.2516432336066267d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24769059955591424d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.460098179352684E-61d + "'", double2 == 2.460098179352684E-61d);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.871344335656985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9551743979912148d + "'", double1 == 0.9551743979912148d);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0005784555913422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7198546886525898d + "'", double1 == 1.7198546886525898d);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.2166539525524803d), 47.29016150730573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47.29016150730573d + "'", double2 == 47.29016150730573d);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8495990210054282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6149688701950827d + "'", double1 == 0.6149688701950827d);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.004371427760138506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004371413837605624d) + "'", double1 == (-0.004371413837605624d));
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.788723182374376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.6497656628571593d, 9.921070790142847d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6497656628571598d + "'", double2 == 2.6497656628571598d);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.949874371066198d, 1.5781356913552531d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.949874371066196d + "'", double2 == 9.949874371066196d);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0291617385510083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5155373047016657d + "'", double1 == 0.5155373047016657d);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.05723171521667502d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.058934747875747824d) + "'", double1 == (-0.058934747875747824d));
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        int int1 = org.apache.commons.math.util.FastMath.round(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2973397658232583E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.433209317616326E-4d + "'", double1 == 7.433209317616326E-4d);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, 41.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        double double2 = org.apache.commons.math.util.FastMath.min(1.323818048994663d, 2453.035678413897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.323818048994663d + "'", double2 == 1.323818048994663d);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.04746076762388862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.673070199735257E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7521480895180586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8513156925057356d + "'", double1 == 0.8513156925057356d);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9782600344876317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.659824210914969d + "'", double1 == 1.659824210914969d);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        double double1 = org.apache.commons.math.util.FastMath.floor(25.339410356026747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.0d + "'", double1 == 25.0d);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3967916312027995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3967916312027995d + "'", double1 == 1.3967916312027995d);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 105);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 105L + "'", long1 == 105L);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.505149978319906d + "'", double1 == 1.505149978319906d);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481480091341E13d + "'", double1 == 3.9481480091341E13d);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3678794411714424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3859684164526524d + "'", double1 == 0.3859684164526524d);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.10680934945016536d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14287905018325436d + "'", double1 == 0.14287905018325436d);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.9704971179648552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 112.90116840207851d + "'", double1 == 112.90116840207851d);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 6559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6559 + "'", int2 == 6559);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        int int2 = org.apache.commons.math.util.FastMath.min(564, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8708761885459468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.897530082122074d + "'", double1 == 49.897530082122074d);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9791014009461632d, 1.85186683311429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.85186683311429d + "'", double2 == 1.85186683311429d);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6723302958523574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7960541419625132d) + "'", double1 == (-0.7960541419625132d));
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.015372395508685268d, 0.8675168507333922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01537239550868527d + "'", double2 == 0.01537239550868527d);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1181978802114079d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5573206367260493d + "'", double1 == 1.5573206367260493d);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.019233140238467443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019233140238467443d + "'", double1 == 0.019233140238467443d);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7523557927644398d, (-0.23839534114633812d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7523557927644396d + "'", double2 == 0.7523557927644396d);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        double double1 = org.apache.commons.math.util.FastMath.tanh(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999986171d + "'", double1 == 0.9999999999986171d);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7418580584129385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2880308692059894d + "'", double1 == 1.2880308692059894d);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.997695297953666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5422402091037605d + "'", double1 == 0.5422402091037605d);
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.1598639151884341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14774023931602442d) + "'", double1 == (-0.14774023931602442d));
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.2169902071303054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0386937785988949d + "'", double1 == 0.0386937785988949d);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        double double1 = org.apache.commons.math.util.FastMath.cos(6558.851092551817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7007356854557378d + "'", double1 == 0.7007356854557378d);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7960541419625132d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0215423270882085d) + "'", double1 == (-1.0215423270882085d));
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3665789367467411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0035414009098218d) + "'", double1 == (-1.0035414009098218d));
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.81474976710651E13d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8513156925057356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7722395858224873d + "'", double1 == 0.7722395858224873d);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.996575062024539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04540802173355351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04539243181516313d + "'", double1 == 0.04539243181516313d);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0241519893614606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21934170111404294d + "'", double1 == 0.21934170111404294d);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-56.79384064119056d), 0.013709499838954644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-56.793840641190556d) + "'", double2 == (-56.793840641190556d));
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        double double1 = org.apache.commons.math.util.FastMath.tanh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        long long1 = org.apache.commons.math.util.FastMath.round(423.3617290541267d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 423L + "'", long1 == 423L);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5154762810024204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4412763792520879d, 0.9599742401453463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43087065683043346d + "'", double2 == 0.43087065683043346d);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.225663992422657E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2351647362715017E-22d + "'", double1 == 4.2351647362715017E-22d);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0103622330573048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.555341406963346d + "'", double1 == 1.555341406963346d);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8193243886355482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.22275386159456181d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.762856139609669d) + "'", double1 == (-12.762856139609669d));
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.010308913146243286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308913146243288d + "'", double1 == 0.010308913146243288d);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5108256237659907d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7993878774634113d) + "'", double1 == (-0.7993878774634113d));
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.549855326068054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4229667139836814d) + "'", double1 == (-0.4229667139836814d));
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        double double1 = org.apache.commons.math.util.FastMath.sinh(85.7720556895209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.89816576053034E36d + "'", double1 == 8.89816576053034E36d);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8685511210994623d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.99836867862969d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.635078747156649E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9966951177756361d, 0.1719235979111335d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1719235979111335d + "'", double2 == 0.1719235979111335d);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3883463677593004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6231744280370468d + "'", double1 == 0.6231744280370468d);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 41, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41.0f + "'", float2 == 41.0f);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        double double1 = org.apache.commons.math.util.FastMath.atan(40.19388753718691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5459220533768827d + "'", double1 == 1.5459220533768827d);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4109596116102156d), 2.1336958337520535d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.7182818284590833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6574544541530924d + "'", double1 == 1.6574544541530924d);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.29332775741353423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2853242860200621d) + "'", double1 == (-0.2853242860200621d));
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4412763792520879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4280814682575263d + "'", double1 == 0.4280814682575263d);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.43197869742047307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4466855876047785d + "'", double1 == 0.4466855876047785d);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9940685753209271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9088339535934766d + "'", double1 == 2.9088339535934766d);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        double double1 = org.apache.commons.math.util.FastMath.cos(39.553439924312926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2797481297895811d) + "'", double1 == (-0.2797481297895811d));
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.17952899969001357d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8626058962062866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14779735940306246d) + "'", double1 == (-0.14779735940306246d));
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5703223366017848d, 0.03160459413510747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5703223366017848d + "'", double2 == 0.5703223366017848d);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3843321925803553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9452141955055743d + "'", double1 == 0.9452141955055743d);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8486007400083447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3821943911181127d + "'", double1 == 1.3821943911181127d);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8078050296186562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3444074476423187d + "'", double1 == 1.3444074476423187d);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.96401705137022d + "'", double1 == 1.96401705137022d);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        long long2 = org.apache.commons.math.util.FastMath.min(423L, (long) 105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105L + "'", long2 == 105L);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5531156729965456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.726172474886776d + "'", double1 == 4.726172474886776d);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5270148634788125d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2793905035922931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2758777218403646d) + "'", double1 == (-0.2758777218403646d));
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        double double1 = org.apache.commons.math.util.FastMath.acosh(198.57204013738647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.984292797180407d + "'", double1 == 5.984292797180407d);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.10680934945016536d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 10, (double) (-5.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0d) + "'", double2 == (-5.0d));
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8096121846576995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.24703638249282d + "'", double1 == 2.24703638249282d);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1535902666964596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15239934810316752d + "'", double1 == 0.15239934810316752d);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9973649157540598d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.144800307128534d) + "'", double1 == (-57.144800307128534d));
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0046089101124813904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5661874003651408d + "'", double1 == 1.5661874003651408d);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779513083126d + "'", double1 == 57.295779513083126d);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.62246680578897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02831738776533292d + "'", double1 == 0.02831738776533292d);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0291617385510083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7997684970217422d + "'", double1 == 0.7997684970217422d);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948963d) + "'", double1 == (-1.5707963267948963d));
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.641588833612778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.37799345256664757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3970879285236157d + "'", double1 == 0.3970879285236157d);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.330865530703539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 83);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.9088339535934766d, (-0.017278628635716543d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.908833953593476d + "'", double2 == 2.908833953593476d);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 32L, 0.5960035785549811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5521733681683334d + "'", double2 == 1.5521733681683334d);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        double double2 = org.apache.commons.math.util.FastMath.min(4.6151205168412615d, 1.3649537293954457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3649537293954457d + "'", double2 == 1.3649537293954457d);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8135279227115656d + "'", double1 == 0.8135279227115656d);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9492691029357998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9827954002360538d + "'", double1 == 0.9827954002360538d);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        int int2 = org.apache.commons.math.util.FastMath.min(83, 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4762920118769467d + "'", double1 == 1.4762920118769467d);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-5));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.23839534114633812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.25399458958001137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22430400112373985d) + "'", double1 == (-0.22430400112373985d));
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7166721312869937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2180909242787736d + "'", double1 == 1.2180909242787736d);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31935253978810063d + "'", double1 == 0.31935253978810063d);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5585053606381853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 2005.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7823520969736951d + "'", double1 == 0.7823520969736951d);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 23L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 23.0f + "'", float1 == 23.0f);
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.034315407113705d, (double) 41.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.417228033924948E12d + "'", double2 == 4.417228033924948E12d);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2490457723982544d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1610795826858162d, 0.7061840813690602d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1112313968983183d + "'", double2 == 1.1112313968983183d);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 6559L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5617635528052694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5092847441426026d) + "'", double1 == (-0.5092847441426026d));
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.12333144183930954d, 1.423022573449436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08645261777847496d + "'", double2 == 0.08645261777847496d);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.028730419947965d, 1.3876206984207269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.028730419947964d + "'", double2 == 7.028730419947964d);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8094792583202497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2467377120274041d + "'", double1 == 1.2467377120274041d);
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9773206322293114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3574158419544753d + "'", double1 == 1.3574158419544753d);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.745721284698821E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.745721284698821E-14d + "'", double1 == 6.745721284698821E-14d);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        long long1 = org.apache.commons.math.util.FastMath.round((-5.349415927420927d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }
}

