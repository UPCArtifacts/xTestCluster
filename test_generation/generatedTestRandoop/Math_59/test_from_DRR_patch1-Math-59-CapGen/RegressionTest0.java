import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) '4', (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5900247258946039d + "'", double2 == 1.5900247258946039d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999999d) + "'", double1 == (-0.9999999999999999d));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        double double0 = org.apache.commons.math.util.FastMath.random();
// flaky:         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.24331311680122625d + "'", double0 == 0.24331311680122625d);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.24331311680122625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2754679320391344d + "'", double1 == 1.2754679320391344d);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 1L, (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double double1 = org.apache.commons.math.util.FastMath.asin(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        double double1 = org.apache.commons.math.util.FastMath.ulp(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (-1), 0.17453292519943295d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (byte) 1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        double double1 = org.apache.commons.math.util.FastMath.asin(32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2754679320391344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24331311680122622d + "'", double1 == 0.24331311680122622d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1752011936438014d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double1 = org.apache.commons.math.util.FastMath.acosh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.428182669496151d) + "'", double1 == (-0.428182669496151d));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.24331311680122625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2754679320391345d + "'", double1 == 0.2754679320391345d);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int1 = org.apache.commons.math.util.FastMath.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24331311680122622d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2386752917259769d + "'", double2 == 0.2386752917259769d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double0 = org.apache.commons.math.util.FastMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 0, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097588d) + "'", double2 == (-0.5063656411097588d));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7059602000407633d) + "'", double1 == (-0.7059602000407633d));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        float float1 = org.apache.commons.math.util.FastMath.abs(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 97.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.770170914020331d + "'", double2 == 0.770170914020331d);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9999999958776927d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000041223074d + "'", double2 == 1.0000000041223074d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 1L, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010308913146243284d + "'", double2 == 0.010308913146243284d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        double double1 = org.apache.commons.math.util.FastMath.rint(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.24331311680122622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24331311680122622d + "'", double1 == 0.24331311680122622d);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double double1 = org.apache.commons.math.util.FastMath.ulp(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double double0 = org.apache.commons.math.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000001d + "'", double1 == 32.00000000000001d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078965d + "'", double1 == 0.8414709848078965d);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19068994544354323d + "'", double1 == 0.19068994544354323d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2754679320391345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.317146865907417d + "'", double1 == 0.317146865907417d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19334632705655574d + "'", double1 == 0.19334632705655574d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2754679320391344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        float float1 = org.apache.commons.math.util.FastMath.abs((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int int1 = org.apache.commons.math.util.FastMath.round(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.99822295029797d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.781104616480253d + "'", double2 == 19.781104616480253d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 1, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5900247258946039d, 0.2754679320391345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1362667799148092d + "'", double2 == 1.1362667799148092d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        double double1 = org.apache.commons.math.util.FastMath.log(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double double1 = org.apache.commons.math.util.FastMath.tanh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7059602000407633d), 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7059602000407633d) + "'", double2 == (-0.7059602000407633d));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2754679320391344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2754679320391344d + "'", double1 == 1.2754679320391344d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.302585092994046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (byte) 100, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int int1 = org.apache.commons.math.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6931471805599453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        double double1 = org.apache.commons.math.util.FastMath.sin(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097466d) + "'", double1 == (-0.5063656411097466d));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.19334632705655574d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19334632705655572d + "'", double2 == 0.19334632705655572d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2240401467946809d) + "'", double1 == (-1.2240401467946809d));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999468579779085d + "'", double1 == 0.9999468579779085d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.049875621120892d + "'", double1 == 10.049875621120892d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        double double1 = org.apache.commons.math.util.FastMath.log(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.465735902799727d + "'", double1 == 3.465735902799727d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double1 = org.apache.commons.math.util.FastMath.expm1(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double1 = org.apache.commons.math.util.FastMath.ceil(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double double1 = org.apache.commons.math.util.FastMath.expm1(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308913146243284d + "'", double1 == 0.010308913146243284d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        double double1 = org.apache.commons.math.util.FastMath.exp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.24331311680122625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24091947210469064d + "'", double1 == 0.24091947210469064d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055269350272d + "'", double1 == 1.5707055269350272d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7763568394002505E-15d, 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.776356839400251E-15d + "'", double2 == 1.776356839400251E-15d);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1906899454435431d + "'", double1 == 1.1906899454435431d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195432d + "'", double1 == 0.8813735870195432d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.19334632705655574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double double1 = org.apache.commons.math.util.FastMath.ceil(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01030854798077996d + "'", double1 == 0.01030854798077996d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.2240401467946809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2240401467946809d + "'", double1 == 1.2240401467946809d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        double double1 = org.apache.commons.math.util.FastMath.log1p(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.24331311680122622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707963267948967d + "'", double1 == 0.5707963267948967d);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8259324122591327d + "'", double1 == 0.8259324122591327d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776928d + "'", double1 == 0.9999999958776928d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999999d) + "'", double1 == (-0.9999999999999999d));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2754679320391344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2386752917259769d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0728365155995324d + "'", double2 == 0.0728365155995324d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5063656411097466d), 3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097465d) + "'", double2 == (-0.5063656411097465d));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.141592653589793d, 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0728365155995324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002653751905632d + "'", double1 == 1.002653751905632d);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        float float1 = org.apache.commons.math.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291913552122d + "'", double1 == 3.970291913552122d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948948d + "'", double1 == 1.5707963267948948d);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19068994544354323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571064922358931d) + "'", double1 == (-1.6571064922358931d));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2005.3522829578812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1362667799148092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019831596490547193d + "'", double1 == 0.019831596490547193d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1362667799148092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9070681957730898d + "'", double1 == 0.9070681957730898d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6d + "'", double1 == 0.6d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400251E-15d + "'", double1 == 1.776356839400251E-15d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.615120516841261d + "'", double1 == 4.615120516841261d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14287905018325442d + "'", double1 == 0.14287905018325442d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) -1, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1535902666964597d + "'", double1 == 1.1535902666964597d);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        double double2 = org.apache.commons.math.util.FastMath.max(3.970291913552122d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) ' ', 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8310416729209025d + "'", double2 == 1.8310416729209025d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3383347192042695E42d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3383347192042695E42d + "'", double2 == 1.3383347192042695E42d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2754679320391344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8221857156655814d + "'", double1 == 0.8221857156655814d);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(100.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047442967903742035d + "'", double1 == 0.047442967903742035d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-18.714973875118524d) + "'", double1 == (-18.714973875118524d));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292519943295d) + "'", double1 == (-0.017453292519943295d));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double double1 = org.apache.commons.math.util.FastMath.cosh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int1 = org.apache.commons.math.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665127d + "'", double1 == 0.9033391107665127d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6151205168412615d + "'", double1 == 4.6151205168412615d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999999958776928d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776927d + "'", double2 == 0.9999999958776927d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-1), 1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.47197233734299E-43d) + "'", double2 == (-7.47197233734299E-43d));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        double double1 = org.apache.commons.math.util.FastMath.cos(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915067d) + "'", double1 == (-0.9036922050915067d));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        double double1 = org.apache.commons.math.util.FastMath.cos(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) ' ', 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.035274726494073E-14d + "'", double2 == 4.035274726494073E-14d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        double double1 = org.apache.commons.math.util.FastMath.floor(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8657694832396586d + "'", double1 == 0.8657694832396586d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523148d + "'", double1 == 1.7253825588523148d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2754679320391344d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2754679320391344d + "'", double2 == 1.2754679320391344d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 35);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.01030854798077996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308913146243284d + "'", double1 == 0.010308913146243284d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5063656411097466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097465d) + "'", double1 == (-0.5063656411097465d));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.6571064922358931d), 0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0278589874552748d) + "'", double2 == (-1.0278589874552748d));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8310416729209025d, 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703393d + "'", double2 == 11013.232874703393d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6151205168412615d + "'", double1 == 4.6151205168412615d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.14287905018325442d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0728365155995324d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.718281828459045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1362667799148092d, (-18.714973875118524d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-18.714973875118524d) + "'", double2 == (-18.714973875118524d));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.6571064922358931d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0000000000002d + "'", double1 == 100.0000000000002d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7253825588523148d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.610439577969121d + "'", double1 == 12.610439577969121d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 97.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double double1 = org.apache.commons.math.util.FastMath.acosh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279167d + "'", double1 == 4.158638853279167d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9251475365964139d), 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9251475365964139d) + "'", double2 == (-0.9251475365964139d));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1535902666964596d + "'", double1 == 0.1535902666964596d);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7853981633974483d, 1.1535902666964597d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974484d + "'", double2 == 0.7853981633974484d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17364817766693033d + "'", double1 == 0.17364817766693033d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.2386752917259769d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.138288992714996d + "'", double1 == 3.138288992714996d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2386752917259769d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48854405300441117d + "'", double1 == 0.48854405300441117d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8813735870195432d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.123919126120245d + "'", double2 == 1.123919126120245d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 0.0f, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5063656411097465d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.375942878091087d + "'", double1 == 1.375942878091087d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8221857156655814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2754679320391344d + "'", double1 == 1.2754679320391344d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double double1 = org.apache.commons.math.util.FastMath.log10((-18.714973875118524d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8310416729209025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2233932393493425d + "'", double1 == 1.2233932393493425d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0728365155995324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07277226732562546d + "'", double1 == 0.07277226732562546d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        long long1 = org.apache.commons.math.util.FastMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6931471805599453d, (-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.457501399486101d + "'", double2 == 1.457501399486101d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13355056135114904d + "'", double1 == 0.13355056135114904d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.48854405300441117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5315194283752256d + "'", double1 == 0.5315194283752256d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        long long1 = org.apache.commons.math.util.FastMath.round(4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        double double1 = org.apache.commons.math.util.FastMath.tan(10.049875621120892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7216329479064553d + "'", double1 == 0.7216329479064553d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3831970825634745d + "'", double1 == 1.3831970825634745d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9036922050915067d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        float float2 = org.apache.commons.math.util.FastMath.min(100.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        long long1 = org.apache.commons.math.util.FastMath.round(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        double double1 = org.apache.commons.math.util.FastMath.log(1.002653751905632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002650236923264503d + "'", double1 == 0.002650236923264503d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246586d) + "'", double1 == (-3.380515006246586d));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.19334632705655574d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5315194283752256d, 0.19068994544354323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8864602386292288d + "'", double2 == 0.8864602386292288d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.375942878091087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0149280275816275d + "'", double1 == 1.0149280275816275d);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        double double2 = org.apache.commons.math.util.FastMath.min(0.317146865907417d, 1.5707055269350272d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.317146865907417d + "'", double2 == 0.317146865907417d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.07277226732562546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07264407634054174d + "'", double1 == 0.07264407634054174d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        double double2 = org.apache.commons.math.util.FastMath.atan2(32.0d, 0.07264407634054174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5685262033089267d + "'", double2 == 1.5685262033089267d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2599210498948732d + "'", double1 == 1.2599210498948732d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        double double1 = org.apache.commons.math.util.FastMath.acos(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.553863346113918d + "'", double1 == 11.553863346113918d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        double double1 = org.apache.commons.math.util.FastMath.acos(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.48854405300441117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double double1 = org.apache.commons.math.util.FastMath.log10(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7581226324091723d + "'", double1 == 3.7581226324091723d);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0000000041223074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023023993376d + "'", double1 == 0.5403023023993376d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0986122886681098d + "'", double1 == 1.0986122886681098d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8657694832396586d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double double1 = org.apache.commons.math.util.FastMath.log(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5293379817722998d + "'", double1 == 1.5293379817722998d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000142d + "'", double1 == 1.0000000000000142d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        long long1 = org.apache.commons.math.util.FastMath.round((double) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.24331311680122622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0297469578324094d + "'", double1 == 1.0297469578324094d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double double1 = org.apache.commons.math.util.FastMath.rint(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(99.99999999999999d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999997d + "'", double2 == 99.99999999999997d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4274266235030733d + "'", double1 == 1.4274266235030733d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double double1 = org.apache.commons.math.util.FastMath.asin(99.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625951d + "'", double1 == 0.9999092042625951d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        double double1 = org.apache.commons.math.util.FastMath.log10(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double double2 = org.apache.commons.math.util.FastMath.max(12.610439577969121d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.610439577969121d + "'", double2 == 12.610439577969121d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.1535902666964596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15481538423886812d + "'", double1 == 0.15481538423886812d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) 1, 99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double2 = org.apache.commons.math.util.FastMath.max(0.770170914020331d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4274266235030735d + "'", double1 == 1.4274266235030735d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1189396031849523d + "'", double1 == 1.1189396031849523d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0590011172720796d) + "'", double1 == (-0.0590011172720796d));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0601505205018036d + "'", double1 == 1.0601505205018036d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5403023023993376d, 3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5403023023993377d + "'", double2 == 0.5403023023993377d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        double double1 = org.apache.commons.math.util.FastMath.tanh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        double double2 = org.apache.commons.math.util.FastMath.min(4.158638853279167d, 1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948948d + "'", double2 == 1.5707963267948948d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 564.2979850674102d + "'", double1 == 564.2979850674102d);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.123919126120245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707055269350272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985974466559E-5d + "'", double1 == 9.079985974466559E-5d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.428182669496151d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2754679320391344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        double double1 = org.apache.commons.math.util.FastMath.cosh(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481480091340625E13d + "'", double1 == 3.9481480091340625E13d);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2754679320391344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9567066132883968d + "'", double1 == 0.9567066132883968d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950371902099892d + "'", double1 == 0.9950371902099892d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2240401467946809d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12179813610068427d + "'", double2 == 0.12179813610068427d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (byte) 0, (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28366218546322625d + "'", double1 == 0.28366218546322625d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) ' ', (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3554432E7d + "'", double2 == 3.3554432E7d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.049875621120893d + "'", double1 == 20.049875621120893d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9999999999999999d), 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999997d) + "'", double2 == (-0.9999999999999997d));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.42706130231652d + "'", double1 == 89.42706130231652d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6782858550610652d + "'", double1 == 0.6782858550610652d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7595020127952743d + "'", double1 == 0.7595020127952743d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 3L, 3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int int1 = org.apache.commons.math.util.FastMath.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8486007400083447d + "'", double1 == 0.8486007400083447d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.50495049504956d + "'", double1 == 50.50495049504956d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        double double2 = org.apache.commons.math.util.FastMath.max(2.0d, 0.7216329479064553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.970291913552122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.61512051684126d, (-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.615120516841259d + "'", double2 == 4.615120516841259d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.28366218546322625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3279842425886166d + "'", double1 == 1.3279842425886166d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9830700822184464d + "'", double1 == 2.9830700822184464d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09711515743188391d) + "'", double1 == (-0.09711515743188391d));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6105647004975028d + "'", double1 == 0.6105647004975028d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.642227864217147d) + "'", double1 == (-0.642227864217147d));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        double double1 = org.apache.commons.math.util.FastMath.atanh(12.610439577969121d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        double double2 = org.apache.commons.math.util.FastMath.max(0.17453292519943295d, (-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17453292519943295d + "'", double2 == 0.17453292519943295d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        double double1 = org.apache.commons.math.util.FastMath.tan(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14782604738794858d + "'", double1 == 0.14782604738794858d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.00000000000001d + "'", double1 == 35.00000000000001d);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.24091947210469064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0291617385510083d + "'", double1 == 1.0291617385510083d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int1 = org.apache.commons.math.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        double double1 = org.apache.commons.math.util.FastMath.log(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.555348061489414d + "'", double1 == 3.555348061489414d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.07277226732562546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07258194039108286d + "'", double1 == 0.07258194039108286d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        double double1 = org.apache.commons.math.util.FastMath.log(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.66161881444429d + "'", double1 == 1.66161881444429d);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        double double1 = org.apache.commons.math.util.FastMath.asinh(564.2979850674102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.028730419947965d + "'", double1 == 7.028730419947965d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3279842425886166d, 0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14782604738794858d + "'", double2 == 0.14782604738794858d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5315194283752256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7015156767002263d + "'", double1 == 0.7015156767002263d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998000199980002d + "'", double1 == 0.9998000199980002d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.555348061489414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40205067186377547d) + "'", double1 == (-0.40205067186377547d));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1675576188544794d + "'", double1 == 1.1675576188544794d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99484522385717d + "'", double1 == 96.99484522385717d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.07264407634054174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2233932393493425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8464654362980488d + "'", double1 == 1.8464654362980488d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        double double1 = org.apache.commons.math.util.FastMath.log(89.42706130231652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.493423335506387d + "'", double1 == 4.493423335506387d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.1906899454435431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1906899454435431d + "'", double2 == 1.1906899454435431d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2240401467946809d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}
