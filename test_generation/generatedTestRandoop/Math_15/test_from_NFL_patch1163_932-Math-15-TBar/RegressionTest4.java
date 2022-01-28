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
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (-17));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999966d) + "'", double1 == (-0.9999999999999966d));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        long long1 = org.apache.commons.math3.util.FastMath.round(57.29577951308244d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        float float2 = org.apache.commons.math3.util.FastMath.max(64.0f, 6208.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6208.0f + "'", float2 == 6208.0f);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0272356433040997d, 0.9912174443839006d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027235643304099704d + "'", double2 == 0.027235643304099704d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32768, (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32768L + "'", long2 == 32768L);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.4917798526449118d, (-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4917798526449118d) + "'", double2 == (-2.4917798526449118d));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.6594942162563324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9960689204702708d + "'", double1 == 0.9960689204702708d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) -1, (long) (-2147483648));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8813616205677707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0787365865827503d + "'", double1 == 1.0787365865827503d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.04669075745245178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2160804420868575d + "'", double1 == 0.2160804420868575d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.842171E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.8421713E-14f + "'", float1 == 2.8421713E-14f);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-12.34222982222313d), 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-12638.443337956485d) + "'", double2 == (-12638.443337956485d));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.083333333333333d + "'", double1 == 3.083333333333333d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-1.5424980307488157E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 511);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 511L + "'", long1 == 511L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.3969567625600747d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-3));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int int1 = org.apache.commons.math3.util.FastMath.round((-64.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64) + "'", int1 == (-64));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-127));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5035996E15f) + "'", float2 == (-4.5035996E15f));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-6L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.006142729981775034d, (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.31604169520790676d) + "'", double2 == (-0.31604169520790676d));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.6332359729824427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.041914989933878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0741994506493335d + "'", double1 == 2.0741994506493335d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 100, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.8382668271306453E9d, 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8823852309817808E12d + "'", double2 == 1.8823852309817808E12d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double double1 = org.apache.commons.math3.util.FastMath.abs(79.68657456155307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.68657456155307d + "'", double1 == 79.68657456155307d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.1920928244535418E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962075856141d + "'", double1 == 1.5707962075856141d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 511);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.403887936206959E221d + "'", double1 == 8.403887936206959E221d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(7.737545114640002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737545114640003d + "'", double1 == 7.737545114640003d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 6208.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6208L + "'", long1 == 6208L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double double2 = org.apache.commons.math3.util.FastMath.max((-57.295779513082316d), 1.5707962635746238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707962635746238d + "'", double2 == 1.5707962635746238d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.011377788717773904d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011377788717773903d) + "'", double1 == (-0.011377788717773903d));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.999999999999998d, (-0.008837747656336603d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) ' ', (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.440892098500626E-16d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01538287103360378d) + "'", double1 == (-0.01538287103360378d));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double double1 = org.apache.commons.math3.util.FastMath.sin(6.657902725198096E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.65790272519809E-8d + "'", double1 == 6.65790272519809E-8d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.027235643304099704d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-3));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 127, 4096L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1024.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double double1 = org.apache.commons.math3.util.FastMath.abs(39.960969282839415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.960969282839415d + "'", double1 == 39.960969282839415d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.8382668271306453E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.838266827E9d + "'", double1 == 1.838266827E9d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.000000000000014d + "'", double1 == 32.000000000000014d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0000001f, 5557.690612768985d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000002f + "'", float2 == 1.0000002f);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.48865461858873344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31099799207812956d) + "'", double1 == (-0.31099799207812956d));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.0232274785475504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7046939980071439d + "'", double1 == 0.7046939980071439d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double double1 = org.apache.commons.math3.util.FastMath.log10(3.8104779544189764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5809794533522891d + "'", double1 == 0.5809794533522891d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.160755939707012d, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.160755939707012d + "'", double2 == 1.160755939707012d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3.9019725925100506d, 167.61264592409196d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 167.65805815345627d + "'", double2 == 167.65805815345627d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.23874681872885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09298255216717233d + "'", double1 == 0.09298255216717233d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-0.0234375f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.09061543436171E-4d) + "'", double1 == (-4.09061543436171E-4d));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, (double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.7310884693105406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6312874611808647d + "'", double1 == 0.6312874611808647d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.971567242793748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8840869764110173d + "'", double1 == 2.8840869764110173d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2153.2980413900355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.40364254441709d + "'", double1 == 46.40364254441709d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.4657359027997265d, 0.49369669957632584d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8471205485390647d + "'", double2 == 1.8471205485390647d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.726254890556496E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.08037189100331499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08369000730960287d + "'", double1 == 0.08369000730960287d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.4495239865639748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4495239865639748d + "'", double1 == 0.4495239865639748d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8225824358786724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7329051822962626d + "'", double1 == 0.7329051822962626d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 9.765625E-4f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.7310884693105406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6779492465849286d + "'", double1 == 0.6779492465849286d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.8885039814876436d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-12.34222982222313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999956364727363d) + "'", double1 == (-0.9999956364727363d));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-1.7019294127099711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7019294127099711d + "'", double1 == 1.7019294127099711d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.8885039814876436d, (-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8885039814876436d + "'", double2 == 2.8885039814876436d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        double double1 = org.apache.commons.math3.util.FastMath.rint(25.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.0d + "'", double1 == 25.0d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 35840.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35840.0d + "'", double1 == 35840.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(2.0f, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9999999f + "'", float2 == 1.9999999f);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 13.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5649493574615367d + "'", double1 == 2.5649493574615367d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.192093037616354E-7d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-23) + "'", int1 == (-23));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) -1, 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.547474E-13f + "'", float2 == 4.547474E-13f);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 'a', (float) (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        double double2 = org.apache.commons.math3.util.FastMath.max(40.74862735876591d, 49.99500000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.99500000000002d + "'", double2 == 49.99500000000002d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.3619730303123131d, (-4.451746403021009d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3619730303123131d) + "'", double2 == (-0.3619730303123131d));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-1L), (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0787619161000124d) + "'", double1 == (-1.0787619161000124d));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.504749933725006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06599838642648898d + "'", double1 == 0.06599838642648898d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-5), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1022.99994f), (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1022.99994f) + "'", float2 == (-1022.99994f));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-511.5f), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-511.49999999999994d) + "'", double2 == (-511.49999999999994d));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double double2 = org.apache.commons.math3.util.FastMath.pow(217.3083407086277d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2.3841858E-7f, 1.192092895507821E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999981821508274d + "'", double2 == 0.9999981821508274d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.05272236634611254d, 46.999532327864166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05272236634611255d + "'", double2 == 0.05272236634611255d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(20.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 20.000002f + "'", float1 == 20.000002f);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9619293889805304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4994475824457005d + "'", double1 == 1.4994475824457005d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.0000169231422558d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.000000000000001d + "'", double1 == 4.000000000000001d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int int2 = org.apache.commons.math3.util.FastMath.max((-2), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.7621186826519104d, (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9604221081779567E-308d + "'", double2 == 1.9604221081779567E-308d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9185375499501867d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(3580.4237429416758d, (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3580.56673991988d + "'", double2 == 3580.56673991988d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.830189170012752E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1023), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(6.691673596021443E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 52.0f, (-0.9417844128659681d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(20.000036752581504d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.8E-322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        double double2 = org.apache.commons.math3.util.FastMath.min(127.13771298137247d, 15.58087669728624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.58087669728624d + "'", double2 == 15.58087669728624d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.9242223034090244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0730285661552832d + "'", double1 == 1.0730285661552832d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.027235643304099704d, 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.951243865300542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000762939453d + "'", double1 == 52.00000762939453d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double double2 = org.apache.commons.math3.util.FastMath.min((-4.09061543436171E-4d), (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.09061543436171E-4d) + "'", double2 == (-4.09061543436171E-4d));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-10));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.1754034190044697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.192093037616354E-7d, 198.57204013738644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.192093037616354E-7d + "'", double2 == 1.192093037616354E-7d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.52117991493046E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-127), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-127.0f) + "'", float2 == (-127.0f));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.0970603909008098E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998902999783974d + "'", double1 == 0.9998902999783974d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.04669075745245177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04665687272850968d + "'", double1 == 0.04665687272850968d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.010200600563003249d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010200777470529932d + "'", double1 == 0.010200777470529932d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 185.4759706643647d + "'", double1 == 185.4759706643647d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        float float2 = org.apache.commons.math3.util.FastMath.min((-10.0f), 5.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.342161576411106E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6618159595855729d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011550867537013974d + "'", double1 == 0.011550867537013974d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-23L), (float) 6208L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-23.0f) + "'", float2 == (-23.0f));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.49369669957632584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5409367175424972d + "'", double1 == 0.5409367175424972d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015050303523504572d + "'", double1 == 0.015050303523504572d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308232d + "'", double1 == 57.29577951308232d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.442854201821675d, (-47));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.146668361052285E-15d + "'", double2 == 3.146668361052285E-15d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 6, (-0.01538287103360378d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.017453292519943295d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017453292519943295d) + "'", double2 == (-0.017453292519943295d));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.041914989933879d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.4288314664442319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6512696807274205d + "'", double1 == 0.6512696807274205d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.506365641109722d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7970546072131232d) + "'", double1 == (-0.7970546072131232d));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.8364287485695048d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6839128558975155d) + "'", double1 == (-0.6839128558975155d));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.761594175364013d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-3.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 4096L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4096.0f) + "'", float2 == (-4096.0f));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(48.499996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.05235987755982989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05240777928304121d + "'", double1 == 0.05240777928304121d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.8809094881441946E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.960191453086704d + "'", double1 == 25.960191453086704d);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-0.0234375f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.547474050965727E-13d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-41) + "'", int1 == (-41));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.2879033166650653d), 0.9999999999999977d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0406192001624515d + "'", double2 == 1.0406192001624515d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 511, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 511L + "'", long2 == 511L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.01745355584320953d, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01745355584320953d + "'", double2 == 0.01745355584320953d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 10.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932229419742513d + "'", double1 == 2.9932229419742513d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.192092895507821E-7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.192092895507821E-7d + "'", double2 == 1.192092895507821E-7d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.000000000007276d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000000727596d + "'", double2 == 1.0000000000727596d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 64.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        double double2 = org.apache.commons.math3.util.FastMath.min(234.24476918014662d, (double) 20L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int1 = org.apache.commons.math3.util.FastMath.abs(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.2722218725854072E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250314E-16d + "'", double1 == 2.220446049250314E-16d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5035996E15f + "'", float1 == 4.5035996E15f);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.9019725925100506d, 0.9947461586351523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9947461586351523d + "'", double2 == 0.9947461586351523d);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.7019294127099711d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.9999999954041073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941540256079d + "'", double1 == 0.7615941540256079d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.0000380832193412d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.3369954337691163d, (double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3369954337691163d + "'", double2 == 1.3369954337691163d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.999999999999998d, 1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.6557203087106535E-15d) + "'", double2 == (-3.6557203087106535E-15d));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.0932951096620784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1251345322701862d + "'", double1 == 1.1251345322701862d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 32, (-35.847863339403446d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(28.30281574199178d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        double double1 = org.apache.commons.math3.util.FastMath.rint(37648.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37648.0d + "'", double1 == 37648.0d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.9999999f, 20.000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.9999999f + "'", float2 == 0.9999999f);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(20.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.808243886679093d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        double double1 = org.apache.commons.math3.util.FastMath.signum(234.24476918014662d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.017455064928217585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455951307856887d + "'", double1 == 0.017455951307856887d);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 52);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        double double2 = org.apache.commons.math3.util.FastMath.max((-6.053272382792838d), 9.313225746154783E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.313225746154783E-10d + "'", double2 == 9.313225746154783E-10d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.7091551466656096d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7091551466656095d) + "'", double1 == (-0.7091551466656095d));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        long long1 = org.apache.commons.math3.util.FastMath.abs(3L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.8840869764110173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.887228676022904d + "'", double1 == 16.887228676022904d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(90.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.09298255216717233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9956802361437771d + "'", double1 == 0.9956802361437771d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49226446720136663d + "'", double1 == 0.49226446720136663d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.8813616205677708d, (double) 51.999996f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8813616205677708d + "'", double2 == 0.8813616205677708d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.6102871923992833E-232d, 0.7852981633977816d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0505424149115388E-232d + "'", double2 == 2.0505424149115388E-232d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-2), 23.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 52, 0.722369115788189d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.722369115788189d + "'", double2 == 0.722369115788189d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(103.00961449578338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.687693995581348d + "'", double1 == 4.687693995581348d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.9998902999783974d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.003905821484290615d + "'", double2 == 0.003905821484290615d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.4532640331862171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        double double2 = org.apache.commons.math3.util.FastMath.log(3.6268604078470186d, (-0.48005689602103446d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(6.012089888557484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.451956339039805d + "'", double1 == 2.451956339039805d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 20.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0874453647522562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0283378365323201d + "'", double1 == 1.0283378365323201d);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1023), 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.5424980307488157E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.9738830555738022d, (double) 4.1661186E11f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.337626812764623E-12d + "'", double2 == 2.337626812764623E-12d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        double double2 = org.apache.commons.math3.util.FastMath.max(100.00000000000004d, (-0.950212931632136d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000004d + "'", double2 == 100.00000000000004d);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 31.999998f, 1.0000001192092896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5395564877821442d + "'", double2 == 1.5395564877821442d);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8726936208978296d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.8919599252153065d, (double) 127L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8919599252153066d + "'", double2 == 0.8919599252153066d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(7.896280957293E13d, 1.505149978319906d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.896280957292998E13d + "'", double2 == 7.896280957292998E13d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double double1 = org.apache.commons.math3.util.FastMath.sin(20.951580740511496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8621853758445391d + "'", double1 == 0.8621853758445391d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1L, (double) 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0000001f + "'", float2 == 1.0000001f);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5533570812458124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.2283475460099158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4778572443836295d + "'", double1 == 0.4778572443836295d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-126.99999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.026525594659021d) + "'", double1 == (-5.026525594659021d));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.027235643304099704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6032287479334557d) + "'", double1 == (-3.6032287479334557d));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        double double1 = org.apache.commons.math3.util.FastMath.rint(4.687693995581348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.58037251265019648E17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.58037251265019648E17d + "'", double1 == 2.58037251265019648E17d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.1097402702744097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.2928018131467037d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.145966026289347d, 46.40364254441709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 46.40364254441709d + "'", double2 == 46.40364254441709d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.547474E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5474746E-13f + "'", float1 == 4.5474746E-13f);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.15683098746077087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15555771015911288d + "'", double1 == 0.15555771015911288d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.7313481348387146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9316196464217202d + "'", double1 == 0.9316196464217202d);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(24.95329850015803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1429.7186889891823d + "'", double1 == 1429.7186889891823d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.505149978319906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.23874129193797d + "'", double1 == 86.23874129193797d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int int2 = org.apache.commons.math3.util.FastMath.min(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.609435868686549E18d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.6929693744345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.191835637525998d + "'", double1 == 1.191835637525998d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.598150033144286d + "'", double1 == 53.598150033144286d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-2.4917798526449118d), 3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4003503556029875d + "'", double2 == 4.4003503556029875d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 511);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.49904707604701226d, (-0.03204242578233507d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.49904707604701226d) + "'", double2 == (-0.49904707604701226d));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1664.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9280538062512563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-4503599627370496L), 12);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8446744073709552E19d) + "'", double2 == (-1.8446744073709552E19d));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(20.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.570796263574624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533141120942604d + "'", double1 == 1.2533141120942604d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.2500000298023224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.07813771351531074d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0030543046677571d + "'", double1 == 1.0030543046677571d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.158638853279167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.13248690517083d + "'", double1 == 2.13248690517083d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9999999f, 5786.873730821315d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        float float1 = org.apache.commons.math3.util.FastMath.abs(32767.998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32767.998f + "'", float1 == 32767.998f);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.948148009134021E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-10), (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.3407807929942597E154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.233407282905927d + "'", double1 == 7.233407282905927d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.00000762939454d + "'", double1 == 52.00000762939454d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.011377788717773903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22491544950088677d) + "'", double1 == (-0.22491544950088677d));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 10.000001f, (double) (-23L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999978065515825E-24d + "'", double2 == 9.999978065515825E-24d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 32768L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 181.01933598375618d + "'", double1 == 181.01933598375618d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(10.536049848239344d, (double) (-64L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.536049848239344d) + "'", double2 == (-10.536049848239344d));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.3407807929942597E154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.9073485E-6f, 4096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073485E-6f + "'", float2 == 1.9073485E-6f);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int int1 = org.apache.commons.math3.util.FastMath.round(20.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.7853982230020895d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9689257325599362d, 0.03703703703703703d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9988315234449244d + "'", double2 == 0.9988315234449244d);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.024600920295739914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6090486460720002d) + "'", double1 == (-1.6090486460720002d));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        long long2 = org.apache.commons.math3.util.FastMath.max(20L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.0990715779031224d, 0.9316196464217202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0919948905169028d + "'", double2 == 1.0919948905169028d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(27.028944477141252d, 0.36008937454964746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.028944477141252d + "'", double2 == 27.028944477141252d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.00620078535925078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.006220050026892d + "'", double1 == 1.006220050026892d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5501637768927253E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226350743220142d + "'", double1 == 0.9226350743220142d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.5565058722645064d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.912139617126407E10d + "'", double2 == 1.912139617126407E10d);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08037538236017183d + "'", double1 == 0.08037538236017183d);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.570796326793987d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.624434178907251d, 0.915499384730081d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6497827368478742d + "'", double2 == 0.6497827368478742d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0000169231422558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7183278307183696d + "'", double1 == 2.7183278307183696d);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(2.34187198E17f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.34187215E17f + "'", float1 == 2.34187215E17f);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.154277032758874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 6400.0005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 5, 1024L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.2207031E-4f, 100.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2207031E-4f + "'", float2 == 1.2207031E-4f);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.1019269915497951d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2430664.0174340927d, 0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2430664.0174340922d + "'", double2 == 2430664.0174340922d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-3.0f), 1.0000002f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.58037251265019648E17d, (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.007958012753983E15d + "'", double2 == 1.007958012753983E15d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.8369630128952054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        double double1 = org.apache.commons.math3.util.FastMath.signum(6.691673596021443E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 3L, (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.364242E-12f + "'", float2 == 1.364242E-12f);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 90.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.687693995581348d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 5120.0f, (-1.6090486460720002d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5119.999999999999d + "'", double2 == 5119.999999999999d);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        float float1 = org.apache.commons.math3.util.FastMath.signum(2.842171E-14f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-12.34222982222313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.34222982222313d + "'", double1 == 12.34222982222313d);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(20.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.999998f + "'", float2 == 19.999998f);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.25398147417648104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.25132724169328774d) + "'", double1 == (-0.25132724169328774d));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9286112600478652d, 41.903161481023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9286112600478652d + "'", double2 == 0.9286112600478652d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (-100.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.993222846126381d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.759258273186885E-38d + "'", double2 == 1.759258273186885E-38d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.8203432320660448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014317690396004406d + "'", double1 == 0.014317690396004406d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.267831587699267d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) Float.POSITIVE_INFINITY, 1.0787365865827503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 1.0000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403021052458078d + "'", double1 == 0.5403021052458078d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.60943614E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.60943642E18f + "'", float1 == 4.60943642E18f);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.01737254084242038d), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-17.789481822638468d) + "'", double2 == (-17.789481822638468d));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.000004f + "'", float1 == 35.000004f);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.0234375f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.9287117556395867d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        float float1 = org.apache.commons.math3.util.FastMath.abs(35839.996f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35839.996f + "'", float1 == 35839.996f);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.4778572443836295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6126152570659732d + "'", double1 == 0.6126152570659732d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.154434690031884d, 0.010200777470529932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.154458839122665d + "'", double2 == 2.154458839122665d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double double1 = org.apache.commons.math3.util.FastMath.asin(5557.690612768985d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.248291097914389d, 0.1019269915497951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.578618706202517d) + "'", double2 == (-1.578618706202517d));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 127);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.00001f + "'", float1 == 127.00001f);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-6L), (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.0000005f) + "'", float2 == (-6.0000005f));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.8146899896673862E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8146899896673862E-6d + "'", double1 == 3.8146899896673862E-6d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.503599627370496E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8742173026236351d + "'", double1 == 0.8742173026236351d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-35L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        float float2 = org.apache.commons.math3.util.FastMath.max(97.0f, 35840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35840.0f + "'", float2 == 35840.0f);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.05272236634611254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.201788821823161E-4d + "'", double1 == 9.201788821823161E-4d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(32768.0f, 3.2592091679400053d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32767.998f + "'", float2 == 32767.998f);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-1023), 7.233407282905927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1023.0d) + "'", double2 == (-1023.0d));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.3619730303123131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3703835830420734d + "'", double1 == 0.3703835830420734d);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.838266827E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.838266827E9d + "'", double1 == 1.838266827E9d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.584967478670572d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4546560101297226E21d + "'", double2 == 1.4546560101297226E21d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.912139617126407E10d, (-13.847379800543134d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.912139617126407E10d) + "'", double2 == (-1.912139617126407E10d));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 2.34187198E17f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.99489718105814d + "'", double1 == 39.99489718105814d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 511);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.236369590203704d + "'", double1 == 6.236369590203704d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.017455951307856887d, (-0.3550578813391773d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.209318697132464d + "'", double2 == 4.209318697132464d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5703319211292674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2531288525643591d + "'", double1 == 1.2531288525643591d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.5367431640625E-7d + "'", double1 == 9.5367431640625E-7d);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.957135859585879d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int int2 = org.apache.commons.math3.util.FastMath.min(2, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        double double1 = org.apache.commons.math3.util.FastMath.acos(262.6992857325621d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39505127952814223d + "'", double1 == 0.39505127952814223d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        float float2 = org.apache.commons.math3.util.FastMath.max(1024.0f, 23.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 127L, 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.145966026289347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9730122073250893d + "'", double1 == 0.9730122073250893d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 13, 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395564933646286d + "'", double1 == 1.5395564933646286d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.3619730303123131d, (double) 48.499992f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.50134311978857d + "'", double2 == 48.50134311978857d);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6048246720432039d) + "'", double1 == (-0.6048246720432039d));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8360218615377305d) + "'", double1 == (-0.8360218615377305d));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5.916079783099616d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-100.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(7.896280957293E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886102.046056528d + "'", double1 == 8886102.046056528d);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 4.547474E-13f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(32768.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1024L, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        double double2 = org.apache.commons.math3.util.FastMath.max(2.7182818284590455d, 1.7182816664368272d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7182818284590455d + "'", double2 == 2.7182818284590455d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-127));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.991989996645917E-56d + "'", double1 == 6.991989996645917E-56d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 10, (long) 15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7724538509055159d + "'", double1 == 1.7724538509055159d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-2147483648));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483648L + "'", long1 == 2147483648L);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int int2 = org.apache.commons.math3.util.FastMath.min((-1), 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(35.01428280342778d, 0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.014282803427776d + "'", double2 == 35.014282803427776d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, (-0.6764125919282525d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 97, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(9.313225746154783E-10d, 58.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.313225746154783E-10d + "'", double2 == 9.313225746154783E-10d);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1353352832366127d + "'", double1 == 0.1353352832366127d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        double double1 = org.apache.commons.math3.util.FastMath.sin(127.13771298137247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9953195530693064d + "'", double1 == 0.9953195530693064d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        long long2 = org.apache.commons.math3.util.FastMath.max(127L, (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 52, (long) (-41));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.03835134389875404d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.693572235978968E-4d) + "'", double1 == (-6.693572235978968E-4d));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.220703125E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710505431213761E-20d + "'", double1 == 2.710505431213761E-20d);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(8.470329472543003E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.470329472543003E-22d + "'", double1 == 8.470329472543003E-22d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1023));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(97.00317877887011d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00317877887012d + "'", double2 == 97.00317877887012d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.09950437040259406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31544313338951296d + "'", double1 == 0.31544313338951296d);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(32.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.464944418635d + "'", double1 == 1833.464944418635d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8919599252153066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04965465756202388d) + "'", double1 == (-0.04965465756202388d));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35840.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int int2 = org.apache.commons.math3.util.FastMath.max(2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.1469512391741817d), 0.3802897750888419d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        double double2 = org.apache.commons.math3.util.FastMath.max(5.784276743882713E20d, (-0.12816970312934028d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.784276743882713E20d + "'", double2 == 5.784276743882713E20d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2.710505431213761E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.742001862925077d, 1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.067786496795693E-15d) + "'", double2 == (-2.067786496795693E-15d));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.024595958627920467d, (-0.9879627505659927d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.024595958627920463d + "'", double2 == 0.024595958627920463d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.8761242229100255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2422869359501354d + "'", double1 == 1.2422869359501354d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0001015515136908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017455064928217585d + "'", double1 == 0.017455064928217585d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        long long2 = org.apache.commons.math3.util.FastMath.max(10L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 5L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.9801475222605264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9953195530693064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8780601356668734d + "'", double1 == 0.8780601356668734d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        float float2 = org.apache.commons.math3.util.FastMath.max((-0.99999994f), (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        double double2 = org.apache.commons.math3.util.FastMath.pow(102400.0d, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001254E-26d + "'", double2 == 8.881784197001254E-26d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.9913014866745806d, (double) 32768.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.991301486674581d + "'", double2 == 2.991301486674581d);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.9801475222605264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6831713481231805d + "'", double1 == 0.6831713481231805d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        double double2 = org.apache.commons.math3.util.FastMath.log(7.105427357601002E-15d, 3.2566139548000526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0362419725544858d) + "'", double2 == (-0.0362419725544858d));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.19486509830693569d, 97.00317877887012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00337450631281d + "'", double2 == 97.00337450631281d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        double double1 = org.apache.commons.math3.util.FastMath.sin(214.56664193281875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8065788200984862d + "'", double1 == 0.8065788200984862d);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        float float1 = org.apache.commons.math3.util.FastMath.signum(6400.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(52.0f, 0.9999999954041073d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.999996f + "'", float2 == 51.999996f);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.1920928955078128E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        float float1 = org.apache.commons.math3.util.FastMath.signum(97.00001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.18710109962234833d), (-0.6912431464778742d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18710109962234836d) + "'", double2 == (-0.18710109962234836d));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.004478358365843835d, 3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1689765108833428E-25d + "'", double2 == 1.1689765108833428E-25d);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1.9073485E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(8.318010277546872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2048.500122040519d + "'", double1 == 2048.500122040519d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.024595958627920463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.5649493574615367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1990520143908188d + "'", double1 == 1.1990520143908188d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9912174443839006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.836693358258192d + "'", double1 == 0.836693358258192d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(71.02688974004266d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000004f + "'", float1 == 52.000004f);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.5809794533522891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6639399425388491d + "'", double1 == 0.6639399425388491d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.7970546072131232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.220446049250314E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-57.295779513082316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7336545584598331d + "'", double1 == 0.7336545584598331d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(10.754065986323363d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        float float2 = org.apache.commons.math3.util.FastMath.max(52.000008f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000008f + "'", float2 == 52.000008f);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(41.903161481023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2400.8743011177776d + "'", double1 == 2400.8743011177776d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.251799813685248E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5d + "'", double1 == 0.5d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.36651292058166435d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.877940322113382E-190d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-4096.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5705521861747473d) + "'", double1 == (-1.5705521861747473d));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(6.54213262037718d, 0.2504230129550942d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.031134283544730468d + "'", double2 == 0.031134283544730468d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.12816970312934028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 5, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-7.8683390140765455E-19d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 3L, 2.154458839122665d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0000169231422558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752273075851822d + "'", double1 == 1.1752273075851822d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.7091551466656096d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.63159692392033d) + "'", double1 == (-40.63159692392033d));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int2 = org.apache.commons.math3.util.FastMath.max(61, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        double double2 = org.apache.commons.math3.util.FastMath.log((-5.0d), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-10), (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20L) + "'", long2 == (-20L));
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(35.00000762939454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930127763409804E14d + "'", double1 == 7.930127763409804E14d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.5501806885958198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5501806885958198d + "'", double1 == 1.5501806885958198d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.48005689602103446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4800568960210344d) + "'", double1 == (-0.4800568960210344d));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308233d + "'", double1 == 57.29577951308233d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 35840.0f, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.609844813961006E59d + "'", double2 == 1.609844813961006E59d);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.3440585709080487E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(83.9889793008241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.123868210250173d + "'", double1 == 5.123868210250173d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1022.99994f), (float) 64L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 64.0f + "'", float2 == 64.0f);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.004478358365843835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0044884011988755d + "'", double1 == 1.0044884011988755d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-1023.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int int2 = org.apache.commons.math3.util.FastMath.max((-3), (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.7329051822962626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6690316852237952d + "'", double1 == 0.6690316852237952d);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.30988320573923506d, 1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.30988320573923506d + "'", double2 == 0.30988320573923506d);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1368683772161603E-13d, 1.4377039151369548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368683772161603E-13d + "'", double2 == 1.1368683772161603E-13d);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.09999999618530295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.000000016567019d) + "'", double1 == (-1.000000016567019d));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.0d), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676506002282294E30d + "'", double2 == 1.2676506002282294E30d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.342161576411106E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 64L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-4.09061543436171E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.139470776250983E-6d) + "'", double1 == (-7.139470776250983E-6d));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.0f), (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-1.4E-45f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-64.0f), 1.4377039151369548d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-63.999996f) + "'", float2 == (-63.999996f));
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(52.00000762939453d, 511.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.00000762939453d + "'", double2 == 52.00000762939453d);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.09966865249116201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.470961916843109d + "'", double1 == 1.470961916843109d);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-3.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-2.9999998f) + "'", float1 == (-2.9999998f));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 0L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.9999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.8E-322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.87E-322d + "'", double1 == 2.87E-322d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.9985859267674833d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9985859267674833d + "'", double1 == 0.9985859267674833d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 511);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 12, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.142417859574152d, 0.403906158347758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.530993900237115d + "'", double2 == 1.530993900237115d);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-100.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.0000002f, 1.1873864715321998d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000002384185793d + "'", double2 == 1.0000002384185793d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int int1 = org.apache.commons.math3.util.FastMath.round(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9988315234449244d, 1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.734723475976807E-18d + "'", double2 == 1.734723475976807E-18d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.15873679831797d + "'", double1 == 20.15873679831797d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(2.770311529081762E34d, 0.09966865249116201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.770311529081762E34d + "'", double2 == 2.770311529081762E34d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-32.57791748631743d) + "'", double1 == (-32.57791748631743d));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        long long1 = org.apache.commons.math3.util.FastMath.abs(127L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 35.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.005817747764200268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int int1 = org.apache.commons.math3.util.FastMath.round((-10.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(4.5474746E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.547475E-13f + "'", float1 == 4.547475E-13f);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2.2105354941985667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.038581122605965d + "'", double1 == 0.038581122605965d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17364817766693033d + "'", double1 == 0.17364817766693033d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(32.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5534935234725733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02711357689300422d + "'", double1 == 0.02711357689300422d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.6779492465849286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.84363055339035d + "'", double1 == 38.84363055339035d);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874144594285d + "'", double1 == 1.5604874144594285d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 4096L, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.34217728E8f + "'", float2 == 1.34217728E8f);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int int2 = org.apache.commons.math3.util.FastMath.min((-8), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.4643056300239326d, 2.220446049250313E36d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4643056300239326d + "'", double2 == 0.4643056300239326d);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int int2 = org.apache.commons.math3.util.FastMath.max(5, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(46.999532327864166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2900529801620624E20d + "'", double1 == 1.2900529801620624E20d);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(2.4258259770489514E8d, 1833.464944418635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.425825977118239E8d + "'", double2 == 2.425825977118239E8d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 511L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 511.0f + "'", float2 == 511.0f);
    }
}

