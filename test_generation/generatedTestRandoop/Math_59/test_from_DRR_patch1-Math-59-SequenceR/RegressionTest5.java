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
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2134887868481213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21348878684812134d + "'", double1 == 0.21348878684812134d);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.715662658536639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.09983440995178777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09983440995178777d + "'", double2 == 0.09983440995178777d);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9997103019367587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4426335746777788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.9481480091340625E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8554182836643193d), (double) 28);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.0d + "'", double2 == 28.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16243485560816776d + "'", double1 == 0.16243485560816776d);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.20057203709370552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0035006424347173598d + "'", double1 == 0.0035006424347173598d);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9668078739084816d), 4.696065812452068d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2030392510751841d) + "'", double2 == (-0.2030392510751841d));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 72.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4593566380802732d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99836867862969d + "'", double1 == 0.99836867862969d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7811955944788658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7179170498164851d) + "'", double1 == (-0.7179170498164851d));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.2638973976934584E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934584E18d + "'", double1 == 7.2638973976934584E18d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-3.0466382509707714E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.317386859664129E-6d) + "'", double1 == (-5.317386859664129E-6d));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.1207822376352453d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9764091535367482d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2140890716564288d) + "'", double1 == (-2.2140890716564288d));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        double double1 = org.apache.commons.math.util.FastMath.acos(435.6527582312547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double double1 = org.apache.commons.math.util.FastMath.asin(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        long long1 = org.apache.commons.math.util.FastMath.round(57.29577951308242d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.05723320573453925d, 72.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5535399199098424E-90d + "'", double2 == 3.5535399199098424E-90d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        float float2 = org.apache.commons.math.util.FastMath.min(53.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double double1 = org.apache.commons.math.util.FastMath.asinh(56.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.718578581151767d + "'", double1 == 4.718578581151767d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8643238493907622d + "'", double1 == 0.8643238493907622d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8874498938378453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4097917119315355d + "'", double1 == 1.4097917119315355d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        long long1 = org.apache.commons.math.util.FastMath.round(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        long long1 = org.apache.commons.math.util.FastMath.abs(39481480091340L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 39481480091340L + "'", long1 == 39481480091340L);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1672838871475522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1672838871475524d + "'", double1 == 1.1672838871475524d);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.569397566060481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1321109099202004d + "'", double1 == 0.1321109099202004d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        long long1 = org.apache.commons.math.util.FastMath.round(1477896.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.598780889335082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9550424463474707d + "'", double1 == 0.9550424463474707d);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5088925547167915d, 1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5088925547167915d + "'", double2 == 1.5088925547167915d);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.584491534932266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.794078527423028d + "'", double1 == 0.794078527423028d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7249979868612266d) + "'", double1 == (-2.7249979868612266d));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.45593812776599624d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.206879716514544E22d + "'", double1 == 5.206879716514544E22d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6931471805599452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8539880479975237d + "'", double1 == 0.8539880479975237d);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3980038919397375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14550838045515554d + "'", double1 == 0.14550838045515554d);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.17062332315326464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16899590978479806d) + "'", double1 == (-0.16899590978479806d));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double double2 = org.apache.commons.math.util.FastMath.atan2(10.049875621120885d, 0.06057085833608861d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5647693741018842d + "'", double2 == 1.5647693741018842d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.7035740325184427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9055938341840083d) + "'", double1 == (-0.9055938341840083d));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.691673596021443E41d, 2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.945982489867764E-83d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.945982489867764E-83d) + "'", double1 == (-1.945982489867764E-83d));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0115470718397392d + "'", double1 == 1.0115470718397392d);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.9251568576324245d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-3));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.539639096762709E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.50483309958452d + "'", double1 == 72.50483309958452d);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5423560824282998d + "'", double1 == 1.5423560824282998d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.69066269187734d + "'", double1 == 0.69066269187734d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0176614589589157d, 2.328887050212274E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.328887050212274E12d + "'", double2 == 2.328887050212274E12d);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5711009442193944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9172007050231629d + "'", double1 == 0.9172007050231629d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.19484471582527388d), 0.013388202148675738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.19484471582527388d) + "'", double2 == (-0.19484471582527388d));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.896884357580183d + "'", double1 == 0.896884357580183d);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        long long2 = org.apache.commons.math.util.FastMath.min(57L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7135781201111424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6129156766164338d + "'", double1 == 0.6129156766164338d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(363.7080191456556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.071130515668326d + "'", double1 == 19.071130515668326d);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double double2 = org.apache.commons.math.util.FastMath.min(1.263239527598922d, 0.999846751001702d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999846751001702d + "'", double2 == 0.999846751001702d);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5748946607304181d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5189448670992995d) + "'", double1 == (-0.5189448670992995d));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double double2 = org.apache.commons.math.util.FastMath.min(10.049875621120886d, 0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4251053392695819d + "'", double2 == 0.4251053392695819d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-53.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        long long2 = org.apache.commons.math.util.FastMath.max(53L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double double2 = org.apache.commons.math.util.FastMath.max(3.683604680594733d, 1.57108749076139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.683604680594733d + "'", double2 == 3.683604680594733d);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.4788975654116d + "'", double1 == 286.4788975654116d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8414709848078966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6995216443485197d + "'", double1 == 0.6995216443485197d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double double1 = org.apache.commons.math.util.FastMath.signum(232.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.430999064953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.0153117485777d + "'", double1 == 83.0153117485777d);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.258625856460398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2947960259678524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3428524237259708d + "'", double1 == 0.3428524237259708d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.11886886458581854d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11943352419502769d) + "'", double1 == (-0.11943352419502769d));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double double1 = org.apache.commons.math.util.FastMath.abs(102.39369977975828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.39369977975828d + "'", double1 == 102.39369977975828d);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7311284168939934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9311474297834463d + "'", double1 == 0.9311474297834463d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8473655875129774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07192917717322632d) + "'", double1 == (-0.07192917717322632d));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4677992676220695d + "'", double1 == 1.4677992676220695d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.008798582499187173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008798696026932035d) + "'", double1 == (-0.008798696026932035d));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994957367079d + "'", double1 == 0.9149994957367079d);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double double2 = org.apache.commons.math.util.FastMath.min((-4426.960349240149d), 0.8401374852128212d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4426.960349240149d) + "'", double2 == (-4426.960349240149d));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4509000100090763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.250656177740729d + "'", double1 == 2.250656177740729d);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0104380367075194d + "'", double1 == 1.0104380367075194d);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.1207822376352453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12107612082137736d) + "'", double1 == (-0.12107612082137736d));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6691306779508364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7201927932561937d + "'", double1 == 0.7201927932561937d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.227615833318806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5410289341905583d + "'", double1 == 1.5410289341905583d);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5707963267948841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031175112103d + "'", double1 == 1.2334031175112103d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) 28);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28L + "'", long2 == 28L);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double double1 = org.apache.commons.math.util.FastMath.abs((-5.260052243696693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.260052243696693d + "'", double1 == 5.260052243696693d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9890274022010992d + "'", double1 == 0.9890274022010992d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        long long1 = org.apache.commons.math.util.FastMath.round(0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4913849717236785d + "'", double1 == 0.4913849717236785d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.5321159072301354d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8066370946516901d, 0.9290452453166923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8066370946516902d + "'", double2 == 0.8066370946516902d);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48469922679209587d + "'", double1 == 0.48469922679209587d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double double1 = org.apache.commons.math.util.FastMath.signum((-6.128666380978778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.106387248181345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.47402420806417284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.42415281851896525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007402863214769922d + "'", double1 == 0.007402863214769922d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.620554677378945d), 192.21311052213554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.018833921198998405d) + "'", double2 == (-0.018833921198998405d));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double double2 = org.apache.commons.math.util.FastMath.min(231.58466047909457d, 0.7740840138843887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7740840138843887d + "'", double2 == 0.7740840138843887d);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.584491534932266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46026355771252025d + "'", double1 == 0.46026355771252025d);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0359863753497582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.945982489867764E-83d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.945982489867764E-83d) + "'", double1 == (-1.945982489867764E-83d));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3265.8594322456925d + "'", double1 == 3265.8594322456925d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8897311048513159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05074122630354142d) + "'", double1 == (-0.05074122630354142d));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double double1 = org.apache.commons.math.util.FastMath.floor(286.82547115569156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.0d + "'", double1 == 286.0d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47588499532711054d + "'", double1 == 0.47588499532711054d);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948948d + "'", double1 == 1.5707963267948948d);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3744449684274126E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3744449E7d + "'", double1 == 1.3744449E7d);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3156563365585749d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double double1 = org.apache.commons.math.util.FastMath.atanh(36.000000000000014d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-4426.960349240149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.088615669432869d) + "'", double1 == (-9.088615669432869d));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9998885350647092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5429496506759195d + "'", double1 == 1.5429496506759195d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3552527156068805E-20d + "'", double1 == 1.3552527156068805E-20d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.860761315262648E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.619945108332321E-11d + "'", double1 == 4.619945108332321E-11d);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7464968867258404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9649955887750582d) + "'", double1 == (-0.9649955887750582d));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.810295527926742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9446562348733084d + "'", double1 == 0.9446562348733084d);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6984400637458461d + "'", double1 == 0.6984400637458461d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.293358726420639E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.293358726420639E30d + "'", double1 == 9.293358726420639E30d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7245451197632213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6726587729611843d + "'", double1 == 0.6726587729611843d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.69066269187734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001739546146996826d + "'", double1 == 0.001739546146996826d);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.3046231798951236d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8436963527515925E124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49284442857018573d + "'", double1 == 0.49284442857018573d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double double1 = org.apache.commons.math.util.FastMath.cosh(813.951274474838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0104380367075194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7468039524918473d + "'", double1 == 1.7468039524918473d);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9149994957367079d, 1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3887317335324652d + "'", double2 == 1.3887317335324652d);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0359863753497582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7109804067944506d + "'", double1 == 0.7109804067944506d);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(69.84482292460207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.118237670498365d + "'", double1 == 4.118237670498365d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.001885141133518411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04341821200278071d + "'", double1 == 0.04341821200278071d);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.15529712916720415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15467365951537007d + "'", double1 == 0.15467365951537007d);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3485292390836008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.09934057489936098d, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.857734145372121E-6d + "'", double2 == 4.857734145372121E-6d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double double1 = org.apache.commons.math.util.FastMath.atan(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5477745439281119d + "'", double1 == 1.5477745439281119d);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.575441381684169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6077292684620609d + "'", double1 == 0.6077292684620609d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8640948048351971d + "'", double1 == 0.8640948048351971d);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.118237670498365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.118237670498366d + "'", double1 == 4.118237670498366d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.113278222196781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8564300092625501d + "'", double1 == 0.8564300092625501d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.46026355771252025d, (-0.7730965638572164d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8219164086149127d + "'", double2 == 1.8219164086149127d);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.6112949659561453d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2204460492503185E-16d, (-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double double1 = org.apache.commons.math.util.FastMath.abs(29.169558789096715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.169558789096715d + "'", double1 == 29.169558789096715d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.51718181260188d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05723320573453926d + "'", double1 == 0.05723320573453926d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6645439359795198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8009077307264113d) + "'", double1 == (-0.8009077307264113d));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6027624231806457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1872284502270583d + "'", double1 == 1.1872284502270583d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        int int1 = org.apache.commons.math.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(90.01446758943851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5710488338654254d + "'", double1 == 1.5710488338654254d);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.3933489534882026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9834580564863409d + "'", double1 == 0.9834580564863409d);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.797850593225596d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.5535399199098424E-90d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0943643578893503d + "'", double1 == 1.0943643578893503d);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.1531011997348775d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.017065175308356183d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017212463483081388d) + "'", double1 == (-0.017212463483081388d));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.0461741978670857E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003046638203843d + "'", double1 == 1.0003046638203843d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double double1 = org.apache.commons.math.util.FastMath.rint(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6020599913279624d + "'", double1 == 0.6020599913279624d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.69314718055995d + "'", double1 == 52.69314718055995d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5519306407732258d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9141034768888819d) + "'", double1 == (-0.9141034768888819d));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5088925547167915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9067423244966043d + "'", double1 == 0.9067423244966043d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        float float1 = org.apache.commons.math.util.FastMath.abs(4.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9376658284517877d, (-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1092738450937532d + "'", double2 == 1.1092738450937532d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        long long2 = org.apache.commons.math.util.FastMath.max(72L, 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8321333235457969d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.3046231798951236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.28357366964177444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6569847686310842d + "'", double1 == 0.6569847686310842d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        long long1 = org.apache.commons.math.util.FastMath.round(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double double1 = org.apache.commons.math.util.FastMath.asin(35.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double double1 = org.apache.commons.math.util.FastMath.exp(9.712293689529174E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3552527156068805E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        float float1 = org.apache.commons.math.util.FastMath.abs(28.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 28.0f + "'", float1 == 28.0f);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        float float1 = org.apache.commons.math.util.FastMath.abs(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7468039524918473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9845506032000481d + "'", double1 == 0.9845506032000481d);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.41671114415975274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1409719680004522d + "'", double1 == 1.1409719680004522d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1373220393635d + "'", double1 == 1.1373220393635d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215994d + "'", double1 == 14.899277193215994d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(104.94395111059708d, 3.637978807091713E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.94395111059707d + "'", double2 == 104.94395111059707d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7994292769759406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44958547969513046d + "'", double1 == 0.44958547969513046d);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double double1 = org.apache.commons.math.util.FastMath.acos(88.62082012530739d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6129156766164338d, 1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5498622334799267d + "'", double2 == 0.5498622334799267d);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2285327801518604d + "'", double1 == 3.2285327801518604d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.009730277093455045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009730584187091412d + "'", double1 == 0.009730584187091412d);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double double1 = org.apache.commons.math.util.FastMath.floor(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09966865249116186d + "'", double1 == 0.09966865249116186d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.883230432587404d, 1.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8425647914073723d + "'", double2 == 0.8425647914073723d);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double double1 = org.apache.commons.math.util.FastMath.tan(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837733d + "'", double1 == 0.6610060414837733d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 3.9481478E13f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9387214167925974d + "'", double1 == 0.9387214167925974d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9387628649611217d) + "'", double1 == (-0.9387628649611217d));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3744449E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776928d + "'", double1 == 0.9999999958776928d);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3744449E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3744449E7d + "'", double1 == 1.3744449E7d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8425647914073723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double double1 = org.apache.commons.math.util.FastMath.abs(10.690128972137646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.690128972137646d + "'", double1 == 10.690128972137646d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.40604869080352307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3851125268672118d) + "'", double1 == (-0.3851125268672118d));
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6094379124341003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5228075827238494d, 2.250656177740729d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23231882766715378d + "'", double2 == 0.23231882766715378d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2210278799953218d + "'", double1 == 0.2210278799953218d);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.23231882766715378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4819946344796317d + "'", double1 == 0.4819946344796317d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6084415934065646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-26.551214976773192d) + "'", double1 == (-26.551214976773192d));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.238865337353114d) + "'", double1 == (-4.238865337353114d));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, 72L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 72L + "'", long2 == 72L);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5083775167989393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.42366562500266d + "'", double1 == 86.42366562500266d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 6L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.960170286650366d + "'", double1 == 0.960170286650366d);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29291493894794d + "'", double1 == 57.29291493894794d);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.810477380965292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.162168244741062d) + "'", double1 == (-10.162168244741062d));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2204460492503185E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.718578581151767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 270.3546380008244d + "'", double1 == 270.3546380008244d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3442682486537372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8353789697787954d + "'", double1 == 2.8353789697787954d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(12.232006459765387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2134887868481213d + "'", double1 == 0.2134887868481213d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2479811090512842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.50405046069433d + "'", double1 == 71.50405046069433d);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6645439359795198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double double1 = org.apache.commons.math.util.FastMath.sinh(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.842859999667966E24d + "'", double1 == 2.842859999667966E24d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3065152709994659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30651527099946596d + "'", double1 == 0.30651527099946596d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.306852817378903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306852817378905d + "'", double1 == 9.306852817378905d);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.718578581151767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6738111919958594d + "'", double1 == 0.6738111919958594d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.6111038742580877d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2548537240639837d) + "'", double1 == (-1.2548537240639837d));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.248699261236361d, 57.29577951308236d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07401831913620054d + "'", double2 == 0.07401831913620054d);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2976534827417238d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.005195033303871199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0051950800397900995d + "'", double1 == 0.0051950800397900995d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019279300992748737d + "'", double1 == 0.019279300992748737d);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.632512904931238d), 0.22469894983086625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.632512904931237d) + "'", double2 == (-4.632512904931237d));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7456418720467646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.321227411177487d + "'", double1 == 1.321227411177487d);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.5578545843443006d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double double2 = org.apache.commons.math.util.FastMath.max(1.344162252208615d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.344162252208615d + "'", double2 == 1.344162252208615d);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8321333235457969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2982163533700364d + "'", double1 == 2.2982163533700364d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4509000100090763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8958706932764281d + "'", double1 == 0.8958706932764281d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(286.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.00000000000006d + "'", double1 == 286.00000000000006d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7464968867258402d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7340722322122621d + "'", double1 == 0.7340722322122621d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.46364760900080604d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6809167416070823d + "'", double1 == 0.6809167416070823d);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double double1 = org.apache.commons.math.util.FastMath.exp(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8623188722876841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7593534431810433d + "'", double1 == 0.7593534431810433d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.206130689293303d + "'", double1 == 14.206130689293303d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.44958547969513046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16393896798747645d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.007987835004624685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000031902923662d + "'", double1 == 1.000031902923662d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.008837632613846286d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-4.550646685718122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5445244839004441d + "'", double1 == 0.5445244839004441d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9903301413773639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9903301413773639d + "'", double1 == 0.9903301413773639d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.691673596021348E41d, 0.9560273016457694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.0286185349173835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.265902127447376d + "'", double1 == 1.265902127447376d);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9999999999882881d), 0.6323562492563314d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6323562492563314d + "'", double2 == 0.6323562492563314d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4576692332118568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9712667366571679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7708231552724154d) + "'", double1 == (-0.7708231552724154d));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1559057424196283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15654434213077018d + "'", double1 == 0.15654434213077018d);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5410289341905583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.669392297463842d + "'", double1 == 4.669392297463842d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.1490617565057812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.147104553392378d + "'", double1 == 1.147104553392378d);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double double2 = org.apache.commons.math.util.FastMath.min(2.220446049250313E-16d, 0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E-16d + "'", double2 == 2.220446049250313E-16d);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4933710115259213d), 36.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.000168222518137E-12d + "'", double2 == 9.000168222518137E-12d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7593534431810433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9946861854499426d + "'", double1 == 0.9946861854499426d);
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
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.04191482247339d, 0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4009585690078399d + "'", double2 == 1.4009585690078399d);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3058674334245912d + "'", double1 == 1.3058674334245912d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438012d) + "'", double1 == (-1.1752011936438012d));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.008791790599507117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008791790599507118d + "'", double1 == 0.008791790599507118d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8958706932764281d, 1.6178334732240378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8958706932764282d + "'", double2 == 0.8958706932764282d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4426335746777788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4572296218407251d + "'", double1 == 0.4572296218407251d);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7361507318256206d + "'", double1 == 0.7361507318256206d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.2548537240639837d), (-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2548537240639837d) + "'", double2 == (-1.2548537240639837d));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5397993958058634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.416347758287445d, 0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4163477582874449d + "'", double2 == 1.4163477582874449d);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double double1 = org.apache.commons.math.util.FastMath.asinh(57.29577951308238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741450291257946d + "'", double1 == 4.741450291257946d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1183599281602883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1993938046696928d + "'", double1 == 1.1993938046696928d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.166552341720382d + "'", double1 == 5.166552341720382d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.09966865249116186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09966865249116186d + "'", double1 == 0.09966865249116186d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double double1 = org.apache.commons.math.util.FastMath.atan(813.951274474838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5695677526428213d + "'", double1 == 1.5695677526428213d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31113287105457993d + "'", double1 == 0.31113287105457993d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double double2 = org.apache.commons.math.util.FastMath.max(0.540302305868139d, 0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6360918665423811d + "'", double2 == 0.6360918665423811d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.241721948438556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9283350632110237d + "'", double1 == 2.9283350632110237d);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2975000227598567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.11886728987977911d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.810594032269465d) + "'", double1 == (-6.810594032269465d));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.389056098930649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936266556409077d + "'", double1 == 1.9936266556409077d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        long long2 = org.apache.commons.math.util.FastMath.min(601302L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.575441381684169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5476523162282666d + "'", double1 == 0.5476523162282666d);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9224287714823782d + "'", double1 == 0.9224287714823782d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6032754731892245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6889561611808576d + "'", double1 == 0.6889561611808576d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38415859170297456d + "'", double1 == 0.38415859170297456d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 72, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5733724749885676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2347857777188793d + "'", double1 == 1.2347857777188793d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5677016102904182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999952113687003d + "'", double1 == 0.9999952113687003d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.540947184137944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5409471841379443d + "'", double1 == 1.5409471841379443d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.94875668844129d + "'", double1 == 3.94875668844129d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1189038211438946d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9019228933850969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6201025658590362d + "'", double1 == 0.6201025658590362d);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.180709777452588d + "'", double1 == 22.180709777452588d);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double double2 = org.apache.commons.math.util.FastMath.max(2.7568396789787606d, 0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7568396789787606d + "'", double2 == 2.7568396789787606d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double double2 = org.apache.commons.math.util.FastMath.max(0.05448755243389763d, 0.15529712916720415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15529712916720415d + "'", double2 == 0.15529712916720415d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 601302L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5579004906280912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.159705192572887d + "'", double1 == 1.159705192572887d);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4426.960349240149d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4908493554131868d) + "'", double1 == (-0.4908493554131868d));
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.508377516798939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5083775167989393d + "'", double1 == 1.5083775167989393d);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double double1 = org.apache.commons.math.util.FastMath.asinh(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6237264565928684d + "'", double1 == 3.6237264565928684d);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double double2 = org.apache.commons.math.util.FastMath.atan2(103504.4889592901d, 3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707602654492223d + "'", double2 == 1.5707602654492223d);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.011032137421751803d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double double1 = org.apache.commons.math.util.FastMath.tan(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1918648484720658d + "'", double1 == 0.1918648484720658d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(80.09972275101016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.949844845080285d + "'", double1 == 8.949844845080285d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double double1 = org.apache.commons.math.util.FastMath.signum(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.003480087166787292d, 0.6691306779508364d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.005200861212658299d + "'", double2 == 0.005200861212658299d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1477895.5237242084d, 1.57108749076139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707952637376876d + "'", double2 == 1.5707952637376876d);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4963334177617679d + "'", double1 == 0.4963334177617679d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.17062332315326462d), 1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1833.4649444186343d + "'", double2 == 1833.4649444186343d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07428299663566632d + "'", double1 == 0.07428299663566632d);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.018833921198998405d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01883280792598242d) + "'", double1 == (-0.01883280792598242d));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4426335746777788d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7401549043526567d + "'", double1 == 0.7401549043526567d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.07401831913620054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07682653184743575d + "'", double1 == 0.07682653184743575d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3036434257386476d, 0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3300895400924683d + "'", double2 == 0.3300895400924683d);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6795226183513794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9729356641053681d + "'", double1 == 1.9729356641053681d);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.309274745959981d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8564300092625501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5424818954018846d + "'", double1 == 0.5424818954018846d);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042697E42d + "'", double1 == 1.3383347192042697E42d);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0455256631001846d + "'", double1 == 1.0455256631001846d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5019419896466207d, 0.5579004906280912d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7326482596096648d + "'", double2 == 0.7326482596096648d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.1563686078816606d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20493601665927702d + "'", double1 == 0.20493601665927702d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.36945265746442124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37841993602148327d) + "'", double1 == (-0.37841993602148327d));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1820513306501462d + "'", double1 == 0.1820513306501462d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.009606545630105158d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21258000682000355d) + "'", double1 == (-0.21258000682000355d));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.482433365515615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.403648339910223d + "'", double1 == 3.403648339910223d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.675024856842625d) + "'", double1 == (-2.675024856842625d));
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.9949998749938d + "'", double1 == 99.9949998749938d);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.007987835004624686d, 601302.1420828041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5436613490374845d + "'", double1 == 0.5436613490374845d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.12506129236784067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13360144349841713d) + "'", double1 == (-0.13360144349841713d));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707952637376876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611958311551322d + "'", double1 == 0.19611958311551322d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 232L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.923689900271567d) + "'", double1 == (-6.923689900271567d));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double double1 = org.apache.commons.math.util.FastMath.ceil(100.69314718055996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-53));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double double1 = org.apache.commons.math.util.FastMath.log1p(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6120970385294773d + "'", double1 == 3.6120970385294773d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.496773992873097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4967739928730976d + "'", double1 == 2.4967739928730976d);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7158569288579338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48877308852086976d + "'", double1 == 0.48877308852086976d);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7201927932561937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.264007489317756d + "'", double1 == 41.264007489317756d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.19484471582527388d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1924336773023863d) + "'", double1 == (-0.1924336773023863d));
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-21.168078002603806d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.570491709370399d, 0.24779790579557007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4143028416180226d + "'", double2 == 1.4143028416180226d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        int int2 = org.apache.commons.math.util.FastMath.max(28, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.39731803409120725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37765183291026694d) + "'", double1 == (-0.37765183291026694d));
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.07532458034302d + "'", double1 == 2.07532458034302d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0996411683627738d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.540947184137944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4415943645925386d + "'", double1 == 2.4415943645925386d);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.319776824715853d + "'", double1 == 2.319776824715853d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21481175810568434d + "'", double1 == 0.21481175810568434d);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9475357648137084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.434381731912222d + "'", double1 == 3.434381731912222d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4963334177617679d, (-14.148409796207115d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-14.148409796207115d) + "'", double2 == (-14.148409796207115d));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9764091535367482d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09187222072048129d + "'", double2 == 0.09187222072048129d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.008798809557313646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int int1 = org.apache.commons.math.util.FastMath.abs((-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5476523162282666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.520684332357967d + "'", double1 == 0.520684332357967d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5206130698160022d + "'", double1 == 0.5206130698160022d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2436740316514885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.43930669835763825d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.13360144349841713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13400211995708533d) + "'", double1 == (-0.13400211995708533d));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int int1 = org.apache.commons.math.util.FastMath.round(32.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double double2 = org.apache.commons.math.util.FastMath.min(0.24779790579557007d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24779790579557007d + "'", double2 == 0.24779790579557007d);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-3), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 28);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6645439359795198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5813794361776217d) + "'", double1 == (-0.5813794361776217d));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double double1 = org.apache.commons.math.util.FastMath.floor((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3293232640668136d, 0.05074285328697551d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3293232640668133d + "'", double2 == 1.3293232640668133d);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9055938341840083d), 8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9055938341840083d) + "'", double2 == (-0.9055938341840083d));
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6399307720594023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8617428025846814d) + "'", double1 == (-0.8617428025846814d));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5860134523134298E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        long long1 = org.apache.commons.math.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.29899893506723685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        int int1 = org.apache.commons.math.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 232L, 1.2347857777188793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 232.0d + "'", double2 == 232.0d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.079985986933498E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005202448750892189d + "'", double1 == 0.005202448750892189d);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double double1 = org.apache.commons.math.util.FastMath.tan(14.899277193215994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.047695165899868d) + "'", double1 == (-1.047695165899868d));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.06445067165256874d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06436165309773824d) + "'", double2 == (-0.06436165309773824d));
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52L, (-100.30909595621492d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.663335481368682d + "'", double2 == 2.663335481368682d);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9903210539364167d + "'", double1 == 0.9903210539364167d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.047695165899868d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4288764780867376d, (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4288764780867377d + "'", double2 == 0.4288764780867377d);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5265129967102895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1418397313418598d + "'", double1 == 1.1418397313418598d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.23322795531568172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.262669278697344d + "'", double1 == 0.262669278697344d);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5584988834922742d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(57.29577951308242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.855146420814101d + "'", double1 == 3.855146420814101d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2204460492503185E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250319E-16d + "'", double1 == 2.220446049250319E-16d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.507288054547833E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.507288054547833E-32d + "'", double1 == 5.507288054547833E-32d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024078697432024926d + "'", double1 == 0.024078697432024926d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.159705192572887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020240673962871766d + "'", double1 == 0.020240673962871766d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5410289341905583d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9729356641053681d, 1.5900049437549362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5900049437549362d + "'", double2 == 1.5900049437549362d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.250656177740729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1526802063667085d + "'", double1 == 1.1526802063667085d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.41032129904822556d), 0.16243485560816776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16243485560816776d + "'", double2 == 0.16243485560816776d);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1032762973918335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8926886900311722d + "'", double1 == 0.8926886900311722d);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.69066269187734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012054337993946678d + "'", double1 == 0.012054337993946678d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double double2 = org.apache.commons.math.util.FastMath.min(0.20057203709370552d, (-0.11158130719039049d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11158130719039049d) + "'", double2 == (-0.11158130719039049d));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9903301413773637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0042200026983256434d) + "'", double1 == (-0.0042200026983256434d));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-100.01791180959569d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.0d) + "'", double1 == (-100.0d));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9387628649611217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-53.7871501258819d) + "'", double1 == (-53.7871501258819d));
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 3, 1.4154931988910127d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.258625856460398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3828763427709216d + "'", double1 == 1.3828763427709216d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9171473774587547d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.072791990708367E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double double2 = org.apache.commons.math.util.FastMath.min(7.54983443527075d, 0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7813863964118538d + "'", double2 == 0.7813863964118538d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6283488663257064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4875665359780923d + "'", double1 == 0.4875665359780923d);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.29054468128588473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.646983997654825d + "'", double1 == 16.646983997654825d);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9960820508065507d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double double1 = org.apache.commons.math.util.FastMath.acosh(435.6527582312547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.769991363293242d + "'", double1 == 6.769991363293242d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4875665359780923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.935504743358095d + "'", double1 == 27.935504743358095d);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double double1 = org.apache.commons.math.util.FastMath.log(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0975855140010009d, 1.2086845112949163d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06004622792980713d + "'", double2 == 0.06004622792980713d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914824263686d + "'", double1 == 4.041914824263686d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.046174197867085E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046174103647121E-4d) + "'", double1 == (-3.046174103647121E-4d));
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.46096535893150964d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47746469952801107d) + "'", double1 == (-0.47746469952801107d));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4464413322481353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.006281968213695d + "'", double1 == 2.006281968213695d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4464413322481353d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7235232133665007d + "'", double1 == 0.7235232133665007d);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        float float2 = org.apache.commons.math.util.FastMath.max(1477896.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }
}

