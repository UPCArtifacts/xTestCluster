import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        double double1 = org.apache.commons.math3.util.FastMath.cos(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065122d + "'", double1 == 0.8342233605065122d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 35L, 0.5990250723553024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.99999999999999d + "'", double2 == 34.99999999999999d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.9673559108511897E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4247561530446469d + "'", double1 == 1.4247561530446469d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0000380832193412d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.18710109962234833d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0175545319252317d + "'", double1 == 1.0175545319252317d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-1.4212655272004053d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9888410855273345d) + "'", double1 == (-0.9888410855273345d));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        double double1 = org.apache.commons.math3.util.FastMath.tan(586708.782213963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7542142871583881d + "'", double1 == 0.7542142871583881d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-20), 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-40.0f) + "'", float2 == (-40.0f));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.830189170012751E-6d + "'", double1 == 6.830189170012751E-6d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.2981479726743438d), (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3427390986374435E15d) + "'", double2 == (-1.3427390986374435E15d));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.4247561530446469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        double double2 = org.apache.commons.math3.util.FastMath.min(5557.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.0f), (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5035996E15f) + "'", float2 == (-4.5035996E15f));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 35.00000762939454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.779595846079306d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-127), (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.302585131141017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 13, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.024595958627920467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15683098746077087d + "'", double1 == 0.15683098746077087d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.19611987703015257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3733969509475266d + "'", double1 == 1.3733969509475266d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double double2 = org.apache.commons.math3.util.FastMath.min(37648.554832912145d, (-0.025974927644697554d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.025974927644697554d) + "'", double2 == (-0.025974927644697554d));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.52117991493046E-39d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9280538062512562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) '#', 49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        double double1 = org.apache.commons.math3.util.FastMath.atan(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.718281828459045d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459045d + "'", double2 == 2.718281828459045d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.3733969509475266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8477481924511037d + "'", double1 == 1.8477481924511037d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.8813616205677708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49205974021214605d + "'", double1 == 0.49205974021214605d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.03109752538365459d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031092515388382688d) + "'", double1 == (-0.031092515388382688d));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        float float2 = org.apache.commons.math3.util.FastMath.max(97.00001f, 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.00001f + "'", float2 == 97.00001f);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 32768);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32768L + "'", long1 == 32768L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.60497014597542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5271361867276063d + "'", double1 == 1.5271361867276063d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.09275324764611881d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        int int1 = org.apache.commons.math3.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(21.164088169838596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.600444344825681d + "'", double1 == 4.600444344825681d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 35, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(Double.NEGATIVE_INFINITY, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        double double1 = org.apache.commons.math3.util.FastMath.exp(586708.782213963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.53313149942335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9689257325599362d + "'", double1 == 0.9689257325599362d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 5.421011E-20f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.570796446004186d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int1 = org.apache.commons.math3.util.FastMath.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.123233995736766E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        float float2 = org.apache.commons.math3.util.FastMath.max(4096.0005f, 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4359738E10f + "'", float2 == 3.4359738E10f);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(3.4359738E10f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.43597363E10f + "'", float2 == 3.43597363E10f);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int2 = org.apache.commons.math3.util.FastMath.max(2, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342244122679194d + "'", double1 == 0.8342244122679194d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, (long) (-3));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.814697265625E-6d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.9867717342662448d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.972630067242408d) + "'", double1 == (-0.972630067242408d));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        long long2 = org.apache.commons.math3.util.FastMath.max(52L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.00961449578338d + "'", double1 == 103.00961449578338d);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-3));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5364211615694945d) + "'", double1 == (-1.5364211615694945d));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5703319211292674d + "'", double1 == 1.5703319211292674d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.49205974021214605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7091551466656096d) + "'", double1 == (-0.7091551466656096d));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(57.336116942011905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.742001862925077d + "'", double1 == 4.742001862925077d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(97.00000000000001d, 0.4152103671875394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1592259218842048d) + "'", double2 == (-0.1592259218842048d));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        float float1 = org.apache.commons.math3.util.FastMath.signum(35.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3092866533194534d + "'", double1 == 1.3092866533194534d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-2.003564344806379d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        double double1 = org.apache.commons.math3.util.FastMath.asin(90.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(32.69314718055995d, (-23));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.897326848573678E-6d + "'", double2 == 3.897326848573678E-6d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32768.0d + "'", double1 == 32768.0d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        long long2 = org.apache.commons.math3.util.FastMath.max(1L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(32.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 35L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.577951308234d + "'", double1 == 5729.577951308234d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279167d + "'", double1 == 4.158638853279167d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(41.90316148102299d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 167.61264592409196d + "'", double2 == 167.61264592409196d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.6482076576793505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9738830555738022d + "'", double1 == 0.9738830555738022d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.4210855E-14f, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.1054274E-15f + "'", float2 == 7.1054274E-15f);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 97, 0.7852981633977816d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00317877887011d + "'", double2 == 97.00317877887011d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(32768.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-127.0f), 2.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.99999f) + "'", float2 == (-126.99999f));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-7), 3.296908309475615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737545114640002d + "'", double2 == 7.737545114640002d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.697450486273865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6090128311061331d + "'", double1 == 0.6090128311061331d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.0174532946005379d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.6912431464778742d), 0.9689257325599362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.619670639138117d) + "'", double2 == (-0.619670639138117d));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.04669075745245177d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (short) 10, 10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.536049848239342d + "'", double2 == 10.536049848239342d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5557.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.712510971300215d + "'", double1 == 17.712510971300215d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.0533959519657112d, 0.6931471805599463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0533959519657112d + "'", double2 == 3.0533959519657112d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3831970825634745d + "'", double1 == 1.3831970825634745d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7407750251209115d + "'", double1 == 0.7407750251209115d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.251799813685248E15d, 10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.536049848239342d + "'", double2 == 10.536049848239342d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 13.0f, 9.313225746154783E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.0d + "'", double2 == 13.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(52.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000008f + "'", float1 == 52.000008f);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.54213262037718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 692.7645379031695d + "'", double1 == 692.7645379031695d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.896280957292919E13d, (double) 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896280957292919E13d + "'", double2 == 7.896280957292919E13d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.744894366675417d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.570796326793987d, 12.082762530298217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 234.24476918014662d + "'", double2 == 234.24476918014662d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920928955078125E-7d, (double) 9.536744E-7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078128E-7d + "'", double2 == 1.1920928955078128E-7d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6032287479334557d) + "'", double1 == (-3.6032287479334557d));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.0d, 1.1920928955078097E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double double1 = org.apache.commons.math3.util.FastMath.cos(9.587379894910212E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999954041073d + "'", double1 == 0.9999999954041073d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.951243865300542d + "'", double1 == 3.951243865300542d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.8146973E-6f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        double double1 = org.apache.commons.math3.util.FastMath.log(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1023), (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.0017395461469968258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017395479016332227d + "'", double1 == 0.0017395479016332227d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        long long2 = org.apache.commons.math3.util.FastMath.max(6L, 4609435868686548992L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4609435868686548992L + "'", long2 == 4609435868686548992L);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.6931471805599453d, 0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8987804897672533d + "'", double2 == 0.8987804897672533d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.734723475976807E-18d, 5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.734723475976807E-18d + "'", double2 == 1.734723475976807E-18d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double double1 = org.apache.commons.math3.util.FastMath.sin(37648.554832912145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.28741580761930413d) + "'", double1 == (-0.28741580761930413d));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 96.99999f, (-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999237060547d + "'", double2 == 96.99999237060547d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(52.000004f, 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.34187198E17f + "'", float2 == 2.34187198E17f);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(6.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0000005f + "'", float1 == 6.0000005f);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 3, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03703703703703703d + "'", double2 == 0.03703703703703703d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5707963267948966d, 3.3800863156250025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948968d + "'", double2 == 1.5707963267948968d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.429369702178807E-8d + "'", double1 == 8.429369702178807E-8d);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064928217585d + "'", double1 == 0.017455064928217585d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.9913014866745806d, 0.49205974021214605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9913014866745806d + "'", double2 == 2.9913014866745806d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0f, (double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(6.123233995736766E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.8477481924511037d, 35.01428280342778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05272236634611254d + "'", double2 == 0.05272236634611254d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 2.9913014866745806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.744894366675417d, 1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.957135859585879d + "'", double2 == 7.957135859585879d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.8146899896858897E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146899896673862E-6d + "'", double1 == 3.8146899896673862E-6d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009430054193516519d + "'", double1 == 0.009430054193516519d);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 2, 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.010299956639812d + "'", double1 == 3.010299956639812d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0175545319252317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5639495664692888d + "'", double1 == 1.5639495664692888d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.369491427691419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9417844128659681d) + "'", double1 == (-0.9417844128659681d));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        float float2 = org.apache.commons.math3.util.FastMath.max(4096.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-3), (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(214.56664193281875d, 0.3558508871372632d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011443010950958454d) + "'", double2 == (-0.011443010950958454d));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(10.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000002f + "'", float1 == 10.000002f);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.45174640302101d) + "'", double1 == (-4.45174640302101d));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 201.71315737027922d + "'", double1 == 201.71315737027922d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.742001862925077d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0272356433040997d, (-1023));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.49205974021214605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021443E41d + "'", double1 == 6.691673596021443E41d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(21.164088169838596d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35840.0f + "'", float2 == 35840.0f);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(97.00317877887011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2678643598200185d + "'", double1 == 5.2678643598200185d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(10240.0f, (double) (-35.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10239.999f + "'", float2 == 10239.999f);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.58037251265019648E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5803725126501968E17d + "'", double1 == 2.5803725126501968E17d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(6.102016471589291E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.2981479726743438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 4096L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(97.00001f, (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.1661186E11f + "'", float2 == 4.1661186E11f);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1023.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1023.0d) + "'", double1 == (-1023.0d));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.2676505E30f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2676505E30f) + "'", float2 == (-1.2676505E30f));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-2025.4348094013415d), (-58.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2025.4348094013412d) + "'", double2 == (-2025.4348094013412d));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6207.9995f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.01745355584320953d, 0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065102d + "'", double2 == 0.8342233605065102d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.154434690031884d, 10.536049848239344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.754065986323363d + "'", double2 == 10.754065986323363d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.0f + "'", float1 == 6.0f);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05709087716385304d + "'", double1 == 0.05709087716385304d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        double double2 = org.apache.commons.math3.util.FastMath.pow(223.47899536523738d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.107184941633452E23d + "'", double2 == 3.107184941633452E23d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.57204013738644d + "'", double1 == 198.57204013738644d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-1.5364211615694945d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4315380019946446d + "'", double1 == 2.4315380019946446d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 48.499992f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.071208929787076d + "'", double1 == 5.071208929787076d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 343.77467707849394d + "'", double1 == 343.77467707849394d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        long long2 = org.apache.commons.math3.util.FastMath.max(32768L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32768L + "'", long2 == 32768L);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0000001192092896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853982230020895d + "'", double1 == 0.7853982230020895d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 10, 10240.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.6499783639526059d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7601702599438814d + "'", double1 == 0.7601702599438814d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.742001862925077d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        double double1 = org.apache.commons.math3.util.FastMath.cos(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.4315380019946446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8596236973023724d) + "'", double1 == (-0.8596236973023724d));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1624473515096265d, 57.336116942011905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.336116942011905d + "'", double2 == 57.336116942011905d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.4643056300239326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4643056300239326d + "'", double1 == 0.4643056300239326d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.1920928955078128E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078071E-7d + "'", double1 == 1.1920928955078071E-7d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(403.4287934927351d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 403.4287934927351d + "'", double2 == 403.4287934927351d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9689257325599362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9689257325599363d + "'", double1 == 0.9689257325599363d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        double double1 = org.apache.commons.math3.util.FastMath.sin(48.499996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9811077006099485d) + "'", double1 == (-0.9811077006099485d));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.1920928955078071E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        int int2 = org.apache.commons.math3.util.FastMath.min(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.7111977130787057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6618159595855729d + "'", double1 == 0.6618159595855729d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        long long2 = org.apache.commons.math3.util.FastMath.max(2L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.04669075745245177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04672471609974032d) + "'", double1 == (-0.04672471609974032d));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.8477481924511037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6139677044391678d + "'", double1 == 0.6139677044391678d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.8146899896673862E-6d, 35.01428280342778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.877940322113382E-190d + "'", double2 == 1.877940322113382E-190d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.7542142871583881d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.560801938170369E29d + "'", double2 == 9.560801938170369E29d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-1.1920928955078097E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004921566601151844d) + "'", double1 == (-0.004921566601151844d));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3580.4237429416758d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(6.324555320336759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8493111942973237d + "'", double1 == 1.8493111942973237d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.0017395479016332227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.354130026164064d) + "'", double1 == (-6.354130026164064d));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.0d, 0.8342244122679194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.086065389836995d + "'", double2 == 4.086065389836995d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.791759469228055d, 4.041914989933878d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.791759469228055d + "'", double2 == 1.791759469228055d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.6090128311061331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6090128311061332d + "'", double1 == 0.6090128311061332d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.02460092029573991d, 1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024600920295739914d + "'", double2 == 0.024600920295739914d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2153.28968210235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2153.0d + "'", double1 == 2153.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9185375499501867d + "'", double1 == 0.9185375499501867d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.192093E-7f + "'", float1 == 1.192093E-7f);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.4E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2), (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000001f + "'", float1 == 10.000001f);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.477888730288475d + "'", double1 == 2.477888730288475d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.421011E-20f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64) + "'", int1 == (-64));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1568553487765425E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1568553487765425E21d + "'", double1 == 1.1568553487765425E21d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.536744E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.4657359027997265d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 2.3841858E-7f, 1.059306170823243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.384185791015625E-7d + "'", double2 == 2.384185791015625E-7d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-2), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.295779513082316d) + "'", double1 == (-57.295779513082316d));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 100L, 0.99999994f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.99999994f + "'", float2 == 0.99999994f);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 10239.999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(97.0d, 1.0007040209466105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06829003182121696d) + "'", double2 == (-0.06829003182121696d));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(101.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547474050965727E-13d + "'", double1 == 4.547474050965727E-13d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) '#', 3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 308815.6692812608d + "'", double2 == 308815.6692812608d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 4609435868686548992L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.5033290854469099d, (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 918246.8633045758d + "'", double2 == 918246.8633045758d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.4191249916881351d, (double) 0.00390625f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9966089419888077d + "'", double2 == 0.9966089419888077d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.34187198E17f, 4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.34187198E17f + "'", float2 == 2.34187198E17f);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 3.4359738E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4359738368E10d + "'", double1 == 3.4359738368E10d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-103.27892990343184d) + "'", double1 == (-103.27892990343184d));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.970291985527539d + "'", double1 == 3.970291985527539d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-24.191690961245197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5889395478952119d + "'", double1 == 0.5889395478952119d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        double double1 = org.apache.commons.math3.util.FastMath.exp(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.48005689602103446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5786.873730821315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(6207.9995f, 3.6653951063773365E148d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6208.0f + "'", float2 == 6208.0f);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2025.4348094013415d), 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.347360138671482E115d) + "'", double2 == (-5.347360138671482E115d));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 221206.6960055904d + "'", double1 == 221206.6960055904d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-0.99999994f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.785398133595125d) + "'", double1 == (-0.785398133595125d));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.0000380832193412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.6610060414837631d, 342.7746770784939d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 342.7746770784939d + "'", double2 == 342.7746770784939d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.863451288869854d + "'", double1 == 17.863451288869854d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5639495664692888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.160755939707012d + "'", double1 == 1.160755939707012d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double double1 = org.apache.commons.math3.util.FastMath.signum(3.744894366675417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741297982545108d + "'", double1 == 4.741297982545108d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-4.375d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.726213847251884d + "'", double1 == 39.726213847251884d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(6400.000019456874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.00000012160547d + "'", double1 == 80.00000012160547d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.231911890816295d + "'", double1 == 2.231911890816295d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        float float2 = org.apache.commons.math3.util.FastMath.max(4096.0005f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0005f + "'", float2 == 4096.0005f);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(102400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.536651757164861d + "'", double1 == 11.536651757164861d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1.0f, (double) 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.105427357601002E-15d + "'", double2 == 7.105427357601002E-15d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.4735319749387725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1920928244535474E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928244535417E-7d + "'", double1 == 1.1920928244535417E-7d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        int int2 = org.apache.commons.math3.util.FastMath.min((-64), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-64) + "'", int2 == (-64));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        double double2 = org.apache.commons.math3.util.FastMath.pow(32.69314718055995d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.1411200080598672d, 1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928955078125E-7d + "'", double2 == 1.1920928955078125E-7d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        double double1 = org.apache.commons.math3.util.FastMath.log10(7.737545114640002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8886031942391064d + "'", double1 == 0.8886031942391064d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-2.9999998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.15683098746077087d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15156283651453492d + "'", double1 == 0.15156283651453492d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        long long1 = org.apache.commons.math3.util.FastMath.round(1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 4096);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0005f + "'", float1 == 4096.0005f);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.175201377593356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.9913014866745806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0957085725200884d + "'", double1 == 1.0957085725200884d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int1 = org.apache.commons.math3.util.FastMath.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.570796446004186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1961199099891899d + "'", double1 == 0.1961199099891899d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-3.6268604078470186d), (double) 4609435868686548992L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.8683390140765455E-19d) + "'", double2 == (-7.8683390140765455E-19d));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9689257325599362d, 1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9689257325599362d + "'", double2 == 0.9689257325599362d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744345d + "'", double1 == 1.6929693744345d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.272221872585407E-14d + "'", double1 == 1.272221872585407E-14d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920928244535417E-7d, 6.654320150674205E33d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1920928244535418E-7d + "'", double2 == 1.1920928244535418E-7d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.8202965860187448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8202965860187449d + "'", double1 == 0.8202965860187449d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.2449186904183345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6256632450775597d) + "'", double1 == (-0.6256632450775597d));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992781084116672d + "'", double1 == 0.9992781084116672d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(74.54992027339121d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.6653951063773365E148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6653951063773365E148d + "'", double1 == 3.6653951063773365E148d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36651292058166435d) + "'", double1 == (-0.36651292058166435d));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-1.0000001192092896d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2153.28968210235d, (double) 6.0000005f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2153.2980413900355d + "'", double2 == 2153.2980413900355d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.17540341900446973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192093037616354E-7d + "'", double1 == 1.192093037616354E-7d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 5729.577951308234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.577951308234d + "'", double2 == 5729.577951308234d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.48005689602103446d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(23.0f, (float) 32768);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        double double1 = org.apache.commons.math3.util.FastMath.sin(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7790360334325874d + "'", double1 == 0.7790360334325874d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.43368382029253E62d, (double) 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.43368382029253E62d + "'", double2 == 3.43368382029253E62d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        int int2 = org.apache.commons.math3.util.FastMath.max((-7), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 262.6992857325621d + "'", double1 == 262.6992857325621d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9185375499501867d, 342.7746908347008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2415914299460307E-13d + "'", double2 == 2.2415914299460307E-13d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-35.0f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-35L) + "'", long1 == (-35L));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.4103302129827671d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.33656885961385924d) + "'", double1 == (-0.33656885961385924d));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-5.418539921951662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 10, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.3978727715165242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4202879887985945d + "'", double1 == 0.4202879887985945d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(2.3841858E-7f, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8192.0f + "'", float2 == 8192.0f);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        double double1 = org.apache.commons.math3.util.FastMath.log10(41.90316148102299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.622246790554995d + "'", double1 == 1.622246790554995d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8623188722876839d, (double) 1.4210855E-14f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876839d + "'", double2 == 0.8623188722876839d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        double double2 = org.apache.commons.math3.util.FastMath.min(57.295779513082316d, 5729.578388440339d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.295779513082316d + "'", double2 == 57.295779513082316d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(9.560801938170369E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.40737488355328E14d + "'", double1 == 1.40737488355328E14d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.2105354941985667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2105354941985667d + "'", double1 == 2.2105354941985667d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.102748784455539d + "'", double1 == 1.102748784455539d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(6.830189170012751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.830189170012752E-6d + "'", double1 == 6.830189170012752E-6d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2153.28968210235d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.951243865300542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0689622149987218d + "'", double1 == 0.0689622149987218d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9999999999999977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.60943587E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.60943614E18f + "'", float1 == 4.60943614E18f);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        double double1 = org.apache.commons.math3.util.FastMath.log(26.028944477141252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2592091679400053d + "'", double1 == 3.2592091679400053d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9589242746631385d) + "'", double1 == (-0.9589242746631385d));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.654320150674205E33d, 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.435352933112958E63d + "'", double2 == 8.435352933112958E63d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(6.6917246496340396E41d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0000001192092896d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.010200246779241787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010200069899324196d + "'", double1 == 0.010200069899324196d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.00628569302695887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006285734418917205d) + "'", double1 == (-0.006285734418917205d));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-511.5f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 511.5d + "'", double1 == 511.5d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-126.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 126.99999f + "'", float1 == 126.99999f);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.272221872585407E-14d + "'", double1 == 1.272221872585407E-14d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.986771734266245d, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.58087669728624d + "'", double2 == 15.58087669728624d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-4.5035996E15f), (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.5035996E15f + "'", float2 == 4.5035996E15f);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        double double1 = org.apache.commons.math3.util.FastMath.log10(17.863451288869854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2519653700568933d + "'", double1 == 1.2519653700568933d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(4.60943587E18f, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943587E18f + "'", float2 == 4.60943587E18f);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        double double2 = org.apache.commons.math3.util.FastMath.log(403.42879349273517d, 0.07020806430388403d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.44271534973740406d) + "'", double2 == (-0.44271534973740406d));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-35.350506208557206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.192092895507821E-7d, 217.3083407086277d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.485720850016558E-10d + "'", double2 == 5.485720850016558E-10d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.0175545319252317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.017554531925232d + "'", double1 == 1.017554531925232d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        int int2 = org.apache.commons.math3.util.FastMath.max(5, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        double double1 = org.apache.commons.math3.util.FastMath.atan(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276780806624d + "'", double1 == 1.4711276780806624d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.7675283643313486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1544346900318838d + "'", double1 == 1.1544346900318838d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.6256632450775597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.847863339403446d) + "'", double1 == (-35.847863339403446d));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.9999998f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5874010519681996d, 0.4532640331862171d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6508453542261259d + "'", double2 == 1.6508453542261259d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.05761413798165514d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.996877293214865d + "'", double2 == 58.996877293214865d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.8761242229100255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03274454486619997d + "'", double1 == 0.03274454486619997d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999237060548d + "'", double1 == 96.99999237060548d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        long long2 = org.apache.commons.math3.util.FastMath.min(1024L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.9729356641052036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(10.536049848239342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18824.27742973676d + "'", double1 == 18824.27742973676d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3802897750888419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.78899910456995d + "'", double1 == 21.78899910456995d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-3), (long) (-64));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64L) + "'", long2 == (-64L));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.296908309475615d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35.0f, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.999996f + "'", float2 == 34.999996f);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.00628569302695887d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6441739259957566d, (double) (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22498664000000534d + "'", double2 == 0.22498664000000534d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.43597384E11f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-8.042848410283348d), 0.7790360334325874d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.042848410283348d + "'", double2 == 8.042848410283348d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.141592653589793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.2981479726743438d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.006285734418917205d), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.436592044971218d) + "'", double2 == (-6.436592044971218d));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.570796326793987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1961198770299012d + "'", double1 == 0.1961198770299012d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 6.0000005f, 0.05272236634611254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0990715779031224d + "'", double2 == 1.0990715779031224d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.697450486273865d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.5774089634154596d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, 0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5707963267948968d, 1.356959696635086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948968d + "'", double2 == 1.5707963267948968d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.25398147417648104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22429382749098223d) + "'", double1 == (-0.22429382749098223d));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-35L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        float float1 = org.apache.commons.math3.util.FastMath.signum(8192.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.2519653700568933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4972095184551337d + "'", double1 == 3.4972095184551337d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(217.3083407086277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.012089888557484d + "'", double1 == 6.012089888557484d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-35.350506208557206d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-35L), (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02857142857142857d) + "'", double2 == (-0.02857142857142857d));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.03109752538365459d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        double double1 = org.apache.commons.math3.util.FastMath.asin(10.536049848239344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(126.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(9.313225746154783E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.313225746154783E-10d + "'", double1 == 9.313225746154783E-10d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1024L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.36008937454964746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3679217745530282d + "'", double1 == 0.3679217745530282d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(41.90316148102299d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.90316148102299d + "'", double2 == 41.90316148102299d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.657902725198096E-8d + "'", double1 == 6.657902725198096E-8d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.04669075745245178d, (double) 23.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04669075745245178d + "'", double2 == 0.04669075745245178d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.5803725126501968E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6332359729824427d) + "'", double1 == (-0.6332359729824427d));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.318010277546872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.998096277817887d) + "'", double1 == (-1.998096277817887d));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1023.5003663897733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5698192878854473d + "'", double1 == 1.5698192878854473d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 5, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5120.0f + "'", float2 == 5120.0f);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.986771734266245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9630809759170001d + "'", double1 == 0.9630809759170001d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (byte) 1, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.4658842241887455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.331371450960497d + "'", double1 == 4.331371450960497d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int int1 = org.apache.commons.math3.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1873864715321998d + "'", double1 == 1.1873864715321998d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590455d + "'", double1 == 2.7182818284590455d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 100, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248291097914389d + "'", double1 == 4.248291097914389d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        double double2 = org.apache.commons.math3.util.FastMath.pow(103.00961449578338d, (double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 126.99999f, 1024.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 126.99999237060547d + "'", double2 == 126.99999237060547d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32768, (-0.8596236973023724d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32767.998f + "'", float2 == 32767.998f);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.5206304090742055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5206304090742055d + "'", double1 == 0.5206304090742055d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.830189170012752E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707894966057265d + "'", double1 == 1.5707894966057265d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.5474735E-13f, 0.48865461858873344d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.547474E-13f + "'", float2 == 4.547474E-13f);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-35L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.99999994f, 0.010200246779241787d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.34187198E17f, (float) 32768);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.34187198E17f + "'", float2 == 2.34187198E17f);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0000005f + "'", float1 == 5.0000005f);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(5.2678643598200185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.2328896037985d) + "'", double1 == (-89.2328896037985d));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        float float2 = org.apache.commons.math3.util.FastMath.min((-4.5035996E15f), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5035996E15f) + "'", float2 == (-4.5035996E15f));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.830189170012751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(10.0f, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5534935234725733d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.99631285343356E15d + "'", double2 == 6.99631285343356E15d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 10.0f, 1.192092895507821E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.9999999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.0000001f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(10.049875621120892d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.049875621120892d + "'", double2 == 10.049875621120892d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        double double1 = org.apache.commons.math3.util.FastMath.abs(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 4096, 0.9738830555738022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9738830555738022d + "'", double2 == 0.9738830555738022d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.9286112600478652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3369954337691163d + "'", double1 == 1.3369954337691163d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.5424980307488157E-4d), 2.3012989023072956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5424980307488157E-4d) + "'", double2 == (-1.5424980307488157E-4d));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.43597363E10f, 126.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.43597363E10f + "'", float2 == 3.43597363E10f);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.30033084129497156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29583625524354545d + "'", double1 == 0.29583625524354545d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.915499384730081d, 0.8886031942391064d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.915499384730081d + "'", double2 == 0.915499384730081d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(52.000004f, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        long long2 = org.apache.commons.math3.util.FastMath.max((-2L), (long) 32768);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32768L + "'", long2 == 32768L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9738830555738022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9912174443839006d + "'", double1 == 0.9912174443839006d);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9999999999999929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.105427357601027E-15d) + "'", double1 == (-7.105427357601027E-15d));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.009430054193516519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.663853435426824d) + "'", double1 == (-4.663853435426824d));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-35L), 48.499996f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.499996f + "'", float2 == 48.499996f);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6.657902725198096E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.657902946836444E-8d + "'", double1 == 6.657902946836444E-8d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.9673559108511897E64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9673559108511897E64d + "'", double1 == 1.9673559108511897E64d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 0.9999999f, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        long long1 = org.apache.commons.math3.util.FastMath.abs(32768L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32768L + "'", long1 == 32768L);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 3, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        float float2 = org.apache.commons.math3.util.FastMath.max(23.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1097402702744097d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        double double2 = org.apache.commons.math3.util.FastMath.log(32.69314718055995d, (double) (-1022.99994f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        int int2 = org.apache.commons.math3.util.FastMath.min(13, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.7182816664368272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1469512391741817d) + "'", double1 == (-0.1469512391741817d));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5120.0d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(7.6293945E-6f, 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9280538062512562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9280538062512563d + "'", double1 == 0.9280538062512563d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-35.35050620855721d), (double) 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-35.350506208557206d) + "'", double2 == (-35.350506208557206d));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.1899855841769411d, 1.570796446004186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483272471874993d + "'", double2 == 0.6483272471874993d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 52, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(10.00000038146972d, (-0.33319605018370174d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.000000381469718d + "'", double2 == 10.000000381469718d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.8477481924511037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9515334276328968d + "'", double1 == 0.9515334276328968d);
    }
}

