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
        double double1 = org.apache.commons.math.util.FastMath.sqrt(21.402285933511266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.626260469700259d + "'", double1 == 4.626260469700259d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5860134523134185E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        long long1 = org.apache.commons.math.util.FastMath.round(1477896.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3852968325547366d + "'", double1 == 2.3852968325547366d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5302764730926062d + "'", double1 == 1.5302764730926062d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 533.252579626545d + "'", double1 == 533.252579626545d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0078125d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.03422749178784308d), 2.2239800905693157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.015388982106145104d) + "'", double2 == (-0.015388982106145104d));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int1 = org.apache.commons.math.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 35.0f, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.99999999999999d + "'", double2 == 34.99999999999999d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.0461741036471235E-4d) + "'", double2 == (-3.0461741036471235E-4d));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1887890305557882d, 0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1598620888406561d + "'", double2 == 1.1598620888406561d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2146848510894035E-8d + "'", double2 == 4.2146848510894035E-8d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 2.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0489207050997464d + "'", double1 == 1.0489207050997464d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        double double2 = org.apache.commons.math.util.FastMath.max(9.044524487391685E157d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.044524487391685E157d + "'", double2 == 9.044524487391685E157d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.121587127777053E-5d + "'", double1 == 3.121587127777053E-5d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.18106042748149917d, (double) (-53));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.164473663317525E39d + "'", double2 == 2.164473663317525E39d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-53));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53) + "'", int1 == (-53));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5777877754722899d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        double double1 = org.apache.commons.math.util.FastMath.signum(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1301927452503902d + "'", double1 == 1.1301927452503902d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5013507798060323d, 0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5013507798060323d + "'", double2 == 0.5013507798060323d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.385849999980594d + "'", double1 == 1.385849999980594d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4894276498683636d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.42706130231652d + "'", double1 == 89.42706130231652d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        double double1 = org.apache.commons.math.util.FastMath.cosh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080869E43d + "'", double1 == 1.3440585709080869E43d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6499429567608755d + "'", double1 == 0.6499429567608755d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8351015231807235d + "'", double1 == 1.8351015231807235d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5544646780753981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2245999714347802d) + "'", double1 == (-1.2245999714347802d));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-2L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.145976303209723d + "'", double1 == 1.145976303209723d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4541594839761731d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        double double1 = org.apache.commons.math.util.FastMath.log(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.219022125506721d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43305085726475895d + "'", double1 == 0.43305085726475895d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double double1 = org.apache.commons.math.util.FastMath.acos(28.4764116085372d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8813735870195429d), 0.2669359115016086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8813735870195429d) + "'", double2 == (-0.8813735870195429d));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double double1 = org.apache.commons.math.util.FastMath.acosh(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741297982545108d + "'", double1 == 4.741297982545108d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4670602929020584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8990151886161798d + "'", double1 == 0.8990151886161798d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        double double1 = org.apache.commons.math.util.FastMath.cos(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37076030339985566d + "'", double1 == 0.37076030339985566d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5971542229890328d + "'", double1 == 2.5971542229890328d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.013888888888896d + "'", double1 == 18.013888888888896d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        double double1 = org.apache.commons.math.util.FastMath.log(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7456418720467646d) + "'", double1 == (-1.7456418720467646d));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 11013L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017885376783303671d + "'", double1 == 0.0017885376783303671d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4344205208065718d + "'", double1 == 0.4344205208065718d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int1 = org.apache.commons.math.util.FastMath.round(32.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double double1 = org.apache.commons.math.util.FastMath.ulp(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2117649211245782d + "'", double1 == 0.2117649211245782d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.16644796274347667d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3887317335324652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        double double1 = org.apache.commons.math.util.FastMath.log(1.413219359169771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3458703352271479d + "'", double1 == 0.3458703352271479d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 11013L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.011029208157548202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01102943176403137d) + "'", double1 == (-0.01102943176403137d));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658792E-16d + "'", double1 == 7.951386703658792E-16d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1224.999999999999d, 7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.544753606236012E-12d + "'", double2 == 1.544753606236012E-12d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31712849292107215d) + "'", double1 == (-0.31712849292107215d));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257746d + "'", double1 == 11.548739357257746d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.467717607067357E7d + "'", double1 == 8.467717607067357E7d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double double2 = org.apache.commons.math.util.FastMath.atan2(11013.232874703413d, 1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706386041602216d + "'", double2 == 1.5706386041602216d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8029955704341625d + "'", double1 == 0.8029955704341625d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.69314718055995d + "'", double1 == 35.69314718055995d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37754243147639266d + "'", double1 == 0.37754243147639266d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1255150095460777d + "'", double1 == 2.1255150095460777d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9975366607028198d, 1.145976303209723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7162579075638862d + "'", double2 == 0.7162579075638862d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8581350785198998d) + "'", double1 == (-0.8581350785198998d));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double1 = org.apache.commons.math.util.FastMath.abs(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.04365338911715d + "'", double1 == 36.04365338911715d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650188248182272d + "'", double1 == 1.4650188248182272d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 39481480091340L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 10, 3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2710663101885893d + "'", double2 == 3.2710663101885893d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        double double2 = org.apache.commons.math.util.FastMath.min(6.115312681044281E47d, 2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6881171418161356E43d + "'", double2 == 2.6881171418161356E43d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9802322387695312E-8d + "'", double1 == 2.9802322387695312E-8d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.180709777452588d + "'", double1 == 22.180709777452588d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7212254887267799d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (-53));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0d + "'", double1 == 36.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.008838092819754681d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        int int2 = org.apache.commons.math.util.FastMath.min(5, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        long long1 = org.apache.commons.math.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3458703352271477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2350469597522027d + "'", double1 == 2.2350469597522027d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9991791830426371d + "'", double1 == 0.9991791830426371d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2112226438198959d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.351875212525347d + "'", double1 == 0.351875212525347d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-53));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39592515018183416d) + "'", double1 == (-0.39592515018183416d));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9650846656626807d) + "'", double1 == (-0.9650846656626807d));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5706386041602216d, 3.0537144249814574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9697296111063074d + "'", double2 == 3.9697296111063074d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.825659180793972d + "'", double1 == 9.825659180793972d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.2130532941206642d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.007007049837584d + "'", double1 == 1.007007049837584d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993832155237184d + "'", double1 == 0.9993832155237184d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        long long1 = org.apache.commons.math.util.FastMath.round(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4311581967195641d + "'", double1 == 0.4311581967195641d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8388608.0d + "'", double1 == 8388608.0d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0000000000000016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.450905222306537d + "'", double1 == 1.450905222306537d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0484411939287768d + "'", double1 == 1.0484411939287768d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7813863964118538d, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8125492953065081d + "'", double2 == 0.8125492953065081d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double double1 = org.apache.commons.math.util.FastMath.tanh(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9754001961551925d) + "'", double1 == (-0.9754001961551925d));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6296609567811063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6296609567811063d + "'", double1 == 0.6296609567811063d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        double double1 = org.apache.commons.math.util.FastMath.log(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8261522787674126d + "'", double1 == 0.8261522787674126d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000000000000009d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000007d + "'", double2 == 1.0000000000000007d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01706683222077747d) + "'", double1 == (-0.01706683222077747d));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28111738892954613d + "'", double1 == 0.28111738892954613d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065871571457463d + "'", double1 == 0.6065871571457463d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 97L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5840734641020676d + "'", double1 == 0.5840734641020676d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9508218731216449d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.017066003704239316d), (-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3023186765274488d + "'", double1 == 1.3023186765274488d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.413219359169771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2583723393689585d + "'", double1 == 1.2583723393689585d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5669767943827967d + "'", double1 == 0.5669767943827967d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.680482178387855d + "'", double1 == 4.680482178387855d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8809373872769856d + "'", double1 == 0.8809373872769856d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.6112949659561453d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710594084652733d + "'", double1 == 2.710594084652733d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.31712849292107215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2717628242082613d) + "'", double1 == (-0.2717628242082613d));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.356568665264778d + "'", double1 == 1.356568665264778d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.194206803317586d + "'", double1 == 4.194206803317586d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        double double1 = org.apache.commons.math.util.FastMath.log(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1161530356493914d + "'", double1 == 1.1161530356493914d);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        double double1 = org.apache.commons.math.util.FastMath.floor(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int int1 = org.apache.commons.math.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        long long1 = org.apache.commons.math.util.FastMath.round(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5942992187596847d) + "'", double1 == (-0.5942992187596847d));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 11013);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8189894035458565E-12d + "'", double1 == 1.8189894035458565E-12d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2669359115016086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9645836595696896d + "'", double1 == 0.9645836595696896d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215765d + "'", double1 == 14.899277193215765d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.2350469597522027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3074614241103386d + "'", double1 == 1.3074614241103386d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.692229922941576d + "'", double1 == 3.692229922941576d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8081843818082921d + "'", double1 == 0.8081843818082921d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8402785435782614d, 0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3673722261798014d + "'", double2 == 1.3673722261798014d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        double double1 = org.apache.commons.math.util.FastMath.signum(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 36L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        double double1 = org.apache.commons.math.util.FastMath.asin(11.548739357257746d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.5308456639204424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 11013);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.000000000002d + "'", double1 == 11013.000000000002d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4132193591697708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.880378684063449d + "'", double1 == 0.880378684063449d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        double double2 = org.apache.commons.math.util.FastMath.min(9.306831672164943d, 18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306831672164943d + "'", double2 == 9.306831672164943d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3246090892520057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0133109241786307d + "'", double1 == 2.0133109241786307d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4963334177617679d + "'", double1 == 0.4963334177617679d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7626139187213443d + "'", double1 == 3.7626139187213443d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.4780803985937d + "'", double1 == 54.4780803985937d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6931471805599462d, 1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5157707046119765d + "'", double1 == 0.5157707046119765d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.5971542229890328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.80597572185025d + "'", double1 == 148.80597572185025d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6535657774206833d, 0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8743692948528521d + "'", double2 == 0.8743692948528521d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237289657353608d + "'", double1 == 0.7237289657353608d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double double2 = org.apache.commons.math.util.FastMath.min(1.425305228849993d, 0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4963334177617679d + "'", double2 == 0.4963334177617679d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800076512800236d + "'", double1 == 0.011800076512800236d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5135318290179205d + "'", double1 == 1.5135318290179205d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        double double2 = org.apache.commons.math.util.FastMath.min((-35.35050620855721d), 1.007007049837584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-35.35050620855721d) + "'", double2 == (-35.35050620855721d));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        long long1 = org.apache.commons.math.util.FastMath.round(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.017874927409903d + "'", double1 == 10.017874927409903d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2972814671821473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6930307115608683d + "'", double1 == 1.6930307115608683d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2972814671821473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.32875291007625d + "'", double1 == 74.32875291007625d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.710594084652733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7105940846527337d + "'", double1 == 2.7105940846527337d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7320704156816698d) + "'", double1 == (-0.7320704156816698d));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7237289657353608d, 1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7237289657353609d + "'", double2 == 0.7237289657353609d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(35.00000000000001d, 89.42706130231652d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.000000000000014d + "'", double2 == 35.000000000000014d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.006492321624085E-46d + "'", double1 == 7.006492321624085E-46d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.598150033144236d + "'", double1 == 53.598150033144236d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4932054413052554d + "'", double1 == 0.4932054413052554d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.7571902525277983d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 1.0f, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.0d + "'", double1 == 2048.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        double double1 = org.apache.commons.math.util.FastMath.atan(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707956501570803d + "'", double1 == 1.5707956501570803d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3458703352271478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7601945740163978d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5347252927908293d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21551488653168732d + "'", double1 == 0.21551488653168732d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double double1 = org.apache.commons.math.util.FastMath.log(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9016684086532855d) + "'", double1 == (-0.9016684086532855d));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1888843883246802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7833920023102859d + "'", double1 == 0.7833920023102859d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22766430356286296d + "'", double1 == 0.22766430356286296d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        double double2 = org.apache.commons.math.util.FastMath.max(21.402285933511266d, 1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.402285933511266d + "'", double2 == 21.402285933511266d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.2638973976934574E18d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.605170185988092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8743692948528521d, 43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8743692948528521d + "'", double2 == 0.8743692948528521d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.80857186097813d + "'", double1 == 49.80857186097813d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int1 = org.apache.commons.math.util.FastMath.abs(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        double double1 = org.apache.commons.math.util.FastMath.sin(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9132212823529585d) + "'", double1 == (-0.9132212823529585d));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.415289655969459d + "'", double1 == 0.415289655969459d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.9982229502979694d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8207422758720628d + "'", double1 == 0.8207422758720628d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.3458703352271477d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9407807517372623d + "'", double1 == 0.9407807517372623d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9550315978940166d + "'", double1 == 0.9550315978940166d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.000000000000014d + "'", double1 == 36.000000000000014d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        double double1 = org.apache.commons.math.util.FastMath.floor(21.402285933511266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800624231293426d + "'", double1 == 0.011800624231293426d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        double double1 = org.apache.commons.math.util.FastMath.sin(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2545767570502781d) + "'", double1 == (-0.2545767570502781d));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.868551121099462d + "'", double1 == 1.868551121099462d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.08322398137173832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08322398137173832d + "'", double1 == 0.08322398137173832d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9993832155237184d, (-0.5942992187596847d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1072845368400976d + "'", double2 == 2.1072845368400976d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-4.632512904931238d), 11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.2063149707507666E-4d) + "'", double2 == (-4.2063149707507666E-4d));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1624473515096263d) + "'", double1 == (-1.1624473515096263d));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.425305228849993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.199781099457594d + "'", double1 == 2.199781099457594d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.164473663317525E39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.164473663317525E39d + "'", double1 == 2.164473663317525E39d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.000463681323821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001545365584956d + "'", double1 == 1.0001545365584956d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        double double1 = org.apache.commons.math.util.FastMath.sinh(21.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.594078672416073E8d + "'", double1 == 6.594078672416073E8d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 11013);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.011800076512800236d, (double) (-53.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011800076512800234d + "'", double2 == 0.011800076512800234d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int int1 = org.apache.commons.math.util.FastMath.round(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4894276498683636d, (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        double double1 = org.apache.commons.math.util.FastMath.log(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.206130012655933d + "'", double1 == 14.206130012655933d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.339637404328899d + "'", double1 == 1.339637404328899d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 5.637986554446436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        double double1 = org.apache.commons.math.util.FastMath.expm1(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9145768651795099d + "'", double1 == 1.9145768651795099d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.41047360972814d + "'", double1 == 45.41047360972814d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.12656474461543d + "'", double1 == 42.12656474461543d);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9434257847789064d) + "'", double1 == (-0.9434257847789064d));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.688117141816173E43d + "'", double1 == 2.688117141816173E43d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3283909087132568d + "'", double1 == 0.3283909087132568d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8417214224290828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9174537712762877d + "'", double1 == 0.9174537712762877d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7095251320497278d + "'", double1 == 0.7095251320497278d);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double double1 = org.apache.commons.math.util.FastMath.acos(35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037614443570399263d + "'", double1 == 0.0037614443570399263d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(11013.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630998.4197775756d + "'", double1 == 630998.4197775756d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        double double1 = org.apache.commons.math.util.FastMath.cos((-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7017203400855395d) + "'", double1 == (-0.7017203400855395d));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43930669835763825d) + "'", double1 == (-0.43930669835763825d));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017023944947506645d) + "'", double1 == (-0.017023944947506645d));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.0461741978670857E-4d), 0.017453292519943295d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        double double1 = org.apache.commons.math.util.FastMath.cos(10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8292136654695167d) + "'", double1 == (-0.8292136654695167d));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5436257195614516d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15315376700887107d + "'", double2 == 0.15315376700887107d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9428090415820634d + "'", double1 == 0.9428090415820634d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double double1 = org.apache.commons.math.util.FastMath.log(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.768015146316124d) + "'", double1 == (-34.768015146316124d));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9250245035569947d) + "'", double1 == (-0.9250245035569947d));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9936026854386766d + "'", double1 == 1.9936026854386766d);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4488357507586564d + "'", double1 == 1.4488357507586564d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.380515006246586d) + "'", double1 == (-3.380515006246586d));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7245474750742176d + "'", double1 == 0.7245474750742176d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5308456639204424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5308456639204424d + "'", double1 == 0.5308456639204424d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        double double2 = org.apache.commons.math.util.FastMath.pow((-34.657359027997266d), 1.0001545365584956d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.716759133972877d + "'", double1 == 1.716759133972877d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(21.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3665191429188092d + "'", double1 == 0.3665191429188092d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        double double1 = org.apache.commons.math.util.FastMath.atanh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39592515018183416d) + "'", double1 == (-0.39592515018183416d));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.6035750265302235d, 4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.603575026530223d + "'", double2 == 7.603575026530223d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4495725029967728d + "'", double1 == 1.4495725029967728d);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 2.14748365E9f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24376859510303997d + "'", double1 == 0.24376859510303997d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4337042405910987d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.433704240591099d + "'", double2 == 1.433704240591099d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7805951733159242d + "'", double1 == 0.7805951733159242d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7235232133665006d + "'", double1 == 0.7235232133665006d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        long long1 = org.apache.commons.math.util.FastMath.abs((-2L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        long long1 = org.apache.commons.math.util.FastMath.round(1.433704240591099d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999500037496876d + "'", double1 == 0.9999500037496876d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.053086467974937d, 0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0530864679749365d + "'", double2 == 3.0530864679749365d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 11013);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306831672164943d + "'", double1 == 9.306831672164943d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int1 = org.apache.commons.math.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.17230617170547372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17062095882471706d) + "'", double1 == (-0.17062095882471706d));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7235232133665006d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10757413843619563d) + "'", double1 == (-0.10757413843619563d));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998039600078416d + "'", double1 == 0.9998039600078416d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9986081305645496d + "'", double1 == 0.9986081305645496d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4657022738769552d + "'", double1 == 1.4657022738769552d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 11013);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5436257195614513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2339641205849246d + "'", double1 == 2.2339641205849246d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6080872397649995d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-86.33580274416312d) + "'", double1 == (-86.33580274416312d));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202007E-14d + "'", double1 == 1.4210854715202007E-14d);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        long long1 = org.apache.commons.math.util.FastMath.round(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.978724151380226E-4d) + "'", double1 == (-2.978724151380226E-4d));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3127199080565219d + "'", double1 == 0.3127199080565219d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        double double2 = org.apache.commons.math.util.FastMath.min(0.18106042748149917d, 1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18106042748149917d + "'", double2 == 0.18106042748149917d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        double double2 = org.apache.commons.math.util.FastMath.min(1.450905222306537d, 36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.450905222306537d + "'", double2 == 1.450905222306537d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double double2 = org.apache.commons.math.util.FastMath.min(11013.232920103323d, 2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1563686078816606d + "'", double2 == 2.1563686078816606d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8108072797718955d + "'", double1 == 3.8108072797718955d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9754001961551925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9754001961551924d) + "'", double1 == (-0.9754001961551924d));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2239800905693157d, (-1.506844020238002d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1662915285707833d + "'", double2 == 2.1662915285707833d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9429832520348356d) + "'", double1 == (-0.9429832520348356d));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.17230617170547372d), 45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 45.41047360972814d + "'", double2 == 45.41047360972814d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double double2 = org.apache.commons.math.util.FastMath.max(10.049875621120886d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.049875621120886d + "'", double2 == 10.049875621120886d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        double double1 = org.apache.commons.math.util.FastMath.log10(10.049875621120886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002160686891321d + "'", double1 == 1.002160686891321d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.591953275521519d + "'", double1 == 11.591953275521519d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0604117958350738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.872556723861298d + "'", double1 == 0.872556723861298d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.1624473515096263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39709459624648236d + "'", double1 == 0.39709459624648236d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.642821405345039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7629672449812436d + "'", double1 == 0.7629672449812436d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2014038779280567d + "'", double1 == 0.2014038779280567d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.4475693436674635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5436257195614518d + "'", double1 == 1.5436257195614518d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1520704680342657d) + "'", double1 == (-1.1520704680342657d));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.999474205005279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7613732471081224d) + "'", double1 == (-0.7613732471081224d));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8417214224290828d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07483161956956147d) + "'", double1 == (-0.07483161956956147d));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934574E18d + "'", double1 == 7.2638973976934574E18d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8147100190818939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8147100190818939d + "'", double1 == 0.8147100190818939d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6701982005616954d + "'", double1 == 0.6701982005616954d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.5971542229890328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3745669993918974d + "'", double1 == 1.3745669993918974d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        long long1 = org.apache.commons.math.util.FastMath.round(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.467720335926631E7d + "'", double1 == 8.467720335926631E7d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5544646780753981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9991396955517629d) + "'", double1 == (-0.9991396955517629d));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9117339147869651d) + "'", double1 == (-0.9117339147869651d));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9998039600078416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761511811895975d + "'", double1 == 0.761511811895975d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.620277154609447d + "'", double1 == 23.620277154609447d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000004d + "'", double1 == 100.00000000000004d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        double double1 = org.apache.commons.math.util.FastMath.tan(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0476958419065936d) + "'", double1 == (-1.0476958419065936d));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.506844020238002d), Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5068440202380022d) + "'", double2 == (-1.5068440202380022d));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        double double2 = org.apache.commons.math.util.FastMath.min(0.39709459624648236d, 1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39709459624648236d + "'", double2 == 0.39709459624648236d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3036.676314193363d) + "'", double1 == (-3036.676314193363d));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        double double1 = org.apache.commons.math.util.FastMath.tanh(100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6433380240448354d + "'", double1 == 0.6433380240448354d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        int int1 = org.apache.commons.math.util.FastMath.round(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6080872397649995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5757472671756005d + "'", double1 == 0.5757472671756005d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        long long1 = org.apache.commons.math.util.FastMath.round(100.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549018d) + "'", double1 == (-1.5574077246549018d));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0037614443570399263d, (-1.529104380392399d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0037614443570399263d + "'", double2 == 0.0037614443570399263d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8461684323333869d + "'", double1 == 0.8461684323333869d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9650846656626807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9754001961551925d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1887890305557882d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.17230617170547374d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1262023.5276316951d + "'", double1 == 1262023.5276316951d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-36.04365338911715d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        double double2 = org.apache.commons.math.util.FastMath.max(10.000000000000002d, (double) 11013L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.0d + "'", double2 == 11013.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        double double1 = org.apache.commons.math.util.FastMath.acos(22026.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.276473161941219d + "'", double1 == 4.276473161941219d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.30685281944005d + "'", double1 == 34.30685281944005d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8693235746902678d + "'", double1 == 0.8693235746902678d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672744d) + "'", double1 == (-0.9171523356672744d));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 11013, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        double double2 = org.apache.commons.math.util.FastMath.max(5.293329949408896d, 0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.293329949408896d + "'", double2 == 5.293329949408896d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5433467420946743d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9428090415820634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016455121993179136d + "'", double1 == 0.016455121993179136d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5370843467987585d + "'", double1 == 0.5370843467987585d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535657774206833d + "'", double1 == 0.6535657774206833d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.502154937700735d + "'", double1 == 2.502154937700735d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }
}

