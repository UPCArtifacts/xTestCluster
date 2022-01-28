import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        long long2 = org.apache.commons.math3.util.FastMath.min(97L, (long) 4096);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.2533141120942604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.812402071214698d + "'", double1 == 0.812402071214698d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(126.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.04665687272850968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046656872728509685d + "'", double1 == 0.046656872728509685d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double1 = org.apache.commons.math3.util.FastMath.sin(128.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7210377105017316d + "'", double1 == 0.7210377105017316d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.08037538236017183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int int1 = org.apache.commons.math3.util.FastMath.round(10239.999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10240 + "'", int1 == 10240);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.22429382749098223d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.799080308109824d + "'", double1 == 0.799080308109824d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-8), (float) (-8));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8.0f) + "'", float2 == (-8.0f));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        float float2 = org.apache.commons.math3.util.FastMath.max(52.0f, 2.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.4495239865639748d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        float float1 = org.apache.commons.math3.util.FastMath.signum(128.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-6), (float) 6208L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0f) + "'", float2 == (-6.0f));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 100, 1.838266827E9d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.00001f + "'", float2 == 100.00001f);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.503599627370496E15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4503599627370496L + "'", long1 == 4503599627370496L);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 35L, (float) 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.4095289050836257d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1044889974911134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.34315092828584d + "'", double1 == 1.34315092828584d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-4.476961205229636d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.476961205229636d + "'", double1 == 4.476961205229636d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-23));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 23.0f + "'", float1 == 23.0f);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.4650191511034982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650191511034985d + "'", double1 == 1.4650191511034985d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double double1 = org.apache.commons.math3.util.FastMath.signum(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.055192158084907385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05372289070732859d + "'", double1 == 0.05372289070732859d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(8.881784197001254E-26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-26d + "'", double1 == 8.881784197001254E-26d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.048297543927715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7364591792920476d + "'", double1 == 1.7364591792920476d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.4658842241887455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16609967099985212d + "'", double1 == 0.16609967099985212d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.856815596594d + "'", double1 == 263.856815596594d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double1 = org.apache.commons.math3.util.FastMath.exp(20.15873679831797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.686278854741452E8d + "'", double1 == 5.686278854741452E8d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1920928955078071E-7d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.6139677044391678d, 0.6389612763136348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7322058522179385d + "'", double2 == 0.7322058522179385d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.49904707604701226d, (double) 1.0000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4990470760470123d + "'", double2 == 0.4990470760470123d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.9999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(96.99999237060548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.9999923706055d + "'", double1 == 96.9999923706055d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double2 = org.apache.commons.math3.util.FastMath.min(35.014282803427776d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.014282803427776d + "'", double2 == 35.014282803427776d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.025974927644697554d), (double) (-2147483648));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.141592653577698d) + "'", double2 == (-3.141592653577698d));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.011443010950958454d), 51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.00000125906247d + "'", double2 == 52.00000125906247d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        double double2 = org.apache.commons.math3.util.FastMath.log(11.536651757164861d, 0.05240777928304121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2057514536482425d) + "'", double2 == (-1.2057514536482425d));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.012777554145719352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012777206481470026d + "'", double1 == 0.012777206481470026d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        float float1 = org.apache.commons.math3.util.FastMath.abs(48.499992f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 48.499992f + "'", float1 == 48.499992f);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.3703835830420734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3703835830420734d + "'", double1 == 0.3703835830420734d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9899924966004454d), 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9800851433251829d + "'", double2 == 0.9800851433251829d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8742173026236351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7183865300061928d + "'", double1 == 0.7183865300061928d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        double double2 = org.apache.commons.math3.util.FastMath.min(342.7746908347008d, 1.5395564933646286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5395564933646286d + "'", double2 == 1.5395564933646286d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.600444344825681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-511), (-0.36651292058166435d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.36651292058166435d) + "'", double2 == (-0.36651292058166435d));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.000000016567019d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.697450486273865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.862318872287684d + "'", double1 == 0.862318872287684d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9150314823146174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4968538574062324d + "'", double1 == 2.4968538574062324d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double2 = org.apache.commons.math3.util.FastMath.pow(328280.6350011745d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3369954337691163d, (double) (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.007174494246179776d + "'", double2 == 0.007174494246179776d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-41));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 41L + "'", long1 == 41L);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099615d + "'", double1 == 5.916079783099615d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 6.0f, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2860082304526745E-4d + "'", double2 == 1.2860082304526745E-4d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double2 = org.apache.commons.math3.util.FastMath.max(46.40364254441709d, 0.22498664000000534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46.40364254441709d + "'", double2 == 46.40364254441709d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.791759469228055d, 3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.16353073421527d + "'", double2 == 89.16353073421527d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.3012989023072956d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.917242934814409E30d + "'", double2 == 2.917242934814409E30d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.0000002f, 7.642595581082662E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000002384185793d + "'", double2 == 1.0000002384185793d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-23));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5881530833912738d) + "'", double1 == (-1.5881530833912738d));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.2500000298023224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004363323650134475d + "'", double1 == 0.004363323650134475d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.3369954337691163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12612992402169845d + "'", double1 == 0.12612992402169845d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6.726254890556496E41d, 1.4735319749387725d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20962587148475365d + "'", double2 == 0.20962587148475365d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.547474E-13f, 4096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(35.00000762939454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.271066547867196d + "'", double1 == 3.271066547867196d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 20);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.995732273553991d + "'", double1 == 2.995732273553991d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.5881530833912738d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        float float2 = org.apache.commons.math3.util.FastMath.min(10.0f, 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207031E-4f + "'", float2 == 1.2207031E-4f);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.905339522827515E-4d + "'", double1 == 6.905339522827515E-4d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(37648.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.4731414029041368d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0668574967824482d) + "'", double1 == (-2.0668574967824482d));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', 511);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.4003503556029875d, 0.9999830769532079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.400418047790156d + "'", double2 == 0.400418047790156d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-511.49999999999994d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8366804040972828d) + "'", double1 == (-0.8366804040972828d));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.2566139548000526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double1 = org.apache.commons.math3.util.FastMath.asin(71.55417527999327d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-23L), (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-23.0f) + "'", float2 == (-23.0f));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9280538062512563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0671294962446551d + "'", double1 == 1.0671294962446551d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.6499783639526059d, 0.697450486273865d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.649978363952606d + "'", double2 == 0.649978363952606d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.3550578813391773d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.34331808359165d) + "'", double1 == (-20.34331808359165d));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.830189170012751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.830189170065857E-6d + "'", double1 == 6.830189170065857E-6d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8184464592320668d) + "'", double1 == (-1.8184464592320668d));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6931472401645883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6470435300704066d + "'", double1 == 0.6470435300704066d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 4.547475E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 57L, 35839.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double1 = org.apache.commons.math3.util.FastMath.abs(77.37445541011408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.37445541011408d + "'", double1 == 77.37445541011408d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 6208L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6208.0005f + "'", float1 == 6208.0005f);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.01745355584320953d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.9988315234449244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.1129900353232505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0434448108017733d + "'", double1 == 3.0434448108017733d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.425825977118239E8d, (-2147483648));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(8192.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6208.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6208.0005f + "'", float1 == 6208.0005f);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.7183278307183696d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.6497827368478742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1429.7186889891823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1429.0d + "'", double1 == 1429.0d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.12612992402169845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6126152570659732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5796122477778827d + "'", double1 == 0.5796122477778827d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.4E-45f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.010200069899324196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01014840024536274d + "'", double1 == 0.01014840024536274d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.154277032758874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.4495239865639748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5675658254707852d + "'", double1 == 0.5675658254707852d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.5851764690934549d), 0.05761413798165514d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5851764690934549d) + "'", double2 == (-0.5851764690934549d));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(5.0000005f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5120.0005f + "'", float2 == 5120.0005f);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.575741909831946d, (-6.436592044971218d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.8972863173864525d + "'", double2 == 7.8972863173864525d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.04669075745245177d, 10.142417859574152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04669075745245177d + "'", double2 == 0.04669075745245177d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999993d + "'", double1 == 0.9999999999999993d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(97.00000000000001d, (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5750864740467807d + "'", double2 == 1.5750864740467807d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.2678643598200185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8354356841543302d + "'", double1 == 1.8354356841543302d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.609435868686549E18d, (double) 10.000002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.609435868686549E18d + "'", double2 == 4.609435868686549E18d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38874545763980906d) + "'", double1 == (-0.38874545763980906d));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5120.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7145812674899705d) + "'", double1 == (-0.7145812674899705d));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950371902099892d + "'", double1 == 0.9950371902099892d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double double1 = org.apache.commons.math3.util.FastMath.tan(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382793105d) + "'", double1 == (-6.053272382793105d));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9226350743220142d, 1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7956467541370311d) + "'", double2 == (-0.7956467541370311d));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.9999999999795215d), (-0.006285734418917205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.006285734418917205d) + "'", double2 == (-0.006285734418917205d));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.4359738368E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4096.0005f, (-20));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0039062505f + "'", float2 == 0.0039062505f);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        long long2 = org.apache.commons.math3.util.FastMath.min((-64L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        float float2 = org.apache.commons.math3.util.FastMath.min(5120.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0671294962446551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8758186937926167d + "'", double1 == 0.8758186937926167d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.3802897750888419d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.17540341900446973d, (double) (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17540341900446973d) + "'", double2 == (-0.17540341900446973d));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int int1 = org.apache.commons.math3.util.FastMath.abs(10240);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10240 + "'", int1 == 10240);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.3619730303123131d), (-0.8360218615377305d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8360218615377305d) + "'", double2 == (-0.8360218615377305d));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.912139617126407E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.41777137910516676d, 0.01745355584320953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41777137910516676d + "'", double2 == 0.41777137910516676d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(10.040749952147157d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-2L), (-103.27892990343184d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.1222300395979996d) + "'", double2 == (-3.1222300395979996d));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.570796263574624d, 0.7601702599438814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1200795222140087d + "'", double2 == 1.1200795222140087d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.2981479726743438d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-511));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 511L + "'", long1 == 511L);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3580.4237429416758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 205143.1693389912d + "'", double1 == 205143.1693389912d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) ' ', 35839.996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.8621853758445391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9285393776488637d + "'", double1 == 0.9285393776488637d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1129900353232502d, (double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1129900353232502d + "'", double2 == 1.1129900353232502d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-5));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.9999995f) + "'", float1 == (-4.9999995f));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.03216605451972054d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.032154967811066235d) + "'", double2 == (-0.032154967811066235d));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 4503599627370496L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4503599627370496L + "'", long1 == 4503599627370496L);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.08037189100331499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43155358513611025d + "'", double1 == 0.43155358513611025d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.19611987703015257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19366190374515743d + "'", double1 == 0.19366190374515743d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-2), 0.722369115788189d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9999999f) + "'", float2 == (-1.9999999f));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) 32768);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32768L + "'", long2 == 32768L);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double1 = org.apache.commons.math3.util.FastMath.atan(18824.27742973676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570743203905968d + "'", double1 == 1.570743203905968d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.331371450960497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.04851188756716d + "'", double1 == 75.04851188756716d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.0000005f, (-35.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-35.0f) + "'", float2 == (-35.0f));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-0.99999994f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.9999999f) + "'", float1 == (-0.9999999f));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 4096);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4096.0d + "'", double1 == 4096.0d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6470435300704066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1024.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.931471805599453d + "'", double1 == 6.931471805599453d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.799080308109824d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32580079669902784d + "'", double2 == 0.32580079669902784d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.836693358258192d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.163604101989393d + "'", double2 == 4.163604101989393d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.34187215E17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.71798692E10f + "'", float1 == 1.71798692E10f);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.08037189100331499d, 0.6126152570659732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.080371891003315d + "'", double2 == 0.080371891003315d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-8), 0.008727310882701312d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008727310882701312d + "'", double2 == 0.008727310882701312d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.506365641109722d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124615d + "'", double1 == 0.8745129512124615d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.2722218725854072E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854072E-14d + "'", double1 == 1.2722218725854072E-14d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.154434690031884d, 1.6102871923992833E-232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.154434690031884d + "'", double2 == 2.154434690031884d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 6208L, 0.7224284372420832d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1724387787793572d + "'", double2 == 0.1724387787793572d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.0730285661552832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9320815615055481d + "'", double1 == 0.9320815615055481d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.38991804378757267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38991804378757267d + "'", double1 == 0.38991804378757267d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.726254890556496E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.4377039151369548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.8364287485695048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7422546989427482d) + "'", double1 == (-0.7422546989427482d));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0017395461469968258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017395461469968258d + "'", double1 == 0.0017395461469968258d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double1 = org.apache.commons.math3.util.FastMath.sin(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.008727310882701312d, 1.5507969934215662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09254195563405843d) + "'", double2 == (-0.09254195563405843d));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.830189170012751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 1.570796207585607d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.7724538509055159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1742984407142925d + "'", double1 == 1.1742984407142925d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.364242E-12f, 9.765625E-4f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.765625E-4f + "'", float2 == 9.765625E-4f);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 4503599627370496L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4503599627370496L + "'", long2 == 4503599627370496L);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 19.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4258213501575032E8d + "'", double1 == 2.4258213501575032E8d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double2 = org.apache.commons.math3.util.FastMath.pow(7.737545114640003d, 1.6594942162563324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.8285307045427d + "'", double2 == 29.8285307045427d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.0000005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0000005f + "'", float1 == 5.0000005f);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-4503599627370496L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-2.9999998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(97.00337450631281d, (-511.49999999999994d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-97.00337450631281d) + "'", double2 == (-97.00337450631281d));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 15, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8646647167633873d) + "'", double1 == (-0.8646647167633873d));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-6L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.048297543927715d, (-0.37245959530521877d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.982585443480274d + "'", double2 == 0.982585443480274d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9147226107566936d + "'", double1 == 0.9147226107566936d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 4096, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5557.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.0d + "'", double1 == 5557.0d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int int1 = org.apache.commons.math3.util.FastMath.abs(511);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 511 + "'", int1 == 511);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double1 = org.apache.commons.math3.util.FastMath.exp(14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2430665.0174340927d + "'", double1 == 2430665.0174340927d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.5474735E-13f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5474735E-13f + "'", float2 == 4.5474735E-13f);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.53313149942335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999957691935532d + "'", double1 == 0.9999957691935532d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 13);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.8104779544189764d, 1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8104779544189764d + "'", double2 == 3.8104779544189764d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1752011936437905d, 20.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.249017180612423d + "'", double2 == 25.249017180612423d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.7615941540256079d, (-20.34331808359165d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615941540256079d + "'", double2 == 0.7615941540256079d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 32768L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.0885816328207447d), 2.2912042544237448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0885816328207447d + "'", double2 == 0.0885816328207447d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1023.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.0d) + "'", double1 == (-1023.0d));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1251345322701862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051204454117964975d + "'", double1 == 0.051204454117964975d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.15683098746077087d, 1.0730285661552832d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15683098746077087d + "'", double2 == 0.15683098746077087d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9999956364727363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813705015364591d) + "'", double1 == (-0.8813705015364591d));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-1.5364211615694945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9115170270339398d) + "'", double1 == (-0.9115170270339398d));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 100.00001f, 0.09711106517907972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000762939452d + "'", double2 == 100.00000762939452d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(13.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.000001f + "'", float1 == 13.000001f);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(3.948148009134021E13d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3205128404736515E-25d + "'", double2 == 2.3205128404736515E-25d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int int2 = org.apache.commons.math3.util.FastMath.max((-127), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3580.4237429416758d, (double) 61);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3580.4237429416758d + "'", double2 == 3580.4237429416758d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(11013.232920103323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-6.354130026164064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.0d) + "'", double1 == (-6.0d));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double2 = org.apache.commons.math3.util.FastMath.log(187.4182940812372d, 0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1667807629722503d) + "'", double2 == (-0.1667807629722503d));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) ' ', (-511));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-20L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5208379310729538d) + "'", double1 == (-1.5208379310729538d));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 1, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.759258273186885E-38d, 128.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 128.0d + "'", double2 == 128.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.107184941633452E23d, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.107184941633452E23d + "'", double2 == 3.107184941633452E23d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.02460092029573991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6090486460720004d) + "'", double1 == (-1.6090486460720004d));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.006285734418917205d), 1.0044884011988755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.006257565908601255d) + "'", double2 == (-0.006257565908601255d));
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.23874681872885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4512856670122316d + "'", double1 == 3.4512856670122316d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double1 = org.apache.commons.math3.util.FastMath.cos(28.30281574199178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9995944192534033d) + "'", double1 == (-0.9995944192534033d));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205369012336d) + "'", double1 == (-0.6321205369012336d));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.2504230129550942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2478137996138078d + "'", double1 == 0.2478137996138078d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6090128311061332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5765379570909391d + "'", double1 == 0.5765379570909391d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 2147483648L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46340.95001184158d + "'", double1 == 46340.95001184158d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-23L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.987846675914698E-16d + "'", double1 == 1.987846675914698E-16d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9999999999999992d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999999999999984d + "'", double2 == 1.9999999999999984d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double2 = org.apache.commons.math3.util.FastMath.min((-4.09061543436171E-4d), 0.055192158084907385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.09061543436171E-4d) + "'", double2 == (-4.09061543436171E-4d));
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.54213262037718d, 1.34315092828584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.5421326203771795d + "'", double2 == 6.5421326203771795d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double1 = org.apache.commons.math3.util.FastMath.log(97.00317877887012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574743748882615d + "'", double1 == 4.574743748882615d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int int1 = org.apache.commons.math3.util.FastMath.round(32768.004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32768 + "'", int1 == 32768);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.3716732554246792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31603134891816875d + "'", double1 == 0.31603134891816875d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.9999999f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double1 = org.apache.commons.math3.util.FastMath.asin(12.082762530298217d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(28.28673724526161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.2676506002282294E30d, 13);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 2.842171E-14f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 4503599627370496L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.8354356841543302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8354356841543302d + "'", double1 == 1.8354356841543302d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double1 = org.apache.commons.math3.util.FastMath.cos(4.209318697132464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4821177017291658d) + "'", double1 == (-0.4821177017291658d));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(100.00000000000001d, 0.15156283651453492d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.8360218615377305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7419819752357887d) + "'", double1 == (-0.7419819752357887d));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double2 = org.apache.commons.math3.util.FastMath.min(4.641588833612779d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.641588833612779d + "'", double2 == 4.641588833612779d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.916079783099615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3589153218773263d) + "'", double1 == (-0.3589153218773263d));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.744894366675417d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(40.0d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2560.0d + "'", double2 == 2560.0d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(185.4759706643647d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0552874272350832d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 184.91157758310626d + "'", double2 == 184.91157758310626d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math3.util.FastMath.log((-6.053272382792838d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.08369000730960287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0035040531497879d + "'", double1 == 1.0035040531497879d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 2.34187215E17f, 0.8813735870195445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292519943295d) + "'", double1 == (-0.017453292519943295d));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1, (-1.0000001192092896d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7210377105017316d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.163604101989393d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.1251345322701862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.1961198770299012d, 1.5395564933646286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5395564933646286d + "'", double2 == 1.5395564933646286d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6731186635936198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.017453292519943295d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017453292519943292d + "'", double2 == 0.017453292519943292d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.2362223276865345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9952731515503571d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-4096.0f), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8192.0f) + "'", float2 == (-8192.0f));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(57.29577951308233d, (double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.09254195563405843d), 2430665.0174340927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2430665.0174340946d + "'", double2 == 2430665.0174340946d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-13.847379800543134d), (-2.067786496795693E-15d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.801440805870862E-17d) + "'", double2 == (-7.801440805870862E-17d));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.5565058722645064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.849105967630261d + "'", double1 == 0.849105967630261d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.20962587148475365d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4192517429695073d + "'", double2 == 0.4192517429695073d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8225824358786724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9659375922850095d + "'", double1 == 0.9659375922850095d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-3), (-0.99999994f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.49904707604701226d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-1023), 0.0017395461469968258d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.436895187235117E-4d) + "'", double2 == (-7.436895187235117E-4d));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.38991804378757267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38011261180303196d + "'", double1 == 0.38011261180303196d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7852981633977816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0590452297311184d + "'", double1 == 1.0590452297311184d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        float float2 = org.apache.commons.math3.util.FastMath.min(5.0000005f, (-63.999996f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.999996f) + "'", float2 == (-63.999996f));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.192093037616354E-7d, 0.812402071214698d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.192093037616354E-7d + "'", double2 == 1.192093037616354E-7d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        float float2 = org.apache.commons.math3.util.FastMath.max(6400.0005f, (float) (-6));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0005f + "'", float2 == 6400.0005f);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.7183865300061928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8886102.046056528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2980.95656561053d + "'", double1 == 2980.95656561053d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.3703835830420734d, (-3.6032287479334557d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3703835830420734d + "'", double2 == 0.3703835830420734d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double1 = org.apache.commons.math3.util.FastMath.floor(403.42879349273517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 403.0d + "'", double1 == 403.0d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.58351893845611d + "'", double1 == 3.58351893845611d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(48.499996f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(918246.8633045758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16026.431110775147d + "'", double1 == 16026.431110775147d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 3.33289488E12f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.33289488384E12d + "'", double1 == 3.33289488384E12d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(86.23874129193797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.15023307534954d + "'", double1 == 5.15023307534954d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, (-511));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.622246790554995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.064456315889266d + "'", double1 == 4.064456315889266d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(34.30686044883459d, 0.04665687272850968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.569436340968354d + "'", double2 == 1.569436340968354d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.1592259218842048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15789381669343078d) + "'", double1 == (-0.15789381669343078d));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-7));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.9287117556395867d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.4202879887985945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double1 = org.apache.commons.math3.util.FastMath.log(586708.782213963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.282283863634309d + "'", double1 == 13.282283863634309d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.1129900353232502d, 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.8623188722876839d, (double) 128.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876839d + "'", double2 == 0.8623188722876839d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1752011936437905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.084066969169244d + "'", double1 == 1.084066969169244d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.36651292058166435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-20));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1624473515096265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.0000001f, (-0.07466556700256388d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000001192092893d + "'", double2 == 1.0000001192092893d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 52.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.15789381669343078d), 1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368683772161603E-13d + "'", double2 == 1.1368683772161603E-13d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9912174443839006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 'a', 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-18) + "'", int1 == (-18));
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-5.9999995f), (double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.999999f) + "'", float2 == (-5.999999f));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1023), 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1023) + "'", int2 == (-1023));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int int2 = org.apache.commons.math3.util.FastMath.max(4, (-47));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8447979300678613d + "'", double1 == 0.8447979300678613d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.5648302606319877d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.43368382029253E62d, 0.7221586788190554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.43368382029253E62d + "'", double2 == 3.43368382029253E62d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.7755575615628914E-17d, 3.5774089634154596d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7755575615628914E-17d + "'", double2 == 2.7755575615628914E-17d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.23606797749979d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.12612992402169845d, 1.1742984407142925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12612992402169845d + "'", double2 == 0.12612992402169845d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        float float2 = org.apache.commons.math3.util.FastMath.max((-10.0f), 52.000008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000008f + "'", float2 == 52.000008f);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double double1 = org.apache.commons.math3.util.FastMath.log(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0730285661552832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 61.48000813767197d + "'", double1 == 61.48000813767197d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-6.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.7724538509055159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0571243112754385d + "'", double1 == 1.0571243112754385d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.003905821484290615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003905821484290615d + "'", double1 == 0.003905821484290615d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.6883420083174141d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.3703835830420734d, 0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6341049784159862d + "'", double2 == 0.6341049784159862d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.5424980307488157E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424980429823686E-4d) + "'", double1 == (-1.5424980429823686E-4d));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.102016471589291E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8837563087406048d) + "'", double1 == (-0.8837563087406048d));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.6779492465849286d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 692.7645379031695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6470435300704066d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 7L, (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-23) + "'", int1 == (-23));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-23));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.999999999999996d) + "'", double1 == (-22.999999999999996d));
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-6.0000005f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.7621186826519104d, (double) (-5.9999995f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.855938105439101d + "'", double2 == 2.855938105439101d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.0533959519657112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.027415567780803774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003758302174048d + "'", double1 == 1.0003758302174048d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.0000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000002f + "'", float1 == 2.0000002f);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.3869694069128182d, 57.30442320325666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3869694069128182d + "'", double2 == 3.3869694069128182d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4096.0005f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.001f + "'", float1 == 4096.001f);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-23));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 23L + "'", long1 == 23L);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-18));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.7019294127099711d), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7019294127099711d) + "'", double2 == (-1.7019294127099711d));
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0000380832193412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7183853513533798d + "'", double1 == 2.7183853513533798d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        float float2 = org.apache.commons.math3.util.FastMath.min(4.547474E-13f, (float) 511L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.547474E-13f + "'", float2 == 4.547474E-13f);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.915499384730081d, 83.9889793008241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.99396873060411d + "'", double2 == 83.99396873060411d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.9115170270339398d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9115170270339398d + "'", double1 == 0.9115170270339398d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.8823852309817808E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12347.228980451639d + "'", double1 == 12347.228980451639d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double1 = org.apache.commons.math3.util.FastMath.exp(185.4759706643647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5578741756804023E80d + "'", double1 == 3.5578741756804023E80d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int1 = org.apache.commons.math3.util.FastMath.round(6208.0005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6208 + "'", int1 == 6208);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.1752011936438014d), 51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1752011936438014d) + "'", double2 == (-1.1752011936438014d));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.296908309475615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.532970926169133d + "'", double1 == 13.532970926169133d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.855938105439101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 163.6331999922488d + "'", double1 == 163.6331999922488d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.2879033166650653d), 6.65790272519809E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.333512291668548E-8d) + "'", double2 == (-2.333512291668548E-8d));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.7771212476539429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25215889490171217d) + "'", double1 == (-0.25215889490171217d));
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.912139617126407E10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double1 = org.apache.commons.math3.util.FastMath.rint(102400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102400.0d + "'", double1 == 102400.0d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double1 = org.apache.commons.math3.util.FastMath.log10(163.6331999922488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2138714234833596d + "'", double1 == 2.2138714234833596d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 32);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(9.011035410141815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.011035410141817d + "'", double1 == 9.011035410141817d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int int2 = org.apache.commons.math3.util.FastMath.min(511, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double1 = org.apache.commons.math3.util.FastMath.asin(28.30281574199178d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0039062505f, 0.05272236634611255d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.003906251f + "'", float2 == 0.003906251f);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.425825977118239E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.4210855E-14f, 4.041914989933878d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4210856E-14f + "'", float2 == 1.4210856E-14f);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7739782060779719d + "'", double1 == 0.7739782060779719d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        long long2 = org.apache.commons.math3.util.FastMath.min(35L, 32768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.03216605451972054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.084066969169244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9866275920404853d + "'", double1 == 0.9866275920404853d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.6332359729824427d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        long long1 = org.apache.commons.math3.util.FastMath.round((-2.003564344806379d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (-6.436592044971218d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.2504230129550942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-4.50359936E15f) + "'", float1 == (-4.50359936E15f));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 511);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.006142729981775034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 3, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double1 = org.apache.commons.math3.util.FastMath.log(178.72171540421934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.1858299335526885d + "'", double1 == 5.1858299335526885d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-2), 12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-8192.0f) + "'", float2 == (-8192.0f));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 6208.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6208.0d + "'", double1 == 6208.0d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.7956467541370311d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7292653317441247d) + "'", double1 == (-0.7292653317441247d));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8203432320660448d, 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2205259637502253d + "'", double2 == 2.2205259637502253d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-20), 15L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 3, (long) (-1023));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(10.142417859574152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25396.800622042338d + "'", double1 == 25396.800622042338d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5604874144594285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2755538279996634d + "'", double1 == 2.2755538279996634d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-1.6090486460720002d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.737545114640003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2291.83681708314d + "'", double1 == 2291.83681708314d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.007958012753983E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007958012753983E15d + "'", double1 == 1.007958012753983E15d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-5));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-74.20321057778875d) + "'", double1 == (-74.20321057778875d));
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.9417844128659681d), 4.476961205229636d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9417844128659681d) + "'", double2 == (-0.9417844128659681d));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.14748365E9f, (-40.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(96.99999237060548d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(6.324555320336759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999935791925075d + "'", double1 == 0.9999935791925075d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double2 = org.apache.commons.math3.util.FastMath.log(Double.NaN, (double) 3.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        double double2 = org.apache.commons.math3.util.FastMath.pow(41.903161481023d, (-0.17540341900446973d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5193407089583182d + "'", double2 == 0.5193407089583182d);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.010200777470529932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21687579852418168d + "'", double1 == 0.21687579852418168d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32768L, (-0.9952731515503571d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32767.998f + "'", float2 == 32767.998f);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.60943642E18f, (float) 511);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943642E18f + "'", float2 == 4.60943642E18f);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9147226107566936d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) -1, (-64.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-4096.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0f + "'", float1 == 4096.0f);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 100, 511);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(25396.800622042338d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-1.000000016567019d), 1.5639495664692888d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5688922622699d) + "'", double2 == (-0.5688922622699d));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(52.00000762939454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970292057502952d + "'", double1 == 3.970292057502952d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7407750251209115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6375709353426802d + "'", double1 == 0.6375709353426802d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5675658254707852d, 71.02688974004266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 71.02915737294383d + "'", double2 == 71.02915737294383d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(52.000004f, 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-12.652395426951063d), 1.5707894966057265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-12.652395426951061d) + "'", double2 == (-12.652395426951061d));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(46.999532327864166d, (double) 57.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46.99953232786417d + "'", double2 == 46.99953232786417d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-4.663853435426824d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.012777554145719352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012696609983792819d + "'", double1 == 0.012696609983792819d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double2 = org.apache.commons.math3.util.FastMath.min((-4.09061543436171E-4d), 46340.95001184158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.09061543436171E-4d) + "'", double2 == (-4.09061543436171E-4d));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.35130926182721134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7037660722156223d + "'", double1 == 0.7037660722156223d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.99999994f), (double) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999999f) + "'", float2 == (-0.9999999f));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7322058522179385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 10240, (float) 32768);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10240.0f + "'", float2 == 10240.0f);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 4096.0f, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7592186044416E13d + "'", double2 == 1.7592186044416E13d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.2676505E30f), 57.29577951308244d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.26765045E30f) + "'", float2 == (-1.26765045E30f));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.6256632450775597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5907060326513854d) + "'", double1 == (-0.5907060326513854d));
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-1.0000001f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.6497827368478742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.229808421842996d + "'", double1 == 37.229808421842996d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.609844813961006E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.17296530872742752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1888248625213111d + "'", double1 == 1.1888248625213111d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.1469512391741817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8633360733698906d + "'", double1 == 0.8633360733698906d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.917242934814409E30d, (double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(6.102016471589291E38d, 0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.102016471589291E38d + "'", double2 == 6.102016471589291E38d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.34187215E17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.34187232E17f + "'", float1 == 2.34187232E17f);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) '#', (long) (-7));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-17), (-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.594928188335995d) + "'", double2 == (-1.594928188335995d));
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.7336545584598331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double2 = org.apache.commons.math3.util.FastMath.min(18824.27742973676d, (double) 0.9999999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999998807907104d + "'", double2 == 0.9999998807907104d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0468426300829488d, 14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.740893838589704d + "'", double2 == 14.740893838589704d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-4.451746403021009d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        float float1 = org.apache.commons.math3.util.FastMath.abs(5.421011E-20f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.421011E-20f + "'", float1 == 5.421011E-20f);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.0017395479016332227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001739547024314626d + "'", double1 == 0.001739547024314626d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.1920928244535418E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928244535474E-7d + "'", double1 == 1.1920928244535474E-7d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-17), (float) (-511));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.0f) + "'", float2 == (-17.0f));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        float float2 = org.apache.commons.math3.util.FastMath.min((-4096.0f), (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4096.0f) + "'", float2 == (-4096.0f));
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 127L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1251345322701862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7538351096760478d + "'", double1 == 0.7538351096760478d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.123868210250173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08942837070713458d + "'", double1 == 0.08942837070713458d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-1.2057514536482425d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.2676506002282294E30d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.001f, (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485196d) + "'", double1 == (-0.6995216443485196d));
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) 127);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 10239.999f, 263.856815596594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-50.41678482966614d) + "'", double2 == (-50.41678482966614d));
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.619670639138117d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6196706391381169d) + "'", double1 == (-0.6196706391381169d));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(10.040749952147157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.04074995214716d + "'", double1 == 10.04074995214716d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 4096);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.8828125E-4f + "'", float1 == 4.8828125E-4f);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.14748365E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.970292057502952d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 32768L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(97.00337450631281d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(511.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-1.3427390986374435E15d), 3.146668361052285E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double1 = org.apache.commons.math3.util.FastMath.acos(403.42879349273517d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8805870712594983d, 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8805870712594983d + "'", double2 == 0.8805870712594983d);
    }
}

