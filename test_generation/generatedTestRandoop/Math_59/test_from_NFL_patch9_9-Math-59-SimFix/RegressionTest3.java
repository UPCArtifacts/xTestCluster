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
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5686300059875781d + "'", double1 == 0.5686300059875781d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.053086467974937d, 0.6585081942517719d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.358364510279281d + "'", double2 == 1.358364510279281d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        double double1 = org.apache.commons.math.util.FastMath.asinh(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.509011168189731d + "'", double1 == 4.509011168189731d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8809373872769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7370361196913022d, 0.6982469888270821d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.470434916701856d + "'", double2 == 1.470434916701856d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5176229516918588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8029179645860509d + "'", double1 == 0.8029179645860509d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.216499084404722d + "'", double1 == 0.216499084404722d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5942992187596847d), (-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5942992187596847d) + "'", double2 == (-0.5942992187596847d));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5607966601082317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1599753909038675d + "'", double1 == 1.1599753909038675d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        double double1 = org.apache.commons.math.util.FastMath.asin(11013.232874703413d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4577979139729036d + "'", double1 == 1.4577979139729036d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        double double1 = org.apache.commons.math.util.FastMath.ulp(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 11013);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11013 + "'", int1 == 11013);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        long long1 = org.apache.commons.math.util.FastMath.abs(36L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 36L + "'", long1 == 36L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151569291d) + "'", double1 == (-0.5872139151569291d));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.983031862437426d + "'", double1 == 0.983031862437426d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9171523356672744d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        double double1 = org.apache.commons.math.util.FastMath.log(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4466128799118947d + "'", double1 == 1.4466128799118947d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.24434609527920614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00426464387701392d + "'", double1 == 0.00426464387701392d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.618990892446662d + "'", double1 == 0.618990892446662d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3036.676314193363d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.711666086263719d) + "'", double1 == (-8.711666086263719d));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.18070977791825d + "'", double1 == 22.18070977791825d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double double2 = org.apache.commons.math.util.FastMath.min(533.252579626545d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.010374295917472898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010373923752116041d) + "'", double1 == (-0.010373923752116041d));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6997597439205169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8365164337420496d + "'", double1 == 0.8365164337420496d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8691858264600905d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        float float1 = org.apache.commons.math.util.FastMath.abs(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.678686683130433d + "'", double1 == 24.678686683130433d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7813863964118538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.770142683335514d + "'", double1 == 44.770142683335514d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5370843467987585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5954732329718483d + "'", double1 == 0.5954732329718483d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        double double1 = org.apache.commons.math.util.FastMath.sinh(192.9948452238572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.27767826196252E83d + "'", double1 == 3.27767826196252E83d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.2638973976934574E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1936674.200214744d + "'", double1 == 1936674.200214744d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24187736759082779d + "'", double1 == 0.24187736759082779d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6509498349092765d + "'", double1 == 0.6509498349092765d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6283185307179586d + "'", double1 == 0.6283185307179586d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        double double1 = org.apache.commons.math.util.FastMath.cos(24.678686683130433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8986761182296238d + "'", double1 == 0.8986761182296238d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9754001961551926d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        float float2 = org.apache.commons.math.util.FastMath.max(36.0f, 11013.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003761435487319938d + "'", double1 == 0.003761435487319938d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6345784979980641d + "'", double1 == 0.6345784979980641d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.12376680396006796d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12376680396006796d + "'", double2 == 0.12376680396006796d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5860134523134298E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5706386041602216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8097187196293865d + "'", double1 == 3.8097187196293865d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        double double1 = org.apache.commons.math.util.FastMath.cosh(17.247748258387592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5472906394139022E7d + "'", double1 == 1.5472906394139022E7d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0021933711408297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.0530864679749365d, 1.2222844543037337d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.912812809961445d + "'", double2 == 3.912812809961445d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9402241834946016d + "'", double1 == 0.9402241834946016d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6099169425432279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4944324908505626d) + "'", double1 == (-0.4944324908505626d));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2835736696417744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27631948176648663d + "'", double1 == 0.27631948176648663d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8369144593899815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double double1 = org.apache.commons.math.util.FastMath.expm1(10.049875621120885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23151.90693368639d + "'", double1 == 23151.90693368639d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        long long1 = org.apache.commons.math.util.FastMath.round((-36.04365338911715d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-36L) + "'", long1 == (-36L));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.2245999714347802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2245999714347802d + "'", double1 == 1.2245999714347802d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, 1477896L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.5971542229890323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        double double1 = org.apache.commons.math.util.FastMath.asin(35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9323667197459253d) + "'", double1 == (-1.9323667197459253d));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 32);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.58601345231343E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9830787956514044d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14287905018325442d + "'", double1 == 0.14287905018325442d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.010374295917472898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374668122887303d) + "'", double1 == (-0.010374668122887303d));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(53.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3036.676314193363d + "'", double1 == 3036.676314193363d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5135318290179205d, 1.2763281510370124d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6971815150945762d + "'", double2 == 1.6971815150945762d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6033293179688031d + "'", double1 == 0.6033293179688031d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-36L), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.34555558058171215d) + "'", double2 == (-0.34555558058171215d));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.403108691968676E-6d + "'", double1 == 2.403108691968676E-6d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.40589190094865796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9187506059390845d + "'", double1 == 0.9187506059390845d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.0d + "'", double1 == 90.0d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.820828880418915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24121896931803172d + "'", double1 == 0.24121896931803172d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7692389013639721d + "'", double1 == 0.7692389013639721d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        double double1 = org.apache.commons.math.util.FastMath.cos((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2917098371502295d) + "'", double1 == (-0.2917098371502295d));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        double double1 = org.apache.commons.math.util.FastMath.ceil(199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.6971815150945762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9986081305645496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5414729998706594d + "'", double1 == 0.5414729998706594d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4593566380802732d, 0.9591348389208239d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4369873807744509d + "'", double2 == 1.4369873807744509d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9132212823529585d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1224.999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.111512116496156d + "'", double1 == 7.111512116496156d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) (-53));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.12376680396006796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1240849833762582d + "'", double1 == 0.1240849833762582d);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1599753909038675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        double double2 = org.apache.commons.math.util.FastMath.min((double) (-1), 1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21551488653168732d + "'", double1 == 0.21551488653168732d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        long long1 = org.apache.commons.math.util.FastMath.abs(1477896L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1477896L + "'", long1 == 1477896L);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2583723393689585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013388202148675738d + "'", double1 == 0.013388202148675738d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1224.999999999999d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-36L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.27631948176648663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27281660270156344d + "'", double1 == 0.27281660270156344d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double double1 = org.apache.commons.math.util.FastMath.tan(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9633078296451878d) + "'", double1 == (-0.9633078296451878d));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.6881171418161737E43d, 34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.010374109835795653d), 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2015841995251388E-10d) + "'", double2 == (-1.2015841995251388E-10d));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2199463009580406d + "'", double1 == 0.2199463009580406d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        double double2 = org.apache.commons.math.util.FastMath.pow(13.0d, 0.8207422758720628d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.208435730874367d + "'", double2 == 8.208435730874367d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.9857113690718d + "'", double1 == 69.9857113690718d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8108072797718955d + "'", double1 == 3.8108072797718955d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.151665335034499d + "'", double1 == 1.151665335034499d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1477896L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4488357507586564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3707603033998556d + "'", double1 == 0.3707603033998556d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715201906E-14d + "'", double1 == 1.4210854715201906E-14d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.2245999714347802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0316268884157165d) + "'", double1 == (-1.0316268884157165d));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.011800076512800234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011869972069403028d + "'", double1 == 0.011869972069403028d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        double double2 = org.apache.commons.math.util.FastMath.min(1.4337042405910987d, 0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5638717219103803d + "'", double2 == 0.5638717219103803d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        double double2 = org.apache.commons.math.util.FastMath.atan2(45.41047360972814d, (double) (-53));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4331632610984664d + "'", double2 == 2.4331632610984664d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7615941559557655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27234146891183075d) + "'", double1 == (-0.27234146891183075d));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        double double1 = org.apache.commons.math.util.FastMath.log10((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9991396955517629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1001094562563805d + "'", double1 == 3.1001094562563805d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39585386311332965d + "'", double1 == 0.39585386311332965d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0120948455406893d + "'", double1 == 1.0120948455406893d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-35.35050620855721d), 0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-35.350506208557206d) + "'", double2 == (-35.350506208557206d));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999999995877003d + "'", double1 == 9.999999995877003d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double1 = org.apache.commons.math.util.FastMath.abs(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7174132092735896d + "'", double1 == 2.7174132092735896d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.232874695796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25469727314226837d + "'", double1 == 0.25469727314226837d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2543511479919077d + "'", double1 == 0.2543511479919077d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.516964265655408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6769292032740716d + "'", double1 == 0.6769292032740716d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7370361196913022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7370361196913022d + "'", double1 == 1.7370361196913022d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5440680443502757d + "'", double1 == 1.5440680443502757d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8650983882673103d + "'", double1 == 0.8650983882673103d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6995216443485196d) + "'", double1 == (-0.6995216443485196d));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27229885648267216d + "'", double1 == 0.27229885648267216d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.27767826196252E83d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.894806889943192E27d + "'", double1 == 6.894806889943192E27d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7615941559557655d, 0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615941559557655d + "'", double2 == 0.7615941559557655d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.399216241149525E248d, 0.18106042748149917d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1240849833762582d, 5.293329949408896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5949858734594968E-5d + "'", double2 == 1.5949858734594968E-5d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        double double1 = org.apache.commons.math.util.FastMath.sin(34.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4281826694961446d) + "'", double1 == (-0.4281826694961446d));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.011800076512800236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.15335264995992576d, (-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15335264995992573d + "'", double2 == 0.15335264995992573d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.01706683222077747d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01706683222077747d + "'", double1 == 0.01706683222077747d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        double double1 = org.apache.commons.math.util.FastMath.acos(11013.232874695796d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.2245999714347802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8410058489917948d) + "'", double1 == (-0.8410058489917948d));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5544646780753981d), 0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.506976913724955d) + "'", double2 == (-1.506976913724955d));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5949858734594968E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.594973153695066E-5d + "'", double1 == 1.594973153695066E-5d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.10757413843619563d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 11013L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.24855859029184d + "'", double1 == 22.24855859029184d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9117339147869651d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7071067811865475d + "'", double1 == 0.7071067811865475d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        double double1 = org.apache.commons.math.util.FastMath.rint(14.899277193215765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.2792211365930397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4856741544225798d + "'", double1 == 1.4856741544225798d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.02012615298501282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9997894669934126d + "'", double1 == 1.9997894669934126d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.772945733569301d) + "'", double1 == (-0.772945733569301d));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.7105940846527337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0473087914622721d + "'", double1 == 0.0473087914622721d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.1255150095460777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.971901295783916d + "'", double1 == 0.971901295783916d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03202856368786667d + "'", double1 == 0.03202856368786667d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double2 = org.apache.commons.math.util.FastMath.max(1.817884356931778d, 1.5459079327750913d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.817884356931778d + "'", double2 == 1.817884356931778d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7612492183413337d + "'", double1 == 0.7612492183413337d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4451787324341034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.80264201054018d + "'", double1 == 82.80264201054018d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9584036466699126d + "'", double1 == 0.9584036466699126d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-50.498986710526204d) + "'", double1 == (-50.498986710526204d));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6535657774206833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7010979104724594d + "'", double1 == 0.7010979104724594d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9124034991009713d + "'", double1 == 1.9124034991009713d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.450905222306537d + "'", double1 == 1.450905222306537d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.2246467991473532E-16d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.33632941342054d + "'", double1 == 5.33632941342054d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.2717628242082613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6477339825764953d) + "'", double1 == (-0.6477339825764953d));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.675024856842625d) + "'", double1 == (-2.675024856842625d));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double double1 = org.apache.commons.math.util.FastMath.exp(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 442413.3920089205d + "'", double1 == 442413.3920089205d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1217719640679913d + "'", double1 == 1.1217719640679913d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double1 = org.apache.commons.math.util.FastMath.log1p(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.009340961621595d + "'", double1 == 5.009340961621595d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.2638973976934564E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9422278221222946d + "'", double1 == 0.9422278221222946d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        double double1 = org.apache.commons.math.util.FastMath.log(1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.476482730108396d + "'", double1 == 14.476482730108396d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7237289657353609d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.723728965735361d + "'", double1 == 0.723728965735361d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.010374668122887303d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int1 = org.apache.commons.math.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        double double1 = org.apache.commons.math.util.FastMath.tanh(28.476411608537198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5143524375699184d + "'", double1 == 0.5143524375699184d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9033391107665127d, (-0.772945733569301d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665126d + "'", double2 == 0.9033391107665126d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4251053392695819d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07752552270710597d) + "'", double1 == (-0.07752552270710597d));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 295.4144370642092d + "'", double1 == 295.4144370642092d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.10655605346268d + "'", double1 == 96.10655605346268d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49824130708557135d) + "'", double1 == (-0.49824130708557135d));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40992093582609207d + "'", double1 == 0.40992093582609207d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        double double2 = org.apache.commons.math.util.FastMath.min(7.111512116496156d, 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.111512116496156d + "'", double2 == 7.111512116496156d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5708871266543591d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10, 9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5896069690147183d + "'", double1 == 0.5896069690147183d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9867717342662448d, 0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37754243147639266d + "'", double2 == 0.37754243147639266d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3707603033998556d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37076030339985566d + "'", double1 == 0.37076030339985566d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.162277660168379d + "'", double1 == 3.162277660168379d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16243485560816776d + "'", double1 == 0.16243485560816776d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        long long1 = org.apache.commons.math.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4495725029967728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4495725029967728d + "'", double1 == 1.4495725029967728d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7615941559557655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662191695169732d + "'", double1 == 0.5662191695169732d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.703530868239122d + "'", double1 == 3.703530868239122d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double double1 = org.apache.commons.math.util.FastMath.rint(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-3.0461741978670857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06728499818968087d) + "'", double1 == (-0.06728499818968087d));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5127742681331149d + "'", double1 == 0.5127742681331149d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7719417485565582d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.594973153695066E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003993711498963172d + "'", double1 == 0.003993711498963172d);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2199463009580406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2460098192572937d + "'", double1 == 1.2460098192572937d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.035124005767007416d + "'", double1 == 0.035124005767007416d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        double double1 = org.apache.commons.math.util.FastMath.log(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963267948966d) + "'", double1 == (-1.5707963267948966d));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2746361876728606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2680279460309557d + "'", double1 == 0.2680279460309557d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5840734641020676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5840734641020676d + "'", double1 == 0.5840734641020676d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        double double1 = org.apache.commons.math.util.FastMath.sinh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080869E43d + "'", double1 == 1.3440585709080869E43d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5757472671756005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5479174221765761d + "'", double1 == 0.5479174221765761d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0000000000000016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681384d + "'", double1 == 0.5403023058681384d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.010373923752116041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.581170436626687d + "'", double1 == 1.581170436626687d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5712556729872575d) + "'", double1 == (-0.5712556729872575d));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.017066003704239316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001456277756542d + "'", double1 == 1.0001456277756542d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2117649211245782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.276473161941219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07463853704904692d + "'", double1 == 0.07463853704904692d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4711276743037347d, 1.5949858734594968E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000061571306742d + "'", double2 == 1.0000061571306742d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2147483647, (-1.506976913724955d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963274966374d + "'", double2 == 1.5707963274966374d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6701982005616954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7215087615242685d + "'", double1 == 0.7215087615242685d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        double double2 = org.apache.commons.math.util.FastMath.max(1.58601345231343E15d, 1936674.200214744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.58601345231343E15d + "'", double2 == 1.58601345231343E15d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 34.982780458176066d + "'", double1 == 34.982780458176066d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(82.80264201054018d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 82.80264201054017d + "'", double2 == 82.80264201054017d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        long long1 = org.apache.commons.math.util.FastMath.round(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5259944849453191d) + "'", double1 == (-0.5259944849453191d));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9643200333078156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9879623542931133d + "'", double1 == 0.9879623542931133d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        double double1 = org.apache.commons.math.util.FastMath.acos(22.180709777452588d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        double double1 = org.apache.commons.math.util.FastMath.abs((-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.632512904931238d + "'", double1 == 4.632512904931238d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 1477896L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2863696021375706d + "'", double1 == 0.2863696021375706d);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.053086467974937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double double2 = org.apache.commons.math.util.FastMath.atan2(53.598150033144236d, 0.723728965735361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5572942752342611d + "'", double2 == 1.5572942752342611d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 1477896.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        float float2 = org.apache.commons.math.util.FastMath.max((-2.0f), 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8388608.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8388608.0d + "'", double1 == 8388608.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8627965031787168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7809568482823821d) + "'", double1 == (-0.7809568482823821d));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09966865249116202d + "'", double1 == 0.09966865249116202d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 39481480091340L, 2.876278270531895d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.948148009133999E13d + "'", double2 == 3.948148009133999E13d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5049299044217186d + "'", double1 == 2.5049299044217186d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        long long1 = org.apache.commons.math.util.FastMath.round(9.044524487391685E157d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5433467420946743d, 0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5480419174142943d + "'", double2 == 1.5480419174142943d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5282839739597525d) + "'", double1 == (-0.5282839739597525d));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 100, 100.00000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00000000000004d + "'", double2 == 100.00000000000004d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6099169425432279d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.577309983889371d + "'", double1 == 0.577309983889371d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7938702090612697d + "'", double1 == 0.7938702090612697d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.59442154605463d + "'", double1 == 31.59442154605463d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8604282210872225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-53L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 53.0f + "'", float1 == 53.0f);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650188248182272d + "'", double1 == 1.4650188248182272d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8986761182296239d + "'", double1 == 0.8986761182296239d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.6995216443485196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6995216443485196d + "'", double1 == 0.6995216443485196d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double double2 = org.apache.commons.math.util.FastMath.max(0.05723320573453925d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05723320573453925d + "'", double2 == 0.05723320573453925d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        double double1 = org.apache.commons.math.util.FastMath.cosh(43.12841819466121d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6878438789017723E18d + "'", double1 == 2.6878438789017723E18d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        int int1 = org.apache.commons.math.util.FastMath.abs((-53));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8650983882673103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.525449840305934d + "'", double1 == 0.525449840305934d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        int int1 = org.apache.commons.math.util.FastMath.round(36.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        double double1 = org.apache.commons.math.util.FastMath.atanh(13.596393407513998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.15335264995992576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1539544237334872d + "'", double1 == 0.1539544237334872d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        double double2 = org.apache.commons.math.util.FastMath.min(1.7370361196913022d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7370361196913022d + "'", double2 == 1.7370361196913022d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) 36);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.691649480399158E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.67132555791601d + "'", double1 == 41.67132555791601d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707651109236087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003875819055588d + "'", double1 == 1.003875819055588d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 208.2575111000242d + "'", double1 == 208.2575111000242d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double double1 = org.apache.commons.math.util.FastMath.exp((-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6190869198926164d + "'", double1 == 0.6190869198926164d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5063656411097343d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39731803409120725d) + "'", double1 == (-0.39731803409120725d));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.603575026530223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7260621198151926d + "'", double1 == 2.7260621198151926d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.768287758044532d + "'", double1 == 0.768287758044532d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0037614443570399263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999929257765152d + "'", double1 == 0.9999929257765152d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.2204460492503128E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503128E-16d + "'", double1 == 2.2204460492503128E-16d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.0133109241786307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.013310924178631d + "'", double1 == 2.013310924178631d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        double double1 = org.apache.commons.math.util.FastMath.abs(14.206130012655933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.206130012655933d + "'", double1 == 14.206130012655933d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9016684086532855d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01573708249221756d) + "'", double1 == (-0.01573708249221756d));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025080161104123633d + "'", double1 == 0.025080161104123633d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2460098192572937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.969914391648719d + "'", double1 == 2.969914391648719d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023970365332605832d + "'", double1 == 0.023970365332605832d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.07752552270710597d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0013530756255686267d) + "'", double1 == (-0.0013530756255686267d));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        double double1 = org.apache.commons.math.util.FastMath.tan(100.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5872139151568908d) + "'", double1 == (-0.5872139151568908d));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25d + "'", double1 == 0.25d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.1255150095460777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.377210720844658d + "'", double1 == 7.377210720844658d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.77037274892726E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6169827255860205d) + "'", double1 == (-0.6169827255860205d));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4573750283097829d + "'", double1 == 0.4573750283097829d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.89046237609173d + "'", double1 == 24.89046237609173d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948963d + "'", double1 == 1.5707963267948963d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4577979139729036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4577979139729038d + "'", double1 == 1.4577979139729038d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5557.690612768985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.01573708249221756d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8431082790768843d + "'", double1 == 0.8431082790768843d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int1 = org.apache.commons.math.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.951386703658792E-16d + "'", double1 == 7.951386703658792E-16d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int2 = org.apache.commons.math.util.FastMath.min(11013, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(22.180709777452588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.18070977745259d + "'", double1 == 22.18070977745259d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        double double2 = org.apache.commons.math.util.FastMath.min(6.0305000985748444E41d, 0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7805951733159242d + "'", double2 == 0.7805951733159242d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5896069690147183d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5896069690147184d + "'", double2 == 0.5896069690147184d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.39592515018183416d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3440585709080869E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42.042831059009366d + "'", double1 == 42.042831059009366d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.0d, 0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11012.999999999998d + "'", double2 == 11012.999999999998d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7237289657353608d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double1 = org.apache.commons.math.util.FastMath.sin(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9363055236908925d + "'", double1 == 0.9363055236908925d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.24121896931803172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4911404781913538d + "'", double1 == 0.4911404781913538d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.036109432196274d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0361094321962743d + "'", double1 == 1.0361094321962743d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3036.676314193363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        double double1 = org.apache.commons.math.util.FastMath.rint(10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.17364817766693033d, 36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9349327016694437E-28d + "'", double2 == 3.9349327016694437E-28d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037786218504155065d + "'", double1 == 0.0037786218504155065d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8809373872769856d, 1.4451787324341034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8325987327841914d + "'", double2 == 0.8325987327841914d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.155599707401653d) + "'", double1 == (-4.155599707401653d));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) '#', 0.8650983882673103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.665602783539605d + "'", double2 == 21.665602783539605d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.27229885648267216d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2722988564826722d + "'", double2 == 0.2722988564826722d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9481478E13f + "'", float1 == 3.9481478E13f);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double double1 = org.apache.commons.math.util.FastMath.acos((-3.0461741036471235E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5711009442099724d + "'", double1 == 1.5711009442099724d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8691858264600905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7857868058746702d + "'", double1 == 0.7857868058746702d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.40464270515639d + "'", double1 == 37.40464270515639d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.761511811895975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998039600078416d + "'", double1 == 0.9998039600078416d);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        double double1 = org.apache.commons.math.util.FastMath.cos((-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9210509322442526d) + "'", double1 == (-0.9210509322442526d));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 39481480091340L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.306852819440046d + "'", double1 == 31.306852819440046d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8986761182296238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01568485717214877d + "'", double1 == 0.01568485717214877d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.00426464387701392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49555014055642926d) + "'", double1 == (-0.49555014055642926d));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        long long1 = org.apache.commons.math.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.14287905018325442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4274266235030733d + "'", double1 == 1.4274266235030733d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4380253164811876d, 1.5302764730926062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5302764730926062d + "'", double2 == 1.5302764730926062d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.01706683222077747d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7719417485565582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8509245826731492d + "'", double1 == 0.8509245826731492d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        long long1 = org.apache.commons.math.util.FastMath.round(7.951386703658792E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9531657848854143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9841383326976496d + "'", double1 == 0.9841383326976496d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        double double2 = org.apache.commons.math.util.FastMath.atan2(10.000000000000002d, 0.035124005767007416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5672839406622014d + "'", double2 == 1.5672839406622014d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1477896L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1477896 + "'", int1 == 1477896);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.006360832877189446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0063607470924259965d + "'", double1 == 0.0063607470924259965d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3340213222681154E-8d + "'", double1 == 1.3340213222681154E-8d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        double double1 = org.apache.commons.math.util.FastMath.ceil(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11014.0d + "'", double1 == 11014.0d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6955886362231636d + "'", double1 == 0.6955886362231636d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        double double1 = org.apache.commons.math.util.FastMath.asinh(192.9948452238572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.955817372303998d + "'", double1 == 5.955817372303998d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.3283064365386963E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000002328306d + "'", double1 == 1.0000000002328306d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4430227241169226d, (-0.010374109835795653d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4430227241169226d + "'", double2 == 0.4430227241169226d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double double1 = org.apache.commons.math.util.FastMath.signum(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.290230958457439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.958177806871242d + "'", double1 == 0.958177806871242d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double double1 = org.apache.commons.math.util.FastMath.asinh(36.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.276858964458209d + "'", double1 == 4.276858964458209d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.3283064365386963E-10d, (-0.6904492636009615d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4477855.166669106d + "'", double2 == 4477855.166669106d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        double double1 = org.apache.commons.math.util.FastMath.atan(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        long long1 = org.apache.commons.math.util.FastMath.round(1.373400766945016d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 148.80597572185025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 53.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.663528081877013d + "'", double1 == 4.663528081877013d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.717637540215414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5702670449415695d + "'", double1 == 0.5702670449415695d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        float float1 = org.apache.commons.math.util.FastMath.abs(9.223372E18f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.223372E18f + "'", float1 == 9.223372E18f);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        long long1 = org.apache.commons.math.util.FastMath.abs(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.27631948176648663d, 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02109767107454078d + "'", double2 == 0.02109767107454078d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        long long1 = org.apache.commons.math.util.FastMath.round(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.010374668122887303d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010374668122887301d) + "'", double1 == (-0.010374668122887301d));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.07463853704904692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2732005436470559d + "'", double1 == 0.2732005436470559d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9975366607028198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7370361196913022d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7719417485565582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013472925145914125d + "'", double1 == 0.013472925145914125d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644483341943246d + "'", double1 == 4.644483341943246d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0664977916380836d) + "'", double1 == (-1.0664977916380836d));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int int1 = org.apache.commons.math.util.FastMath.round(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double double1 = org.apache.commons.math.util.FastMath.signum(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        double double1 = org.apache.commons.math.util.FastMath.log(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.242924991852436d + "'", double1 == 1.242924991852436d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9428090415820635d + "'", double1 == 0.9428090415820635d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7194601807548898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.542010393166326d + "'", double1 == 0.542010393166326d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.612434767874704E-6d + "'", double1 == 9.612434767874704E-6d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9210509322442526d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7415668164626985d + "'", double1 == 2.7415668164626985d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(89.42706130231652d, (-0.7465363222182906d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.4270613023165d + "'", double2 == 89.4270613023165d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5480419174142943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.45745887055879d + "'", double1 == 2.45745887055879d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5707956501570803d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.4907608171425d + "'", double1 == 33.4907608171425d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3320915232243828d + "'", double1 == 0.3320915232243828d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.307013259236443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9930737478319205d) + "'", double1 == (-0.9930737478319205d));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0473087914622721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.21551488653168732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5995504841726447d + "'", double1 == 0.5995504841726447d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.02109767107454078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27631948176648663d + "'", double1 == 0.27631948176648663d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4274266235030733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double1 = org.apache.commons.math.util.FastMath.floor((-34.657359027997266d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        double double1 = org.apache.commons.math.util.FastMath.log10(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1139433523068367d + "'", double1 == 1.1139433523068367d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2304174954646191E11d + "'", double1 == 1.2304174954646191E11d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.1001094562563805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.995950244065464d + "'", double1 == 0.995950244065464d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.0316268884157165d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-59.10786673843407d) + "'", double1 == (-59.10786673843407d));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.248867972642223d + "'", double1 == 1.248867972642223d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 36.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6109179126442243d + "'", double1 == 3.6109179126442243d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3887317335324654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.431733408790851d + "'", double1 == 5.431733408790851d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        float float1 = org.apache.commons.math.util.FastMath.abs(57.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int int1 = org.apache.commons.math.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.6347792607040605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5374883357278658d + "'", double1 == 0.5374883357278658d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8693235746902678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5169642656554078d + "'", double1 == 0.5169642656554078d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double double1 = org.apache.commons.math.util.FastMath.expm1(96.10655605346268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.477053318335443E41d + "'", double1 == 5.477053318335443E41d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8743692948528521d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7184726744159351d + "'", double1 == 0.7184726744159351d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.013310924178631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 115.35421880301885d + "'", double1 == 115.35421880301885d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double double2 = org.apache.commons.math.util.FastMath.min(572.9577951308232d, 2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5999999999999996d + "'", double2 == 2.5999999999999996d);
    }
}

