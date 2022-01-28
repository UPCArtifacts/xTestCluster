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
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1932800507380157d + "'", double1 == 1.1932800507380157d);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2409478134865074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2724546286048326d + "'", double1 == 1.2724546286048326d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(40.19388753718691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2302.9401181042886d + "'", double1 == 2302.9401181042886d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5574077105338615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.68585461772224d + "'", double1 == 74.68585461772224d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.5534301753820028d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3923993423012373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7321095807146255d + "'", double1 == 0.7321095807146255d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.504654289280179d, (-0.5708920866202177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7949001954883153d + "'", double2 == 1.7949001954883153d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.14782604738794858d, 1.7715216602443777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1478260473879486d + "'", double2 == 0.1478260473879486d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2457500122259584d, 0.9995920864606948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2457500122259584d + "'", double2 == 0.2457500122259584d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0149280275816275d, 0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.009088214590764d + "'", double2 == 1.009088214590764d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.770170914020331d + "'", double2 == 0.770170914020331d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.837589179357618E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948948d + "'", double1 == 1.5707963267948948d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double1 = org.apache.commons.math.util.FastMath.atanh(97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        double double2 = org.apache.commons.math.util.FastMath.max(0.16601303451652813d, 1.3588470982042273d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3588470982042273d + "'", double2 == 1.3588470982042273d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        double double1 = org.apache.commons.math.util.FastMath.ulp(50.50495049504956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.004619531120223835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004619514690056837d + "'", double1 == 0.004619514690056837d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        double double2 = org.apache.commons.math.util.FastMath.pow(631011.7651164598d, 0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1735.209878559419d + "'", double2 == 1735.209878559419d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.4633067985287282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04299281412108692d + "'", double1 == 0.04299281412108692d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        double double1 = org.apache.commons.math.util.FastMath.log(3.0768893216246815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.123919126120245d + "'", double1 == 1.123919126120245d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double double1 = org.apache.commons.math.util.FastMath.signum(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.0867705308894857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2778843899054422d + "'", double1 == 1.2778843899054422d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double double2 = org.apache.commons.math.util.FastMath.max(4.9E-324d, 1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1735.209878559419d + "'", double2 == 1735.209878559419d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 39481480091341L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5834613951988719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999197990932152d + "'", double1 == 0.9999197990932152d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2724546286048326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8208605814597707d + "'", double1 == 0.8208605814597707d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.66161881444429d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 503.55674565883726d + "'", double1 == 503.55674565883726d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        float float1 = org.apache.commons.math.util.FastMath.abs(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1361158038315415d + "'", double1 == 1.1361158038315415d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.051480451855675305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051480451855675305d + "'", double1 == 0.051480451855675305d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        double double1 = org.apache.commons.math.util.FastMath.signum(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4403028592460305d + "'", double1 == 1.4403028592460305d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.868551121099462d + "'", double1 == 1.868551121099462d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1362667799148092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9745239815026069d + "'", double1 == 0.9745239815026069d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0278589874552748d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4696098011142062d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38818646476211366d) + "'", double1 == (-0.38818646476211366d));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7321095807146255d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14191465995125369d + "'", double1 == 0.14191465995125369d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5707963267948966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double double2 = org.apache.commons.math.util.FastMath.min(2.3358347343868286E40d, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876839d + "'", double2 == 0.8623188722876839d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double double1 = org.apache.commons.math.util.FastMath.acosh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999999d) + "'", double1 == (-0.9999999999999999d));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.238991635001947d + "'", double1 == 1.238991635001947d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        double double1 = org.apache.commons.math.util.FastMath.log(0.15481538423886812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8655219413764763d) + "'", double1 == (-1.8655219413764763d));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        double double1 = org.apache.commons.math.util.FastMath.abs(9.357486930108681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.357486930108681d + "'", double1 == 9.357486930108681d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9982229502979716d + "'", double1 == 2.9982229502979716d);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.04747859541485403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988731032017402d + "'", double1 == 0.9988731032017402d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        double double2 = org.apache.commons.math.util.FastMath.pow((-89.00499281765603d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.14191465995125369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14287905018325442d + "'", double1 == 0.14287905018325442d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5834613951988719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4596132072859689d + "'", double1 == 0.4596132072859689d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.7166721312869937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9110715003828589d) + "'", double1 == (-0.9110715003828589d));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.013811841723194d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        double double1 = org.apache.commons.math.util.FastMath.sinh(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.4649444186343d + "'", double1 == 1833.4649444186343d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7015156767002264d, 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020040621669131474d + "'", double2 == 0.020040621669131474d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        double double1 = org.apache.commons.math.util.FastMath.tanh(89.42706130231652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1483650317358706d + "'", double1 == 0.1483650317358706d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0871877068532768E16d + "'", double1 == 9.0871877068532768E16d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3279842425886166d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4397629335614917d + "'", double2 == 2.4397629335614917d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6536436208636119d) + "'", double1 == (-0.6536436208636119d));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        double double1 = org.apache.commons.math.util.FastMath.asinh(57.28518781699162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741265442356241d + "'", double1 == 4.741265442356241d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8864602386292288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1417162261588426d + "'", double1 == 0.1417162261588426d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995877692d + "'", double1 == 9.999999995877692d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (byte) 1, 0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9199653037215055d + "'", double2 == 0.9199653037215055d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double double1 = org.apache.commons.math.util.FastMath.ulp(40.19388753718691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8141114601824925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.933744283669387d + "'", double1 == 0.933744283669387d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5294913521432763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '#', (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9033391107665127d, (-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7.47197233734299E-43d) + "'", double2 == (-7.47197233734299E-43d));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        double double2 = org.apache.commons.math.util.FastMath.min(9.194972725426231d, 0.3923993423012373d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3923993423012373d + "'", double2 == 0.3923993423012373d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.384371602954472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6199770987338742d + "'", double1 == 0.6199770987338742d);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8058302155599487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7372144183864715d + "'", double1 == 0.7372144183864715d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        double double1 = org.apache.commons.math.util.FastMath.ulp(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8805765261215637d + "'", double1 == 0.8805765261215637d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4844347252766887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9022955440581245d + "'", double1 == 0.9022955440581245d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3845986357215d + "'", double1 == 1.3845986357215d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.220446049250313E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double double1 = org.apache.commons.math.util.FastMath.sinh(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double double1 = org.apache.commons.math.util.FastMath.sin(5792.618751480198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.460094597035771d) + "'", double1 == (-0.460094597035771d));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1535902666964597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9142246332006481d + "'", double1 == 0.9142246332006481d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        double double1 = org.apache.commons.math.util.FastMath.rint(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1834.0d + "'", double1 == 1834.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        double double1 = org.apache.commons.math.util.FastMath.abs(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.0d + "'", double1 == 1833.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 5L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 5.0f, 631011.7651164598d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9795918367346939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6633689306847952d + "'", double1 == 1.6633689306847952d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.07277226732562546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0754855858153687d + "'", double1 == 1.0754855858153687d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 39481480091341L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481480091341E13d + "'", double1 == 3.9481480091341E13d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        double double1 = org.apache.commons.math.util.FastMath.cosh(100.0000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709083352E43d + "'", double1 == 1.3440585709083352E43d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6419693473089224d + "'", double1 == 0.6419693473089224d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        long long1 = org.apache.commons.math.util.FastMath.round(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.2744808562922508d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.281588225835499d) + "'", double1 == (-0.281588225835499d));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6633689306847952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-24.53305982277447d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2570569097055435E10d + "'", double1 == 2.2570569097055435E10d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.35650241886700945d, 2.9982229502979716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.045392431815163135d + "'", double2 == 0.045392431815163135d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        double double1 = org.apache.commons.math.util.FastMath.tanh(19.085536923187668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.020040621669131474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020040621669131477d + "'", double1 == 0.020040621669131477d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9443504370351302d + "'", double1 == 0.9443504370351302d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3254103039381046d + "'", double1 == 0.3254103039381046d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.2240401467946807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9335211344483768d + "'", double1 == 0.9335211344483768d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1483650317358706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9925591367766533d, 74.68585461772224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9925591367766535d + "'", double2 == 1.9925591367766535d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707963267948712d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004975165426584024d) + "'", double1 == (-0.004975165426584024d));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.16601303451652816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7798578119818305d) + "'", double1 == (-0.7798578119818305d));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5708920866202177d) + "'", double1 == (-0.5708920866202177d));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2578451663452497d + "'", double1 == 2.2578451663452497d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.07264407634054174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0026397414693562d + "'", double1 == 1.0026397414693562d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8918900011220077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1015071856306502d + "'", double1 == 1.1015071856306502d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0741994078890014d + "'", double1 == 2.0741994078890014d);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        double double2 = org.apache.commons.math.util.FastMath.pow(10.049875621120892d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.002650236923264503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026502369232645033d + "'", double1 == 0.0026502369232645033d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5707963267948967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6023002278876782d + "'", double1 == 0.6023002278876782d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0086972736692794d + "'", double1 == 2.0086972736692794d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3314536537354545E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.68799240441712d + "'", double1 == 97.68799240441712d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.008837747656337032d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837977760189355d) + "'", double1 == (-0.008837977760189355d));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13786975975049967d + "'", double1 == 0.13786975975049967d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.4131591025766d + "'", double1 == 148.4131591025766d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1277481342023209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1362667799148092d + "'", double1 == 0.1362667799148092d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8052085614665847d + "'", double1 == 0.8052085614665847d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.38905609893065d + "'", double1 == 7.38905609893065d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        double double1 = org.apache.commons.math.util.FastMath.log(0.933744283669387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06855266446079726d) + "'", double1 == (-0.06855266446079726d));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078964d + "'", double1 == 0.8414709848078964d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        long long1 = org.apache.commons.math.util.FastMath.round(1.000000000000014d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double1 = org.apache.commons.math.util.FastMath.tanh(70.09526929955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.15491406168101263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24769059955591424d + "'", double1 == 0.24769059955591424d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-89.00499281765603d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.129830963909753d + "'", double1 == 1.129830963909753d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1679596500040805d + "'", double1 == 3.1679596500040805d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.834032445247956d, (double) 39481480091341L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1124649919871528E-14d + "'", double2 == 2.1124649919871528E-14d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.019831596490547193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.37672359943834516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38625675609943166d + "'", double1 == 0.38625675609943166d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.457501399486101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4575013994861012d + "'", double1 == 1.4575013994861012d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644298430695373d + "'", double1 == 4.644298430695373d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        double double2 = org.apache.commons.math.util.FastMath.min(5.268356063861754E-9d, (-0.1598639151884341d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1598639151884341d) + "'", double2 == (-0.1598639151884341d));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7059602000407633d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0026397414693562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8832389348340275d + "'", double1 == 0.8832389348340275d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.034776717477448635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03538849883217154d + "'", double1 == 0.03538849883217154d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        double double1 = org.apache.commons.math.util.FastMath.expm1(70.09526929955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7668694253884004E30d + "'", double1 == 2.7668694253884004E30d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.2744808562922508d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.15481538423886812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8101858850092454d) + "'", double1 == (-0.8101858850092454d));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9912009623635004d + "'", double1 == 0.9912009623635004d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 198.57204013738647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.24091947210469064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.803668954118542d + "'", double1 == 13.803668954118542d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.306852821501208d, (-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32317036277189654d + "'", double2 == 0.32317036277189654d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.741265442356241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.675894270215288d + "'", double1 == 0.675894270215288d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        double double2 = org.apache.commons.math.util.FastMath.min(3279.925622497139d, 0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28448959157673537d + "'", double2 == 0.28448959157673537d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6632456843634444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9410822616658444d + "'", double1 == 0.9410822616658444d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        double double1 = org.apache.commons.math.util.FastMath.cos(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        double double2 = org.apache.commons.math.util.FastMath.min(137.38927884571783d, 1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4274266235030733d + "'", double2 == 1.4274266235030733d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9149994957367079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9149994957367079d + "'", double1 == 0.9149994957367079d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        long long1 = org.apache.commons.math.util.FastMath.round(3.1679596500040805d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5685262033089267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2956086822491306d + "'", double1 == 2.2956086822491306d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.42227207044929d + "'", double1 == 21.42227207044929d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658792E-16d + "'", double1 == 7.951386703658792E-16d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8221857156655814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8221857156655815d + "'", double1 == 0.8221857156655815d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.009528896040185642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009529184458135626d + "'", double1 == 0.009529184458135626d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5707963267948967d, 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5707963267948968d + "'", double2 == 0.5707963267948968d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.281588225835499d), 1.0268566801211685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2815882258354989d) + "'", double2 == (-0.2815882258354989d));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7015156767002264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5879598790812549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8003118125268405d + "'", double1 == 0.8003118125268405d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4403028592460305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9914978027470505d + "'", double1 == 0.9914978027470505d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        double double1 = org.apache.commons.math.util.FastMath.acos(35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1906899454435431d, (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2778843899054422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1063634786066832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8358515696195364d + "'", double1 == 0.8358515696195364d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.642227864217147d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0000000041223074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07998609361042E-5d + "'", double1 == 9.07998609361042E-5d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.07264407634054174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.075347727094991d + "'", double1 == 1.075347727094991d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        double double1 = org.apache.commons.math.util.FastMath.log(0.045392431815163135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.092409887937381d) + "'", double1 == (-3.092409887937381d));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.98400770596488d + "'", double1 == 68.98400770596488d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        double double2 = org.apache.commons.math.util.FastMath.max(35.00000000000001d, 104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.94395132690269d + "'", double2 == 104.94395132690269d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.217373703740946d + "'", double1 == 7.217373703740946d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2302.9401181042886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.98895829359383d + "'", double1 == 47.98895829359383d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        double double2 = org.apache.commons.math.util.FastMath.pow(1833.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091341L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.238991635001947d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5585053606381855d, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5585053606381855d + "'", double2 == 0.5585053606381855d);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1417162261588426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.119741647423155d + "'", double1 == 8.119741647423155d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.460094597035771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.460094597035771d + "'", double1 == 0.460094597035771d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.948148009134034E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        double double1 = org.apache.commons.math.util.FastMath.sin((-18.714973875118524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13417614850536844d + "'", double1 == 0.13417614850536844d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 52.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.019828997233014522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020026897690215144d + "'", double1 == 0.020026897690215144d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1256209726545494d + "'", double1 == 1.1256209726545494d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.24154560853011509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24395830743395697d + "'", double1 == 0.24395830743395697d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        double double1 = org.apache.commons.math.util.FastMath.cos(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9231784609934364d) + "'", double1 == (-0.9231784609934364d));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1535902666964596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9882281837083275d + "'", double1 == 0.9882281837083275d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        double double1 = org.apache.commons.math.util.FastMath.cos(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9736488930495181d + "'", double1 == 0.9736488930495181d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        double double1 = org.apache.commons.math.util.FastMath.floor(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.615120516841259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.248381178277219d + "'", double1 == 10.248381178277219d);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9976952979536658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8402235152809697d) + "'", double1 == (-0.8402235152809697d));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.29403979995923674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.7974777282436d + "'", double1 == 47.7974777282436d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 39481480091341L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        double double1 = org.apache.commons.math.util.FastMath.abs(503.55674565883726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 503.55674565883726d + "'", double1 == 503.55674565883726d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2982952388073998d, 2.2570569097055435E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3216115088844413E-11d + "'", double2 == 1.3216115088844413E-11d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.14287905018325442d, 11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2973397658232583E-5d + "'", double2 == 1.2973397658232583E-5d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(631011.7651164598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 85.7720556895209d + "'", double1 == 85.7720556895209d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6199770987338742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.6011050627869963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3784176643307493d) + "'", double1 == (-2.3784176643307493d));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        double double1 = org.apache.commons.math.util.FastMath.floor(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        float float1 = org.apache.commons.math.util.FastMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232920103324d, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232920103323d + "'", double2 == 11013.232920103323d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0911052960943115d + "'", double1 == 1.0911052960943115d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        double double1 = org.apache.commons.math.util.FastMath.cos(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9960122203732344d) + "'", double1 == (-0.9960122203732344d));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5507969934215644d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5507969934215644d + "'", double2 == 1.5507969934215644d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-38.816242111356935d) + "'", double1 == (-38.816242111356935d));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490457723982544d + "'", double1 == 1.2490457723982544d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5834613951988719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.28366218546322625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.194972725426231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 526.8331299048269d + "'", double1 == 526.8331299048269d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double double1 = org.apache.commons.math.util.FastMath.log10(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5567229026732161d + "'", double1 == 1.5567229026732161d);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1483650317358706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9080796112182217d) + "'", double1 == (-1.9080796112182217d));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(170.75141916320402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.067188648029997d + "'", double1 == 13.067188648029997d);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9998151400298467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019228399099707562d + "'", double1 == 0.019228399099707562d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1226744880631757d + "'", double1 == 0.1226744880631757d);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        long long1 = org.apache.commons.math.util.FastMath.round(6.241434156324286E213d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.281588225835499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.13381690095078d) + "'", double1 == (-16.13381690095078d));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18650080065297936d + "'", double1 == 0.18650080065297936d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7353126200110887d + "'", double1 == 3.7353126200110887d);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        double double1 = org.apache.commons.math.util.FastMath.asin(148.4131591025766d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.034315407113705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0343154071137053d + "'", double1 == 2.0343154071137053d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017939523577309636d) + "'", double1 == (-0.017939523577309636d));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        double double1 = org.apache.commons.math.util.FastMath.exp(47.98895829359383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.939685341941263E20d + "'", double1 == 6.939685341941263E20d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2490457723982544d, (-0.5708920866202177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8807733836535281d + "'", double2 == 0.8807733836535281d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16299078079570548d) + "'", double1 == (-0.16299078079570548d));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5707963267948967d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.197874973409682E-16d + "'", double2 == 7.197874973409682E-16d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.051480451855675305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051435021550718156d + "'", double1 == 0.051435021550718156d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        double double1 = org.apache.commons.math.util.FastMath.log(0.004619514690056837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.377465624848392d) + "'", double1 == (-5.377465624848392d));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8542643515376653d + "'", double1 == 0.8542643515376653d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0000000000000004d + "'", double1 == 3.0000000000000004d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.80544915674607d + "'", double1 == 7.80544915674607d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9971213268799871d + "'", double1 == 0.9971213268799871d);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948948d + "'", double1 == 1.5707963267948948d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9912009623635004d, (double) 39481480091341L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.384371602954472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3939063732470823d + "'", double1 == 0.3939063732470823d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.03538849883217154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.176458219595615E-4d + "'", double1 == 6.176458219595615E-4d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986118564083E-5d + "'", double1 == 9.079986118564083E-5d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6632456843634444d, 0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6632456843634446d + "'", double2 == 0.6632456843634446d);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.830314951333888d + "'", double1 == 15.830314951333888d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.273736754432579E-13d + "'", double1 == 2.273736754432579E-13d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.004619514690056837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.020377724655755693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02037631460522075d + "'", double1 == 0.02037631460522075d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.141592653589793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0949973684651075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.485329946666348d + "'", double1 == 1.485329946666348d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0278589874552748d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4596132072859689d, 9.079985974466559E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.45961320728596883d + "'", double2 == 0.45961320728596883d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        double double1 = org.apache.commons.math.util.FastMath.atan(1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702200276960676d + "'", double1 == 1.5702200276960676d);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.467108650523244d) + "'", double1 == (-0.467108650523244d));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28847397809838626d + "'", double1 == 0.28847397809838626d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8832389348340275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7727985235349918d + "'", double1 == 0.7727985235349918d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-16.13381690095078d), 0.1226744880631757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.133816900950777d) + "'", double2 == (-16.133816900950777d));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5108256237659907d) + "'", double1 == (-0.5108256237659907d));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.176458219595615E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.176458219595615E-4d + "'", double1 == 6.176458219595615E-4d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.009529184458135626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9410822616658444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7357191005950772d + "'", double1 == 0.7357191005950772d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.1535902666964596d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.38818646476211366d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7612912090796752d) + "'", double1 == (-0.7612912090796752d));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.19068994544354323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1884117453587528d + "'", double1 == 0.1884117453587528d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533141373154901d + "'", double1 == 1.2533141373154901d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082317d + "'", double1 == 1.5607966601082317d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5567229026732161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        double double2 = org.apache.commons.math.util.FastMath.min((-89.00499281765603d), 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-89.00499281765603d) + "'", double2 == (-89.00499281765603d));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.009088214590764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.816495852442316d + "'", double1 == 57.816495852442316d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.000000000000001d + "'", double1 == 5.000000000000001d);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6900198725289799d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int1 = org.apache.commons.math.util.FastMath.round((-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.933744283669387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01629691212170672d + "'", double1 == 0.01629691212170672d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.082130173350885d + "'", double1 == 3.082130173350885d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        double double2 = org.apache.commons.math.util.FastMath.min(0.045392431815163135d, 6.241434156324286E213d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.045392431815163135d + "'", double2 == 0.045392431815163135d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        double double2 = org.apache.commons.math.util.FastMath.min(2.9982229502979716d, 2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9982229502979716d + "'", double2 == 2.9982229502979716d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        int int1 = org.apache.commons.math.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        double double2 = org.apache.commons.math.util.FastMath.min(57.816495852442316d, 1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000014d + "'", double2 == 1.000000000000014d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9231784609934364d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9231784609934363d) + "'", double1 == (-0.9231784609934363d));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        double double2 = org.apache.commons.math.util.FastMath.atan2(170.75141916320402d, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5737618316160396d + "'", double2 == 1.5737618316160396d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2724546286048326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29393556482342d + "'", double1 == 0.29393556482342d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        double double1 = org.apache.commons.math.util.FastMath.ulp(47.98895829359383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5960035785549811d, 19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 19.781104616480253d + "'", double2 == 19.781104616480253d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        double double2 = org.apache.commons.math.util.FastMath.max(42.81354925721529d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.81354925721529d + "'", double2 == 42.81354925721529d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1362667799148092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8656100066608416d) + "'", double1 == (-0.8656100066608416d));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.009088214590764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5538249887862297d + "'", double1 == 1.5538249887862297d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1063634786066832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8940757456435277d + "'", double1 == 0.8940757456435277d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7321095807146255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1226744880631757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12236703082541885d + "'", double1 == 0.12236703082541885d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5111502441944042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8721824073781502d + "'", double1 == 0.8721824073781502d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.48854405300441117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6299413832967443d + "'", double1 == 0.6299413832967443d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1124045972580494d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999468579779085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3079900213234987E-5d) + "'", double1 == (-2.3079900213234987E-5d));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.24154560853011509d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5708920866202177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8295667582777111d) + "'", double1 == (-0.8295667582777111d));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1906899454435433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8307927247660993d + "'", double1 == 0.8307927247660993d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        double double1 = org.apache.commons.math.util.FastMath.log10(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867486543660318d + "'", double1 == 1.9867486543660318d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4844347252766887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4844347252766887d + "'", double1 == 1.4844347252766887d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9440892412430648d + "'", double1 == 0.9440892412430648d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1362667799148092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002378303970603899d + "'", double1 == 0.002378303970603899d);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.13417614850536844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5119471234779015d + "'", double1 == 0.5119471234779015d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1906899454435431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.059903262040248d + "'", double1 == 1.059903262040248d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        long long1 = org.apache.commons.math.util.FastMath.round(0.02037772465575569d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6199770987338742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.522071152216526d + "'", double1 == 35.522071152216526d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.04299281412108692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04299281412108692d + "'", double1 == 0.04299281412108692d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9676589901702034d + "'", double1 == 0.9676589901702034d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5293379817722998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04144646964819275d + "'", double1 == 0.04144646964819275d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9534625892455924d + "'", double1 == 0.9534625892455924d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6567734310571898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.176458219595615E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.176459005007259E-4d + "'", double1 == 6.176459005007259E-4d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.375942878091087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9588076367332294d + "'", double1 == 3.9588076367332294d);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.428182669496151d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7775220823415315d, 2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7775220823415316d + "'", double2 == 0.7775220823415316d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        double double2 = org.apache.commons.math.util.FastMath.min(21.445599564021325d, (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.306852817378902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 533.2433869852506d + "'", double1 == 533.2433869852506d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44127637925208785d + "'", double1 == 0.44127637925208785d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.12179813610068427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12209950109463034d + "'", double1 == 0.12209950109463034d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.44127637925208785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4723407343250855d + "'", double1 == 0.4723407343250855d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        int int1 = org.apache.commons.math.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8253690221023695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7523557927644398d + "'", double1 == 0.7523557927644398d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6536436208636119d), 0.32317036277189654d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32317036277189654d + "'", double2 == 0.32317036277189654d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11013.232920103324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000004122308d + "'", double1 == 10.000000004122308d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9912009623635004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.07258194039108286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8135279227115655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20637502874300212d) + "'", double1 == (-0.20637502874300212d));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9110715003828589d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 39481480091341L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948712d + "'", double1 == 1.5707963267948712d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        long long1 = org.apache.commons.math.util.FastMath.round(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2005L + "'", long1 == 2005L);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.1494681981443936d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7871.825828205634d + "'", double1 == 7871.825828205634d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9998151400298467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943227d + "'", double1 == 4.644483341943227d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        double double2 = org.apache.commons.math.util.FastMath.max(0.12209950109463034d, 0.8918900011220077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8918900011220077d + "'", double2 == 0.8918900011220077d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02037772465575569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5504171915615343d + "'", double1 == 1.5504171915615343d);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573887825082E-5d + "'", double1 == 9.079573887825082E-5d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.002378303970603899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0023783039706038994d + "'", double1 == 0.0023783039706038994d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.12179813610068427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12119940557253528d + "'", double1 == 0.12119940557253528d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.642227864217147d), (-0.7612912090796752d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.642227864217147d) + "'", double2 == (-0.642227864217147d));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948948d + "'", double1 == 1.5707963267948948d);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7992447670407303E-4d + "'", double1 == 1.7992447670407303E-4d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        double double1 = org.apache.commons.math.util.FastMath.abs(50.50495049504956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.50495049504956d + "'", double1 == 50.50495049504956d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.009088214590764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7430987570063676d + "'", double1 == 2.7430987570063676d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.02037631460522075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02017149514354095d + "'", double1 == 0.02017149514354095d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000000041223074d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5574077105338615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911632538862d + "'", double1 == 1.2261911632538862d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3216115088844413E-11d, 22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.089390493111633E-243d + "'", double2 == 9.089390493111633E-243d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9131871133554458d + "'", double1 == 0.9131871133554458d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7775220823415316d, 2.0343154071137053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0343154071137053d + "'", double2 == 2.0343154071137053d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.002653751905632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000883802631338d + "'", double1 == 1.000883802631338d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3254103039381046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33144561670275613d + "'", double1 == 0.33144561670275613d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9410822616658444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.02037772465575569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6908443102518884d) + "'", double1 == (-1.6908443102518884d));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1884117453587528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2073305257621814d + "'", double1 == 1.2073305257621814d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6900198725289799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        long long1 = org.apache.commons.math.util.FastMath.abs(3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }
}

