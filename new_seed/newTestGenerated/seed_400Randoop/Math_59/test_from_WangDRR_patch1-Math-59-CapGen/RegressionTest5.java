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
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.011028984548345453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011029208141228462d) + "'", double1 == (-0.011029208141228462d));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9155040003582885E22d, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.677511790861663d + "'", double1 == 0.677511790861663d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306943613116557d + "'", double1 == 9.306943613116557d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8990819272930286d + "'", double1 == 0.8990819272930286d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5013507798060325d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(28.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.000000000000004d + "'", double1 == 28.000000000000004d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5520864868395452d) + "'", double1 == (-0.5520864868395452d));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double1 = org.apache.commons.math.util.FastMath.cos(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double1 = org.apache.commons.math.util.FastMath.signum((-52.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double double1 = org.apache.commons.math.util.FastMath.signum(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.131776110801955d) + "'", double1 == (-2.131776110801955d));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7023967071298747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 384.43435069728696d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 384.43435069728696d + "'", double2 == 384.43435069728696d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-8.711666086263719d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4262213939948603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double1 = org.apache.commons.math.util.FastMath.exp((-15.385301667943363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0808864545885957E-7d + "'", double1 == 2.0808864545885957E-7d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6509498349092765d, 1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080869E43d + "'", double2 == 1.3440585709080869E43d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3431851641374776E20d + "'", double1 == 3.3431851641374776E20d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.817884356931778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03172806744895933d + "'", double1 == 0.03172806744895933d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double2 = org.apache.commons.math.util.FastMath.atan2(28.476411608537198d, (-0.6997678580926362d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5953649790673516d + "'", double2 == 1.5953649790673516d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double1 = org.apache.commons.math.util.FastMath.atanh(104.9439511105971d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.38095094490971865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.097129110263696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9702843181545027d + "'", double1 == 0.9702843181545027d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.2472279286356684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5490315325589654d + "'", double1 == 1.5490315325589654d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7076312586751927d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.989082137816156E-4d + "'", double1 == 9.989082137816156E-4d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8508659131646942d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6915215721218745d) + "'", double1 == (-0.6915215721218745d));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04051985370229124d + "'", double1 == 0.04051985370229124d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1164811561836356E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000062326508d + "'", double1 == 1.0000000062326508d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.40893309613462986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42128462825823654d + "'", double1 == 0.42128462825823654d);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2, (-0.999474205005279d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5001822598696615d + "'", double2 == 0.5001822598696615d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, (float) (-36));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9645836595696896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8561074278563534d + "'", double1 == 0.8561074278563534d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5436257195614516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9335905118403581d + "'", double1 == 0.9335905118403581d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837977760189568d) + "'", double1 == (-0.008837977760189568d));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.17062095882471706d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.10482857270117d + "'", double1 == 2.10482857270117d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006589358495248128d + "'", double1 == 0.006589358495248128d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.24468093598772875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        long long1 = org.apache.commons.math.util.FastMath.round(1.007007049837584d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6930491557595924d + "'", double1 == 0.6930491557595924d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        long long1 = org.apache.commons.math.util.FastMath.round(97.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6080833035834908d, 14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.206129690390002d + "'", double2 == 14.206129690390002d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4384640908548959d + "'", double1 == 0.4384640908548959d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.415289655969459d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8378228855141493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2138239491732021d + "'", double1 == 1.2138239491732021d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.008837747656337245d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002205218707991866d + "'", double1 == 0.002205218707991866d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.91583280579669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4650188248182274d, 0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.196341993668888d + "'", double2 == 1.196341993668888d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6885025193255089d + "'", double1 == 0.6885025193255089d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 5.0f, (double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double double1 = org.apache.commons.math.util.FastMath.atan(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5356939671724397d + "'", double1 == 1.5356939671724397d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7473083494263217d + "'", double1 == 1.7473083494263217d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.17230617170547372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17404243063263192d) + "'", double1 == (-0.17404243063263192d));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.002160686891321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06572532608811625d + "'", double1 == 0.06572532608811625d);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (-36.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5039744651761873d + "'", double1 == 1.5039744651761873d);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2200909184537633d + "'", double1 == 0.2200909184537633d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5982487386901945d, 1.81743754137065952E17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.81743754137065952E17d + "'", double2 == 1.81743754137065952E17d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9984579799537394d + "'", double1 == 0.9984579799537394d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5459079327750913d, 0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002205222282650664d + "'", double2 == 0.002205222282650664d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5215691996538042d) + "'", double1 == (-0.5215691996538042d));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.496025759922821d) + "'", double1 == (-0.496025759922821d));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05326119751852293d + "'", double1 == 0.05326119751852293d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double double2 = org.apache.commons.math.util.FastMath.min(0.516964265655408d, (-0.01102943176403137d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01102943176403137d) + "'", double2 == (-0.01102943176403137d));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.921688867296064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7266953932355397d + "'", double1 == 0.7266953932355397d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2027522105204773d, 0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39709459624648236d + "'", double2 == 0.39709459624648236d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7401549043526567d + "'", double1 == 0.7401549043526567d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9948376736367679d, (-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9948376736367679d + "'", double2 == 0.9948376736367679d);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000000000035623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6691802474911265E-6d + "'", double1 == 2.6691802474911265E-6d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037614532268226615d + "'", double1 == 0.0037614532268226615d);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4528691957923933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.947493590387875d + "'", double1 == 25.947493590387875d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009877980461308d + "'", double1 == 1.0009877980461308d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0466859367662789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.04675969811694d + "'", double1 == 1.04675969811694d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.025630151592603893d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        int int2 = org.apache.commons.math.util.FastMath.min(36, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 966980.6941481612d + "'", double1 == 966980.6941481612d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01180062424654847d + "'", double1 == 0.01180062424654847d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11831214619987152d + "'", double1 == 0.11831214619987152d);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        int int1 = org.apache.commons.math.util.FastMath.abs(84677176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84677176 + "'", int1 == 84677176);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835171d + "'", double1 == 1.2261911708835171d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4149733479708179d + "'", double1 == 0.4149733479708179d);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3528075633346971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3605699210490763d + "'", double1 == 0.3605699210490763d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293329949408897d + "'", double1 == 5.293329949408897d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-0.3327099519782247d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3327099519782247d) + "'", double2 == (-0.3327099519782247d));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0012941034727495246d, 0.0078125d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0012941034727495246d + "'", double2 == 0.0012941034727495246d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.159862088840656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4379819809736698d + "'", double1 == 1.4379819809736698d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8355584369206923d + "'", double1 == 0.8355584369206923d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9234103443381365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4088493392805228d + "'", double1 == 1.4088493392805228d);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double1 = org.apache.commons.math.util.FastMath.abs(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630998.4197775756d + "'", double1 == 630998.4197775756d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0589027237910784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7852435337894877d + "'", double1 == 0.7852435337894877d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        long long1 = org.apache.commons.math.util.FastMath.round(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.02137167427366076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.592169628316262d + "'", double1 == 1.592169628316262d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000000000000002d, 0.362548825412157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4752832273511767d + "'", double1 == 1.4752832273511767d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.6701224592653805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double1 = org.apache.commons.math.util.FastMath.ceil(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 11014.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013637765347680457d + "'", double1 == 0.013637765347680457d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3383347192042695E42d, 1.4088493392805228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5872139151569291d), 1.0000000000000016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5872139151569291d) + "'", double2 == (-0.5872139151569291d));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9107602588845184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double1 = org.apache.commons.math.util.FastMath.log1p(149.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0106352940962555d + "'", double1 == 5.0106352940962555d);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double1 = org.apache.commons.math.util.FastMath.signum((-29.500939575070156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-36));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5472906394139022E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.86532233185151E8d + "'", double1 == 8.86532233185151E8d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.03673618878368824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4349059018154549d) + "'", double1 == (-1.4349059018154549d));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double double1 = org.apache.commons.math.util.FastMath.log(0.09917726107940236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3108465139568106d) + "'", double1 == (-2.3108465139568106d));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0634370688955608d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.677511790861663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3769270190230555d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2840234699668822d + "'", double1 == 1.2840234699668822d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7629672449812436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7034887077696317d + "'", double1 == 0.7034887077696317d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.291904389212817d + "'", double1 == 2.291904389212817d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double1 = org.apache.commons.math.util.FastMath.ulp(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5344625446055697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.614586012538512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8502126400132274d + "'", double1 == 0.8502126400132274d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9418502147163486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7541871649905414d + "'", double1 == 1.7541871649905414d);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5625847965301676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9867717342662448d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.86532233185151E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.86532233185151E8d + "'", double1 == 8.86532233185151E8d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5169658075432558d + "'", double1 == 0.5169658075432558d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double1 = org.apache.commons.math.util.FastMath.signum(21.487562597358306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6108652381980155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6495717774798734d + "'", double1 == 0.6495717774798734d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00949495958537668d) + "'", double1 == (-0.00949495958537668d));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5195675877329186d + "'", double1 == 0.5195675877329186d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5490315325589654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997631562156873d + "'", double1 == 0.9997631562156873d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.2735617324781447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0376519448740174d + "'", double1 == 1.0376519448740174d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8125492953065081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2536458786393914d + "'", double1 == 1.2536458786393914d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 32.0f, (-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22009091845376333d + "'", double1 == 0.22009091845376333d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7219067166708869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.897071434257196d) + "'", double1 == (-0.897071434257196d));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8081139692195906d + "'", double1 == 0.8081139692195906d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.660541563508116E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10531061974990837d + "'", double1 == 0.10531061974990837d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.025196192240463114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double double2 = org.apache.commons.math.util.FastMath.pow(200.0d, 2.270441887429704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 167631.21251937633d + "'", double2 == 167631.21251937633d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.017023944947506645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9995895072691775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1745678692555659d + "'", double1 == 1.1745678692555659d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8693235746902678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7010302935299408d + "'", double1 == 0.7010302935299408d);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31271990805652194d + "'", double1 == 0.31271990805652194d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 149L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9746486480944947d) + "'", double1 == (-0.9746486480944947d));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9171523356672744d), 0.8623188722876839d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.5321070224790865E26d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        long long1 = org.apache.commons.math.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3440585709080869E43d, (-0.2545767570502781d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.070843830251405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.070843830251405d + "'", double1 == 1.070843830251405d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double1 = org.apache.commons.math.util.FastMath.log10(13.781934843695916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1393101923868096d + "'", double1 == 1.1393101923868096d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24877690936045535d + "'", double1 == 0.24877690936045535d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4178463117121978d + "'", double1 == 1.4178463117121978d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5436257195614516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026941351224813972d + "'", double1 == 0.026941351224813972d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5737184098997153d + "'", double1 == 0.5737184098997153d);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9483570980585009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double double1 = org.apache.commons.math.util.FastMath.floor(167631.21251937633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 167631.0d + "'", double1 == 167631.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5860134523134308E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306943617238488d + "'", double1 == 9.306943617238488d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.01180062424654847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0118705263048873d + "'", double1 == 1.0118705263048873d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5308456639204424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        double double1 = org.apache.commons.math.util.FastMath.log10(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.302190676759448d + "'", double1 == 3.302190676759448d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8029955704341625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7252048345581925d + "'", double1 == 0.7252048345581925d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5638717219103803d, 0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7056364288847234d + "'", double2 == 0.7056364288847234d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        long long2 = org.apache.commons.math.util.FastMath.min((-36L), 84677176L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02187509047518678d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7668816193536425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double1 = org.apache.commons.math.util.FastMath.atan(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5487785339621303d + "'", double1 == 1.5487785339621303d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6899595825111818d) + "'", double1 == (-0.6899595825111818d));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.20675080015374017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20825283396989785d) + "'", double1 == (-0.20825283396989785d));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1896369513379932d + "'", double1 == 1.1896369513379932d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.303190128915375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.802168607459072E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29182899153935693d) + "'", double1 == (-0.29182899153935693d));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3745669993918974d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.9481478479872E13d, (-0.20675080015374017d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948147847987199E13d + "'", double2 == 3.948147847987199E13d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5427661770824743d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9848929415691015d), (-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1137231068183593d) + "'", double2 == (-2.1137231068183593d));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double1 = org.apache.commons.math.util.FastMath.cosh(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6332258730806833E19d + "'", double1 == 2.6332258730806833E19d);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math.util.FastMath.tan(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382792838d) + "'", double1 == (-6.053272382792838d));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3283909087132567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.16703684659955795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7386198489108358d + "'", double1 == 1.7386198489108358d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.3686469200204923d, (-0.24928153889173274d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8065735609271023d + "'", double2 == 0.8065735609271023d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.8754705787895336d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1477896L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4149733479708179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4031655405355516d + "'", double1 == 0.4031655405355516d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6258500709274458d) + "'", double1 == (-0.6258500709274458d));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math.util.FastMath.asinh(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.395584147203374d + "'", double1 == 3.395584147203374d);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3745669993918974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2743356563668091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2743356563668091d + "'", double1 == 0.2743356563668091d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1554436208840472E-30d + "'", double1 == 3.1554436208840472E-30d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9645836595696896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03605871160096273d) + "'", double1 == (-0.03605871160096273d));
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5953649790673516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9209678699858725d + "'", double1 == 0.9209678699858725d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double1 = org.apache.commons.math.util.FastMath.atanh(10.049875621120886d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9117339147869651d), 0.77013924210893d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3173502856185254d) + "'", double1 == (-0.3173502856185254d));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.187624532325845d + "'", double1 == 17.187624532325845d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4505495340698077d) + "'", double1 == (-0.4505495340698077d));
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double1 = org.apache.commons.math.util.FastMath.asinh(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6237264565928684d + "'", double1 == 3.6237264565928684d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) 84677176);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9633078296451878d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-55.19347301057655d) + "'", double1 == (-55.19347301057655d));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.366643026452033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6085674966810348d + "'", double1 == 0.6085674966810348d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7944146264030465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.516605276356614d + "'", double1 == 45.516605276356614d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8782070978900169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2052572411572526d + "'", double1 == 1.2052572411572526d);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6760945821149036d + "'", double1 == 0.6760945821149036d);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int int2 = org.apache.commons.math.util.FastMath.max(57, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.727787050299033d + "'", double1 == 4.727787050299033d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1164811585031813E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006396965828810899d + "'", double1 == 0.006396965828810899d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8461684323333869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3458703352271479d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3528075633346972d + "'", double1 == 0.3528075633346972d);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        long long1 = org.apache.commons.math.util.FastMath.round(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.467717600000001E7d + "'", double1 == 8.467717600000001E7d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9908886150478887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9908886150478888d + "'", double1 == 0.9908886150478888d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1961196899529816d + "'", double1 == 0.1961196899529816d);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2669359115016086d, 1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2123899885214408d + "'", double2 == 0.2123899885214408d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5625847965301676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0164187227291022d + "'", double1 == 1.0164187227291022d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7098212011473782d + "'", double1 == 0.7098212011473782d);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9920794825112482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017315053411302784d + "'", double1 == 0.017315053411302784d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.637986554446436d, 1.166594879293176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.637986554446435d + "'", double2 == 5.637986554446435d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double1 = org.apache.commons.math.util.FastMath.signum(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4670602929020584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2112226438198959d + "'", double1 == 1.2112226438198959d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.42128462825823654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double2 = org.apache.commons.math.util.FastMath.max((-33.10480098881463d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5896069690147184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.803279531369336d + "'", double1 == 1.803279531369336d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.544753606236012E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.544753606236012E-12d + "'", double1 == 1.544753606236012E-12d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1046225788468809d + "'", double1 == 1.1046225788468809d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.49824130708557135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.878424366572043d + "'", double1 == 0.878424366572043d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1574270622069016d + "'", double1 == 1.1574270622069016d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8378228855141493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.311329466289671d + "'", double1 == 2.311329466289671d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.021373301521365424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021148095787919326d + "'", double1 == 0.021148095787919326d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7668816193536425d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.017023944947506645d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.025470578295336027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02546507170868985d + "'", double1 == 0.02546507170868985d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double1 = org.apache.commons.math.util.FastMath.abs(295.4144370642092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 295.4144370642092d + "'", double1 == 295.4144370642092d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double2 = org.apache.commons.math.util.FastMath.atan2(55.367870644634905d, 2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.521129310212147d + "'", double2 == 1.521129310212147d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.680482178387856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6727467649882994d + "'", double1 == 1.6727467649882994d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4684335570709989d) + "'", double1 == (-0.4684335570709989d));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9975366607028198d, (-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9975366607028198d + "'", double2 == 0.9975366607028198d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0000000062326508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6263395248148259d + "'", double1 == 0.6263395248148259d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6428702637760138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6982396029335985d + "'", double1 == 0.6982396029335985d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7119840454144415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.539942077692879d + "'", double1 == 5.539942077692879d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3605699210490763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30790367156192044d + "'", double1 == 0.30790367156192044d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        double double2 = org.apache.commons.math.util.FastMath.min(2.1563686078816606d, 0.4032630823831073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4032630823831073d + "'", double2 == 0.4032630823831073d);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double double2 = org.apache.commons.math.util.FastMath.pow(32.48537739999093d, (-0.9754001961551924d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03353507713878987d + "'", double2 == 0.03353507713878987d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3859684164526524d + "'", double1 == 0.3859684164526524d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 32, 5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4067132730318201d + "'", double2 == 1.4067132730318201d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1745678692555659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995895072691776d + "'", double1 == 0.9995895072691776d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01645512199317914d + "'", double1 == 0.01645512199317914d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8365164337420498d + "'", double1 == 0.8365164337420498d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.011029879034124758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5818264294871955d + "'", double1 == 1.5818264294871955d);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9187506059390845d, 0.007812579475042568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9187506059390844d + "'", double2 == 0.9187506059390844d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32738201157865865d + "'", double1 == 0.32738201157865865d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1302020149984197d + "'", double1 == 0.1302020149984197d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double2 = org.apache.commons.math.util.FastMath.max((-4.9E-324d), 5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.690612768985d + "'", double2 == 5557.690612768985d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 84677176L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.4677176E7d + "'", double1 == 8.4677176E7d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) ' ', 3.7711377407401363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9209678699858725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8243712042404339d + "'", double1 == 0.8243712042404339d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5356723210278893d + "'", double1 == 1.5356723210278893d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.3173502856185254d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9383251747599725d + "'", double1 == 0.9383251747599725d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4031655405355516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4031655405355516d + "'", double1 == 0.4031655405355516d);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        float float2 = org.apache.commons.math.util.FastMath.min(8.4677176E7f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.011029208141228462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011028760963621407d) + "'", double1 == (-0.011028760963621407d));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275800758169d + "'", double1 == 0.9640275800758169d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5777877754722899d), 0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5840734641020676d + "'", double2 == 0.5840734641020676d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double1 = org.apache.commons.math.util.FastMath.tan(20.13501082303189d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4089393878627656d + "'", double1 == 3.4089393878627656d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.306943617238488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 533.2485894339852d + "'", double1 == 533.2485894339852d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4528691957923933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4865986869679275d + "'", double1 == 0.4865986869679275d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.383255525197761d + "'", double1 == 1.383255525197761d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double1 = org.apache.commons.math.util.FastMath.cos(39.17004923332845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09969305692768458d + "'", double1 == 0.09969305692768458d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.980232238769532E-8d + "'", double1 == 2.980232238769532E-8d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45883090031665263d + "'", double1 == 0.45883090031665263d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.77013924210893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0206698826055747d + "'", double1 == 1.0206698826055747d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089402E-8d + "'", double1 == 4.214684851089402E-8d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1310377402202207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9048544643595436d + "'", double1 == 0.9048544643595436d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1441700230118208E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.144170023011821E12d + "'", double1 == 1.144170023011821E12d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5440680443502757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double double1 = org.apache.commons.math.util.FastMath.cos(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9938982054999557d) + "'", double1 == (-0.9938982054999557d));
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8404766374262675d) + "'", double1 == (-0.8404766374262675d));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3268153559855746d, 45.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.0d + "'", double2 == 45.0d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.3127199080565219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3127199080565219d + "'", double2 == 0.3127199080565219d);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 149, 1586013452313419L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0057916796039132d + "'", double1 == 1.0057916796039132d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.072857379539184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21348529365373875d) + "'", double1 == (-0.21348529365373875d));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134001E13d + "'", double1 == 3.948148009134001E13d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1440689579547698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9796686085695417d + "'", double1 == 0.9796686085695417d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double2 = org.apache.commons.math.util.FastMath.atan2(45.516605276356614d, 8.86532233185151E8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.1342301579744704E-8d + "'", double2 == 5.1342301579744704E-8d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1376172840124885d) + "'", double1 == (-1.1376172840124885d));
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6370964612589353d + "'", double1 == 0.6370964612589353d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double2 = org.apache.commons.math.util.FastMath.atan2(13.596393407513998d, 0.9890316117253547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4981820211860783d + "'", double2 == 1.4981820211860783d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.362548825412157d, 263.856815596594d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0013740353700228104d + "'", double2 == 0.0013740353700228104d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9335905118403581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8336269685240393d + "'", double1 == 0.8336269685240393d);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3528075633346971d, 0.7282657137693634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7282657137693634d + "'", double2 == 0.7282657137693634d);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7751999363750869d + "'", double1 == 0.7751999363750869d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3283909087132567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3227578905194368d + "'", double1 == 0.3227578905194368d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3735403569930398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35708453783909466d + "'", double1 == 0.35708453783909466d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.642821405345039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9018391760035765d + "'", double1 == 0.9018391760035765d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.072857379539184d, 0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.415488095455529d + "'", double2 == 1.415488095455529d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double double1 = org.apache.commons.math.util.FastMath.exp((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009730277093455045d + "'", double1 == 0.009730277093455045d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.196341993668888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9944107743857757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10577750197666945d + "'", double1 == 0.10577750197666945d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2536458786393914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2536458786393916d + "'", double1 == 1.2536458786393916d);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8581350785198998d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7091979782135539d) + "'", double1 == (-0.7091979782135539d));
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6915215721218745d), 3.1003275537854505E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.267909605184542d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.485854769778837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999993706401679d + "'", double1 == 0.9999993706401679d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7306786685136297d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.6475439282580142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1810791449967444d + "'", double1 == 1.1810791449967444d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.006625404912081631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0066253564415875025d + "'", double1 == 0.0066253564415875025d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610484d + "'", double1 == 5.298292365610484d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089409E-8d + "'", double1 == 4.214684851089409E-8d);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double double1 = org.apache.commons.math.util.FastMath.sinh(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2.9999999999999996d), 22026.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.07483161956956147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07476179912891115d) + "'", double1 == (-0.07476179912891115d));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6428702637760138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4964448729282672d + "'", double1 == 0.4964448729282672d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4011060228739217d) + "'", double1 == (-0.4011060228739217d));
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-53));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 230.89151329853462d + "'", double1 == 230.89151329853462d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7668816193536425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7668816193536426d + "'", double1 == 0.7668816193536426d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        long long2 = org.apache.commons.math.util.FastMath.max(84677176L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 84677176L + "'", long2 == 84677176L);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8502126400132274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.340144407361754d + "'", double1 == 2.340144407361754d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0009877980461308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8420042837526478d + "'", double1 == 0.8420042837526478d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 205.3205109787361d + "'", double1 == 205.3205109787361d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1713150035953614d + "'", double1 == 1.1713150035953614d);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998039600078416d + "'", double1 == 0.9998039600078416d);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2.0f, 0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4214027519155643d + "'", double2 == 1.4214027519155643d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999835100737d + "'", double1 == 0.9999999835100737d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.08322398137173832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08341665804059989d + "'", double1 == 0.08341665804059989d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 149, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.97089000816281d + "'", double1 == 0.97089000816281d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.997417559331972d + "'", double1 == 4.997417559331972d);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double double1 = org.apache.commons.math.util.FastMath.sin(1764.9013237338472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6239190567167857d) + "'", double1 == (-0.6239190567167857d));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.680482178387855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.90638748024775d + "'", double1 == 53.90638748024775d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double2 = org.apache.commons.math.util.FastMath.min(0.011800076512800234d, (-0.7076312586751926d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7076312586751926d) + "'", double2 == (-0.7076312586751926d));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2L, 3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.025470578295336027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02546782437686693d + "'", double1 == 0.02546782437686693d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15692565760074656d + "'", double1 == 0.15692565760074656d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5039744651761873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.293329949408897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3505504618025204d + "'", double1 == 2.3505504618025204d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double double1 = org.apache.commons.math.util.FastMath.asin(14.899277193215763d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double2 = org.apache.commons.math.util.FastMath.min(4.214684851089402E-8d, 1.3565686652647782d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.214684851089402E-8d + "'", double2 == 4.214684851089402E-8d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9950547536867305d) + "'", double1 == (-0.9950547536867305d));
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.880378684063449d, 0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8803786840634489d + "'", double2 == 0.8803786840634489d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        double double2 = org.apache.commons.math.util.FastMath.min(0.025470578295336027d, 1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025470578295336027d + "'", double2 == 0.025470578295336027d);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4973.752448262787d + "'", double1 == 4973.752448262787d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.0637969690534153d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        long long1 = org.apache.commons.math.util.FastMath.abs(57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double double1 = org.apache.commons.math.util.FastMath.ceil(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0000000002328306d, 3.6237264565928684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.6237264565928684d + "'", double2 == 3.6237264565928684d);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.7910068511973d + "'", double1 == 11.7910068511973d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 105.14357225628426d + "'", double1 == 105.14357225628426d);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0009877980461308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082321d + "'", double1 == 1.5607966601082321d);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1586013452313419L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2005.3522829578812d, 4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267738794d + "'", double2 == 1.5707963267738794d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8365164337420496d, 0.7751999363750869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8234240479503369d + "'", double2 == 0.8234240479503369d);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5430806348152446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2326303196791346d + "'", double1 == 2.2326303196791346d);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double1 = org.apache.commons.math.util.FastMath.acos(41.32317658130462d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(20.13501082303189d, 1.4067132730318201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.135010823031887d + "'", double2 == 20.135010823031887d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0866878023604363d + "'", double1 == 1.0866878023604363d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.50632862831693E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        long long1 = org.apache.commons.math.util.FastMath.round(4.997417559331972d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.248715407688383d + "'", double1 == 22.248715407688383d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7581226324091722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6996326226910817d + "'", double1 == 0.6996326226910817d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025022859498119606d + "'", double1 == 0.025022859498119606d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03490658503988659d) + "'", double1 == (-0.03490658503988659d));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double1 = org.apache.commons.math.util.FastMath.asin(24.35674178862402d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24619002710729043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2791426222204005d + "'", double1 == 1.2791426222204005d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2138239491732021d, 1.0637969690534155d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0637969690534155d + "'", double2 == 1.0637969690534155d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-36));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double double1 = org.apache.commons.math.util.FastMath.atan(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5533448061434307d + "'", double1 == 1.5533448061434307d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6949948789359283d, 9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0871877068532832E16d + "'", double2 == 9.0871877068532832E16d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9702843181545027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8250464049151596d + "'", double1 == 0.8250464049151596d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.999474205005279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017444115666094908d) + "'", double1 == (-0.017444115666094908d));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.21348529365373875d), (-0.4505495340698077d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4505495340698077d) + "'", double2 == (-0.4505495340698077d));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3338138044371112d) + "'", double1 == (-0.3338138044371112d));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.540177670628365E45d + "'", double1 == 1.540177670628365E45d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5472906394139022E7d, 205.3205109787361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5472906394139022E7d + "'", double2 == 1.5472906394139022E7d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.23083849595387476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22686461006816822d + "'", double1 == 0.22686461006816822d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2160401483855212d + "'", double1 == 1.2160401483855212d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.862286466674373d + "'", double1 == 10.862286466674373d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double2 = org.apache.commons.math.util.FastMath.min(1.373400766945016d, 100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.373400766945016d + "'", double2 == 1.373400766945016d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1177647015329363d + "'", double1 == 0.1177647015329363d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6109179126442243d + "'", double1 == 3.6109179126442243d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1326506.5549798973d + "'", double1 == 1326506.5549798973d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3132616875182228d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.030522580755008157d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1072.8715259107928d + "'", double1 == 1072.8715259107928d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double1 = org.apache.commons.math.util.FastMath.tanh(92560.48544260226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.544753606236012E-12d, 0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.491429796429747E-8d + "'", double2 == 6.491429796429747E-8d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9986081305645496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7610089865811557d + "'", double1 == 0.7610089865811557d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.9977506581384374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.4349059018154549d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9805560385583565d) + "'", double1 == (-1.9805560385583565d));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6312937620005052d + "'", double1 == 0.6312937620005052d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double double1 = org.apache.commons.math.util.FastMath.atanh(32.48537739999093d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.35708453783909466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34264343564039074d + "'", double1 == 0.34264343564039074d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }
}

