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
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9917933885729989d, 1.2623230294954737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9896517787489434d + "'", double2 == 0.9896517787489434d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.013267166245943098d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000880101410325d + "'", double1 == 1.0000880101410325d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.062007555527654586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0010822360050707824d) + "'", double1 == (-0.0010822360050707824d));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8137894696727874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.14782604738794858d, 0.07258194039108286d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8704401477824153d + "'", double2 == 0.8704401477824153d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9704971179648552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.174242046627245d + "'", double1 == 7.174242046627245d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0443358463487644d, 0.5231317788620231d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1064106411944428d + "'", double2 == 1.1064106411944428d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.644298430695373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.999999999999986d + "'", double1 == 51.999999999999986d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0811447892938331E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0811447935062402E-4d + "'", double1 == 1.0811447935062402E-4d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.003862137339285236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.532821681221366d) + "'", double1 == (-1.532821681221366d));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9882281837083275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5646454682250392d + "'", double1 == 2.5646454682250392d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.15491406168101263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.875921921551335d + "'", double1 == 8.875921921551335d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.002644512574656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.017941448296478753d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01794144829647875d) + "'", double1 == (-0.01794144829647875d));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0086972736692794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03505838110136253d + "'", double1 == 0.03505838110136253d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1760939939322343d, 0.19334632705655574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1760939939322341d + "'", double2 == 1.1760939939322341d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091341L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091341L + "'", long2 == 39481480091341L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.6633689306847952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9306695450583735d + "'", double1 == 0.9306695450583735d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.6151205168412615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.357415841954476d + "'", double1 == 1.357415841954476d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.079573887825082E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009528679807730494d + "'", double1 == 0.009528679807730494d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5540437953657898d) + "'", double1 == (-0.5540437953657898d));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6576913458149567d, 1.000000000000014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6576913458149568d + "'", double2 == 0.6576913458149568d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.055287372175112d, 1.9925591367766535d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0552873721751121d + "'", double2 == 1.0552873721751121d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8721824073781502d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4403028592460307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3648534103948403d + "'", double1 == 0.3648534103948403d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.22906366042640255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20625262779927644d + "'", double1 == 0.20625262779927644d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double double2 = org.apache.commons.math.util.FastMath.min(85.7720556895209d, 1.568058636590814d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.568058636590814d + "'", double2 == 1.568058636590814d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9058595173841506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7869557758875051d + "'", double1 == 0.7869557758875051d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7372144183864715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7418580584129385d + "'", double1 == 0.7418580584129385d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8813735870195432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4920344106948838d + "'", double1 == 0.4920344106948838d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.0010822360050707824d), (-0.0640133849418872d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0640133849418872d) + "'", double2 == (-0.0640133849418872d));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double double1 = org.apache.commons.math.util.FastMath.tan(22.24871540768837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2634178653612851d + "'", double1 == 0.2634178653612851d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0626395431802995d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0811447892938331E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706882123157566d + "'", double1 == 1.5706882123157566d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2325241103312965d, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2325241103312965d + "'", double2 == 1.2325241103312965d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097587d) + "'", double1 == (-0.5063656411097587d));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.834032445247956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3025850929940461d + "'", double1 == 1.3025850929940461d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4844347252766887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9962731540917057d + "'", double1 == 0.9962731540917057d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.38818646476211366d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38818646476211366d + "'", double1 == 0.38818646476211366d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4596132072859689d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.9481480091341E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8414709848078964d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4888509771384419d + "'", double1 == 0.4888509771384419d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.04539243181516313d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4122900538217174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4122900538217174d + "'", double1 == 1.4122900538217174d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9506431907144248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1004404717609073d + "'", double1 == 1.1004404717609073d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.29655427201849516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29655427201849516d + "'", double1 == 0.29655427201849516d);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9992790497916413d), 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9992790497916413d) + "'", double2 == (-0.9992790497916413d));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000880101410325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7616311154793817d + "'", double1 == 0.7616311154793817d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double double1 = org.apache.commons.math.util.FastMath.signum(32.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8340324452479558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6826353005177082d + "'", double1 == 0.6826353005177082d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6536436208636119d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.306852817378902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306852817378903d + "'", double1 == 9.306852817378903d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8130791098485624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.219379580148095d + "'", double1 == 1.219379580148095d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3440585709083352E43d, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709083352E43d + "'", double2 == 1.3440585709083352E43d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.6571064922358931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08620304488139699d) + "'", double1 == (-0.08620304488139699d));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4422495703074083d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5160141294778328d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double double1 = org.apache.commons.math.util.FastMath.ceil(198.57204013738647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 199.0d + "'", double1 == 199.0d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.004619531120223835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999893299850896d + "'", double1 == 0.9999893299850896d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.079573912775347E-5d, 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.653029967135041E-13d + "'", double2 == 1.653029967135041E-13d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211074304587d) + "'", double1 == (-0.5440211074304587d));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.194972725426231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9088339535934726d + "'", double1 == 2.9088339535934726d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.2966885710872325d, 5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05593807141461213d + "'", double2 == 0.05593807141461213d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.217373703740946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.106250657255404d + "'", double1 == 2.106250657255404d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8173735548289334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2203415586770938d + "'", double1 == 1.2203415586770938d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double double1 = org.apache.commons.math.util.FastMath.tan(13.067188648029997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5473651378551416d + "'", double1 == 0.5473651378551416d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.008837747656337032d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5424779506349352E-4d) + "'", double1 == (-1.5424779506349352E-4d));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.16299078079570548d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double double1 = org.apache.commons.math.util.FastMath.acos(20.049875621120893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5567229026732161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999009710012459d + "'", double1 == 0.9999009710012459d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8358515696195364d, 1.3092616699137571d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5681875589916088d + "'", double2 == 0.5681875589916088d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6144289961559061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0430410006679824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.692617836018588d + "'", double1 == 8.692617836018588d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3939063732470823d, 0.29403979995923674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29403979995923674d + "'", double2 == 0.29403979995923674d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.194972725426231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.914747959740454d + "'", double1 == 2.914747959740454d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0342796520587978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7101417768967997d + "'", double1 == 0.7101417768967997d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6872483617622163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16288628673873548d) + "'", double1 == (-0.16288628673873548d));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8807733836535281d, 0.999999999733659d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999999733659d + "'", double2 == 0.999999999733659d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6020907673908776d + "'", double1 == 0.6020907673908776d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.0086972736692794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1088821403655396d + "'", double1 == 1.1088821403655396d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1133.3738086310673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.665617603588785d + "'", double1 == 33.665617603588785d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.868551121099462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.231690697458971d + "'", double1 == 1.231690697458971d);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.0590011172720796d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-24.53305982277447d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-24.0d) + "'", double1 == (-24.0d));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double double1 = org.apache.commons.math.util.FastMath.rint(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 573.0d + "'", double1 == 573.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2453.0356784138967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.52813017280076d + "'", double1 == 49.52813017280076d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0393768734000801d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5119471234779015d, 0.6632456843634444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6414234112961992d + "'", double2 == 0.6414234112961992d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.207110122769961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.464944418635d + "'", double1 == 1833.464944418635d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.568058636590814d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.80544915674607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9836542011042855d + "'", double1 == 1.9836542011042855d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1737190189178428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8651465522704365d + "'", double1 == 0.8651465522704365d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double double1 = org.apache.commons.math.util.FastMath.signum(3279.925622497139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8662588077101039d, 0.0038621373392852356d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0038621373392852356d + "'", double2 == 0.0038621373392852356d);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.741265442356241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.741265442356241d + "'", double1 == 4.741265442356241d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double double1 = org.apache.commons.math.util.FastMath.acos(1735.209878559419d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 100L, 0.016371056514872515d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706326162312105d + "'", double2 == 1.5706326162312105d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3453962389097756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1599121686187173d + "'", double1 == 1.1599121686187173d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1189396031849521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.11051679254084d + "'", double1 == 64.11051679254084d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9586654676184496d, 100.00000000000011d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9586654676184497d + "'", double2 == 0.9586654676184497d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7264225280476576d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.07998609361042E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079986106087252E-5d + "'", double1 == 9.079986106087252E-5d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.32317036277189654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3815006871452328d + "'", double1 == 0.3815006871452328d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8173735548289334d, 0.9914978027470505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0713634642907175d + "'", double2 == 1.0713634642907175d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5504171915615343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.056454263945691766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0580782213705773d + "'", double1 == 1.0580782213705773d);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.6853169696133173d), 1.5574077105338615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077105338615d + "'", double2 == 1.5574077105338615d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.635078747156649E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.635078747156649E-9d + "'", double1 == 7.635078747156649E-9d);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', 51L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8252737291036185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.75228229788744d + "'", double1 == 0.75228229788744d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3759428780910867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012097700501686678d + "'", double1 == 0.012097700501686678d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-1.6571064922358931d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6571064922358931d) + "'", double2 == (-1.6571064922358931d));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        double double1 = org.apache.commons.math.util.FastMath.tan(137.38927884571783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.11742496684289d) + "'", double1 == (-1.11742496684289d));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1189396031849521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019529180206536243d + "'", double1 == 0.019529180206536243d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07496085456049556d) + "'", double1 == (-0.07496085456049556d));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.176459005007259E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.17645900500726E-4d + "'", double1 == 6.17645900500726E-4d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9022955440581245d, 0.9896517787489434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9032560372034026d + "'", double2 == 0.9032560372034026d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        float float2 = org.apache.commons.math.util.FastMath.min(2005.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.389377026852705d + "'", double1 == 14.389377026852705d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6536436208636119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011408233318727529d) + "'", double1 == (-0.011408233318727529d));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8479780433329283E-10d, 0.6576913458149567d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8479780433329283E-10d + "'", double2 == 1.8479780433329283E-10d);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9379924444723454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4731300494385142d + "'", double1 == 1.4731300494385142d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6423001758318426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9008481395968395d + "'", double1 == 0.9008481395968395d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.01562118716426d + "'", double1 == 64.01562118716426d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.019228399099707562d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.697768889097982E-4d + "'", double2 == 3.697768889097982E-4d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7442653911513815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.29243127846782413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2565251565229352d + "'", double1 == 0.2565251565229352d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3383347192042695E42d, 8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.881784197001252E-16d + "'", double2 == 8.881784197001252E-16d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double double1 = org.apache.commons.math.util.FastMath.acos(9.306852817378903d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3815006871452328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3728048593649235d + "'", double1 == 0.3728048593649235d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 100.0f, 0.8840861925242717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9385078997951388d, (-0.5708920866202177d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.036895443825105d + "'", double2 == 1.036895443825105d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3120421100391796E-12d + "'", double1 == 2.3120421100391796E-12d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9306695450583735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5362067139382427d + "'", double1 == 2.5362067139382427d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        double double2 = org.apache.commons.math.util.FastMath.min(0.723945865132188d, 0.9998000199980002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.723945865132188d + "'", double2 == 0.723945865132188d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        double double1 = org.apache.commons.math.util.FastMath.log(0.020695062331941d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.8778601418535783d) + "'", double1 == (-3.8778601418535783d));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6.350812057622625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.85186683311429d + "'", double1 == 1.85186683311429d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19486506597972084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.635447929274436d) + "'", double1 == (-1.635447929274436d));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double double1 = org.apache.commons.math.util.FastMath.atanh(6.350812057622625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0430410006679824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.76184719737747d + "'", double1 == 59.76184719737747d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        double double1 = org.apache.commons.math.util.FastMath.log10(503.55674565883726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.702048418162471d + "'", double1 == 2.702048418162471d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double double1 = org.apache.commons.math.util.FastMath.expm1(8.788723182374376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6558.851092551817d + "'", double1 == 6558.851092551817d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.20472119276137934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20331750452375202d) + "'", double1 == (-0.20331750452375202d));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        double double1 = org.apache.commons.math.util.FastMath.sinh(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.281623811241125E59d + "'", double1 == 4.281623811241125E59d);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.2944381644478575d, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.106250657255404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1074946319245942d, (-0.7798578119818305d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9234637104758648d + "'", double2 == 0.9234637104758648d);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9033391107665127d, 16.75071124639625d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665127d + "'", double2 == 0.9033391107665127d);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        double double1 = org.apache.commons.math.util.FastMath.floor(18.51629785054141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.0d + "'", double1 == 18.0d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8540342600388389d + "'", double1 == 1.8540342600388389d);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2233932393493425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2233932393493425d + "'", double1 == 1.2233932393493425d);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.30113949866026923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30113949866026923d + "'", double1 == 0.30113949866026923d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9455557866374292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.757421577635591d + "'", double1 == 0.757421577635591d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6632456843634444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        long long1 = org.apache.commons.math.util.FastMath.round(6558.851092551817d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6559L + "'", long1 == 6559L);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.40205067186377547d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007017107983878209d) + "'", double1 == (-0.007017107983878209d));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.273736754432579E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544328376E-13d + "'", double1 == 2.2737367544328376E-13d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 51L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 51.0f + "'", float1 == 51.0f);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        double double1 = org.apache.commons.math.util.FastMath.tanh(15.830314951333888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999645d + "'", double1 == 0.9999999999999645d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9952731515503573d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6303775321964172d) + "'", double1 == (-0.6303775321964172d));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3396806684922336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3396806684922336d + "'", double1 == 1.3396806684922336d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.024913294410754107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.635447929274436d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.44596416383918d + "'", double1 == 15.44596416383918d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9322410534856177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2005577706253316d) + "'", double1 == (-1.2005577706253316d));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8624815133123458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6219097454839793d + "'", double1 == 0.6219097454839793d);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2577689529157872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2577689529157872d + "'", double1 == 0.2577689529157872d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.013811841723194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6853169696133173d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (short) 100, 0.5954182863428418d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5954182863428418d + "'", double2 == 0.5954182863428418d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9971213268799871d, 2.0634370688955608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9971213268799871d + "'", double2 == 0.9971213268799871d);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.04494573522768691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.043964956056685586d + "'", double1 == 0.043964956056685586d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.552713678800501E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.200655107570901E-17d + "'", double1 == 6.200655107570901E-17d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7372144183864715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8058302155599485d + "'", double1 == 0.8058302155599485d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28448959157673537d + "'", double1 == 0.28448959157673537d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.003862137339285236d, 0.1737190189178428d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38087816655559065d + "'", double2 == 0.38087816655559065d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        double double2 = org.apache.commons.math.util.FastMath.max(3.7581226324091723d, 0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7581226324091723d + "'", double2 == 3.7581226324091723d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 8.692617836018588d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.047460767623888615d, 1.4844347252766887d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04746076762388862d + "'", double2 == 0.04746076762388862d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1063634786066832d, 0.8253695151090449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9298471527633106d + "'", double2 == 0.9298471527633106d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        double double1 = org.apache.commons.math.util.FastMath.log(7.735339681653402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.045799397948117d + "'", double1 == 2.045799397948117d);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.197874973409682E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.197874973409682E-16d + "'", double1 == 7.197874973409682E-16d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9506431907144247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.021982458226793896d) + "'", double1 == (-0.021982458226793896d));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.2578451663452497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.978364500953377d + "'", double1 == 0.978364500953377d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double double2 = org.apache.commons.math.util.FastMath.atan2(9.079573912775347E-5d, 0.12236703082541885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.419949789789507E-4d + "'", double2 == 7.419949789789507E-4d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7869557758875051d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10404967275869402d) + "'", double1 == (-0.10404967275869402d));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.07258194039108286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.139171425638416d) + "'", double1 == (-1.139171425638416d));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9506431907144248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4869328269593647d + "'", double1 == 1.4869328269593647d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        double double2 = org.apache.commons.math.util.FastMath.max(0.24769059955591424d, 2.0949973684651075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0949973684651075d + "'", double2 == 2.0949973684651075d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0430410006679824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.014145948783788d + "'", double1 == 1.014145948783788d);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 2005L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.0d + "'", double1 == 2005.0d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        double double1 = org.apache.commons.math.util.FastMath.sin(49.52813017280076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6723302958523574d) + "'", double1 == (-0.6723302958523574d));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5496008503596722d, 1.4519004066366517d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41934812792152054d + "'", double2 == 0.41934812792152054d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.45961320728596883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4274266235030735d, 0.7869557758875051d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4274266235030733d + "'", double2 == 1.4274266235030733d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.7166721312869937d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.78552109133565d + "'", double1 == 81.78552109133565d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8662588077101039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.866258807710104d + "'", double1 == 0.866258807710104d);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2203415586770938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.939216676724527d + "'", double1 == 0.939216676724527d);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40517925701617413d) + "'", double1 == (-0.40517925701617413d));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        float float1 = org.apache.commons.math.util.FastMath.abs(52.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5422326689561365d, 0.9999197990932152d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9955758626477091d + "'", double2 == 0.9955758626477091d);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7418580584129385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7418580584129385d + "'", double1 == 0.7418580584129385d);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        long long1 = org.apache.commons.math.util.FastMath.round(3279.925622497139d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3280L + "'", long1 == 3280L);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2737367544323206E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544323206E-13d + "'", double1 == 2.2737367544323206E-13d);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.09711515743188391d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09254849966825912d) + "'", double1 == (-0.09254849966825912d));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        double double1 = org.apache.commons.math.util.FastMath.floor(49.52813017280076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.0d + "'", double1 == 49.0d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3648534103948403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38195407365429795d + "'", double1 == 0.38195407365429795d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        double double1 = org.apache.commons.math.util.FastMath.log(32.29225137547852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4748273059530623d + "'", double1 == 3.4748273059530623d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6112949659561453d) + "'", double1 == (-1.6112949659561453d));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.23107092469448914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23313271272363228d) + "'", double1 == (-0.23313271272363228d));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        long long1 = org.apache.commons.math.util.FastMath.round(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7871.825828205634d, 1.5202860320095168d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7871.825828205633d + "'", double2 == 7871.825828205633d);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9231784609934364d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        double double1 = org.apache.commons.math.util.FastMath.sinh(104.94395132690269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8860316424407535E45d + "'", double1 == 1.8860316424407535E45d);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.745427304692527d + "'", double1 == 0.745427304692527d);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.44855772084253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6388749269043887d + "'", double1 == 0.6388749269043887d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1417162261588426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8485804212570964d) + "'", double1 == (-0.8485804212570964d));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        double double1 = org.apache.commons.math.util.FastMath.floor(81.78552109133565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 81.0d + "'", double1 == 81.0d);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.14891233518812158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15002289137601957d + "'", double1 == 0.15002289137601957d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.02048526137339397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1737190189178428d + "'", double1 == 1.1737190189178428d);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9114783183192562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4879978688854127d + "'", double1 == 1.4879978688854127d);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.02872884975508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155445780598082d + "'", double1 == 1.9155445780598082d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5309649148733837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5087348157117294d) + "'", double1 == (-0.5087348157117294d));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        float float2 = org.apache.commons.math.util.FastMath.min(2.14748365E9f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2453.035678413897d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(33.665617603588785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.66561760358879d + "'", double1 == 33.66561760358879d);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(564.2988711233953d, 0.12209950109463034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 564.2988711233952d + "'", double2 == 564.2988711233952d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.009528679807730494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00952839143559888d + "'", double1 == 0.00952839143559888d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.207110122769961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7131306085479543d) + "'", double1 == (-2.7131306085479543d));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        double double2 = org.apache.commons.math.util.FastMath.min(1.014145948783788d, 0.3939063732470823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3939063732470823d + "'", double2 == 0.3939063732470823d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5287499284227858d, 0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5287499284227857d + "'", double2 == 0.5287499284227857d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double double1 = org.apache.commons.math.util.FastMath.atanh(6558.851092551817d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3939063732470823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6782858550610652d, 4.035274726494073E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6782858550610651d + "'", double2 == 0.6782858550610651d);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5707963267948968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.167375502789719d + "'", double1 == 1.167375502789719d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9747047669009431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6503846142007115d + "'", double1 == 2.6503846142007115d);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.504654289280179d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 4L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1361158038315415d, 1.381816156307044d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1928445361837339d + "'", double2 == 1.1928445361837339d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9335211344483768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7322313444854719d + "'", double1 == 0.7322313444854719d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        double double1 = org.apache.commons.math.util.FastMath.tan(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.238693057170856d + "'", double1 == 2.238693057170856d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4920344106948838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double double1 = org.apache.commons.math.util.FastMath.sin(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9202613644617779d) + "'", double1 == (-0.9202613644617779d));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9999999999999645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.552713678800564E-14d) + "'", double1 == (-3.552713678800564E-14d));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.013267166245943098d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.013266387909445128d) + "'", double1 == (-0.013266387909445128d));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double double2 = org.apache.commons.math.util.FastMath.atan2(59.836036390007024d, 4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4944906593359573d + "'", double2 == 1.4944906593359573d);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 9223372036854775807L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4870619039981188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6144289961559061d + "'", double1 == 0.6144289961559061d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        double double2 = org.apache.commons.math.util.FastMath.pow(74.68585461772224d, (-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.00952839143559888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009483282630450406d + "'", double1 == 0.009483282630450406d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.3348404966530283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1010569721060828d) + "'", double1 == (-1.1010569721060828d));
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3092616699137571d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.8860316424407535E45d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5111502441944042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9199653037215055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5092033284084692d + "'", double1 == 1.5092033284084692d);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9058595173841506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.967580150761081d + "'", double1 == 0.967580150761081d);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        long long1 = org.apache.commons.math.util.FastMath.abs(3280L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3280L + "'", long1 == 3280L);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        float float2 = org.apache.commons.math.util.FastMath.min(3.9481478E13f, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.079986106087252E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5847565358656169E-6d + "'", double1 == 1.5847565358656169E-6d);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.428182669496151d), 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.428182669496151d) + "'", double2 == (-0.428182669496151d));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int int1 = org.apache.commons.math.util.FastMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 51L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9233096377747994d + "'", double1 == 0.9233096377747994d);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.085536923187668d + "'", double1 == 20.085536923187668d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8340324452479558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8340324452479558d + "'", double1 == 0.8340324452479558d);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        double double2 = org.apache.commons.math.util.FastMath.max(4.9E-324d, 0.6306583303604348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6306583303604348d + "'", double2 == 0.6306583303604348d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        long long1 = org.apache.commons.math.util.FastMath.round(2005.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2005L + "'", long1 == 2005L);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625952d + "'", double1 == 0.9999092042625952d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.5708920866202177d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4961362064880912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.64236324311418d + "'", double1 == 1.64236324311418d);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5501702829958328d, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5501702829958329d + "'", double2 == 0.5501702829958329d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.47197233734299E-43d) + "'", double1 == (-7.47197233734299E-43d));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.4397629335614917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        double double1 = org.apache.commons.math.util.FastMath.abs(6558.851092551817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6558.851092551817d + "'", double1 == 6558.851092551817d);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.993222846126381d + "'", double1 == 3.993222846126381d);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5847565358656169E-6d, 5.434544929861085E-21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.434544929861085E-21d + "'", double2 == 5.434544929861085E-21d);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0086972736692794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6974863893961706d + "'", double1 == 0.6974863893961706d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9950371902099892d, (-1.11742496684289d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0055748560585922d + "'", double2 == 1.0055748560585922d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(18.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3531453422859885d + "'", double1 == 4.3531453422859885d);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.20637502874300212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20637502874300212d + "'", double1 == 0.20637502874300212d);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.773775678340353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.893061714674763d + "'", double1 == 5.893061714674763d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9586654676184496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.764297879283013d + "'", double1 == 0.764297879283013d);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.460094597035771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6312239307697934d + "'", double1 == 0.6312239307697934d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        double double1 = org.apache.commons.math.util.FastMath.expm1(46.62670202444023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7771308193574424E20d + "'", double1 == 1.7771308193574424E20d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) 2005L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2005.0f + "'", float2 == 2005.0f);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8259324122591327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8259324122591327d + "'", double1 == 0.8259324122591327d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01743362446048348d + "'", double1 == 0.01743362446048348d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7733359594033115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0552873721751121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49297772472673135d + "'", double1 == 0.49297772472673135d);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.48689816668285923d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5085350159312789d) + "'", double1 == (-0.5085350159312789d));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        double double2 = org.apache.commons.math.util.FastMath.min(0.998019200072578d, 3.1679596500040805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.998019200072578d + "'", double2 == 0.998019200072578d);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8101858850092454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6696927901138922d) + "'", double1 == (-0.6696927901138922d));
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001181575986342d + "'", double1 == 1.0001181575986342d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        float float2 = org.apache.commons.math.util.FastMath.min(5.0f, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.289917197127753d + "'", double1 == 27.289917197127753d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1928445361837339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3124383412727525d + "'", double1 == 2.3124383412727525d);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.138288992714996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4640783251232936d + "'", double1 == 1.4640783251232936d);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915067d) + "'", double1 == (-0.9036922050915067d));
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 6559L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6559.0f + "'", float2 == 6559.0f);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, 5.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.9830700822184464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7567424583270177d + "'", double1 == 1.7567424583270177d);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.587340257E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.566702073076858d + "'", double1 == 23.566702073076858d);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        double double1 = org.apache.commons.math.util.FastMath.signum(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.23527328223197624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.23971267040716665d) + "'", double1 == (-0.23971267040716665d));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1226744880631757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4968798877157107d + "'", double1 == 0.4968798877157107d);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9917933885729989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4425944484799542d + "'", double1 == 1.4425944484799542d);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2005.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3759428780910867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9588076367332286d + "'", double1 == 3.9588076367332286d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1833.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.238292298814303d + "'", double1 == 12.238292298814303d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.44855772084253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.571645135349055d + "'", double1 == 10.571645135349055d);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        double double1 = org.apache.commons.math.util.FastMath.abs(64.11051679254084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.11051679254084d + "'", double1 == 64.11051679254084d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        double double2 = org.apache.commons.math.util.FastMath.max(1.64236324311418d, 4.857041449915169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.857041449915169d + "'", double2 == 4.857041449915169d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.013266387909445128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5840631038760165d + "'", double1 == 1.5840631038760165d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int int2 = org.apache.commons.math.util.FastMath.max(5, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2944381644478575d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.46517735014659645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.435403483148737d + "'", double1 == 0.435403483148737d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.3358347343868286E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.95177303495919d + "'", double1 == 92.95177303495919d);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0713634642907175d, (-0.467108650523244d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9683140799247235d + "'", double2 == 0.9683140799247235d);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        double double1 = org.apache.commons.math.util.FastMath.log10(57.28518781699162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7580423413226773d + "'", double1 == 1.7580423413226773d);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6105647004975029d + "'", double1 == 0.6105647004975029d);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4961362064880912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5191429678165033d + "'", double1 == 0.5191429678165033d);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5108256237659906d), 1.9925591367766535d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.25096172890041585d) + "'", double2 == (-0.25096172890041585d));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.568058636590814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 10, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6017821704857126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5706882123157566d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8479780433329283E-10d, 5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8479780433329283E-10d + "'", double2 == 1.8479780433329283E-10d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        long long1 = org.apache.commons.math.util.FastMath.round(0.2966885710872325d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.197874973409682E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.961927637439027E-6d + "'", double1 == 8.961927637439027E-6d);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.12209950109463034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9925551120260716d + "'", double1 == 0.9925551120260716d);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174802103936399d + "'", double1 == 3.174802103936399d);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, 51.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        long long1 = org.apache.commons.math.util.FastMath.round(35.522071152216526d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        long long1 = org.apache.commons.math.util.FastMath.abs(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int1 = org.apache.commons.math.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6020907673908776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5585053606381855d, 0.44127637925208785d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5585053606381853d + "'", double2 == 0.5585053606381853d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1833.464944418635d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1833.4649444186348d + "'", double2 == 1833.4649444186348d);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9088339535934726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9730337692042502d) + "'", double1 == (-0.9730337692042502d));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.413416950619977d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.552713678800564E-14d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.19216151411464572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2118662346608502d + "'", double1 == 1.2118662346608502d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 10L, 4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int int1 = org.apache.commons.math.util.FastMath.round(2005.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2005 + "'", int1 == 2005);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.13025531550365874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12952606822871066d + "'", double1 == 0.12952606822871066d);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.5087348157117294d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.4397629335614917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8454210262244998d) + "'", double1 == (-0.8454210262244998d));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5293379817722998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4248349501142077d + "'", double1 == 0.4248349501142077d);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 2005L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2005L + "'", long2 == 2005L);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7992447670407306E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010308913146243286d + "'", double1 == 0.010308913146243286d);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.41934812792152054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39707373807201474d + "'", double1 == 0.39707373807201474d);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1760939939322343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7775315238017035d + "'", double1 == 0.7775315238017035d);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09247351917780995d + "'", double1 == 0.09247351917780995d);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.10404967275869402d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 123.44001497540268d + "'", double1 == 123.44001497540268d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0049514518537068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7878677702215401d + "'", double1 == 0.7878677702215401d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027241040673019475d + "'", double1 == 0.027241040673019475d);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        long long1 = org.apache.commons.math.util.FastMath.round(0.010308913146243286d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        double double2 = org.apache.commons.math.util.FastMath.pow(32.292251375478514d, 0.27629111752846225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.61186341730071d + "'", double2 == 2.61186341730071d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        double double1 = org.apache.commons.math.util.FastMath.floor((-7.47197233734299E-43d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8651465522704365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44699510894891675d) + "'", double1 == (-0.44699510894891675d));
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.39707373807201474d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948961d + "'", double2 == 1.5707963267948961d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5294913521432763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.19638901669072d + "'", double1 == 24.19638901669072d);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.2737367544328376E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2737367544328376E-13d + "'", double1 == 2.2737367544328376E-13d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.7673480719979073d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.7131306085479543d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.713130608547954d) + "'", double1 == (-2.713130608547954d));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1966267533422026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17950655952279498d + "'", double1 == 0.17950655952279498d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01743362446048348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999848038217972d + "'", double1 == 0.999848038217972d);
    }
}

