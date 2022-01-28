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
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int int2 = org.apache.commons.math3.util.FastMath.max(1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 100.0f, 8.042848410283348d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        double double1 = org.apache.commons.math3.util.FastMath.atan(57.336116942011905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5533570812458124d + "'", double1 == 1.5533570812458124d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) '4', 1.5533570812458124d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11146324526556185d + "'", double2 == 0.11146324526556185d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.0000000462129393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761594175364013d + "'", double1 == 0.761594175364013d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        int int2 = org.apache.commons.math3.util.FastMath.min(3, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.4658842241887455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 83.9889793008241d + "'", double1 == 83.9889793008241d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9185375499501867d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.0272356433040997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int1 = org.apache.commons.math3.util.FastMath.round(10.000002f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.8414709848078965d), 0.29583625524354545d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8919599252153065d + "'", double2 == 0.8919599252153065d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.00390625f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.00390625f + "'", float2 == 0.00390625f);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(7.930127763409804E14d, (-0.4281895641080631d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07946262386988323d + "'", double2 == 0.07946262386988323d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(26.028944477141252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.296908309475615d + "'", double1 == 3.296908309475615d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1024.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207031E-4f + "'", float1 == 1.2207031E-4f);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        double double1 = org.apache.commons.math3.util.FastMath.floor(6.012089888557484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.8414709848078965d), (double) (-127.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8414709848078965d) + "'", double2 == (-0.8414709848078965d));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        long long1 = org.apache.commons.math3.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.3802897750888419d, 1.1129900353232505d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3802897750888419d + "'", double2 == 0.3802897750888419d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        double double1 = org.apache.commons.math3.util.FastMath.rint(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int2 = org.apache.commons.math3.util.FastMath.min(6, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 32768, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.1920928955078125E-7d), (-5.314369626254345d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.6332359729824427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6764125919282525d) + "'", double1 == (-0.6764125919282525d));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-1.4731414029041368d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.4315380019946446d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(8.435352933112958E63d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.833101217706723E65d + "'", double1 == 4.833101217706723E65d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.8202965860187449d, 3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.4965075614664802d + "'", double2 == 3.4965075614664802d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.503599627370496E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.38991804378757267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.624434178907251d + "'", double1 == 0.624434178907251d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        int int1 = org.apache.commons.math3.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.679522618351296d, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(39.726213847251884d, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31036104568165535d + "'", double2 == 0.31036104568165535d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49174338951939384d + "'", double1 == 0.49174338951939384d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(80.00000012160547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.770311529081762E34d + "'", double1 == 2.770311529081762E34d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(26.028944477141252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9635949927638663d + "'", double1 == 2.9635949927638663d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(4.041914989933878d, 14.703675447601967d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.041914989933879d + "'", double2 == 4.041914989933879d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-6), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-103.27892990343184d), (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.661538308752004E-256d) + "'", double2 == (-1.661538308752004E-256d));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        double double2 = org.apache.commons.math3.util.FastMath.pow(16.0d, (double) 128.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3407807929942597E154d + "'", double2 == 1.3407807929942597E154d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-1L), 511.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        float float2 = org.apache.commons.math3.util.FastMath.min((-511.5f), (-1.0000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-511.5f) + "'", float2 == (-511.5f));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        float float2 = org.apache.commons.math3.util.FastMath.max(96.99999f, 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 2147483647);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.384185791015625E-7d + "'", double1 == 2.384185791015625E-7d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.49904707604701226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048297543927715d + "'", double1 == 1.048297543927715d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.384185791015625E-7d, 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6102871923992833E-232d + "'", double2 == 1.6102871923992833E-232d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.3969567625600747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17296530872742752d + "'", double1 == 0.17296530872742752d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-40.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 40.0f + "'", float1 == 40.0f);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double double1 = org.apache.commons.math3.util.FastMath.acos(10.000000381469718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.1622777204840373d, 2.220446049250314E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1622777204840373d + "'", double2 == 3.1622777204840373d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        long long2 = org.apache.commons.math3.util.FastMath.max(1024L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1024L + "'", long2 == 1024L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        double double1 = org.apache.commons.math3.util.FastMath.signum(57.336116942011905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 0, 5.421011E-20f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.421011E-20f + "'", float2 == 5.421011E-20f);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        float float2 = org.apache.commons.math3.util.FastMath.max(6207.9995f, 3.43597363E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.43597363E10f + "'", float2 == 3.43597363E10f);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.584967478670572d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785475504d + "'", double1 == 1.0232274785475504d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0689622149987218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0688530993622138d + "'", double1 == 0.0688530993622138d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.09966865249116201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4636456564559829d + "'", double1 == 0.4636456564559829d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9999999999999929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936437905d + "'", double1 == 1.1752011936437905d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.4359738E10f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.4359738E10f + "'", float2 == 3.4359738E10f);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.536744E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9952731515503572d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9952731515503571d) + "'", double1 == (-0.9952731515503571d));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        double double1 = org.apache.commons.math3.util.FastMath.sin(3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34751057764683646d) + "'", double1 == (-0.34751057764683646d));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.48865461858873344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5342913977175717d + "'", double1 == 0.5342913977175717d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.00001f + "'", float1 == 97.00001f);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026599565235795614d + "'", double1 == 0.026599565235795614d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.5364211615694945d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-4.45174640302101d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.451746403021009d) + "'", double1 == (-4.451746403021009d));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.17540341900446973d, (-0.0174532946005379d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1754034190044697d + "'", double2 == 0.1754034190044697d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        double double1 = org.apache.commons.math3.util.FastMath.abs(33.08858916388626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.08858916388626d + "'", double1 == 33.08858916388626d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.10471975511965978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0018277045187202517d + "'", double1 == 0.0018277045187202517d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42826253011881144d) + "'", double1 == (-0.42826253011881144d));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 0L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.570796446004186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8104779544189764d + "'", double1 == 3.8104779544189764d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(100.0f, (float) (-1023));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.03703703703703703d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.8493111942973237d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.726254890556496E41d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707962635746238d + "'", double1 == 1.5707962635746238d);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.4152103671875394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0874453647522562d + "'", double1 == 1.0874453647522562d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.000000000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308244d + "'", double1 == 57.29577951308244d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(217.3083407086277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0744591563843855d + "'", double1 == 6.0744591563843855d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 126.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 127.0d + "'", double1 == 127.0d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.839986434268865d, (-4.451746403021009d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3882400312478556d + "'", double2 == 1.3882400312478556d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.877940322113382E-190d, (double) 2.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.38970161056691E-191d + "'", double2 == 9.38970161056691E-191d);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.485720850016558E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.342161576411106E-5d + "'", double1 == 2.342161576411106E-5d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.8493111942973237d, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 71.02688974004266d + "'", double2 == 71.02688974004266d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(35.01428280342778d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        double double1 = org.apache.commons.math3.util.FastMath.exp(342.7746770784939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.330790212754673E148d + "'", double1 == 7.330790212754673E148d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-3), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.7182816664368272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.302585131141017d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int1 = org.apache.commons.math3.util.FastMath.abs(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(18824.27742973676d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18824.277429736758d + "'", double2 == 18824.277429736758d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        long long2 = org.apache.commons.math3.util.FastMath.min(4609435868686548992L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-4503599627370496L) + "'", long1 == (-4503599627370496L));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904824216d) + "'", double1 == (-0.41032129904824216d));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, 7.1054274E-15f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-23), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23L) + "'", long2 == (-23L));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        float float2 = org.apache.commons.math3.util.FastMath.min((-2.9999998f), (float) (-3L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-2025.4348094013415d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.652395426951063d) + "'", double1 == (-12.652395426951063d));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(6.53313149942335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5641241260040846d + "'", double1 == 2.5641241260040846d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-2.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.11146324526556185d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.971567242793748d + "'", double2 == 8.971567242793748d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        double double1 = org.apache.commons.math3.util.FastMath.abs(10.000000381469718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000381469718d + "'", double1 == 10.000000381469718d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 100, (-3.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        long long2 = org.apache.commons.math3.util.FastMath.max(3L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        long long1 = org.apache.commons.math3.util.FastMath.round(4.041914989933878d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-23));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-3), 1.4735319749387725d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152415d + "'", double1 == 1.5430806348152415d);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.440892098500626E-16d, 1.5707963267948963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948963d + "'", double2 == 1.5707963267948963d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-2.0f), (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0d) + "'", double2 == (-2.0d));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(6.938893903907228E-18d, (double) 48.499996f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.499996185302734d + "'", double2 == 48.499996185302734d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(8192.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.765625E-4f + "'", float1 == 9.765625E-4f);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        double double2 = org.apache.commons.math3.util.FastMath.pow(10.00000038146972d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09999999618530295d + "'", double2 == 0.09999999618530295d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.54213262037718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9666600679364251d + "'", double1 == 0.9666600679364251d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0000005f + "'", float1 == 4.0000005f);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-4.5035996E15f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(7.896280957292919E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896280957293E13d + "'", double1 == 7.896280957293E13d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(4.086065389836995d, (double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483648E9d + "'", double2 == 2.147483648E9d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.8596236973023724d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-49.25280982485735d) + "'", double1 == (-49.25280982485735d));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0874453647522562d, (-0.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5395564933646284d + "'", double1 == 1.5395564933646284d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.49904707604701226d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0932951096620784d + "'", double1 == 2.0932951096620784d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 126.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4301970842553728E55d + "'", double1 == 1.4301970842553728E55d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4096.0005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.000008f, 8192.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-2L), 4.60943614E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943614E18f + "'", float2 == 4.60943614E18f);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        double double1 = org.apache.commons.math3.util.FastMath.abs(10.00000038146972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.00000038146972d + "'", double1 == 10.00000038146972d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-64L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64) + "'", int1 == (-64));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-2.9999998f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.059306170823243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.722369115788189d + "'", double1 == 0.722369115788189d);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.950212931632136d) + "'", double1 == (-0.950212931632136d));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(4.086065389836995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.626504523747204d + "'", double1 == 1.626504523747204d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.30969878586487914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5565058722645064d + "'", double1 == 0.5565058722645064d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.7091551466656096d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-40.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17) + "'", int1 == (-17));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.038341943233852725d), (double) 20.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.000036752581504d + "'", double2 == 20.000036752581504d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        double double1 = org.apache.commons.math3.util.FastMath.log10(83.9889793008241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9242223034090244d + "'", double1 == 1.9242223034090244d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5.071208929787076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 79.68657456155307d + "'", double1 == 79.68657456155307d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8813616205677708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7949487914783152d + "'", double1 == 0.7949487914783152d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 4609435868686548992L, 1.4210855E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.60943587E18f + "'", float2 == 4.60943587E18f);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.3841858E-7f + "'", float1 == 2.3841858E-7f);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.586013452313441E15d + "'", double1 == 1.586013452313441E15d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.041914989933879d, 0.6090128311061331d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3550578813391773d) + "'", double2 == (-0.3550578813391773d));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-2025.4348094013412d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 3, (double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0000000000000004d + "'", double2 == 3.0000000000000004d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int int2 = org.apache.commons.math3.util.FastMath.min(12, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-4.5035996E15f), 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5035996E15f) + "'", float2 == (-4.5035996E15f));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-4.663853435426824d), 0.9226938919179323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.05038397583716259d) + "'", double2 == (-0.05038397583716259d));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.5146893481167586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6731186635936198d + "'", double1 == 0.6731186635936198d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(57.29577951308221d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 77.37445541011408d + "'", double2 == 77.37445541011408d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.0885816328207447d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6594942162563324d + "'", double1 == 1.6594942162563324d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-4.5035996E15f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.1920928244535474E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001192092896d + "'", double1 == 1.0000001192092896d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.05235987755982989d, (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.37245959530521877d) + "'", double2 == (-0.37245959530521877d));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(234.24476918014662d, 6.324555320336759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2362223276865345d + "'", double2 == 0.2362223276865345d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.000004f + "'", float1 == 32.000004f);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.1469512391741817d), 3.3869694069128182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3869694069128182d + "'", double2 == 3.3869694069128182d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.49369669957632584d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00348177583442d + "'", double2 == 35.00348177583442d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32768, 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.4E-45f + "'", float2 == 1.4E-45f);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        float float2 = org.apache.commons.math3.util.FastMath.min(126.99999f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-6));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-5.9999995f) + "'", float1 == (-5.9999995f));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0000380832193412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.30969878586487914d, 0.9999830769532079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0468426300829488d + "'", double2 == 1.0468426300829488d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8886031942391064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8003717195249049d + "'", double1 == 0.8003717195249049d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 1.6594942162563324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-5.9999995f), (double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.999999f) + "'", float2 == (-5.999999f));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        int int2 = org.apache.commons.math3.util.FastMath.min((-5), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.6197751905438615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.7692389013639721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9162635558949132d + "'", double1 == 0.9162635558949132d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.03274454486619997d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        int int1 = org.apache.commons.math3.util.FastMath.round(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.102748784455539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4495239865639748d + "'", double1 == 0.4495239865639748d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.011443010950958454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011377788717773904d) + "'", double1 == (-0.011377788717773904d));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.231911890816295d, 0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2319118908162947d + "'", double2 == 2.2319118908162947d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(35840.0f, 3.1622777204840373d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35839.996f + "'", float2 == 35839.996f);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7237368419565787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237368419565787d + "'", double1 == 0.7237368419565787d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        double double2 = org.apache.commons.math3.util.FastMath.max(4.158638853279167d, 0.8805870712594983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.158638853279167d + "'", double2 == 4.158638853279167d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int1 = org.apache.commons.math3.util.FastMath.round(5.0000005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        double double2 = org.apache.commons.math3.util.FastMath.min((-103.27892990343184d), (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-103.27892990343184d) + "'", double2 == (-103.27892990343184d));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52L, 1.192093E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9947461586351523d + "'", double1 == 0.9947461586351523d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-58.0d), 0.024600920295739914d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 58.0d + "'", double2 == 58.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00620078535925078d + "'", double1 == 0.00620078535925078d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double double1 = org.apache.commons.math3.util.FastMath.atan(167.61264592409196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5648302606319877d + "'", double1 == 1.5648302606319877d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        double double2 = org.apache.commons.math3.util.FastMath.pow(97.0d, (-1.998096277817887d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0721086324294562E-4d + "'", double2 == 1.0721086324294562E-4d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (short) 10, 3.3869694069128182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.09711106517907972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-0.99999994f), (-64));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.4210105393100954E-20d) + "'", double2 == (-5.4210105393100954E-20d));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.9689257325599362d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9689257325599362d + "'", double2 == 0.9689257325599362d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.9576594803233847d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 142.97737232337548d + "'", double1 == 142.97737232337548d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.27106631018859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 187.4182940812372d + "'", double1 == 187.4182940812372d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.006285734418917205d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006285734418917205d + "'", double1 == 0.006285734418917205d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.0885816328207447d), (-1023));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 1024L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-7.930067261567154E14d), (-0.8596236973023724d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.403906158347758d + "'", double2 == 0.403906158347758d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(3.814697265625E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000007276d + "'", double1 == 1.000000000007276d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 403.4287934927351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.1920928244535474E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928244535474E-7d + "'", double1 == 1.1920928244535474E-7d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.19611984407111288d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.48611438053413E29d + "'", double2 == 2.48611438053413E29d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        int int2 = org.apache.commons.math3.util.FastMath.max(4, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.6102871923992833E-232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-3L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        double double1 = org.apache.commons.math3.util.FastMath.asin(3.4965075614664802d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-5.9999995f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.0d) + "'", double1 == (-5.0d));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.07813771351531074d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.476961205229636d) + "'", double1 == (-4.476961205229636d));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) ' ', (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.25d + "'", double2 == 0.25d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4377039151369548d + "'", double1 == 1.4377039151369548d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.0721086324294562E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006142729981775034d + "'", double1 == 0.006142729981775034d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double1 = org.apache.commons.math3.util.FastMath.signum(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        int int2 = org.apache.commons.math3.util.FastMath.max(4096, 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(97.00001f, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.33289488E12f + "'", float2 == 3.33289488E12f);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        float float2 = org.apache.commons.math3.util.FastMath.max((-5.999999f), 6400.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        float float1 = org.apache.commons.math3.util.FastMath.abs(52.000008f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.000008f + "'", float1 == 52.000008f);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078125E-7d + "'", double1 == 1.1920928955078125E-7d);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        double double2 = org.apache.commons.math3.util.FastMath.min((-6.436592044971218d), 7.737545114640002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.436592044971218d) + "'", double2 == (-6.436592044971218d));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        double double1 = org.apache.commons.math3.util.FastMath.tan(20.951580740511496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7019294127099711d) + "'", double1 == (-1.7019294127099711d));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 20L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5501637768927253E-17d + "'", double1 == 1.5501637768927253E-17d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.04669075745245177d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04665687272850968d) + "'", double1 == (-0.04665687272850968d));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 35.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.3978727715165242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3880595140739382d + "'", double1 == 0.3880595140739382d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8E-322d + "'", double1 == 2.8E-322d);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.4532640331862171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4245783453278988d + "'", double1 == 0.4245783453278988d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5707962635746238d, 1.8477481924511037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796263574624d + "'", double2 == 1.570796263574624d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (byte) 100, 1.9673559108511897E64d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int int1 = org.apache.commons.math3.util.FastMath.round((-511.5f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-511) + "'", int1 == (-511));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.36651292058166435d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35130926182721134d) + "'", double1 == (-0.35130926182721134d));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.011035410141815d + "'", double1 == 9.011035410141815d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5120.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.55417527999327d + "'", double1 == 71.55417527999327d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.3831970825634745d, 1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7310884693105406d + "'", double2 == 0.7310884693105406d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(2.770311529081762E34d, 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.864996893061638E35d + "'", double2 == 8.864996893061638E35d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(9.011035410141815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8885039814876436d + "'", double1 == 2.8885039814876436d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        float float1 = org.apache.commons.math3.util.FastMath.signum(4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.0688530993622138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        float float2 = org.apache.commons.math3.util.FastMath.min(10240.0f, (float) (-64));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-64.0f) + "'", float2 == (-64.0f));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double2 = org.apache.commons.math3.util.FastMath.pow(343.77467707849394d, (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.461594994075238E-6d + "'", double2 == 8.461594994075238E-6d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        long long2 = org.apache.commons.math3.util.FastMath.max((-1L), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.916079783099616d, 126.99999237060547d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.13771298137247d + "'", double2 == 127.13771298137247d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.8382668271306453E9d, 6.012089888557484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8382668271306453E9d + "'", double2 == 1.8382668271306453E9d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7853981633974483d, (-0.04665687272850968d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.04665687272850968d) + "'", double2 == (-0.04665687272850968d));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.440892098500626E-16d, 0.4495239865639748d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.440892098500626E-16d + "'", double2 == 4.440892098500626E-16d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        double double1 = org.apache.commons.math3.util.FastMath.sin(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9287117556395867d) + "'", double1 == (-0.9287117556395867d));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.785398133595125d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0593060930408005d) + "'", double1 == (-1.0593060930408005d));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.4495239865639748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7995660637267406d) + "'", double1 == (-0.7995660637267406d));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) (-23));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8438669798515654d) + "'", double1 == (-2.8438669798515654d));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9185375499501867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8225824358786724d + "'", double1 == 0.8225824358786724d);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.5703319211292674d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.808243886679093d + "'", double1 == 3.808243886679093d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.038341943233852725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.03835134389875404d) + "'", double1 == (-0.03835134389875404d));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(97.00317877887011d, 0.3679217745530282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12816970312934028d) + "'", double2 == (-0.12816970312934028d));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5729.578388440339d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.578388440339d + "'", double2 == 5729.578388440339d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9280538062512562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07466556700256388d) + "'", double1 == (-0.07466556700256388d));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.3841858E-7f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.842171E-14f + "'", float1 == 2.842171E-14f);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.000008f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.3012989023072956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3619730303123131d + "'", double1 == 0.3619730303123131d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 5.421011E-20f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        long long2 = org.apache.commons.math3.util.FastMath.min((-1L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(21.78899910456995d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-7));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.609435868686549E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-64L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 64L + "'", long1 == 64L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.008837747656336603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(10.000001f, (-511.5f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.000001f) + "'", float2 == (-10.000001f));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (-6L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.4917798526449118d) + "'", double1 == (-2.4917798526449118d));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-23));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(3.948148009134034E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-3));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 64L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 64.0f + "'", float1 == 64.0f);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.6991118430775187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(48.499992f, (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.249996f + "'", float2 == 24.249996f);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 20L, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double double2 = org.apache.commons.math3.util.FastMath.min(8.318010277546872d, (double) 32768.004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.318010277546872d + "'", double2 == 8.318010277546872d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-24.191690961245197d), 15.58087669728624d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-35.0f), (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00247388670647d + "'", double2 == 35.00247388670647d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.8493111942973237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3598938172877042d + "'", double1 == 1.3598938172877042d);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41777137910516676d + "'", double1 == 0.41777137910516676d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0000002f + "'", float1 == 2.0000002f);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5.839986434268865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 334.6065750972607d + "'", double1 == 334.6065750972607d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.008837747656336603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008837977756594232d) + "'", double1 == (-0.008837977756594232d));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8726936208978296d + "'", double1 == 0.8726936208978296d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double double1 = org.apache.commons.math3.util.FastMath.tan(5786.873730821316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.060135240003378346d + "'", double1 == 0.060135240003378346d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 5.421011E-20f, 343.77467707849394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.421010862427522E-20d + "'", double2 == 5.421010862427522E-20d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.536744E-7f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.536744E-7f + "'", float2 == 9.536744E-7f);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        double double1 = org.apache.commons.math3.util.FastMath.signum(918246.8633045758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(32768.004f, 0.059306170823242965d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32768.0f + "'", float2 == 32768.0f);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.1754034190044697d, (-0.7995660637267406d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1754034190044697d + "'", double2 == 0.1754034190044697d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.999999999999998d, 11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999981d + "'", double2 == 0.9999999999999981d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.30033084129497156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30988320573923506d + "'", double1 == 0.30988320573923506d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int int2 = org.apache.commons.math3.util.FastMath.max((-17), (-20));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17) + "'", int2 == (-17));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.4454769016358355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9169927026825043d + "'", double1 == 0.9169927026825043d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-0.03216605451972054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        float float2 = org.apache.commons.math3.util.FastMath.min(2.14748365E9f, 6.0000005f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0000005f + "'", float2 == 6.0000005f);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 0.00390625f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00390623013190634d + "'", double1 == 0.00390623013190634d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.3733969509475266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9073486E-6f, 0.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073485E-6f + "'", float2 == 1.9073485E-6f);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        long long1 = org.apache.commons.math3.util.FastMath.round(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.6441739259957566d, 0.9999999954041073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6441739259957566d + "'", double2 == 1.6441739259957566d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 52, 1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.999996f + "'", float2 == 51.999996f);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.0000005f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.830189170012751E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.470329472543003E-22d + "'", double1 == 8.470329472543003E-22d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int1 = org.apache.commons.math3.util.FastMath.round((-10.000001f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.09966865249116201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950437040259406d + "'", double1 == 0.09950437040259406d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        float float1 = org.apache.commons.math3.util.FastMath.signum(35.000004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.1920928955078154E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(39.726213847251884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.0d + "'", double1 == 40.0d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.6314566596416601d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8803476117963591d + "'", double1 == 1.8803476117963591d);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        double double1 = org.apache.commons.math3.util.FastMath.signum(18824.27742973676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6389612763136348d + "'", double1 == 0.6389612763136348d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        int int1 = org.apache.commons.math3.util.FastMath.abs(32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32768 + "'", int1 == 32768);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.296908309475615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.028944477141252d + "'", double1 == 27.028944477141252d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-35.350506208557206d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 4096L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4096.0f + "'", float1 == 4096.0f);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.9999830769532079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005817747764200268d + "'", double1 == 0.005817747764200268d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.60497014597542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08037189100331499d + "'", double1 == 0.08037189100331499d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536738616591883E-7d + "'", double1 == 9.536738616591883E-7d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        float float1 = org.apache.commons.math3.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-64.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.117010721276371d) + "'", double1 == (-1.117010721276371d));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        double double1 = org.apache.commons.math3.util.FastMath.sin(8.470329472543003E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.470329472543003E-22d + "'", double1 == 8.470329472543003E-22d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-5), (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.220446049250313E36d + "'", double2 == 2.220446049250313E36d);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-5.4210105393100954E-20d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        int int2 = org.apache.commons.math3.util.FastMath.max((-10), 4096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4096 + "'", int2 == 4096);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0536712127723509E-8d + "'", double1 == 1.0536712127723509E-8d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.192093037616354E-7d, (double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.192093037616354E-7d + "'", double2 == 1.192093037616354E-7d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-4503599627370496L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 1.4210855E-14f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4802620430283604E-16d + "'", double1 == 2.4802620430283604E-16d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        float float1 = org.apache.commons.math3.util.FastMath.abs(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.11146324526556185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10567738618806241d + "'", double1 == 0.10567738618806241d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-17));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-511));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 511 + "'", int1 == 511);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.272221872585407E-14d, 31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2722218725854072E-14d + "'", double2 == 1.2722218725854072E-14d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.847379800543134d) + "'", double1 == (-13.847379800543134d));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.04672471609974032d), 1.5271361867276063d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04672471609974032d + "'", double2 == 0.04672471609974032d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 24.249996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.0d + "'", double1 == 25.0d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 4.5474735E-13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508865675E-13d + "'", double1 == 4.547473508865675E-13d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5395564933646284d, 343.77467707849394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.004478358365843835d + "'", double2 == 0.004478358365843835d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-4.451746403021009d), (-0.4288314664442319d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6668288393884205d) + "'", double2 == (-1.6668288393884205d));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.2519653700568933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.6102871923992833E-232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6102871923992833E-232d + "'", double1 == 1.6102871923992833E-232d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2566139548000526d + "'", double1 == 3.2566139548000526d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double1 = org.apache.commons.math3.util.FastMath.acos(11013.237121318984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0232274785475504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21511909301433307d + "'", double1 == 0.21511909301433307d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.055192158084907385d, 0.9515334276328968d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.055192158084907385d + "'", double2 == 0.055192158084907385d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        double double1 = org.apache.commons.math3.util.FastMath.log10(4.547473508865675E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-12.34222982222313d) + "'", double1 == (-12.34222982222313d));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.9867717342662448d, 1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8369630128952054d + "'", double2 == 0.8369630128952054d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) 'a', (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) -1, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-20));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.8813616205677708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.8813735870195429d), (-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.726510528000143d) + "'", double2 == (-2.726510528000143d));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-511.5f), 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1023.0f) + "'", float2 == (-1023.0f));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1L), 2.2319118908162947d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-57.29577951308232d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-6L), 2.718281954078841d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281954078841d + "'", double2 == 2.718281954078841d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.1129900353232502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04649127608358614d + "'", double1 == 0.04649127608358614d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-3.0f), (-7));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.0234375f) + "'", float2 == (-0.0234375f));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3969567625600747d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.30281574199178d + "'", double2 == 28.30281574199178d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-6.354130026164064d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        int int1 = org.apache.commons.math3.util.FastMath.round((-0.99999994f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.107184941633452E23d, 13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5163575235272857E305d + "'", double2 == 2.5163575235272857E305d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.6108652381980153d, (-0.9899924966004454d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double double2 = org.apache.commons.math3.util.FastMath.max(83.9889793008241d, 0.49174338951939384d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.9889793008241d + "'", double2 == 83.9889793008241d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.3802897750888419d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-64.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 64.0f + "'", float1 == 64.0f);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2928018131467037d + "'", double1 == 0.2928018131467037d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        int int2 = org.apache.commons.math3.util.FastMath.max(32768, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32768 + "'", int2 == 32768);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(40.0f, 1.4E-45f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.0f + "'", float2 == 40.0f);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.570796326793987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031175107285d + "'", double1 == 1.2334031175107285d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.055192158084907385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0015234738287098d + "'", double1 == 1.0015234738287098d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(20.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.915499384730081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-5));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(48.499996185302734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9019725925100506d + "'", double1 == 3.9019725925100506d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 5.0000005f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20324596385817d + "'", double1 == 74.20324596385817d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103323d + "'", double1 == 11013.232920103323d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) ' ', (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.9888410855273345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.7111977130787057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.74862735876591d + "'", double1 == 40.74862735876591d);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.251799813685248E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.251799813685248E15d + "'", double1 == 2.251799813685248E15d);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.005817747764200268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000169231422558d + "'", double1 == 1.0000169231422558d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.12816970312934028d), (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.03204242578233507d) + "'", double2 == (-0.03204242578233507d));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-0.25000003f), (double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2500000298023224d + "'", double2 == 0.2500000298023224d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.296908309475615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9879627505659927d) + "'", double1 == (-0.9879627505659927d));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 2.14748365E9f, 3.4657359027997265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483648E9d + "'", double2 == 2.147483648E9d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        int int2 = org.apache.commons.math3.util.FastMath.max(35, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-3.6268604078470186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9985859267674833d) + "'", double1 == (-0.9985859267674833d));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(8.971567242793748d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.844762605891226E-5d + "'", double2 == 6.844762605891226E-5d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.19611987703015257d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.00628569302695887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0970603909008098E-4d) + "'", double1 == (-1.0970603909008098E-4d));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.586013452313441E15d, 1.5639495664692888d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.012777554145719352d + "'", double2 == 0.012777554145719352d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.49369669957632584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.28673724526161d + "'", double1 == 28.28673724526161d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 3.3869694069128182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3869694069128182d + "'", double2 == 3.3869694069128182d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.071208929787076d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.142417859574152d + "'", double2 == 10.142417859574152d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.03274454486619997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.010200246779241787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010200600563003249d + "'", double1 == 0.010200600563003249d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.5734395719374923d, (double) (-1023.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.3869694069128182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.5761829363623d + "'", double1 == 29.5761829363623d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.697450486273865d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.960969282839415d + "'", double1 == 39.960969282839415d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.03274454486619997d, 1.5648302606319877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03274454486619997d + "'", double2 == 0.03274454486619997d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        float float2 = org.apache.commons.math3.util.FastMath.min((-0.25000003f), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.25000003f) + "'", float2 == (-0.25000003f));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-10), (-3.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-10.0f) + "'", float2 == (-10.0f));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 10L, 35840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35840.0f + "'", float2 == 35840.0f);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-2.003564344806379d), 2.2319118908162947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2283475460099158d + "'", double2 == 0.2283475460099158d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int2 = org.apache.commons.math3.util.FastMath.max(2147483647, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(4.0000005f, 0.9666600679364251d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.1961199099891899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19486509830693569d + "'", double1 == 0.19486509830693569d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590398d + "'", double1 == 1.7182818284590398d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        double double1 = org.apache.commons.math3.util.FastMath.sin(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2879033166650653d) + "'", double1 == (-0.2879033166650653d));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.302585131141017d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.0970603909008098E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5.2678643598200185d, (double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6400.002167999235d + "'", double2 == 6400.002167999235d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.107184941633452E23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.107184941633452E23d + "'", double1 == 3.107184941633452E23d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.308232836016487d + "'", double1 == 27.308232836016487d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5729.577951308234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.6350011745d + "'", double1 == 328280.6350011745d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(3580.4237429416758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.87638363640206d + "'", double1 == 8.87638363640206d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.01737079345125424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01737254084242038d) + "'", double1 == (-0.01737254084242038d));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-1.0f), (float) (-10));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.4495239865639748d, 2.5803725126501968E17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4495239865639748d + "'", double2 == 0.4495239865639748d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.0000001f), 0.5990250723553024d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 128.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.0d + "'", double1 == 128.0d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(24.249996f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.249994f + "'", float2 == 24.249994f);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.6090128311061331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-5.999999f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-5.4210105393100954E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.4210105393100954E-20d) + "'", double1 == (-5.4210105393100954E-20d));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.9999999999999977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999992d + "'", double1 == 0.9999999999999992d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1920928244535417E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.192092824453536E-7d + "'", double1 == 1.192092824453536E-7d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.6483272471874993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6098212688914123d + "'", double1 == 0.6098212688914123d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        double double1 = org.apache.commons.math3.util.FastMath.exp(57.29577951308221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.642595581082662E24d + "'", double1 == 7.642595581082662E24d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.9879627505659927d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-4.5035996E15f), (-0.9417844128659681d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.503599627370496E15d + "'", double2 == 4.503599627370496E15d);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.2981479726743438d), 4.503599627370496E15d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.00390625f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.0552874272350832d, 48.499996185302734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0552874272350832d + "'", double2 == 1.0552874272350832d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.005405263502771015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 9223372036854775807L, (-5.314369626254345d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.314369626254345d) + "'", double2 == (-5.314369626254345d));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.9666600679364251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.504749933725006d + "'", double1 == 1.504749933725006d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-12.652395426951063d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999795215d) + "'", double1 == (-0.9999999999795215d));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-12.34222982222313d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.469446951953614E-18d, 0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.469446951953614E-18d + "'", double2 == 3.469446951953614E-18d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 0, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-1.5707963267948966d), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.8813616205677708d, 0.38991804378757267d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.154277032758874d + "'", double2 == 1.154277032758874d);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1024.0f, 234.24476918014662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1023.9999999999999d + "'", double2 == 1023.9999999999999d);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.989740156313126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.272221872585407E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-47) + "'", int1 == (-47));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (-127));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 127L + "'", long1 == 127L);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.4495239865639748d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.34724712939362723d) + "'", double1 == (-0.34724712939362723d));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        double double1 = org.apache.commons.math3.util.FastMath.floor(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        float float1 = org.apache.commons.math3.util.FastMath.abs(10.000002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000002f + "'", float1 == 10.000002f);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.2415914299460307E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }
}

