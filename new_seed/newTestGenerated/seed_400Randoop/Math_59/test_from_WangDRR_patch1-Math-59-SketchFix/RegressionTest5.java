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
        long long2 = org.apache.commons.math.util.FastMath.max(4L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0026285273327564763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026285303595750607d + "'", double1 == 0.0026285303595750607d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9155040003582885E22d, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.677511790861663d + "'", double1 == 0.677511790861663d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306943613116557d + "'", double1 == 9.306943613116557d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8990819272930286d + "'", double1 == 0.8990819272930286d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5013507798060325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(28.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.000000000000004d + "'", double1 == 28.000000000000004d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5520864868395452d) + "'", double1 == (-0.5520864868395452d));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double1 = org.apache.commons.math.util.FastMath.cos(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double1 = org.apache.commons.math.util.FastMath.signum((-52.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double double1 = org.apache.commons.math.util.FastMath.signum(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.131776110801955d) + "'", double1 == (-2.131776110801955d));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7023967071298747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 384.43435069728696d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 384.43435069728696d + "'", double2 == 384.43435069728696d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-8.711666086263719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4262213939948603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double1 = org.apache.commons.math.util.FastMath.exp((-15.385301667943363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0808864545885957E-7d + "'", double1 == 2.0808864545885957E-7d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6509498349092765d, 1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080869E43d + "'", double2 == 1.3440585709080869E43d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.817884356931778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03172806744895933d + "'", double1 == 0.03172806744895933d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double double2 = org.apache.commons.math.util.FastMath.atan2(28.476411608537198d, (-0.6997678580926362d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5953649790673516d + "'", double2 == 1.5953649790673516d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double1 = org.apache.commons.math.util.FastMath.atanh(104.9439511105971d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.38095094490971865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.097129110263696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9702843181545027d + "'", double1 == 0.9702843181545027d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9261711162367936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.410122136122596d + "'", double1 == 1.410122136122596d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7076312586751927d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.989082137816156E-4d + "'", double1 == 9.989082137816156E-4d);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8508659131646942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6915215721218745d) + "'", double1 == (-0.6915215721218745d));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04051985370229124d + "'", double1 == 0.04051985370229124d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.752052706443892E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000002279510873d + "'", double1 == 1.0000002279510873d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5604313987190848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5949065948500845d + "'", double1 == 0.5949065948500845d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2, 0.14028675761500198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1021241580712529d + "'", double2 == 1.1021241580712529d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9764996816772386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8646583460928883d + "'", double1 == 0.8646583460928883d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5368290450042061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9309148936420054d + "'", double1 == 0.9309148936420054d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837977760189568d) + "'", double1 == (-0.008837977760189568d));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.1742549955138671d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.10482857270117d + "'", double1 == 2.10482857270117d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006589358495248128d + "'", double1 == 0.006589358495248128d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.24468093598772875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        long long1 = org.apache.commons.math.util.FastMath.round(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6930491557595924d + "'", double1 == 0.6930491557595924d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        long long1 = org.apache.commons.math.util.FastMath.round(97.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6080833035834908d, 14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.206129690390002d + "'", double2 == 14.206129690390002d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.766978271236858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.963822509477476d + "'", double1 == 0.963822509477476d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.415289655969459d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9103739670886851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5297042362484659d + "'", double1 == 1.5297042362484659d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.008837747656337245d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002205218707991866d + "'", double1 == 0.002205218707991866d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7200109207204425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4650188248182274d, 0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.196341993668888d + "'", double2 == 1.196341993668888d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6885025193255089d + "'", double1 == 0.6885025193255089d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 5.0f, (double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double1 = org.apache.commons.math.util.FastMath.atan(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5356939671724397d + "'", double1 == 1.5356939671724397d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7473083494263217d + "'", double1 == 1.7473083494263217d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.17605158226535078d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1779050309268746d) + "'", double1 == (-0.1779050309268746d));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06572532608811625d + "'", double1 == 0.06572532608811625d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5039744651761873d + "'", double1 == 1.5039744651761873d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2200909184537633d + "'", double1 == 0.2200909184537633d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5982487386901945d, 1.81743754137065952E17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.81743754137065952E17d + "'", double2 == 1.81743754137065952E17d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9984579799537394d + "'", double1 == 0.9984579799537394d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5459079327750913d, 0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002205222282650664d + "'", double2 == 0.002205222282650664d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5215691996538042d) + "'", double1 == (-0.5215691996538042d));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.496025759922821d) + "'", double1 == (-0.496025759922821d));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05326119751852293d + "'", double1 == 0.05326119751852293d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double double2 = org.apache.commons.math.util.FastMath.min(0.516964265655408d, 0.0026285333864166493d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0026285333864166493d + "'", double2 == 0.0026285333864166493d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.921688867296064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7266953932355397d + "'", double1 == 0.7266953932355397d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2027522105204773d, 0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39709459624648236d + "'", double2 == 0.39709459624648236d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7401549043526567d + "'", double1 == 0.7401549043526567d);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9948376736367679d, (-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9948376736367679d + "'", double2 == 0.9948376736367679d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000000000035623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6691802474911265E-6d + "'", double1 == 2.6691802474911265E-6d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037614532268226615d + "'", double1 == 0.0037614532268226615d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1481461824783568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.7839305200671d + "'", double1 == 65.7839305200671d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009877980461308d + "'", double1 == 1.0009877980461308d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0466859367662789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.04675969811694d + "'", double1 == 1.04675969811694d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 966980.6941481612d + "'", double1 == 966980.6941481612d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01180062424654847d + "'", double1 == 0.01180062424654847d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11831214619987152d + "'", double1 == 0.11831214619987152d);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int int1 = org.apache.commons.math.util.FastMath.abs(84677176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84677176 + "'", int1 == 84677176);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835171d + "'", double1 == 1.2261911708835171d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4149733479708179d + "'", double1 == 0.4149733479708179d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.43878905260671d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7554612895086841d + "'", double1 == 0.7554612895086841d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.6509498349092765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.1742549955138671d), 0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1742549955138671d) + "'", double2 == (-0.1742549955138671d));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.308232836016487d + "'", double1 == 27.308232836016487d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017067660761448736d) + "'", double1 == (-0.017067660761448736d));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5191129625505976d) + "'", double1 == (-0.5191129625505976d));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double1 = org.apache.commons.math.util.FastMath.asinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0841005523291758d + "'", double1 == 1.0841005523291758d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6085491459180241d + "'", double1 == 0.6085491459180241d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9735605461531053d + "'", double1 == 0.9735605461531053d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        long long1 = org.apache.commons.math.util.FastMath.round(44.770142683335514d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 45L + "'", long1 == 45L);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9332525345454011d + "'", double1 == 0.9332525345454011d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4868981666828483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.079331342726163d + "'", double1 == 2.079331342726163d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3694345116302007d, 3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.369434511630201d + "'", double2 == 1.369434511630201d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double1 = org.apache.commons.math.util.FastMath.tan(803226.6141649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08776598447540371d) + "'", double1 == (-0.08776598447540371d));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double1 = org.apache.commons.math.util.FastMath.signum(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9944107743857757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.5395250166930861d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 270053.16143060935d + "'", double1 == 270053.16143060935d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2775176041484217d, 96.10655605346267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0028875952298260572d + "'", double2 == 0.0028875952298260572d);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6108652381980155d, 10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6108652381980155d + "'", double2 == 0.6108652381980155d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.81743754137065952E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.74137414560076d + "'", double1 == 39.74137414560076d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double1 = org.apache.commons.math.util.FastMath.signum((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0637969690534155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7871127525111784d + "'", double1 == 0.7871127525111784d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.097129110263696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 120.15664711213525d + "'", double1 == 120.15664711213525d);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065871573381094d + "'", double1 == 0.6065871573381094d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9665362520985106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1705482956267235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15747226777829929d + "'", double1 == 0.15747226777829929d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0000000000000016d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.357332604544835d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7615941559557656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000018d + "'", double1 == 1.0000000000000018d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4418411684567414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.162063444860504d + "'", double1 == 1.162063444860504d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103304d + "'", double1 == 11013.232920103304d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8718162306995085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.6915215721218745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2599210498948732d) + "'", double1 == (-1.2599210498948732d));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int int1 = org.apache.commons.math.util.FastMath.round(1477896.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4678297255314154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.688117141816173E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5692708962822441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9651775697905435d + "'", double1 == 0.9651775697905435d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9261711162367936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17542037193601015d + "'", double1 == 0.17542037193601015d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089405E-8d + "'", double1 == 4.214684851089405E-8d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.5321070224790865E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7669782712368582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.841145771760947d + "'", double1 == 2.841145771760947d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8029955704341625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014014916583006168d + "'", double1 == 0.014014916583006168d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9171523356672743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7245474750742176d) + "'", double1 == (-0.7245474750742176d));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double1 = org.apache.commons.math.util.FastMath.acos(2005.3522829578812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double1 = org.apache.commons.math.util.FastMath.sin(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7417440442090276d) + "'", double1 == (-0.7417440442090276d));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.35007298425458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0584642065884995d + "'", double1 == 2.0584642065884995d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9904127082563061d + "'", double1 == 0.9904127082563061d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5427661770824743d, 0.8693235746902678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5427661770824743d + "'", double2 == 1.5427661770824743d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5707173906673306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9441850002921958d + "'", double1 == 0.9441850002921958d);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.2063149707507666E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07492623841795108d) + "'", double1 == (-0.07492623841795108d));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3211090992020036d + "'", double1 == 1.3211090992020036d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.7245474750742176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6627966601314947d) + "'", double1 == (-0.6627966601314947d));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.14074548931837635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9562645537814451d, 43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7051926755065845E12d + "'", double2 == 3.7051926755065845E12d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double1 = org.apache.commons.math.util.FastMath.atan(303.2854656713273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5674991151269533d + "'", double1 == 1.5674991151269533d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.08581296033843074d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9087403372292328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.03908175332576d + "'", double1 == 1.03908175332576d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6994453290609607d + "'", double1 == 0.6994453290609607d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7658461948190803d + "'", double1 == 0.7658461948190803d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8646583460928883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7608736087855116d + "'", double1 == 0.7608736087855116d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.03172806744895933d, 2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double1 = org.apache.commons.math.util.FastMath.atanh(6.752052706443892E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.752053732535971E-4d + "'", double1 == 6.752053732535971E-4d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double2 = org.apache.commons.math.util.FastMath.atan2(77.35348403241947d, 0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.560196367709658d + "'", double2 == 1.560196367709658d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.214684851089405E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089405E-8d + "'", double1 == 4.214684851089405E-8d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15455379269598704d + "'", double1 == 0.15455379269598704d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2083543502704375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2083543502704377d + "'", double1 == 1.2083543502704377d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-33.10480098881463d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4752832273511767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3004939424875053d + "'", double1 == 2.3004939424875053d);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int int1 = org.apache.commons.math.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9651775697905435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01684552645924234d + "'", double1 == 0.01684552645924234d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2260085761167134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9221885224184981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7498537011943205d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double double1 = org.apache.commons.math.util.FastMath.log1p(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.303304908059076d + "'", double1 == 5.303304908059076d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.43442052080657173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502754d + "'", double1 == 1.5440680443502754d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double double1 = org.apache.commons.math.util.FastMath.rint(77.35348403241947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.0d + "'", double1 == 77.0d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int int1 = org.apache.commons.math.util.FastMath.round(8.4677176E7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84677176 + "'", int1 == 84677176);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.4454545364061836E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3520838269185758d) + "'", double1 == (-3.3520838269185758d));
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5039744651761873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9659700754028168d + "'", double1 == 0.9659700754028168d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.882891545907212d + "'", double1 == 0.882891545907212d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9182827862121189d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7250840343721086d) + "'", double1 == (-0.7250840343721086d));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.07453619030152617d), (-0.24928153889173274d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5143524375699184d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.470434916701856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.492549213298881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4576692332118569d + "'", double1 == 0.4576692332118569d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.50632862831693E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70515.43768240382d + "'", double1 == 70515.43768240382d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.692229922941576d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2245999714347802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4028045914528193d + "'", double1 == 3.4028045914528193d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6885025193255089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.635381542950125d + "'", double1 == 0.635381542950125d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.013277137307171d + "'", double1 == 2.013277137307171d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0691962561940713d + "'", double1 == 1.0691962561940713d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7884320060348541d + "'", double1 == 0.7884320060348541d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(13.781934843695916d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.781934843695915d + "'", double2 == 13.781934843695915d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8332128969929774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5556892683639982d + "'", double1 == 2.5556892683639982d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double2 = org.apache.commons.math.util.FastMath.atan2(14.206130012655933d, 0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.525881748669311d + "'", double2 == 1.525881748669311d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.749996267789066d + "'", double1 == 2.749996267789066d);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9177658737860996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.307194259161069d + "'", double1 == 1.307194259161069d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double1 = org.apache.commons.math.util.FastMath.floor(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.125020304386795d + "'", double1 == 1.125020304386795d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.017067660761448736d), 1262023.527631695d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 149);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.356147801749622d + "'", double1 == 4.356147801749622d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-15.385301667943363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.0d) + "'", double1 == (-15.0d));
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4900780917150722d + "'", double1 == 1.4900780917150722d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11013.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9033391107665127d) + "'", double1 == (-0.9033391107665127d));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double1 = org.apache.commons.math.util.FastMath.asinh(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.192987713658941d + "'", double1 == 5.192987713658941d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.741297982545108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double1 = org.apache.commons.math.util.FastMath.abs(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.80597572185025d + "'", double1 == 148.80597572185025d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double1 = org.apache.commons.math.util.FastMath.ulp(39.74137414560076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3268153559855746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.118359928160288d) + "'", double1 == (-1.118359928160288d));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.768115672379123E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.2545767570502781d), 0.5195675877329186d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.219048724654734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1474073509433416d + "'", double1 == 1.1474073509433416d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.03700049997605E9d + "'", double1 == 3.03700049997605E9d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 2.10482857270117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215994d + "'", double1 == 14.899277193215994d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        long long2 = org.apache.commons.math.util.FastMath.max(1586013452313419L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1586013452313419L + "'", long2 == 1586013452313419L);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.049772952917979E12d + "'", double1 == 7.049772952917979E12d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-36), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6509498349092765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7955086123527585d + "'", double1 == 0.7955086123527585d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.44019367551631d + "'", double1 == 105.44019367551631d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.185039863261519d) + "'", double1 == (-2.185039863261519d));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.306943613116557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 533.2485891978159d + "'", double1 == 533.2485891978159d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9983608366524339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7138297703395624d + "'", double1 == 1.7138297703395624d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0035151607961293246d + "'", double1 == 0.0035151607961293246d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7158569288579336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-41.01558075875642d) + "'", double1 == (-41.01558075875642d));
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9686168251319445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.127345252052883d) + "'", double1 == (-1.127345252052883d));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6915215721218745d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.6883420083174141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.43878905260671d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4387890526067095d) + "'", double1 == (-2.4387890526067095d));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974484d + "'", double1 == 0.7853981633974484d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math.util.FastMath.log10(39.74137414560076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5992428797223133d + "'", double1 == 1.5992428797223133d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2083543502704375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0213104912191047d + "'", double1 == 1.0213104912191047d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2062.6480624709634d, 1.60978210179491616E17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.281321279551499E-14d + "'", double2 == 1.281321279551499E-14d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9428090415820634d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3132616875182228d, 4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.313261687518223d + "'", double2 == 1.313261687518223d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9115295367046072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8813735870195429d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double2 = org.apache.commons.math.util.FastMath.max(0.43305085726475895d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43305085726475895d + "'", double2 == 0.43305085726475895d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000001819d + "'", double1 == 1.000000000001819d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2413339035979167d + "'", double1 == 0.2413339035979167d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5464562895278918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8543714174431914d + "'", double1 == 0.8543714174431914d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.38095094490971865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6172122365197555d + "'", double1 == 0.6172122365197555d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.566459051786784d + "'", double1 == 5.566459051786784d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9695968919838217d + "'", double1 == 0.9695968919838217d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 1.58601345E15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.99999999540764d + "'", double1 == 34.99999999540764d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.316173196322488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4828196330754233d + "'", double1 == 1.4828196330754233d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7554612895086841d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.021252051384784545d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6108652381980153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5447358754943394d + "'", double1 == 0.5447358754943394d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706683222077747d + "'", double1 == 0.01706683222077747d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.0871877068532832E16d, 0.7206435247136849d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13.781934843695915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 966980.6941481595d + "'", double1 == 966980.6941481595d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9185375499501867d, (-0.8554182836643192d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9185375499501867d + "'", double2 == 0.9185375499501867d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.131776110801955d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1321790744880604d) + "'", double1 == (-1.1321790744880604d));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.357332604544835d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.311231547115195E15d + "'", double1 == 4.311231547115195E15d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double1 = org.apache.commons.math.util.FastMath.log1p(34.99999999540764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5835189383285444d + "'", double1 == 3.5835189383285444d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2413339035979167d, 26.339410356026733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2413339035979167d + "'", double2 == 0.2413339035979167d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2117649211245782d, 3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0026974884567037482d + "'", double2 == 0.0026974884567037482d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 5L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9751009553485449d, 0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3234882492226412d + "'", double2 == 1.3234882492226412d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.00285907349248556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0028590734924855603d + "'", double1 == 0.0028590734924855603d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.853200064217061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8532000642170612d + "'", double1 == 1.8532000642170612d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5232219310598245d + "'", double1 == 0.5232219310598245d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(49.80857186097813d, 2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.80857186097812d + "'", double2 == 49.80857186097812d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7474040395446648d + "'", double1 == 1.7474040395446648d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double2 = org.apache.commons.math.util.FastMath.max(5.685719999335932E24d, 0.2418689364577661d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.685719999335932E24d + "'", double2 == 5.685719999335932E24d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5953649790673516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.1624473515096263d), (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.162447351509626d) + "'", double2 == (-1.162447351509626d));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1224236947215336d + "'", double1 == 1.1224236947215336d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002205224069989189d + "'", double1 == 0.002205224069989189d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double1 = org.apache.commons.math.util.FastMath.ulp(77.26503394947866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1705482956267237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0538928197703992d + "'", double1 == 1.0538928197703992d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999500037496876d + "'", double1 == 0.9999500037496876d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        long long2 = org.apache.commons.math.util.FastMath.min(84677176L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3968786974024636d + "'", double1 == 1.3968786974024636d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11776318452497536d + "'", double1 == 0.11776318452497536d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double2 = org.apache.commons.math.util.FastMath.max(0.21551488653168732d, 3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948148009134034E13d + "'", double2 == 3.948148009134034E13d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.567739246697935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 327.1084999525159d + "'", double1 == 327.1084999525159d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.492549213298881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.220991124514843d + "'", double1 == 28.220991124514843d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double1 = org.apache.commons.math.util.FastMath.tan(127.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.185891831851989d + "'", double1 == 4.185891831851989d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 36, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8351015231807233d + "'", double1 == 1.8351015231807233d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.645343411117965d + "'", double1 == 0.645343411117965d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6960755400997087d + "'", double1 == 0.6960755400997087d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.525881748669311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18352087838274772d + "'", double1 == 0.18352087838274772d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double1 = org.apache.commons.math.util.FastMath.atanh(32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.231911890816295d + "'", double1 == 2.231911890816295d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5528548740537169d) + "'", double1 == (-0.5528548740537169d));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1705482956267237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.170548295626724d + "'", double1 == 1.170548295626724d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.013865150856733838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0139617178500335d + "'", double1 == 1.0139617178500335d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089405E-8d + "'", double1 == 4.214684851089405E-8d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double1 = org.apache.commons.math.util.FastMath.cos(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9820870114195961d) + "'", double1 == (-0.9820870114195961d));
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8461684323333869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7683152502780354d + "'", double1 == 0.7683152502780354d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5716776679087391d, (-0.25457675705027805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5716776679087391d + "'", double2 == 0.5716776679087391d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double2 = org.apache.commons.math.util.FastMath.max(0.07454121709103567d, 1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9936026854386766d + "'", double2 == 1.9936026854386766d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.303190128915375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.974403151355936d + "'", double1 == 36.974403151355936d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477895.5239208457d + "'", double1 == 1477895.5239208457d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.986771734266245d + "'", double1 == 1.986771734266245d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.369434511630201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1200868748495079d + "'", double1 == 1.1200868748495079d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8402785435782614d, 2.0529697638030147E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706847692395227d + "'", double2 == 1.5706847692395227d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.907793317242678d + "'", double1 == 6.907793317242678d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7425442460725571d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8617100707735503d + "'", double1 == 0.8617100707735503d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5992442618287415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double2 = org.apache.commons.math.util.FastMath.atan2(65.7839305200671d, 2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5378778166059792d + "'", double2 == 1.5378778166059792d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.802168607459072E15d, 1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948963d + "'", double2 == 1.5707963267948963d);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double double1 = org.apache.commons.math.util.FastMath.asinh(13.596393407513998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3043013731747495d + "'", double1 == 3.3043013731747495d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double2 = org.apache.commons.math.util.FastMath.max(9.307013259236443d, 1.536829045004206d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.307013259236443d + "'", double2 == 9.307013259236443d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8668295926043834d + "'", double1 == 0.8668295926043834d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.5091729483939074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6506325163944369d + "'", double1 == 1.6506325163944369d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9187506059390845d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29225491648198393d + "'", double1 == 0.29225491648198393d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.16703684659955795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1538315676666131d) + "'", double1 == (-0.1538315676666131d));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2.0f, 2.3004939424875053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7156372641383866d + "'", double2 == 0.7156372641383866d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.327624706282431d + "'", double1 == 4.327624706282431d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.899277193215994d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0000000000005d + "'", double1 == 2048.0000000000005d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9996915601943024d, (-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9290529400482024d + "'", double2 == 2.9290529400482024d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0787619161000124d + "'", double1 == 1.0787619161000124d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double1 = org.apache.commons.math.util.FastMath.sinh(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7385266591677215E41d + "'", double1 == 2.7385266591677215E41d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.196341993668888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0615776890930098d + "'", double1 == 1.0615776890930098d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double1 = org.apache.commons.math.util.FastMath.asinh(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.276858964458209d + "'", double1 == 4.276858964458209d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9908886150478887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6936270066623493d + "'", double1 == 1.6936270066623493d);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double double1 = org.apache.commons.math.util.FastMath.tan(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2395798055406804d + "'", double1 == 3.2395798055406804d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0035151607961293246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0035151680352298246d + "'", double1 == 0.0035151680352298246d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.150849338916875d), 1.7669782712368582d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9942575694137897d) + "'", double1 == (-0.9942575694137897d));
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.30685281944005d + "'", double1 == 34.30685281944005d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2816994331335767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.550214026948225d) + "'", double1 == (-0.550214026948225d));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.08776598447540371d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.566459051786784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8868316935392928d + "'", double1 == 0.8868316935392928d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.781934843695918d + "'", double1 == 13.781934843695918d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        long long2 = org.apache.commons.math.util.FastMath.max(84677176L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.560196367709658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.759755815723173d + "'", double1 == 4.759755815723173d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        double double1 = org.apache.commons.math.util.FastMath.sin(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9408618465702292d) + "'", double1 == (-0.9408618465702292d));
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(20.13501082303189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1153.6511406099614d + "'", double1 == 1153.6511406099614d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.021252051384784545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021248852757409047d + "'", double1 == 0.021248852757409047d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9926395119337849d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.800544591431495d + "'", double1 == 2.800544591431495d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-8.711666086263719d), 0.013865150856733838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5692047668094316d) + "'", double2 == (-1.5692047668094316d));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999500037496876d + "'", double1 == 0.9999500037496876d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.410321299048242d) + "'", double1 == (-0.410321299048242d));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double double2 = org.apache.commons.math.util.FastMath.min(34.30685281944005d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.7156361224559d + "'", double1 == 201.7156361224559d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3211090992020036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7475755061678404d + "'", double1 == 3.7475755061678404d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6440339106610352d + "'", double1 == 0.6440339106610352d);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9193629443874066d, (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9193629443874066d + "'", double2 == 0.9193629443874066d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4253120969346567d), 1.5953649790673516d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.366643026452033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24371064248078259d + "'", double1 == 0.24371064248078259d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.02411494803001423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997092487312308d + "'", double1 == 0.9997092487312308d);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6033293179688031d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0139617178500335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16690925682449867d + "'", double1 == 0.16690925682449867d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9418502147163486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2280945400058982d + "'", double1 == 1.2280945400058982d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double2 = org.apache.commons.math.util.FastMath.min(120.15664711213525d, 1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.356568665264778d + "'", double2 == 1.356568665264778d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2622510397683969d) + "'", double1 == (-0.2622510397683969d));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.162447351509626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.002160686891321d, 1.4466128799118947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0021606868913213d + "'", double2 == 1.0021606868913213d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-53.0f), (-0.7076312586751927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-53.0d) + "'", double2 == (-53.0d));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.15455379269598704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5366525808832339d + "'", double1 == 0.5366525808832339d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.351950794486537d + "'", double1 == 1.351950794486537d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        long long1 = org.apache.commons.math.util.FastMath.abs(57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3707603104765322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double double2 = org.apache.commons.math.util.FastMath.max((-5.959891290659564d), (-0.6915215721218745d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6915215721218745d) + "'", double2 == (-0.6915215721218745d));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.7385266591677215E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5370843467987585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.772666314109507d + "'", double1 == 30.772666314109507d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4881954908148405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5310724756574393d) + "'", double1 == (-0.5310724756574393d));
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1586013452313419L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5472906394139022E7d, 1.9234103443381365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707962024866189d + "'", double2 == 1.5707962024866189d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000002279510873d, 1.5708871266543591d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5668854225622851d + "'", double2 == 0.5668854225622851d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2717628242082612d) + "'", double1 == (-0.2717628242082612d));
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1173954566600866d + "'", double1 == 1.1173954566600866d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2461900271072904d, 0.03338100822971834d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24619002710729038d + "'", double2 == 0.24619002710729038d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.85314001086485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.07496514575753d + "'", double1 == 64.07496514575753d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        long long1 = org.apache.commons.math.util.FastMath.round(1.162063444860504d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1034585241152786d + "'", double1 == 2.1034585241152786d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9902697229065449d) + "'", double1 == (-0.9902697229065449d));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202007E-14d + "'", double1 == 1.4210854715202007E-14d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.998217399326382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017422180268940393d + "'", double1 == 0.017422180268940393d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9408618465702292d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016421137029044217d) + "'", double1 == (-0.016421137029044217d));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double1 = org.apache.commons.math.util.FastMath.asin(192.9948452238572d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999959128521664d, 1.5706847692395227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999959128521664d + "'", double2 == 0.9999959128521664d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-36));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0962532307185966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2584006825852871d + "'", double1 == 1.2584006825852871d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double2 = org.apache.commons.math.util.FastMath.max(5.026525695313479d, 1.5430806348152388d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.026525695313479d + "'", double2 == 5.026525695313479d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9008710423195464d + "'", double1 == 0.9008710423195464d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03900892838436512d + "'", double1 == 0.03900892838436512d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double double2 = org.apache.commons.math.util.FastMath.min(3.948148009134034E13d, (-29.500939575070152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-29.500939575070152d) + "'", double2 == (-29.500939575070152d));
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1161530356493914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04772374476421262d + "'", double1 == 0.04772374476421262d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9665362520985106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.37844799163721d + "'", double1 == 55.37844799163721d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3887317335324652d, 0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3887317335324652d + "'", double2 == 1.3887317335324652d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948961d + "'", double1 == 1.5707963267948961d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.5068440202380022d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9944107743857757d, (-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9991396955517629d) + "'", double2 == (-0.9991396955517629d));
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31587294930624943d + "'", double1 == 0.31587294930624943d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.4764165040274095d + "'", double1 == 7.4764165040274095d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.24928153889173274d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24928153889173274d) + "'", double2 == (-0.24928153889173274d));
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.003761435487319938d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

