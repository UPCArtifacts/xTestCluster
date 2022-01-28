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
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8443635619146716E-5d + "'", double1 == 4.8443635619146716E-5d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 34.999996f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.0468426300829488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9956802361437771d, 0.9162635558949132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9162635558949132d + "'", double2 == 0.9162635558949132d);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7669541186975021d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7669541186975022d + "'", double1 == 0.7669541186975022d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5690448415576774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.802059275094712d + "'", double1 == 4.802059275094712d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        int int2 = org.apache.commons.math3.util.FastMath.max(13, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.862318872287684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9286112600478652d + "'", double1 == 0.9286112600478652d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.8837563087406048d), 0.9228674459840319d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8837563087406048d + "'", double2 == 0.8837563087406048d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874927409906d + "'", double1 == 10.017874927409906d);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7771211630872562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013563322982800443d + "'", double1 == 0.013563322982800443d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.0741994506493335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 35840.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.554368000990087d + "'", double1 == 4.554368000990087d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-4.741450291257945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-10L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int int1 = org.apache.commons.math3.util.FastMath.abs(212);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 212 + "'", int1 == 212);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9.536743E-7f, 2.9932229419742513d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.993222941974403d + "'", double2 == 2.993222941974403d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.38991804378757267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-6.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.999999999999999d) + "'", double1 == (-5.999999999999999d));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.19611984407111288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.14748365E9f, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 97, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-23), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-23.0f) + "'", float2 == (-23.0f));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 63);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double double1 = org.apache.commons.math3.util.FastMath.rint(57.29577951308244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8342244122679194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9133588628069033d + "'", double1 == 0.9133588628069033d);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5703319211292674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5703319211292674d + "'", double1 == 1.5703319211292674d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672744d) + "'", double1 == (-0.9171523356672744d));
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 19.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1145.9154809786196d + "'", double1 == 1145.9154809786196d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.271066547867196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1302022567062957d + "'", double1 == 0.1302022567062957d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1619462940944618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8601661668175334d + "'", double1 == 0.8601661668175334d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 20);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 20L + "'", long1 == 20L);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.838266827E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9975706724882751d + "'", double1 == 0.9975706724882751d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(7.657351729889458E92d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3364599966985454E91d + "'", double1 == 1.3364599966985454E91d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.0590452297311184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 52L, (-511));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.756674360448215E-153d + "'", double2 == 7.756674360448215E-153d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.8809094881441946E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.65333863364665d + "'", double1 == 26.65333863364665d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.18710109962234836d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.6193427181221283d), 0.8342244122679194d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-8192.0f), (float) 8);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8192.0f + "'", float2 == 8192.0f);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.3999655238984033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4917732662280124d + "'", double1 == 0.4917732662280124d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(9.011035410141817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8192.00000000002d + "'", double1 == 8192.00000000002d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-10.000001f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-10.0f) + "'", float1 == (-10.0f));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.6318307327098474d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011027526601075071d) + "'", double1 == (-0.011027526601075071d));
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0000169231422558d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        float float1 = org.apache.commons.math3.util.FastMath.abs(Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double double1 = org.apache.commons.math3.util.FastMath.exp(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161737E43d + "'", double1 == 2.6881171418161737E43d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-18), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-0.25000003f), (-0.02869849442074743d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2500000298023224d) + "'", double2 == (-0.2500000298023224d));
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.4359738E10f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-6.4851835E18f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(8.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(13.282283863634309d, 10240);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-24.191690961245197d), (-1.4313637641589874d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-24.191690961245197d) + "'", double2 == (-24.191690961245197d));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1899855841769411d, (-15));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07359943766515718d + "'", double2 == 0.07359943766515718d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-8.042848410283348d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2139218826786786E-4d + "'", double1 == 3.2139218826786786E-4d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207034E-4f + "'", float1 == 1.2207034E-4f);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.775557561562892E-17d + "'", double1 == 2.775557561562892E-17d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.8880249E22f, 0.473814720414451d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.8880248E22f + "'", float2 == 1.8880248E22f);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2082.2337273666712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8007788119282551d) + "'", double1 == (-0.8007788119282551d));
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.10567738618806241d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.07359943766515718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(10.00000038146972d, (-0.9811077006099485d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.00000038146972d) + "'", double2 == (-10.00000038146972d));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.5705521861747473d), 0.9999999999999981d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.004433615348723692d, 1.5159112760417044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002924711213094991d + "'", double2 == 0.002924711213094991d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        int int2 = org.apache.commons.math3.util.FastMath.max((-7), (-18));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.15555771015911288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.394408050322395d + "'", double1 == 0.394408050322395d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        float float1 = org.apache.commons.math3.util.FastMath.abs(57.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        long long2 = org.apache.commons.math3.util.FastMath.min(4L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        double double1 = org.apache.commons.math3.util.FastMath.sin(9.999978065515825E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999978065515825E-24d + "'", double1 == 9.999978065515825E-24d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.15784367794247295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.3364599966985454E91d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.661538308752004E-256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.661538308752004E-256d + "'", double1 == 1.661538308752004E-256d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-17), (float) 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.0f) + "'", float2 == (-17.0f));
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.2755538279996634d, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5688884569999159d + "'", double2 == 0.5688884569999159d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.004921566601151844d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004921526865299477d) + "'", double1 == (-0.004921526865299477d));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(52.0d, 2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.07100014498407d + "'", double2 == 52.07100014498407d);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.8414709848078964d), 2.7711415651109443d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(9.999978065515825E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999978065515825E-24d + "'", double1 == 9.999978065515825E-24d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-511), 0.9618775004334906d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-64), (long) 13);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(9.010913332378127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.888490349608754d + "'", double1 == 2.888490349608754d);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6) + "'", int2 == (-6));
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(20.951580740511496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1200.4371505588886d + "'", double1 == 1200.4371505588886d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-20), (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.912139617126407E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.718281504414619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.25398147417648104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.3369954337691163d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3369954337691163d + "'", double2 == 1.3369954337691163d);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.000583639724013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 402.6643192868472d + "'", double1 == 402.6643192868472d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.30033084129497156d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.43368382029253E62d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4336838202925305E62d + "'", double1 == 3.4336838202925305E62d);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        float float1 = org.apache.commons.math3.util.FastMath.abs(4.8828125E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        float float1 = org.apache.commons.math3.util.FastMath.abs(40.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.000004f + "'", float1 == 40.000004f);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-20L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.0f + "'", float1 == 20.0f);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-64L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-63.999996f) + "'", float1 == (-63.999996f));
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(35.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (short) 100, 0.03093515553795393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000478491913d + "'", double2 == 100.00000478491913d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.5199873736154695E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.8171205928321397d), 15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7776.000000000001d) + "'", double2 == (-7776.000000000001d));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.2819493855383146d) + "'", double1 == (-3.2819493855383146d));
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(10239.999f, 1833.464944418635d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10239.998f + "'", float2 == 10239.998f);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double double2 = org.apache.commons.math3.util.FastMath.max(52.0d, 1.1920928244535418E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108653047770426d + "'", double1 == 0.6108653047770426d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8813616205677707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130237194848217d + "'", double1 == 1.2130237194848217d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-35.0f), 1.5625f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.536744E-7f, 4.833101217706723E65d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536745E-7f + "'", float2 == 9.536745E-7f);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2.3722982078608363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.372298207860836d) + "'", double1 == (-2.372298207860836d));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.758188145503637d, 1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000067267875d + "'", double2 == 1.000000067267875d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-2.372298207860836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-135.9226750568748d) + "'", double1 == (-135.9226750568748d));
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.49993310426429d, (-0.6870488395503531d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3094087725881818d) + "'", double2 == (-0.3094087725881818d));
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 3.33289488E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.834862376755318d + "'", double1 == 28.834862376755318d);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.42826253011881144d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4152908733857559d) + "'", double1 == (-0.4152908733857559d));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58456325E29f + "'", float2 == 1.58456325E29f);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-3L), 6.28240466732647E8d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.5625f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2289393579150394d + "'", double1 == 1.2289393579150394d);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 32767.998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 571.90945520504d + "'", double1 == 571.90945520504d);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(7.275957614156956E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.275957614156956E-12d + "'", double1 == 7.275957614156956E-12d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-20.34331808359165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4622081919658138E-9d + "'", double1 == 1.4622081919658138E-9d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        long long2 = org.apache.commons.math3.util.FastMath.min(143L, 4503599627370496L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 143L + "'", long2 == 143L);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(52.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-35.847863339403446d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.6090486460720004d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.59529114079855E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08240259647927115d + "'", double1 == 0.08240259647927115d);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        float float2 = org.apache.commons.math3.util.FastMath.min(61.000004f, 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.547474E-13f + "'", float2 == 4.547474E-13f);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1, (float) (-40));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.0f) + "'", float2 == (-40.0f));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 10L, 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        long long1 = org.apache.commons.math3.util.FastMath.abs(40L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 40L + "'", long1 == 40L);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.25132724169328774d), 2.770311529081762E34d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.072165316244842E-36d) + "'", double2 == (-9.072165316244842E-36d));
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7777181923662889d + "'", double1 == 0.7777181923662889d);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.25261234754667417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004408917195881684d + "'", double1 == 0.004408917195881684d);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1689765108833428E-25d, (-1.8171205928321394d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3513346877207577d + "'", double1 == 2.3513346877207577d);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double double1 = org.apache.commons.math3.util.FastMath.floor(268.5850815956288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 268.0d + "'", double1 == 268.0d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 1.000000238418579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.17540341900446976d, 6.102016471589291E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-51.30611878757968d) + "'", double2 == (-51.30611878757968d));
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-6.4851835E18f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        int int2 = org.apache.commons.math3.util.FastMath.min(15, 143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(8.87638363640206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int int1 = org.apache.commons.math3.util.FastMath.round(512.0001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 512 + "'", int1 == 512);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 24);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 24.000002f + "'", float1 == 24.000002f);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(10240.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.927204076769259d + "'", double1 == 9.927204076769259d);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.026048934789964995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5447444452006056d + "'", double1 == 1.5447444452006056d);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.1175823681357513E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1175823681357513E-22d + "'", double1 == 2.1175823681357513E-22d);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.1411515911684713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.812402071214698d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        int int1 = org.apache.commons.math3.util.FastMath.abs(24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.304165199749413E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-23), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4484615082261164d + "'", double1 == 0.4484615082261164d);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.162447350492738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.311231863899687d + "'", double1 == 2.311231863899687d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        double double2 = org.apache.commons.math3.util.FastMath.pow(Double.NEGATIVE_INFINITY, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.296908309475615d, (-0.38874545763980906d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2969083094756146d + "'", double2 == 3.2969083094756146d);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.331371450960497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.05761413798165514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05758226931636758d + "'", double1 == 0.05758226931636758d);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-18L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        float float2 = org.apache.commons.math3.util.FastMath.min(24.000002f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.000002f + "'", float2 == 24.000002f);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.9073486E-6f, 0.9320815615055481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.665458600832934E-6d + "'", double2 == 4.665458600832934E-6d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.562922473770796d + "'", double1 == 1.562922473770796d);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        long long2 = org.apache.commons.math3.util.FastMath.min(87L, (long) (-17));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17L) + "'", long2 == (-17L));
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-8.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9996645373720975d) + "'", double1 == (-0.9996645373720975d));
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9952731515503572d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.005817747764200268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005834703724610087d + "'", double1 == 0.005834703724610087d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.9879627505659927d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5503919142183956d + "'", double1 == 0.5503919142183956d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 10240, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10240L + "'", long2 == 10240L);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.435973836800001E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.536049848239342d + "'", double1 == 10.536049848239342d);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 23L, (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0018903591682419658d + "'", double2 == 0.0018903591682419658d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double double2 = org.apache.commons.math3.util.FastMath.max((-1.100473137824136d), 4.209318697132464d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.209318697132464d + "'", double2 == 4.209318697132464d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(45.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7467135528742547E19d + "'", double1 == 1.7467135528742547E19d);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        int int2 = org.apache.commons.math3.util.FastMath.max(24, (-41));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, (-0.647849120599649d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6102871923992833E-232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6102871923992833E-232d + "'", double1 == 1.6102871923992833E-232d);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 9.536744E-7f, 3.559984735131298E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002678865837229974d + "'", double2 == 0.002678865837229974d);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.9999999f, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999999f) + "'", float2 == (-0.9999999f));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-23L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 57);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.000004f + "'", float1 == 57.000004f);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.08966792038047539d, 0.7183865300061928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13714617836341506d + "'", double2 == 0.13714617836341506d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-46.999992f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        int int2 = org.apache.commons.math3.util.FastMath.min((-7), (-23));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23) + "'", int2 == (-23));
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.04669075745245177d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.2531288525643591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.192092895507818E-7d), 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.128246484915729E-277d + "'", double2 == 1.128246484915729E-277d);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.932447891572509d + "'", double1 == 6.932447891572509d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-35L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.7763568394002505E-15d, 0.5027863216186397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5330253887606875E-15d + "'", double2 == 3.5330253887606875E-15d);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.4315380019946446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.376365504622054d + "'", double1 == 11.376365504622054d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.552872976779822d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.701561928800418E34d + "'", double2 == 1.701561928800418E34d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.665458600832934E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.281186344074979d, 3.8146899896858893E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570795164200155d + "'", double2 == 1.570795164200155d);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9561803165529644d, 1.0007040209466105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7626497448645183d + "'", double2 == 0.7626497448645183d);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-6.4851835E18f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.024595958627920463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024600919695150193d + "'", double1 == 0.024600919695150193d);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        int int1 = org.apache.commons.math3.util.FastMath.round(45.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1048576.0d + "'", double2 == 1048576.0d);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.950212931632136d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3866586828239366d + "'", double1 == 0.3866586828239366d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.006285734418917205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006285775811039082d) + "'", double1 == (-0.006285775811039082d));
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.1087413143427254E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1087413143427255E15d + "'", double1 == 1.1087413143427255E15d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.2207031189367021E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999925494195d + "'", double1 == 0.9999999925494195d);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        float float1 = org.apache.commons.math3.util.FastMath.abs(20.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.0f + "'", float1 == 20.0f);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.7237368419565787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8837010712667028d + "'", double1 == 0.8837010712667028d);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(6.135079543932437E113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.497152238144289E37d + "'", double1 == 8.497152238144289E37d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.5851764690934549d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.30988320573923506d, 2.135016052687385E72d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30988320573923506d + "'", double2 == 0.30988320573923506d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.579423350941763E21d + "'", double1 == 2.579423350941763E21d);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-8), (double) (-2.68435424E8f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.000000000000002d) + "'", double2 == (-8.000000000000002d));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.8511152085348412d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.09271474921759197d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        long long1 = org.apache.commons.math3.util.FastMath.round(35.000003814697266d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2388667589823472d, 1.0035040531497879d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2397969492211776d + "'", double2 == 1.2397969492211776d);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(9.234056898593499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999809265139d + "'", double1 == 0.9999999809265139d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 35, 7.318351E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.318351E15f + "'", float2 == 7.318351E15f);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-20), (long) 10240);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.17540341900446973d, 0.0017410600350943942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0017410600350943942d + "'", double2 == 0.0017410600350943942d);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.7364591792920476d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7364591792920476d + "'", double2 == 1.7364591792920476d);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.9357051343132584d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.09999999618530295d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.08037538236017183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.4315380019946446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4315380019946446d + "'", double1 == 2.4315380019946446d);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 1, (long) (-511));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double double1 = org.apache.commons.math3.util.FastMath.tan(31.999998092651367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610033007626799d + "'", double1 == 0.6610033007626799d);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.7145812674899705d), 0.5033290854469099d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7145812674899705d) + "'", double2 == (-0.7145812674899705d));
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9999999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999998d + "'", double1 == 0.9999999999999998d);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.24305788136677E-4d, 61);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.610081594096771E-189d + "'", double2 == 7.610081594096771E-189d);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.5199873736154695E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.143536929821772E28d + "'", double1 == 6.143536929821772E28d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.17364817766693033d, 4.092207916817751d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17364817766693036d + "'", double2 == 0.17364817766693036d);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1899855841769411d, 45);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.186889557402761E13d + "'", double2 == 4.186889557402761E13d);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.220703125E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.220703121968351E-4d) + "'", double1 == (-1.220703121968351E-4d));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8621853758445391d, 2.6390573296152584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.676155257307579d + "'", double2 == 0.676155257307579d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double double2 = org.apache.commons.math3.util.FastMath.pow(97.0051545022222d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0051545022222d + "'", double2 == 97.0051545022222d);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        double double2 = org.apache.commons.math3.util.FastMath.log(8.0d, 71.55417527999327d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0536546824812274d + "'", double2 == 2.0536546824812274d);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.3722982078608363d), (-1.912139617126407E10d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        int int1 = org.apache.commons.math3.util.FastMath.abs(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5106521020275598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41254141325141175d + "'", double1 == 0.41254141325141175d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(13.000000953674316d, 0.010200777470529932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.000004955821908d + "'", double2 == 13.000004955821908d);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.4898763788476926E153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        long long1 = org.apache.commons.math3.util.FastMath.abs(511L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 511L + "'", long1 == 511L);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.060135240003378346d, 40);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.611939562281496E10d + "'", double2 == 6.611939562281496E10d);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.0256124219459297E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0014232401139463186d + "'", double1 == 0.0014232401139463186d);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-15));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999996940976795d) + "'", double1 == (-0.9999996940976795d));
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9999999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.9999998f) + "'", float1 == (-0.9999998f));
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        float float2 = org.apache.commons.math3.util.FastMath.min((-40.0f), (float) 45);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.0f) + "'", float2 == (-40.0f));
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-4.0442461145352135E-15d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0442461145352135E-15d + "'", double1 == 4.0442461145352135E-15d);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7788007598613332d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.609844813961006E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.20678401287114d + "'", double1 == 59.20678401287114d);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.833101217706723E65d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.353610478917779E49d + "'", double1 == 9.353610478917779E49d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        int int2 = org.apache.commons.math3.util.FastMath.max(61, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-6.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960170286650366d + "'", double1 == 0.960170286650366d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        float float2 = org.apache.commons.math3.util.FastMath.max((-17.0f), 41984.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 41984.0f + "'", float2 == 41984.0f);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.4778137746277245d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.8528601831630559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.865289009997454d + "'", double1 == 48.865289009997454d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8813735870195446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6098212688914123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.191775238644318d + "'", double1 == 1.191775238644318d);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-2.8438669798515654d), 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-182.0074867105002d) + "'", double2 == (-182.0074867105002d));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.616740316021936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.616740316021936d + "'", double1 == 2.616740316021936d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.1920928955078125E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1920928955078154E-7d) + "'", double1 == (-1.1920928955078154E-7d));
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double double2 = org.apache.commons.math3.util.FastMath.min(2048.500122040519d, (-0.0174532946005379d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0174532946005379d) + "'", double2 == (-0.0174532946005379d));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.995592469141833E14d + "'", double1 == 2.995592469141833E14d);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 34.999996f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 6208L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-16.99798027287595d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 19.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4080838031175255d + "'", double1 == 0.4080838031175255d);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double double2 = org.apache.commons.math3.util.FastMath.pow(26.65333863364665d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7597737298908375E142d + "'", double2 == 3.7597737298908375E142d);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 20, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-40.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1742984407142925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06977848420636461d + "'", double1 == 0.06977848420636461d);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 17L, (-16.99798027287595d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.999998f + "'", float2 == 16.999998f);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.533131499423351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5641241260040846d + "'", double1 == 2.5641241260040846d);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5120.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6685117558576993d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7949487914783152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3329659808899277d + "'", double1 == 1.3329659808899277d);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(9.011035410141817d, 0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.565531390261241d + "'", double2 == 1.565531390261241d);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5535794068709521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1571782580420729d + "'", double1 == 1.1571782580420729d);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(127.0f, 8.318010277546872d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(365942.161553766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.810233304022598d + "'", double1 == 12.810233304022598d);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(90.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.510859506516851d + "'", double1 == 4.510859506516851d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-8.685889667019445E-5d), 1.0000068302124958d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.09254195563405843d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09240992375584216d) + "'", double1 == (-0.09240992375584216d));
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5729.577951308234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.577951308234d + "'", double1 == 5729.577951308234d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 18L, (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-18.0f) + "'", float2 == (-18.0f));
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.0256124219459297E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.68627886E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-1023), 2.9932229419742513d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1023.0d) + "'", double2 == (-1023.0d));
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.5163575235272857E305d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), (long) (-64));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-43L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-15), 48.499992f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double double2 = org.apache.commons.math3.util.FastMath.max(28.59329174674238d, 0.7322058522179385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.59329174674238d + "'", double2 == 28.59329174674238d);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.041914989933878d, 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 15L, (-0.7091551466656096d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.999999f + "'", float2 == 14.999999f);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.22498664000000534d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.115853268365496E-23d + "'", double2 == 2.115853268365496E-23d);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1200795222140087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04924885734225888d + "'", double1 == 0.04924885734225888d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.814697265634252E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146972656527556E-6d + "'", double1 == 3.8146972656527556E-6d);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.2160804420868575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21608044208685753d + "'", double1 == 0.21608044208685753d);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        float float2 = org.apache.commons.math3.util.FastMath.max((-6.0000005f), 5120.0005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5120.0005f + "'", float2 == 5120.0005f);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0000000000727596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805963251d + "'", double1 == 0.6931471805963251d);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.6912431464778742d), (double) 1.58456325E29f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6912431464778742d) + "'", double2 == (-0.6912431464778742d));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.34187232E17f, 7.318351E15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.318351E15f + "'", float2 == 7.318351E15f);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.01737254084242038d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 10240, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.808243886679093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        int int2 = org.apache.commons.math3.util.FastMath.max((-40), (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.6332359729824427d), 1.3807463595665448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6332359729824426d) + "'", double2 == (-0.6332359729824426d));
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double double1 = org.apache.commons.math3.util.FastMath.asin(22025.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2560.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        long long2 = org.apache.commons.math3.util.FastMath.max(4L, 41L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-2.0668574967824482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.120171201020976d) + "'", double1 == (-1.120171201020976d));
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.00818538581289952d), 1.477679266591183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008185385812899518d) + "'", double2 == (-0.008185385812899518d));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.293955920339377E-23d, 4.248291206950246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.248291206950246d + "'", double2 == 4.248291206950246d);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.7170536970566798d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.9417844128659681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8436021399297964d) + "'", double1 == (-2.8436021399297964d));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(40.0d, 1.2533141120942604d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10605158701633144d) + "'", double2 == (-0.10605158701633144d));
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 0, (-2.6843544E8f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.6843544E8f) + "'", float2 == (-2.6843544E8f));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.25398147417648104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5951979603735729d) + "'", double1 == (-0.5951979603735729d));
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.02028853366493086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5505064009954972d + "'", double1 == 1.5505064009954972d);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 4096.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5942493431952255d) + "'", double1 == (-0.5942493431952255d));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.7019294127099711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double double1 = org.apache.commons.math3.util.FastMath.cos(8.227466811481334E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.5707963267948966d), 0.999999995877696d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 0.008710014599470893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 2.7664212902364116d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-40.999996f), 1.877940322113382E-190d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.999992f) + "'", float2 == (-40.999992f));
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.085536923187668d + "'", double1 == 19.085536923187668d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double double2 = org.apache.commons.math3.util.FastMath.log(17.712510971300215d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 143L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        float float1 = org.apache.commons.math3.util.FastMath.signum(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        double double1 = org.apache.commons.math3.util.FastMath.atan(6.397321299277233E146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.19611987703015257d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09805993851507629d + "'", double2 == 0.09805993851507629d);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        int int1 = org.apache.commons.math3.util.FastMath.abs(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 6208.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6208.0d + "'", double1 == 6208.0d);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5120.0d, 1.1873864715321998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010465246845464904d) + "'", double2 == (-0.010465246845464904d));
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.34187215E17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.34187215E17f + "'", float1 == 2.34187215E17f);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-3), 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.429369702178807E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.903337683112112E-4d + "'", double1 == 2.903337683112112E-4d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4L, (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0625f + "'", float2 == 0.0625f);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.8146972656527556E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.814697265671259E-6d + "'", double1 == 3.814697265671259E-6d);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9360721724123813d + "'", double1 == 1.9360721724123813d);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.07145441719841798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        double double2 = org.apache.commons.math3.util.FastMath.pow(11013.237121318984d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.620405376317692E-33d + "'", double2 == 4.620405376317692E-33d);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-5L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        int int2 = org.apache.commons.math3.util.FastMath.max(512, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-43.0f), 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 16.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.05272236634611254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.054136940598407145d + "'", double1 == 0.054136940598407145d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.1411515911684713d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1411515911684713d + "'", double2 == 3.1411515911684713d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0625f, (double) (-2.9999995f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.062499996f + "'", float2 == 0.062499996f);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.283585074390262d + "'", double1 == 0.283585074390262d);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.30146666304021763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7407750251209115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7407750251209116d + "'", double1 == 0.7407750251209116d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-6.4851835E18f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.4975581E11f + "'", float1 == 5.4975581E11f);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.60943642E18f, 0.2637391709123275d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943614E18f + "'", float2 == 4.60943614E18f);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(16.887228676022904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 1.5295813285302078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5295813285302078d + "'", double2 == 1.5295813285302078d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.4598080049531081d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.124936073533697E42d + "'", double2 == 7.124936073533697E42d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 32767.998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.090354829121647d + "'", double1 == 11.090354829121647d);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3077829609715157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.69796608212389d + "'", double1 == 3.69796608212389d);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.691673596021443E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9804641080481076d + "'", double1 == 0.9804641080481076d);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        double double1 = org.apache.commons.math3.util.FastMath.cos(37648.55483291208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9578059059613745d + "'", double1 == 0.9578059059613745d);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.8364287485695048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5667449734836625d) + "'", double1 == (-0.5667449734836625d));
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7683715820310695E-7d + "'", double1 == 4.7683715820310695E-7d);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.6144851831225425d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6721962689631755d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.5321139649540514E7d + "'", double2 == 6.5321139649540514E7d);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8816651612292111d + "'", double1 == 0.8816651612292111d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.086065389836995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        float float2 = org.apache.commons.math3.util.FastMath.min(6207.9995f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 40, (float) (-10));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.2442042457880407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9703300330118789d + "'", double1 == 0.9703300330118789d);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.49205974021214605d, 5.2678316663569955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49205974021214605d + "'", double2 == 0.49205974021214605d);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.3012989023072956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.043637531419156d + "'", double1 == 5.043637531419156d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 4609435868686548992L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.60943587E18f + "'", float1 == 4.60943587E18f);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1787.2171540421934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9396926207858932d) + "'", double1 == (-0.9396926207858932d));
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        double double1 = org.apache.commons.math3.util.FastMath.cos(44.742945770445154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7243890099427566d + "'", double1 == 0.7243890099427566d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.3365629458057544d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-3.0f), (-15));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-9.1552734E-5f) + "'", float2 == (-9.1552734E-5f));
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.027415566677401863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-0.25000003f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004363323650134475d) + "'", double1 == (-0.004363323650134475d));
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        double double1 = org.apache.commons.math3.util.FastMath.exp(25.960191453086704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.880909488144193E11d + "'", double1 == 1.880909488144193E11d);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8212977905417654E24d + "'", double1 == 3.8212977905417654E24d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1787.2171540421934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34202014332571046d + "'", double1 == 0.34202014332571046d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 1.2207031E-4f, (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.220703125E-4d + "'", double2 == 1.220703125E-4d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.680043680710111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.25941230231379d + "'", double1 == 96.25941230231379d);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        int int2 = org.apache.commons.math3.util.FastMath.min((-43), (-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-43) + "'", int2 == (-43));
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.5321139649540514E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.687973453650347d + "'", double1 == 18.687973453650347d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.18710109962234833d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.015050303523504572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5557454550353238d + "'", double1 == 1.5557454550353238d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.9512438653005417d, 101);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0017593314992682E31d + "'", double2 == 1.0017593314992682E31d);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.6032287479334557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.19611984407111288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611984407111288d + "'", double1 == 0.19611984407111288d);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        double double1 = org.apache.commons.math3.util.FastMath.cos(262.6992857325621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36748109589494815d + "'", double1 == 0.36748109589494815d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.903337683112112E-4d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        double double1 = org.apache.commons.math3.util.FastMath.log(263.856815596594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.575406590848711d + "'", double1 == 5.575406590848711d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.3513346877207577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2974079942825565d + "'", double1 == 5.2974079942825565d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7182818284590398d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 40.999992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1048576.0d, 1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1048576.0000018822d + "'", double2 == 1048576.0000018822d);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.061975901106484765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3957378743180247d + "'", double1 == 0.3957378743180247d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.2860082304526745E-4d, (-0.2879033166650653d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1411459730305626d + "'", double2 == 3.1411459730305626d);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5729.578388440339d, 24);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5665489615253144E90d + "'", double2 == 1.5665489615253144E90d);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        double double1 = org.apache.commons.math3.util.FastMath.asin(21.78899910456995d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.4258259770489514E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.42582598E8d + "'", double1 == 2.42582598E8d);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.17364817766693036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18963695133799313d + "'", double1 == 0.18963695133799313d);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-63.999996f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.6197751905438618d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6197751905438618d + "'", double2 == 1.6197751905438618d);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.346544323973411d + "'", double1 == 9.346544323973411d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0204957449291814d, 0.0018277045187202517d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0204973816342562d + "'", double2 == 1.0204973816342562d);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0049215667967173185d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0049215667967173185d + "'", double2 == 0.0049215667967173185d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        double double2 = org.apache.commons.math3.util.FastMath.log((-1.6193427181221283d), (double) 61.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 17);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2153.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.367764623991631d + "'", double1 == 8.367764623991631d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.170182146449354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.72724087083083d + "'", double1 == 64.72724087083083d);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-40), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.60497014597542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.30033084129497156d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4557962137284877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5707962075856141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473221032003d + "'", double1 == 1.1624473221032003d);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.032426843737390965d), 57.29577951308244d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308244d + "'", double2 == 57.29577951308244d);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.897326848573678E-6d, 45);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.371249979920113E8d + "'", double2 == 1.371249979920113E8d);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-2.8436021399297964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3071358425279896d + "'", double1 == 0.3071358425279896d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        int int2 = org.apache.commons.math3.util.FastMath.max((-5), (-15));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 7);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        double double1 = org.apache.commons.math3.util.FastMath.rint(90.89383818121013d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.0d + "'", double1 == 91.0d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.192092966562084E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6469779601696886E-23d + "'", double1 == 2.6469779601696886E-23d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.0787619161000124d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.002243590697762415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0022435944622940323d + "'", double1 == 0.0022435944622940323d);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 2.579423350941763E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        int int1 = org.apache.commons.math3.util.FastMath.abs(45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.25301447720775033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1003725920327005d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-126.99999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 0.062499996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9085973124442547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09585328356979923d) + "'", double1 == (-0.09585328356979923d));
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.15023307534954d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.384185506798576E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3841855067986212E-7d + "'", double1 == 2.3841855067986212E-7d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-5.418539921951662d), 0.9966089419888077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.509428669929031d + "'", double2 == 5.509428669929031d);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-7.105427357601027E-15d), 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.143899130258427E-100d) + "'", double2 == (-9.143899130258427E-100d));
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-41));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.49226446720136663d, 2.2319118908162947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49226446720136663d + "'", double2 == 0.49226446720136663d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        float float1 = org.apache.commons.math3.util.FastMath.abs(510.99997f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 510.99997f + "'", float1 == 510.99997f);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.6931471805599453d, 0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6951219826018177d + "'", double2 == 0.6951219826018177d);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-1023));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.290822861412639d + "'", double1 == 2.290822861412639d);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0406192001624515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.592102649489481d + "'", double1 == 1.592102649489481d);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6098212688914123d, (double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6098212688914123d) + "'", double2 == (-0.6098212688914123d));
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 2.718281954078841d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.6390573296152584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.639057329615259d + "'", double1 == 2.639057329615259d);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8601661668175334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.652311530870404d + "'", double1 == 0.652311530870404d);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.330790212754673E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 343.4678242590538d + "'", double1 == 343.4678242590538d);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        double double1 = org.apache.commons.math3.util.FastMath.rint(97.00317877887012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1.8880248E22f, (-0.7995660637267406d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.888024818894126E22d + "'", double2 == 1.888024818894126E22d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08726646259971647d + "'", double1 == 0.08726646259971647d);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.594928188335995d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        int int2 = org.apache.commons.math3.util.FastMath.min(6, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        float float1 = org.apache.commons.math3.util.FastMath.signum(57.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.8184464592320668d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.05758226931636758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.055985424956187115d + "'", double1 == 0.055985424956187115d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(200.5576604135868d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.5330253887606875E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5330253887606938E-15d + "'", double1 == 3.5330253887606938E-15d);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.9913014866745806d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-12638.443337956485d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 0.5350578961457685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        int int2 = org.apache.commons.math3.util.FastMath.max(32768, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.5578741756804023E80d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8862327999694E40d + "'", double1 == 1.8862327999694E40d);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.041914989933878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.93526894286123d + "'", double1 == 56.93526894286123d);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-2.0f), 1.05149771824736E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707437519090326d) + "'", double2 == (-1.5707437519090326d));
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.0256124219459297E-6d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19) + "'", int1 == (-19));
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 2147483648L, 0.026048934789964995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483648E9d + "'", double2 == 2.147483648E9d);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(10240.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10240.000000000002d + "'", double1 == 10240.000000000002d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        double double2 = org.apache.commons.math3.util.FastMath.pow(51.999996185302734d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.984108686922887E171d + "'", double2 == 3.984108686922887E171d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1200.4371505588886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1200.4371505588888d + "'", double1 == 1200.4371505588888d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(21.715340932759254d, 2.9932229419742513d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.715340932759254d + "'", double2 == 21.715340932759254d);
    }
}

