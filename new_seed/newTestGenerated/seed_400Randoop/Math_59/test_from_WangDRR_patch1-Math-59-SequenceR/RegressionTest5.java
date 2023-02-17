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
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01743362446048348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999848038217972d + "'", double1 == 0.999848038217972d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double1 = org.apache.commons.math.util.FastMath.signum(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8307927247660993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6189908924466622d + "'", double1 == 0.6189908924466622d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5253536785057736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-0.882947592858927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5474250491067253E26d + "'", double1 == 1.5474250491067253E26d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0220501245488431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7788859904968812d + "'", double1 == 2.7788859904968812d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1189396031849523d, 3.5251431659552352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5251431659552352d + "'", double2 == 3.5251431659552352d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5087348157117294d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008879097553696258d) + "'", double1 == (-0.008879097553696258d));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.09254849966825912d), 0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2539945895800114d) + "'", double2 == (-0.2539945895800114d));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.463837428330972d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.510506427637088d + "'", double1 == 11.510506427637088d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9441937262078738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7371431191283907d + "'", double1 == 0.7371431191283907d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04539243181516313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04537685793879663d + "'", double1 == 0.04537685793879663d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9943400969063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.04539243181516313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.922473906616227E-4d + "'", double1 == 7.922473906616227E-4d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9088714301767988d + "'", double1 == 0.9088714301767988d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8816651612292111d + "'", double1 == 0.8816651612292111d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.14891233518812158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4213280739250442d + "'", double1 == 1.4213280739250442d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.20637502874300212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0213710154485947d + "'", double1 == 1.0213710154485947d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5737618316160396d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 52L, 0.23513817840335524d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5321993930593862d + "'", double2 == 2.5321993930593862d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.460094597035771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44523769810820424d + "'", double1 == 0.44523769810820424d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.939216676724527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6622841166519441d + "'", double1 == 0.6622841166519441d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5877618172544402d) + "'", double1 == (-0.5877618172544402d));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        long long1 = org.apache.commons.math.util.FastMath.round(34.999999999999886d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5473651378551416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5473651378551417d + "'", double1 == 0.5473651378551417d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4248349501142077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007414768657038784d + "'", double1 == 0.007414768657038784d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8422760256473161d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5922362574545064d) + "'", double1 == (-2.5922362574545064d));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0590011172720796d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5811141142770077d, 19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.781104616480253d + "'", double2 == 19.781104616480253d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4844347252766887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4124704496626688d + "'", double1 == 3.4124704496626688d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3649537293954457d + "'", double1 == 1.3649537293954457d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1113677062085956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46767478906827653d + "'", double1 == 0.46767478906827653d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4593566380802732d + "'", double1 == 1.4593566380802732d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0911052960943115d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5191429678165033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2847130244570347d) + "'", double1 == (-0.2847130244570347d));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double1 = org.apache.commons.math.util.FastMath.atan(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5283890156232007d + "'", double1 == 1.5283890156232007d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4547984266763987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double2 = org.apache.commons.math.util.FastMath.atan2(97.0d, 7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 5.0f, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.373400766945016d + "'", double2 == 1.373400766945016d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02037772465575569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02037490473029824d + "'", double1 == 0.02037490473029824d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9717769481908543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9857874761787422d + "'", double1 == 0.9857874761787422d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.15491406168101263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15617144518908815d + "'", double1 == 0.15617144518908815d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02037772465575569d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double1 = org.apache.commons.math.util.FastMath.rint(7871.825828205633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7872.0d + "'", double1 == 7872.0d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0911052960943115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6567042118906716d + "'", double1 == 1.6567042118906716d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6734086685536975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5148626650701376d + "'", double1 == 0.5148626650701376d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5283890156232007d, 4.281623811241125E59d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.281623811241125E59d + "'", double2 == 4.281623811241125E59d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5108256237659906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4705882352941176d) + "'", double1 == (-0.4705882352941176d));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.09711515743188391d), 0.019462906223117808d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09711515743188391d) + "'", double2 == (-0.09711515743188391d));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.295214085529645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1719235979111335d + "'", double1 == 0.1719235979111335d);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1189396031849521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8996379399296265d + "'", double1 == 0.8996379399296265d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1598987305185835d, 564.2988711233953d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1598987305185835d + "'", double2 == 1.1598987305185835d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9940685753209271d + "'", double1 == 0.9940685753209271d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double double2 = org.apache.commons.math.util.FastMath.min(138.0d, 0.6577567619657163d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6577567619657163d + "'", double2 == 0.6577567619657163d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double1 = org.apache.commons.math.util.FastMath.tanh(12.238292298814303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999531204d + "'", double1 == 0.9999999999531204d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        long long2 = org.apache.commons.math.util.FastMath.max(6559L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6559L + "'", long2 == 6559L);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8295667582777111d), (-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008837977760189355d) + "'", double2 == (-0.008837977760189355d));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01965354335811999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8918900011220077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0149280275816273d + "'", double1 == 1.0149280275816273d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.34032616795694d) + "'", double1 == (-36.34032616795694d));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9234637104758648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7456282765000656d + "'", double1 == 0.7456282765000656d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5294913521432763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double double1 = org.apache.commons.math.util.FastMath.ulp(27.289917197127753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.1124649919871528E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.112464991987175E-14d + "'", double1 == 2.112464991987175E-14d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double1 = org.apache.commons.math.util.FastMath.atanh(14.389377026852705d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.12270990624068587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12270990624068587d + "'", double1 == 0.12270990624068587d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835171d + "'", double1 == 1.2261911708835171d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0655569873089485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027576681278744613d + "'", double1 == 0.027576681278744613d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8464654362980488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8464654362980488d + "'", double1 == 1.8464654362980488d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5860134523134298E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07270966677774479d + "'", double1 == 0.07270966677774479d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 49.52813017280076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2203415586770938d, (-1.5701287081656914d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5701287081656914d) + "'", double2 == (-1.5701287081656914d));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000041223074d + "'", double1 == 1.0000000041223074d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9534625892455924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4900413211439332d + "'", double1 == 1.4900413211439332d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 51.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.046745412134694E21d + "'", double1 == 7.046745412134694E21d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.092409887937381d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.992355853476756d) + "'", double1 == (-10.992355853476756d));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2520720804617534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24947618371523714d + "'", double1 == 0.24947618371523714d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.922473906616227E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.922473077851842E-4d + "'", double1 == 7.922473077851842E-4d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double1 = org.apache.commons.math.util.FastMath.abs((-89.00499281765603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.00499281765603d + "'", double1 == 89.00499281765603d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999535225788d + "'", double1 == 0.9999999535225788d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1428790501832544d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.1010569721060828d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7715216602443777d, 1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7715216602443775d + "'", double2 == 1.7715216602443775d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.713130608547954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4567608960260546d + "'", double1 == 0.4567608960260546d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4160734237838899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.238991635001947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7353126200110887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06519350381048933d + "'", double1 == 0.06519350381048933d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5410395588486396d, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1344439571520295d + "'", double2 == 0.1344439571520295d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8485804212570964d), 1.1101797748672972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8485804212570964d) + "'", double2 == (-0.8485804212570964d));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.788723182374374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.002010842499900642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0020088234623122656d + "'", double1 == 0.0020088234623122656d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double1 = org.apache.commons.math.util.FastMath.signum(28.92036009556794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0580782213705773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.238991635001947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8451677598626034d + "'", double1 == 0.8451677598626034d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.325835187949904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3665789367467411d + "'", double1 == 0.3665789367467411d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1752012000048542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double1 = org.apache.commons.math.util.FastMath.log(0.027241040673019475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6030305945752334d) + "'", double1 == (-3.6030305945752334d));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double1 = org.apache.commons.math.util.FastMath.floor(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double2 = org.apache.commons.math.util.FastMath.atan2(96.99484522385717d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3358347343868286E40d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.03505838110136253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03505120341912517d + "'", double1 == 0.03505120341912517d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4486454104648998d + "'", double1 == 1.4486454104648998d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5287499284227858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5811141142770077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6649237511146353d + "'", double1 == 1.6649237511146353d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.23513817840335524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23962146800113912d + "'", double1 == 0.23962146800113912d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4575013994861008d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 2005);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.5085350159312789d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104278850811079d + "'", double1 == 2.104278850811079d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2325241103312965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.15339215657878688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15339215657878688d + "'", double1 == 0.15339215657878688d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        double double1 = org.apache.commons.math.util.FastMath.asinh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        long long2 = org.apache.commons.math.util.FastMath.max(51L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 51L + "'", long2 == 51L);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.038399603650754E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double1 = org.apache.commons.math.util.FastMath.sinh(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156721E14d + "'", double1 == 7.93006726156721E14d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.009338481576d + "'", double1 == 32.009338481576d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.33059728741746425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3190573640867307d) + "'", double1 == (-0.3190573640867307d));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0384003448748685E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double1 = org.apache.commons.math.util.FastMath.sin((-5.377465624848392d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.786869488650853d + "'", double1 == 0.786869488650853d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.028730419947965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7872015511864028E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2860799720538746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33119890970646915d + "'", double1 == 0.33119890970646915d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double2 = org.apache.commons.math.util.FastMath.max(1.463837428330972d, 4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.158638853279167d + "'", double2 == 4.158638853279167d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3649537293954457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8607584570148492d + "'", double1 == 0.8607584570148492d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9666819391258082d + "'", double1 == 0.9666819391258082d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8235811162606056d + "'", double1 == 0.8235811162606056d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7790360334325874d + "'", double1 == 0.7790360334325874d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.757421577635591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8816651612292111d, 0.027241040673019475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.996575062024539d + "'", double2 == 0.996575062024539d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.20963059080589155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20663836161031418d + "'", double1 == 0.20663836161031418d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4900413211439332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1059577627892154d + "'", double1 == 2.1059577627892154d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-23.03580664819349d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(147.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 147.41315910257663d + "'", double1 == 147.41315910257663d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5737618316160396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999956028938003d + "'", double1 == 0.9999956028938003d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double2 = org.apache.commons.math.util.FastMath.pow(2453.035678413897d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2453.0355994876113d + "'", double2 == 2453.0355994876113d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9131871133554458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.40517925701617413d), 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.570796326794879d) + "'", double2 == (-1.570796326794879d));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.5321993930593862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5321993930593862d + "'", double1 == 2.5321993930593862d);
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
        double double1 = org.apache.commons.math.util.FastMath.log10(7.217373703740946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8583791929340127d + "'", double1 == 0.8583791929340127d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.745427304692527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7454273046925272d + "'", double1 == 0.7454273046925272d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.635447929274436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.663310606035718d + "'", double1 == 2.663310606035718d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013611086516481827d) + "'", double1 == (-0.013611086516481827d));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.238693057170856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9775291852754583d + "'", double1 == 0.9775291852754583d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.10904522841698205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(58.55915858746884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8832761544354315d + "'", double1 == 3.8832761544354315d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.467108650523244d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097465d) + "'", double1 == (-0.5063656411097465d));
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
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.420282415626885d + "'", double1 == 1.420282415626885d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7321095807146255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0794627783515645d + "'", double1 == 2.0794627783515645d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.028730419947965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5119471234779015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.290774892867231d) + "'", double1 == (-0.290774892867231d));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.26736318179044144d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double1 = org.apache.commons.math.util.FastMath.tanh(97.68799240441712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math.util.FastMath.tanh(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1752011936438014d, 0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0241519893614606d + "'", double2 == 1.0241519893614606d);
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
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double1 = org.apache.commons.math.util.FastMath.ceil(33.66561760358879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.0d + "'", double1 == 34.0d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6632456843634444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5856304902609806d + "'", double1 == 0.5856304902609806d);
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
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8692376423995615d + "'", double1 == 0.8692376423995615d);
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
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6842868307608122d) + "'", double1 == (-0.6842868307608122d));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1679596500040805d + "'", double1 == 4.1679596500040805d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double double1 = org.apache.commons.math.util.FastMath.signum(2453.0355994876113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999103740052037d + "'", double1 == 0.9999103740052037d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2111828491680883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3580113828839064d + "'", double1 == 1.3580113828839064d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.002644512574656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0008807282815244d + "'", double1 == 1.0008807282815244d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1760939939322343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0005784555913422d + "'", double1 == 1.0005784555913422d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(81.78552109133565d, 0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 81.78552109133564d + "'", double2 == 81.78552109133564d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.319776824715853d + "'", double1 == 2.319776824715853d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7715216602443775d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.238991635001947d, 0.4888509771384419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.194992268641593d + "'", double2 == 1.194992268641593d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5834613951988719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.538526609641118d + "'", double1 == 2.538526609641118d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549012d) + "'", double1 == (-1.5574077246549012d));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5871754974860688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8043030509434319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6362946731864967d + "'", double1 == 0.6362946731864967d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double2 = org.apache.commons.math.util.FastMath.pow(21.445599564021325d, 1.0001181575986342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.45336887641879d + "'", double2 == 21.45336887641879d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.17645782688986E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.176458612301354E-4d + "'", double1 == 6.176458612301354E-4d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7063058773712644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8797735902569003d + "'", double1 == 0.8797735902569003d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double1 = org.apache.commons.math.util.FastMath.atanh(533.2433869852506d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double1 = org.apache.commons.math.util.FastMath.sin(1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8677880986532194d + "'", double1 == 0.8677880986532194d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0020193662807058d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.761650491274035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7024415241302789d + "'", double1 == 0.7024415241302789d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-2.7131306085479543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2005.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.0d + "'", double1 == 2005.0d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665127d + "'", double1 == 0.9033391107665127d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.38818646476211366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double1 = org.apache.commons.math.util.FastMath.log((-3.092409887937381d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.357486930108681d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.43081945257903537d, 2.0086972736692794d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18425105161950944d + "'", double2 == 0.18425105161950944d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986068656757E-5d + "'", double1 == 9.079986068656757E-5d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0697079433475818d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.1574928494310313d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.2734116922871087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.280434632619868d) + "'", double1 == (-0.280434632619868d));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.12952606822871066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12916659901223482d + "'", double1 == 0.12916659901223482d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779276891516d + "'", double1 == 57.295779276891516d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7110135287323527d + "'", double1 == 0.7110135287323527d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.04747859541485403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.720323134480318d + "'", double1 == 2.720323134480318d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4626307887385793d) + "'", double1 == (-0.4626307887385793d));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double double1 = org.apache.commons.math.util.FastMath.rint(170.75141916320402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 171.0d + "'", double1 == 171.0d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(423.3617290541267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24256.840282162542d + "'", double1 == 24256.840282162542d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4122900538217174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1053461109058813d + "'", double1 == 3.1053461109058813d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(32.009338481576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5586683478888236d + "'", double1 == 0.5586683478888236d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.019461677566018642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1150719867773047d + "'", double1 == 1.1150719867773047d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6734086685536975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.635447929274436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4684455400559973d) + "'", double1 == (-2.4684455400559973d));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        long long1 = org.apache.commons.math.util.FastMath.round(0.23089832850992176d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 24.19638901669072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988093d + "'", double1 == 4.605170185988093d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.9481480091341E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134101E13d + "'", double1 == 3.948148009134101E13d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44726467702583395d + "'", double1 == 0.44726467702583395d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8058302155599485d, 4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17286387060702385d + "'", double2 == 0.17286387060702385d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.0951332666770965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3702197021636928d + "'", double1 == 1.3702197021636928d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3496452317282857d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024913294410754103d + "'", double1 == 0.024913294410754103d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (short) 100, 0.01409149002819991d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0911052960943115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.112464991987175E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4534321422024404E-7d + "'", double1 == 1.4534321422024404E-7d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.08620304488139699d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double2 = org.apache.commons.math.util.FastMath.max((-89.00499281765603d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double1 = org.apache.commons.math.util.FastMath.exp(100.00000000000011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.688117141816441E43d + "'", double1 == 2.688117141816441E43d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5585053606381853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5068676300960874d + "'", double1 == 0.5068676300960874d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4596132072859689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45961320728596894d + "'", double1 == 0.45961320728596894d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.3091542734486868d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9525912254636142d + "'", double1 == 0.9525912254636142d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9586654676184497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9791146345645385d + "'", double1 == 0.9791146345645385d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8479780433329283E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000001847977d + "'", double1 == 1.0000000001847977d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9486832980505138d + "'", double1 == 0.9486832980505138d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.43081945257903537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35824732390650105d + "'", double1 == 0.35824732390650105d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.119741647423155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0713634642907175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3755807901428491d + "'", double1 == 0.3755807901428491d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.357415841954476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.071731403574208d + "'", double1 == 2.071731403574208d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.079986118564083E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.43081945257903537d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math.util.FastMath.tanh(43.51625986486027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.39707373807201474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39707373807201474d + "'", double1 == 0.39707373807201474d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.914747959740454d, 0.9791146345645385d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2467218939517983d + "'", double2 == 1.2467218939517983d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2248497229193942E-5d + "'", double1 == 1.2248497229193942E-5d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8807733836535281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4127649780327654d + "'", double1 == 1.4127649780327654d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double2 = org.apache.commons.math.util.FastMath.max(57.28518781699162d, 1.3092616699137571d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.28518781699162d + "'", double2 == 57.28518781699162d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3580113828839064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3348133298708282d + "'", double1 == 1.3348133298708282d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double1 = org.apache.commons.math.util.FastMath.asin(18.51629785054141d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000018d + "'", double1 == 1.0000000000000018d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0552873721751121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7204156786459374d + "'", double1 == 0.7204156786459374d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double2 = org.apache.commons.math.util.FastMath.min(Double.NaN, (double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double2 = org.apache.commons.math.util.FastMath.pow(100.0d, 0.16601303451652813d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1479594040306007d + "'", double2 == 2.1479594040306007d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8043030509434319d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1106811952307287d + "'", double1 == 1.1106811952307287d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8451677598626034d, 0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8245906506052292d + "'", double2 == 0.8245906506052292d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.735339681653402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7430987570063676d + "'", double1 == 2.7430987570063676d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.48689816668285923d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4868981666828592d) + "'", double1 == (-0.4868981666828592d));
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.273736754432579E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544325796E-13d + "'", double1 == 2.2737367544325796E-13d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570705526933711d + "'", double1 == 1.570705526933711d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.14891233518812158d, 0.5410395588486396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1489123351881216d + "'", double2 == 0.1489123351881216d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02037631460522075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020377724655755693d + "'", double1 == 0.020377724655755693d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double2 = org.apache.commons.math.util.FastMath.max(5.298342365610589d, 0.5473651378551417d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.298342365610589d + "'", double2 == 5.298342365610589d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.0d, 1.5871754974860688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.999999999999998d + "'", double2 == 8.999999999999998d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.038991025401791155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03898115247832509d + "'", double1 == 0.03898115247832509d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.40517925701617413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4171748948550446d) + "'", double1 == (-0.4171748948550446d));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1074946319245942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(151.64788521288048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.332679130150692d + "'", double1 == 5.332679130150692d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double1 = org.apache.commons.math.util.FastMath.tan(2079.7037844276283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030561758594993573d) + "'", double1 == (-0.030561758594993573d));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.5922362574545064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5922362574545064d + "'", double1 == 2.5922362574545064d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8677880986532194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7147307549458812d + "'", double1 == 0.7147307549458812d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.4160734237838899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3936173560075417d) + "'", double1 == (-0.3936173560075417d));
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7798578119818305d), 0.43081945257903537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43081945257903537d + "'", double2 == 0.43081945257903537d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-51.9999999999999d) + "'", double1 == (-51.9999999999999d));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9131871133554458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.32176750100173d + "'", double1 == 52.32176750100173d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9976952979536658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5495411464777387d) + "'", double1 == (-1.5495411464777387d));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.31939525110418027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31419995203572465d) + "'", double1 == (-0.31419995203572465d));
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.11559959687985162d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9933258039911422d + "'", double1 == 0.9933258039911422d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.766302783569967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9625203725139667d + "'", double1 == 0.9625203725139667d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.7452953479050968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5734860711430395d + "'", double1 == 0.5734860711430395d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2005.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2005, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6622841166519441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6214949279424251d + "'", double1 == 0.6214949279424251d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0020193662807058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8425603366327095d + "'", double1 == 0.8425603366327095d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0655569873089485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0655569873089488d + "'", double1 == 1.0655569873089488d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.007414768657038784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0074423261227956d + "'", double1 == 1.0074423261227956d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8295667582777111d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9783313844591589d) + "'", double1 == (-0.9783313844591589d));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6562860065218095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7922638897815387d + "'", double1 == 0.7922638897815387d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int int2 = org.apache.commons.math.util.FastMath.max(2005, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2005 + "'", int2 == 2005);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1423973302809369d + "'", double1 == 0.1423973302809369d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7411927010455706d, 0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8414709848078964d + "'", double2 == 0.8414709848078964d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double2 = org.apache.commons.math.util.FastMath.max(2.3831824358869964d, 0.045392431815163135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3831824358869964d + "'", double2 == 2.3831824358869964d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2698012268765735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9205161400081323d + "'", double1 == 1.9205161400081323d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.2724434278529467d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2793905035922931d) + "'", double1 == (-0.2793905035922931d));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3025850929940463d + "'", double1 == 2.3025850929940463d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 4.0f, 5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.627257854466711E-64d + "'", double2 == 7.627257854466711E-64d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        long long1 = org.apache.commons.math.util.FastMath.round(2.0951332666770965d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double1 = org.apache.commons.math.util.FastMath.tan(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.880519781392989d) + "'", double1 == (-3.880519781392989d));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.14891233518812158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double1 = org.apache.commons.math.util.FastMath.signum(92.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9322410534856177d), 0.07258194039108286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.493095594279128d) + "'", double2 == (-1.493095594279128d));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7878677702215401d, 1.0811447935062402E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706591026530312d + "'", double2 == 1.5706591026530312d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double1 = org.apache.commons.math.util.FastMath.asinh(43.51625986486027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.466413831809194d + "'", double1 == 4.466413831809194d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double2 = org.apache.commons.math.util.FastMath.max(2.652900463031381d, 526.8331299048269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 526.8331299048269d + "'", double2 == 526.8331299048269d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6186254796916717d + "'", double1 == 0.6186254796916717d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.890818211544855E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.951773034959196d + "'", double1 == 27.951773034959196d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5293379817723d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7790360334325874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1793704123873463d + "'", double1 == 1.1793704123873463d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999956028938003d, 3.7353126200110887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26157996738611367d + "'", double2 == 0.26157996738611367d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1372116513917385d + "'", double1 == 2.1372116513917385d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.9588076367332303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
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
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0251498688147915d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
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
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.2570569097055435E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.257056909705544E10d + "'", double1 == 2.257056909705544E10d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4567608960260546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42846204504183943d + "'", double1 == 0.42846204504183943d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double2 = org.apache.commons.math.util.FastMath.atan2(51.999999999999986d, 564.2988711233952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09189023888044913d + "'", double2 == 0.09189023888044913d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double2 = org.apache.commons.math.util.FastMath.atan2(20.085536923187668d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.0626395431802995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7866720044340358d) + "'", double1 == (-0.7866720044340358d));
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2490457723982544d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double1 = org.apache.commons.math.util.FastMath.sinh(503.55674565883726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4597216805978954E218d + "'", double1 == 2.4597216805978954E218d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2073305257621814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0648180240443148d + "'", double1 == 1.0648180240443148d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.364545848650388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9278270079512447d + "'", double1 == 1.9278270079512447d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.009528896040185642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009574440517976634d + "'", double1 == 0.009574440517976634d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9205161400081323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.741896957789622d) + "'", double1 == (-2.741896957789622d));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6335140007329974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6767482764542891d + "'", double1 == 0.6767482764542891d);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double2 = org.apache.commons.math.util.FastMath.pow((-5.377465624848392d), 1.231690697458971d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9929402025489149d + "'", double1 == 0.9929402025489149d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7345106490374572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5507253269518918d + "'", double1 == 0.5507253269518918d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5063656411097588d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double1 = org.apache.commons.math.util.FastMath.log10(21.45336887641879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3314955002296927d + "'", double1 == 1.3314955002296927d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09189023888044913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.2734116922871087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3193952511041802d) + "'", double1 == (-0.3193952511041802d));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.9830700822184464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.983070082218447d + "'", double1 == 2.983070082218447d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7345106490374572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0844617095432145d + "'", double1 == 2.0844617095432145d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4248349501142077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41217040928917d + "'", double1 == 0.41217040928917d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.055287372175112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.463512599085256d + "'", double1 == 60.463512599085256d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8827950360317249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7232278697327194d + "'", double1 == 0.7232278697327194d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8259963669851865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1754024465790212d) + "'", double1 == (-1.1754024465790212d));
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.857041449915169d, 0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4914382287865444d + "'", double2 == 1.4914382287865444d);
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
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5501702829958329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5006478239302304d + "'", double1 == 0.5006478239302304d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2248497229193942E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2248497229806472E-5d + "'", double1 == 1.2248497229806472E-5d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        double double2 = org.apache.commons.math.util.FastMath.min(1.219379580148095d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.009483282630450406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999550340122696d + "'", double1 == 0.9999550340122696d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1793704123873463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7798990962278105d + "'", double1 == 1.7798990962278105d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.86787163447061d + "'", double1 == 42.86787163447061d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7351801576829817d + "'", double1 == 0.7351801576829817d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double2 = org.apache.commons.math.util.FastMath.min(2.3978952727983707d, (-0.8402235152809697d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8402235152809697d) + "'", double2 == (-0.8402235152809697d));
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6632456843634444d, 0.7321095807146255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7403654500754642d + "'", double2 == 0.7403654500754642d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.027066513565235144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
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
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9385078997951388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.806677178940103d + "'", double1 == 0.806677178940103d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2005, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2642899025042186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9652782386627705d + "'", double1 == 0.9652782386627705d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3923993423012373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double1 = org.apache.commons.math.util.FastMath.acosh(794.3624897466268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.370686677641593d + "'", double1 == 7.370686677641593d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8145870194540231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9520168539290896d + "'", double1 == 0.9520168539290896d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int int1 = org.apache.commons.math.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double2 = org.apache.commons.math.util.FastMath.min(6.389478437674908E19d, 0.874048095857851d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.874048095857851d + "'", double2 == 0.874048095857851d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3025057412487842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.036895443825105d, 3.5019296225954823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0368954438251052d + "'", double2 == 1.0368954438251052d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 36L, 147.41315910257663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.0d + "'", double2 == 36.0d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3728048593649235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.719714945907588d + "'", double1 == 0.719714945907588d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.552713678800564E-14d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.552713678800564E-14d) + "'", double1 == (-3.552713678800564E-14d));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        long long2 = org.apache.commons.math.util.FastMath.min(36L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double2 = org.apache.commons.math.util.FastMath.max(1.036895443825105d, (-0.3091542734486868d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.036895443825105d + "'", double2 == 1.036895443825105d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.11742496684289d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3649255980017991d) + "'", double1 == (-1.3649255980017991d));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.27341169228710865d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.665336037580888d) + "'", double1 == (-15.665336037580888d));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015373606509534388d + "'", double1 == 0.015373606509534388d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) 3280L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3280.0f + "'", float2 == 3280.0f);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 4L, 0.1489123351881216d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5335854272192775d + "'", double2 == 1.5335854272192775d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2520720804617534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double2 = org.apache.commons.math.util.FastMath.atan2(328280.6350011744d, 0.44127637925208785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570794982590176d + "'", double2 == 1.570794982590176d);
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
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0103622330573048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1912543356541123d + "'", double1 == 1.1912543356541123d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3815006871452328d, 1.0655569873089485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38150068714523283d + "'", double2 == 0.38150068714523283d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6782858550610651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2389916350019468d + "'", double1 == 1.2389916350019468d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.45961320728596883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5834613951988717d + "'", double1 == 0.5834613951988717d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6312239307697934d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9204604704918524d) + "'", double1 == (-0.9204604704918524d));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5877618172544402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44443064002423105d) + "'", double1 == (-0.44443064002423105d));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.0626395431802995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9249802099283556d) + "'", double1 == (-0.9249802099283556d));
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-10.992355853476756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19185280219404077d) + "'", double1 == (-0.19185280219404077d));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4122900538217174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024649111432356895d + "'", double1 == 0.024649111432356895d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9625203725139667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2961470362394922d + "'", double1 == 1.2961470362394922d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9142246332006481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.494840085597921d + "'", double1 == 2.494840085597921d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7992447670407303E-4d, 0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7992447670407303E-4d + "'", double2 == 1.7992447670407303E-4d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.93006726156721E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948954d + "'", double1 == 1.5707963267948954d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9586654676184497d, 8.207110122769961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.207110122769961d + "'", double2 == 8.207110122769961d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8485804212570964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7503427504189538d) + "'", double1 == (-0.7503427504189538d));
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 0, 12.010147458377778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double1 = org.apache.commons.math.util.FastMath.log10(23.566702073076858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3722988115580157d + "'", double1 == 1.3722988115580157d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091341L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091341L + "'", long2 == 39481480091341L);
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
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9525912254636142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5424779506349352E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837747656337032d) + "'", double1 == (-0.008837747656337032d));
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0103622330573048d, 36.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.0d + "'", double2 == 36.0d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.18650080065297936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18438251128883068d + "'", double1 == 0.18438251128883068d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.346544323973411d + "'", double1 == 9.346544323973411d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.273736754432579E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000002274d + "'", double1 == 1.0000000000002274d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double double2 = org.apache.commons.math.util.FastMath.min(0.999999999733659d, 0.2650835638831246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2650835638831246d + "'", double2 == 0.2650835638831246d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.33119890970646915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31982834465543714d + "'", double1 == 0.31982834465543714d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.16601303451652813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1535902666964596d + "'", double1 == 0.1535902666964596d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.00000000000001d + "'", double1 == 45.00000000000001d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double2 = org.apache.commons.math.util.FastMath.min(2.1372116513917385d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.806059476593382E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.99082568500844d + "'", double1 == 36.99082568500844d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.019529180206536243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1189396031849521d + "'", double1 == 1.1189396031849521d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.278010815082652d + "'", double1 == 0.278010815082652d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double1 = org.apache.commons.math.util.FastMath.tanh(123.44001497540268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 6559L, 7.370686677641593d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.357420103411657E28d + "'", double2 == 1.357420103411657E28d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9455557866374292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9455557866374293d + "'", double1 == 0.9455557866374293d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        float float2 = org.apache.commons.math.util.FastMath.min(2005.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1113677062085956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8045453218260719d + "'", double1 == 0.8045453218260719d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2261911632538862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04539243181516313d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04540802173355351d + "'", double1 == 0.04540802173355351d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.3079900213234987E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3079900215284027E-5d) + "'", double1 == (-2.3079900215284027E-5d));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        float float2 = org.apache.commons.math.util.FastMath.max(2005.0f, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7454273046925272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09247351917780995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09221082649558883d + "'", double1 == 0.09221082649558883d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        long long1 = org.apache.commons.math.util.FastMath.abs(36L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0928900516588147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.323818048994663d + "'", double1 == 1.323818048994663d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8940757456435277d, 20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8940757456435277d + "'", double2 == 0.8940757456435277d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5961722400471147d) + "'", double1 == (-0.5961722400471147d));
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.24154560853011509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23695510898143343d + "'", double1 == 0.23695510898143343d);
    }
}

