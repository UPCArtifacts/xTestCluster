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
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9696515784005106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1289051803966543d + "'", double1 == 1.1289051803966543d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.951386703658792E-16d, (double) 36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.208718528794109E-17d + "'", double2 == 2.208718528794109E-17d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5545968900472338d) + "'", double1 == (-0.5545968900472338d));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.003215579132524195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003210420214260284d + "'", double1 == 0.003210420214260284d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.27234146891183075d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27572056477178236d) + "'", double1 == (-0.27572056477178236d));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.008837862706915424d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.307013259236445d + "'", double1 == 9.307013259236445d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.606983036005677d + "'", double1 == 0.606983036005677d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.450905222423708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001256E-16d + "'", double1 == 8.881784197001256E-16d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1833.4649444186343d + "'", double2 == 1833.4649444186343d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.6017101575745776d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281817253452d + "'", double1 == 2.718281817253452d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double2 = org.apache.commons.math.util.FastMath.max(11012.999999999998d, 4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11012.999999999998d + "'", double2 == 11012.999999999998d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.016591253173120855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8957199490291566E-4d + "'", double1 == 2.8957199490291566E-4d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.377725567322862d, (-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0159436322367794d + "'", double2 == 3.0159436322367794d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477896 + "'", int2 == 1477896);
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
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.0159436322367794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.1796701242299d + "'", double1 == 10.1796701242299d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.036109432196274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7763470636942515d + "'", double1 == 0.7763470636942515d);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9117339147869651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8175632803535192d) + "'", double1 == (-0.8175632803535192d));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8632695193447204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015066895444674253d + "'", double1 == 0.015066895444674253d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2924316695611777d + "'", double1 == 2.2924316695611777d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.8872978375373093E32d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2039425986338603d + "'", double1 == 2.2039425986338603d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.6567305011816795d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        long long1 = org.apache.commons.math.util.FastMath.round(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2, 0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2445777300219243d + "'", double2 == 1.2445777300219243d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195443d + "'", double1 == 0.8813735870195443d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6763796495118177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5166364975962761d + "'", double1 == 0.5166364975962761d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int int2 = org.apache.commons.math.util.FastMath.max((-53), 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.036109432196274d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.008838092819754681d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00883809281975468d) + "'", double1 == (-0.00883809281975468d));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022920740387489907d + "'", double1 == 0.022920740387489907d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.5370843467987585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        long long1 = org.apache.commons.math.util.FastMath.round(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6995216443485196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5303468257884512d + "'", double1 == 0.5303468257884512d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0828994398682557d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4689057088038129d, 1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.007007049837584d + "'", double2 == 1.007007049837584d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0037786218504155065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037857698423101618d + "'", double1 == 0.0037857698423101618d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.445650060521281d + "'", double1 == 2.445650060521281d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6230034949480645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2405439607132595d + "'", double1 == 0.2405439607132595d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.709975946676697d, (-86.33580274416313d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.121789138159636d + "'", double2 == 3.121789138159636d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5702159837110962d + "'", double1 == 0.5702159837110962d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.16035232751746503d, 1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11022806535638537d + "'", double2 == 0.11022806535638537d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508801680230075d + "'", double1 == 0.6508801680230075d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2532512135083778d + "'", double1 == 1.2532512135083778d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.59470089220704d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-36));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.01706683222077747d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5146349215357182d + "'", double1 == 1.5146349215357182d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5539281628193607d) + "'", double1 == (-0.5539281628193607d));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3707603033998556d, 0.7010979104724594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7010979104724594d + "'", double2 == 0.7010979104724594d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.013472925145914125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013472110004602389d + "'", double1 == 0.013472110004602389d);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double2 = org.apache.commons.math.util.FastMath.min(2.381919166334245d, 0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999500037496876d + "'", double2 == 0.9999500037496876d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2147483647);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4120062944864213d + "'", double1 == 0.4120062944864213d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6719977351570301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8197546798628417d + "'", double1 == 0.8197546798628417d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9918472337211128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9126599178967103d + "'", double1 == 0.9126599178967103d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9171473774587547d, 10.1796701242299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9171473774587547d + "'", double2 == 0.9171473774587547d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9016684086532855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7171092768909919d) + "'", double1 == (-0.7171092768909919d));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5430806348152437d, 1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5430806348152437d + "'", double2 == 1.5430806348152437d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        long long2 = org.apache.commons.math.util.FastMath.max((-36L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8539880479975257d, (-1.570796326793582d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8539880479975257d + "'", double2 == 0.8539880479975257d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.701090835570466d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6886433559427169d + "'", double1 == 0.6886433559427169d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.61739627922902d + "'", double1 == 54.61739627922902d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9718540920347526d + "'", double1 == 0.9718540920347526d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.470017988445906E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.7405700602011438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6931471805599463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599463d + "'", double1 == 0.6931471805599463d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6719977351570301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8143769628516082d + "'", double1 == 0.8143769628516082d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01282218098091439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.892038097483659d) + "'", double1 == (-1.892038097483659d));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double1 = org.apache.commons.math.util.FastMath.abs(24.89046237609173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.89046237609173d + "'", double1 == 24.89046237609173d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-59.10786673843407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-59.10786673843406d) + "'", double1 == (-59.10786673843406d));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.9033391107665126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5707651109236087d, 4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707651109236087d + "'", double2 == 1.5707651109236087d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0544066060443427d + "'", double1 == 1.0544066060443427d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-11.046068560414216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31348.490033756978d + "'", double1 == 31348.490033756978d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800350358700291d + "'", double1 == 0.011800350358700291d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9032305497763704d + "'", double1 == 1.9032305497763704d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-3L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int int1 = org.apache.commons.math.util.FastMath.abs((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.258659887385141d) + "'", double1 == (-4.258659887385141d));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.866213764556301d + "'", double1 == 0.866213764556301d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 1833L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1833L + "'", long1 == 1833L);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.570796326793582d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8143769628516082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6191415215594434d + "'", double1 == 0.6191415215594434d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4477855.166669106d, 0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4477855.166669105d + "'", double2 == 4477855.166669105d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.0664977916380836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8119320375488408d) + "'", double1 == (-1.8119320375488408d));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.983031862437426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31440167219953424d + "'", double1 == 0.31440167219953424d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.0305000985748444E41d, 0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double2 = org.apache.commons.math.util.FastMath.min((-2.978724151380226E-4d), 1.581170436626687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.978724151380226E-4d) + "'", double2 == (-2.978724151380226E-4d));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.18911453025066113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2092204141489054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7926396995186359d + "'", double1 == 0.7926396995186359d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.881784197001256E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.951760157141521E27d + "'", double1 == 4.951760157141521E27d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5068440202380022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9063773800902429d) + "'", double1 == (-0.9063773800902429d));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8693235746902678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.808571860978134d + "'", double1 == 49.808571860978134d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double1 = org.apache.commons.math.util.FastMath.log10(37.40464270515639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5729255106521538d + "'", double1 == 1.5729255106521538d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9210509322442526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.541950429394781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.955817372303998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156715E14d + "'", double1 == 7.93006726156715E14d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.58601345231343E15d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1563686078816606d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5711009442099724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7184726744159351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.895646744719586d + "'", double1 == 0.895646744719586d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4711276743037347d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5675807421208592d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9700496918579988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9700496918579988d + "'", double1 == 0.9700496918579988d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.16101915387533275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16033135365260598d + "'", double1 == 0.16033135365260598d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double1 = org.apache.commons.math.util.FastMath.sinh(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11211.863579677763d + "'", double1 == 11211.863579677763d);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7681156723791426E13d + "'", double1 == 2.7681156723791426E13d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99627207622075d + "'", double1 == 0.99627207622075d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math.util.FastMath.acos((-35.35050620855721d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5152102145743461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1356826832352684d + "'", double1 == 1.1356826832352684d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.010374295917472897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010320668518630319d) + "'", double1 == (-0.010320668518630319d));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7978269761159673E33d, 5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7978269761159673E33d + "'", double2 == 1.7978269761159673E33d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.307013259236445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3328245624840647d + "'", double1 == 2.3328245624840647d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42672.42111385361d + "'", double1 == 42672.42111385361d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0476958419065936d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8214948155164382d + "'", double1 == 0.8214948155164382d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.002160686891321d, 2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0051542672067486d + "'", double2 == 1.0051542672067486d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.344459247866038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3317302351290102d + "'", double1 == 0.3317302351290102d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999998798416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6540753540578407d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7017203400855394d) + "'", double1 == (-0.7017203400855394d));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9768658979378976d + "'", double1 == 0.9768658979378976d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-77.26503394947865d) + "'", double1 == (-77.26503394947865d));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double1 = org.apache.commons.math.util.FastMath.sin((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9968116020407186d + "'", double1 == 0.9968116020407186d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7651141195590695d, 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.762195691083632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math.util.FastMath.atanh(13.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0021933711408297d, 4.455841039450451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22123522076451269d + "'", double2 == 0.22123522076451269d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double1 = org.apache.commons.math.util.FastMath.abs(14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215765d + "'", double1 == 14.899277193215765d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22269503511219027d + "'", double1 == 0.22269503511219027d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double1 = org.apache.commons.math.util.FastMath.atanh(37.40464270515639d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.262451664828748d + "'", double1 == 1.262451664828748d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008092143267727406d + "'", double1 == 0.008092143267727406d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double1 = org.apache.commons.math.util.FastMath.tanh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8359028870534029d + "'", double1 == 0.8359028870534029d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.219022125506721d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5029340333685773d + "'", double1 == 0.5029340333685773d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794411714424d + "'", double1 == 0.3678794411714424d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.02109767107454078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0554351483188518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02343155304628609d + "'", double1 == 0.02343155304628609d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02562454087811747d) + "'", double1 == (-0.02562454087811747d));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9918956474731391d + "'", double1 == 0.9918956474731391d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        float float1 = org.apache.commons.math.util.FastMath.abs(36.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4451787324341034d, (-0.7171092768909919d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7679249258932203d + "'", double2 == 0.7679249258932203d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        long long2 = org.apache.commons.math.util.FastMath.max((-3L), 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.455841039450451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1745267124417875d + "'", double1 == 2.1745267124417875d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6846269172035435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6003337755574026d + "'", double1 == 0.6003337755574026d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.8119320375488408d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2191223728354978d) + "'", double1 == (-1.2191223728354978d));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        long long1 = org.apache.commons.math.util.FastMath.round(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0691962561940713d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double1 = org.apache.commons.math.util.FastMath.signum(4477855.166669106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        float float1 = org.apache.commons.math.util.FastMath.abs((-53.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        float float1 = org.apache.commons.math.util.FastMath.abs(53.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.969914391648719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17083617943820936d + "'", double1 == 0.17083617943820936d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double1 = org.apache.commons.math.util.FastMath.acos((-6.802336828985354d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.278070357299329d) + "'", double1 == (-4.278070357299329d));
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-36), 0.06188340198003397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-35.99999999999999d) + "'", double2 == (-35.99999999999999d));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6026819659087927d + "'", double1 == 0.6026819659087927d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4466128799118947d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.267831587699267d, 1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.263814502040431d + "'", double2 == 1.263814502040431d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2285327801518604d + "'", double1 == 3.2285327801518604d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.7681156723791426E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2040758220049488d) + "'", double1 == (-1.2040758220049488d));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 36.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double2 = org.apache.commons.math.util.FastMath.pow(34.982780458176066d, 3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3887906953856204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4096419806687939d + "'", double1 == 0.4096419806687939d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 36L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9918472337211128d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5436613490374845d + "'", double1 == 0.5436613490374845d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 39481480091340L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4120062944864213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40115967463055435d + "'", double1 == 0.40115967463055435d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.11022806535638537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11022806535638537d + "'", double1 == 0.11022806535638537d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.980232238769532E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6174449004242214E-24d + "'", double1 == 6.6174449004242214E-24d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707055250154314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4515248974104379d + "'", double1 == 0.4515248974104379d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double1 = org.apache.commons.math.util.FastMath.tanh(54.61739627922902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double1 = org.apache.commons.math.util.FastMath.atanh(34.982780458176066d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double double2 = org.apache.commons.math.util.FastMath.pow((-34.768015146316124d), (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-34.768015146316124d) + "'", double2 == (-34.768015146316124d));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2490457723982544d) + "'", double1 == (-1.2490457723982544d));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.577309983889371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7598091759707638d + "'", double1 == 0.7598091759707638d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.9584036466699126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5544646780753981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-61.225361138336666d) + "'", double1 == (-61.225361138336666d));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0554351483188518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9200340278708842d + "'", double1 == 0.9200340278708842d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.163544117150059d) + "'", double1 == (-6.163544117150059d));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-3), 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7020228836336021d + "'", double1 == 0.7020228836336021d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.953499812724235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.631515035613056d + "'", double1 == 54.631515035613056d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13020201499842016d + "'", double1 == 0.13020201499842016d);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.22269503511219027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.594973153695066E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.138523014339807E-4d + "'", double1 == 9.138523014339807E-4d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.24101530784419936d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2141704030607639d) + "'", double1 == (-0.2141704030607639d));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012941034727495249d + "'", double1 == 0.0012941034727495249d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.75556934590651d + "'", double1 == 76.75556934590651d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double1 = org.apache.commons.math.util.FastMath.ceil(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.0d + "'", double1 == 19.0d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21819433807844027d + "'", double1 == 0.21819433807844027d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8691858264600905d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.06188340198003397d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3565686652647782d + "'", double1 == 1.3565686652647782d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8197546798628417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08631609532610952d) + "'", double1 == (-0.08631609532610952d));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6341811450608946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5979132061618428d + "'", double1 == 0.5979132061618428d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2824704504712367d, 0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3988794632894587d + "'", double2 == 0.3988794632894587d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7346568543593085d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.999999995877003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6003337755574026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010477800994405333d + "'", double1 == 0.010477800994405333d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4472118490899239d, 6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.44721184908992395d + "'", double2 == 0.44721184908992395d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double1 = org.apache.commons.math.util.FastMath.signum(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7473083494263217d + "'", double1 == 1.7473083494263217d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5456620010518718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double2 = org.apache.commons.math.util.FastMath.max(5.293329949408896d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.293329949408896d + "'", double2 == 5.293329949408896d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.97020634767864d + "'", double1 == 52.97020634767864d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.013388202148675738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0133874022879147d + "'", double1 == 0.0133874022879147d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.326458826000224E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9355072424226104d) + "'", double1 == (-0.9355072424226104d));
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5370843467987585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7328603869760997d + "'", double1 == 0.7328603869760997d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double1 = org.apache.commons.math.util.FastMath.exp(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313442E15d + "'", double1 == 1.586013452313442E15d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.021099236524914633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02109767107454078d + "'", double1 == 0.02109767107454078d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017302733123681042d + "'", double1 == 0.017302733123681042d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1356826832352684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.910203733964713d + "'", double1 == 0.910203733964713d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2014038779280567d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2763281510370124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8555035296395695d + "'", double1 == 0.8555035296395695d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.10600733624570037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10600733624570037d + "'", double1 == 0.10600733624570037d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7706382705810251d, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.152127757479647d + "'", double2 == 2.152127757479647d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(31348.490033756978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.531082122259832d + "'", double1 == 31.531082122259832d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2771399790034055d + "'", double1 == 5.2771399790034055d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double2 = org.apache.commons.math.util.FastMath.max(0.542010393166326d, (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.542010393166326d + "'", double2 == 0.542010393166326d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7487731841429789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26633519285681645d + "'", double1 == 0.26633519285681645d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double1 = org.apache.commons.math.util.FastMath.asin(89.42706130231652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3136593011643067d + "'", double1 == 1.3136593011643067d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9063773800902429d), 4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9063773800902429d) + "'", double2 == (-0.9063773800902429d));
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5135318290179205d, 0.5702159837110962d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2665841925237464d + "'", double2 == 1.2665841925237464d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1662915285707833d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.594700892207039d, 1.1241113544309131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3308556102312834d + "'", double2 == 1.3308556102312834d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395389476264498d + "'", double1 == 1.5395389476264498d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.2771399790034055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.277139979003406d + "'", double1 == 5.277139979003406d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.506328628316939E14d + "'", double1 == 3.506328628316939E14d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2712959543974419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2960570985715265d + "'", double1 == 1.2960570985715265d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(100.0d, 0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.6230034949480645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4354924297437774d + "'", double1 == 2.4354924297437774d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double1 = org.apache.commons.math.util.FastMath.tan(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5049299044084856d) + "'", double1 == (-2.5049299044084856d));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double2 = org.apache.commons.math.util.FastMath.max(10.049875621120886d, 0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.049875621120886d + "'", double2 == 10.049875621120886d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.388267471840756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.00883809281975468d), 1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.008838092819754678d) + "'", double2 == (-0.008838092819754678d));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.234021194410018d + "'", double1 == 2.234021194410018d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double1 = org.apache.commons.math.util.FastMath.asin(215.5579348013961d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9226350743220142d) + "'", double1 == (-0.9226350743220142d));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5273248225058396d + "'", double1 == 0.5273248225058396d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.04675969811694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.04675969811694d + "'", double1 == 2.04675969811694d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8973607083412377d + "'", double1 == 0.8973607083412377d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double1 = org.apache.commons.math.util.FastMath.tanh(39.82204982013094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.506976913724955d), 1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4210854715202007E-14d + "'", double2 == 1.4210854715202007E-14d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 218.34317366865955d + "'", double1 == 218.34317366865955d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double1 = org.apache.commons.math.util.FastMath.tan(34.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2560518591630461d) + "'", double1 == (-0.2560518591630461d));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        long long2 = org.apache.commons.math.util.FastMath.min(1833L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-11.046060585537848d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0972636890463687d) + "'", double1 == (-3.0972636890463687d));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.768287758044532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7191015686156517d + "'", double1 == 0.7191015686156517d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5915576703333734d + "'", double1 == 1.5915576703333734d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double1 = org.apache.commons.math.util.FastMath.log10(31348.490033756978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4962166269593915d + "'", double1 == 4.4962166269593915d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4466128799118947d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 36, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29665946452667546d + "'", double1 == 0.29665946452667546d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double double1 = org.apache.commons.math.util.FastMath.exp(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.910203733964713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1437757162199678d + "'", double1 == 1.1437757162199678d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.010320668518630319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999467423734001d + "'", double1 == 0.9999467423734001d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double2 = org.apache.commons.math.util.FastMath.max(0.1240849833762582d, 4.7950337271198835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7950337271198835d + "'", double2 == 4.7950337271198835d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9686168251319445d), 2.4354924297437774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4354924297437774d + "'", double2 == 2.4354924297437774d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-3), 1833L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9132212823529585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.294956681159677d) + "'", double1 == (-1.294956681159677d));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double1 = org.apache.commons.math.util.FastMath.asinh(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6237264565928684d + "'", double1 == 3.6237264565928684d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.999999995877003d, 1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4280746061686456d + "'", double2 == 1.4280746061686456d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1437757162199678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.197706177816559d + "'", double1 == 2.197706177816559d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6666666666666667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2909944487358056d + "'", double1 == 1.2909944487358056d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double1 = org.apache.commons.math.util.FastMath.signum(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.99998657637409d, 82.80264201054017d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012076160144891497d + "'", double2 == 0.012076160144891497d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1477895.5237242084d, 1.4210854715201906E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.564939354012384d + "'", double1 == 0.564939354012384d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 52, 0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-6.163544117150059d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39550023939513446d + "'", double1 == 0.39550023939513446d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        long long1 = org.apache.commons.math.util.FastMath.round(3.27922113659304d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6411915549411445d + "'", double1 == 0.6411915549411445d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.0664977916380836d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6557880892462952d) + "'", double1 == (-0.6557880892462952d));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-36), 0.18349077126961408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5656994050637374d) + "'", double2 == (-1.5656994050637374d));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.958177806871242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6069417913449664d + "'", double1 == 2.6069417913449664d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.3777255673228614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int int2 = org.apache.commons.math.util.FastMath.max(11013, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.21501840976713257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.354085646307371d + "'", double1 == 1.354085646307371d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9754001961551926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.772945733569301d + "'", double1 == 0.772945733569301d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.0461741036471235E-4d), 3.27922113659304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9.289321970063883E-5d) + "'", double2 == (-9.289321970063883E-5d));
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-36.04365338911715d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.138523014339807E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.138520470401178E-4d + "'", double1 == 9.138520470401178E-4d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.24121896931803172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24356506942966236d + "'", double1 == 0.24356506942966236d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248715407688383d + "'", double1 == 22.248715407688383d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3394482820132315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2878368723990908d) + "'", double1 == (-0.2878368723990908d));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.583614190080945d) + "'", double1 == (-0.583614190080945d));
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.860223607044047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.727451426698007d + "'", double1 == 23.727451426698007d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 35.0f, 3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51781.33605353302d + "'", double2 == 51781.33605353302d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1223881891967115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1220828785076508d + "'", double1 == 0.1220828785076508d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double1 = org.apache.commons.math.util.FastMath.log1p(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (-36L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.857679757182947d) + "'", double1 == (-16.857679757182947d));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-53));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046638250970772E-4d) + "'", double1 == (-3.046638250970772E-4d));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5166364975962761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5166364975962762d + "'", double1 == 0.5166364975962762d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-3), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.570705526935434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810040610124878d + "'", double1 == 4.810040610124878d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9297971986812833d + "'", double1 == 0.9297971986812833d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.248750165672654d + "'", double1 == 57.248750165672654d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        double double1 = org.apache.commons.math.util.FastMath.atan(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22.18070977791825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.003993711498963172d, (-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.133577208235657d + "'", double2 == 3.133577208235657d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double1 = org.apache.commons.math.util.FastMath.tanh(24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3314525951486865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3441486949905643d + "'", double1 == 0.3441486949905643d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6499429567608755d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.542010393166326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.71946018075489d + "'", double1 == 1.71946018075489d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.15335264995992576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1527522897170941d + "'", double1 == 0.1527522897170941d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.010374295917472898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01037448200916367d) + "'", double1 == (-0.01037448200916367d));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.4001817886098734d), 2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4001817886098734d) + "'", double2 == (-0.4001817886098734d));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.746938918904175d), 44.770142683335514d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.948148009133999E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.251952459411674d + "'", double1 == 0.251952459411674d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07074101207510715d) + "'", double1 == (-0.07074101207510715d));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.2040758220049488d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double1 = org.apache.commons.math.util.FastMath.acosh(23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.74297960916087d + "'", double1 == 10.74297960916087d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4488357507586564d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9643200333078156d, 1.0730374999763912d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9643200333078156d + "'", double2 == 0.9643200333078156d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-36), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7346568543593085d, 6.894806889943192E27d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7346568543593086d + "'", double2 == 0.7346568543593086d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 57L, 0.6191415215594434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6191415215594434d + "'", double2 == 0.6191415215594434d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(208.2575111000242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.927436242634382d + "'", double1 == 5.927436242634382d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.26221266393298326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26848296087954215d + "'", double1 == 0.26848296087954215d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7346568543593085d, 0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8713868162390155d + "'", double2 == 0.8713868162390155d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6576833375608168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7061325845105428d) + "'", double1 == (-0.7061325845105428d));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5711009442099724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.01745329225002d + "'", double1 == 90.01745329225002d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.023970365332605832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023974957339495964d + "'", double1 == 0.023974957339495964d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.16035232751746503d, 0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22864153058197859d + "'", double2 == 0.22864153058197859d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5574077246549023d), 0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3043304676536818d) + "'", double2 == (-1.3043304676536818d));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0003963416279558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1758128730549149d + "'", double1 == 1.1758128730549149d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.22123522076451269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3477154312047415d + "'", double1 == 1.3477154312047415d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6846269172035435d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6846269172035434d + "'", double2 == 0.6846269172035434d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8668856945829329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3998735867204177d + "'", double1 == 1.3998735867204177d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double1 = org.apache.commons.math.util.FastMath.expm1(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.266451746161367E19d + "'", double1 == 5.266451746161367E19d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2290180075135393d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7227508140360495d + "'", double1 == 0.7227508140360495d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707055250154314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810040600889587d + "'", double1 == 3.810040600889587d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double1 = org.apache.commons.math.util.FastMath.asinh(23.620277154609447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8557005192018434d + "'", double1 == 3.8557005192018434d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.022920740387489907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.000423867565398E-4d + "'", double1 == 4.000423867565398E-4d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.490658503988659d + "'", double1 == 3.490658503988659d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.008838092819754678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008838207883813802d) + "'", double1 == (-0.008838207883813802d));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0017901380658194d + "'", double1 == 1.0017901380658194d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7615941559557655d, 1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615941559557655d + "'", double2 == 0.7615941559557655d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double double1 = org.apache.commons.math.util.FastMath.atan(54.61739627922902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.552489187522351d + "'", double1 == 1.552489187522351d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double2 = org.apache.commons.math.util.FastMath.max(0.26221266393298326d, 0.25482123991217503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26221266393298326d + "'", double2 == 0.26221266393298326d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011075484152426464d + "'", double1 == 0.011075484152426464d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 0, 0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09995276840535378d) + "'", double1 == (-0.09995276840535378d));
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.2141704030607639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.444945510686242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 311.9723974410264d + "'", double1 == 311.9723974410264d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9589242746631385d), 1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.385849999980594d + "'", double2 == 1.385849999980594d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5370843467987585d + "'", double1 == 0.5370843467987585d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3986255640071519d + "'", double1 == 1.3986255640071519d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double1 = org.apache.commons.math.util.FastMath.exp(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477895.9999999995d + "'", double1 == 1477895.9999999995d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double2 = org.apache.commons.math.util.FastMath.min(24.89046237609173d, 0.30726023062048147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30726023062048147d + "'", double2 == 0.30726023062048147d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.105865973135149d + "'", double1 == 1.105865973135149d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1521778176391675d + "'", double1 == 2.1521778176391675d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.881784197001256E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.088887490341629E-14d + "'", double1 == 5.088887490341629E-14d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5757472671756005d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9236795528830172d + "'", double1 == 0.9236795528830172d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-11.046068560414216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-632.8931087238835d) + "'", double1 == (-632.8931087238835d));
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99627207622075d + "'", double1 == 0.99627207622075d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9187506059390845d, 0.9422278221222946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9232595127935677d + "'", double2 == 0.9232595127935677d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567155E14d + "'", double1 == 7.930067261567155E14d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8161870413788636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6729892096111301d + "'", double1 == 0.6729892096111301d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.013310924178631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.677261497848975d + "'", double1 == 3.677261497848975d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21095412737801214d + "'", double1 == 0.21095412737801214d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 4L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557656d + "'", double1 == 0.7615941559557656d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8691858264600905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7035872612422763d + "'", double1 == 0.7035872612422763d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.2015841995251388E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2015841995251388E-10d) + "'", double1 == (-1.2015841995251388E-10d));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6585081942517719d, 7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6585081942517719d + "'", double2 == 0.6585081942517719d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.060987412311592d + "'", double1 == 1.060987412311592d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8031308287968192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6657834392795495d + "'", double1 == 0.6657834392795495d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7719417485565582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9734429303042994d + "'", double1 == 0.9734429303042994d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5572942752342611d, 1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8183856353021686d + "'", double2 == 0.8183856353021686d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double1 = org.apache.commons.math.util.FastMath.rint(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }
}

