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
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9672751491015754d, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8887992509694498d + "'", double2 == 0.8887992509694498d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double double1 = org.apache.commons.math.util.FastMath.tan(146408.8292591365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4750868533986696d + "'", double1 == 2.4750868533986696d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.077668423659947d + "'", double1 == 11.077668423659947d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3505504618025204d + "'", double1 == 2.3505504618025204d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.46579480672d + "'", double1 == 22026.46579480672d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5674369031063861d) + "'", double1 == (-0.5674369031063861d));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9905441402385452d) + "'", double1 == (-0.9905441402385452d));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0816105324227274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.40992093582609207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5711009442099724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5711009442099726d + "'", double1 == 1.5711009442099726d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8431082790768843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 4.644483341943246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.644483341943246d + "'", double2 == 4.644483341943246d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0014414133113334d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.506976913724955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9363055236908925d, 17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.247748258387592d + "'", double2 == 17.247748258387592d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.03202856368786667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.590038910379708E-4d + "'", double1 == 5.590038910379708E-4d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02544337342753222d + "'", double1 == 0.02544337342753222d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5799018512655504d, 1.145976303209723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.468462369872704d + "'", double2 == 0.468462369872704d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.414062290979883d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7885839348184186d + "'", double1 == 0.7885839348184186d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.702331196945153d + "'", double1 == 0.702331196945153d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.2646180550224786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03952504136025236d + "'", double1 == 0.03952504136025236d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695611777d + "'", double1 == 2.2924316695611777d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5329806043723968d) + "'", double1 == (-0.5329806043723968d));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5427661770824743d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000674849673199d + "'", double1 == 1.000674849673199d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.4750868533986696d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        long long1 = org.apache.commons.math.util.FastMath.round(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2, (-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5527050564662712d + "'", double2 == 0.5527050564662712d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7874470920119091d + "'", double1 == 0.7874470920119091d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.4650188248182272d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.1731525181731936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1749148048147111d) + "'", double1 == (-0.1749148048147111d));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8292136654695167d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.0500567432162665E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.050056743216267E7d + "'", double1 == 2.050056743216267E7d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017438277374752006d) + "'", double1 == (-0.017438277374752006d));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.6719977351570301d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        long long1 = org.apache.commons.math.util.FastMath.round(1.560391584864855d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41592402552475427d + "'", double1 == 0.41592402552475427d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        long long1 = org.apache.commons.math.util.FastMath.round(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5553313201112098d, (-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5553313201112098d + "'", double2 == 1.5553313201112098d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23585732697719813d + "'", double1 == 0.23585732697719813d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.633123935319537E16d) + "'", double1 == (-1.633123935319537E16d));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double1 = org.apache.commons.math.util.FastMath.acosh(68.40322401739336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.918513704344091d + "'", double1 == 4.918513704344091d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.053714424981458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.620552484550977d + "'", double1 == 10.620552484550977d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.015388982106145104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015390197088988328d) + "'", double1 == (-0.015390197088988328d));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.15300256822516015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.815301279269628d) + "'", double1 == (-0.815301279269628d));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8593267093280548d + "'", double1 == 0.8593267093280548d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5982487386901945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11.0d, 0.5740962263285927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5186530699855672d + "'", double2 == 1.5186530699855672d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-4.9E-324d), 0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9260416922830169d + "'", double1 == 0.9260416922830169d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-35.35050620855721d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-36));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double1 = org.apache.commons.math.util.FastMath.acosh(43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.457194883916838d + "'", double1 == 4.457194883916838d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        float float2 = org.apache.commons.math.util.FastMath.max((-53.0f), (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152448d + "'", double1 == 1.5430806348152448d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19597713059399055d + "'", double1 == 0.19597713059399055d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double2 = org.apache.commons.math.util.FastMath.max(5.293329949408896d, 1.8651416687828506E11d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8651416687828506E11d + "'", double2 == 1.8651416687828506E11d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996848499053114d + "'", double1 == 0.9996848499053114d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double2 = org.apache.commons.math.util.FastMath.min(0.22835733688570242d, 0.4472118490899239d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22835733688570242d + "'", double2 == 0.22835733688570242d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.703530868239122d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9516311810082599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7405206305258232d) + "'", double1 == (-0.7405206305258232d));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.982478439757621E7d + "'", double1 == 3.982478439757621E7d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.377210720844658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8884814209157137d + "'", double1 == 0.8884814209157137d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8693235746902677d, 35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8693235746902677d + "'", double2 == 0.8693235746902677d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.45745887055879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9854342165774551d + "'", double1 == 0.9854342165774551d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5106730734832936d, 0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6701982005616954d + "'", double2 == 0.6701982005616954d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5716315636979223d + "'", double1 == 0.5716315636979223d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        long long2 = org.apache.commons.math.util.FastMath.max(36L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double2 = org.apache.commons.math.util.FastMath.max(630998.4197775756d, (-0.27234146891183075d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 630998.4197775756d + "'", double2 == 630998.4197775756d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9727829084506698d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99484522385717d + "'", double1 == 96.99484522385717d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963274966374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.00000004020679d + "'", double1 == 90.00000004020679d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8427269113676636d + "'", double1 == 0.8427269113676636d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9428090415820635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5344733951434961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.706549328424579d + "'", double1 == 0.706549328424579d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6719977351570301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9581452714622315d + "'", double1 == 0.9581452714622315d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4577979139729036d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706386041602216d + "'", double1 == 1.5706386041602216d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1928939093273927d) + "'", double1 == (-2.1928939093273927d));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.015388982106145104d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37076030339985566d + "'", double1 == 0.37076030339985566d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6508801680230075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7087432273413581d + "'", double1 == 0.7087432273413581d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7215087615242685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7215087615242686d + "'", double1 == 0.7215087615242686d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double2 = org.apache.commons.math.util.FastMath.min(0.01976389133388643d, (double) (-3L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0d) + "'", double2 == (-3.0d));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2212855030945258d + "'", double1 == 1.2212855030945258d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-16d + "'", double1 == 8.881784197001254E-16d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2648389735541739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6301187513103574d + "'", double1 == 1.6301187513103574d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double1 = org.apache.commons.math.util.FastMath.asinh(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.691029831908529d + "'", double1 == 4.691029831908529d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int int1 = org.apache.commons.math.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5013507798060323d + "'", double1 == 0.5013507798060323d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 34L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-7.091998009803879d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.706549328424579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7861862102264855d + "'", double1 == 0.7861862102264855d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7430243621557113d, 4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7430243621557114d + "'", double2 == 0.7430243621557114d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5855174436770063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6630829213736404d + "'", double1 == 0.6630829213736404d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9679651155126135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-1.5347252927908293d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5347252927908293d) + "'", double2 == (-1.5347252927908293d));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007582068426303211d + "'", double1 == 0.007582068426303211d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4711276743037347d, 1.7220034424505188d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7069919036982613d + "'", double2 == 0.7069919036982613d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.27572056477178236d), 0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.27572056477178236d) + "'", double2 == (-0.27572056477178236d));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5553313201112098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6917300921120252d + "'", double1 == 0.6917300921120252d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5195675877329186d + "'", double1 == 0.5195675877329186d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5370843467987585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.772666314109507d + "'", double1 == 30.772666314109507d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01568485717214877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8045194316764734d) + "'", double1 == (-1.8045194316764734d));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double1 = org.apache.commons.math.util.FastMath.log(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19692511252438968d + "'", double1 == 0.19692511252438968d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double1 = org.apache.commons.math.util.FastMath.acos(8.467717607067357E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.25135294326645075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 53L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8059788673771909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.115445474195378d + "'", double1 == 1.115445474195378d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9145768651795099d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4047671643148918d + "'", double1 == 1.4047671643148918d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.40429714988426d + "'", double1 == 1.40429714988426d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4001817886098734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9727829084506698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.716854397550169d + "'", double1 == 4.716854397550169d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6591354567261247d) + "'", double1 == (-0.6591354567261247d));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8636125475150462d + "'", double1 == 0.8636125475150462d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double1 = org.apache.commons.math.util.FastMath.acos(34.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.01505863975516233d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9568368804140315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9568368804140315d + "'", double1 == 0.9568368804140315d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8887992509694498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8005182678076421d + "'", double1 == 0.8005182678076421d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.475919246252206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9577535432799731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.111040995153103d + "'", double1 == 1.111040995153103d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021989770635849296d) + "'", double1 == (-0.021989770635849296d));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8375930412496614d) + "'", double1 == (-0.8375930412496614d));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9917788534431158d) + "'", double1 == (-0.9917788534431158d));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double1 = org.apache.commons.math.util.FastMath.signum((-30.2684420922929d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.007582068426303211d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000287440185127d + "'", double1 == 1.0000287440185127d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7087432273413581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.031436599693981d + "'", double1 == 1.031436599693981d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3340213222681154E-8d, 1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8402785435782612d + "'", double2 == 1.8402785435782612d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3153655518886576d + "'", double1 == 0.3153655518886576d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999346490652955d + "'", double1 == 0.9999346490652955d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3102515536998522d + "'", double1 == 1.3102515536998522d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5133236589758516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9983489007818077d + "'", double1 == 0.9983489007818077d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.202429048488105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4495725029967728d, 0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.013125840905313d + "'", double2 == 1.013125840905313d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948961d + "'", double1 == 1.5707963267948961d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.3505504618025204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695326E-8d + "'", double1 == 2.9802322387695326E-8d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double1 = org.apache.commons.math.util.FastMath.tanh(21.665602783539605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7255967321845855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7255967321845854d) + "'", double1 == (-0.7255967321845854d));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6565667352442498d + "'", double1 == 0.6565667352442498d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.0013530756255686267d), 3.053086467974937d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4856741544225798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.053714424981458d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4466128799118947d, 215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00671091585859779d + "'", double2 == 0.00671091585859779d);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5374883357278658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2696309561267565d) + "'", double1 == (-0.2696309561267565d));
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7895608642289974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7895608642289975d + "'", double1 == 0.7895608642289975d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3799380148686868d + "'", double1 == 1.3799380148686868d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.009340961621595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.90632551149339d + "'", double1 == 74.90632551149339d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008977143551253659d + "'", double1 == 0.008977143551253659d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9504980959746572d + "'", double1 == 0.9504980959746572d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.155615773557598E15d + "'", double1 == 2.155615773557598E15d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.457669233211857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.023970365332605832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2883311413111977d + "'", double1 == 0.2883311413111977d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double1 = org.apache.commons.math.util.FastMath.atanh(32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.59470089220704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7218198804969767d + "'", double1 == 1.7218198804969767d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 53.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0413759433029089E23d + "'", double1 == 1.0413759433029089E23d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        int int1 = org.apache.commons.math.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        double double1 = org.apache.commons.math.util.FastMath.log10(23.620277154609447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3732849892136236d + "'", double1 == 1.3732849892136236d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.2245999714347802d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8317726278653502d + "'", double1 == 0.8317726278653502d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        float float1 = org.apache.commons.math.util.FastMath.abs(1477896.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8207422758720628d, (double) 53L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.837661730146112E-5d + "'", double2 == 2.837661730146112E-5d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.677071525546346d + "'", double1 == 32.677071525546346d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double1 = org.apache.commons.math.util.FastMath.ceil(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6439440000115327E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.1731525181731936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5573691630451039d) + "'", double1 == (-0.5573691630451039d));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.041886155779305d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.5049299044217186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.242700776533084d + "'", double1 == 12.242700776533084d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 36);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.006492321624085E-46d + "'", double1 == 7.006492321624085E-46d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9165654068163128d + "'", double1 == 0.9165654068163128d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7346568543593085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9023219280642616d + "'", double1 == 0.9023219280642616d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.5659347597369016E23d, (-2.041886155779305d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.565934759736901E23d + "'", double2 == 4.565934759736901E23d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double1 = org.apache.commons.math.util.FastMath.exp((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7811352629728695E-34d + "'", double1 == 2.7811352629728695E-34d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double1 = org.apache.commons.math.util.FastMath.acos(88.46858222228961d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6997597439205169d, 0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7702930717190178d + "'", double2 == 0.7702930717190178d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1143659906583754d + "'", double1 == 1.1143659906583754d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2688363802786087d + "'", double1 == 1.2688363802786087d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.164473663317525E39d + "'", double1 == 2.164473663317525E39d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9329417505747774d + "'", double1 == 0.9329417505747774d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.07463853704904692d, (double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 179.50384807756595d + "'", double2 == 179.50384807756595d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double1 = org.apache.commons.math.util.FastMath.tan(23.620277154609447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-17.123726230311483d) + "'", double1 == (-17.123726230311483d));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9966758829408293d + "'", double1 == 0.9966758829408293d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.008977143551253659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008977384716240355d + "'", double1 == 0.008977384716240355d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.986213958420301d + "'", double1 == 0.986213958420301d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.009443140013387965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00944328036437284d + "'", double1 == 0.00944328036437284d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2854670421176262d + "'", double1 == 1.2854670421176262d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double double1 = org.apache.commons.math.util.FastMath.floor(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double1 = org.apache.commons.math.util.FastMath.abs(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.000000000000014d + "'", double1 == 35.000000000000014d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.010714184646452608d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double1 = org.apache.commons.math.util.FastMath.log(9.612434767874704E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.552453009332421d) + "'", double1 == (-11.552453009332421d));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4062887760379899d + "'", double1 == 0.4062887760379899d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6384917413123372d + "'", double1 == 0.6384917413123372d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double2 = org.apache.commons.math.util.FastMath.pow((-8.711666086263719d), 0.6931471805599462d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7310768736210277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0686474581524463E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794803d + "'", double1 == 1.570796326794803d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.242605345373291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.114722093336851d + "'", double1 == 1.114722093336851d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.8245835710368516d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6142115809594618d + "'", double1 == 0.6142115809594618d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.33503880848819d + "'", double1 == 47.33503880848819d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.6481783560655225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 209.0252227135293d + "'", double1 == 209.0252227135293d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03492076949174773d + "'", double1 == 0.03492076949174773d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1229215998502982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.593078804542712d + "'", double1 == 14.593078804542712d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8005182678076421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.226694653653776d + "'", double1 == 1.226694653653776d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1679173671934143E40d + "'", double1 == 1.1679173671934143E40d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.540177670628365E45d + "'", double1 == 1.540177670628365E45d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.570796326793582d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3012989023039965d) + "'", double1 == (-2.3012989023039965d));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        long long1 = org.apache.commons.math.util.FastMath.round(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 793006726156715L + "'", long1 == 793006726156715L);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.4281826694961446d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8461684323333869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.846168432333387d + "'", double1 == 0.846168432333387d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 34L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.00000000000001d + "'", double1 == 34.00000000000001d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7678470809183597d) + "'", double1 == (-1.7678470809183597d));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2775405404515378d + "'", double1 == 0.2775405404515378d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5716315636979223d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005893040685456091d + "'", double2 == 0.005893040685456091d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double1 = org.apache.commons.math.util.FastMath.acosh(148.20890535952418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.691758600279624d + "'", double1 == 5.691758600279624d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8650983882673103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3132616875182228d + "'", double1 == 1.3132616875182228d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007423096440071042d) + "'", double1 == (-0.007423096440071042d));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.691029831908529d, 1.425305228849993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.691029831908528d + "'", double2 == 4.691029831908528d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double2 = org.apache.commons.math.util.FastMath.max(0.02544337342753222d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02544337342753222d + "'", double2 == 0.02544337342753222d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3887317335324654d + "'", double1 == 1.3887317335324654d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.20638559288074199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20350434138645834d + "'", double1 == 0.20350434138645834d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6917300921120252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6917300921120253d + "'", double1 == 0.6917300921120253d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9991461404922782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410206068209574d + "'", double1 == 0.5410206068209574d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.202429048488105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0965532583910846d + "'", double1 == 1.0965532583910846d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4176620615017429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.658584751965128d + "'", double1 == 0.658584751965128d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7037024113814048d + "'", double1 == 0.7037024113814048d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.4538869113115327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.493777178147216d + "'", double1 == 1.493777178147216d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.716854397550169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5662191695169732d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double1 = org.apache.commons.math.util.FastMath.cosh(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6332258730806833E19d + "'", double1 == 2.6332258730806833E19d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6917300921120253d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8632695193447204d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8403267546831036d + "'", double1 == 0.8403267546831036d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.533811507790112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.533811507790112d + "'", double1 == 5.533811507790112d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9633078296451878d), 0.9260416922830169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8051199275680166d) + "'", double2 == (-0.8051199275680166d));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8415496589078763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9441186631554072d + "'", double1 == 0.9441186631554072d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-114.59155902616465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2239800905693157d, 1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1477895.5237242084d + "'", double2 == 1477895.5237242084d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        double double1 = org.apache.commons.math.util.FastMath.ceil(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8850917695760475d + "'", double1 == 0.8850917695760475d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000000000000007d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.021944515972277187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0221870678414093d + "'", double1 == 1.0221870678414093d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7200786095266942d + "'", double1 == 1.7200786095266942d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double2 = org.apache.commons.math.util.FastMath.min(4.621316807284695d, 4.5659347597369016E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.621316807284695d + "'", double2 == 4.621316807284695d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8887992509694498d, 33.85767924684394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01847614732562492d + "'", double2 == 0.01847614732562492d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.643056057042617d + "'", double1 == 0.643056057042617d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9999999999999992d), 1.7265659438059517d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5249732550858636d) + "'", double2 == (-0.5249732550858636d));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.242605345373291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0429652634610682d + "'", double1 == 1.0429652634610682d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7010979104724594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7010979104724595d + "'", double1 == 0.7010979104724595d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9584036466699126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9584036466699127d + "'", double1 == 0.9584036466699127d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.516964265655408d + "'", double1 == 0.516964265655408d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3796077390275217d, 0.5799018512655504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37960773902752176d + "'", double2 == 0.37960773902752176d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6142115809594618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7052062927726025d + "'", double1 == 0.7052062927726025d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double2 = org.apache.commons.math.util.FastMath.max(1.114722093336851d, 0.5344733951434961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.114722093336851d + "'", double2 == 1.114722093336851d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.969914391648719d, 1.6439440000115327E52d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9699143916487194d + "'", double2 == 2.9699143916487194d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double1 = org.apache.commons.math.util.FastMath.asinh(148.20890535952418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.691781362855433d + "'", double1 == 5.691781362855433d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.9349327016694437E-28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9349327016694437E-28d + "'", double1 == 3.9349327016694437E-28d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3986257671685822d) + "'", double1 == (-1.3986257671685822d));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double1 = org.apache.commons.math.util.FastMath.abs(68.40322401739334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.40322401739334d + "'", double1 == 68.40322401739334d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7415668164626985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.221037751377339d + "'", double1 == 1.221037751377339d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7813863964118538d, 1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.356568665264778d + "'", double2 == 1.356568665264778d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8788236337430255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2067705094227903d + "'", double1 == 1.2067705094227903d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7218198804969767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 98.65301223419652d + "'", double1 == 98.65301223419652d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3305834282671767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19127348683183137d + "'", double1 == 0.19127348683183137d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        long long2 = org.apache.commons.math.util.FastMath.min(34L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.900849165587834d + "'", double1 == 1.900849165587834d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double1 = org.apache.commons.math.util.FastMath.cos(33.85767924684394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7649452892668915d) + "'", double1 == (-0.7649452892668915d));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double1 = org.apache.commons.math.util.FastMath.log10((-4.155599707401653d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double double1 = org.apache.commons.math.util.FastMath.atanh(104.9439511105971d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 36, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-114.59155902616465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.434540364205759d) + "'", double1 == (-5.434540364205759d));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7430243621557113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6765182208109524d + "'", double1 == 0.6765182208109524d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22160826669200384d + "'", double1 == 0.22160826669200384d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.167906788198742d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.021099236524914633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997774193665461d + "'", double1 == 0.9997774193665461d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7052062927726025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6569265110688361d + "'", double1 == 0.6569265110688361d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double2 = org.apache.commons.math.util.FastMath.max(2.4750868533986696d, 0.9329417505747774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4750868533986696d + "'", double2 == 2.4750868533986696d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double2 = org.apache.commons.math.util.FastMath.max(2.5049299044217186d, 0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5049299044217186d + "'", double2 == 2.5049299044217186d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.27922113659304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.29636971860814d + "'", double1 == 13.29636971860814d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double double1 = org.apache.commons.math.util.FastMath.tan((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10017290084007202d) + "'", double1 == (-0.10017290084007202d));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.950821873121645d + "'", double1 == 0.950821873121645d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1129787402495097d + "'", double1 == 1.1129787402495097d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9251475365964138d), (-0.24101530784419936d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8256472186458474d) + "'", double2 == (-1.8256472186458474d));
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4472118490899239d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.41333646188643103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4386037138273381d + "'", double1 == 0.4386037138273381d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-59.10786673843407d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6881171418161737E43d, 4.741297982545108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.388267471840758d, (-11.552453009332421d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7051700342143223d + "'", double2 == 2.7051700342143223d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3996012668469272d) + "'", double1 == (-0.3996012668469272d));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.17315251817319363d), 49.80857186097813d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.80857186097813d + "'", double2 == 49.80857186097813d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9591348389208239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9349901766807889d + "'", double1 == 1.9349901766807889d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2333184128133814d + "'", double1 == 1.2333184128133814d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double1 = org.apache.commons.math.util.FastMath.tanh(34.768015146316124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8788236337430255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4080652728465024d + "'", double1 == 1.4080652728465024d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.584967478670572d, (-1.3986257671685822d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.866875981405849d + "'", double2 == 1.866875981405849d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double1 = org.apache.commons.math.util.FastMath.exp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1752011936438014d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5329806043723968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4896826700609314d) + "'", double1 == (-0.4896826700609314d));
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9983489007818077d, 1.5707963267948961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5661631704961736d + "'", double2 == 0.5661631704961736d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 57.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9995917534020515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422210095256048d + "'", double1 == 1.5422210095256048d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42733020692594786d + "'", double1 == 0.42733020692594786d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.7405700602011438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8245796280639899d) + "'", double1 == (-0.8245796280639899d));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.671281819617711d) + "'", double1 == (-5.671281819617711d));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950339648414802d + "'", double1 == 0.09950339648414802d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.896296018267969E13d, 1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.461578766216512E13d + "'", double2 == 8.461578766216512E13d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.883847335314108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7731845027218617d) + "'", double1 == (-0.7731845027218617d));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8788236337430255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.63064585426075d + "'", double1 == 0.63064585426075d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9991461404922782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.7098487955681614E-4d) + "'", double1 == (-3.7098487955681614E-4d));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013L, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6666666666666667d + "'", double1 == 0.6666666666666667d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.2662323765610332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-53));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.477053318335443E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.10655605346268d + "'", double1 == 96.10655605346268d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9402241834946017d + "'", double1 == 0.9402241834946017d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.999999995877003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465703991664d + "'", double1 == 22026.465703991664d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9991050130774393d) + "'", double1 == (-0.9991050130774393d));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3282.8063500117437d + "'", double1 == 3282.8063500117437d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.20325541915325d + "'", double1 == 1.20325541915325d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-30.2684420922929d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 11013.0f, 1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707055250154314d + "'", double2 == 1.5707055250154314d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5259944849453191d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4823133060975066d) + "'", double1 == (-0.4823133060975066d));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 793006726156715L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.9300672E14f + "'", float1 == 7.9300672E14f);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        float float2 = org.apache.commons.math.util.FastMath.min(53.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double1 = org.apache.commons.math.util.FastMath.tan(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4738147204144684d + "'", double1 == 0.4738147204144684d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double2 = org.apache.commons.math.util.FastMath.min(3.1215871282840145E-5d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09895901520441384d) + "'", double1 == (-0.09895901520441384d));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double1 = org.apache.commons.math.util.FastMath.cosh(68.40322401739334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5474914758024213E29d + "'", double1 == 2.5474914758024213E29d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.40992093582609207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5066986545189869d + "'", double1 == 1.5066986545189869d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.4823133060975066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4638298288961809d) + "'", double1 == (-0.4638298288961809d));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7346568543593085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8025482319007339d + "'", double1 == 0.8025482319007339d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double2 = org.apache.commons.math.util.FastMath.min(Double.NaN, 1.7370361196913022d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5574077246549023d), (double) (-3L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2647238233833388d) + "'", double2 == (-0.2647238233833388d));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.457669233211857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.529468828731893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9991461404922782d + "'", double1 == 0.9991461404922782d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7037662025836657d) + "'", double1 == (-0.7037662025836657d));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2697663311309155d + "'", double1 == 1.2697663311309155d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.457669233211857d), 16.305565311881853d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.457669233211857d) + "'", double2 == (-0.457669233211857d));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837517570456897d) + "'", double1 == (-0.008837517570456897d));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(41.67132555791601d, 22.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.671325557916006d + "'", double2 == 41.671325557916006d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double2 = org.apache.commons.math.util.FastMath.min(3.8108072797718955d, 1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2222844543037337d + "'", double2 == 1.2222844543037337d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9441186631554072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9810147281934775d + "'", double1 == 0.9810147281934775d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4351842306678721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46627444884951624d) + "'", double1 == (-0.46627444884951624d));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.15360022690981504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7237289657353609d, 1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1301927452503902d + "'", double2 == 1.1301927452503902d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.566701978945693d + "'", double1 == 10.566701978945693d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 78.69006752597979d + "'", double1 == 78.69006752597979d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130532941206642d + "'", double1 == 1.2130532941206642d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6138893069268366d), 0.1881062682776882d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2734626020942639d) + "'", double2 == (-1.2734626020942639d));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.8045194316764734d), 86.73801698433718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0208012497848328d) + "'", double2 == (-0.0208012497848328d));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.4750868533986696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.899291721913687d + "'", double1 == 5.899291721913687d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9516311810082599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.829298395868054d + "'", double1 == 2.829298395868054d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.399216241149525E248d, 0.7874470920119091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3992162411495244E248d + "'", double2 == 3.3992162411495244E248d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7218198804969767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8867207287394443d + "'", double1 == 2.8867207287394443d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008799151683644863d) + "'", double1 == (-0.008799151683644863d));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3074614241103386d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.444945510686242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7592646625426185d + "'", double1 == 1.7592646625426185d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.986213958420301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6810646106438578d + "'", double1 == 1.6810646106438578d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5496849999971904d) + "'", double1 == (-0.5496849999971904d));
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01718962461003295d) + "'", double1 == (-0.01718962461003295d));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25794.151202054116d + "'", double1 == 25794.151202054116d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3017603360460153d + "'", double1 == 1.3017603360460153d);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.041886155779305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12978368762258294d + "'", double1 == 0.12978368762258294d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9508218731216449d, 11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9508218731216449d + "'", double2 == 0.9508218731216449d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6630829213736404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5855174436770063d + "'", double1 == 0.5855174436770063d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7612492183413337d, 0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7612492183413337d + "'", double2 == 0.7612492183413337d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.590038910379708E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.590038619245502E-4d + "'", double1 == 5.590038619245502E-4d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25794.14288947931d + "'", double1 == 25794.14288947931d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1129787402495097d, 1.2854670421176262d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1129787402495097d + "'", double2 == 1.1129787402495097d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14261835956136196d + "'", double1 == 0.14261835956136196d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.457194883916838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5401776706283436E45d + "'", double1 == 1.5401776706283436E45d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8414709848078965d), 2.5474914758024213E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5474914758024213E29d + "'", double2 == 2.5474914758024213E29d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double1 = org.apache.commons.math.util.FastMath.atan(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5690509993150914d + "'", double1 == 1.5690509993150914d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.37076030339985566d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1898547757074525d + "'", double1 == 3.1898547757074525d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double2 = org.apache.commons.math.util.FastMath.min(100.00000000000004d, 1.8872978375373093E32d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000004d + "'", double2 == 100.00000000000004d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5481514696830391d + "'", double1 == 0.5481514696830391d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4537710156022707d + "'", double1 == 1.4537710156022707d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 7.9300672E14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5435938325608288E16d + "'", double1 == 4.5435938325608288E16d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double2 = org.apache.commons.math.util.FastMath.min(0.17453292519943295d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7675163740144968d + "'", double1 == 0.7675163740144968d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.115167303285961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 235.781718468518d + "'", double1 == 235.781718468518d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.31712849292107215d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4771212547196624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9009272373598115d + "'", double1 == 0.9009272373598115d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double2 = org.apache.commons.math.util.FastMath.pow(192.9948452238572d, (double) (-53L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.346447863344775E-122d + "'", double2 == 7.346447863344775E-122d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.167906788198742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1679067881987422d + "'", double1 == 1.1679067881987422d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8805489308698095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7066942126282448d + "'", double1 == 0.7066942126282448d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0003963416279558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1708356348323496d + "'", double1 == 1.1708356348323496d);
    }
}

