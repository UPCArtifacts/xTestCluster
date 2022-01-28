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
        int int2 = org.apache.commons.math.util.FastMath.max(97, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        long long1 = org.apache.commons.math.util.FastMath.round(28.4764116085372d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 116618.90399762256d + "'", double1 == 116618.90399762256d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09934057489936098d + "'", double1 == 0.09934057489936098d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-53L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0769647493626147d + "'", double1 == 1.0769647493626147d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034800731177357003d + "'", double1 == 0.0034800731177357003d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.986213958420301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.5058975143737d + "'", double1 == 56.5058975143737d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.11831214619987152d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0359863753497582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0118543769141768d + "'", double1 == 1.0118543769141768d);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.2204460492503128E-16d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        int int1 = org.apache.commons.math.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.373400766945016d, 1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3734007669450161d + "'", double2 == 1.3734007669450161d);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        double double2 = org.apache.commons.math.util.FastMath.min(4.61512051684126d, 1.0118543769141768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0118543769141768d + "'", double2 == 1.0118543769141768d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        double double2 = org.apache.commons.math.util.FastMath.pow(43.42944819032519d, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000000018d + "'", double2 == 1.0000000000000018d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5900247258946039d + "'", double2 == 1.5900247258946039d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6177859350239399d, 0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6177859350239399d + "'", double2 == 1.6177859350239399d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        double double1 = org.apache.commons.math.util.FastMath.ulp(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        double double1 = org.apache.commons.math.util.FastMath.sin(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1443601628891088d), 1.1469544105044815d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05235987755982989d + "'", double1 == 0.05235987755982989d);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4422495703074083d + "'", double1 == 1.4422495703074083d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double double2 = org.apache.commons.math.util.FastMath.max(0.986213958420301d, (-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.986213958420301d + "'", double2 == 0.986213958420301d);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9684291989028241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.066379232596407d + "'", double1 == 2.066379232596407d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.81168591902457d + "'", double1 == 71.81168591902457d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        double double1 = org.apache.commons.math.util.FastMath.cosh(56.33799391295282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.466391323325752E24d + "'", double1 == 1.466391323325752E24d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.141592653589793d + "'", double1 == 3.141592653589793d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        long long1 = org.apache.commons.math.util.FastMath.abs(5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3156563365585749d + "'", double1 == 0.3156563365585749d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        double double1 = org.apache.commons.math.util.FastMath.asinh(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2519457609704085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0488079432890174d + "'", double1 == 1.0488079432890174d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int1 = org.apache.commons.math.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8436963527515925E124d + "'", double1 == 1.8436963527515925E124d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        double double1 = org.apache.commons.math.util.FastMath.log(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198906d + "'", double1 == 1.3862943611198906d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.881784197001254E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.342928417311719d + "'", double1 == 1.342928417311719d);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9722461073327932d) + "'", double1 == (-0.9722461073327932d));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.715662658536639d + "'", double1 == 1.715662658536639d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6884941597894443d, 6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6884941597894443d + "'", double2 == 0.6884941597894443d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.941208504361988d + "'", double1 == 1.941208504361988d);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        double double1 = org.apache.commons.math.util.FastMath.cos(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28L, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599452d + "'", double1 == 0.6931471805599452d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6177859350239399d + "'", double1 == 1.6177859350239399d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.945847461890764d + "'", double1 == 62.945847461890764d);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        double double1 = org.apache.commons.math.util.FastMath.log(3.106387248181345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.133460394411876d + "'", double1 == 1.133460394411876d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 28L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1310377402202207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5467250970042679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024068905282849447d + "'", double1 == 0.024068905282849447d);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        double double2 = org.apache.commons.math.util.FastMath.pow(22.24855859029184d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3442682486537372d + "'", double1 == 1.3442682486537372d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8402785435782614d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3499748049257176d + "'", double1 == 2.3499748049257176d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 435.6527582312547d + "'", double1 == 435.6527582312547d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0222383329741738d, (-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.113278222196781d + "'", double2 == 2.113278222196781d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03489241440794944d + "'", double1 == 0.03489241440794944d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int1 = org.apache.commons.math.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7464968867258404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8177863461186085d) + "'", double1 == (-0.8177863461186085d));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308242d + "'", double1 == 57.29577951308242d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3574158419544757d, 0.263830819196742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3788272112277034d + "'", double2 == 1.3788272112277034d);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.008837747656337243d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999609473623688d + "'", double1 == 0.9999609473623688d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3693207897104474d + "'", double1 == 2.3693207897104474d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14192893333928602d) + "'", double1 == (-0.14192893333928602d));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.32681535598557454d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 100, 0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5700548602583582d + "'", double2 == 1.5700548602583582d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3235780930645504d + "'", double1 == 1.3235780930645504d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        double double1 = org.apache.commons.math.util.FastMath.rint(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        double double1 = org.apache.commons.math.util.FastMath.sinh(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021443E41d + "'", double1 == 6.691673596021443E41d);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double double2 = org.apache.commons.math.util.FastMath.min(9.0871877068532832E16d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2005.3522829578812d + "'", double2 == 2005.3522829578812d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        double double2 = org.apache.commons.math.util.FastMath.min(1.762747174039086d, 34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.762747174039086d + "'", double2 == 1.762747174039086d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.656854249492381d + "'", double1 == 5.656854249492381d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.0461741978670857E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.29750002275985665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29327768157142287d + "'", double1 == 0.29327768157142287d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8566490404809322d + "'", double1 == 1.8566490404809322d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        double double1 = org.apache.commons.math.util.FastMath.log1p(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.060443010546419d + "'", double1 == 4.060443010546419d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7592181952216696d + "'", double1 == 0.7592181952216696d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.69314718055996d + "'", double1 == 100.69314718055996d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5083775167989393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1490617565057812d + "'", double1 == 2.1490617565057812d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017065175308356183d) + "'", double1 == (-0.017065175308356183d));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.3346634130618275d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9445209155423233d + "'", double1 == 0.9445209155423233d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2519457609704083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9495963644937304d + "'", double1 == 0.9495963644937304d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.29327768157142287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5467250970042676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5467250970042676d + "'", double1 == 1.5467250970042676d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1102230246251565E-16d, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.397318034091222d) + "'", double1 == (-0.397318034091222d));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        float float1 = org.apache.commons.math.util.FastMath.abs(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double double1 = org.apache.commons.math.util.FastMath.log10((-36.04365338911715d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1820645932624315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8d + "'", double1 == 0.8d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        long long1 = org.apache.commons.math.util.FastMath.round(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.1490617565057812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5321159072301354d) + "'", double1 == (-1.5321159072301354d));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067661995777765d + "'", double1 == 10.067661995777765d);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.060443010546419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3293232640668136d + "'", double1 == 1.3293232640668136d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7601945740163978d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        double double1 = org.apache.commons.math.util.FastMath.tanh(43.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28357366964177444d + "'", double1 == 0.28357366964177444d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000001d + "'", double1 == 32.00000000000001d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09933992780358329d + "'", double1 == 0.09933992780358329d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double double1 = org.apache.commons.math.util.FastMath.log(1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22223751910473719d + "'", double1 == 0.22223751910473719d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.113278222196781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.860761315262648E-32d + "'", double1 == 9.860761315262648E-32d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7433261306201424d + "'", double1 == 1.7433261306201424d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6099169425432279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.248867972642223d, 0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2488679726422227d + "'", double2 == 1.2488679726422227d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707651109236087d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6099169425432279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4944324908505626d) + "'", double1 == (-0.4944324908505626d));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11013.232874703413d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9830787956514044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18422346241992235d + "'", double1 == 0.18422346241992235d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1716150192074115d + "'", double1 == 1.1716150192074115d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.29327768157142287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2976534827417238d + "'", double1 == 0.2976534827417238d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-53), (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4288764780867376d + "'", double1 == 0.4288764780867376d);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5836293706283021d + "'", double1 == 0.5836293706283021d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.7507239941348802d), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.0507428532869755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05074285328697551d + "'", double1 == 0.05074285328697551d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4748409916077942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11158130719039049d) + "'", double1 == (-0.11158130719039049d));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6178334732240378d + "'", double1 == 1.6178334732240378d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11014.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 363.7080191456556d + "'", double1 == 363.7080191456556d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1046225788468806d + "'", double1 == 1.1046225788468806d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        double double1 = org.apache.commons.math.util.FastMath.expm1(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3288870502122705E12d + "'", double1 == 2.3288870502122705E12d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8086089434116457d + "'", double1 == 1.8086089434116457d);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.205696208681136d + "'", double1 == 8.205696208681136d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2285994658896716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.475783864064788d) + "'", double1 == (-1.475783864064788d));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9997103019367587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7580564974852393d) + "'", double1 == (-0.7580564974852393d));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0009877980461306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8393046750511655d) + "'", double1 == (-0.8393046750511655d));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.397318034091222d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2704418874297039d + "'", double1 == 1.2704418874297039d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        double double2 = org.apache.commons.math.util.FastMath.atan2(71.81168591902457d, 0.22223751910473719d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5677016102904182d + "'", double2 == 1.5677016102904182d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        double double1 = org.apache.commons.math.util.FastMath.signum(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3887317335324652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.841470984807897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078971d + "'", double1 == 0.8414709848078971d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.541950429394781d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7813863964118538d, 3.174802103936399d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7813863964118538d + "'", double2 == 0.7813863964118538d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1469544105044815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7330957838811774d + "'", double1 == 1.7330957838811774d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3734007669450161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.101000478591089d + "'", double1 == 2.101000478591089d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05375489702567273d + "'", double1 == 0.05375489702567273d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5467250970042679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.62082012530739d + "'", double1 == 88.62082012530739d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        double double2 = org.apache.commons.math.util.FastMath.pow(5557.690612768985d, 1.446441332248135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 261077.8315317605d + "'", double2 == 261077.8315317605d);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49714987269413385d + "'", double1 == 0.49714987269413385d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.017507307769456783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0176614589589157d + "'", double1 == 1.0176614589589157d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(56.33799391295282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3227.9292774459186d + "'", double1 == 3227.9292774459186d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1189038211438946d, (-0.017065175308356183d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9980845732903538d + "'", double2 == 0.9980845732903538d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-14.148409796207115d) + "'", double1 == (-14.148409796207115d));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        double double2 = org.apache.commons.math.util.FastMath.min(5557.690612768985d, 3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.690612768985d + "'", double2 == 5557.690612768985d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2947960259678524d + "'", double1 == 0.2947960259678524d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7966043547446022d, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7966043547446022d + "'", double2 == 0.7966043547446022d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000004d + "'", double1 == 2.0000000000000004d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.344162252208615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7871071944553747d + "'", double1 == 1.7871071944553747d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6429979698813715d + "'", double1 == 1.6429979698813715d);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.17062332315326462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.775996303178843d) + "'", double1 == (-9.775996303178843d));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8322083902453669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.832208390245367d + "'", double1 == 0.832208390245367d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0118543769141768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.598780889335082d + "'", double1 == 1.598780889335082d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5083775167989393d, 1.2488679726422227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.508377516798939d + "'", double2 == 1.508377516798939d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5574077246549023d, (-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.557407724654902d + "'", double2 == 1.557407724654902d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 147.4131591025766d + "'", double1 == 147.4131591025766d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.0461741978670857E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570491709370399d + "'", double1 == 1.570491709370399d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        double double2 = org.apache.commons.math.util.FastMath.max(1.175201187282749d, 56.33799391295282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.33799391295282d + "'", double2 == 56.33799391295282d);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0507428532869755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        double double1 = org.apache.commons.math.util.FastMath.floor(56.5058975143737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.0d + "'", double1 == 56.0d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        double double1 = org.apache.commons.math.util.FastMath.ceil(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279167d + "'", double1 == 4.158638853279167d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3933489534882026d + "'", double1 == 2.3933489534882026d);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4933710115259213d) + "'", double1 == (-0.4933710115259213d));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.29750002275985665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2604393535992218d + "'", double1 == 0.2604393535992218d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.2285994658896716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6114464160932404d + "'", double1 == 0.6114464160932404d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        double double2 = org.apache.commons.math.util.FastMath.max(0.22469894983086627d, 5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5557.690612768985d + "'", double2 == 5557.690612768985d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2947960259678524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30364342573864755d + "'", double1 == 0.30364342573864755d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.17062332315326462d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.6035750265302235d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0253512046806867d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        double double2 = org.apache.commons.math.util.FastMath.min(32.00000000000001d, 1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8402785435782612d + "'", double2 == 1.8402785435782612d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4426.960349240149d) + "'", double1 == (-4426.960349240149d));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.46096535893150964d) + "'", double1 == (-0.46096535893150964d));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5945153260434693d) + "'", double1 == (-0.5945153260434693d));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1469544105044815d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.38905609893065d + "'", double1 == 6.38905609893065d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523148d + "'", double1 == 1.7253825588523148d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        double double1 = org.apache.commons.math.util.FastMath.asin(116618.90399762256d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950371902099892d + "'", double1 == 0.9950371902099892d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.113278222196781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5162631492122485d) + "'", double1 == (-0.5162631492122485d));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4154931988910127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15467958605816817d + "'", double1 == 0.15467958605816817d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        double double1 = org.apache.commons.math.util.FastMath.rint((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-77.0d) + "'", double1 == (-77.0d));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        double double1 = org.apache.commons.math.util.FastMath.exp((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503185E-16d + "'", double1 == 2.2204460492503185E-16d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.832208390245367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.098293393647366d + "'", double1 == 1.098293393647366d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1411200080598672d + "'", double1 == 0.1411200080598672d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        double double1 = org.apache.commons.math.util.FastMath.ceil(71.81168591902457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.0d + "'", double1 == 72.0d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59155902616465d + "'", double1 == 114.59155902616465d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899277193215994d + "'", double1 == 14.899277193215994d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.342928417311719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1032762973918335d + "'", double1 == 1.1032762973918335d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124437d + "'", double1 == 0.8745129512124437d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        double double2 = org.apache.commons.math.util.FastMath.atan2(261077.8315317605d, 2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.712293689529172E-39d + "'", double2 == 9.712293689529172E-39d);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7330957838811774d, 1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7842626635876098d + "'", double2 == 0.7842626635876098d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9465430622761263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.482433365515615d + "'", double1 == 1.482433365515615d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5929264334035065d + "'", double1 == 1.5929264334035065d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2519457609704083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6055965365175096d + "'", double1 == 1.6055965365175096d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.1490617565057812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 28L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 28.0f + "'", float1 == 28.0f);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(13.596393407513998d, (-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.596393407513997d + "'", double2 == 13.596393407513997d);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2574599505487548d + "'", double1 == 0.2574599505487548d);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2976534827417238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9560273016457694d + "'", double1 == 0.9560273016457694d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        int int1 = org.apache.commons.math.util.FastMath.round(57.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6535657774206833d, 1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6535657774206833d + "'", double2 == 0.6535657774206833d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        double double1 = org.apache.commons.math.util.FastMath.log(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.983924344986402d + "'", double1 == 31.983924344986402d);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.2604393535992218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.017453292519943295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.724495677915209d) + "'", double1 == (-2.724495677915209d));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9508218731216449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05042853879473771d) + "'", double1 == (-0.05042853879473771d));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5467250970042676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2436740316514885d + "'", double1 == 1.2436740316514885d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535017414499469d + "'", double1 == 0.6535017414499469d);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        long long1 = org.apache.commons.math.util.FastMath.round(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 232L + "'", long1 == 232L);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.778786642387399d) + "'", double1 == (-6.778786642387399d));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7158569288579338d) + "'", double1 == (-0.7158569288579338d));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0522257274488631d + "'", double1 == 1.0522257274488631d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4944324908505626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.51718181260188d) + "'", double1 == (-0.51718181260188d));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.712293689529172E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.712293689529174E-39d + "'", double1 == 9.712293689529174E-39d);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.540302305868139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009430054193516505d + "'", double1 == 0.009430054193516505d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810327220066308d + "'", double1 == 4.810327220066308d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5607966601082317d, 3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.049630518106203d + "'", double2 == 4.049630518106203d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009999500037496552d + "'", double1 == 0.009999500037496552d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5440211108893698d), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.005440157440537665d) + "'", double2 == (-0.005440157440537665d));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40604869080352307d) + "'", double1 == (-0.40604869080352307d));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008750221815056362d + "'", double1 == 0.008750221815056362d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.6347792607040605d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.241721948438556d + "'", double1 == 1.241721948438556d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.158010543951033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5025652899631845d) + "'", double1 == (-1.5025652899631845d));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 28L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 28.0f + "'", float2 == 28.0f);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.22223751910473719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22223751910473719d + "'", double1 == 0.22223751910473719d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0488079432890174d, 1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0488079432890174d + "'", double2 == 1.0488079432890174d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9780533157623794d + "'", double1 == 0.9780533157623794d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04134068757158039d + "'", double1 == 0.04134068757158039d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        double double1 = org.apache.commons.math.util.FastMath.sin(11014.999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5448049645710876d + "'", double1 == 0.5448049645710876d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9251475365964139d), 1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9251475365964138d) + "'", double2 == (-0.9251475365964138d));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.04191482247339d + "'", double1 == 4.04191482247339d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0118543769141768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.974985279021965d + "'", double1 == 57.974985279021965d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.598780889335082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.946997808922293d + "'", double1 == 3.946997808922293d);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0118543769141768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8897311048513159d + "'", double1 == 0.8897311048513159d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.39731803409120725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40859244341429657d) + "'", double1 == (-0.40859244341429657d));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.945982489867764E-83d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.945982489867764E-83d) + "'", double1 == (-1.945982489867764E-83d));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(104.9439511105971d, 97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.94395111059708d + "'", double2 == 104.94395111059708d);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7811955944788658d) + "'", double1 == (-0.7811955944788658d));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.3288870502122705E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.169558789096715d + "'", double1 == 29.169558789096715d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9961652815068444d + "'", double1 == 0.9961652815068444d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.009430054193516505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(100.0d, 0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        double double1 = org.apache.commons.math.util.FastMath.log(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7456418720467646d) + "'", double1 == (-1.7456418720467646d));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        int int1 = org.apache.commons.math.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.77037274892726E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        double double1 = org.apache.commons.math.util.FastMath.acosh(71.81168591902457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.967145917811647d + "'", double1 == 4.967145917811647d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33372300080313627d + "'", double1 == 0.33372300080313627d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7580564974852393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6399307720594023d) + "'", double1 == (-0.6399307720594023d));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.482433365515615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9019228933850969d + "'", double1 == 0.9019228933850969d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6535017414499469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5740225962860341d + "'", double1 == 0.5740225962860341d);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.54983443527075d + "'", double1 == 7.54983443527075d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.046174197867085E-4d) + "'", double1 == (-3.046174197867085E-4d));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.008798809557313648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.106387248181345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.147713248144797d + "'", double1 == 11.147713248144797d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        double double2 = org.apache.commons.math.util.FastMath.min(0.634578497998064d, (-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5049299044217186d) + "'", double2 == (-2.5049299044217186d));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0522257274488631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 60.28809327790271d + "'", double1 == 60.28809327790271d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171523356672745d + "'", double1 == 0.9171523356672745d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021171773984568765d) + "'", double1 == (-0.021171773984568765d));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9445209155423233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5715810788975264d + "'", double1 == 2.5715810788975264d);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        double double2 = org.apache.commons.math.util.FastMath.min(2.1556157735575975E15d, 1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9867717342662448d + "'", double2 == 1.9867717342662448d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        double double2 = org.apache.commons.math.util.FastMath.min(2.066379232596407d, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097588d) + "'", double2 == (-0.5063656411097588d));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5416614449118216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        double double2 = org.apache.commons.math.util.FastMath.min(32.00000000000001d, 2.5715810788975264d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5715810788975264d + "'", double2 == 2.5715810788975264d);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        double double1 = org.apache.commons.math.util.FastMath.cosh(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481480091340625E13d + "'", double1 == 3.9481480091340625E13d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3574158419544757d, 8.205696208681136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16393896798747645d + "'", double2 == 0.16393896798747645d);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.454505008613144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7730965638572164d) + "'", double1 == (-0.7730965638572164d));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9465430622761263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        double double2 = org.apache.commons.math.util.FastMath.max(2.1532366900854942d, 9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306831672164943d + "'", double2 == 9.306831672164943d);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        double double2 = org.apache.commons.math.util.FastMath.max(1.482433365515615d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.482433365515615d + "'", double2 == 1.482433365515615d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7730965638572164d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5416614449118216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.443185943576958d + "'", double1 == 2.443185943576958d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950915100179343d + "'", double1 == 0.9950915100179343d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.22223751910473719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        double double1 = org.apache.commons.math.util.FastMath.signum(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8332128969929774d) + "'", double1 == (-0.8332128969929774d));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        double double1 = org.apache.commons.math.util.FastMath.cos(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915067d) + "'", double1 == (-0.9036922050915067d));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.066379232596407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.896181061029328d + "'", double1 == 6.896181061029328d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2246467991473532E-16d) + "'", double1 == (-1.2246467991473532E-16d));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.7464968867258404d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.516964265655408d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9036922050915067d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9668078739084817d) + "'", double1 == (-0.9668078739084817d));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8975275723469739d + "'", double1 == 0.8975275723469739d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6645439359795198d) + "'", double1 == (-0.6645439359795198d));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        double double1 = org.apache.commons.math.util.FastMath.abs((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0461741978670857E-4d + "'", double1 == 3.0461741978670857E-4d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1820645932624315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5667721456124328d + "'", double1 == 0.5667721456124328d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.508377516798939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.508377516798939d + "'", double1 == 1.508377516798939d);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.2976534827417238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005195033303871199d + "'", double1 == 0.005195033303871199d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1716150192074115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0542128609568502d + "'", double1 == 1.0542128609568502d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.009730277093455045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2134887868481213d + "'", double1 == 0.2134887868481213d);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        long long1 = org.apache.commons.math.util.FastMath.round(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.982780458176066d + "'", double1 == 34.982780458176066d);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7346342576927686d + "'", double1 == 0.7346342576927686d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1469544105044815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8537394163269078d + "'", double1 == 0.8537394163269078d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24779790579557007d + "'", double1 == 0.24779790579557007d);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.05042853879473771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05047132954481966d) + "'", double1 == (-0.05047132954481966d));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.005440157440537665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9945746134185464d + "'", double1 == 0.9945746134185464d);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.3499748049257176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0125173861454009d) + "'", double1 == (-1.0125173861454009d));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9916299884373267d), (double) 57);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9916299884373266d) + "'", double2 == (-0.9916299884373266d));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 28.0f, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308237d + "'", double1 == 57.29577951308237d);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6323562492563314d + "'", double1 == 0.6323562492563314d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4288764780867376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41671114415975274d + "'", double1 == 0.41671114415975274d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        long long1 = org.apache.commons.math.util.FastMath.round(4.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549045d + "'", double1 == 1.5574077246549045d);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7615941559557649d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8414709848078971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0176614589589157d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6055965365175096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0137651267062167d + "'", double1 == 1.0137651267062167d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (-53));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-53L) + "'", long1 == (-53L));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6483608274590866d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.941208504361988d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8177863461186085d), 0.0034800731177357003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0034800731177357003d + "'", double2 == 0.0034800731177357003d);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.017065175308356183d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0125173861454009d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7813863964118539d + "'", double1 == 0.7813863964118539d);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999835160613d + "'", double1 == 0.9999999835160613d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (-3L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.0461741978670857E-4d), 0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0741466672417709d + "'", double2 == 0.0741466672417709d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0522257274488631d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9838566398996358d) + "'", double1 == (-0.9838566398996358d));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.000000000000014d + "'", double1 == 36.000000000000014d);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        double double1 = org.apache.commons.math.util.FastMath.log1p(147.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8975275723469739d, 1.5574077246549045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5228075827238494d + "'", double2 == 0.5228075827238494d);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.241721948438556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5677016102904182d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3600090218323042E19d + "'", double2 == 3.3600090218323042E19d);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.053086467974937d + "'", double1 == 3.053086467974937d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        double double2 = org.apache.commons.math.util.FastMath.max(1.570705526935434d, 4.967145917811647d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.967145917811647d + "'", double2 == 4.967145917811647d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(363.7080191456556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.138127355756959d + "'", double1 == 7.138127355756959d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43930669835763825d) + "'", double1 == (-0.43930669835763825d));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1032762973918335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0426842879669972d + "'", double1 == 0.0426842879669972d);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1736535179105314d + "'", double1 == 0.1736535179105314d);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6146685600490525d + "'", double1 == 5.6146685600490525d);
    }
}

