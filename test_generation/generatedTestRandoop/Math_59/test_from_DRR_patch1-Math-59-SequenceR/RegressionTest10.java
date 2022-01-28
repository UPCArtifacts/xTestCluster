import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7135781201111424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7560246868151357d + "'", double1 == 0.7560246868151357d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double2 = org.apache.commons.math.util.FastMath.min(0.03489241440794944d, (-1.598874411320368d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.598874411320368d) + "'", double2 == (-1.598874411320368d));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.1531011997348775d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.429982300184234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2325551008683924d + "'", double1 == 1.2325551008683924d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.303261342348473d + "'", double1 == 3.303261342348473d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9141034768888819d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4699634275333602d + "'", double1 == 1.4699634275333602d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.470961916843109d + "'", double1 == 1.470961916843109d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8d, 1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7815396418229947d + "'", double2 == 0.7815396418229947d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7601945740163978d + "'", double1 == 0.7601945740163978d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5677016102904182d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4260624389053682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.125588153733179d + "'", double1 == 1.125588153733179d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8221176880717497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0850660077377812d) + "'", double1 == (-0.0850660077377812d));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double double1 = org.apache.commons.math.util.FastMath.asin(55.603735851147455d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-7.1477917752131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992134008473617d) + "'", double1 == (-0.9992134008473617d));
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 74, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.0f + "'", float2 == 74.0f);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        long long1 = org.apache.commons.math.util.FastMath.round(0.47381472041445094d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9849610023458857d + "'", double1 == 0.9849610023458857d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.40723197656493d + "'", double1 == 49.40723197656493d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1469544105044815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.14858898277219d + "'", double1 == 3.14858898277219d);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.3346634130618275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999500037496876d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-260.73284914684433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-260.7328491468443d) + "'", double1 == (-260.7328491468443d));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.8760308014670004d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.21189945982621552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2360236088027983d + "'", double1 == 1.2360236088027983d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49670059543249345d + "'", double1 == 0.49670059543249345d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math.util.FastMath.cos((-14.148409796207115d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011242618201709294d) + "'", double1 == (-0.011242618201709294d));
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double double2 = org.apache.commons.math.util.FastMath.min(2.850573542591402d, 0.4576692332118568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4576692332118568d + "'", double2 == 0.4576692332118568d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double double1 = org.apache.commons.math.util.FastMath.acosh(23.871490496694555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.865393058796651d + "'", double1 == 3.865393058796651d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double double1 = org.apache.commons.math.util.FastMath.atan(968.9859567243174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5697643204608027d + "'", double1 == 1.5697643204608027d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4667411450004126E-10d, 0.4572296218407251d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4667411450004128E-10d + "'", double2 == 1.4667411450004128E-10d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707946637374584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810469380871814d + "'", double1 == 3.810469380871814d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double double1 = org.apache.commons.math.util.FastMath.acosh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644298430695373d + "'", double1 == 4.644298430695373d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7109804067944506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.618057413019478d + "'", double1 == 0.618057413019478d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.967145917811647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.272392748970048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double double2 = org.apache.commons.math.util.FastMath.max(53.0d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.16143935615846078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6123758953651972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6590624120079316d + "'", double1 == 0.6590624120079316d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9495963644937304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016573583125383772d + "'", double1 == 0.016573583125383772d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.6237264565928684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5359784961929428d + "'", double1 == 1.5359784961929428d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        int int1 = org.apache.commons.math.util.FastMath.round(601302.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 601302 + "'", int1 == 601302);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        int int1 = org.apache.commons.math.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7615718391387468d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3042858988353092d + "'", double1 == 1.3042858988353092d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5710488338654254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3019325609863106d + "'", double1 == 2.3019325609863106d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9754001961551926d + "'", double1 == 0.9754001961551926d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double double1 = org.apache.commons.math.util.FastMath.expm1(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042886E42d + "'", double1 == 1.3383347192042886E42d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7330383821741316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13487328493592637d) + "'", double1 == (-0.13487328493592637d));
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6020599913279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6871652368423673d + "'", double1 == 0.6871652368423673d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5297515540876877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7278403355734606d + "'", double1 == 0.7278403355734606d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double2 = org.apache.commons.math.util.FastMath.min(99.9949998749938d, 1.6055965365175096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6055965365175096d + "'", double2 == 1.6055965365175096d);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9988961914845736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1734986436818953d + "'", double1 == 1.1734986436818953d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1295788105004783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 601302, (float) 232L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9447141383035655d) + "'", double1 == (-0.9447141383035655d));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.016390006834163424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3862943611198906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32663425997828094d + "'", double1 == 0.32663425997828094d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.5715810788975264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2347857777188793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2347857777188793d + "'", double1 == 1.2347857777188793d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.009999500037496552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009999666686664915d + "'", double1 == 0.009999666686664915d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.21749753606973166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003796048119391945d + "'", double1 == 0.003796048119391945d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        long long1 = org.apache.commons.math.util.FastMath.round(0.06912789873045781d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-260.73284914684433d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.06254420428363118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06258498876153973d + "'", double1 == 0.06258498876153973d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.035284687279155354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03529933782813994d + "'", double1 == 0.03529933782813994d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.19484471582527388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.163779877214074d) + "'", double1 == (-11.163779877214074d));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.05483113556160754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05488618398122305d + "'", double1 == 0.05488618398122305d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1736535179105314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1896433043060732d + "'", double1 == 1.1896433043060732d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.07616912206432258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8273263794480143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7361243741012383d) + "'", double1 == (-0.7361243741012383d));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8640948048351971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.171221449253997d + "'", double1 == 1.171221449253997d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.138127355756959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6562622370949273d + "'", double1 == 0.6562622370949273d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double double1 = org.apache.commons.math.util.FastMath.acosh(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693147180044656d + "'", double1 == 10.693147180044656d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.166552341720382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0554107498129334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05538239908863498d + "'", double1 == 0.05538239908863498d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6889561611808576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.82358273457349d + "'", double1 == 0.82358273457349d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3744449E7d, 0.1936377322502389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3744448999999998E7d + "'", double2 == 1.3744448999999998E7d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5993925892227773d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.23269263081791292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.332305669662203d) + "'", double1 == (-13.332305669662203d));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2325551008683924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 301.8245171608676d + "'", double1 == 301.8245171608676d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2360236088027983d, 2.9209970573119075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4003037133302731d + "'", double2 == 0.4003037133302731d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        long long1 = org.apache.commons.math.util.FastMath.abs(601302L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 601302L + "'", long1 == 601302L);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.009730277093455045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009730277093455045d + "'", double1 == 0.009730277093455045d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6234354400286537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2066189861637866d + "'", double1 == 1.2066189861637866d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.621304236535399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 207.48544908632314d + "'", double1 == 207.48544908632314d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.030555897991319556d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030546391905364526d) + "'", double1 == (-0.030546391905364526d));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2166443409544712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.539809006499305d + "'", double1 == 1.539809006499305d);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9904394498257181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.874597073387939d + "'", double1 == 0.874597073387939d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        double double1 = org.apache.commons.math.util.FastMath.signum(48.275406513963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.23322795531568172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23760040564294221d + "'", double1 == 0.23760040564294221d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9376658284517877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7341479802631987d + "'", double1 == 0.7341479802631987d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8837815937999987d) + "'", double1 == (-0.8837815937999987d));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6535657774206833d + "'", double2 == 0.6535657774206833d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5189448670992995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5951481772184062d + "'", double1 == 0.5951481772184062d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        float float2 = org.apache.commons.math.util.FastMath.max(28.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.05074285328697551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9073513337952335d + "'", double1 == 2.9073513337952335d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 56L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56L + "'", long2 == 56L);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3293232640668133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0995378951737242d + "'", double1 == 1.0995378951737242d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9992134008473617d), 1.6055965365175096d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.556678137025108d) + "'", double2 == (-0.556678137025108d));
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6077292684620609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010606876695399498d + "'", double1 == 0.010606876695399498d);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.016921204348595564d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.48163722963116584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5004756620265847d + "'", double1 == 0.5004756620265847d);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.09485891347262353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09485891347262353d + "'", double1 == 0.09485891347262353d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        long long1 = org.apache.commons.math.util.FastMath.abs(72L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72L + "'", long1 == 72L);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9015068026836573d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.949477120674141d + "'", double1 == 0.949477120674141d);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 28, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5429496506759195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2183536760450586d + "'", double1 == 1.2183536760450586d);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.9251568576324245d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(435.6527582312547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 435.6527582312548d + "'", double1 == 435.6527582312548d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8550604755770164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.99135647901204d + "'", double1 == 48.99135647901204d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7226995482024658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9132731311485575d + "'", double1 == 0.9132731311485575d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        int int2 = org.apache.commons.math.util.FastMath.max(102, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double2 = org.apache.commons.math.util.FastMath.max(286.13232397513167d, 2.301071078740414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 286.13232397513167d + "'", double2 == 286.13232397513167d);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        double double1 = org.apache.commons.math.util.FastMath.acos((-27.657308694642932d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        double double1 = org.apache.commons.math.util.FastMath.log(192.49154750458044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.260052243696693d + "'", double1 == 5.260052243696693d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1217719640679913d, 0.23316784367214288d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.121771964067991d + "'", double2 == 1.121771964067991d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double double1 = org.apache.commons.math.util.FastMath.log10((-6.923689900271567d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.8318928232769873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 28, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-3.0461741978670873E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.31657693420779E-6d) + "'", double1 == (-5.31657693420779E-6d));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53), (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.20493601665927702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20785406859215974d + "'", double1 == 0.20785406859215974d);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.45964128639085955d, 0.4572296218407251d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7008869622428106d + "'", double2 == 0.7008869622428106d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7593534431810433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9123216663043751d + "'", double1 == 0.9123216663043751d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1784446247204259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2493163641423473d + "'", double1 == 2.2493163641423473d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0137651267062169d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1092738450937532d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.269017577653561d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int int1 = org.apache.commons.math.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.3851125268672118d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.716225035560587d + "'", double1 == 22.716225035560587d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        int int2 = org.apache.commons.math.util.FastMath.min(601302, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7650313545698383d, 0.9950026437156599d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7650313545698384d + "'", double2 == 0.7650313545698384d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0014038147382547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8823658856489495d + "'", double1 == 0.8823658856489495d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.429982300184234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.862332614347913d) + "'", double1 == (-0.862332614347913d));
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double double1 = org.apache.commons.math.util.FastMath.rint((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.0d) + "'", double1 == (-53.0d));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.0741994078890014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.9283350632110237d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5037324957145496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6857099142861606d) + "'", double1 == (-0.6857099142861606d));
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4190581615792427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.564317279302415E38d, 23.624342922017807d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.564317279302414E38d + "'", double2 == 3.564317279302414E38d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        long long1 = org.apache.commons.math.util.FastMath.round(1248.1525277673024d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1248L + "'", long1 == 1248L);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double1 = org.apache.commons.math.util.FastMath.cosh(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.631800352235365E13d + "'", double1 == 2.631800352235365E13d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9816339318384565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1470574868158736d + "'", double1 == 1.1470574868158736d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.007402863214769922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0074303321477398d + "'", double1 == 1.0074303321477398d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.029840281693512497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029849141866779647d + "'", double1 == 0.029849141866779647d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 232L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 232.0f + "'", float2 == 232.0f);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6470434810831891d, 0.4426335746777788d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6470434810831891d + "'", double2 == 0.6470434810831891d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        int int2 = org.apache.commons.math.util.FastMath.min(969, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double double1 = org.apache.commons.math.util.FastMath.cosh(147.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.244348724433776E63d + "'", double1 == 5.244348724433776E63d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double2 = org.apache.commons.math.util.FastMath.max(0.196094775945863d, 0.23511536410737136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23511536410737136d + "'", double2 == 0.23511536410737136d);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7856632231610079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9227388543494366d + "'", double1 == 0.9227388543494366d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.028681504300924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5774265291333989d + "'", double1 == 1.5774265291333989d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2134887868481213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-260.7328491468443d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9006750627339184d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015719745335313357d) + "'", double1 == (-0.015719745335313357d));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.13360428992833798d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13360428992833798d + "'", double1 == 0.13360428992833798d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.009716915305559164d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009716609504211465d) + "'", double1 == (-0.009716609504211465d));
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8685285336718198d, 1.3485292390836008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8685285336718198d + "'", double2 == 0.8685285336718198d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        double double2 = org.apache.commons.math.util.FastMath.pow(49.40723197656493d, 363.7080191456556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.052472826372941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.834910499928412d + "'", double1 == 1.834910499928412d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2110908904786674E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110908904490614E-5d + "'", double1 == 1.2110908904490614E-5d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        long long1 = org.apache.commons.math.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5321159072301354d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2323464040026078d, 0.5165902998982612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1738549976522452d + "'", double2 == 1.1738549976522452d);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8393046750511655d), 0.8247892170023737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8247892170023737d + "'", double2 == 0.8247892170023737d);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8874498938378453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6352266554776078d + "'", double1 == 0.6352266554776078d);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.08609295595102832d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08619966571131166d) + "'", double1 == (-0.08619966571131166d));
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        long long1 = org.apache.commons.math.util.FastMath.round(3.1202790084281963E-20d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.49617539953860107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.051608217838029d + "'", double1 == 1.051608217838029d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.126548815752537d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13530303620439413d) + "'", double1 == (-0.13530303620439413d));
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.2423647281479279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7847698976765096d + "'", double1 == 0.7847698976765096d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.2430112846555396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2430112846555396d + "'", double1 == 0.2430112846555396d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3489961061146645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9755030067211783d + "'", double1 == 0.9755030067211783d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        long long2 = org.apache.commons.math.util.FastMath.max(6L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.06254420428363117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06262594923388143d + "'", double1 == 0.06262594923388143d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0115470718397392d, (double) 56.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.0d + "'", double2 == 56.0d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3106472496723418d + "'", double1 == 1.3106472496723418d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double double1 = org.apache.commons.math.util.FastMath.sin(53.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.28218611354669815d) + "'", double1 == (-0.28218611354669815d));
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.4788975654116d + "'", double1 == 286.4788975654116d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.21749753606973166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21581825027949786d + "'", double1 == 0.21581825027949786d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double double2 = org.apache.commons.math.util.FastMath.min(6.3951915922832345d, 0.4944324908505626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4944324908505626d + "'", double2 == 0.4944324908505626d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3371556133482585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.226902356338711d + "'", double1 == 1.226902356338711d);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4190835757175786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15200797361400648d + "'", double1 == 0.15200797361400648d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.451863517420987d + "'", double1 == 1.451863517420987d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7330957838811774d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.06136814014227283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9981175665769844d + "'", double1 == 0.9981175665769844d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.13530303620439413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9908604999704758d + "'", double1 == 0.9908604999704758d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0434062927185241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8388705877810474d + "'", double1 == 2.8388705877810474d);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8000000000000002d + "'", double1 == 0.8000000000000002d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 52.0f, 0.9465506639355938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7469273663670996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6793873340339733d + "'", double1 == 0.6793873340339733d);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7621186826519104d + "'", double1 == 1.7621186826519104d);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.003480087166787292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003486149700807113d + "'", double1 == 0.003486149700807113d);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5461721541136804d), 0.7235232133665008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6466160762890201d) + "'", double2 == (-0.6466160762890201d));
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.570705526935434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.508969531384463d + "'", double1 == 2.508969531384463d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.711666086263719d + "'", double1 == 8.711666086263719d);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        long long2 = org.apache.commons.math.util.FastMath.max((-3L), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        long long2 = org.apache.commons.math.util.FastMath.min(6L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169578969248166d + "'", double1 == 1.3169578969248166d);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        float float2 = org.apache.commons.math.util.FastMath.min(6.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.823448910981979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6007297138639572d + "'", double1 == 0.6007297138639572d);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0038848218538872d) + "'", double1 == (-1.0038848218538872d));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.01307314909535369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2816949531804002E-4d + "'", double1 == 2.2816949531804002E-4d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999999845347045d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double1 = org.apache.commons.math.util.FastMath.atanh(57.974985279021965d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.322933953041652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.1790330313692486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0768920629340257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7920437201135672d + "'", double1 == 0.7920437201135672d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.0027106267244845546d), 1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0027106267244845546d) + "'", double2 == (-0.0027106267244845546d));
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5535586481244579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.72826651551309d + "'", double1 == 4.72826651551309d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5314237783053722d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double double2 = org.apache.commons.math.util.FastMath.atan2(113.90634361049858d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8425647914073723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9458554527116274d + "'", double1 == 0.9458554527116274d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3671645675901346d + "'", double1 == 0.3671645675901346d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        double double1 = org.apache.commons.math.util.FastMath.acosh(23.512494834056568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8502266359033825d + "'", double1 == 3.8502266359033825d);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.007987835004624685d, 0.5951481772184062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013420784473132975d + "'", double2 == 0.013420784473132975d);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5993925892227773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.774204487989302d + "'", double1 == 0.774204487989302d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5542673435415335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.731618603987917d + "'", double1 == 3.731618603987917d);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        long long1 = org.apache.commons.math.util.FastMath.round(5.206879716514544E22d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 74L, (float) 102);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 102.0f + "'", float2 == 102.0f);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5137540041501325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.4683328494106918d, 2.6234354400286537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.923213899121244d + "'", double2 == 0.923213899121244d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.062378286155180526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06241880999595734d + "'", double1 == 0.06241880999595734d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2396285249797687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23514484519083517d + "'", double1 == 0.23514484519083517d);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7201927932561937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14255122879190266d) + "'", double1 == (-0.14255122879190266d));
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.03529933782813994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0359297553560505d + "'", double1 == 1.0359297553560505d);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        int int2 = org.apache.commons.math.util.FastMath.max(53, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.984871677804444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7981.420465546209d + "'", double1 == 7981.420465546209d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.29225491648198393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.009606545630105158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6766585098840832E-4d) + "'", double1 == (-1.6766585098840832E-4d));
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.4971409420435924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4288764780867376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1275476277311571d + "'", double1 == 1.1275476277311571d);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.17220518926998146d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double double2 = org.apache.commons.math.util.FastMath.max((-53.0d), 0.8144772166995118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8144772166995118d + "'", double2 == 0.8144772166995118d);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.9999999999999d + "'", double1 == 89.9999999999999d);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4374744323806797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9058245155231278d + "'", double1 == 0.9058245155231278d);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.017284521648775933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017434763363561593d + "'", double1 == 0.017434763363561593d);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7659703323114561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26661184065549276d) + "'", double1 == (-0.26661184065549276d));
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2704418874297039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9552316851251946d + "'", double1 == 0.9552316851251946d);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.23514484519083517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4849173591353842d + "'", double1 == 0.4849173591353842d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.850573542591402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.619944404759956d + "'", double1 == 8.619944404759956d);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4161468365471422d), 1.0768920629340257d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4161468365471422d) + "'", double2 == (-0.4161468365471422d));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813382338900342d + "'", double1 == 0.8813382338900342d);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math.util.FastMath.log((-11.163779877214074d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.260491892536774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6211377330821444d + "'", double1 == 1.6211377330821444d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.478987859894819d, 6.890818211544746E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.47898785989482d + "'", double2 == 7.47898785989482d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7456418720467646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.54983443527075d + "'", double1 == 7.54983443527075d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02287085931419646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022872853233396457d + "'", double1 == 0.022872853233396457d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6032754731892245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7767081003756975d + "'", double1 == 0.7767081003756975d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.874689525981298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.5187948896643695d + "'", double1 == 6.5187948896643695d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6944137478171459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9483084103447266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7588728630103169d + "'", double1 == 0.7588728630103169d);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5083775167989393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5083775167989395d + "'", double1 == 1.5083775167989395d);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1469544105044815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9815661949918539d + "'", double1 == 0.9815661949918539d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2697851668076674d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.35351286477594024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3535128647759402d) + "'", double1 == (-0.3535128647759402d));
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 601302, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.013221573872519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.558753971855726d + "'", double1 == 1.558753971855726d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double1 = org.apache.commons.math.util.FastMath.asin(31.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6884941597894443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5238371020216578d + "'", double1 == 0.5238371020216578d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4426.960349240149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38675852063777816d + "'", double1 == 0.38675852063777816d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        double double1 = org.apache.commons.math.util.FastMath.cos(49.40723197656493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6537623290520098d + "'", double1 == 0.6537623290520098d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6921231068842162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.95151244102988d + "'", double1 == 96.95151244102988d);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        long long1 = org.apache.commons.math.util.FastMath.round(0.11886728987977911d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double1 = org.apache.commons.math.util.FastMath.acos(171.78552109133562d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999998081716072d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998081716072d + "'", double2 == 0.9999998081716072d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5550865170854293d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        int int1 = org.apache.commons.math.util.FastMath.abs(72);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.931664488226305d, 0.0760956615136925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1291036219838273d + "'", double2 == 1.1291036219838273d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.46472764886703793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.893943660913561d + "'", double1 == 0.893943660913561d);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3293232640668136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.16461263958305d + "'", double1 == 76.16461263958305d);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        double double1 = org.apache.commons.math.util.FastMath.tanh(104.94395111059707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.704971861977569d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5740524125174076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5464480784323485d + "'", double1 == 0.5464480784323485d);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.1714543991571844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4692177180603943d + "'", double1 == 1.4692177180603943d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math.util.FastMath.tanh(14.709965532085809d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999996657d + "'", double1 == 0.9999999999996657d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double2 = org.apache.commons.math.util.FastMath.min((-28.268076694535583d), 0.9865282378222304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-28.268076694535583d) + "'", double2 == (-28.268076694535583d));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9849610023458857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017190812494679297d + "'", double1 == 0.017190812494679297d);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        double double1 = org.apache.commons.math.util.FastMath.log(0.30802495663275425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.177574471262733d) + "'", double1 == (-1.177574471262733d));
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3682156880790792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1361545657750642d + "'", double1 == 0.1361545657750642d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1915368798022847d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.1546606711325055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-53), (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double double1 = org.apache.commons.math.util.FastMath.sin(56.33799391295282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20911890022670185d) + "'", double1 == (-0.20911890022670185d));
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0542128609568502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.76045768093083d + "'", double1 == 1.76045768093083d);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2474896033060654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24255740539295487d + "'", double1 == 0.24255740539295487d);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4992802918419843d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4970071417221087d + "'", double1 == 0.4970071417221087d);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double1 = org.apache.commons.math.util.FastMath.sinh(13.596393407513997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 401613.8070818261d + "'", double1 == 401613.8070818261d);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.021171773984568765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021168611178002193d) + "'", double1 == (-0.021168611178002193d));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.732511156817248d, 1.0413759433029089E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7325111568172487d + "'", double2 == 3.7325111568172487d);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8823658856489495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0014038147382547d + "'", double1 == 1.0014038147382547d);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41945704196093253d + "'", double1 == 0.41945704196093253d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.01076481464331043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5600313042340759d + "'", double1 == 1.5600313042340759d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.010671753160346287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010671955722607658d + "'", double1 == 0.010671955722607658d);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.21481175810568434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21481175810568434d + "'", double1 == 0.21481175810568434d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7408541755525594d + "'", double1 == 0.7408541755525594d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5331510601832288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.986213958420301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1540392241723758d + "'", double1 == 1.1540392241723758d);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.23443699695760933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.629973850390113d) + "'", double1 == (-0.629973850390113d));
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.05488618398122305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05488618398122306d + "'", double1 == 0.05488618398122306d);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.05723320573453926d, (-12.492756561291529d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05723320573453925d + "'", double2 == 0.05723320573453925d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.015085296975380386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015085296975380387d + "'", double1 == 0.015085296975380387d);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.023100795631244335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5367912817072857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5996370952320068d + "'", double1 == 0.5996370952320068d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.14254654307427825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1430337574877913d + "'", double1 == 0.1430337574877913d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double double1 = org.apache.commons.math.util.FastMath.expm1(88.76920606279324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.56431727930241E38d + "'", double1 == 3.56431727930241E38d);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5206936783915806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.652593359483139d) + "'", double1 == (-0.652593359483139d));
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.06770352567956632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2601990116806102d + "'", double1 == 0.2601990116806102d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.527570075824369d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.272392748970048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5693829901728757d + "'", double1 == 3.5693829901728757d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899276870949834d + "'", double1 == 14.899276870949834d);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6912431464778742d) + "'", double1 == (-0.6912431464778742d));
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.12304367228535418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12242830265849983d + "'", double1 == 0.12242830265849983d);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.007566102995401802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007566102995401802d + "'", double2 == 0.007566102995401802d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.663335481368682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2116145121908508d + "'", double1 == 1.2116145121908508d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0996411683627738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11858991704089483d) + "'", double1 == (-0.11858991704089483d));
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double1 = org.apache.commons.math.util.FastMath.acos((-9.775996303178843d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6066211551353723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1897066164893335d + "'", double1 == 1.1897066164893335d);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 274.42240957076257d + "'", double1 == 274.42240957076257d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6055965365175096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.72385800275325d) + "'", double1 == (-28.72385800275325d));
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.06136814014227283d), 0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8813735870195429d + "'", double2 == 0.8813735870195429d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 74, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-1.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7464968867258404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6412553438258041d) + "'", double1 == (-0.6412553438258041d));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13766929481533965d) + "'", double1 == (-0.13766929481533965d));
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5232861274297399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8661816855396662d + "'", double1 == 0.8661816855396662d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026299389467141204d) + "'", double1 == (-0.026299389467141204d));
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4655663107691658E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-7.1477917752131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999987625243119d) + "'", double1 == (-0.9999987625243119d));
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math.util.FastMath.sinh(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8860316424407535E45d + "'", double1 == 1.8860316424407535E45d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4102002216622384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42180106329902095d + "'", double1 == 0.42180106329902095d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6190869198926165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47950959629665524d) + "'", double1 == (-0.47950959629665524d));
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.2949496123890058d), 57.29577951308242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.29494961238900574d) + "'", double2 == (-0.29494961238900574d));
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.8760308014670004d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.30051681990383783d) + "'", double1 == (-0.30051681990383783d));
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 969.0f, 3.2285327801518604d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 969.0d + "'", double2 == 969.0d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.506365641109771d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2189018535383644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8837332115237154d + "'", double1 == 0.8837332115237154d);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.45593812776599624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34109408846046035d) + "'", double1 == (-0.34109408846046035d));
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.43087067877290774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0942697603279072d + "'", double1 == 1.0942697603279072d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5790325398265608d + "'", double1 == 0.5790325398265608d);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        long long1 = org.apache.commons.math.util.FastMath.round(2.801668109017674d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.2548537240639837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5088925547167915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9855187031417781d + "'", double1 == 0.9855187031417781d);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.865393058796651d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4051799354776308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007071723937102841d + "'", double1 == 0.007071723937102841d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double1 = org.apache.commons.math.util.FastMath.ulp(89.9999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.054079817020544E49d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8837815937999987d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1522840460757315d) + "'", double1 == (-2.1522840460757315d));
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.59779381432197d + "'", double1 == 120.59779381432197d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.755246472440062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5626092871938239d + "'", double1 == 0.5626092871938239d);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.10158570369662134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1069247818724905d + "'", double1 == 1.1069247818724905d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.017212463483081388d), 1.8420998258122976d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        double double2 = org.apache.commons.math.util.FastMath.max(7.569397566060484d, 1.1993938046696928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.569397566060484d + "'", double2 == 7.569397566060484d);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.10713415391836659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.688117141816135E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.951760157141521E27d + "'", double1 == 4.951760157141521E27d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.38675852063777816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1736823502191418d + "'", double1 == 1.1736823502191418d);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math.util.FastMath.log(0.22099213933267595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5096281467273887d) + "'", double1 == (-1.5096281467273887d));
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5137540041501325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8420998258122976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3572397819885393d + "'", double1 == 1.3572397819885393d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        int int1 = org.apache.commons.math.util.FastMath.round(6.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0760956615136925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5757640260722034d) + "'", double1 == (-2.5757640260722034d));
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.015085296975380387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015084724883383442d + "'", double1 == 0.015084724883383442d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), 601302.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 601302.0f + "'", float2 == 601302.0f);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        double double1 = org.apache.commons.math.util.FastMath.asin(57.07606632780374d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.251840827131708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.251840827131708d + "'", double1 == 1.251840827131708d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.443185943576958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.443185943576958d + "'", double1 == 2.443185943576958d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6244090200701623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2013600192616103d + "'", double1 == 1.2013600192616103d);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2285994658896716d + "'", double1 == 0.2285994658896716d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9950026437156599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        int int2 = org.apache.commons.math.util.FastMath.max(74, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        double double1 = org.apache.commons.math.util.FastMath.tanh(57.29577951308243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5029298180234462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29849261488782564d) + "'", double1 == (-0.29849261488782564d));
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3246090892520057d, (-27.657308694642932d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0937355862524263d + "'", double2 == 3.0937355862524263d);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5894902375914016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22952338275768086d) + "'", double1 == (-0.22952338275768086d));
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.9073513337952335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.575441381684169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.575441381684169d + "'", double1 == 0.575441381684169d);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.874689525981298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3691930199870646d + "'", double1 == 1.3691930199870646d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 601302L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508865675E-13d + "'", double1 == 4.547473508865675E-13d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        double double1 = org.apache.commons.math.util.FastMath.acos(103504.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        float float2 = org.apache.commons.math.util.FastMath.min(6.0f, 72.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        double double1 = org.apache.commons.math.util.FastMath.rint(10.55522688394848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7560246868151357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12146402305363105d) + "'", double1 == (-0.12146402305363105d));
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        double double1 = org.apache.commons.math.util.FastMath.log(2.929020930583958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.074668213802979d + "'", double1 == 1.074668213802979d);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.04305126783455d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.328887050212274E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8828125E-4d + "'", double1 == 4.8828125E-4d);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9948635511998325d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.653501741449947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7122015233786483d + "'", double1 == 0.7122015233786483d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3018019822761655d + "'", double1 == 2.3018019822761655d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.22099213933267595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2227953217324957d + "'", double1 == 0.2227953217324957d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double1 = org.apache.commons.math.util.FastMath.asin((-21.168078002603806d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9019228933850969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4643372158399435d + "'", double1 == 1.4643372158399435d);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        double double2 = org.apache.commons.math.util.FastMath.pow(286.00000000000006d, (-0.11886728987977911d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5105266606617173d + "'", double2 == 0.5105266606617173d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(147.4131591025766d, 0.1820513306501462d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 147.41315910257657d + "'", double2 == 147.41315910257657d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003921736500322172d + "'", double1 == 0.003921736500322172d);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        double double1 = org.apache.commons.math.util.FastMath.rint(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1834.0d + "'", double1 == 1834.0d);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.6178334732240378d, 1.558753971855726d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6178334732240376d + "'", double2 == 1.6178334732240376d);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4329395021738325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        long long2 = org.apache.commons.math.util.FastMath.min(72L, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8855630621884312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.083168006029572d + "'", double1 == 1.083168006029572d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.1521778176391675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03756258900618957d + "'", double1 == 0.03756258900618957d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        double double1 = org.apache.commons.math.util.FastMath.log1p(120.59779381432197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.800718826393155d + "'", double1 == 4.800718826393155d);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3330101080431218d, (-0.49652666007064317d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.927360501394206d + "'", double2 == 1.927360501394206d);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        double double2 = org.apache.commons.math.util.FastMath.min(3.6347792607040605d, 0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1411200080598672d + "'", double2 == 0.1411200080598672d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.348459106948174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.878565259273718d + "'", double1 == 1.878565259273718d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) 74);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3042858988353092d, (-1.5331510601832288d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3042858988353092d + "'", double2 == 1.3042858988353092d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        double double1 = org.apache.commons.math.util.FastMath.atan(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        float float1 = org.apache.commons.math.util.FastMath.abs((-53.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6560676710276012d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6681425958947582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5837567576054801d + "'", double1 == 0.5837567576054801d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04050876663449861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0404976959287236d + "'", double1 == 0.0404976959287236d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.6633107195211883d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5416614449118216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9328179793623326d + "'", double1 == 0.9328179793623326d);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.652593359483139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2817983759046143d + "'", double1 == 2.2817983759046143d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9496962111038967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9829427757283234d + "'", double1 == 0.9829427757283234d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.348459106948174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4960576635771723d + "'", double1 == 1.4960576635771723d);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5803861773395896d, 0.052312080781770166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.052312080781770166d + "'", double2 == 0.052312080781770166d);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8726212203028842d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.6237264565928684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06324595785917293d + "'", double1 == 0.06324595785917293d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.0996411683627738d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double1 = org.apache.commons.math.util.FastMath.sin((-7.1477917752131d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7608399440832616d) + "'", double1 == (-0.7608399440832616d));
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(57.29577951308242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000018d + "'", double1 == 1.0000000000000018d);
    }
}

