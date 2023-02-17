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
        double double1 = org.apache.commons.math.util.FastMath.signum(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8307927247660993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6189908924466622d + "'", double1 == 0.6189908924466622d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5253536785057736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.6872483617622163d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6872483617622163d + "'", double2 == 0.6872483617622163d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5474250491067253E26d + "'", double1 == 1.5474250491067253E26d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0430410006679824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.837833760306761d + "'", double1 == 2.837833760306761d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1189396031849523d, 3.5251431659552352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5251431659552352d + "'", double2 == 3.5251431659552352d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5087348157117294d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008879097553696258d) + "'", double1 == (-0.008879097553696258d));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.09254849966825912d), 0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2539945895800114d) + "'", double2 == (-0.2539945895800114d));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.463837428330972d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.510506427637088d + "'", double1 == 11.510506427637088d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9747047669009431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7507644864211287d + "'", double1 == 0.7507644864211287d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04539243181516313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04537685793879663d + "'", double1 == 0.04537685793879663d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9943400969063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.04539243181516313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.922473906616227E-4d + "'", double1 == 7.922473906616227E-4d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9088714301767988d + "'", double1 == 0.9088714301767988d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8816651612292111d + "'", double1 == 0.8816651612292111d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.14891233518812158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4213280739250442d + "'", double1 == 1.4213280739250442d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.20637502874300212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0213710154485947d + "'", double1 == 1.0213710154485947d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5737618316160396d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 52L, 0.3453962389097756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9147235714964186d + "'", double2 == 3.9147235714964186d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.460094597035771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44523769810820424d + "'", double1 == 0.44523769810820424d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.939216676724527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6622841166519441d + "'", double1 == 0.6622841166519441d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5877618172544402d) + "'", double1 == (-0.5877618172544402d));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        long long1 = org.apache.commons.math.util.FastMath.round(34.999999999999886d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5473651378551416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5473651378551417d + "'", double1 == 0.5473651378551417d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4248349501142077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007414768657038784d + "'", double1 == 0.007414768657038784d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        long long1 = org.apache.commons.math.util.FastMath.round(0.30360435125676755d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5922362574545064d) + "'", double1 == (-2.5922362574545064d));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0590011172720796d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5811141142770077d, 19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.781104616480253d + "'", double2 == 19.781104616480253d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4844347252766887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4124704496626688d + "'", double1 == 3.4124704496626688d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3649537293954457d + "'", double1 == 1.3649537293954457d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1599121686187173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5582527903380249d + "'", double1 == 0.5582527903380249d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4593566380802732d + "'", double1 == 1.4593566380802732d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0911052960943115d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5191429678165033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2847130244570347d) + "'", double1 == (-0.2847130244570347d));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double1 = org.apache.commons.math.util.FastMath.atan(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5283890156232007d + "'", double1 == 1.5283890156232007d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5337813023984244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double2 = org.apache.commons.math.util.FastMath.atan2(97.0d, 7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 5.0f, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.373400766945016d + "'", double2 == 1.373400766945016d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02037772465575569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02037490473029824d + "'", double1 == 0.02037490473029824d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9717769481908543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9857874761787422d + "'", double1 == 0.9857874761787422d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.15491406168101263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15617144518908815d + "'", double1 == 0.15617144518908815d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02037772465575569d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double1 = org.apache.commons.math.util.FastMath.rint(7871.825828205633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7872.0d + "'", double1 == 7872.0d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0911052960943115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6567042118906716d + "'", double1 == 1.6567042118906716d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9008481395968395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6423001758318426d + "'", double1 == 0.6423001758318426d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5283890156232007d, 4.281623811241125E59d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.281623811241125E59d + "'", double2 == 4.281623811241125E59d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5108256237659906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4705882352941176d) + "'", double1 == (-0.4705882352941176d));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.09711515743188391d), 0.020483828884450862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09711515743188391d) + "'", double2 == (-0.09711515743188391d));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.295214085529645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1719235979111335d + "'", double1 == 0.1719235979111335d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1189396031849521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8996379399296265d + "'", double1 == 0.8996379399296265d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1598987305185835d, 564.2988711233953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1598987305185835d + "'", double2 == 1.1598987305185835d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9940685753209271d + "'", double1 == 0.9940685753209271d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double2 = org.apache.commons.math.util.FastMath.min(138.0d, 0.6582696111348529d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6582696111348529d + "'", double2 == 0.6582696111348529d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double double1 = org.apache.commons.math.util.FastMath.tanh(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999531204d + "'", double1 == 0.9999999999531204d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        long long2 = org.apache.commons.math.util.FastMath.max(6559L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8295667582777111d), (-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837977760189355d) + "'", double2 == (-0.008837977760189355d));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.020695062331941d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8918900011220077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0149280275816273d + "'", double1 == 1.0149280275816273d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.34032616795694d) + "'", double1 == (-36.34032616795694d));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9234637104758648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7456282765000656d + "'", double1 == 0.7456282765000656d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5294913521432763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double double1 = org.apache.commons.math.util.FastMath.ulp(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5834613951988719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8717898497955656d + "'", double1 == 3.8717898497955656d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14836503173587057d + "'", double1 == 0.14836503173587057d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.12270990624068587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12270990624068587d + "'", double1 == 0.12270990624068587d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835171d + "'", double1 == 1.2261911708835171d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0918040996853897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03814472073326859d + "'", double1 == 0.03814472073326859d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8464654362980488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8464654362980488d + "'", double1 == 1.8464654362980488d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5860134523134298E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07270966677774479d + "'", double1 == 0.07270966677774479d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 49.52813017280076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2203415586770938d, (-1.5701287081656914d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5701287081656914d) + "'", double2 == (-1.5701287081656914d));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000041223074d + "'", double1 == 1.0000000041223074d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9534625892455924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4900413211439332d + "'", double1 == 1.4900413211439332d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 51.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.046745412134694E21d + "'", double1 == 7.046745412134694E21d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.092409887937381d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.992355853476756d) + "'", double1 == (-10.992355853476756d));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.29655427201849516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2923710782526353d + "'", double1 == 0.2923710782526353d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.922473906616227E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.922473077851842E-4d + "'", double1 == 7.922473077851842E-4d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        double double1 = org.apache.commons.math.util.FastMath.abs((-89.00499281765603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.00499281765603d + "'", double1 == 89.00499281765603d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999535225788d + "'", double1 == 0.9999999535225788d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1428790501832544d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.1010569721060828d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7715216602443777d, 1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7715216602443775d + "'", double2 == 1.7715216602443775d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.713130608547954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4567608960260546d + "'", double1 == 0.4567608960260546d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4160734237838899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.238991635001947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7353126200110887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06519350381048933d + "'", double1 == 0.06519350381048933d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5410395588486396d, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1344439571520295d + "'", double2 == 0.1344439571520295d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8485804212570964d), 1.1064106411944428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8485804212570964d) + "'", double2 == (-0.8485804212570964d));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.788723182374374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.003031968853450674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003027381705607183d + "'", double1 == 0.003027381705607183d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double1 = org.apache.commons.math.util.FastMath.signum(32.29225137547852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0580782213705773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.238991635001947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8451677598626034d + "'", double1 == 0.8451677598626034d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.325835187949904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3665789367467411d + "'", double1 == 0.3665789367467411d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1752012000048542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double1 = org.apache.commons.math.util.FastMath.log(0.027241040673019475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6030305945752334d) + "'", double1 == (-3.6030305945752334d));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double1 = org.apache.commons.math.util.FastMath.floor(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double2 = org.apache.commons.math.util.FastMath.atan2(96.99484522385717d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3358347343868286E40d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.03505838110136253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03505120341912517d + "'", double1 == 0.03505120341912517d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4486454104648998d + "'", double1 == 1.4486454104648998d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5287499284227858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5811141142770077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6649237511146353d + "'", double1 == 1.6649237511146353d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3453962389097756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36020687119376654d + "'", double1 == 0.36020687119376654d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4575013994861008d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5085350159312789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104278850811079d + "'", double1 == 2.104278850811079d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2325241103312965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.15339215657878688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15339215657878688d + "'", double1 == 0.15339215657878688d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math.util.FastMath.asinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        long long2 = org.apache.commons.math.util.FastMath.max(51L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.038399603650754E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double1 = org.apache.commons.math.util.FastMath.sinh(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156721E14d + "'", double1 == 7.93006726156721E14d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.009338481576d + "'", double1 == 32.009338481576d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.23313271272363228d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22899890530590894d) + "'", double1 == (-0.22899890530590894d));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0384003448748685E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double1 = org.apache.commons.math.util.FastMath.sin((-5.377465624848392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.786869488650853d + "'", double1 == 0.786869488650853d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.028730419947965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.930313428991271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.393440751786198d + "'", double1 == 9.393440751786198d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6974863893961706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0086972736692794d + "'", double1 == 1.0086972736692794d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.380515006246586d), 0.9506431907144247d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9506431907144247d + "'", double2 == 0.9506431907144247d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8173735548289334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0358050874256768d + "'", double1 == 1.0358050874256768d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.3079900213234987E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028471562981618036d) + "'", double1 == (-0.028471562981618036d));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.174240018845341d + "'", double1 == 1.174240018845341d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double1 = org.apache.commons.math.util.FastMath.sin(21.42227207044929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5386858365538267d + "'", double1 == 0.5386858365538267d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6974863893961706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.776356839400251E-15d, 1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4920792588618803E-17d + "'", double2 == 2.4920792588618803E-17d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.357486930108681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4643340811431678d + "'", double1 == 1.4643340811431678d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.059903262040248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.8130791098485624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9830700822184464d + "'", double1 == 2.9830700822184464d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5538249887862297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9144143970315091d + "'", double1 == 0.9144143970315091d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8058302155599487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8058302155599488d + "'", double1 == 0.8058302155599488d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.06571071737855876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06566343888689716d) + "'", double1 == (-0.06566343888689716d));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 3.9481478E13f, 3.9481480091340625E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.13025531550365874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.1494681981443936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15059643745753507d) + "'", double1 == (-0.15059643745753507d));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8485804212570964d), 2.2570569097055435E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.759676672786255E-11d) + "'", double2 == (-3.759676672786255E-11d));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5960035785549811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5960035785549811d + "'", double1 == 0.5960035785549811d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8816651612292111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.054696319902792064d) + "'", double1 == (-0.054696319902792064d));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.5019296225954823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.501929622595483d + "'", double1 == 3.501929622595483d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3205004784536853d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2634178653612851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0348955683853929d + "'", double1 == 1.0348955683853929d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1259023567118747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019650703180585892d + "'", double1 == 0.019650703180585892d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7580423413226773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9422839571176261d + "'", double1 == 0.9422839571176261d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double1 = org.apache.commons.math.util.FastMath.floor(33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05362981780341266d) + "'", double1 == (-0.05362981780341266d));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04144646964819275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04147022652343259d + "'", double1 == 0.04147022652343259d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7452953479050968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.557153674151176d + "'", double1 == 1.557153674151176d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02017149514354095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0203763146052207d + "'", double1 == 1.0203763146052207d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.3554432E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.52574989159953d + "'", double1 == 7.52574989159953d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.0768893216246815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7895475094113655d + "'", double1 == 1.7895475094113655d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999984298108128d + "'", double1 == 0.9999984298108128d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.15002289137601957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1489074174955618d + "'", double1 == 0.1489074174955618d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5473651378551416d, 0.29668857108723257d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8362763531273804d + "'", double2 == 0.8362763531273804d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1906899454435431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6081446963356462d + "'", double1 == 0.6081446963356462d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5403023023993376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5538249887862297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9989523981229464d + "'", double1 == 0.9989523981229464d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1555698629817919d + "'", double1 == 1.1555698629817919d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        long long1 = org.apache.commons.math.util.FastMath.round(13.067188648029997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.154434690031884d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6419693473089224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9002193888246004d + "'", double1 == 1.9002193888246004d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.14027452341391E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double double1 = org.apache.commons.math.util.FastMath.sin(23.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8462204041751706d) + "'", double1 == (-0.8462204041751706d));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 2005L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8451846157611319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9454760404994205d) + "'", double1 == (-0.9454760404994205d));
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2261911708835171d, 1.4213280739250442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2261911708835174d + "'", double2 == 1.2261911708835174d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.23886037395044873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2698012268765735d + "'", double1 == 1.2698012268765735d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8193243886355482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6105647004975028d + "'", double1 == 0.6105647004975028d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8524543594406486d, 63.11171283996957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.013506249250649143d + "'", double2 == 0.013506249250649143d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.786083656729492d + "'", double1 == 2.786083656729492d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3205004784536856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7615165085805538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.705146651282202d + "'", double1 == 0.705146651282202d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.788723182374376d, 32.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.605554840023869E30d + "'", double2 == 1.605554840023869E30d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1535902666964597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2561874369417856d + "'", double1 == 2.2561874369417856d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.786083656729492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.2539945895800114d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25967827695144485d) + "'", double1 == (-0.25967827695144485d));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.104278850811079d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6770136959079763d + "'", double1 == 0.6770136959079763d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1417162261588426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14219492454772464d + "'", double1 == 0.14219492454772464d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double1 = org.apache.commons.math.util.FastMath.asinh(46.62670202444023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.535435535363617d + "'", double1 == 4.535435535363617d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2923550633004577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9989523981229464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math.util.FastMath.abs(123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 123.44001497540268d + "'", double1 == 123.44001497540268d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8996379399296265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double1 = org.apache.commons.math.util.FastMath.log(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.535680137218971d + "'", double1 == 1.535680137218971d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double1 = org.apache.commons.math.util.FastMath.tanh(92.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9455557866374292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7880631986597029d + "'", double1 == 1.7880631986597029d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.998019200072578d, 0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9996557558571272d + "'", double2 == 0.9996557558571272d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double1 = org.apache.commons.math.util.FastMath.atan(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4844603454294543d + "'", double1 == 1.4844603454294543d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.9836542011042855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-3.552713678800564E-14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0355549961366867E-12d) + "'", double1 == (-2.0355549961366867E-12d));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 13L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7609889586512912d + "'", double1 == 0.7609889586512912d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.01794144829647875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.027969265740413d) + "'", double1 == (-1.027969265740413d));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.024913294410754107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024918450020804755d + "'", double1 == 0.024918450020804755d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.6908443102518884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6782858550610651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.862916798421296d + "'", double1 == 38.862916798421296d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.5701287081656914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7919815930336389d) + "'", double1 == (-0.7919815930336389d));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(59.76184719737747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0430410006679824d + "'", double1 == 1.0430410006679824d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.023246939094508524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.331951496713014d + "'", double1 == 1.331951496713014d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8173735548289334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 81.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0046874060688094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0046874060688096d + "'", double1 == 1.0046874060688096d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05139217630949651d + "'", double1 == 0.05139217630949651d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.019228399099707562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0192272144065368d + "'", double1 == 0.0192272144065368d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.788723182374376d, (-0.25967827695144485d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6003344910765165d + "'", double2 == 1.6003344910765165d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.014145948783788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1680043018081568d + "'", double1 == 0.1680043018081568d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5860134523134298E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9231784609934363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016112503727829505d) + "'", double1 == (-0.016112503727829505d));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3279.925622497139d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3279.9256224971386d + "'", double2 == 3279.9256224971386d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5370437824787192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7328327111140163d + "'", double1 == 0.7328327111140163d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double2 = org.apache.commons.math.util.FastMath.max(152.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 152.0d + "'", double2 == 152.0d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5558738409986911d + "'", double1 == 0.5558738409986911d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9914978027470506d + "'", double1 == 0.9914978027470506d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.3108872417680944E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.027241040673019475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1650486009423269d + "'", double1 == 0.1650486009423269d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double1 = org.apache.commons.math.util.FastMath.exp(50.50495049504956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.590556703111504E21d + "'", double1 == 8.590556703111504E21d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7869557758875051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7082073213196237d + "'", double1 == 0.7082073213196237d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4274266235030735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8868316935392929d + "'", double1 == 0.8868316935392929d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3815006871452328d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5422402091037605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1506498105664662d + "'", double1 == 1.1506498105664662d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.009529184458135626d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.17950655952279498d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double1 = org.apache.commons.math.util.FastMath.abs(20.085536923187668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.085536923187668d + "'", double1 == 20.085536923187668d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0915582968156545d, 1.4844347252766887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6340499054521955d + "'", double2 == 0.6340499054521955d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.2578451663452497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3118919046891928d + "'", double1 == 1.3118919046891928d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.0951332666770965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.126523892887822d + "'", double1 == 7.126523892887822d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9506431907144248d, 2.930313428991271d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.930313428991271d + "'", double2 == 2.930313428991271d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0713634642907175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9231784609934363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7454742974866508d) + "'", double1 == (-0.7454742974866508d));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5900247258946039d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6144289961559061d + "'", double1 == 0.6144289961559061d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5063656411095873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7059602000404158d) + "'", double1 == (-0.7059602000404158d));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2923710782526353d, (-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5160141294778328d) + "'", double2 == (-0.5160141294778328d));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2L, 1.3025850929940461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.466704833957299d + "'", double2 == 2.466704833957299d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9688145798019268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.072618110111349d + "'", double1 == 2.072618110111349d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.009483282630450406d, 0.9058595173841506d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010468440224097982d + "'", double2 == 0.010468440224097982d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.079985974466559E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985961989729E-5d + "'", double1 == 9.079985961989729E-5d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999893299850896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999893299850897d + "'", double1 == 0.9999893299850897d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(526.8331299048269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 526.833129904827d + "'", double1 == 526.833129904827d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.23527328223197624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8082960603483018d + "'", double1 == 1.8082960603483018d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.644483341943245d, 1.6003344910765165d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6444833419432445d + "'", double2 == 4.6444833419432445d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.273736754432579E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.273736754432579E-13d + "'", double1 == 2.273736754432579E-13d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 13L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 13.0f + "'", float1 == 13.0f);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3118919046891928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7757395863495598d + "'", double1 == 3.7757395863495598d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5701287081656916d), 0.04494573522768691d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04494573522768691d + "'", double2 == 0.04494573522768691d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.786083656729492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.238693057170856d, 1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2386930571708556d + "'", double2 == 2.2386930571708556d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-13.124315920229803d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.269062116088924d) + "'", double1 == (-3.269062116088924d));
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7005834764389589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7762148545604776d + "'", double1 == 0.7762148545604776d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4129701157116966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.20472119276137934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.589369423741601d) + "'", double1 == (-0.589369423741601d));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064928217585d + "'", double1 == 0.017455064928217585d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double1 = org.apache.commons.math.util.FastMath.abs(21.42227207044929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.42227207044929d + "'", double1 == 21.42227207044929d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8996379399296265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7326150325826912d + "'", double1 == 0.7326150325826912d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0149280275816273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7677926132124684d + "'", double1 == 0.7677926132124684d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8058302155599485d, (-0.9454760404994205d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8058302155599485d + "'", double2 == 0.8058302155599485d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0103622330573048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5934873005853873d + "'", double1 == 1.5934873005853873d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105049.8032003758d + "'", double1 == 105049.8032003758d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.167375502789719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3428455230553182d + "'", double1 == 2.3428455230553182d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1737190189178428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17285691850744703d + "'", double1 == 0.17285691850744703d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.079985961989729E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0812032351028643E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.966092663504925d) + "'", double1 == (-3.966092663504925d));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8816651612292111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3831970825634745d + "'", double1 == 1.3831970825634745d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 6559L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double1 = org.apache.commons.math.util.FastMath.asinh(152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.717038521867716d + "'", double1 == 5.717038521867716d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9925591367766535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9123687177766381d + "'", double1 == 0.9123687177766381d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7567424583270177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.756742458327018d + "'", double1 == 1.756742458327018d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6306583303604348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8788470742801933d + "'", double1 == 1.8788470742801933d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1679173671934143E40d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2334031175112035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33102839773287596d + "'", double1 == 0.33102839773287596d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math.util.FastMath.asinh(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.04395999972525d + "'", double1 == 7.04395999972525d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5811141142770077d, (double) 6559L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6559.0d + "'", double2 == 6559.0d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double2 = org.apache.commons.math.util.FastMath.max(0.13417614850536844d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567154E14d + "'", double2 == 7.930067261567154E14d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.393440751786198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6004.67479989896d + "'", double1 == 6004.67479989896d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9857874761787422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5097736159129067d + "'", double1 == 1.5097736159129067d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5702200276960676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702200276960678d + "'", double1 == 1.5702200276960678d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3649537293954457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1174415923921306d + "'", double1 == 1.1174415923921306d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2005.0f, 0.92801823594317d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5703334748399476d + "'", double2 == 1.5703334748399476d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        long long1 = org.apache.commons.math.util.FastMath.round(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 78962960182681L + "'", long1 == 78962960182681L);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7880631986597029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3371848034806941d + "'", double1 == 1.3371848034806941d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.6908443102518884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.745427304692527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5737618316160396d, 3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.42625135376606754d + "'", double2 == 0.42625135376606754d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3279.9256224971386d, 2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.7452953479050968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0310116979478843d + "'", double1 == 2.0310116979478843d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double2 = org.apache.commons.math.util.FastMath.max(2.5362067139382427d, (-10.992355853476756d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5362067139382427d + "'", double2 == 2.5362067139382427d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.718281828459045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.1194710708535681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11918867249339503d) + "'", double1 == (-0.11918867249339503d));
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672743d + "'", double1 == 0.9171523356672743d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8358515696195364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3067775938384247d + "'", double1 == 1.3067775938384247d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.881784197001254E-16d, 1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.470460317013458E-16d + "'", double2 == 4.470460317013458E-16d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8570531296713235d + "'", double1 == 1.8570531296713235d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.03814472073326859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5326423497795678d + "'", double1 == 1.5326423497795678d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3216115088844413E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3216115088844415E-11d + "'", double1 == 1.3216115088844415E-11d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04299281412108692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.042966354410623006d + "'", double1 == 0.042966354410623006d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6189908924466622d, 1.4403028592460307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40589920499183396d + "'", double2 == 0.40589920499183396d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9123687177766381d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.01030854798077996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308730564481918d + "'", double1 == 0.010308730564481918d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998610608725E-5d + "'", double1 == 9.07998610608725E-5d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.757421577635591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9115473323121701d + "'", double1 == 0.9115473323121701d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.207401907702447d + "'", double1 == 8.207401907702447d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5337813023984244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7053686466330484d + "'", double1 == 0.7053686466330484d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double1 = org.apache.commons.math.util.FastMath.tan((-13.124315920229801d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6240908895513615d) + "'", double1 == (-0.6240908895513615d));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double2 = org.apache.commons.math.util.FastMath.pow((-36.34032616795694d), (-0.5063656411097465d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5506433159893342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997969349506767d + "'", double1 == 0.9997969349506767d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 13L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1601773562338082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1485728867362902d + "'", double1 == 0.1485728867362902d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.573807232972011d + "'", double1 == 7.573807232972011d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9221952083958849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03517713864733436d) + "'", double1 == (-0.03517713864733436d));
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1966267533422026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        long long1 = org.apache.commons.math.util.FastMath.abs(13L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 13L + "'", long1 == 13L);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2453.0356784138967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.805489164046136d + "'", double1 == 7.805489164046136d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-323.3062153431158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-323.30621534311575d) + "'", double1 == (-323.30621534311575d));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18936.71296522655d + "'", double1 == 18936.71296522655d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7568024953079282d) + "'", double1 == (-0.7568024953079282d));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.8629167984213d + "'", double1 == 38.8629167984213d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1555698629817919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8574443553084918d + "'", double1 == 0.8574443553084918d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5293379817723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0046874060688096d, 0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8595315709695678d + "'", double2 == 0.8595315709695678d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015371184736752325d + "'", double1 == 0.015371184736752325d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4869328269593647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.89617103759529d + "'", double1 == 11.89617103759529d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7253825588523148d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7615165085805538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3042395695680862d + "'", double1 == 1.3042395695680862d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999535225788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182817021203185d + "'", double1 == 2.7182817021203185d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.013811841723194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8488530563129772d + "'", double1 == 0.8488530563129772d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.8860316424407535E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double2 = org.apache.commons.math.util.FastMath.min(0.38195407365429795d, 1.3279842425886166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38195407365429795d + "'", double2 == 0.38195407365429795d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9032560372034026d, 0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9540479077382507d + "'", double2 == 0.9540479077382507d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.020377724655755693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02037631437103149d + "'", double1 == 0.02037631437103149d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.200655107570901E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-5.03214487176113d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04747859541485403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047496451376835516d + "'", double1 == 0.047496451376835516d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double2 = org.apache.commons.math.util.FastMath.min(0.034776717477448635d, 2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7755575615628914E-17d + "'", double2 == 2.7755575615628914E-17d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9002193888246004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9562562360485877d + "'", double1 == 0.9562562360485877d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.48689816668285923d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.697768889097982E-4d, (-0.031682037515117015d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6977688890979814E-4d + "'", double2 == 3.6977688890979814E-4d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 36L, 1.174240018845341d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.174240018845341d + "'", double2 == 1.174240018845341d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7031839360032603E-108d) + "'", double1 == (-1.7031839360032603E-108d));
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1599121686187173d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2005);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2005L + "'", long1 == 2005L);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double2 = org.apache.commons.math.util.FastMath.max(1.055287372175112d, 1.0038696050023175d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.055287372175112d + "'", double2 == 1.055287372175112d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874927409903d + "'", double1 == 10.017874927409903d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-56.72239180482502d) + "'", double1 == (-56.72239180482502d));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double1 = org.apache.commons.math.util.FastMath.tan(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.239582291948687d + "'", double1 == 3.239582291948687d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double2 = org.apache.commons.math.util.FastMath.atan2(15.44596416383918d, (-0.9322410534856177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6310781936490033d + "'", double2 == 1.6310781936490033d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.045392431815163135d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.539242869750105E-4d + "'", double2 == 4.539242869750105E-4d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.9481480091341E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3831824358869964d, 1.1928445361837339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.383182435886996d + "'", double2 == 2.383182435886996d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1088821403655396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6804479352840787d + "'", double1 == 1.6804479352840787d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.1598639151884341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14774023931602442d) + "'", double1 == (-0.14774023931602442d));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        long long1 = org.apache.commons.math.util.FastMath.round(0.023246939094508524d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8524543594406486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9481791009451733d + "'", double1 == 0.9481791009451733d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.14891233518812158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.160571243489659d + "'", double1 == 0.160571243489659d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.635078747156649E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.635078747156649E-9d + "'", double1 == 7.635078747156649E-9d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.6503846142007115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046257937962002074d + "'", double1 == 0.046257937962002074d);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5501637768927256E-17d + "'", double1 == 1.5501637768927256E-17d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4274266235030735d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.8797429772373989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4148895340330202d + "'", double1 == 0.4148895340330202d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double double2 = org.apache.commons.math.util.FastMath.min(2.045799397948117d, 7.805489164046136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.045799397948117d + "'", double2 == 2.045799397948117d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.06519350381048933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06510137697419474d + "'", double1 == 0.06510137697419474d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5063656411097587d), 0.9410822616658444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9410822616658444d + "'", double2 == 0.9410822616658444d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5085350159312789d), 1.2203415586770938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5085350159312789d) + "'", double2 == (-0.5085350159312789d));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8462204041751706d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.4633067985287282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9221952083958849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.83789332827162d + "'", double1 == 52.83789332827162d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double2 = org.apache.commons.math.util.FastMath.max(18936.71296522655d, 1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18936.71296522655d + "'", double2 == 18936.71296522655d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.01537239550868527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015371184793963343d + "'", double1 == 0.015371184793963343d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.52574989159953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7070340408585634d + "'", double1 == 2.7070340408585634d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7101417768967997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.034279652058798d + "'", double1 == 2.034279652058798d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4882662287551745d, 0.39707373807201474d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39707373807201474d + "'", double2 == 0.39707373807201474d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double1 = org.apache.commons.math.util.FastMath.atan(564.2979850674102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.569024215287025d + "'", double1 == 1.569024215287025d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198906d + "'", double1 == 1.3862943611198906d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.856815596594d + "'", double1 == 263.856815596594d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double2 = org.apache.commons.math.util.FastMath.min(9.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1485728867362902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.512599360064637d + "'", double1 == 8.512599360064637d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double1 = org.apache.commons.math.util.FastMath.log(3279.925622497139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.095576025053138d + "'", double1 == 8.095576025053138d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.6011050627869963d), (-1.0697079433475818d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997274d + "'", double1 == 3.4657359027997274d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        float float2 = org.apache.commons.math.util.FastMath.min(36.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.557153674151176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149581328173533d + "'", double1 == 0.9149581328173533d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5097736159129067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9142246332006481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0470063958937448d + "'", double1 == 1.0470063958937448d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8412810707398334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9440892412430648d + "'", double1 == 0.9440892412430648d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.01794144829647875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01794337375926178d) + "'", double1 == (-0.01794337375926178d));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.028471562981618036d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.512599360064637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999192616034d + "'", double1 == 0.9999999192616034d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.466704833957299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.849345000344263d + "'", double1 == 5.849345000344263d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4129701157116966d), 1.2325241103312965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4129701157116966d) + "'", double2 == (-0.4129701157116966d));
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.014403743803069895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014403245797304148d + "'", double1 == 0.014403245797304148d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7326150325826912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.62466259314447d + "'", double1 == 0.62466259314447d);
    }
}

