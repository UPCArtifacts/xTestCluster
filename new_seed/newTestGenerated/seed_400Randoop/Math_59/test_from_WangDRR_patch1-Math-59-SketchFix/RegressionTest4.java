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
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5364951284461146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9115295367046072d + "'", double1 == 0.9115295367046072d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.1742549955138671d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1662915285707838d + "'", double1 == 2.1662915285707838d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7103669532614669d, 0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28111738892954613d + "'", double2 == 0.28111738892954613d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double double1 = org.apache.commons.math.util.FastMath.tan(92560.48544260226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26485486485821585d) + "'", double1 == (-0.26485486485821585d));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double1 = org.apache.commons.math.util.FastMath.log(0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6997678580926362d) + "'", double1 == (-0.6997678580926362d));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.381919166334245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.366643026452033d + "'", double1 == 5.366643026452033d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.567739246697935d + "'", double1 == 1.567739246697935d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3140833526702298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5604313987190848d + "'", double1 == 0.5604313987190848d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.4541594839761731d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4881954908148405d) + "'", double1 == (-0.4881954908148405d));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math.util.FastMath.cosh(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567266E14d + "'", double1 == 7.930067261567266E14d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7023967071298747d + "'", double1 == 0.7023967071298747d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7162579075638862d, (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.097129110263696d + "'", double2 == 2.097129110263696d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5521802813382803d + "'", double1 == 0.5521802813382803d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.002628524305939983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026285182523425486d + "'", double1 == 0.0026285182523425486d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3283909087132567d + "'", double1 == 0.3283909087132567d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.403108691968676E-6d, (-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1764.9013237338472d + "'", double2 == 1764.9013237338472d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1477896L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.425477704824782d + "'", double1 == 12.425477704824782d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.121587127777053E-5d, 0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002205222282650664d + "'", double2 == 0.002205222282650664d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5423560824282998d + "'", double1 == 1.5423560824282998d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007582068426303211d + "'", double1 == 0.007582068426303211d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1003275537854505E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.2245999714347802d), 0.766978271236858d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.303190128915375d + "'", double1 == 4.303190128915375d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6934058165391472d, 1.2245999714347802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1440689579547698d + "'", double2 == 1.1440689579547698d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4073861552074949d + "'", double1 == 1.4073861552074949d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3964729204944982d + "'", double1 == 0.3964729204944982d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625951d + "'", double1 == 0.9999092042625951d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38714087209326337d + "'", double1 == 0.38714087209326337d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.999999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806318343896785E8d + "'", double1 == 4.806318343896785E8d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        long long1 = org.apache.commons.math.util.FastMath.round(5.293329949408896d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.691649480399158E41d + "'", double1 == 4.691649480399158E41d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9171523356672743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672742d) + "'", double1 == (-0.9171523356672742d));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        float float1 = org.apache.commons.math.util.FastMath.abs(8.4677176E7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.4677176E7f + "'", float1 == 8.4677176E7f);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-8.711666086263719d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1d + "'", double1 == 0.1d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double double1 = org.apache.commons.math.util.FastMath.sin((-33.10480098881463d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9930368739582951d) + "'", double1 == (-0.9930368739582951d));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.357332604544835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.2638973976934564E18d, 0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.2638973976934554E18d + "'", double2 == 7.2638973976934554E18d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45967525618227173d) + "'", double1 == (-0.45967525618227173d));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7076312586751927d) + "'", double1 == (-0.7076312586751927d));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7219067166708869d) + "'", double1 == (-0.7219067166708869d));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(96.10655605346268d, 0.766978271236858d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.10655605346267d + "'", double2 == 96.10655605346267d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4344205208065718d, 9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.43442052080657173d + "'", double2 == 0.43442052080657173d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.03673618878368824d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double double1 = org.apache.commons.math.util.FastMath.floor(28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.0d + "'", double1 == 28.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double double2 = org.apache.commons.math.util.FastMath.min((-86.33580274416312d), (double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-86.33580274416312d) + "'", double2 == (-86.33580274416312d));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5344625446055697d + "'", double1 == 0.5344625446055697d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.380515006246586d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4274266235030733d + "'", double1 == 1.4274266235030733d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3574158419544757d, 2.217380259166629d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3574158419544757d + "'", double2 == 1.3574158419544757d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4251053392695819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.35674178862402d + "'", double1 == 24.35674178862402d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.150849338916875d) + "'", double1 == (-1.150849338916875d));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1477896, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.053286411214247056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23083849595387476d + "'", double1 == 0.23083849595387476d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2378644027129617d + "'", double1 == 1.2378644027129617d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double double2 = org.apache.commons.math.util.FastMath.min(6.766375983153399E-7d, 0.7588984970945903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.766375983153399E-7d + "'", double2 == 6.766375983153399E-7d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.150849338916875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.6934058165391472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9908886150478887d + "'", double1 == 0.9908886150478887d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3769270190230555d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09267307410348408d + "'", double1 == 0.09267307410348408d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.736121492758925d + "'", double1 == 4.736121492758925d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double double1 = org.apache.commons.math.util.FastMath.abs((-53.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6694963894787934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7206435247136849d + "'", double1 == 0.7206435247136849d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2014038779280567d + "'", double1 == 0.2014038779280567d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double double2 = org.apache.commons.math.util.FastMath.min(7.930067261567266E14d, 9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.989078815390096E-4d + "'", double2 == 9.989078815390096E-4d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615560214388488d + "'", double1 == 0.7615560214388488d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5408212093041704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.14028675761500198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13937364645376973d + "'", double1 == 0.13937364645376973d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double double1 = org.apache.commons.math.util.FastMath.log(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10757413843619562d) + "'", double1 == (-0.10757413843619562d));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double double1 = org.apache.commons.math.util.FastMath.rint(41.32317658130462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.0d + "'", double1 == 41.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7507239941348802d) + "'", double2 == (-1.7507239941348802d));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        float float2 = org.apache.commons.math.util.FastMath.max(52.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.021373301521365424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2775176041484217d + "'", double1 == 0.2775176041484217d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.7130053006861585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9912373278715739d + "'", double1 == 0.9912373278715739d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5574077246549018d), 0.415289655969459d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.415289655969459d + "'", double2 == 0.415289655969459d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.39709459624648236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9221885224184981d + "'", double1 == 0.9221885224184981d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        long long1 = org.apache.commons.math.util.FastMath.round(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2155615773557597L + "'", long1 == 2155615773557597L);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.16703684659955795d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6080833035834908d + "'", double1 == 0.6080833035834908d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 35.0f, (-1.0476958419065936d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02411494803001423d + "'", double2 == 0.02411494803001423d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.3480571885407375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20500081011138022d) + "'", double1 == (-0.20500081011138022d));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3292773492529157d, 5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2418689364577661d + "'", double2 == 0.2418689364577661d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8189894035458565E-12d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.194206803317586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6475439282580142d + "'", double1 == 1.6475439282580142d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.538468212281815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7692799493082574d + "'", double1 == 1.7692799493082574d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.959891290659564d) + "'", double1 == (-5.959891290659564d));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.74342314569772E-5d + "'", double1 == 1.74342314569772E-5d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.544753606236012E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.811140782249282d) + "'", double1 == (-11.811140782249282d));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2422079676186446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7835271334741006d) + "'", double1 == (-0.7835271334741006d));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6464435151825451d, 0.9665362520985106d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5894952792761199d + "'", double2 == 0.5894952792761199d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.467717607067357E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.4677176E7d + "'", double1 == 8.4677176E7d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.011032585021104841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0634370688955608d + "'", double1 == 2.0634370688955608d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5992442618287416d, 0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5992442618287416d + "'", double2 == 0.5992442618287416d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.56173368499807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6699175736806615d + "'", double1 == 1.6699175736806615d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3156563365585749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2743356563668091d + "'", double1 == 0.2743356563668091d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 53);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.724275869600789d + "'", double1 == 1.724275869600789d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.977857455908435d) + "'", double1 == (-0.977857455908435d));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double double2 = org.apache.commons.math.util.FastMath.max(3.121587127777053E-5d, 3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3036.676314193363d + "'", double2 == 3036.676314193363d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7615941559557655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662191695169732d + "'", double1 == 0.5662191695169732d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, 11013L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5013507798060324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7944146264030465d + "'", double1 == 0.7944146264030465d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double double1 = org.apache.commons.math.util.FastMath.floor(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4466128799118947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2027522105204773d + "'", double1 == 1.2027522105204773d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double double1 = org.apache.commons.math.util.FastMath.log(28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3490760817142498d + "'", double1 == 3.3490760817142498d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.270441887429704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5067985556900776d + "'", double1 == 1.5067985556900776d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0489207050997464d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2027522105204773d, 0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.070843830251405d + "'", double2 == 1.070843830251405d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double double1 = org.apache.commons.math.util.FastMath.sinh(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134338E15d + "'", double1 == 1.5860134523134338E15d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double double1 = org.apache.commons.math.util.FastMath.signum(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.021373301521365424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5494213976540494d + "'", double1 == 1.5494213976540494d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.34555558058171215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3327099519782247d) + "'", double1 == (-0.3327099519782247d));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-36));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 36.0f + "'", float1 == 36.0f);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.03422749178784308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        double double2 = org.apache.commons.math.util.FastMath.min(1.339637404328899d, 1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3023186765274486d + "'", double2 == 1.3023186765274486d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6530481872478414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6530481872478414d + "'", double1 == 0.6530481872478414d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.09267307410348408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4779900867225375d + "'", double1 == 1.4779900867225375d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.270441887429704d, 0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1877020959207132d + "'", double2 == 1.1877020959207132d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.214684851089406E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0529697638030147E-4d + "'", double1 == 2.0529697638030147E-4d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.268524170518187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.385301667943363d) + "'", double1 == (-15.385301667943363d));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2378644027129617d, (-35.35050620855721d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2378644027129615d + "'", double2 == 1.2378644027129615d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 100.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 1477896.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 303.2854656713273d + "'", double1 == 303.2854656713273d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11013.000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5708871266543591d, 100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015707579305579825d + "'", double2 == 0.015707579305579825d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6555341548275427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9261711162367936d + "'", double1 == 1.9261711162367936d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6080833035834908d, 5.637986554446436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.637986554446436d + "'", double2 == 5.637986554446436d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        float float1 = org.apache.commons.math.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625404912081631d + "'", double1 == 0.006625404912081631d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.7200109207204425d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7588984970945903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9483570980585009d + "'", double1 == 0.9483570980585009d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02187509047518678d + "'", double1 == 0.02187509047518678d);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021252051384784545d + "'", double1 == 0.021252051384784545d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.618990892446662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2083157409463713d) + "'", double1 == (-0.2083157409463713d));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.2545767570502781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25457675705027805d) + "'", double1 == (-0.25457675705027805d));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2), 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8414709848078965d, 2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 84677176L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.4677176E7f + "'", float1 == 8.4677176E7f);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4419647419307422d + "'", double1 == 1.4419647419307422d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08726646259971647d + "'", double1 == 0.08726646259971647d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double double2 = org.apache.commons.math.util.FastMath.min(3.399216241149525E248d, 0.9764996816772386d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9764996816772386d + "'", double2 == 0.9764996816772386d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9999999999999958d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152388d + "'", double1 == 1.5430806348152388d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9562645537814451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.072857379539184d + "'", double1 == 6.072857379539184d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9650846656626807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38095094490971865d + "'", double1 == 0.38095094490971865d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8849970445005177d, 1.4779900867225375d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5395250166930861d + "'", double2 == 0.5395250166930861d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7711377407401363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5625847965301676d + "'", double1 == 1.5625847965301676d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double double2 = org.apache.commons.math.util.FastMath.min(35.00000000000001d, 1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5427661770824743d + "'", double2 == 1.5427661770824743d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4271591231967482d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.363655626077857d + "'", double1 == 2.363655626077857d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5506.500045400885d, 100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5506.500045400884d + "'", double2 == 5506.500045400884d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6108652381980155d, 5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07454121709103567d + "'", double2 == 0.07454121709103567d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.856815596594d + "'", double1 == 263.856815596594d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double double1 = org.apache.commons.math.util.FastMath.exp(200.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.225973768125749E86d + "'", double1 == 7.225973768125749E86d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7615560214388488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.650856032201109d + "'", double1 == 0.650856032201109d);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.150849338916875d), 0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.150849338916875d) + "'", double2 == (-1.150849338916875d));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3707603033998556d + "'", double1 == 0.3707603033998556d);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7944146264030464d + "'", double1 == 0.7944146264030464d);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8754705787895336d) + "'", double1 == (-3.8754705787895336d));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.1720269046268665E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.81743754137065952E17d + "'", double1 == 1.81743754137065952E17d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9754001961551925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6229585671655451d) + "'", double1 == (-0.6229585671655451d));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5692708962822441d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5422969773856958d + "'", double1 == 0.5422969773856958d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        double double1 = org.apache.commons.math.util.FastMath.tanh(127.14212645660416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.294660173051446d + "'", double1 == 5.294660173051446d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.14028675761500198d, 0.003761435487319938d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9926395119337849d + "'", double2 == 0.9926395119337849d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 149L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.194206803317586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.293329949408896d, (-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003576212944920802d + "'", double2 == 0.003576212944920802d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8207422758720628d, 41.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8207422758720628d + "'", double2 == 0.8207422758720628d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 11013, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7813318292761458d + "'", double1 == 1.7813318292761458d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        double double1 = org.apache.commons.math.util.FastMath.tanh(24.35674178862402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0530864679749365d + "'", double1 == 3.0530864679749365d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.002205222282650664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002205222282650664d + "'", double1 == 0.002205222282650664d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6868023880361244d + "'", double1 == 0.6868023880361244d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.614586012538512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9115295367046072d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9125908874543283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.770607976886994d + "'", double1 == 5.770607976886994d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        double double1 = org.apache.commons.math.util.FastMath.expm1(13.596393407514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 803226.6141649d + "'", double1 == 803226.6141649d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7621956910836314d + "'", double1 == 3.7621956910836314d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5552986459319043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        double double1 = org.apache.commons.math.util.FastMath.tan((-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2136609872391593d) + "'", double1 == (-0.2136609872391593d));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double double1 = org.apache.commons.math.util.FastMath.cosh(44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.388020644993609E19d + "'", double1 == 1.388020644993609E19d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707963267948957d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1477896, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.357332604544835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.857530727509168d + "'", double1 == 0.857530727509168d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        double double1 = org.apache.commons.math.util.FastMath.abs((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.26503394947866d + "'", double1 == 77.26503394947866d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double double1 = org.apache.commons.math.util.FastMath.log(0.08726646259971647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.43878905260671d) + "'", double1 == (-2.43878905260671d));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.03422749178784308d), 90.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03422749178784308d) + "'", double2 == (-0.03422749178784308d));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        double double2 = org.apache.commons.math.util.FastMath.min(7.2638973976934554E18d, 0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9171523356672744d + "'", double2 == 0.9171523356672744d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5785812223437699d) + "'", double1 == (-0.5785812223437699d));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7944146264030464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013865150856733838d + "'", double1 == 0.013865150856733838d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.04617424497707E-4d) + "'", double1 == (-3.04617424497707E-4d));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int int1 = org.apache.commons.math.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.217380259166629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.217380259166629d + "'", double1 == 2.217380259166629d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707173906673306d, 0.5395250166930861d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.27585054912856d + "'", double2 == 1.27585054912856d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7017203400855395d), 0.5013507798060325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5013507798060325d + "'", double2 == 0.5013507798060325d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.5430806348152388d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.357332604544835d, 1.0148369064941645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3573326045448348d + "'", double2 == 1.3573326045448348d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3887317335324652d, 1.35007298425458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7995124161937329d + "'", double2 == 0.7995124161937329d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        double double1 = org.apache.commons.math.util.FastMath.log(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.30685281944005d + "'", double1 == 35.30685281944005d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.8754705787895336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3182714301523224d) + "'", double1 == (-1.3182714301523224d));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5195675877329186d + "'", double1 == 0.5195675877329186d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0026285333864166493d, 0.9193629443874066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00285907349248556d + "'", double2 == 0.00285907349248556d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8292136654695167d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1933463270565558d + "'", double1 == 0.1933463270565558d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.60451646247372d + "'", double1 == 22.60451646247372d);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.428182669496151d), 0.5954732329718483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5954732329718483d + "'", double2 == 0.5954732329718483d);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4785470608465352d + "'", double1 == 1.4785470608465352d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1481461824783568d + "'", double1 == 1.1481461824783568d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.28162208224762103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28162208224762103d + "'", double1 == 0.28162208224762103d);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.31712849292107215d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3118395312526729d) + "'", double1 == (-0.3118395312526729d));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        double double2 = org.apache.commons.math.util.FastMath.pow(5506.500045400885d, 0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3529804386339674d + "'", double2 == 2.3529804386339674d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.81743754137065952E17d, (-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8174375413706592E17d + "'", double2 == 1.8174375413706592E17d);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0038586340573412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.516862959253416d + "'", double1 == 57.516862959253416d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-29.500939575070156d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.500939575070152d) + "'", double1 == (-29.500939575070152d));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9132212823529585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9983608366524339d + "'", double1 == 0.9983608366524339d);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        double double1 = org.apache.commons.math.util.FastMath.cos(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3707603104765322d + "'", double1 == 0.3707603104765322d);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        double double2 = org.apache.commons.math.util.FastMath.atan2(22.18070977791825d, 2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4418411684567414d + "'", double2 == 1.4418411684567414d);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.1563686078816606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1563686078816606d + "'", double1 == 2.1563686078816606d);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        long long1 = org.apache.commons.math.util.FastMath.round(1.118870081899753d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6949948789359283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8575532158463938d + "'", double1 == 0.8575532158463938d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1411917790307853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.130497003573102d + "'", double1 == 2.130497003573102d);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5987609268125889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5128928810496862d) + "'", double1 == (-0.5128928810496862d));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4752832273511767d + "'", double1 == 1.4752832273511767d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3283064365386963E-10d + "'", double1 == 2.3283064365386963E-10d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int int1 = org.apache.commons.math.util.FastMath.round(57.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.32179921168174863d, 10.017874927409903d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3217992116817487d + "'", double2 == 0.3217992116817487d);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.017023944947506645d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4134332111535645d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4262213939948603d) + "'", double1 == (-0.4262213939948603d));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.017066003704239316d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5708649036675921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9250245035569947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3270448216204103d) + "'", double1 == (-1.3270448216204103d));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 36L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2062.6480624709634d + "'", double1 == 2062.6480624709634d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5021549377007348d + "'", double1 == 1.5021549377007348d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0833737308639964d + "'", double1 == 1.0833737308639964d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        double double1 = org.apache.commons.math.util.FastMath.asinh(572.2646479502633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.042749499570736d + "'", double1 == 7.042749499570736d);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.21722312811800157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22073986460634293d + "'", double1 == 0.22073986460634293d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5896069690147184d + "'", double1 == 0.5896069690147184d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 1.0f, 0.011800624231293426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.2545767570502781d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24928153889173274d) + "'", double1 == (-0.24928153889173274d));
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8587033066171034d + "'", double1 == 0.8587033066171034d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3092866533194534d, 0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9171523356672744d + "'", double2 == 0.9171523356672744d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-53.0f), 14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-52.99999999999999d) + "'", double2 == (-52.99999999999999d));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        double double1 = org.apache.commons.math.util.FastMath.atanh(40.76402405185421d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.37218765288965655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.536829045004206d, 32.307469852239215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5368290450042061d + "'", double2 == 1.5368290450042061d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1559274280097633d + "'", double1 == 1.1559274280097633d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0962532307185966d + "'", double1 == 3.0962532307185966d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-53));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.729577951308232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.021252051384784545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02125525174622087d + "'", double1 == 0.02125525174622087d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 3.9481478E13f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9481478479872E13d + "'", double2 == 3.9481478479872E13d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.225973768125749E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.37076030339985566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38873810163383016d + "'", double1 == 0.38873810163383016d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.692229922941576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10263239608867235d + "'", double1 == 0.10263239608867235d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.770607976886994d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        double double1 = org.apache.commons.math.util.FastMath.log(572.2646479502633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.34960155562218d + "'", double1 == 6.34960155562218d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.5068440202380022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9848929415691016d) + "'", double1 == (-0.9848929415691016d));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0026285303595876084d, 2.502154937700735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0010505062468618824d + "'", double2 == 0.0010505062468618824d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.837131699124806d) + "'", double1 == (-0.837131699124806d));
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 32, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0026285333864166493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002631991009127d + "'", double1 == 1.002631991009127d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2L, 1.9936026854386766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9823021454200065d + "'", double2 == 3.9823021454200065d);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.509011168189731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7063851457511368d + "'", double1 == 1.7063851457511368d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.130497003573102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2867484168102035d + "'", double1 == 1.2867484168102035d);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22026.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.399216241149525E248d + "'", double1 == 3.399216241149525E248d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.6934058165391472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.781934843695916d + "'", double1 == 13.781934843695916d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2130532941206642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0664977916380836d + "'", double1 == 1.0664977916380836d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int int2 = org.apache.commons.math.util.FastMath.max(53, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        long long1 = org.apache.commons.math.util.FastMath.abs(2155615773557597L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2155615773557597L + "'", long1 == 2155615773557597L);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.006492321624085E-46d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2228636002804178E-47d + "'", double1 == 1.2228636002804178E-47d);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, 8.4677176E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7586713254405011d, 41.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7586713254405011d + "'", double2 == 0.7586713254405011d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9944107743857757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.166594879293176d + "'", double1 == 1.166594879293176d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.694990094719959d) + "'", double1 == (-3.694990094719959d));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000002328306d + "'", double1 == 1.0000000002328306d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6433380240448354d + "'", double1 == 0.6433380240448354d);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 149.0f + "'", float2 == 149.0f);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.1624473515096263d), 0.41671114415975286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41671114415975286d + "'", double2 == 0.41671114415975286d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        long long1 = org.apache.commons.math.util.FastMath.round(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8662137645563011d + "'", double1 == 0.8662137645563011d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7601945740163978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.138692313968385d + "'", double1 == 2.138692313968385d);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7813863964118538d, 49.80857186097813d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7813863964118539d + "'", double2 == 0.7813863964118539d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7158569288579336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2582773960442621d) + "'", double1 == (-1.2582773960442621d));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.414213562373095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        long long2 = org.apache.commons.math.util.FastMath.max(2155615773557597L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2155615773557597L + "'", long2 == 2155615773557597L);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        double double1 = org.apache.commons.math.util.FastMath.rint(44.770142683335514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.0d + "'", double1 == 45.0d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5423560824282998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6755933871952235d + "'", double1 == 4.6755933871952235d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 10, 0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14287905018325442d + "'", double2 == 0.14287905018325442d);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double double1 = org.apache.commons.math.util.FastMath.log(0.43442052080657173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8337422720523482d) + "'", double1 == (-0.8337422720523482d));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0000000000000018d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000035623d + "'", double2 == 1.0000000000035623d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996915601943024d + "'", double1 == 0.9996915601943024d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5015887158341327d + "'", double1 == 0.5015887158341327d);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.614586012538512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.614586012538512d + "'", double1 == 0.614586012538512d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double double1 = org.apache.commons.math.util.FastMath.exp(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1720269046268675E15d + "'", double1 == 3.1720269046268675E15d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7076312586751926d) + "'", double1 == (-0.7076312586751926d));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0484411939287768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.853200064217061d + "'", double1 == 1.853200064217061d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, (float) (-36L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8199744766146694d + "'", double1 == 0.8199744766146694d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.025470578295336027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4454545364061836E-4d + "'", double1 == 4.4454545364061836E-4d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.3529804386339674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.00285907349248556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999959128521664d + "'", double1 == 0.9999959128521664d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        double double1 = org.apache.commons.math.util.FastMath.asin(1833.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9171523356672744d, (-0.9754001961551925d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9754001961551925d) + "'", double2 == (-0.9754001961551925d));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.853200064217061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9520464219027572d + "'", double1 == 0.9520464219027572d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-3.694990094719959d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.13501082303189d + "'", double1 == 20.13501082303189d);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.201488995569804d + "'", double1 == 2.201488995569804d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4868981666828483d) + "'", double1 == (-0.4868981666828483d));
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.09917726107940236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4628824377340256d + "'", double1 == 0.4628824377340256d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7542679379177583d + "'", double1 == 0.7542679379177583d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1586013452313419L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36), (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557656d + "'", double1 == 0.7615941559557656d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        double double1 = org.apache.commons.math.util.FastMath.acosh(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.267909605184542d + "'", double1 == 4.267909605184542d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26035149959480436d + "'", double1 == 0.26035149959480436d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(12.425477704824782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.316173196322488d + "'", double1 == 2.316173196322488d);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 52.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5707939236862047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5091729483939074d + "'", double1 == 2.5091729483939074d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.14074548931837635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1511316354017451d + "'", double1 == 1.1511316354017451d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20675080015374017d) + "'", double1 == (-0.20675080015374017d));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0637969690534155d + "'", double1 == 1.0637969690534155d);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3, (float) 2155615773557597L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.15561577E15f + "'", float2 == 2.15561577E15f);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6065871571457463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6065871571457463d + "'", double1 == 0.6065871571457463d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        double double2 = org.apache.commons.math.util.FastMath.max(0.003576212944920802d, 1.248867972642223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.248867972642223d + "'", double2 == 1.248867972642223d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7819722235803451d + "'", double1 == 0.7819722235803451d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0466859367662789d + "'", double1 == 1.0466859367662789d);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9177658737860996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7425442460725571d + "'", double1 == 0.7425442460725571d);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7306786685136297d + "'", double1 == 1.7306786685136297d);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7615941559557655d, (double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.356568665264778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3565686652647782d + "'", double1 == 1.3565686652647782d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        double double1 = org.apache.commons.math.util.FastMath.log10(384.43435069728696d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.584822186623346d + "'", double1 == 2.584822186623346d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8554182836643192d) + "'", double1 == (-0.8554182836643192d));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0012941034727495246d + "'", double1 == 0.0012941034727495246d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2835736696417744d, 1.1046225788468806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25128902086761173d + "'", double2 == 0.25128902086761173d);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.4677176E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.4677176E7d + "'", double1 == 8.4677176E7d);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) 1586013452313419L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.58601345E15f + "'", float2 == 1.58601345E15f);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.225973768125749E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.225973768125749E86d + "'", double1 == 7.225973768125749E86d);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-36), (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        double double2 = org.apache.commons.math.util.FastMath.min((-3.04617424497707E-4d), 1.1511316354017451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.04617424497707E-4d) + "'", double2 == (-3.04617424497707E-4d));
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 84677176L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84677176 + "'", int1 == 84677176);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        long long1 = org.apache.commons.math.util.FastMath.round(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4909189283808535d) + "'", double1 == (-0.4909189283808535d));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.452674104609824d + "'", double1 == 2.452674104609824d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7158569288579336d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8945584950807155d) + "'", double1 == (-0.8945584950807155d));
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 84677176, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        long long1 = org.apache.commons.math.util.FastMath.round(0.011800624231293426d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0026285333864166493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2764592626816607d, 0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2764592626816604d + "'", double2 == 1.2764592626816604d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5716315636979223d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5716315636979222d + "'", double2 == 0.5716315636979222d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.9481478479872E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8718162306995085d + "'", double1 == 0.8718162306995085d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.680482178387855d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6883420083174141d + "'", double1 == 0.6883420083174141d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5570698013513056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.7448973633883265d + "'", double1 == 4.7448973633883265d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 1.58601345E15f, 1.7992428657093575d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.586013445029888E15d + "'", double2 == 1.586013445029888E15d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int int1 = org.apache.commons.math.util.FastMath.round(149.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149 + "'", int1 == 149);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.7498537011943205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0516141982650264d + "'", double1 == 1.0516141982650264d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2378644027129617d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6967614701467567d + "'", double1 == 0.6967614701467567d);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.989078815390096E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.057233205734539244d + "'", double1 == 0.057233205734539244d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7200109207204425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6689830892710052d + "'", double1 == 0.6689830892710052d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001246E-16d + "'", double1 == 8.881784197001246E-16d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int int1 = org.apache.commons.math.util.FastMath.abs(11013);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.1556157735575975E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.333571352853085d + "'", double1 == 15.333571352853085d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5068440202380022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-86.33580274416313d) + "'", double1 == (-86.33580274416313d));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3458247401995457E41d + "'", double1 == 2.3458247401995457E41d);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        long long1 = org.apache.commons.math.util.FastMath.round(0.057233205734539244d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0637969690534155d, 4.85314001086485d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3500481793371046d + "'", double2 == 1.3500481793371046d);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        double double1 = org.apache.commons.math.util.FastMath.sinh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }
}

