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
// flaky:         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2679335201181924d + "'", double0 == 0.2679335201181924d);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2679335201181924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3072602306204815d + "'", double1 == 1.3072602306204815d);
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
        double double1 = org.apache.commons.math.util.FastMath.log(1.3072602306204815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2679335201181924d + "'", double1 == 0.2679335201181924d);
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
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-1), (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        double double1 = org.apache.commons.math.util.FastMath.sinh(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703413d + "'", double1 == 11013.232874703413d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
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
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
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
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) '4', 1.3072602306204815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5456620010518718d + "'", double2 == 1.5456620010518718d);
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
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2679335201181924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30726023062048147d + "'", double1 == 0.30726023062048147d);
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
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.30726023062048147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30726023062048147d + "'", double1 == 0.30726023062048147d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int1 = org.apache.commons.math.util.FastMath.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124437d + "'", double1 == 0.8745129512124437d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double double1 = org.apache.commons.math.util.FastMath.tanh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 1, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09966865249116202d + "'", double2 == 0.09966865249116202d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        double double0 = org.apache.commons.math.util.FastMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9867717342662448d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9867717342662448d + "'", double2 == 1.9867717342662448d);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5456620010518718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5456620010518718d + "'", double1 == 1.5456620010518718d);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        float float1 = org.apache.commons.math.util.FastMath.abs(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (byte) 100, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.17453292519943295d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.729577951308232d + "'", double2 == 5.729577951308232d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double double2 = org.apache.commons.math.util.FastMath.atan2(Double.NEGATIVE_INFINITY, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3072602306204815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3072602306204817d + "'", double1 == 1.3072602306204817d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        double double1 = org.apache.commons.math.util.FastMath.log(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6094379124341003d + "'", double1 == 1.6094379124341003d);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double double1 = org.apache.commons.math.util.FastMath.log10(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        double double0 = org.apache.commons.math.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948963d) + "'", double1 == (-1.5707963267948963d));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double double1 = org.apache.commons.math.util.FastMath.expm1(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161737E43d + "'", double1 == 2.6881171418161737E43d);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        double double1 = org.apache.commons.math.util.FastMath.expm1(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3072602306204815d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        float float1 = org.apache.commons.math.util.FastMath.abs((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int int1 = org.apache.commons.math.util.FastMath.round(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6094379124341003d, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5716315636979223d + "'", double2 == 0.5716315636979223d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 1, 1.3072602306204817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5900247258946039d, 0.30726023062048147d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1531436238758581d + "'", double2 == 1.1531436238758581d);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473389d + "'", double1 == 4.041914822473389d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        long long1 = org.apache.commons.math.util.FastMath.round(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 35L, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        double double1 = org.apache.commons.math.util.FastMath.acosh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double double2 = org.apache.commons.math.util.FastMath.max(100.00000000000001d, 11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703413d + "'", double2 == 11013.232874703413d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int1 = org.apache.commons.math.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999999958776927d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078965d + "'", double1 == 0.8414709848078965d);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.6881171418161737E43d, 2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.688117141816173E43d + "'", double2 == 2.688117141816173E43d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double double1 = org.apache.commons.math.util.FastMath.signum(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.476411608537198d + "'", double1 == 28.476411608537198d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5999999999999996d + "'", double1 == 2.5999999999999996d);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3072602306204815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6960335481567532d + "'", double1 == 2.6960335481567532d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.148283155648077d + "'", double1 == 2.148283155648077d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.6960335481567532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.820828880418915d + "'", double1 == 13.820828880418915d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3964729204944982d + "'", double1 == 0.3964729204944982d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.709975946676697d + "'", double1 == 1.709975946676697d);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17364817766693033d + "'", double1 == 0.17364817766693033d);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 35.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (short) 10, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000000000002d + "'", double2 == 10.000000000000002d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3686469200204923d + "'", double1 == 2.3686469200204923d);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        double double1 = org.apache.commons.math.util.FastMath.asinh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3574158419544757d + "'", double1 == 1.3574158419544757d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078965d + "'", double1 == 0.8414709848078965d);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862269254527579d + "'", double1 == 0.8862269254527579d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        double double1 = org.apache.commons.math.util.FastMath.signum(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6094379124341003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 231.58466047909457d + "'", double1 == 231.58466047909457d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double1 = org.apache.commons.math.util.FastMath.asin(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3769270190230555d + "'", double1 == 0.3769270190230555d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703415d + "'", double1 == 11013.232874703415d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3686469200204927d + "'", double1 == 2.3686469200204927d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        double double1 = org.apache.commons.math.util.FastMath.ceil(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7658461948190802d + "'", double1 == 0.7658461948190802d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11013.232874703415d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708871266543591d + "'", double2 == 1.5708871266543591d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 35.0f, 2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.99999999999999d + "'", double2 == 34.99999999999999d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2679335201181924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5176229516918588d + "'", double1 == 0.5176229516918588d);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) 10, 0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.381919166334245d + "'", double2 == 2.381919166334245d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8402785435782614d + "'", double1 == 1.8402785435782614d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.298292365610485d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.298292365610485d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6982469888270821d + "'", double1 == 0.6982469888270821d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9508218731216449d + "'", double1 == 0.9508218731216449d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.4764116085372d + "'", double1 == 28.4764116085372d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.9251475365964139d), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) -1, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double double2 = org.apache.commons.math.util.FastMath.max(2.148283155648077d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int1 = org.apache.commons.math.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double double1 = org.apache.commons.math.util.FastMath.ceil(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6177859350239399d + "'", double1 == 1.6177859350239399d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.0d, 1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999999999999998d + "'", double2 == 1.9999999999999998d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.691649480399158E41d + "'", double1 == 4.691649480399158E41d);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6499429567608755d + "'", double1 == 0.6499429567608755d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03490658503988659d + "'", double1 == 0.03490658503988659d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double double1 = org.apache.commons.math.util.FastMath.signum(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40767170372406053d + "'", double1 == 0.40767170372406053d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5456620010518718d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5456620010518716d + "'", double2 == 1.5456620010518716d);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.30726023062048147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9531657848854143d + "'", double1 == 0.9531657848854143d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943245d + "'", double1 == 4.644483341943245d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        double double1 = org.apache.commons.math.util.FastMath.cos(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3574158419544757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.729577951308232d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05723320573453925d + "'", double2 == 0.05723320573453925d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9999999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
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
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9508218731216449d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
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
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05723320573453925d + "'", double1 == 0.05723320573453925d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 35);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9754001961551926d) + "'", double1 == (-0.9754001961551926d));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8813735870195429d), 0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8554182836643194d) + "'", double2 == (-0.8554182836643194d));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        double double2 = org.apache.commons.math.util.FastMath.max(4.644483341943245d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3092866533194534d + "'", double1 == 1.3092866533194534d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        double double2 = org.apache.commons.math.util.FastMath.max(11014.0d, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11014.0d + "'", double2 == 11014.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.3686469200204927d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.232874703415d, 1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5900247258946039d + "'", double2 == 1.5900247258946039d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3887317335324652d + "'", double1 == 1.3887317335324652d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        double double1 = org.apache.commons.math.util.FastMath.floor(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
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
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134298E15d + "'", double1 == 1.5860134523134298E15d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        double double1 = org.apache.commons.math.util.FastMath.atanh(28.4764116085372d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885893d + "'", double1 == 3.2710663101885893d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9531657848854143d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
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
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) -1, 4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
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
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 35.0f, 57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950371902099892d + "'", double1 == 0.09950371902099892d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1833.4649444186343d, 0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707651109236087d + "'", double2 == 1.5707651109236087d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3072602306204817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3072602306204817d + "'", double1 == 1.3072602306204817d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2583723393689585d + "'", double1 == 1.2583723393689585d);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2146848510894035E-8d + "'", double1 == 4.2146848510894035E-8d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 35L, 1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1224.999999999999d + "'", double2 == 1224.999999999999d);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.381919166334245d + "'", double1 == 2.381919166334245d);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) -1, 11013.232874703393d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6296609567811063d + "'", double1 == 0.6296609567811063d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int int1 = org.apache.commons.math.util.FastMath.round((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1531436238758581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06188340198003397d + "'", double1 == 0.06188340198003397d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8849970445005177d + "'", double1 == 0.8849970445005177d);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7212254887267799d + "'", double1 == 0.7212254887267799d);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        long long1 = org.apache.commons.math.util.FastMath.abs(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.6960335481567532d, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0305000985748444E41d + "'", double2 == 6.0305000985748444E41d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.634578497998064d + "'", double1 == 0.634578497998064d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 97.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        double double1 = org.apache.commons.math.util.FastMath.atan(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        double double1 = org.apache.commons.math.util.FastMath.acosh(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1531436238758581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000003d + "'", double1 == 100.00000000000003d);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2130532941206642d) + "'", double1 == (-1.2130532941206642d));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30102999566398114d + "'", double1 == 0.30102999566398114d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5456620010518718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0021933711408297d + "'", double1 == 1.0021933711408297d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1531436238758581d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3297402172855466d + "'", double2 == 1.3297402172855466d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        double double1 = org.apache.commons.math.util.FastMath.signum(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.5707963267948963d), 231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948963d) + "'", double2 == (-1.5707963267948963d));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672744d + "'", double1 == 0.9171523356672744d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3072602306204815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1433548139665488d + "'", double1 == 1.1433548139665488d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.3686469200204927d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1563686078816606d + "'", double2 == 2.1563686078816606d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        double double1 = org.apache.commons.math.util.FastMath.log(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7507239941348802d) + "'", double1 == (-1.7507239941348802d));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.32681535598557454d + "'", double1 == 0.32681535598557454d);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        long long1 = org.apache.commons.math.util.FastMath.round(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.307013259236443d + "'", double1 == 9.307013259236443d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        double double1 = org.apache.commons.math.util.FastMath.acos(57.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3246090892520057d + "'", double1 == 1.3246090892520057d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.752220392306203d + "'", double1 == 2.752220392306203d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        float float1 = org.apache.commons.math.util.FastMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1215871282840145E-5d + "'", double1 == 3.1215871282840145E-5d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        double double1 = org.apache.commons.math.util.FastMath.log(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3490760817142498d + "'", double1 == 3.3490760817142498d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        long long1 = org.apache.commons.math.util.FastMath.round(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double double1 = org.apache.commons.math.util.FastMath.cosh(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.883259400089535E100d + "'", double1 == 1.883259400089535E100d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5456620010518716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7601945740163978d + "'", double1 == 0.7601945740163978d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.930067261567154E14d, 1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567155E14d + "'", double2 == 7.930067261567155E14d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.3490760817142498d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899276870949834d + "'", double1 == 14.899276870949834d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        double double2 = org.apache.commons.math.util.FastMath.max(100.00000000000001d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000001d + "'", double2 == 100.00000000000001d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4711276743037347d, 1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000007d + "'", double2 == 1.0000000000000007d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000002d + "'", double1 == 1.0000000000000002d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5127742681331149d + "'", double1 == 0.5127742681331149d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3297402172855466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (-1.0f), 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001254E-16d + "'", double1 == 8.881784197001254E-16d);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double double1 = org.apache.commons.math.util.FastMath.atan(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.9439511105971d + "'", double1 == 104.9439511105971d);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        double double1 = org.apache.commons.math.util.FastMath.ceil(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6105647004975028d + "'", double1 == 0.6105647004975028d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.99822295029797d, 1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9982229502979694d + "'", double2 == 2.9982229502979694d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5607966601082315d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5607966601082315d + "'", double2 == 1.5607966601082315d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        double double1 = org.apache.commons.math.util.FastMath.log(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.04365338911715d) + "'", double1 == (-36.04365338911715d));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        double double1 = org.apache.commons.math.util.FastMath.cosh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6890624663225461d + "'", double1 == 0.6890624663225461d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9830787956514044d + "'", double1 == 0.9830787956514044d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double double2 = org.apache.commons.math.util.FastMath.atan2(13.820828880418915d, 1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4451787324341034d + "'", double2 == 1.4451787324341034d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.2679335201181924d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.26793352011819244d + "'", double2 == 0.26793352011819244d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.6960335481567532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9023698529915597d) + "'", double1 == (-0.9023698529915597d));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 32, 104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.044524487391685E157d + "'", double2 == 9.044524487391685E157d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20787957635076193d + "'", double1 == 0.20787957635076193d);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.041914822473389d, 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308232d + "'", double1 == 572.9577951308232d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171473774587547d + "'", double1 == 0.9171473774587547d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4576692332118569d + "'", double1 == 0.4576692332118569d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3156563365585749d + "'", double1 == 0.3156563365585749d);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) -1, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int1 = org.apache.commons.math.util.FastMath.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        double double1 = org.apache.commons.math.util.FastMath.cosh(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477895.5237245467d + "'", double1 == 1477895.5237245467d);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 3L, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8554182836643194d), 2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8554182836643193d) + "'", double2 == (-0.8554182836643193d));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000018d + "'", double1 == 1.0000000000000018d);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.817884356931778d + "'", double1 == 1.817884356931778d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8713868162390155d + "'", double1 == 0.8713868162390155d);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double double1 = org.apache.commons.math.util.FastMath.log1p(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        double double1 = org.apache.commons.math.util.FastMath.ceil(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9023698529915597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5943927097962464d) + "'", double1 == (-0.5943927097962464d));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.0305000985748444E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0305000985748444E41d + "'", double1 == 6.0305000985748444E41d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3023186765274486d + "'", double1 == 1.3023186765274486d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int1 = org.apache.commons.math.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        double double2 = org.apache.commons.math.util.FastMath.max(3.141592653589793d, 0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4593566380802732d + "'", double1 == 1.4593566380802732d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43087067877290786d) + "'", double1 == (-0.43087067877290786d));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292519943295d) + "'", double1 == (-0.017453292519943295d));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        double double1 = org.apache.commons.math.util.FastMath.log(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306831672164943d + "'", double1 == 9.306831672164943d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3235780930645504d + "'", double1 == 1.3235780930645504d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.43087067877290786d), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43087067877290786d) + "'", double2 == (-0.43087067877290786d));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09933992780358329d + "'", double1 == 0.09933992780358329d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.45884779991685d + "'", double1 == 28.45884779991685d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        double double1 = org.apache.commons.math.util.FastMath.cosh(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.399216241149525E248d + "'", double1 == 3.399216241149525E248d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6099169425432279d + "'", double1 == 0.6099169425432279d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000002d + "'", double2 == 1.0000000000000002d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }
}
