import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1072.8715259107928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7401549043526567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8096100974766685d + "'", double1 == 0.8096100974766685d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        double double2 = org.apache.commons.math.util.FastMath.min(3.4089393878627656d, 0.1302020149984197d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1302020149984197d + "'", double2 == 0.1302020149984197d);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4716507100014407d + "'", double1 == 1.4716507100014407d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5737184098997153d, (-3.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9526346953826708d + "'", double2 == 2.9526346953826708d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.3453942544278394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 10L, 0.8990151886161798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8990151886161798d + "'", double2 == 0.8990151886161798d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.6842868307608122d), 0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6842868307608121d) + "'", double2 == (-0.6842868307608121d));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double double1 = org.apache.commons.math.util.FastMath.log(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.134428840403784d) + "'", double1 == (-2.134428840403784d));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double double1 = org.apache.commons.math.util.FastMath.atan((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.369139609590174E-249d) + "'", double1 == (-7.369139609590174E-249d));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.657902518456065d + "'", double1 == 1.657902518456065d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4067132730318201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4032630823831073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4967005954324935d + "'", double1 == 1.4967005954324935d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.238865337353114d) + "'", double1 == (-4.238865337353114d));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.134428840403784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5039744651761873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9178792555725124d + "'", double1 == 0.9178792555725124d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.677071525546346d + "'", double1 == 32.677071525546346d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0376519448740174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08838879722590735d + "'", double1 == 0.08838879722590735d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29540897515091935d + "'", double1 == 0.29540897515091935d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13016197330599633d + "'", double1 == 0.13016197330599633d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.154434690031884d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.467720335926631E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.467720335926633E7d + "'", double1 == 8.467720335926633E7d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-4.2063149707507666E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.34264343564039074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5853575280462281d + "'", double1 == 0.5853575280462281d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.6755933871952235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2743356563668091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1477896);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3023186765274486d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.469446951953614E-18d, (-29.500939575070156d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4694469519536138E-18d + "'", double2 == 3.4694469519536138E-18d);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5556080775287264d), 0.8492204648891346d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5556080775287264d) + "'", double2 == (-1.5556080775287264d));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4865986869679275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.451512686597342d + "'", double1 == 0.451512686597342d);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5496441384595896d + "'", double1 == 0.5496441384595896d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.007582068426303211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0076108850910483d + "'", double1 == 1.0076108850910483d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9209678699858725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1705572581976593d + "'", double1 == 1.1705572581976593d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.7174132092735896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6084929551470779d + "'", double1 == 0.6084929551470779d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double double1 = org.apache.commons.math.util.FastMath.floor(49.80857186097813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1262023.527631695d, 5.637986554446435d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1262023.5276316947d + "'", double2 == 1262023.5276316947d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-53.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3036.676314193363d) + "'", double1 == (-3036.676314193363d));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3665191429188092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3665191429188092d + "'", double1 == 0.3665191429188092d);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2970408931699519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2600854338811875d + "'", double1 == 0.2600854338811875d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7562439223229319d + "'", double1 == 0.7562439223229319d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.015707579305579825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8999780005767564d + "'", double1 == 0.8999780005767564d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.872556723861298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0604117958350738d + "'", double1 == 1.0604117958350738d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7206435247136849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.01645512199317914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1896369513379932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1411917790307853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.38547255349003d + "'", double1 == 65.38547255349003d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36232417902938024d + "'", double1 == 0.36232417902938024d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.3480571885407375d, (-0.9848929415691016d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8568945666481151d + "'", double2 == 1.8568945666481151d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3859684164526524d, 4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796217597235d + "'", double2 == 1.570796217597235d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03552297094428488d + "'", double1 == 0.03552297094428488d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 149);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double double1 = org.apache.commons.math.util.FastMath.asinh(533.2485894339852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.9721357718677766d + "'", double1 == 6.9721357718677766d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046638250970772E-4d) + "'", double1 == (-3.046638250970772E-4d));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double double1 = org.apache.commons.math.util.FastMath.expm1(21.402285933511266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9719444690199132E9d + "'", double1 == 1.9719444690199132E9d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8561074278563534d, (-33.10480098881463d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8561074278563534d + "'", double2 == 0.8561074278563534d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 32.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        long long1 = org.apache.commons.math.util.FastMath.round((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double double1 = org.apache.commons.math.util.FastMath.atan(41.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.546410917622178d + "'", double1 == 1.546410917622178d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        double double2 = org.apache.commons.math.util.FastMath.max(0.516964265655408d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082315d + "'", double2 == 1.5607966601082315d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.9702843181545027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1217719640679913d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.6755933871952235d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8147100190818939d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8147100190818939d + "'", double2 == 0.8147100190818939d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625951d + "'", double1 == 0.9999092042625951d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1262023.5276316947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.741374145600599d + "'", double1 == 14.741374145600599d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.568223576118875d + "'", double1 == 34.568223576118875d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6727467649882994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1031594239427869d + "'", double1 == 1.1031594239427869d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.006492321624085E-46d + "'", double1 == 7.006492321624085E-46d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5716776679087391d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999690299908569d + "'", double1 == 0.999690299908569d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9534903170187385d) + "'", double1 == (-0.9534903170187385d));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3735403569930398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3828227291853379d + "'", double1 == 0.3828227291853379d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9589242746631385d) + "'", double1 == (-0.9589242746631385d));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.121587129297938E-5d + "'", double1 == 3.121587129297938E-5d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7068886140376748d + "'", double1 == 0.7068886140376748d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000009d + "'", double1 == 1.0000000000000009d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4419647419307422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.366006587752973d + "'", double1 == 0.366006587752973d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4541594839761731d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.25457675705027805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26022281860914137d) + "'", double1 == (-0.26022281860914137d));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.9823021454200065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.82951141006688d + "'", double1 == 26.82951141006688d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int int1 = org.apache.commons.math.util.FastMath.abs(149);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2422079676186446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21689041524151353d + "'", double1 == 0.21689041524151353d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948147847987201E13d + "'", double1 == 3.948147847987201E13d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8207422758720628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8096974249238272d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        double double1 = org.apache.commons.math.util.FastMath.expm1(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2949672929999967E9d + "'", double1 == 4.2949672929999967E9d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6076102029351266d + "'", double1 == 0.6076102029351266d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4844415983612418d + "'", double1 == 1.4844415983612418d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int1 = org.apache.commons.math.util.FastMath.round((-36.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09267307410348408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09240868099498095d + "'", double1 == 0.09240868099498095d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        long long1 = org.apache.commons.math.util.FastMath.abs(149L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int int1 = org.apache.commons.math.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0022052222826506643d + "'", double1 == 0.0022052222826506643d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.01659940801285d + "'", double1 == 75.01659940801285d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.9823021454200065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471422d) + "'", double1 == (-0.4161468365471422d));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5564487716492766d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5053378166957041d) + "'", double1 == (-0.5053378166957041d));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8662137645563011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7138320036389565d + "'", double1 == 0.7138320036389565d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.287781549441661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.102022356359888d + "'", double1 == 2.102022356359888d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1393101923868096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4022862643919898d + "'", double1 == 1.4022862643919898d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.01645512199317914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9428090415820637d + "'", double1 == 0.9428090415820637d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.104527494446513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        double double1 = org.apache.commons.math.util.FastMath.cosh(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344058570908125E43d + "'", double1 == 1.344058570908125E43d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double double1 = org.apache.commons.math.util.FastMath.floor(28.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.0d + "'", double1 == 28.0d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.225973768125749E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.03694641438871d) + "'", double1 == (-2.03694641438871d));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3986455375243887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852186120042791d + "'", double1 == 0.9852186120042791d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4964448729282672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4964448729282672d + "'", double1 == 0.4964448729282672d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        double double1 = org.apache.commons.math.util.FastMath.rint((-55.19347301057655d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-55.0d) + "'", double1 == (-55.0d));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950371902099892d + "'", double1 == 0.09950371902099892d);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4119499585462214d + "'", double1 == 1.4119499585462214d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5433007476093571d + "'", double1 == 0.5433007476093571d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        double double1 = org.apache.commons.math.util.FastMath.abs(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1224.999999999999d + "'", double1 == 1224.999999999999d);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.17230617170547374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17316004990268719d) + "'", double1 == (-0.17316004990268719d));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1623266059131168d) + "'", double1 == (-1.1623266059131168d));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.340144407361754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.71836434111332d + "'", double1 == 0.71836434111332d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4161468365471422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3936793927992398d) + "'", double1 == (-0.3936793927992398d));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6076102029351266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8469836352088488d + "'", double1 == 0.8469836352088488d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0589027237910784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0192608780318253d + "'", double1 == 1.0192608780318253d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        double double1 = org.apache.commons.math.util.FastMath.acos(263.856815596594d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011697165240742895d + "'", double1 == 0.011697165240742895d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int1 = org.apache.commons.math.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3327099519782247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34555558058171215d) + "'", double1 == (-0.34555558058171215d));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0022052222826506643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00220521870798839d + "'", double1 == 0.00220521870798839d);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.145976303209723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.145976303209723d + "'", double1 == 1.145976303209723d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.817884356931778d, 43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8178843569317782d + "'", double2 == 1.8178843569317782d);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        double double1 = org.apache.commons.math.util.FastMath.log(0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2554125869476498d) + "'", double1 == (-1.2554125869476498d));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8623188722876837d, 14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11002669683705266d + "'", double2 == 0.11002669683705266d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 84677176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84677176 + "'", int1 == 84677176);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.03274004183787d) + "'", double1 == (-27.03274004183787d));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        float float1 = org.apache.commons.math.util.FastMath.abs(149.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7119840454144415d, 0.3528075633346972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3528075633346972d + "'", double2 == 0.3528075633346972d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9187506059390844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3098650979711013d + "'", double1 == 1.3098650979711013d);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9418502147163486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7360711750351105d + "'", double1 == 0.7360711750351105d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 10L, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.442704017851834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1277423141222618d + "'", double1 == 0.1277423141222618d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1662915285707833d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.08704594528845262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int int1 = org.apache.commons.math.util.FastMath.abs((-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        double double1 = org.apache.commons.math.util.FastMath.ulp(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 5L, 2048.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.298292365610484d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 84677176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int int2 = org.apache.commons.math.util.FastMath.max(149, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6428702637760138d, 1.7360015312242658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3546584070739969d + "'", double2 == 0.3546584070739969d);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.007582068426303211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007582141074206305d + "'", double1 == 0.007582141074206305d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7365898990208962d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7365898990208961d) + "'", double1 == (-0.7365898990208961d));
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1887890305557882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 1586013452313419L, 36.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794874d + "'", double2 == 1.570796326794874d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948937d + "'", double1 == 1.5707963267948937d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        double double1 = org.apache.commons.math.util.FastMath.log10(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7408756471404097d + "'", double1 == 3.7408756471404097d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7023967071298747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4973.752448262787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7853981633974483d), 0.32738201157865865d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1758611674202721d) + "'", double2 == (-1.1758611674202721d));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8686709614860095d), (double) 4L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8686709614860095d) + "'", double2 == (-0.8686709614860095d));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9796686085695417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01709844279797004d + "'", double1 == 0.01709844279797004d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.691649480399157E41d + "'", double1 == 4.691649480399157E41d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.999690299908569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996902999085691d + "'", double1 == 0.9996902999085691d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8469836352088488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7027403004155557d + "'", double1 == 0.7027403004155557d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8691222135114136d + "'", double1 == 1.8691222135114136d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        double double2 = org.apache.commons.math.util.FastMath.min(Double.NEGATIVE_INFINITY, 3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7207960780149949d + "'", double1 == 0.7207960780149949d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.2083157409463713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20535382550526307d) + "'", double1 == (-0.20535382550526307d));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.00499987500626d + "'", double1 == 200.00499987500626d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8205891373082282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9158328057966899d + "'", double1 == 0.9158328057966899d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        double double1 = org.apache.commons.math.util.FastMath.log(2.7130053006861585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9980569874847491d + "'", double1 == 0.9980569874847491d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0057916796039132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0028916589561971d + "'", double1 == 1.0028916589561971d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3092866533194534d + "'", double1 == 1.3092866533194534d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4161468365471422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0028916589561971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6945919658329778d + "'", double1 == 0.6945919658329778d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6842868307608121d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8812099535392037d) + "'", double1 == (-0.8812099535392037d));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3833162101372999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8365164337420498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6839595246897313d + "'", double1 == 0.6839595246897313d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.31271990805652194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9515003168337753d + "'", double1 == 0.9515003168337753d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.1720269046268675E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.172026904626868E15d + "'", double1 == 3.172026904626868E15d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4149733479708179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3819797953382667d) + "'", double1 == (-0.3819797953382667d));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7071067811865476d + "'", double1 == 0.7071067811865476d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0529697638030147E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0529697349609466E-4d + "'", double1 == 2.0529697349609466E-4d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6982469888270821d, 0.2600854338811875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2142337871918323d + "'", double2 == 1.2142337871918323d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(148.80597572185025d, 1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 148.80597572185022d + "'", double2 == 148.80597572185022d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5781043205336559d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1718083212810229d + "'", double1 == 1.1718083212810229d);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7085733084162253d + "'", double1 == 2.7085733084162253d);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        double double1 = org.apache.commons.math.util.FastMath.asin((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9E-324d) + "'", double1 == (-4.9E-324d));
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0866878023604363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8850902108761214d + "'", double1 == 0.8850902108761214d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        long long1 = org.apache.commons.math.util.FastMath.round(6.491429796429747E-8d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.36074528808398093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706517535661036d) + "'", double1 == (-0.01706517535661036d));
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9997631562156873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0287213139346176E-4d) + "'", double1 == (-1.0287213139346176E-4d));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3735403569930398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4528691957923934d + "'", double1 == 1.4528691957923934d);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8355584369206923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5816478800141874d + "'", double1 == 0.5816478800141874d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2600854338811875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2662000369860403d + "'", double1 == 0.2662000369860403d);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.637986554446435d, 3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6586136787048939E-248d + "'", double2 == 1.6586136787048939E-248d);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        long long1 = org.apache.commons.math.util.FastMath.round(0.36792187455389946d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        double double2 = org.apache.commons.math.util.FastMath.atan2(41.0d, (-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5862079620765748d + "'", double2 == 1.5862079620765748d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.383255525197761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3832555251977612d + "'", double1 == 1.3832555251977612d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8096974249238272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014131886009840382d + "'", double1 == 0.014131886009840382d);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3605699210490763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9356959031938922d + "'", double1 == 0.9356959031938922d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        long long1 = org.apache.commons.math.util.FastMath.round(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.592169628316262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-46.780218848748426d) + "'", double1 == (-46.780218848748426d));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9699385298756114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9848545729576582d + "'", double1 == 0.9848545729576582d);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8782070978900169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49869576707799945d + "'", double1 == 0.49869576707799945d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.4089393878627656d, 5506.500045400884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.408939387862766d + "'", double2 == 3.408939387862766d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.224646799147353E-16d) + "'", double1 == (-1.224646799147353E-16d));
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        double double1 = org.apache.commons.math.util.FastMath.floor((-86.33580274416313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-87.0d) + "'", double1 == (-87.0d));
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9991791830426371d, 0.5496441384595896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5496441384595896d + "'", double2 == 0.5496441384595896d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.509011168189731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.421482950910104d + "'", double1 == 45.421482950910104d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        double double1 = org.apache.commons.math.util.FastMath.rint(28.43781006905283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.0d + "'", double1 == 28.0d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.40310869196405E-6d + "'", double1 == 2.40310869196405E-6d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9996915601943024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1747253020465267d + "'", double1 == 1.1747253020465267d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4670602929020584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4670602929020586d + "'", double1 == 1.4670602929020586d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9633078296451878d), (-1.1623266059131168d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.449550274765371d) + "'", double2 == (-2.449550274765371d));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13268.823645422231d + "'", double1 == 13268.823645422231d);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9650846656626807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.354829166979755d) + "'", double1 == (-3.354829166979755d));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0057916796039132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10757413843619565d + "'", double1 == 0.10757413843619565d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        double double1 = org.apache.commons.math.util.FastMath.log10(572.2646479502633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.757596917891017d + "'", double1 == 2.757596917891017d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9039295044086462d) + "'", double1 == (-0.9039295044086462d));
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9428090415820637d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0028916589561971d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.17229614643660981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17403209863049748d) + "'", double1 == (-0.17403209863049748d));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-41.944545124947474d), 55.367870644634905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-41.94454512494747d) + "'", double2 == (-41.94454512494747d));
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.006625404912081631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625453383639586d + "'", double1 == 0.006625453383639586d);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        double double1 = org.apache.commons.math.util.FastMath.ulp(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.2083157409463713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21141003489083832d) + "'", double1 == (-0.21141003489083832d));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        long long1 = org.apache.commons.math.util.FastMath.round(0.14287905018325486d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.03490658503988659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.034913677698806274d) + "'", double1 == (-0.034913677698806274d));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4088493392805228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7629672449812436d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 53L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        long long2 = org.apache.commons.math.util.FastMath.max(1477896L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.81743754137065952E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.81743754137065952E17d + "'", double1 == 1.81743754137065952E17d);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9996915601943024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7614645887194331d + "'", double1 == 0.7614645887194331d);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7473083494263217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410684186499283d + "'", double1 == 0.9410684186499283d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        float float2 = org.apache.commons.math.util.FastMath.max(1.58601345E15f, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.50632862831694E14d + "'", double1 == 3.50632862831694E14d);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53L, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        double double2 = org.apache.commons.math.util.FastMath.min(1.144170023011821E12d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.3327099519782247d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.492549213298881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        float float2 = org.apache.commons.math.util.FastMath.min(8.4677176E7f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2972814671821473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7531517633868128d + "'", double1 == 0.7531517633868128d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8581350785198998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42395198269678414d + "'", double1 == 0.42395198269678414d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7542679379177583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6376882447082454d + "'", double1 == 0.6376882447082454d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2840234699668822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2499984838911211d + "'", double1 == 0.2499984838911211d);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.106976355621385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8029909809443063d + "'", double1 == 0.8029909809443063d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5528548740537169d) + "'", double1 == (-0.5528548740537169d));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.16722627711425445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000000000035623d, 0.7360711750351105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000035623d + "'", double2 == 1.0000000000035623d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.802168607459072E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.301297204502775d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3012972045027746d + "'", double2 == 2.3012972045027746d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.731537741517051d + "'", double1 == 1.731537741517051d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.015388982106145104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015389589518436777d) + "'", double1 == (-0.015389589518436777d));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.927002471590281d, 630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4691042679891E-6d + "'", double2 == 1.4691042679891E-6d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6839595246897313d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.41671114415975286d, (-1.2245999714347802d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8136000602258506d + "'", double2 == 2.8136000602258506d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7615941559557656d, (-0.7076312586751926d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3194821852228826d + "'", double2 == 2.3194821852228826d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.138692313968385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        double double1 = org.apache.commons.math.util.FastMath.acos(1764.9013237338472d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.03172806744895933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.30685281944005d + "'", double1 == 51.30685281944005d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        long long1 = org.apache.commons.math.util.FastMath.round(3.395584147203374d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.727787050299033d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8336269685240393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9335905118403582d + "'", double1 == 0.9335905118403582d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4384640908548959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4255072156514325d + "'", double1 == 0.4255072156514325d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        double double1 = org.apache.commons.math.util.FastMath.sin(20.13501082303189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9595656024571418d + "'", double1 == 0.9595656024571418d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.17062095882471706d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7422561611903524d + "'", double1 == 1.7422561611903524d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8178843569317782d, 42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.602695324119514E10d + "'", double2 == 8.602695324119514E10d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7071067811865476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8408964152537146d + "'", double1 == 0.8408964152537146d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9483570980585009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 265.94345040106276d + "'", double1 == 265.94345040106276d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 11013);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.680915307843775d + "'", double1 == 0.680915307843775d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        double double1 = org.apache.commons.math.util.FastMath.log10((-86.33580274416312d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.224646799147353E-16d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695611777d + "'", double1 == 2.2924316695611777d);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(28.458847799916846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4967005954324934d + "'", double1 == 0.4967005954324934d);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2775176041484217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5607966601082321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2280208110551363d + "'", double1 == 1.2280208110551363d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.912812809961445d, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9128128099614465d + "'", double2 == 3.9128128099614465d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9754001961551925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37704143283445485d + "'", double1 == 0.37704143283445485d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6727467649882994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.71836434111332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5413728739027834d + "'", double1 == 0.5413728739027834d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        long long1 = org.apache.commons.math.util.FastMath.round(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.267909605184542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996074585101945d + "'", double1 == 0.9996074585101945d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.44019367551631d + "'", double1 == 105.44019367551631d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.17230617170547372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8417214224290828d + "'", double1 == 0.8417214224290828d);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        double double1 = org.apache.commons.math.util.FastMath.signum(32.677071525546346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0000000000035623d, 0.5816478800141874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5816478800141874d + "'", double2 == 0.5816478800141874d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.214684851089409E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.35601275854371E-10d + "'", double1 == 7.35601275854371E-10d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8234240479503369d, (-0.9930368739582951d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2127992780965635d + "'", double2 == 1.2127992780965635d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6598581131193938d + "'", double1 == 0.6598581131193938d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.7130053006861585d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8803786840634491d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.494136262764898d + "'", double1 == 0.494136262764898d);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7629672449812436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.682927644892203d + "'", double1 == 10.682927644892203d);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2123899885214408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19259360859684702d + "'", double1 == 0.19259360859684702d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999835160613d + "'", double1 == 0.9999999835160613d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.166594879293176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9194167487484044d + "'", double1 == 0.9194167487484044d);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int int2 = org.apache.commons.math.util.FastMath.min(53, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.01102943176403137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999391764340757d + "'", double1 == 0.9999391764340757d);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.303190128915375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.303190128915376d + "'", double1 == 4.303190128915376d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8492204648891346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        double double2 = org.apache.commons.math.util.FastMath.max(533.252579626545d, 0.6428702637760138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 533.252579626545d + "'", double2 == 533.252579626545d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3598056382824036d + "'", double1 == 0.3598056382824036d);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6912431464778742d) + "'", double1 == (-0.6912431464778742d));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4967005954324934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4636456564559829d, 0.37218765288965655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8943859157098326d + "'", double2 == 0.8943859157098326d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0148369064941645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8449898195469685d + "'", double1 == 0.8449898195469685d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        double double1 = org.apache.commons.math.util.FastMath.expm1(89.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4896128191743455E38d + "'", double1 == 4.4896128191743455E38d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5862079620765748d, 1.0580220586617817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9825536750297795d + "'", double2 == 0.9825536750297795d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075712110370514d + "'", double1 == 0.9075712110370514d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0664977916380836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7258552863206801d + "'", double1 == 0.7258552863206801d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.011028313824087112d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        long long1 = org.apache.commons.math.util.FastMath.round(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        long long1 = org.apache.commons.math.util.FastMath.abs(53L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        double double2 = org.apache.commons.math.util.FastMath.min(0.10757413843619563d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        float float2 = org.apache.commons.math.util.FastMath.max((-36.0f), (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5039744651761873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.138645867274483d + "'", double1 == 2.138645867274483d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.680915307843775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.870594663085938d + "'", double1 == 7.870594663085938d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5068440202380022d), 0.8492499565656627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5068440202380022d) + "'", double2 == (-1.5068440202380022d));
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.421085471520201E-14d + "'", double1 == 1.421085471520201E-14d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.006396965815520881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006396878559837075d + "'", double1 == 0.006396878559837075d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000035623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000035623d + "'", double1 == 1.0000000000035623d);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8081843818082922d + "'", double1 == 0.8081843818082922d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927978d + "'", double1 == 7.211102550927978d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.588870767838961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8337422720523481d), 0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3707603033998556d + "'", double2 == 0.3707603033998556d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5427661770824743d, (-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5203087227471427d + "'", double2 == 0.5203087227471427d);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.017453292519943295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4865986869679275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6267736329042483d + "'", double1 == 0.6267736329042483d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1395.5385071780802d + "'", double1 == 1395.5385071780802d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.07752552270710597d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5506.500045400885d + "'", double1 == 5506.500045400885d);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.81897878766651d + "'", double1 == 42.81897878766651d);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.03490658503988659d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1034722043308d + "'", double1 == 2.1034722043308d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        double double1 = org.apache.commons.math.util.FastMath.sin(10.682927644892203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9515228542117641d) + "'", double1 == (-0.9515228542117641d));
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1164811561836356E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001116543485011d + "'", double1 == 1.0001116543485011d);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9154315634767938d + "'", double1 == 1.9154315634767938d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5520864868395452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42425273282439946d) + "'", double1 == (-0.42425273282439946d));
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.063544614765148E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9699385298756114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5084443253324786d + "'", double1 == 1.5084443253324786d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.16703684659955795d), 0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16703684659955795d) + "'", double2 == (-0.16703684659955795d));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7819722235803451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7185289533415847d + "'", double1 == 0.7185289533415847d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2517998136852422E15d) + "'", double1 == (-2.2517998136852422E15d));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3338138044371112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.346791714598718d) + "'", double1 == (-0.346791714598718d));
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4576692332118569d, 0.5001822598696615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7410435382626417d + "'", double2 == 0.7410435382626417d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6949948789359283d, (-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6949948789359282d + "'", double2 == 0.6949948789359282d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.37704143283445485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6495717774798734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.759528922076245d + "'", double1 == 0.759528922076245d);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 84677176L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 149.0f, 9.306943613116557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6815975305315467E20d + "'", double2 == 1.6815975305315467E20d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9543927957373938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.741765307795082d + "'", double1 == 0.741765307795082d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        long long2 = org.apache.commons.math.util.FastMath.max(11013L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.948148009134001E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6475439282580142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970563481505824d + "'", double1 == 0.9970563481505824d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1563686078816606d + "'", double1 == 2.1563686078816606d);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5802135739451127d + "'", double1 == 0.5802135739451127d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.467720335926633E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.467720335926633E7d + "'", double1 == 8.467720335926633E7d);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0076108850910483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5338823801398158d + "'", double1 == 0.5338823801398158d);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8581350785198998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3913548370833968d + "'", double1 == 1.3913548370833968d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.303190128915376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        int int1 = org.apache.commons.math.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7763568394002489E-15d, 0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7763568394002489E-15d + "'", double2 == 1.7763568394002489E-15d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.637986554446436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.395253677653188d + "'", double1 == 1.395253677653188d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        float float1 = org.apache.commons.math.util.FastMath.abs((-53.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        double double1 = org.apache.commons.math.util.FastMath.acos(11014.999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        double double2 = org.apache.commons.math.util.FastMath.max(4.61512051684126d, 0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61512051684126d + "'", double2 == 4.61512051684126d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8803786840634489d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05533048123192334d) + "'", double1 == (-0.05533048123192334d));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.31271990805652194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3671385529012792d + "'", double1 == 1.3671385529012792d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7615560214388488d, 0.8502126400132274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7932707170776151d + "'", double2 == 0.7932707170776151d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8351015231807235d, 0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8351015231807235d + "'", double2 == 1.8351015231807235d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        double double1 = org.apache.commons.math.util.FastMath.cosh(26.82951141006688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.243255606733117E11d + "'", double1 == 2.243255606733117E11d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.724275869600789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15287769218296615d) + "'", double1 == (-0.15287769218296615d));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.22459997143478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.554464678075398d + "'", double1 == 1.554464678075398d);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        double double1 = org.apache.commons.math.util.FastMath.sin(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9209678699858725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6528291579754729d + "'", double1 == 0.6528291579754729d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.282781601724098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32681535598557454d + "'", double1 == 0.32681535598557454d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006930608146378634d + "'", double1 == 0.006930608146378634d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.15287769218296615d), 0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.26264214809506436d) + "'", double2 == (-0.26264214809506436d));
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }
}

