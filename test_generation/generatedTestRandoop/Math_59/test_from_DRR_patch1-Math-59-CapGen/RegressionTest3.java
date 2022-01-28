import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.325835187949904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0626395431802995d) + "'", double1 == (-1.0626395431802995d));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8940757456435277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9455557866374292d + "'", double1 == 0.9455557866374292d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7798578119818305d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        double double1 = org.apache.commons.math.util.FastMath.log(20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.99822295029797d + "'", double1 == 2.99822295029797d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.28354302476765203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066027288565E7d + "'", double1 == 3.748066027288565E7d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9231784609934363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8259963669851865d) + "'", double1 == (-0.8259963669851865d));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        double double1 = org.apache.commons.math.util.FastMath.acosh(564.2979850674102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.02872884975508d + "'", double1 == 7.02872884975508d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3877787807814457E-17d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999329299739067d + "'", double1 == 0.999329299739067d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.80544915674607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.79382339397931d + "'", double1 == 2.79382339397931d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        double double1 = org.apache.commons.math.util.FastMath.acosh(68.98400770596488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.926969347450164d + "'", double1 == 4.926969347450164d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.281588225835499d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2853242860200621d) + "'", double1 == (-0.2853242860200621d));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1189396031849521d + "'", double1 == 1.1189396031849521d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.047460767623888615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.719301677299958d + "'", double1 == 2.719301677299958d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        int int2 = org.apache.commons.math.util.FastMath.max(32, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1489123351881216d + "'", double1 == 0.1489123351881216d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1752011936438014d) + "'", double1 == (-1.1752011936438014d));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(74.68585461772224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.211267075873332d + "'", double1 == 4.211267075873332d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        double double1 = org.apache.commons.math.util.FastMath.atan(20.049875621120893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5209620005493156d + "'", double1 == 1.5209620005493156d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987703015216d + "'", double1 == 0.19611987703015216d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134298E15d + "'", double1 == 1.5860134523134298E15d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1679173671934143E40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0384003448748685E38d + "'", double1 == 2.0384003448748685E38d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2724546286048326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1280313065712462d + "'", double1 == 1.1280313065712462d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9976952979536658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8797429772373989d) + "'", double1 == (-0.8797429772373989d));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.7992447670407303E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7992447670407306E-4d + "'", double1 == 1.7992447670407306E-4d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.07270966677774478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.002644512574656d + "'", double1 == 1.002644512574656d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604872310455469d + "'", double1 == 1.5604872310455469d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.6017821704857126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6017821704857126d + "'", double2 == 0.6017821704857126d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5294913521432763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.92801823594317d + "'", double1 == 0.92801823594317d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9641154037397511d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.62246680578897d + "'", double1 == 1.62246680578897d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        double double1 = org.apache.commons.math.util.FastMath.cosh(147.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.244348724433776E63d + "'", double1 == 5.244348724433776E63d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.268356063861754E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.555348061489414d, 3.9588076367332294d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 151.64788521288048d + "'", double2 == 151.64788521288048d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.034776717477448635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03476270436970922d + "'", double1 == 0.03476270436970922d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        double double1 = org.apache.commons.math.util.FastMath.atan(19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5202860320095168d + "'", double1 == 1.5202860320095168d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.093079357587117d + "'", double1 == 1.093079357587117d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.385849999980594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.2815882258354989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24541566109532464d) + "'", double1 == (-0.24541566109532464d));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        long long1 = org.apache.commons.math.util.FastMath.round(0.17364817766693033d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        long long1 = org.apache.commons.math.util.FastMath.round(0.03476270436970922d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8721824073781502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8721824073781502d + "'", double1 == 0.8721824073781502d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.362545819211763E122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.362545819211763E122d + "'", double1 == 5.362545819211763E122d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8370086477683244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9917933885729989d + "'", double1 == 0.9917933885729989d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01745240643728351d) + "'", double1 == (-0.01745240643728351d));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.241434156324286E213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9385078997951388d + "'", double1 == 0.9385078997951388d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3939063732470823d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.176458219595615E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.17645782688986E-4d + "'", double1 == 6.17645782688986E-4d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.12179813610068427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4319786974204731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4623267743738125d + "'", double1 == 0.4623267743738125d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 423.3617290541267d + "'", double1 == 423.3617290541267d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0384003448748685E38d, 0.9999999958776928d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.038399603650754E38d + "'", double2 == 2.038399603650754E38d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8307927247660993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9114783183192562d + "'", double1 == 0.9114783183192562d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5282839739597525d) + "'", double1 == (-0.5282839739597525d));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8864602386292288d, 1.5706882123157566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5138141380889977d + "'", double2 == 0.5138141380889977d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5604872310455469d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1598987305185835d + "'", double1 == 1.1598987305185835d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        double double1 = org.apache.commons.math.util.FastMath.cos(21.445599564021325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8548425446316326d) + "'", double1 == (-0.8548425446316326d));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.51625986486027d + "'", double1 == 43.51625986486027d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03011360650845773d + "'", double1 == 0.03011360650845773d);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0045829120729024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017533279424944842d + "'", double1 == 0.017533279424944842d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7615165085805535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2724434278529467d) + "'", double1 == (-0.2724434278529467d));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5706882123157566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0811447892938331E-4d + "'", double1 == 1.0811447892938331E-4d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7612912090796752d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.723945865132188d + "'", double1 == 0.723945865132188d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8656100066608416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000011d + "'", double1 == 100.00000000000011d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4623267743738125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.770170914020331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7177916798535343d + "'", double1 == 0.7177916798535343d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 97, (double) 5.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.587340257E9d + "'", double2 == 8.587340257E9d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4961362064880912d + "'", double1 == 0.4961362064880912d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.6342583428795024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5879598790812549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6285343982292605d + "'", double1 == 0.6285343982292605d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.62246680578897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4274266235030735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        long long1 = org.apache.commons.math.util.FastMath.abs(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double double2 = org.apache.commons.math.util.FastMath.min(1.055287372175112d, 1.0297469578324094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0297469578324094d + "'", double2 == 1.0297469578324094d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9676589901702034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9676589901702034d + "'", double1 == 0.9676589901702034d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7992447670407303E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.056454263945691766d + "'", double1 == 0.056454263945691766d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.618990892446662d + "'", double1 == 0.618990892446662d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.0590011172720796d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, (float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.9481478E13f + "'", float2 == 3.9481478E13f);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.12209950109463034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12270990624068587d + "'", double1 == 0.12270990624068587d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7871.825828205634d, 5792.618751480198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9364017098556218d + "'", double2 == 0.9364017098556218d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1102230246251565E-16d, 4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999837d + "'", double2 == 0.9999999999999837d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        double double2 = org.apache.commons.math.util.FastMath.pow(35.0d, (-16.13381690095078d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.225431076931693E-25d + "'", double2 == 1.225431076931693E-25d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6782858550610652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9704971179648552d + "'", double1 == 1.9704971179648552d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2073305257621814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2073305257621814d + "'", double1 == 1.2073305257621814d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.2240401467946809d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4333079051049607d) + "'", double1 == (-0.4333079051049607d));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7177916798535343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5410395588486396d + "'", double1 == 0.5410395588486396d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        double double1 = org.apache.commons.math.util.FastMath.asinh(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.06855266446079726d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.066255716330613d) + "'", double1 == (-0.066255716330613d));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5209620005493156d, 0.9736488930495181d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9736488930495181d + "'", double2 == 0.9736488930495181d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.268356063861754E-9d, 0.6900198725289799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.635078747156649E-9d + "'", double2 == 7.635078747156649E-9d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        double double1 = org.apache.commons.math.util.FastMath.log((-5.377465624848392d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867717342662448d + "'", double1 == 1.9867717342662448d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.2956086822491306d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.4633067985287282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5506433159893342d + "'", double1 == 1.5506433159893342d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5872139151569291d), 0.6562860065218095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.587213915156929d) + "'", double2 == (-0.587213915156929d));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double double1 = org.apache.commons.math.util.FastMath.signum(57.816495852442316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double1 = org.apache.commons.math.util.FastMath.floor(100.00000000000011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9364017098556218d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3845986357215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.13838687427840005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13838687427840005d + "'", double1 == 0.13838687427840005d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8656100066608416d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.02872884975508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.675894270215288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.675894270215288d + "'", double1 == 0.675894270215288d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9867486543660318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9867486543660318d + "'", double1 == 1.9867486543660318d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1478260473879486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5287499284227858d + "'", double1 == 0.5287499284227858d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8805765261215637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4122900538217174d + "'", double1 == 1.4122900538217174d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int int1 = org.apache.commons.math.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988731032017402d + "'", double1 == 0.9988731032017402d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int int1 = org.apache.commons.math.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5403023023993377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.26736318179044144d) + "'", double1 == (-0.26736318179044144d));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.002378303970603899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0023782994864568557d + "'", double1 == 0.0023782994864568557d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7727985235349918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6579332160517204d + "'", double1 == 0.6579332160517204d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0L, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.066255716330613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.066255716330613d + "'", double1 == 0.066255716330613d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0000000041223074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752012000048542d + "'", double1 == 1.1752012000048542d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.079573887825082E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04494573522768691d + "'", double1 == 0.04494573522768691d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8807733836535281d, 3.082130173350885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.082130173350885d + "'", double2 == 3.082130173350885d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9251475365964139d), 6.176458219595615E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5701287081656916d) + "'", double2 == (-1.5701287081656916d));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int int1 = org.apache.commons.math.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double2 = org.apache.commons.math.util.FastMath.pow(47.98895829359383d, 0.8807733836535281d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.24854792009568d + "'", double2 == 30.24854792009568d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.615120516841261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9952731515503573d) + "'", double1 == (-0.9952731515503573d));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.24331311680122622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.4319786974204731d, 12.610439577969121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4319786974204732d + "'", double2 == 0.4319786974204732d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        double double1 = org.apache.commons.math.util.FastMath.abs(328280.63500117435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.63500117435d + "'", double1 == 328280.63500117435d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8402235152809697d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5684916247485625d + "'", double1 == 2.5684916247485625d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658792E-16d + "'", double1 == 7.951386703658792E-16d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9882281837083275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5501702829958328d + "'", double1 == 0.5501702829958328d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.0384003448748685E38d, 0.9534625892455924d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0811447892938331E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.9999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3862943611198906d + "'", double1 == 1.3862943611198906d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9676589901702034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891013135438892d + "'", double1 == 0.9891013135438892d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.6571064922358931d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.5684916247485625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5422402091037605d + "'", double1 == 0.5422402091037605d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        double double1 = org.apache.commons.math.util.FastMath.rint(151.64788521288048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 152.0d + "'", double1 == 152.0d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154434690031884d + "'", double1 == 2.154434690031884d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        double double1 = org.apache.commons.math.util.FastMath.ulp(13.803668954118542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.644483341943227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.703675447597915d + "'", double1 == 14.703675447597915d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.45961320728596883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4308194525790353d + "'", double1 == 0.4308194525790353d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5792.618751480198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.1002695260926d + "'", double1 == 101.1002695260926d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6407835429487976d + "'", double1 == 0.6407835429487976d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.652900463031381d + "'", double1 == 2.652900463031381d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        double double2 = org.apache.commons.math.util.FastMath.max(2.7668694253884004E30d, 0.12236703082541885d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7668694253884004E30d + "'", double2 == 2.7668694253884004E30d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.384371602954472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36649792250229657d + "'", double1 == 0.36649792250229657d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8253690221023695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.29016150730573d + "'", double1 == 47.29016150730573d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3831970825634745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1760939939322343d + "'", double1 == 1.1760939939322343d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577948946323d + "'", double1 == 572.9577948946323d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9676589901702034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1259023567118747d + "'", double1 == 1.1259023567118747d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        double double1 = org.apache.commons.math.util.FastMath.ceil(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 573.0d + "'", double1 == 573.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.010308913146243284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0103622330573048d + "'", double1 == 1.0103622330573048d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1483650317358706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1472859194620699d + "'", double1 == 0.1472859194620699d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.2724434278529467d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8003118125268405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22275386159456184d) + "'", double1 == (-0.22275386159456184d));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5293379817723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6419693473089224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8012298966644482d + "'", double1 == 0.8012298966644482d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.999999999999886d + "'", double1 == 34.999999999999886d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2533141373154901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5019296225954823d + "'", double1 == 3.5019296225954823d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2490457723982544d + "'", double1 == 1.2490457723982544d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6306583303604348d + "'", double1 == 0.6306583303604348d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1489123351881216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13881569933980162d + "'", double1 == 0.13881569933980162d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5315194283752256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48654169271239384d + "'", double1 == 0.48654169271239384d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.14782604738794858d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14891233518812158d + "'", double1 == 0.14891233518812158d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double double1 = org.apache.commons.math.util.FastMath.log(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.350812057622625d + "'", double1 == 6.350812057622625d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(30.24854792009568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.248547920095685d + "'", double1 == 30.248547920095685d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9925591367766533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6894198109289533d + "'", double1 == 0.6894198109289533d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5108256237659907d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.48654169271239384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4514673102343218d + "'", double1 == 0.4514673102343218d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7615941559557649d) + "'", double1 == (-0.7615941559557649d));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(35.0d, 35.522071152216526d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8135279227115655d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.4333079051049607d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.339410356026747d + "'", double1 == 25.339410356026747d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.788723182374373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15339215657878688d + "'", double1 == 0.15339215657878688d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5506433159893342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.998019200072578d + "'", double1 == 0.998019200072578d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9717769481908543d + "'", double1 == 0.9717769481908543d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        double double1 = org.apache.commons.math.util.FastMath.acos((-24.53305982277447d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1015071856306502d, 0.29393556482342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29393556482342d + "'", double2 == 0.29393556482342d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0601505205018036d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6306583303604348d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.44127637925208785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5108256237659907d), 0.7775220823415316d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5108256237659906d) + "'", double2 == (-0.5108256237659906d));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        double double1 = org.apache.commons.math.util.FastMath.cos(101.1002695260926d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8422760256473161d + "'", double1 == 0.8422760256473161d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0d, 0.02037631460522075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02037631460522075d + "'", double2 == 0.02037631460522075d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        double double1 = org.apache.commons.math.util.FastMath.sin(2302.9401181042886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15211025423281543d) + "'", double1 == (-0.15211025423281543d));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3205004784536853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3205004784536856d + "'", double1 == 1.3205004784536856d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(8.119741647423155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8495160374040984d + "'", double1 == 2.8495160374040984d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9795918367346939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017097102876679145d + "'", double1 == 0.017097102876679145d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        double double1 = org.apache.commons.math.util.FastMath.log(3.9481480091340625E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.306852819440063d + "'", double1 == 31.306852819440063d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4403028592460305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4403028592460307d + "'", double1 == 1.4403028592460307d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6285343982292605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        long long1 = org.apache.commons.math.util.FastMath.abs(2005L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2005L + "'", long1 == 2005L);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.29403979995923674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2577689529157872d + "'", double1 == 0.2577689529157872d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double double1 = org.apache.commons.math.util.FastMath.rint(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.3784176643307493d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3348404966530283d) + "'", double1 == (-1.3348404966530283d));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.35650241886700945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35650241886700945d + "'", double1 == 0.35650241886700945d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.008837977760189355d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.317146865907417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5631579404637894d + "'", double1 == 0.5631579404637894d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8358515696195364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5811141142770077d + "'", double1 == 0.5811141142770077d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9364017098556218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06571071737855876d) + "'", double1 == (-0.06571071737855876d));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0601505205018036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8145870194540231d + "'", double1 == 0.8145870194540231d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4342944819032518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4651773501465964d + "'", double1 == 0.4651773501465964d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.5534301753820028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5534301753820028d + "'", double1 == 1.5534301753820028d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double1 = org.apache.commons.math.util.FastMath.asin(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.7430987570063676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.735339681653402d + "'", double1 == 7.735339681653402d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.019831596490547193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019830296785124987d + "'", double1 == 0.019830296785124987d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3205004784536856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7452953479050968d + "'", double1 == 3.7452953479050968d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1417162261588426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9899750504798679d + "'", double1 == 0.9899750504798679d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6144289961559061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9091342957581129d + "'", double1 == 0.9091342957581129d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.284009411162292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.857041449915169d + "'", double1 == 4.857041449915169d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1361158038315415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1361158038315415d + "'", double1 == 1.1361158038315415d);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.44855772084253d + "'", double1 == 2.44855772084253d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.019831596490547193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001966525547152d + "'", double1 == 1.0001966525547152d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.3079900213234987E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(40.19388753718691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7015156767002264d + "'", double1 == 0.7015156767002264d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.8464654362980488d, 1.1256209726545494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9943400969063074d + "'", double2 == 1.9943400969063074d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5293379817722998d, 1.62246680578897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7558589813143318d + "'", double2 == 0.7558589813143318d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.38625675609943166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39593320820718014d + "'", double1 == 0.39593320820718014d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1752012000048542d, 2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2005.3522829578812d + "'", double2 == 2005.3522829578812d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8809094881441943E7d + "'", double1 == 1.8809094881441943E7d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.723945865132188d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7239458651321878d + "'", double2 == 0.7239458651321878d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9091342957581129d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0811447892938331E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0812032351028643E-4d + "'", double1 == 1.0812032351028643E-4d);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.197874973409682E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794896d + "'", double1 == 1.570796326794896d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1259023567118747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1259023567118747d + "'", double1 == 1.1259023567118747d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.3784176643307493d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6912193154397878d) + "'", double1 == (-0.6912193154397878d));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3788396218579066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7727985235349918d, 0.4319786974204731d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0610850527508946d + "'", double2 == 1.0610850527508946d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3254103039381046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3845986357215d + "'", double1 == 1.3845986357215d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.428182669496151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4160734237838899d) + "'", double1 == (-0.4160734237838899d));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.158638853279167d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8623188722876839d, 0.0023783039706038994d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8623188722876838d + "'", double2 == 0.8623188722876838d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5702200276960676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702200276960676d + "'", double1 == 1.5702200276960676d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        long long1 = org.apache.commons.math.util.FastMath.round(0.24331311680122625d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6632456843634444d, (-0.4333079051049607d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.149497948085797d + "'", double2 == 2.149497948085797d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.776356839400251E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400251E-15d + "'", double1 == 1.776356839400251E-15d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5507969934215644d, 1.009088214590764d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5507969934215644d + "'", double2 == 1.5507969934215644d);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.01030854798077996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01030818285411862d + "'", double1 == 0.01030818285411862d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 39481480091341L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.000000000000014d + "'", double1 == 32.000000000000014d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1472859194620699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14675398103145348d + "'", double1 == 0.14675398103145348d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.1015071856306502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.11171283996957d + "'", double1 == 63.11171283996957d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.1362667799148092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1362667799148092d + "'", double1 == 0.1362667799148092d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4651773501465964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46517735014659645d + "'", double1 == 0.46517735014659645d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        long long1 = org.apache.commons.math.util.FastMath.abs(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8208605814597707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8208605814597707d + "'", double1 == 0.8208605814597707d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5534301753820028d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0011273202561264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.544406443719329d + "'", double1 == 1.544406443719329d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4422495703074083d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.079573887825082E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079573912775347E-5d + "'", double1 == 9.079573912775347E-5d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.7353126200110887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.938628468106426d + "'", double1 == 20.938628468106426d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.6571064922358931d), (-0.2724434278529467d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6571064922358931d) + "'", double2 == (-1.6571064922358931d));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2982952388073998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5253536785057736d) + "'", double1 == (-0.5253536785057736d));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(19.781104616480253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1133.3738086310673d + "'", double1 == 1133.3738086310673d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268069E13d + "'", double1 == 7.896296018268069E13d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.912801418045861d + "'", double1 == 0.912801418045861d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.129830963909753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0951332666770965d + "'", double1 == 2.0951332666770965d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.244348724433776E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 147.4131591025766d + "'", double1 == 147.4131591025766d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double double1 = org.apache.commons.math.util.FastMath.atan(170.75141916320402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5649399270507434d + "'", double1 == 1.5649399270507434d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5138141380889977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8708761885459468d + "'", double1 == 0.8708761885459468d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9734594443576854d + "'", double1 == 0.9734594443576854d);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125784E-17d + "'", double1 == 5.551115123125784E-17d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.034776717477448635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034776717477448635d + "'", double1 == 0.034776717477448635d);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int int1 = org.apache.commons.math.util.FastMath.round(2.14748365E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7992447670407306E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.14027452341391E-6d + "'", double1 == 3.14027452341391E-6d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        double double1 = org.apache.commons.math.util.FastMath.ulp(100.0000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027066513565235144d + "'", double1 == 0.027066513565235144d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.12952606822871066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13025531550365874d + "'", double1 == 0.13025531550365874d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8656100066608416d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015107744654441735d) + "'", double1 == (-0.015107744654441735d));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9443504370351302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.381816156307044d + "'", double1 == 1.381816156307044d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6894198109289533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.8655219413764763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8451846157611319d) + "'", double1 == (-0.8451846157611319d));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.903339110766513d + "'", double1 == 0.903339110766513d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.066255716330613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9978058928475745d + "'", double1 == 0.9978058928475745d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int int2 = org.apache.commons.math.util.FastMath.max(52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(42.81354925721529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2453.0356784138967d + "'", double1 == 2453.0356784138967d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.000000000000014d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1598987305185835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1598987305185837d + "'", double1 == 1.1598987305185837d);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.028730419947964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 564.2988711233953d + "'", double1 == 564.2988711233953d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.066255716330613d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6177859350239399d + "'", double1 == 1.6177859350239399d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        int int1 = org.apache.commons.math.util.FastMath.round(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5737618316160396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2349946114235455d + "'", double1 == 1.2349946114235455d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.62246680578897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0184447437332007d + "'", double1 == 1.0184447437332007d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2453.0356784138967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2453.035678413897d + "'", double1 == 2453.035678413897d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9567066132883968d, 0.6419693473089224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6419693473089224d + "'", double2 == 0.6419693473089224d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.375942878091087d, 2.652900463031381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3759428780910872d + "'", double2 == 1.3759428780910872d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 39481480091341L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281828459045d + "'", double1 == 2.718281828459045d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9455557866374292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0928900516588147d + "'", double1 == 1.0928900516588147d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        double double1 = org.apache.commons.math.util.FastMath.expm1(12.610439577969121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 299669.7281315037d + "'", double1 == 299669.7281315037d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.045392431815163135d, (-1.2240401467946807d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04539243181516313d + "'", double2 == 0.04539243181516313d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.6853169696133173d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.652900463031381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4694715627858907d + "'", double1 == 0.4694715627858907d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7813863964118538d + "'", double1 == 0.7813863964118538d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.788723182374374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.788723182374376d + "'", double1 == 8.788723182374376d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3588470982042273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8173735548289334d + "'", double1 == 1.8173735548289334d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7615165085805536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.1494681981443936d), 1.059903262040248d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8807733836535281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015372395508685268d + "'", double1 == 0.015372395508685268d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.24331311680122625d, (-0.8295667582777111d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2301052825991547d + "'", double2 == 3.2301052825991547d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7015156767002264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7604870043227957d + "'", double1 == 0.7604870043227957d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5160141294778328d), 0.017097102876679145d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.5701287081656916d), 0.29393556482342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5701287081656914d) + "'", double2 == (-1.5701287081656914d));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4519004066366517d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5707963267948712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031175112035d + "'", double1 == 1.2334031175112035d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.2240401467946809d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7673480719979073d) + "'", double1 == (-2.7673480719979073d));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.0343154071137053d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.3079900213234987E-5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999999999733659d + "'", double1 == 0.999999999733659d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8805765261215637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.413416950619977d + "'", double1 == 1.413416950619977d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        double double1 = org.apache.commons.math.util.FastMath.log(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988091d + "'", double1 == 4.605170185988091d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.038991025401791155d + "'", double1 == 0.038991025401791155d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5506433159893342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        double double1 = org.apache.commons.math.util.FastMath.expm1(97.68799240441712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.662907307470914E42d + "'", double1 == 2.662907307470914E42d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.551115123125784E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.01745240643728351d), 0.07264407634054174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07264407634054174d + "'", double2 == 0.07264407634054174d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.0911052960943115d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.013811841723194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1966267533422026d + "'", double1 == 1.1966267533422026d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        long long1 = org.apache.commons.math.util.FastMath.round(50.50495049504956d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.241434156324286E213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.241434156324286E213d + "'", double1 == 6.241434156324286E213d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8101858850092454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9322410534856177d) + "'", double1 == (-0.9322410534856177d));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1833.4649444186343d, 1.225431076931693E-25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.375942878091087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9423260789913604d + "'", double1 == 0.9423260789913604d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.40205067186377547d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.03580664819349d) + "'", double1 == (-23.03580664819349d));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7015156767002264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.844882667516732d + "'", double1 == 0.844882667516732d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.857041449915169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.02872884975508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6783712618582197d + "'", double1 == 0.6783712618582197d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.319776824715853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3678794411714424d + "'", double1 == 0.3678794411714424d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2754679320391344d, 0.8003118125268405d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2754679320391344d + "'", double2 == 1.2754679320391344d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9440892412430648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8412810707398334d + "'", double1 == 0.8412810707398334d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.41032129904824216d), 0.4596132072859689d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395564933646284d + "'", double1 == 1.5395564933646284d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.2724434278529467d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.5160141294778328d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1124045972580494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9586654676184496d + "'", double1 == 0.9586654676184496d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.19611987703015216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19486506597972084d + "'", double1 == 0.19486506597972084d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8101858850092454d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5538249887862297d, 1.9704971179648552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3831824358869964d + "'", double2 == 2.3831824358869964d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        long long1 = org.apache.commons.math.util.FastMath.round(3.465735902799727d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.015372395508685268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01537239550868527d + "'", double1 == 0.01537239550868527d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6321205588285577d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.020026897690215144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        double double1 = org.apache.commons.math.util.FastMath.asin(13.803668954118542d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.66161881444429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029000719225137573d + "'", double1 == 0.029000719225137573d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.24541566109532464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24541566109532462d) + "'", double1 == (-0.24541566109532462d));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0149280275816275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0049514518537068d + "'", double1 == 1.0049514518537068d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.48706190399811883d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0001966525547152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9663322113622317E-4d + "'", double1 == 1.9663322113622317E-4d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.32317036277189654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.51629785054141d + "'", double1 == 18.51629785054141d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8130791098485624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0342796520587978d + "'", double1 == 1.0342796520587978d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 3.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.22275386159456184d), 0.999329299739067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22275386159456181d) + "'", double2 == (-0.22275386159456181d));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.295214085529645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.295214085529645d + "'", double1 == 4.295214085529645d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.45961320728596883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1074946319245942d + "'", double1 == 1.1074946319245942d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8797429772373989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.374629511804778d) + "'", double1 == (-1.374629511804778d));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.24395830743395697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2182984788308782d + "'", double1 == 0.2182984788308782d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7595020127952743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1194710708535681d) + "'", double1 == (-0.1194710708535681d));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.652900463031381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.882947592858927d) + "'", double1 == (-0.882947592858927d));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.19334632705655572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5507969934215644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1574928494310313d + "'", double1 == 1.1574928494310313d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2490457723982544d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.9481480091340625E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.890818211544855E11d + "'", double1 == 6.890818211544855E11d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.28448959157673537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6576913458149567d + "'", double1 == 0.6576913458149567d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8130791098485624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.028730419947965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.48654169271239384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3128799382546272d) + "'", double1 == (-0.3128799382546272d));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9997917751171265d + "'", double1 == 0.9997917751171265d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0297469578324094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.00015465023301d + "'", double1 == 59.00015465023301d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5872139151569291d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5309649148733837d) + "'", double1 == (-0.5309649148733837d));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        double double1 = org.apache.commons.math.util.FastMath.log1p(11.553863346113918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5300284545496456d + "'", double1 == 2.5300284545496456d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3588470982042273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.647248825753966d + "'", double1 == 4.647248825753966d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.3831824358869964d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.8542643515376653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3496452317282857d + "'", double1 == 1.3496452317282857d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) 39481480091341L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0001966525547152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7854964800073828d + "'", double1 == 0.7854964800073828d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.338683839135873d) + "'", double1 == (-9.338683839135873d));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        double double2 = org.apache.commons.math.util.FastMath.min(0.027066513565235144d, 0.844882667516732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027066513565235144d + "'", double2 == 0.027066513565235144d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8832389348340275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7080382254384119d + "'", double1 == 0.7080382254384119d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        double double1 = org.apache.commons.math.util.FastMath.abs(47.98895829359383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.98895829359383d + "'", double1 == 47.98895829359383d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        double double2 = org.apache.commons.math.util.FastMath.min(2.9982229502979716d, 0.9988731032017402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9988731032017402d + "'", double2 == 0.9988731032017402d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.374629511804778d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.03214487176113d) + "'", double1 == (-5.03214487176113d));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1361158038315415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3967916312027995d + "'", double1 == 1.3967916312027995d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9663322113622317E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.949874371066198d + "'", double1 == 18.949874371066198d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(631011.7651164598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 794.3624897466268d + "'", double1 == 794.3624897466268d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.1483650317358706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1772213045900053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.2853242860200621d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29332775741353423d) + "'", double1 == (-0.29332775741353423d));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9734594443576854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8624815133123458d + "'", double1 == 0.8624815133123458d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5496008503596722d, 0.19334632705655574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2325241103312965d + "'", double2 == 1.2325241103312965d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double double1 = org.apache.commons.math.util.FastMath.log(1735.209878559419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.458883652534391d + "'", double1 == 7.458883652534391d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        double double1 = org.apache.commons.math.util.FastMath.log(1.248076799411382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2216038060437409d + "'", double1 == 0.2216038060437409d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        double double2 = org.apache.commons.math.util.FastMath.pow(101.1002695260926d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7872015511864028E9d + "'", double2 == 1.7872015511864028E9d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.019830296785124987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020028223269184096d + "'", double1 == 0.020028223269184096d);
    }
}

