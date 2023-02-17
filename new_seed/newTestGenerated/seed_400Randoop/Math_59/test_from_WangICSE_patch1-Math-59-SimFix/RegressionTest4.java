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
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999929257765152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615911849474076d + "'", double1 == 0.7615911849474076d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9986081305645496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999303822951033d + "'", double1 == 0.999303822951033d);
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
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.27922113659304d + "'", double1 == 3.27922113659304d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double double1 = org.apache.commons.math.util.FastMath.abs(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5900247258946039d, 0.9205508739623456d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9205508739623456d + "'", double2 == 0.9205508739623456d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6439440000115327E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.85767924684394d + "'", double1 == 33.85767924684394d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0081355681289063E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.51313365841725d) + "'", double1 == (-8.51313365841725d));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4650188248182272d) + "'", double1 == (-1.4650188248182272d));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.983031862437426d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5223184878037187d + "'", double1 == 0.5223184878037187d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math.util.FastMath.tan(192.9948452238572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.621316807284695d + "'", double1 == 4.621316807284695d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.4932054413052554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1241113544309131d + "'", double1 == 1.1241113544309131d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 53, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53L + "'", long2 == 53L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.49555014055642926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4772282118533498d) + "'", double1 == (-0.4772282118533498d));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.39731803409120725d), (-0.03422749178784308d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6567305011816795d) + "'", double2 == (-1.6567305011816795d));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0079339646952572E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.5132340567954d) + "'", double1 == (-8.5132340567954d));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 53);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.220446049250313E-16d, 1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5716776679087391d, 1.2715542753135176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4911392070312753d + "'", double2 == 0.4911392070312753d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7978269761159673E33d + "'", double1 == 1.7978269761159673E33d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.533811507790112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0965832309956893d + "'", double1 == 0.0965832309956893d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 36, (long) 1477896);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1714425480301299d), 5.009340961621595d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.98610843089314d + "'", double1 == 71.98610843089314d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.20787957635076193d, 0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24650636127268888d + "'", double2 == 0.24650636127268888d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8498912464906307d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2557610379370634d) + "'", double1 == (-1.2557610379370634d));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.955817372303998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99998657637409d + "'", double1 == 0.99998657637409d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int int2 = org.apache.commons.math.util.FastMath.min(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8410058489917948d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-48.18608569304648d) + "'", double1 == (-48.18608569304648d));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.980232238769532E-8d + "'", double1 == 2.980232238769532E-8d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.41032129904824216d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(115.35421880301885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.013310924178631d + "'", double1 == 2.013310924178631d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4472118490899239d + "'", double1 == 0.4472118490899239d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0078125d + "'", double1 == 0.0078125d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.930067261567154E14d, 11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.930067261567152E14d + "'", double2 == 7.930067261567152E14d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double double1 = org.apache.commons.math.util.FastMath.tan(42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.414062290979883d + "'", double1 == 3.414062290979883d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        long long2 = org.apache.commons.math.util.FastMath.max((-53L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995917534020515d + "'", double1 == 0.9995917534020515d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2565342512548114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25111902873535263d + "'", double1 == 0.25111902873535263d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4771212547196624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2153687731382858d + "'", double1 == 1.2153687731382858d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.43087067877290786d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4176620615017429d) + "'", double1 == (-0.4176620615017429d));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5669767943827967d, 0.5716315636979223d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5669767943827968d + "'", double2 == 0.5669767943827968d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10L, (-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6296609567811063d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0489207050997464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double double1 = org.apache.commons.math.util.FastMath.log(231.58466047909457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.444945510686242d + "'", double1 == 5.444945510686242d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2014038779280567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18349077126961408d + "'", double1 == 0.18349077126961408d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double double2 = org.apache.commons.math.util.FastMath.min(1.217652850343311d, 2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.217652850343311d + "'", double2 == 1.217652850343311d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557649d + "'", double1 == 0.7615941559557649d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7978505932255957d + "'", double1 == 0.7978505932255957d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5799018512655504d + "'", double1 == 0.5799018512655504d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9997894669934126d, 0.768287758044532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.768287758044532d + "'", double2 == 0.768287758044532d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.10170611520638d + "'", double1 == 91.10170611520638d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0893507405929967d + "'", double1 == 1.0893507405929967d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        int int2 = org.apache.commons.math.util.FastMath.min(1477896, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9696515784005106d + "'", double1 == 0.9696515784005106d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1229215998502982d + "'", double1 == 1.1229215998502982d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0000775229078724d, 0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3769270190230555d + "'", double2 == 0.3769270190230555d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6931471805599462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599463d + "'", double1 == 0.6931471805599463d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 53);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int1 = org.apache.commons.math.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double double1 = org.apache.commons.math.util.FastMath.sin((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9964183022495265d + "'", double1 == 0.9964183022495265d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double double1 = org.apache.commons.math.util.FastMath.abs((-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.768015146316124d + "'", double1 == 34.768015146316124d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.9751009553485449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9124034991009713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2648389735541739d + "'", double1 == 1.2648389735541739d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.930067261567155E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.899276870949834d + "'", double1 == 14.899276870949834d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.17364817766693033d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double double1 = org.apache.commons.math.util.FastMath.abs(89.4270613023165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.4270613023165d + "'", double1 == 89.4270613023165d);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8633639145424554d + "'", double1 == 0.8633639145424554d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5860134523134185E15d, 0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6360918665423811d + "'", double2 == 0.6360918665423811d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275800758169d + "'", double1 == 0.9640275800758169d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double double1 = org.apache.commons.math.util.FastMath.log(5.533811507790112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7108768200311502d + "'", double1 == 1.7108768200311502d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308233d + "'", double1 == 572.9577951308233d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 5.2437141131408894E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 36, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.5321070224790865E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.326458826000224E8d + "'", double1 == 6.326458826000224E8d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.1752011936438014d), 42.042831059009366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.042831059009366d + "'", double2 == 42.042831059009366d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.2917098371502295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9577535432799731d + "'", double1 == 0.9577535432799731d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double double1 = org.apache.commons.math.util.FastMath.log(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7405700602011438d) + "'", double1 == (-1.7405700602011438d));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8161870413788636d + "'", double1 == 0.8161870413788636d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8862269254527579d, 4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5740962263285927d + "'", double2 == 0.5740962263285927d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26221266393298326d + "'", double1 == 0.26221266393298326d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.1752011936438014d), 1.544753606236012E-12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.570796326793582d) + "'", double2 == (-1.570796326793582d));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.999303822951033d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.983031862437426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6846269172035435d + "'", double1 == 0.6846269172035435d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2599210498948732d) + "'", double1 == (-1.2599210498948732d));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7108768200311502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.091998009803879d) + "'", double1 == (-7.091998009803879d));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9124034991009713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03337773768597237d + "'", double1 == 0.03337773768597237d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2199463009580406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6576833375608168d) + "'", double1 == (-0.6576833375608168d));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0816105324227276d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20638559288074199d + "'", double1 == 0.20638559288074199d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.433704240591099d, 1.5427661770824743d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7487731841429789d + "'", double2 == 0.7487731841429789d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int int2 = org.apache.commons.math.util.FastMath.min(36, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.9754001961551925d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6931471805599453d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double double2 = org.apache.commons.math.util.FastMath.min(0.27631948176648663d, 1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27631948176648663d + "'", double2 == 0.27631948176648663d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6719977351570301d + "'", double1 == 0.6719977351570301d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (-2.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double double1 = org.apache.commons.math.util.FastMath.log10((-59.10786673843407d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.16243485560816776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306831672164943d + "'", double1 == 9.306831672164943d);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double double2 = org.apache.commons.math.util.FastMath.max(9.999999995877003d, 0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999995877003d + "'", double2 == 9.999999995877003d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09470993405978069d + "'", double1 == 0.09470993405978069d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5049299044217186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5826970349443759d + "'", double1 == 1.5826970349443759d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.45651311918339676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7699888226765638d + "'", double1 == 0.7699888226765638d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 350773.07414689334d + "'", double1 == 350773.07414689334d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double double1 = org.apache.commons.math.util.FastMath.log(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.746938918904175d) + "'", double1 == (-0.746938918904175d));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6509498349092765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7487731841429789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.242605345373291d + "'", double1 == 1.242605345373291d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9149994957367078d, (-0.45651311918339676d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0413863622181858d + "'", double2 == 1.0413863622181858d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4337042405910987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9778913495481287d + "'", double1 == 1.9778913495481287d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.0013530756255686267d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5721494028333372d + "'", double1 == 1.5721494028333372d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1555698629817919d + "'", double1 == 1.1555698629817919d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9033391107665126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7346568543593085d + "'", double1 == 0.7346568543593085d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1477896);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.39592515018183416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8623188722876839d, (-1.5707963267948963d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948963d) + "'", double2 == (-1.5707963267948963d));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2222844543037337d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.006360832877189446d, 0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01976389133388643d + "'", double2 == 0.01976389133388643d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.380926798078525d + "'", double1 == 7.380926798078525d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.7260621198151926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 156.1918541558971d + "'", double1 == 156.1918541558971d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.1731525181731936d), 1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17315251817319358d) + "'", double2 == (-0.17315251817319358d));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        long long1 = org.apache.commons.math.util.FastMath.round((-3.0d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5607966601082317d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.564939304500307d + "'", double1 == 26.564939304500307d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        long long2 = org.apache.commons.math.util.FastMath.min(1477896L, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9205508739623456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5106730734832936d + "'", double1 == 1.5106730734832936d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3235780930645504d, 2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5065900109542124d + "'", double2 == 0.5065900109542124d);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0816105324227276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459047d + "'", double1 == 2.718281828459047d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        double double2 = org.apache.commons.math.util.FastMath.max(5.0d, 2.688117141816173E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.688117141816173E43d + "'", double2 == 2.688117141816173E43d);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28738952988751526d + "'", double1 == 0.28738952988751526d);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7017203400855395d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6540753540578407d) + "'", double1 == (-0.6540753540578407d));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 32L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.746938918904175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9258949934053917d) + "'", double1 == (-0.9258949934053917d));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030467198227893608d) + "'", double1 == (-0.030467198227893608d));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9516311810082599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016609097373236268d) + "'", double1 == (-0.016609097373236268d));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4466128799118947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16035232751746503d + "'", double1 == 0.16035232751746503d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.762195691083632d + "'", double1 == 3.762195691083632d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        float float2 = org.apache.commons.math.util.FastMath.min((-53.0f), (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2722988564826722d, (-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0003963416279558d + "'", double2 == 1.0003963416279558d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8632695193447204d + "'", double1 == 0.8632695193447204d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(533.252579626545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.307013259236443d + "'", double1 == 9.307013259236443d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double double2 = org.apache.commons.math.util.FastMath.min(86.73801698433718d, 7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 86.73801698433718d + "'", double2 == 86.73801698433718d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int int1 = org.apache.commons.math.util.FastMath.round((-53.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53) + "'", int1 == (-53));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4577979139729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2646180550224786d + "'", double1 == 2.2646180550224786d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.999999995877003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465703991664d + "'", double1 == 22025.465703991664d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        double double1 = org.apache.commons.math.util.FastMath.exp(18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6578275518955335E7d + "'", double1 == 6.6578275518955335E7d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.473814720414451d, (-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6855685475011852d + "'", double2 == 2.6855685475011852d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        double double1 = org.apache.commons.math.util.FastMath.ceil(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 573.0d + "'", double1 == 573.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6109179126442243d + "'", double1 == 3.6109179126442243d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.43930669835763825d), 4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.43930669835763825d) + "'", double2 == (-0.43930669835763825d));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306831688654869d + "'", double1 == 9.306831688654869d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9930737478319205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.9982229502979694d, (double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99822295029797d + "'", double2 == 2.99822295029797d);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.39731803409120725d), 5.298292365610485d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-39.206747378977376d) + "'", double1 == (-39.206747378977376d));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9422278221222946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7556616167207904d + "'", double1 == 0.7556616167207904d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6499429567608755d, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6499429567608755d + "'", double2 == 0.6499429567608755d);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int int1 = org.apache.commons.math.util.FastMath.abs(1477896);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32220799131551875d) + "'", double1 == (-0.32220799131551875d));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4337042405910987d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.46858222228961d + "'", double1 == 88.46858222228961d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5420777404922403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1881062682776882d + "'", double1 == 0.1881062682776882d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6061093801777692d + "'", double1 == 0.6061093801777692d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6699684639824475d + "'", double1 == 0.6699684639824475d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.010715004697646387d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010714594648513057d) + "'", double1 == (-0.010714594648513057d));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.719463918234335d + "'", double1 == 1.719463918234335d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.27767826196252E83d, 1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.516258181075712E96d + "'", double2 == 7.516258181075712E96d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        double double1 = org.apache.commons.math.util.FastMath.ulp(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        double double2 = org.apache.commons.math.util.FastMath.pow(13.596393407513998d, 28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8872978375373093E32d + "'", double2 == 1.8872978375373093E32d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        double double2 = org.apache.commons.math.util.FastMath.min(9.612434767874704E-6d, 573.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.612434767874704E-6d + "'", double2 == 9.612434767874704E-6d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        double double1 = org.apache.commons.math.util.FastMath.floor(22.18070977791825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.0d + "'", double1 == 22.0d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1477896, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1477896L + "'", long2 == 1477896L);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2153687731382858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6450636852308703d + "'", double1 == 0.6450636852308703d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5707963274966374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.917152335778733d + "'", double1 == 0.917152335778733d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9434257847789064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9434257847789064d + "'", double1 == 0.9434257847789064d);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.948148009133999E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009133999E13d + "'", double1 == 3.948148009133999E13d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0730374999763912d + "'", double1 == 1.0730374999763912d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6439440000115327E52d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6584559915698317E36d + "'", double1 == 2.6584559915698317E36d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0686474581524463E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8651416687828506E11d + "'", double1 == 1.8651416687828506E11d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5420777404922403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.674292154581808d + "'", double1 == 3.674292154581808d);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.121587127777053E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1215871267631296E-5d + "'", double1 == 3.1215871267631296E-5d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016591253173120855d + "'", double1 == 0.016591253173120855d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6997597439205169d + "'", double1 == 0.6997597439205169d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8833206860228293d + "'", double1 == 0.8833206860228293d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.167906788198742d + "'", double1 == 1.167906788198742d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02109767107454078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021099236524914633d + "'", double1 == 0.021099236524914633d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4001817886098734d) + "'", double1 == (-0.4001817886098734d));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double double2 = org.apache.commons.math.util.FastMath.min(0.2199463009580406d, 0.6499429567608755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2199463009580406d + "'", double2 == 0.2199463009580406d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.17315251817319363d), (double) 53);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17315251817319363d) + "'", double2 == (-0.17315251817319363d));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.621316807284695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7265659438059517d + "'", double1 == 1.7265659438059517d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.377725567322862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.82204982013094d + "'", double1 == 39.82204982013094d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int int1 = org.apache.commons.math.util.FastMath.abs((-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9663516425671944d + "'", double1 == 0.9663516425671944d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7978269761159673E33d, 1.4856741544225798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.545185591332969E49d + "'", double2 == 2.545185591332969E49d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0017885376783303671d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(68.40322401739336d, 35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.40322401739334d + "'", double2 == 68.40322401739334d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.01706683222077747d), 0.15300256822516012d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11108683601087364d) + "'", double2 == (-0.11108683601087364d));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1301927452503902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1223881891967115d + "'", double1 == 0.1223881891967115d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5065900109542124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4689057088038128d + "'", double1 == 0.4689057088038128d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5654575915353359d + "'", double1 == 0.5654575915353359d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1881062682776882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7255967321845855d) + "'", double1 == (-0.7255967321845855d));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5851102438039822d + "'", double1 == 0.5851102438039822d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.9323667197459253d), 1.1877626999044049d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0196617707395668d) + "'", double2 == (-1.0196617707395668d));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.09966865249116202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0014414133113334d) + "'", double1 == (-1.0014414133113334d));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5740962263285927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24101530784419936d) + "'", double1 == (-0.24101530784419936d));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 52, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021348E41d + "'", double2 == 6.691673596021348E41d);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.388267471840756d + "'", double1 == 5.388267471840756d);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.848501131276805d + "'", double1 == 3.848501131276805d);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9754001961551926d + "'", double1 == 0.9754001961551926d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        int int1 = org.apache.commons.math.util.FastMath.abs((-2));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0489207050997464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8668856945829329d + "'", double1 == 0.8668856945829329d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.388267471840756d, (double) (-36L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6540468455730294E-27d + "'", double2 == 4.6540468455730294E-27d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9434257847789064d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7612492183413337d, 86.73801698433716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7612492183413339d + "'", double2 == 0.7612492183413339d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.164473663317525E39d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3305834282671767d + "'", double1 == 3.3305834282671767d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-114.59155902616465d) + "'", double1 == (-114.59155902616465d));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21551488653168735d + "'", double1 == 0.21551488653168735d);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1229215998502982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.0001456277756542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8415496589078763d + "'", double1 == 0.8415496589078763d);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.709975946676697d, (-0.9171523356672744d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0631023859711455d + "'", double2 == 2.0631023859711455d);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        double double1 = org.apache.commons.math.util.FastMath.abs(42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.12656474461543d + "'", double1 == 42.12656474461543d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        long long1 = org.apache.commons.math.util.FastMath.round(33.85767924684394d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 34L + "'", long1 == 34L);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.457669233211857d) + "'", double1 == (-0.457669233211857d));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5712556729872575d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4351842306678721d) + "'", double1 == (-0.4351842306678721d));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double double1 = org.apache.commons.math.util.FastMath.floor(471.123645247015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 471.0d + "'", double1 == 471.0d);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6433380240448354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4410849945164944d) + "'", double1 == (-0.4410849945164944d));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        float float2 = org.apache.commons.math.util.FastMath.max(3.9481478E13f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9428090415820635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3773411238234914d + "'", double1 == 1.3773411238234914d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.27234146891183075d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27572056477178236d) + "'", double1 == (-0.27572056477178236d));
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8161870413788636d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(49.80857186097813d, 0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.80857186097812d + "'", double2 == 49.80857186097812d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.403108691970989E-6d + "'", double1 == 2.403108691970989E-6d);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7215087615242685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8059788673771909d + "'", double1 == 0.8059788673771909d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10666980032367356d) + "'", double1 == (-0.10666980032367356d));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.861169701161394d + "'", double1 == 18.861169701161394d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.1662915285707833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.475919246252206d) + "'", double1 == (-1.475919246252206d));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0089783198845564E16d + "'", double1 == 2.0089783198845564E16d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.243830346881223d + "'", double1 == 1.243830346881223d);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7047238563609084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8898968261331758d) + "'", double1 == (-0.8898968261331758d));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.24650636127268888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.244075746423698d + "'", double1 == 0.244075746423698d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5223184878037187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5795227773499363d + "'", double1 == 0.5795227773499363d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601003E-15d + "'", double1 == 7.105427357601003E-15d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(36.04365338911715d, 0.9434257847789064d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.043653389117146d + "'", double2 == 36.043653389117146d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0893507405929967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8281369575165142d + "'", double1 == 0.8281369575165142d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4495725029967728d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6699684639824475d, 1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6699684639824476d + "'", double2 == 0.6699684639824476d);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.516258181075712E96d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double double1 = org.apache.commons.math.util.FastMath.floor(1477896.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(295.4144370642092d, 1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 295.41443706420927d + "'", double2 == 295.41443706420927d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 148.20890535952418d + "'", double1 == 148.20890535952418d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        double double1 = org.apache.commons.math.util.FastMath.exp(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5659347597369016E23d + "'", double1 == 4.5659347597369016E23d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.688117141816173E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25135294326645075d + "'", double1 == 0.25135294326645075d);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.2599210498948732d), 0.5654575915353359d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8261522787674126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6784045495077556d + "'", double1 == 0.6784045495077556d);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8260916783213061d) + "'", double1 == (-0.8260916783213061d));
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        double double1 = org.apache.commons.math.util.FastMath.ulp(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04147130059125977d + "'", double1 == 0.04147130059125977d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        double double1 = org.apache.commons.math.util.FastMath.asin(71.98610843089314d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9187506059390845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08474056892977393d) + "'", double1 == (-0.08474056892977393d));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1071487177940904d + "'", double1 == 1.1071487177940904d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4772282118533498d), 0.5403023058681384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.723489952777984d) + "'", double2 == (-0.723489952777984d));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        double double1 = org.apache.commons.math.util.FastMath.atanh(35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.697222728536797d + "'", double1 == 5.697222728536797d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.570796326793582d), 0.03673618878368824d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.0196617707395668d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9556244815546298d + "'", double1 == 0.9556244815546298d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6560777742274478d + "'", double1 == 0.6560777742274478d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4223708422464203d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3852968325547366d + "'", double1 == 1.3852968325547366d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2304174954646191E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4973.752448262787d + "'", double1 == 4973.752448262787d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1217719640679913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01957861422954997d + "'", double1 == 0.01957861422954997d);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        double double2 = org.apache.commons.math.util.FastMath.min(7.6035750265302235d, 1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3023186765274486d + "'", double2 == 1.3023186765274486d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        float float2 = org.apache.commons.math.util.FastMath.min(11013.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5479174221765761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5757472671756005d + "'", double1 == 0.5757472671756005d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        double double1 = org.apache.commons.math.util.FastMath.tan(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22481137595997358d) + "'", double1 == (-0.22481137595997358d));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        double double1 = org.apache.commons.math.util.FastMath.exp(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3112315471152565E15d + "'", double1 == 4.3112315471152565E15d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.20638559288074199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20638559288074199d + "'", double1 == 0.20638559288074199d);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        double double2 = org.apache.commons.math.util.FastMath.max(6.691673596021348E41d, 4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021348E41d + "'", double2 == 6.691673596021348E41d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01976389133388643d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.594700892207039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.59470089220704d + "'", double1 == 4.59470089220704d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(24.89046237609173d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.989034212760194d + "'", double1 == 4.989034212760194d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8161870413788636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2618589996500895d + "'", double1 == 2.2618589996500895d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.0537144249814574d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.053714424981458d + "'", double2 == 3.053714424981458d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5143524375699184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41498791363815524d + "'", double1 == 0.41498791363815524d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.388267471840756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5896069690147183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.5574077246549018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2106815084135339d + "'", double1 == 0.2106815084135339d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        double double2 = org.apache.commons.math.util.FastMath.min(231.58466047909457d, (-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11831214619987152d) + "'", double2 == (-0.11831214619987152d));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9633078296451878d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5757472671756005d, 1.0489207050997464d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5604053336141724d + "'", double2 == 0.5604053336141724d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3023186765274486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1411917790307853d + "'", double1 == 1.1411917790307853d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.053714424981458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.995557355458841d + "'", double1 == 0.995557355458841d);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        double double1 = org.apache.commons.math.util.FastMath.abs(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.598150033144236d + "'", double1 == 53.598150033144236d);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5414729998706594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7185364026199064d + "'", double1 == 1.7185364026199064d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5900247258946039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0093823567077387d + "'", double1 == 1.0093823567077387d);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 53, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        double double1 = org.apache.commons.math.util.FastMath.exp(23151.90693368639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.194206803317586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 65.3011208856134d + "'", double1 == 65.3011208856134d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.01573708249221756d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01573708249221756d + "'", double1 == 0.01573708249221756d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1374118819130998E-18d) + "'", double1 == (-2.1374118819130998E-18d));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        double double1 = org.apache.commons.math.util.FastMath.signum(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.1215871267631296E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999995127847d + "'", double1 == 0.9999999995127847d);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7699888226765638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8788236337430255d + "'", double1 == 0.8788236337430255d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9751009553485449d, 0.7215087615242685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7215087615242685d + "'", double2 == 0.7215087615242685d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        double double1 = org.apache.commons.math.util.FastMath.tanh(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
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
        float float2 = org.apache.commons.math.util.FastMath.min((float) '4', (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        double double1 = org.apache.commons.math.util.FastMath.sinh(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1114662041916602E64d + "'", double1 == 2.1114662041916602E64d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.1415926535897927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22574212779940497d + "'", double1 == 0.22574212779940497d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4645918875615231d + "'", double1 == 1.4645918875615231d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.8402785435782614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2662323765610332d) + "'", double1 == (-0.2662323765610332d));
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 1477896);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8415496589078763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6866289917030872d + "'", double1 == 0.6866289917030872d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9033391107665126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9642119506056357d + "'", double1 == 1.9642119506056357d);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.185039863261519d + "'", double1 == 2.185039863261519d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.10666980032367356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4742570847547076d) + "'", double1 == (-0.4742570847547076d));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9991461404922782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.529468828731893d + "'", double1 == 1.529468828731893d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2735244882819095d + "'", double1 == 1.2735244882819095d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.011869972069403d + "'", double1 == 1.011869972069403d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        double double1 = org.apache.commons.math.util.FastMath.signum(21.665602783539605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-8.5132340567954d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.041886155779305d) + "'", double1 == (-2.041886155779305d));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-34.768015146316124d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999992d) + "'", double1 == (-0.9999999999999992d));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-3L), (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.27281660270156344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27281660270156344d + "'", double1 == 0.27281660270156344d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        double double2 = org.apache.commons.math.util.FastMath.max(0.19889727702244434d, 192.9948452238572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 192.9948452238572d + "'", double2 == 192.9948452238572d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.917152335778733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40992093554642245d + "'", double1 == 0.40992093554642245d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1114662041916602E64d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.2599210498948732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8999083480823814d) + "'", double1 == (-0.8999083480823814d));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-36.04365338911715d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.0871877068532832E16d, 0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0500567432162665E7d + "'", double2 == 2.0500567432162665E7d);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.433050857264759d + "'", double1 == 0.433050857264759d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.010714594648513057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010714594648513057d + "'", double1 == 0.010714594648513057d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4577979139729038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16369732444195506d + "'", double1 == 0.16369732444195506d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964138d) + "'", double1 == (-0.9251475365964138d));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4199028052956143d + "'", double1 == 0.4199028052956143d);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 146408.8292591365d + "'", double1 == 146408.8292591365d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6105647004975028d, 0.009443140013387965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5553313201112098d + "'", double2 == 1.5553313201112098d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        float float2 = org.apache.commons.math.util.FastMath.min(1477896.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        double double1 = org.apache.commons.math.util.FastMath.floor((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 36L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        int int2 = org.apache.commons.math.util.FastMath.max(5, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.27572056477178236d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        float float2 = org.apache.commons.math.util.FastMath.max(53.0f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        double double2 = org.apache.commons.math.util.FastMath.min(1833.0d, 8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.88178419700125E-16d + "'", double2 == 8.88178419700125E-16d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 1.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6955886362231636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7672312144687762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9154657226686728d + "'", double1 == 0.9154657226686728d);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        double double1 = org.apache.commons.math.util.FastMath.cosh(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134338E15d + "'", double1 == 1.5860134523134338E15d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8741924549777425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6416164750242573d + "'", double1 == 0.6416164750242573d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, 1477896.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        long long1 = org.apache.commons.math.util.FastMath.round(3.053714424981458d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.637986554446436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.011800076512800236d, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.011800076512800238d + "'", double2 == 0.011800076512800238d);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.09933992780358329d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09933992780358328d + "'", double2 == 0.09933992780358328d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11275809360067206d + "'", double1 == 0.11275809360067206d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        double double1 = org.apache.commons.math.util.FastMath.atanh(65.3011208856134d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.7626139187213443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9397458386915911d + "'", double1 == 1.9397458386915911d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.041914824263685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.93525951038501d + "'", double1 == 56.93525951038501d);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.4281826694961446d), (-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4281826694961446d) + "'", double2 == (-0.4281826694961446d));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int int1 = org.apache.commons.math.util.FastMath.abs(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        int int1 = org.apache.commons.math.util.FastMath.round(1477896.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6508801680230075d + "'", double1 == 0.6508801680230075d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.7405700602011438d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8898968261331758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4214298233873417d) + "'", double1 == (-1.4214298233873417d));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7529602598008398d + "'", double1 == 1.7529602598008398d);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        double double1 = org.apache.commons.math.util.FastMath.log(0.01417015866070404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.2566170283977d) + "'", double1 == (-4.2566170283977d));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5282839739597525d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-30.2684420922929d) + "'", double1 == (-30.2684420922929d));
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.425305228849993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1526029135263929d + "'", double1 == 1.1526029135263929d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        double double1 = org.apache.commons.math.util.FastMath.atan(104.9439511105971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5612677191481816d + "'", double1 == 1.5612677191481816d);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        double double1 = org.apache.commons.math.util.FastMath.log1p(37.40464270515639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6481783560655225d + "'", double1 == 3.6481783560655225d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016031504549832633d + "'", double1 == 0.016031504549832633d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        double double1 = org.apache.commons.math.util.FastMath.log10((-8.51313365841725d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        double double1 = org.apache.commons.math.util.FastMath.atan(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560391584864855d + "'", double1 == 1.560391584864855d);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8627965031787168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01505863975516233d) + "'", double1 == (-0.01505863975516233d));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        long long1 = org.apache.commons.math.util.FastMath.round(0.24187736759082779d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.01568485717214877d, 2.6878438789017723E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.995557355458841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 1477896);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }
}

