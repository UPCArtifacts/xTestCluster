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
        double double2 = org.apache.commons.math.util.FastMath.min(1.5900247258946039d, 0.9643200333078156d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9643200333078156d + "'", double2 == 0.9643200333078156d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.0305000985748444E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6763796495118177d + "'", double1 == 0.6763796495118177d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5949858734594968E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.046060585537848d) + "'", double1 == (-11.046060585537848d));
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
        double double1 = org.apache.commons.math.util.FastMath.log(1.594973153695066E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.046068560414216d) + "'", double1 == (-11.046068560414216d));
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
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.717637540215414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06488501547250208d + "'", double1 == 0.06488501547250208d);
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
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.16954561468575624d), 5.009340961621595d);
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
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8407970089415017d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.223886926280673d) + "'", double1 == (-1.223886926280673d));
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
        double double1 = org.apache.commons.math.util.FastMath.atan(0.290230958457439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2824704504712367d + "'", double1 == 0.2824704504712367d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1139433523068367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0554351483188518d + "'", double1 == 1.0554351483188518d);
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
        double double2 = org.apache.commons.math.util.FastMath.min(1.0000061571306742d, 0.3769270190230555d);
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
        double double1 = org.apache.commons.math.util.FastMath.log(3.717637540215414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3130883967082236d + "'", double1 == 1.3130883967082236d);
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
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3130883967082236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7940763669314768d + "'", double1 == 3.7940763669314768d);
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
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0361094321962743d);
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
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6585081942517719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8700022875052251d + "'", double1 == 0.8700022875052251d);
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
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9149994957367078d, (-0.6585081942517719d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0602412165727728d + "'", double2 == 1.0602412165727728d);
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
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.1711987928317563d), 1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17119879283175626d) + "'", double2 == (-0.17119879283175626d));
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
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9643200333078156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6230034949480645d + "'", double1 == 1.6230034949480645d);
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
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0361094321962743d);
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
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9023698529915597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01574932500543992d) + "'", double1 == (-0.01574932500543992d));
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
        double double2 = org.apache.commons.math.util.FastMath.min(82.80264201054018d, 7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 82.80264201054018d + "'", double2 == 82.80264201054018d);
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
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5456620010518718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18911453025066113d + "'", double1 == 0.18911453025066113d);
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
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.010374668122887301d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374295917472897d) + "'", double1 == (-0.010374295917472897d));
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
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0554351483188518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3314525951486865d + "'", double1 == 0.3314525951486865d);
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
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.0305000985748444E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
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
        double double1 = org.apache.commons.math.util.FastMath.toRadians(442413.3920089205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7721.570345472033d + "'", double1 == 7721.570345472033d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5456620010518718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.691076096637946d + "'", double1 == 3.691076096637946d);
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
        double double2 = org.apache.commons.math.util.FastMath.min((-0.17119879283175632d), (double) 53);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.17119879283175632d) + "'", double2 == (-0.17119879283175632d));
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
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.01706683222077747d), 0.15335264995992573d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.11083531506113443d) + "'", double2 == (-0.11083531506113443d));
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
        double double1 = org.apache.commons.math.util.FastMath.log10(0.18911453025066113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7232751016930217d) + "'", double1 == (-0.7232751016930217d));
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
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.9323667197459253d), 1.121742888162593d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.044836923843401d) + "'", double2 == (-1.044836923843401d));
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
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7612492183413337d, 82.80264201054017d);
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
        long long1 = org.apache.commons.math.util.FastMath.round(0.6763796495118177d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2.14748365E9f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5803861773395897d + "'", double1 == 0.5803861773395897d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7346568543593085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665126d + "'", double1 == 0.9033391107665126d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3233383134045047d) + "'", double1 == (-0.3233383134045047d));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.238952695683498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.267013246259975d) + "'", double1 == (-1.267013246259975d));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        double double1 = org.apache.commons.math.util.FastMath.sinh(53.598150033144236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.470017988445906E22d + "'", double1 == 9.470017988445906E22d);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        long long1 = org.apache.commons.math.util.FastMath.round(1833.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1833L + "'", long1 == 1833L);
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
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5514266812416906d, 1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5514266812416907d + "'", double2 == 0.5514266812416907d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16101915387533275d + "'", double1 == 0.16101915387533275d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.276858964458209d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.2015841995251388E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2015841995251388E-10d) + "'", double1 == (-1.2015841995251388E-10d));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3394482820132315d) + "'", double1 == (-0.3394482820132315d));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double double1 = org.apache.commons.math.util.FastMath.floor(15.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.802336828985354d) + "'", double1 == (-6.802336828985354d));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3036.676314193363d + "'", double1 == 3036.676314193363d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        double double1 = org.apache.commons.math.util.FastMath.expm1(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8668856945829329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.953499812724235d + "'", double1 == 0.953499812724235d);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double double1 = org.apache.commons.math.util.FastMath.asinh(28.458847799916846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.041914822473389d + "'", double1 == 4.041914822473389d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6931471805599462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8539880479975257d + "'", double1 == 0.8539880479975257d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.339637404328899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3396374043288992d + "'", double1 == 1.3396374043288992d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9995917534020515d, 57.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9995917534020516d + "'", double2 == 0.9995917534020516d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        double double1 = org.apache.commons.math.util.FastMath.atan(34.982780458176066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422186167449905d + "'", double1 == 1.5422186167449905d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.176259623626705d + "'", double1 == 1.176259623626705d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0003963416279558d, 2.41014226417523d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0003963416279558d + "'", double2 == 1.0003963416279558d);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(22.0d, 3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.999999999999996d + "'", double2 == 21.999999999999996d);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double double1 = org.apache.commons.math.util.FastMath.atanh(21.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232874695796d, 0.9428090415820635d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874695794d + "'", double2 == 11013.232874695794d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2092204141489054d + "'", double1 == 1.2092204141489054d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6345784979980641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8862269254527582d + "'", double1 == 1.8862269254527582d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9848929415691015d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4390790887957308d) + "'", double1 == (-2.4390790887957308d));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double double1 = org.apache.commons.math.util.FastMath.atanh(22025.465703991664d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7857868058746702d, (-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2290180075135393d + "'", double2 == 1.2290180075135393d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.43305085726475895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40786779792830646d + "'", double1 == 0.40786779792830646d);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0017885376783303671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0017885395854308759d + "'", double1 == 0.0017885395854308759d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7651141195590695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9589242746631385d) + "'", double1 == (-0.9589242746631385d));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8833206860228293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0828994398682557d + "'", double1 == 1.0828994398682557d);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6017101575745776d) + "'", double1 == (-2.6017101575745776d));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5662191695169732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5152102145743461d + "'", double1 == 0.5152102145743461d);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8713868162390155d, 2.710594084652733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3110398871210387d + "'", double2 == 0.3110398871210387d);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 52L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.2015841995251388E-10d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999998798416d + "'", double1 == 0.9999999998798416d);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2543511479919077d, (-0.6540753540578407d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4484495608966435d + "'", double2 == 2.4484495608966435d);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.036109432196274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7110408458667952d + "'", double1 == 0.7110408458667952d);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7944146264030464d + "'", double1 == 0.7944146264030464d);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8113741275700294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1310377402202207d + "'", double1 == 1.1310377402202207d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21501840976713257d + "'", double1 == 0.21501840976713257d);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8646647167633873d) + "'", double1 == (-0.8646647167633873d));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(88.46858222228961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.455841039450451d + "'", double1 == 4.455841039450451d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.917152335778733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8646647167633873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
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
        double double1 = org.apache.commons.math.util.FastMath.toRadians(82.80264201054017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4451787324341032d + "'", double1 == 1.4451787324341032d);
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
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9250245035569947d), 0.7215087615242685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9250245035569947d) + "'", double2 == (-0.9250245035569947d));
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
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
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
        double double1 = org.apache.commons.math.util.FastMath.tan(0.21501840976713257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21839450088746076d + "'", double1 == 0.21839450088746076d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.4484495608966435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.570393614520828d + "'", double1 == 11.570393614520828d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8125492953065081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8125492953065081d + "'", double1 == 0.8125492953065081d);
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
        double double2 = org.apache.commons.math.util.FastMath.max(1.0730374999763912d, 0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0730374999763912d + "'", double2 == 1.0730374999763912d);
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
        long long1 = org.apache.commons.math.util.FastMath.round(71.98610843089314d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72L + "'", long1 == 72L);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4689057088038128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4689057088038129d + "'", double1 == 0.4689057088038129d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
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
        double double1 = org.apache.commons.math.util.FastMath.exp(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.476411608537195d + "'", double1 == 28.476411608537195d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.594700892207039d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.59470089220704d + "'", double2 == 4.59470089220704d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8029955704341625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5894494874428781d + "'", double1 == 0.5894494874428781d);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.163964051005108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762747174039086d + "'", double1 == 1.762747174039086d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        double double1 = org.apache.commons.math.util.FastMath.exp(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (byte) 10, 1.6971815150945762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6971815150945762d + "'", double2 == 1.6971815150945762d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0893507405929967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08558186793850525d + "'", double1 == 0.08558186793850525d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        double double2 = org.apache.commons.math.util.FastMath.pow(36.0d, 0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.860223607044047d + "'", double2 == 3.860223607044047d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2045352723380653d + "'", double1 == 1.2045352723380653d);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017451520543541533d) + "'", double1 == (-0.017451520543541533d));
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706683222077747d + "'", double1 == 0.01706683222077747d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.04675969811694d + "'", double1 == 2.04675969811694d);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7167799266569768d + "'", double1 == 0.7167799266569768d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 5, 53.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9918472337211128d + "'", double1 == 1.9918472337211128d);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9696515784005106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6370255026277432d + "'", double1 == 1.6370255026277432d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.219022125506721d + "'", double1 == 1.219022125506721d);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        long long2 = org.apache.commons.math.util.FastMath.min(39481480091340L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.971901295783916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01696287761582862d + "'", double1 == 0.01696287761582862d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        float float1 = org.apache.commons.math.util.FastMath.abs(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999500037496876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7938702090612697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.701090835570466d + "'", double1 == 0.701090835570466d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        double double1 = org.apache.commons.math.util.FastMath.asin(34.30685281944005d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.030467198227893608d), 1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.030467198227893608d) + "'", double2 == (-0.030467198227893608d));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.953499812724235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7413633920040708d + "'", double1 == 0.7413633920040708d);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.917152335778733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.450905222423708d + "'", double1 == 1.450905222423708d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-36L), (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-36.0f) + "'", float2 == (-36.0f));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        double double1 = org.apache.commons.math.util.FastMath.sinh(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2829673798684508E23d + "'", double1 == 2.2829673798684508E23d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        double double1 = org.apache.commons.math.util.FastMath.floor(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5506.0d + "'", double1 == 5506.0d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        double double1 = org.apache.commons.math.util.FastMath.asinh(11014.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000069652443239d + "'", double1 == 10.000069652443239d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.971901295783916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9905446432719665d + "'", double1 == 0.9905446432719665d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.883847335314108d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6341811450608946d + "'", double1 == 0.6341811450608946d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.723728965735361d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.866213764556301d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.219022125506721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.860223607044047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8746486203042796d + "'", double1 == 0.8746486203042796d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7706382705810251d + "'", double1 == 0.7706382705810251d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.542010393166326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5728275353520677d + "'", double1 == 0.5728275353520677d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0986122886681098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6666666666666667d + "'", double1 == 1.6666666666666667d);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.140692632779267d + "'", double1 == 23.140692632779267d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9754001961551926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9917318921852735d + "'", double1 == 0.9917318921852735d);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.93006726156715E14d + "'", double1 == 7.93006726156715E14d);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6094379124341003d, 1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6094379124341003d + "'", double2 == 1.6094379124341003d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.5049299044217186d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8872978375373093E32d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.561893127573004E64d + "'", double2 == 3.561893127573004E64d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000001d + "'", double1 == 32.00000000000001d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.253350360695029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09807249034549381d + "'", double1 == 0.09807249034549381d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0554351483188518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.055435148318852d + "'", double1 == 1.055435148318852d);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.5971542229890323d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.581170436626687d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02759663015433203d + "'", double1 == 0.02759663015433203d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.3314525951486865d, 0.701090835570466d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4416248142133119d + "'", double2 == 0.4416248142133119d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 0, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1477896, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
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
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5654575915353359d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9991396955517629d), 0.3283909087132568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9991396955517629d) + "'", double2 == (-0.9991396955517629d));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        int int1 = org.apache.commons.math.util.FastMath.round(3.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        long long1 = org.apache.commons.math.util.FastMath.round(11013.232874703415d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11013L + "'", long1 == 11013L);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        double double1 = org.apache.commons.math.util.FastMath.floor((-48.18608569304648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.0d) + "'", double1 == (-49.0d));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0691962561940713d + "'", double1 == 1.0691962561940713d);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.928261786081652d + "'", double1 == 2.928261786081652d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.11083531506113443d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9938640517322503d + "'", double1 == 0.9938640517322503d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9708235100106998d + "'", double1 == 0.9708235100106998d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int1 = org.apache.commons.math.util.FastMath.round((float) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.545185591332969E49d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.545185591332969E49d + "'", double1 == 2.545185591332969E49d);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.551115123125783E-17d, 1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.551115123125784E-17d + "'", double2 == 5.551115123125784E-17d);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int int2 = org.apache.commons.math.util.FastMath.min((-36), 1477896);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-36) + "'", int2 == (-36));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9187506059390845d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9187506059390844d + "'", double2 == 0.9187506059390844d);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9686168251319445d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5664399512265195d + "'", double1 == 0.5664399512265195d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        double double1 = org.apache.commons.math.util.FastMath.atanh(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.0017885395854308759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.042291128921215566d + "'", double1 == 0.042291128921215566d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4430227241169226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 52, 42.12656474461543d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        long long1 = org.apache.commons.math.util.FastMath.round(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3314525951486865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.344459247866038d + "'", double1 == 0.344459247866038d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5998406268185329d + "'", double1 == 0.5998406268185329d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        double double1 = org.apache.commons.math.util.FastMath.log(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.30756025842063d) + "'", double1 == (-2.30756025842063d));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.741297982545108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 271.6563638137265d + "'", double1 == 271.6563638137265d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        double double1 = org.apache.commons.math.util.FastMath.asinh(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3480571885407375d + "'", double1 == 3.3480571885407375d);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 11013L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055250154314d + "'", double1 == 1.5707055250154314d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7189991032004813d + "'", double1 == 0.7189991032004813d);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7346568543593085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01282218098091439d + "'", double1 == 0.01282218098091439d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5403023058681384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26736317900222273d) + "'", double1 == (-0.26736317900222273d));
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        double double1 = org.apache.commons.math.util.FastMath.tanh(31.306852819440046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.5068440202380022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-86.33580274416313d) + "'", double1 == (-86.33580274416313d));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9700496918579988d + "'", double1 == 0.9700496918579988d);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030368359245297637d + "'", double1 == 0.030368359245297637d);
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
        long long1 = org.apache.commons.math.util.FastMath.round(0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.18349077126961408d, 1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10600733624570037d + "'", double2 == 0.10600733624570037d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.147483647E9d + "'", double1 == 2.147483647E9d);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3887906953856204d + "'", double1 == 0.3887906953856204d);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4636456564559829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }
}

