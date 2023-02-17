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
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.053086467974937d, 0.5308456639204424d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3986455375243887d + "'", double2 == 1.3986455375243887d);
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
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5881074181024651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8378228855141493d + "'", double1 == 0.8378228855141493d);
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
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3665191429188092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006396965815520881d + "'", double1 == 0.006396965815520881d);
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
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.01102943176403137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011028984548345453d) + "'", double1 == (-0.011028984548345453d));
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
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8990151886161798d);
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
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.16644796274347667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16644796274347667d + "'", double2 == 0.16644796274347667d);
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
        double double1 = org.apache.commons.math.util.FastMath.signum(1.000463681323821d);
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
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.01102943176403137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011029879034124758d) + "'", double1 == (-0.011029879034124758d));
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
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5135318290179205d, 1.2972814671821473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7119840454144415d + "'", double2 == 1.7119840454144415d);
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
        double double1 = org.apache.commons.math.util.FastMath.toRadians(21.402285933511266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3735403569930398d + "'", double1 == 0.3735403569930398d);
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
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7119840454144415d);
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
        double double1 = org.apache.commons.math.util.FastMath.asin(0.16644796274347667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16722627711425445d + "'", double1 == 0.16722627711425445d);
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
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4466128799118947d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-36L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7658461948190802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7057759543134d + "'", double1 == 0.7057759543134d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9550315978940166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.106976355621385d + "'", double1 == 1.106976355621385d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 11013L, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        double double1 = org.apache.commons.math.util.FastMath.tan(35.000000000000014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4738147204144684d + "'", double1 == 0.4738147204144684d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9971678302955945d, 0.9971678302955945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 35, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.15912713462618d, 0.6890624663225461d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6701224592653805d + "'", double2 == 2.6701224592653805d);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.999474205005279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5556080775287264d) + "'", double1 == (-1.5556080775287264d));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3745669993918974d, 114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.802168607459072E15d + "'", double2 == 6.802168607459072E15d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.2710663101885893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.339410356026733d + "'", double1 == 26.339410356026733d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.175201187282749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175201187282749d + "'", double1 == 1.175201187282749d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        double double1 = org.apache.commons.math.util.FastMath.acosh(45.41047360972814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.5087686982174615d + "'", double1 == 4.5087686982174615d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.414213562373095d + "'", double1 == 1.414213562373095d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, 36.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1477896L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1477896.0f + "'", float1 == 1477896.0f);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.574710978503383d + "'", double1 == 4.574710978503383d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8207422758720628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5992442618287415d + "'", double1 == 0.5992442618287415d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (-36L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.585786437626905d) + "'", double1 == (-0.585786437626905d));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        double double2 = org.apache.commons.math.util.FastMath.min(1.000463681323821d, (-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6319270787987707d) + "'", double2 == (-0.6319270787987707d));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0000000000000002d, 1477896.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.766375983153399E-7d + "'", double2 == 6.766375983153399E-7d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        double double1 = org.apache.commons.math.util.FastMath.ceil(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double1 = org.apache.commons.math.util.FastMath.log(1.450905222306537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37218765288965655d + "'", double1 == 0.37218765288965655d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.500939575070156d) + "'", double1 == (-29.500939575070156d));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 11013L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.217652850343311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7130053006861585d + "'", double1 == 2.7130053006861585d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-35.35050620855721d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2245999714347802d, 0.4344205208065718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.22459997143478d + "'", double2 == 1.22459997143478d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double double1 = org.apache.commons.math.util.FastMath.signum(8.881784197001254E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.603575026530223d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7174132092735896d + "'", double1 == 2.7174132092735896d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) 11013);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.03490658503988659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.148283155648077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.148283155648077d + "'", double1 == 2.148283155648077d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.21551488653168732d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8554182836643194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        double double1 = org.apache.commons.math.util.FastMath.abs(28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.4764116085372d + "'", double1 == 28.4764116085372d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        double double1 = org.apache.commons.math.util.FastMath.abs(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5433467420946743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4311581967195641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.755461289508684d + "'", double1 == 0.755461289508684d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double double1 = org.apache.commons.math.util.FastMath.expm1(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.003761435487319938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003761435487319938d + "'", double1 == 0.003761435487319938d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 36, (long) 11013);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11013L + "'", long2 == 11013L);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.52574989159953d) + "'", double1 == (-7.52574989159953d));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9250245035569947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7282657137693634d) + "'", double1 == (-0.7282657137693634d));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3533464791127893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33965297617976387d + "'", double1 == 0.33965297617976387d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) (-53L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.866213764556301d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.866213764556301d + "'", double1 == 0.866213764556301d);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.5835189384561104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.986111111111118d + "'", double1 == 17.986111111111118d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.219022125506721d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0682441653224442d) + "'", double1 == (-1.0682441653224442d));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double2 = org.apache.commons.math.util.FastMath.max(3.399216241149525E248d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.399216241149525E248d + "'", double2 == 3.399216241149525E248d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.3777255673228614d, (-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9125908874543283d + "'", double2 == 1.9125908874543283d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 36, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 36.0f + "'", float2 == 36.0f);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.2350469597522027d, 0.6509498349092765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6879830786861454d + "'", double2 == 1.6879830786861454d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        double double1 = org.apache.commons.math.util.FastMath.sin(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8508659131646942d) + "'", double1 == (-0.8508659131646942d));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        double double1 = org.apache.commons.math.util.FastMath.floor(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9171523356672744d), 0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9171523356672743d) + "'", double2 == (-0.9171523356672743d));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6879830786861454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6879830786861454d + "'", double1 == 1.6879830786861454d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        double double1 = org.apache.commons.math.util.FastMath.acos(11013.232874703413d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7162579075638862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.614586012538512d + "'", double1 == 0.614586012538512d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4161468365471424d) + "'", double1 == (-0.4161468365471424d));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3106472496723418d, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.939478423157959d + "'", double2 == 1.939478423157959d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.8097187196293865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
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
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.8108072797718955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5708649036675921d + "'", double1 == 1.5708649036675921d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5157707046119765d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5308456639204424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8096974249238272d + "'", double1 == 0.8096974249238272d);
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
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.3284512750821519d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3162739259961891d + "'", double1 == 0.3162739259961891d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3092866533194534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4657022738769552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.135922199745734d + "'", double1 == 1.135922199745734d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
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
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9125908874543283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03338100822971834d + "'", double1 == 0.03338100822971834d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1003275537854505E-17d + "'", double1 == 3.1003275537854505E-17d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        double double2 = org.apache.commons.math.util.FastMath.max(10.017874927409903d, 28.4764116085372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.4764116085372d + "'", double2 == 28.4764116085372d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8575532158463938d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6949948789359283d + "'", double1 == 0.6949948789359283d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9663516425671944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.367870644634905d + "'", double1 == 55.367870644634905d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2422079676186446d + "'", double1 == 1.2422079676186446d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 238.30043127241947d + "'", double1 == 238.30043127241947d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707956501570803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.301297204502775d + "'", double1 == 2.301297204502775d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1046225788468806d + "'", double1 == 1.1046225788468806d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3600357884336912d + "'", double1 == 0.3600357884336912d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8351015231807235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8351015231807235d + "'", double1 == 1.8351015231807235d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.0222383329741738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597358306d + "'", double1 == 21.487562597358306d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9407807517372623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9699385298756114d + "'", double1 == 0.9699385298756114d);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.755461289508684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9107602588845184d + "'", double1 == 0.9107602588845184d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.011028984548345453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9890316117253547d + "'", double1 == 0.9890316117253547d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3745669993918974d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9418502147163486d + "'", double1 == 0.9418502147163486d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.978724151380226E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.978724239478952E-4d) + "'", double1 == (-2.978724239478952E-4d));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.135922199745734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7588984970945903d + "'", double1 == 0.7588984970945903d);
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
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9429832520348356d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7365898990208962d) + "'", double1 == (-0.7365898990208962d));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        double double1 = org.apache.commons.math.util.FastMath.tan(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9633078296451878d) + "'", double1 == (-0.9633078296451878d));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-53), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        double double1 = org.apache.commons.math.util.FastMath.log(43.42944819032519d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.771137740740136d + "'", double1 == 3.771137740740136d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.680482178387855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.680482178387856d + "'", double1 == 4.680482178387856d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        double double1 = org.apache.commons.math.util.FastMath.log(21.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.044522437723423d + "'", double1 == 3.044522437723423d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4369873807744509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.362548825412157d + "'", double1 == 0.362548825412157d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int int1 = org.apache.commons.math.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999468579779085d + "'", double1 == 0.9999468579779085d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5686300059875781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5143524375699184d + "'", double1 == 0.5143524375699184d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9033391107665127d, 238.30043127241947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665129d + "'", double2 == 0.9033391107665129d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4251053392695819d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8365164337420496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07752552270710597d) + "'", double1 == (-0.07752552270710597d));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.691758600279624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 295.4144370642092d + "'", double1 == 295.4144370642092d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5506.500045400885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.10655605346268d + "'", double1 == 96.10655605346268d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49824130708557135d) + "'", double1 == (-0.49824130708557135d));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9171523356672744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40992093582609207d + "'", double1 == 0.40992093582609207d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        double double2 = org.apache.commons.math.util.FastMath.min(7.111512116496156d, 9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.111512116496156d + "'", double2 == 7.111512116496156d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5708871266543591d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.752220392306203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double double1 = org.apache.commons.math.util.FastMath.rint((-3.380515006246586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10, 9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9402241834946016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5896069690147183d + "'", double1 == 0.5896069690147183d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9867717342662448d, 0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.37754243147639266d + "'", double2 == 0.37754243147639266d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5992442618287415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5992442618287416d + "'", double1 == 0.5992442618287416d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9351539719278551d + "'", double1 == 0.9351539719278551d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2245999714347802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.021373301521365424d + "'", double1 == 0.021373301521365424d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        long long1 = org.apache.commons.math.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9699385298756114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030522580755008157d) + "'", double1 == (-0.030522580755008157d));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.10757413843619563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10757413843619563d + "'", double1 == 0.10757413843619563d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24619002710729043d + "'", double1 == 0.24619002710729043d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        double double1 = org.apache.commons.math.util.FastMath.floor(53.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9532533939390466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6694963894787934d + "'", double1 == 0.6694963894787934d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0589027237910784d + "'", double1 == 1.0589027237910784d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        double double1 = org.apache.commons.math.util.FastMath.rint(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1887890305557882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1887890305557882d + "'", double1 == 1.1887890305557882d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999468579779085d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9125908874543283d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3023186765274488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1411917790307853d + "'", double1 == 1.1411917790307853d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.270441887429704d + "'", double1 == 2.270441887429704d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.403108691968676E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707939236862047d + "'", double1 == 1.5707939236862047d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8461684323333869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16703684659955795d) + "'", double1 == (-0.16703684659955795d));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.570705526935434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0038586340573412d + "'", double1 == 1.0038586340573412d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8081843818082921d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1217719640679913d + "'", double1 == 1.1217719640679913d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9645836595696896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9645836595696896d + "'", double1 == 0.9645836595696896d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28495825391099355d + "'", double1 == 0.28495825391099355d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4894276498683636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.104527494446513d + "'", double1 == 2.104527494446513d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.2717628242082613d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.268524170518187d) + "'", double1 == (-0.268524170518187d));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.28495825391099355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3297065169161864d + "'", double1 == 1.3297065169161864d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16299078079570548d) + "'", double1 == (-0.16299078079570548d));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876837d + "'", double1 == 0.8623188722876837d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993832155237184d + "'", double1 == 0.9993832155237184d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152446d + "'", double1 == 1.5430806348152446d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8147100190818939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 384.43435069728696d + "'", double1 == 384.43435069728696d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.605170185988092d, 1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.287781549441661d + "'", double2 == 9.287781549441661d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 1477896.0f, 2.9802322387695312E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948764d + "'", double2 == 1.5707963267948764d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        double double2 = org.apache.commons.math.util.FastMath.max(8.467717607067357E7d, 0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.467717607067357E7d + "'", double2 == 8.467717607067357E7d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5777877754722899d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-33.10480098881463d) + "'", double1 == (-33.10480098881463d));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) 36);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1262023.5276316951d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1262023.527631695d + "'", double2 == 1262023.527631695d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        long long1 = org.apache.commons.math.util.FastMath.round(8.467717607067357E7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 84677176L + "'", long1 == 84677176L);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7629292891930135d + "'", double1 == 0.7629292891930135d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double double1 = org.apache.commons.math.util.FastMath.acos(148.80597572185025d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1215871282840145E-5d + "'", double1 == 3.1215871282840145E-5d);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.5556080775287264d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9998846607593727d) + "'", double1 == (-0.9998846607593727d));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.23910925957789303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5860134523134298E15d, 1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948957d + "'", double2 == 1.5707963267948957d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3665191429188092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.442704017851834d + "'", double1 == 1.442704017851834d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 84677176L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.4677176E7f + "'", float2 == 8.4677176E7f);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double double1 = org.apache.commons.math.util.FastMath.asin(34.99999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-1), 0.2669359115016086d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.4894276498683636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4894276498683636d + "'", double1 == 1.4894276498683636d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        long long1 = org.apache.commons.math.util.FastMath.round(0.20787957635076193d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-36));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36) + "'", int1 == (-36));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.109163004257367d, 1.8402785435782612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0363623432113664d + "'", double2 == 1.0363623432113664d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.5556080775287264d), (-0.6319270787987707d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6319270787987707d) + "'", double2 == (-0.6319270787987707d));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3673722261798014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.118870081899753d + "'", double1 == 1.118870081899753d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9944107743857757d + "'", double1 == 0.9944107743857757d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int int2 = org.apache.commons.math.util.FastMath.min((-53), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5669767943827967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.48537739999093d + "'", double1 == 32.48537739999093d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.91583280579669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.5068440202380022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5068440202380022d + "'", double1 == 1.5068440202380022d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5157707046119765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5157707046119766d + "'", double1 == 0.5157707046119766d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.2130532941206642d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2130532941206642d + "'", double1 == 1.2130532941206642d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        double double2 = org.apache.commons.math.util.FastMath.max(22026.465794806718d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22026.465794806718d + "'", double2 == 22026.465794806718d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        int int1 = org.apache.commons.math.util.FastMath.abs((-53));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.104527494446513d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.17230617170547374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17404243063263192d) + "'", double1 == (-0.17404243063263192d));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.716759133972877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6934058165391472d + "'", double1 == 2.6934058165391472d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        double double2 = org.apache.commons.math.util.FastMath.min(2.56173368499807d, (-0.7282657137693634d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7282657137693634d) + "'", double2 == (-0.7282657137693634d));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.39592515018183416d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09950371902099892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09917726107940236d + "'", double1 == 0.09917726107940236d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5638717219103803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.307469852239215d + "'", double1 == 32.307469852239215d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6530481872478414d + "'", double1 == 0.6530481872478414d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.36074528808398093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4343980560668567d + "'", double1 == 0.4343980560668567d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3665191429188092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35877271281906004d + "'", double1 == 0.35877271281906004d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8147100190818939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6836463272898621d + "'", double1 == 0.6836463272898621d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7095251320497278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7586713254405011d + "'", double1 == 0.7586713254405011d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.880378684063449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8803786840634491d + "'", double1 == 0.8803786840634491d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.0530864679749365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.053286411214247056d + "'", double1 == 0.053286411214247056d);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0001545365584956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980155d + "'", double1 == 0.6108652381980155d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.248291097914389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9977506581384374d + "'", double1 == 1.9977506581384374d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025196192240463114d + "'", double1 == 0.025196192240463114d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025470578295336027d + "'", double1 == 0.025470578295336027d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.492549213298881d + "'", double1 == 0.492549213298881d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        double double1 = org.apache.commons.math.util.FastMath.expm1(35.69314718055995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1720269046268665E15d + "'", double1 == 3.1720269046268665E15d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007812579475042568d + "'", double1 == 0.007812579475042568d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011032585021104841d) + "'", double1 == (-0.011032585021104841d));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (-53.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9182827862121189d) + "'", double1 == (-0.9182827862121189d));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.011032585021104841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        double double1 = org.apache.commons.math.util.FastMath.acos(1224.999999999999d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3268153559855746d + "'", double1 == 0.3268153559855746d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.016455121993179136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001353885748059d + "'", double1 == 1.0001353885748059d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.8803786840634491d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.49670059543249345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4032630823831073d + "'", double1 == 0.4032630823831073d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9234103443381365d + "'", double1 == 1.9234103443381365d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4650188248182274d + "'", double1 == 1.4650188248182274d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8849970445005177d, 0.24376859510303997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24376859510303997d + "'", double2 == 0.24376859510303997d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3.0d), 0.4380253164811876d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9999999999999996d) + "'", double2 == (-2.9999999999999996d));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 11013L, (float) 11013L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11013.0f + "'", float2 == 11013.0f);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9991791830426371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995895072691775d + "'", double1 == 0.9995895072691775d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        double double1 = org.apache.commons.math.util.FastMath.sinh(630998.4197775756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        long long1 = org.apache.commons.math.util.FastMath.round(0.634578497998064d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-33.10480098881463d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999958d) + "'", double1 == (-0.9999999999999958d));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.8402785435782612d, 2.3852968325547366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8402785435782614d + "'", double2 == 1.8402785435782614d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        long long1 = org.apache.commons.math.util.FastMath.round(148.80597572185025d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.011028984548345453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011028760958182176d) + "'", double1 == (-0.011028760958182176d));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8492499565656627d + "'", double1 == 0.8492499565656627d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.9323667197459253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.3805150062465854d) + "'", double1 == (-3.3805150062465854d));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        double double2 = org.apache.commons.math.util.FastMath.pow(1477895.5237242084d, 0.880378684063449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 270161.10965762276d + "'", double2 == 270161.10965762276d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.60978210179491616E17d + "'", double1 == 1.60978210179491616E17d);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2.978724239478952E-4d), (-1.506844020238002d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        long long1 = org.apache.commons.math.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8686709614860095d) + "'", double1 == (-0.8686709614860095d));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) '#', 0.33965297617976387d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3453942544278394d + "'", double2 == 3.3453942544278394d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5013507798060324d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5013507798060325d + "'", double2 == 0.5013507798060325d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7581226324091722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7103669532614669d + "'", double1 == 0.7103669532614669d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9562645537814451d + "'", double1 == 1.9562645537814451d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.30102999566398114d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.310651852518919d + "'", double1 == 0.310651852518919d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011800076512800236d + "'", double1 == 0.011800076512800236d);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.104527494446513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.16256464224861d + "'", double1 == 4.16256464224861d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.006396965815520881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1164811561836356E-4d + "'", double1 == 1.1164811561836356E-4d);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double double1 = org.apache.commons.math.util.FastMath.expm1(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        long long1 = org.apache.commons.math.util.FastMath.abs(84677176L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 84677176L + "'", long1 == 84677176L);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.4210854715202007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948823d + "'", double1 == 1.5707963267948823d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4593566380802732d, 0.8693235746902677d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4593566380802732d + "'", double2 == 1.4593566380802732d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 11013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int int1 = org.apache.commons.math.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 2.6934058165391472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1164811561836356E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1164811585031813E-4d + "'", double1 == 1.1164811585031813E-4d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        long long1 = org.apache.commons.math.util.FastMath.round(2.5999999999999996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5707963267948957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 11013.0f, 0.8693235746902678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707173906673306d + "'", double2 == 1.5707173906673306d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4032630823831073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3833162101372999d + "'", double1 == 0.3833162101372999d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4963334177617679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.43781006905283d + "'", double1 == 28.43781006905283d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.1720269046268665E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.348658628056262d) + "'", double1 == (-1.348658628056262d));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3297065169161864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8332128969929774d) + "'", double1 == (-0.8332128969929774d));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        double double1 = org.apache.commons.math.util.FastMath.asinh(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3480571885407375d + "'", double1 == 3.3480571885407375d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7245474750742176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0637969690534153d + "'", double1 == 2.0637969690534153d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        double double2 = org.apache.commons.math.util.FastMath.max(11013.0d, (double) (-36));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.0d + "'", double2 == 11013.0d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double double1 = org.apache.commons.math.util.FastMath.signum((-3.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5707173906673306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.872556723861298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6428702637760138d + "'", double1 == 0.6428702637760138d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.4253120969346567d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4134332111535645d) + "'", double1 == (-0.4134332111535645d));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4337042405910987d, 0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3694345116302007d + "'", double2 == 1.3694345116302007d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3673722261798014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9393516398044407d + "'", double1 == 0.9393516398044407d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        long long1 = org.apache.commons.math.util.FastMath.round(0.351875212525347d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.37754243147639266d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14287905018325486d + "'", double1 == 0.14287905018325486d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2), (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.9125908874543283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28162208224762103d + "'", double1 == 0.28162208224762103d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        float float1 = org.apache.commons.math.util.FastMath.abs(11013.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 11013.0f + "'", float1 == 11013.0f);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.14287905018325486d, 0.7235232133665006d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24468093598772875d + "'", double2 == 0.24468093598772875d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5436257195614513d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.3533464791127893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3533464791127894d + "'", double1 == 0.3533464791127894d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.22766430356286296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.477141806555308d + "'", double1 == 0.477141806555308d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, (float) 1477896L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1477896.0f + "'", float2 == 1477896.0f);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        double double1 = org.apache.commons.math.util.FastMath.floor(32.307469852239215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0580220586617817d + "'", double1 == 1.0580220586617817d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9948376736367679d + "'", double1 == 0.9948376736367679d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.771137740740136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7711377407401363d + "'", double1 == 3.7711377407401363d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5552986459319043d + "'", double1 == 1.5552986459319043d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.27229885648267216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1016572581144659d) + "'", double1 == (-0.1016572581144659d));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.32317658130462d + "'", double1 == 41.32317658130462d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5135318290179205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.921688867296064d + "'", double1 == 0.921688867296064d);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.660541563508116E33d + "'", double1 == 2.660541563508116E33d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6085491459180241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9165654068163128d + "'", double1 == 0.9165654068163128d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(13.596393407513998d, 18.013888888888896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.596393407514d + "'", double2 == 13.596393407514d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9995895072691775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995895072691775d + "'", double1 == 0.9995895072691775d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double double1 = org.apache.commons.math.util.FastMath.cosh(28.458847799916846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1441700230118208E12d + "'", double1 == 1.1441700230118208E12d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.948148009134034E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.282781601724098d + "'", double1 == 0.282781601724098d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.9697296111063074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5987609268125889d + "'", double1 == 0.5987609268125889d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9993832155237184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5408212093041704d + "'", double1 == 0.5408212093041704d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.93006726156715E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92560.48544260226d + "'", double1 == 92560.48544260226d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5860134523134185E15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1586013452313419L + "'", long1 == 1586013452313419L);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.05723320573453925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.989078815390096E-4d + "'", double1 == 9.989078815390096E-4d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7966043547446022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.927002471590281d + "'", double1 == 0.927002471590281d);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5707173906673306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.506328628316938E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.50632862831693E14d + "'", double1 == 3.50632862831693E14d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9407807517372623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02651157679069284d) + "'", double1 == (-0.02651157679069284d));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2304174954646191E11d + "'", double1 == 1.2304174954646191E11d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.37218765288965655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3559037465428121d + "'", double1 == 0.3559037465428121d);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 262.1116315604069d + "'", double1 == 262.1116315604069d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6094379124341003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0148369064941645d + "'", double1 == 1.0148369064941645d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.2646479502633d + "'", double1 == 572.2646479502633d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089406E-8d + "'", double1 == 4.214684851089406E-8d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int1 = org.apache.commons.math.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707939236862047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 416127.66138192907d + "'", double1 == 416127.66138192907d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1217719640679913d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4678297255314154d + "'", double1 == 1.4678297255314154d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double double1 = org.apache.commons.math.util.FastMath.atan(54.4780803985937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5524423814822215d + "'", double1 == 1.5524423814822215d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6836463272898621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.17004923332845d + "'", double1 == 39.17004923332845d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.999474205005279d), 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.999474205005279d) + "'", double2 == (-0.999474205005279d));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.35877271281906004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3441325484602916d + "'", double1 == 0.3441325484602916d);
    }
}

