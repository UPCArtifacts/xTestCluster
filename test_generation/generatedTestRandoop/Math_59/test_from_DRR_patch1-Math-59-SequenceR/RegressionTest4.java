import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5804096620472413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double double1 = org.apache.commons.math.util.FastMath.tan(18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12506129236784067d) + "'", double1 == (-0.12506129236784067d));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double double1 = org.apache.commons.math.util.FastMath.cosh(62.945847461890764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0864361697580084E27d + "'", double1 == 1.0864361697580084E27d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double double1 = org.apache.commons.math.util.FastMath.asinh(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.6347792607040605d, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.343298655311511d + "'", double2 == 1.343298655311511d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5740225962860341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5550865170854293d) + "'", double1 == (-0.5550865170854293d));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.466391323325752E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 53);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double double1 = org.apache.commons.math.util.FastMath.log(192.2171757448326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.258625856460398d + "'", double1 == 5.258625856460398d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7842626635876098d, (-0.9668078739084817d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2648394832966439d + "'", double2 == 1.2648394832966439d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9394207128713856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5584988834922742d + "'", double1 == 1.5584988834922742d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1207822376352453d), 0.47402420806417284d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.16393896798747645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0134681161954513d + "'", double1 == 1.0134681161954513d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7464968867258404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013028828529253068d) + "'", double1 == (-0.013028828529253068d));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9980845732903538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.3600090218323042E19d, (-3.0461742449770714E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9863974400017405d + "'", double2 == 0.9863974400017405d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3693207897104474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.690128972137646d + "'", double1 == 10.690128972137646d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 1L, 2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46364760900080604d + "'", double2 == 0.46364760900080604d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4190835757175786d + "'", double1 == 1.4190835757175786d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6283488663257064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7386831067060273d + "'", double1 == 0.7386831067060273d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6621341344260797d + "'", double1 == 0.6621341344260797d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double double1 = org.apache.commons.math.util.FastMath.rint(103504.4889592901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103504.0d + "'", double1 == 103504.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7393694191795738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8321333235457969d + "'", double1 == 0.8321333235457969d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0034800731177357003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003480087166787292d + "'", double1 == 0.003480087166787292d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.36945265746442124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-21.168078002603806d) + "'", double1 == (-21.168078002603806d));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        long long1 = org.apache.commons.math.util.FastMath.round(6.38905609893065d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.58601345231343E15d + "'", double1 == 1.58601345231343E15d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.30364342573864755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3036434257386476d + "'", double1 == 0.3036434257386476d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.5553480614894135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8855630621884312d + "'", double1 == 1.8855630621884312d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5019419896466207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008760540373344821d + "'", double1 == 0.008760540373344821d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.88178419700125E-16d + "'", double1 == 8.88178419700125E-16d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.478987859894819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(34.99999999999999d, (-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.999999999999986d + "'", double2 == 34.999999999999986d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double double1 = org.apache.commons.math.util.FastMath.tan(90.01446758943851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9251568576324245d) + "'", double1 == (-1.9251568576324245d));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7245474750742176d + "'", double1 == 0.7245474750742176d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.883230432587404d + "'", double1 == 0.883230432587404d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.6055965365175096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993945338097157d + "'", double1 == 0.9993945338097157d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(62.945847461890764d, 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.94584746189076d + "'", double2 == 62.94584746189076d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5019419896466207d, 0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5019419896466208d + "'", double2 == 0.5019419896466208d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.029840281693512497d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.385849999980594d + "'", double1 == 1.385849999980594d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double double2 = org.apache.commons.math.util.FastMath.min(7.2638973976934564E18d, 35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.2947960259678524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29054468128588473d + "'", double1 == 0.29054468128588473d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double double1 = org.apache.commons.math.util.FastMath.acos(2005.3522829578812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3744449684274126E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double double2 = org.apache.commons.math.util.FastMath.min(1.264102998611546d, (-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8554182836643193d) + "'", double2 == (-0.8554182836643193d));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.01791180959569d) + "'", double1 == (-100.01791180959569d));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.41671114415975274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4426335746777788d + "'", double1 == 0.4426335746777788d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091340L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.506844020238002d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7813863964118539d, 1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7813863964118539d + "'", double2 == 0.7813863964118539d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 53L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9916299884373267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9916299884373266d) + "'", double1 == (-0.9916299884373266d));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0000305177333457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7183647855248692d + "'", double1 == 1.7183647855248692d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.283585074390262d + "'", double1 == 0.283585074390262d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7253825588523148d + "'", double1 == 1.7253825588523148d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.47381472041445105d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7183647855248692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9376658284517877d + "'", double1 == 0.9376658284517877d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4576692332118568d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        double double1 = org.apache.commons.math.util.FastMath.log10(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.146128035678238d + "'", double1 == 1.146128035678238d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.7568396789787597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9985221050176076d + "'", double1 == 1.9985221050176076d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3887317335324654d + "'", double1 == 1.3887317335324654d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20321057778875d + "'", double1 == 74.20321057778875d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2134887868481213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2134887868481213d + "'", double1 == 0.2134887868481213d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double double2 = org.apache.commons.math.util.FastMath.min(4.967145917811647d, 4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.574710978503383d + "'", double2 == 4.574710978503383d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761594155955765d + "'", double1 == 0.761594155955765d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4933710115259213d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double double1 = org.apache.commons.math.util.FastMath.log((-77.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.9209970573119075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.920997057311908d + "'", double1 == 2.920997057311908d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5574077246549023d) + "'", double2 == (-1.5574077246549023d));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 6L, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        float float2 = org.apache.commons.math.util.FastMath.min(28.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.024068905282849447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2887257020028306d + "'", double1 == 0.2887257020028306d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.3600090218323042E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.3284512750821519d), 0.06254420428363117d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06254420428363117d + "'", double2 == 0.06254420428363117d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999536041141d + "'", double1 == 0.9999999536041141d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5740524125174076d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9903301413773639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009716915305559164d) + "'", double1 == (-0.009716915305559164d));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double double1 = org.apache.commons.math.util.FastMath.cos(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065064d + "'", double1 == 0.8342233605065064d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6904492636009615d), 2.752220392306203d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078966d + "'", double1 == 0.8414709848078966d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3964729204944982d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.901922893385097d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double double1 = org.apache.commons.math.util.FastMath.acosh(12.240517442917666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.196225985111386d + "'", double1 == 3.196225985111386d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09485891347262353d + "'", double1 == 0.09485891347262353d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.306831672164945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.103458524115279d + "'", double1 == 2.103458524115279d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11886728987977911d) + "'", double1 == (-0.11886728987977911d));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7813863964118539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10713415391836659d) + "'", double1 == (-0.10713415391836659d));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        long long1 = org.apache.commons.math.util.FastMath.abs(232L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 232L + "'", long1 == 232L);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.06053382777729324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060496865085628314d + "'", double1 == 0.060496865085628314d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 0, 12.232006459765387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.003480087166787292d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double double2 = org.apache.commons.math.util.FastMath.min((-14.148409796207115d), (-0.17062332315326462d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-14.148409796207115d) + "'", double2 == (-14.148409796207115d));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6399307720594023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6027624231806457d) + "'", double1 == (-0.6027624231806457d));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8369386687558497d + "'", double1 == 0.8369386687558497d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2519457609704085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0975855140010009d + "'", double1 == 0.0975855140010009d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5597919847479074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.07371813130684d + "'", double1 == 32.07371813130684d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 53, (double) 232L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 232.0d + "'", double2 == 232.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.1532366900854942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1484294459615878d + "'", double1 == 1.1484294459615878d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1276321542566607d + "'", double1 == 1.1276321542566607d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.837411977130465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9425687912622992d + "'", double1 == 0.9425687912622992d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.51718181260188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9171523356672744d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.24107101134909706d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8414709848078966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.005440157440537665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        double double1 = org.apache.commons.math.util.FastMath.acos(601302.1420828041d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double double2 = org.apache.commons.math.util.FastMath.pow(1477896.0d, 1.3235780930645507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.465566310769166E8d + "'", double2 == 1.465566310769166E8d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 153.91803466365488d + "'", double1 == 153.91803466365488d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948681d + "'", double1 == 1.5707963267948681d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3774620981682702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7226995482024658d + "'", double1 == 0.7226995482024658d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.30364342573864755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2947960259678524d + "'", double1 == 0.2947960259678524d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3774620981682702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9903301413773639d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9903301413773639d + "'", double2 == 0.9903301413773639d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        double double1 = org.apache.commons.math.util.FastMath.abs(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        double double1 = org.apache.commons.math.util.FastMath.acos(104.94395111059708d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        float float2 = org.apache.commons.math.util.FastMath.min(2.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.425305228849993d, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23322795531568172d + "'", double2 == 0.23322795531568172d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(153.91803466365488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.406370728930153d + "'", double1 == 12.406370728930153d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(192.2131105221355d, (-5.260052243696693d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 192.21311052213548d + "'", double2 == 192.21311052213548d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0000305177333457d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.4933710115259213d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-28.268076694535583d) + "'", double1 == (-28.268076694535583d));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2648394832966439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.542524056185831d + "'", double1 == 2.542524056185831d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.146128035678238d, 1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948841d + "'", double2 == 1.5707963267948841d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.344162252208615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707963267948841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380965292d + "'", double1 == 4.810477380965292d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.7507239941348802d), (-1.2266354000930777d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2266354000930777d) + "'", double2 == (-1.2266354000930777d));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double double1 = org.apache.commons.math.util.FastMath.sinh(72.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.293358726420639E30d + "'", double1 == 9.293358726420639E30d);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0864361697580084E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.945847461890764d + "'", double1 == 62.945847461890764d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        double double1 = org.apache.commons.math.util.FastMath.rint((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.013388202148675738d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092895507818E-7d + "'", double1 == 1.192092895507818E-7d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5037324957145496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008791790599507117d + "'", double1 == 0.008791790599507117d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 248.5313787931064d + "'", double1 == 248.5313787931064d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-3.046174197867085E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0461741978670846E-4d) + "'", double1 == (-3.0461741978670846E-4d));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7601945740163978d, 0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8549344892399791d + "'", double2 == 0.8549344892399791d);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.055287372175112d) + "'", double1 == (-1.055287372175112d));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        double double2 = org.apache.commons.math.util.FastMath.min(2.1556157735575975E15d, 1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2715542753135176d + "'", double2 == 1.2715542753135176d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        long long1 = org.apache.commons.math.util.FastMath.round(71.81168591902457d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72L + "'", long1 == 72L);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 297.64804761090545d + "'", double1 == 297.64804761090545d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6921231068842162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.430999064953d + "'", double1 == 4.430999064953d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.550163776892725E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6099169425432279d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20057203709370552d + "'", double2 == 0.20057203709370552d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5507.0d + "'", double1 == 5507.0d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.3284512750821519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3981687043439948d) + "'", double1 == (-0.3981687043439948d));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double double2 = org.apache.commons.math.util.FastMath.min(0.901922893385097d, 0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6360918665423811d + "'", double2 == 0.6360918665423811d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.810295527926742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.740687539890472d + "'", double1 == 0.740687539890472d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.18422346241992235d, 1.2704418874297039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18422346241992238d + "'", double2 == 0.18422346241992238d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.18367240047815075d), 3.9481480091340625E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308236d + "'", double1 == 57.29577951308236d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.389056098930649d + "'", double1 == 7.389056098930649d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9414463710587447d + "'", double1 == 0.9414463710587447d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9445209155423233d, 2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2204460492503128E-16d + "'", double2 == 2.2204460492503128E-16d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        double double1 = org.apache.commons.math.util.FastMath.log(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.584730797999763d + "'", double1 == 3.584730797999763d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9376658284517877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06436165309773824d) + "'", double1 == (-0.06436165309773824d));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        double double1 = org.apache.commons.math.util.FastMath.atanh(192.21311052213548d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        float float2 = org.apache.commons.math.util.FastMath.min(53.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.725283738478314d + "'", double1 == 28.725283738478314d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9226350743220142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03497003954460952d) + "'", double1 == (-0.03497003954460952d));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7433261306201424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.716325081321902d + "'", double1 == 4.716325081321902d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5467250970042679d, 0.999846751001702d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5466217204533386d + "'", double2 == 1.5466217204533386d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.40859244341429657d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6080872397649995d, 3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16820452546122452d + "'", double2 == 0.16820452546122452d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        double double2 = org.apache.commons.math.util.FastMath.min(1.193861478082777d, 3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.193861478082777d + "'", double2 == 1.193861478082777d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        long long2 = org.apache.commons.math.util.FastMath.max(232L, (long) 53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 232L + "'", long2 == 232L);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785475506d + "'", double1 == 1.0232274785475506d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29225491648198393d + "'", double1 == 0.29225491648198393d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.0996411683627738d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0996411683627738d + "'", double1 == 1.0996411683627738d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0118543769141768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0118543769141768d + "'", double1 == 1.0118543769141768d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490457723982544d + "'", double1 == 1.2490457723982544d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.4219132975121505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.258625856460398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09178033532574068d + "'", double1 == 0.09178033532574068d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-25.170419727719406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999882881d) + "'", double1 == (-0.9999999999882881d));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.013028828529253068d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013028091363139859d) + "'", double1 == (-0.013028091363139859d));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9960820508065507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.06436165309773824d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06445067165256874d) + "'", double1 == (-0.06445067165256874d));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4486454104648996d + "'", double1 == 1.4486454104648996d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.03497003954460952d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03497717096803514d) + "'", double1 == (-0.03497717096803514d));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        long long2 = org.apache.commons.math.util.FastMath.min(72L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597823967d + "'", double1 == 21.487562597823967d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        double double1 = org.apache.commons.math.util.FastMath.abs(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        double double2 = org.apache.commons.math.util.FastMath.min(0.03490658503988659d, (-1.3262569125794328d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3262569125794328d) + "'", double2 == (-1.3262569125794328d));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        double double2 = org.apache.commons.math.util.FastMath.min(2.7568396789787606d, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097588d) + "'", double2 == (-0.5063656411097588d));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7853424278235795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5796102331491001d + "'", double1 == 0.5796102331491001d);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7346342576927686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012821786594683294d + "'", double1 == 0.012821786594683294d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.219022125506721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5441790509547393d + "'", double1 == 1.5441790509547393d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.831008000716577E22d, (-1.945982489867764E-83d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.131776110801955d), 9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.306831672164943d + "'", double2 == 9.306831672164943d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.40604869080352307d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.446441332248135d, 9.306831672164945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4464413322481353d + "'", double2 == 1.4464413322481353d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8713868162390155d, 0.23322795531568172d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.309274745959981d + "'", double2 == 1.309274745959981d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1920928955078125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.942385152878742d) + "'", double1 == (-15.942385152878742d));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        double double1 = org.apache.commons.math.util.FastMath.atan((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5578545843443006d) + "'", double1 == (-1.5578545843443006d));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2645189576252271d + "'", double1 == 1.2645189576252271d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.016146870580322156d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5716776679087391d, 3.7242338042509196E-22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        double double1 = org.apache.commons.math.util.FastMath.log10(88.62082012530739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9475357648137084d + "'", double1 == 1.9475357648137084d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.633123935319537E16d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.542524056185831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.3951915922832345d + "'", double1 == 6.3951915922832345d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double double2 = org.apache.commons.math.util.FastMath.max(2.688117141816135E43d, (-0.10713415391836659d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.688117141816135E43d + "'", double2 == 2.688117141816135E43d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.151665335034499d + "'", double1 == 1.151665335034499d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6691306779508364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8746553975600757d + "'", double1 == 0.8746553975600757d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9122545643872476d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9122545643872476d + "'", double1 == 0.9122545643872476d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8401374852128212d + "'", double1 == 0.8401374852128212d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4944324908505626d), 0.4576692332118569d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.478987859894819d, 0.8813735870195429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.4789878598948185d + "'", double2 == 7.4789878598948185d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5578300447656458d) + "'", double1 == (-0.5578300447656458d));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5748946607304181d) + "'", double1 == (-0.5748946607304181d));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7871071944553747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 102.39369977975828d + "'", double1 == 102.39369977975828d);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.2638973976934584E18d + "'", double1 == 7.2638973976934584E18d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.066379232596407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9171523356672745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999500037496876d + "'", double1 == 0.9999500037496876d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800076512800236d + "'", double1 == 0.011800076512800236d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-21.168078002603806d), (-0.5945153260434693d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.598874411320368d) + "'", double2 == (-1.598874411320368d));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2947960259678524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2947960259678524d + "'", double1 == 0.2947960259678524d);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        long long1 = org.apache.commons.math.util.FastMath.round(601302.1420828041d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 601302L + "'", long1 == 601302L);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        double double1 = org.apache.commons.math.util.FastMath.atanh(11.147713248144797d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.465566310769166E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.005440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.620554677378945d) + "'", double1 == (-3.620554677378945d));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 72L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.761594155955765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9534903170187387d + "'", double1 == 0.9534903170187387d);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6032754731892245d + "'", double1 == 0.6032754731892245d);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        long long1 = org.apache.commons.math.util.FastMath.round(0.00875022181505636d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9668078739084817d), 5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9668078739084816d) + "'", double2 == (-0.9668078739084816d));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.017066003704239316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.550646685718122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-47.34153258046857d) + "'", double1 == (-47.34153258046857d));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double double1 = org.apache.commons.math.util.FastMath.asin(11013.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1918237706995551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9290452453166923d + "'", double1 == 0.9290452453166923d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        double double1 = org.apache.commons.math.util.FastMath.log10(11013.232874703413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.04191482247339d + "'", double1 == 4.04191482247339d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.07414666724177091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07428284612878822d + "'", double1 == 0.07428284612878822d);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.18367240047815075d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.697222728536797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 326.4268172911656d + "'", double1 == 326.4268172911656d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.683604680594733d + "'", double1 == 3.683604680594733d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.881373587019543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9587823055625927d + "'", double1 == 0.9587823055625927d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6448247459530039d) + "'", double1 == (-0.6448247459530039d));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (-53L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.007987835004624685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007987835004624686d + "'", double1 == 0.007987835004624686d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4667411450004126E-10d, (-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4667411450004123E-10d + "'", double2 == 1.4667411450004123E-10d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.492756561291529d) + "'", double1 == (-12.492756561291529d));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double double2 = org.apache.commons.math.util.FastMath.min(35.0d, 3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.03497003954460952d), (-0.9668078739084816d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.034970039544609526d) + "'", double2 == (-0.034970039544609526d));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.478987859894819d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7922335744099077d, 55.935259408454094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7922335744099078d + "'", double2 == 0.7922335744099078d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2479811090512842d + "'", double1 == 1.2479811090512842d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.15467958605816817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1672838871475522d + "'", double1 == 1.1672838871475522d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22026.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.309274745959981d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3862943611198906d, 2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.429982300184234d + "'", double2 == 2.429982300184234d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4097917119315355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8874498938378453d + "'", double1 == 0.8874498938378453d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0145592787614723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6084415934065646d + "'", double1 == 1.6084415934065646d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.30364342573864755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29899893506723685d + "'", double1 == 0.29899893506723685d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3433588908440404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2951731125517142d + "'", double1 == 0.2951731125517142d);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963263292353d + "'", double1 == 1.5707963263292353d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9465430622761263d, 0.8746553975600757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.82485040608572d + "'", double2 == 0.82485040608572d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2005.3522829578812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2.1317761108019555d), (-0.009606545630105158d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6691306779508364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5123029387691214d + "'", double1 == 0.5123029387691214d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.192092895507818E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004921566601151856d + "'", double1 == 0.004921566601151856d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3887317335324654d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.703530868239122d + "'", double1 == 2.703530868239122d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.0741994078890014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2753131426959097d + "'", double1 == 1.2753131426959097d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1938614780827772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 72L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 72);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72L + "'", long1 == 72L);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        float float2 = org.apache.commons.math.util.FastMath.min(53.0f, (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06981317007977318d + "'", double1 == 0.06981317007977318d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5L, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        double double2 = org.apache.commons.math.util.FastMath.min(0.473814720414451d, 435.6527582312547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.473814720414451d + "'", double2 == 0.473814720414451d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, 232.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5019419896466207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5232861274297399d + "'", double1 == 0.5232861274297399d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.264102998611546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1577081214246037d + "'", double1 == 3.1577081214246037d);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.1559057424196283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1559057424196283d + "'", double1 == 0.1559057424196283d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 601302L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7966043547446022d, 0.0426842879669972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7966043547446022d + "'", double2 == 0.7966043547446022d);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 3);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5578545843443006d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7464968867258404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7464968867258402d) + "'", double1 == (-0.7464968867258402d));
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9019228933850969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9496962111038966d + "'", double1 == 0.9496962111038966d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int int2 = org.apache.commons.math.util.FastMath.min(72, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0413759433029089E23d + "'", double1 == 1.0413759433029089E23d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5127742681331149d, 17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.512774268133115d + "'", double2 == 0.512774268133115d);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.397318034091222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097588d) + "'", double1 == (-0.5063656411097588d));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5716776679087391d + "'", double1 == 0.5716776679087391d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5467250970042676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.696065812452068d + "'", double1 == 4.696065812452068d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        double double2 = org.apache.commons.math.util.FastMath.min(0.45964128639085955d, 0.1559057424196283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1559057424196283d + "'", double2 == 0.1559057424196283d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        double double1 = org.apache.commons.math.util.FastMath.log(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2086845112949163d + "'", double1 == 1.2086845112949163d);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.712293689529172E-39d, 0.881373587019543d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.137830415726692E-34d + "'", double2 == 3.137830415726692E-34d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1918237706995551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8311436343658638d + "'", double1 == 0.8311436343658638d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45593812776599624d + "'", double1 == 0.45593812776599624d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 72L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5569083308639295d + "'", double1 == 1.5569083308639295d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.193861478082777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2997987378517206d + "'", double1 == 3.2997987378517206d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7580564974852393d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5314237783053722d) + "'", double1 == (-0.5314237783053722d));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8414709848078971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4472512595643944d) + "'", double1 == (-0.4472512595643944d));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.06053382777729324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06057085833608861d + "'", double1 == 0.06057085833608861d);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1484294459615878d, 0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09950371902099892d + "'", double2 == 0.09950371902099892d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9867447596767658d) + "'", double1 == (-0.9867447596767658d));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.20890535952418d + "'", double1 == 148.20890535952418d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.014930974924027406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8537394163269078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7740840138843887d + "'", double1 == 0.7740840138843887d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.08619966571131166d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4417418312298101d) + "'", double1 == (-0.4417418312298101d));
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9465430622761263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.584491534932266d + "'", double1 == 0.584491534932266d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6L, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-100.30909595621492d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2835736696417744d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.23322795531568172d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5597919847479074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9560273016457694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.416347758287445d + "'", double1 == 1.416347758287445d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        double double1 = org.apache.commons.math.util.FastMath.exp(69.84482292460207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1538784231553383E30d + "'", double1 == 2.1538784231553383E30d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5302764730926062d + "'", double1 == 1.5302764730926062d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4576692332118568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5803861773395896d + "'", double1 == 0.5803861773395896d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 4L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8975275723469739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8975275723469739d + "'", double1 == 0.8975275723469739d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        double double2 = org.apache.commons.math.util.FastMath.max(4.691649480399158E41d, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.691649480399158E41d + "'", double2 == 4.691649480399158E41d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.0461741978670873E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5711009442193944d + "'", double1 == 1.5711009442193944d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9980845732903537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5088925547167915d + "'", double1 == 1.5088925547167915d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        double double1 = org.apache.commons.math.util.FastMath.atan((-5.260052243696693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3829261109163618d) + "'", double1 == (-1.3829261109163618d));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7469280195077934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3740813228449729d) + "'", double1 == (-1.3740813228449729d));
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.429982300184234d, 10.690128972137646d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13247.898147933502d + "'", double2 == 13247.898147933502d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(12.232006459765387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.232006459765389d + "'", double1 == 12.232006459765389d);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.0034800731177357003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034800731177357003d + "'", double1 == 0.0034800731177357003d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6399307720594023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.45593812776599624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4559381277659963d + "'", double1 == 0.4559381277659963d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9495963644937304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2519457609704083d + "'", double1 == 1.2519457609704083d);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.507288054547833E-32d + "'", double1 == 5.507288054547833E-32d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.421010862427522E-20d, 31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7158126647533047E-21d + "'", double2 == 1.7158126647533047E-21d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5803861773395896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        double double1 = org.apache.commons.math.util.FastMath.floor((-3.0461742449770714E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        double double2 = org.apache.commons.math.util.FastMath.min(14.206129690390002d, 0.9556244815546298d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9556244815546298d + "'", double2 == 0.9556244815546298d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-3L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        long long1 = org.apache.commons.math.util.FastMath.round(34.982780458176066d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483648E9d + "'", double1 == 2.147483648E9d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(12.240517442917666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3046231798951236d + "'", double1 == 2.3046231798951236d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        double double1 = org.apache.commons.math.util.FastMath.cosh(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.2947960259678524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9568614257960677d + "'", double1 == 0.9568614257960677d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.005440157440537665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1758748835347331d) + "'", double1 == (-0.1758748835347331d));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        long long1 = org.apache.commons.math.util.FastMath.round(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 28L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.860761315262648E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.06057085833608861d, (-0.5314237783053722d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0605708583360886d + "'", double2 == 0.0605708583360886d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9980845732903538d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9980845732903537d + "'", double2 == 0.9980845732903537d);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.7242338042509196E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.93006726156715E14d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.449489742783178d + "'", double1 == 2.449489742783178d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.598780889335082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.946997808922293d + "'", double1 == 4.946997808922293d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7245451197632213d, 1.3980038919397375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3980038919397375d + "'", double2 == 1.3980038919397375d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7311284168939934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int1 = org.apache.commons.math.util.FastMath.round(5.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (-53));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5519306407732258d) + "'", double1 == (-1.5519306407732258d));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0954243259038507d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.072791990708367E38d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        double double1 = org.apache.commons.math.util.FastMath.tan(10.690128972137646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1714543991571844d + "'", double1 == 3.1714543991571844d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        double double1 = org.apache.commons.math.util.FastMath.log(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.657359027997266d) + "'", double1 == (-34.657359027997266d));
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3980038919397375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.09972275101016d + "'", double1 == 80.09972275101016d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837632613846286d) + "'", double1 == (-0.008837632613846286d));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.060496865085628314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060423223162373904d + "'", double1 == 0.060423223162373904d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.83752767994986d + "'", double1 == 0.83752767994986d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065871571457463d + "'", double1 == 0.6065871571457463d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5397993958058634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49283610173314196d + "'", double1 == 0.49283610173314196d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(31.983924344986402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1832.543877233447d + "'", double1 == 1832.543877233447d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.196094775945863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1936377322502389d + "'", double1 == 0.1936377322502389d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9903301413773639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017284521648775933d + "'", double1 == 0.017284521648775933d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1672838871475522d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.272392748970048d + "'", double2 == 1.272392748970048d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        double double1 = org.apache.commons.math.util.FastMath.sinh(31.59442154605463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.631800352235365E13d + "'", double1 == 2.631800352235365E13d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0605708583360886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        double double1 = org.apache.commons.math.util.FastMath.sinh(43.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3639197341146732E18d + "'", double1 == 2.3639197341146732E18d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7490362681090366d, 3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2060558457269698d + "'", double2 == 0.2060558457269698d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int2 = org.apache.commons.math.util.FastMath.min((-3), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5466217204533386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.3576616065595d + "'", double1 == 41.3576616065595d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-3.046174197867085E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0466382509707714E-4d) + "'", double1 == (-3.0466382509707714E-4d));
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9495963644937304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0988845141611678d + "'", double1 == 1.0988845141611678d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9668078739084816d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(28.725283738478314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.725283738478318d + "'", double1 == 28.725283738478318d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double double1 = org.apache.commons.math.util.FastMath.cos((-47.34153258046857d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9764091535367482d) + "'", double1 == (-0.9764091535367482d));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707963263292353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }
}

