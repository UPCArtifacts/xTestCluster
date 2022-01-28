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
        double double1 = org.apache.commons.math.util.FastMath.signum(14.899277193215994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-53L), (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (-53L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6884941597894443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8297554819279257d + "'", double1 == 0.8297554819279257d);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1834.0d + "'", double1 == 1834.0d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1414869946644686d + "'", double1 == 1.1414869946644686d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5574077246549023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.219022125506721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.58351893845611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06254420428363117d + "'", double1 == 0.06254420428363117d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.860761315262648E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1895288505075267E-47d + "'", double1 == 2.1895288505075267E-47d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4748409916077942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8893654310317503d + "'", double1 == 0.8893654310317503d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4515628324511178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4374744323806797d + "'", double1 == 0.4374744323806797d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8436963527515925E124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.82547115569156d + "'", double1 == 286.82547115569156d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9659700754028168d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9659700754028168d) + "'", double2 == (-0.9659700754028168d));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9171523356672744d) + "'", double1 == (-0.9171523356672744d));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.832208390245367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9122545643872476d + "'", double1 == 0.9122545643872476d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9508218731216449d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.3490760817142498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.2206474121905d + "'", double1 == 14.2206474121905d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        long long2 = org.apache.commons.math.util.FastMath.max(39481480091340L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4154931988910127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.387169203407706d + "'", double1 == 6.387169203407706d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        double double1 = org.apache.commons.math.util.FastMath.signum(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7393694191795738d + "'", double1 == 0.7393694191795738d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.15467958605816817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15529712916720415d + "'", double1 == 0.15529712916720415d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1834.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.240517442917666d + "'", double1 == 12.240517442917666d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3980038919397375d + "'", double1 == 1.3980038919397375d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.557407724654902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1924023244417261d + "'", double1 == 0.1924023244417261d);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        double double1 = org.apache.commons.math.util.FastMath.expm1(34.982780458176066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5589368199830565E15d + "'", double1 == 1.5589368199830565E15d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030555897991319556d) + "'", double1 == (-0.030555897991319556d));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999609473623688d + "'", double1 == 0.9999609473623688d);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3887317335324652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1784446247204259d + "'", double1 == 1.1784446247204259d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7871071944553747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344162252208615d + "'", double1 == 1.344162252208615d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948968d + "'", double1 == 1.5707963267948968d);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        double double1 = org.apache.commons.math.util.FastMath.cosh(43.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3639197341146732E18d + "'", double1 == 2.3639197341146732E18d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1310377402202207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1938614780827772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7856632231610079d + "'", double1 == 0.7856632231610079d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.04191482247339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.935259408454094d + "'", double1 == 55.935259408454094d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4509000100090763d + "'", double1 == 1.4509000100090763d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        double double2 = org.apache.commons.math.util.FastMath.pow(36.0d, (-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.001885141133518411d + "'", double2 == 0.001885141133518411d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.04191482247339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9993832155237184d + "'", double1 == 0.9993832155237184d);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        double double1 = org.apache.commons.math.util.FastMath.log(2.3686469200204927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876841d + "'", double1 == 0.8623188722876841d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        int int1 = org.apache.commons.math.util.FastMath.abs((-53));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9997103019367587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.542740246052261d + "'", double1 == 1.542740246052261d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-77.26503394947866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        long long1 = org.apache.commons.math.util.FastMath.round(28.45884779991685d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.3485292390836008d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3485292390836008d + "'", double1 == 1.3485292390836008d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.017065175308356183d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8431391046438417d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0030948458264688d + "'", double1 == 1.0030948458264688d);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816339318384565d + "'", double1 == 0.9816339318384565d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3262569125794328d) + "'", double1 == (-1.3262569125794328d));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        double double1 = org.apache.commons.math.util.FastMath.signum(100.69314718055996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9209970573119075d + "'", double1 == 2.9209970573119075d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double double1 = org.apache.commons.math.util.FastMath.sin(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6795226183513794d + "'", double1 == 0.6795226183513794d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.301071078740414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double double1 = org.apache.commons.math.util.FastMath.atanh(12.240517442917666d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 813.951274474838d + "'", double1 == 813.951274474838d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) -1, (-0.8813735870195429d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1920928955078125E-7d + "'", double1 == 1.1920928955078125E-7d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6795226183513794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7330383821741316d + "'", double1 == 0.7330383821741316d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        double double2 = org.apache.commons.math.util.FastMath.atan2(35.00000000000001d, (-0.008837747656337245d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5710488338654254d + "'", double2 == 1.5710488338654254d);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.05042853879473771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36945265746442124d) + "'", double1 == (-0.36945265746442124d));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.41777137910516676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9139954154840256d + "'", double1 == 0.9139954154840256d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), (-53.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-53.0f) + "'", float2 == (-53.0f));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014929865531701196d) + "'", double1 == (-0.014929865531701196d));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8436963527515925E124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.13232397513167d + "'", double1 == 286.13232397513167d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.017507307769456783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999846751001702d + "'", double1 == 0.999846751001702d);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        double double1 = org.apache.commons.math.util.FastMath.cos(104.94395111059708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2949496123890058d) + "'", double1 == (-0.2949496123890058d));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7581226324091722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.0871877068532832E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0000000000000007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        double double1 = org.apache.commons.math.util.FastMath.cos(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8003700919354247d) + "'", double1 == (-0.8003700919354247d));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6178334732240378d, 5.388267471840758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.359533360579945d + "'", double2 == 13.359533360579945d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6399307720594023d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9389941379013969d + "'", double1 == 0.9389941379013969d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 53, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        double double1 = org.apache.commons.math.util.FastMath.rint(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1477896.0d + "'", double1 == 1477896.0d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        double double2 = org.apache.commons.math.util.FastMath.min(4.15912713462618d, 8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.88178419700125E-16d + "'", double2 == 8.88178419700125E-16d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        long long1 = org.apache.commons.math.util.FastMath.abs((-53L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.7615941559557649d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6323562492563314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8066370946516901d + "'", double1 == 0.8066370946516901d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9999999835160613d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        int int1 = org.apache.commons.math.util.FastMath.round(3.9481478E13f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7389538577032342d) + "'", double1 == (-0.7389538577032342d));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07609566151369249d + "'", double1 == 0.07609566151369249d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8436963527515925E124d, 0.0741466672417709d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 53L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8849970445005177d, (-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0145592787614723d + "'", double2 == 1.0145592787614723d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.014929865531701196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014930974924027406d) + "'", double1 == (-0.014930974924027406d));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.30102999566398114d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3796077390275217d + "'", double1 == 1.3796077390275217d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134E13d + "'", double1 == 3.948148009134E13d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0149280275816275d + "'", double1 == 1.0149280275816275d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.4971409420435924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.115016634173588d + "'", double1 == 6.115016634173588d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) 232L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 232.0f + "'", float2 == 232.0f);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        double double1 = org.apache.commons.math.util.FastMath.log(1.715662658536639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5397993958058634d + "'", double1 == 0.5397993958058634d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046745947545269d + "'", double1 == 0.9046745947545269d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 39481480091340L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39481480091340L + "'", long2 == 39481480091340L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9019228933850969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.810295527926742d + "'", double1 == 0.810295527926742d);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4509000100090763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.266953088020192d + "'", double1 == 3.266953088020192d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.2949496123890058d), 1.0000000000000009d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2949496123890058d) + "'", double2 == (-0.2949496123890058d));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        double double2 = org.apache.commons.math.util.FastMath.atan2(104.94395132690269d, (-0.030555897991319556d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.57108749076139d + "'", double2 == 1.57108749076139d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        double double1 = org.apache.commons.math.util.FastMath.log((-3.0461741978670873E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08619966571131166d) + "'", double1 == (-0.08619966571131166d));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        double double1 = org.apache.commons.math.util.FastMath.tan(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904822556d) + "'", double1 == (-0.41032129904822556d));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.1443601628891088d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.2638973976934574E18d, 18.72514057803899d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.2638973976934564E18d + "'", double2 == 7.2638973976934564E18d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.508377516798939d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.17062332315326462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.041914822473389d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0741994078890014d + "'", double1 == 2.0741994078890014d);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 9.223372E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3574158419544757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        double double1 = org.apache.commons.math.util.FastMath.abs(36.04365338911715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.04365338911715d + "'", double1 == 36.04365338911715d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        double double1 = org.apache.commons.math.util.FastMath.acosh(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279167d + "'", double1 == 4.158638853279167d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.49714987269413385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49714987269413385d + "'", double1 == 0.49714987269413385d);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        double double1 = org.apache.commons.math.util.FastMath.abs(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        int int1 = org.apache.commons.math.util.FastMath.abs(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.005195033303871199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7158569288579338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8945584950807156d) + "'", double1 == (-0.8945584950807156d));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.00961449578338d + "'", double1 == 103.00961449578338d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.1215871282840145E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1215871282840145E-5d + "'", double1 == 3.1215871282840145E-5d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.29750002275985665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5265129967102895d) + "'", double1 == (-0.5265129967102895d));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.8554182836643193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.693889518756616d) + "'", double1 == (-0.693889518756616d));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6177859350239399d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0171533999278615d + "'", double1 == 1.0171533999278615d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6105647004975028d + "'", double1 == 0.6105647004975028d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        double double1 = org.apache.commons.math.util.FastMath.sinh(12.240517442917666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103504.4889592901d + "'", double1 == 103504.4889592901d);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.17542037193601015d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5597919847479074d + "'", double1 == 0.5597919847479074d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4436354751788103d, 1.0118543769141768d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4436354751788103d + "'", double2 == 1.4436354751788103d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 53L, Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) 39481480091340L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        double double2 = org.apache.commons.math.util.FastMath.pow(12.240517442917666d, 0.5397993958058634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.865393058796651d + "'", double2 == 3.865393058796651d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9903301413773637d + "'", double1 == 0.9903301413773637d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8813735870195429d, 57.29577951308237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.881373587019543d + "'", double2 == 0.881373587019543d);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9046745947545269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9046745947545269d + "'", double1 == 0.9046745947545269d);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948948d + "'", double1 == 1.5707963267948948d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.008798809557313648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008798582499187173d) + "'", double1 == (-0.008798582499187173d));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.106387248181345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9993803537191753d) + "'", double1 == (-0.9993803537191753d));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8436963527515925E124d, 813.951274474838d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.7330957838811774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0054349534891949d + "'", double1 == 1.0054349534891949d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.29327768157142287d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-14.148409796207115d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.41862874504907d) + "'", double1 == (-2.41862874504907d));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9838566398996358d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6114464160932404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5740524125174076d + "'", double1 == 0.5740524125174076d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int int1 = org.apache.commons.math.util.FastMath.round((-53.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53) + "'", int1 == (-53));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1469544105044815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9226350743220142d + "'", double1 == 0.9226350743220142d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.09933992780358329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.7871071944553747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.550646685718122d) + "'", double1 == (-4.550646685718122d));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(8.88178419700125E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.550163776892725E-17d + "'", double1 == 1.550163776892725E-17d);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5716776679087391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5165902998982612d + "'", double1 == 0.5165902998982612d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.25469727314226837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004445306012183907d + "'", double1 == 0.004445306012183907d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3383347192042695E42d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3383347192042695E42d + "'", double2 == 1.3383347192042695E42d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1477895.5237245467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(55.935259408454094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.478987859894819d + "'", double1 == 7.478987859894819d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.2134887868481213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.232006459765387d + "'", double1 == 12.232006459765387d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2436740316514885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5900049437549362d + "'", double1 == 1.5900049437549362d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.883259400089535E100d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.883259400089535E100d + "'", double1 == 1.883259400089535E100d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double double1 = org.apache.commons.math.util.FastMath.exp(71.81168591902457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.539639096762709E31d + "'", double1 == 1.539639096762709E31d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7469280195077934d) + "'", double1 == (-0.7469280195077934d));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9556244815546298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        double double1 = org.apache.commons.math.util.FastMath.log(0.005195033303871199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.260052243696693d) + "'", double1 == (-5.260052243696693d));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 53L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.009430054193516505d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21127011215504418d + "'", double1 == 0.21127011215504418d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        int int2 = org.apache.commons.math.util.FastMath.max((-53), (-53));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53) + "'", int2 == (-53));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double1 = org.apache.commons.math.util.FastMath.tan(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6111038742580877d) + "'", double1 == (-1.6111038742580877d));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2436740316514885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4683328494106918d + "'", double1 == 3.4683328494106918d);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        double double1 = org.apache.commons.math.util.FastMath.atan(88.62082012530739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.559512775607752d + "'", double1 == 1.559512775607752d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.8436963527515925E124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 286.13232397513167d + "'", double1 == 286.13232397513167d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        double double1 = org.apache.commons.math.util.FastMath.tanh(14.206129690390002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999990843d + "'", double1 == 0.9999999999990843d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        double double1 = org.apache.commons.math.util.FastMath.tan((-4.550646685718122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.128666380978778d) + "'", double1 == (-6.128666380978778d));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        long long2 = org.apache.commons.math.util.FastMath.min((-53L), 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53L) + "'", long2 == (-53L));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1207822376352453d) + "'", double1 == (-0.1207822376352453d));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0507428532869755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.980984492908097d) + "'", double1 == (-2.980984492908097d));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        double double1 = org.apache.commons.math.util.FastMath.log(0.832208390245367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18367240047815075d) + "'", double1 == (-0.18367240047815075d));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9139954154840256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.723044407228643d + "'", double1 == 0.723044407228643d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.941208504361988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9596297225077461d + "'", double1 == 0.9596297225077461d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5740524125174076d, (-2.1317761108019555d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5740524125174075d + "'", double2 == 0.5740524125174075d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) 28L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078964d + "'", double1 == 0.8414709848078964d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.4683328494106918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06053382777729324d + "'", double1 == 0.06053382777729324d);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3774620981682702d + "'", double1 == 0.3774620981682702d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 35L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 9223372036854775807L, 72.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 72.0d + "'", double2 == 72.0d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        double double1 = org.apache.commons.math.util.FastMath.atanh(12.232006459765387d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1924023244417261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int int1 = org.apache.commons.math.util.FastMath.abs(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9903301413773637d, 7.138127355756959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9903301413773639d + "'", double2 == 0.9903301413773639d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9900590857598653d + "'", double1 == 0.9900590857598653d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        float float2 = org.apache.commons.math.util.FastMath.min(52.0f, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.43087067877290786d), (-1.541950429394781d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.541950429394781d) + "'", double2 == (-1.541950429394781d));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.945982489867764E-83d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.945982489867764E-83d) + "'", double1 == (-1.945982489867764E-83d));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.219022125506721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2190221255067213d + "'", double1 == 1.2190221255067213d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.569397566060481d + "'", double1 == 7.569397566060481d);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int int1 = org.apache.commons.math.util.FastMath.abs(57);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.890818211544746E11d + "'", double1 == 6.890818211544746E11d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double double1 = org.apache.commons.math.util.FastMath.log(0.32681535598557454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1183599281602883d) + "'", double1 == (-1.1183599281602883d));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.017453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.008798809557313648d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.008798809557313646d) + "'", double1 == (-0.008798809557313646d));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9754001961551926d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1559057424196283d) + "'", double1 == (-0.1559057424196283d));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double double1 = org.apache.commons.math.util.FastMath.exp(88.62082012530739d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.072791990708367E38d + "'", double1 == 3.072791990708367E38d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2519457609704083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0777759905763586d + "'", double1 == 1.0777759905763586d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.1048285727011695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1048285727011695d + "'", double1 == 2.1048285727011695d);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9171523356672745d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        long long1 = org.apache.commons.math.util.FastMath.round(32.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.916079783099616d + "'", double1 == 5.916079783099616d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9945746134185464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7035740325184427d + "'", double1 == 2.7035740325184427d);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5929264334035065d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        long long2 = org.apache.commons.math.util.FastMath.max(232L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 232L + "'", long2 == 232L);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.3284512750821519d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5127742681331149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47381472041445105d + "'", double1 == 0.47381472041445105d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0137651267062167d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8414709848078964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078964d + "'", double1 == 0.8414709848078964d);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.298292365610485d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47381472041445094d + "'", double1 == 0.47381472041445094d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6470434810831891d + "'", double1 == 0.6470434810831891d);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5804096620472413d + "'", double1 == 0.5804096620472413d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.0286185349173835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.441995639883983d) + "'", double1 == (-0.441995639883983d));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.216499084404722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3525692555035917d + "'", double1 == 1.3525692555035917d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        double double1 = org.apache.commons.math.util.FastMath.sinh(56.5058975143737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7344807723571088E24d + "'", double1 == 1.7344807723571088E24d);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8066370946516901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3433588908440404d + "'", double1 == 1.3433588908440404d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        double double1 = org.apache.commons.math.util.FastMath.ulp(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.564317279302415E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(56.33799391295282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9832834877495503d + "'", double1 == 0.9832834877495503d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.938893903907228E-18d, 1.2488679726422227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7242338042509196E-22d + "'", double2 == 3.7242338042509196E-22d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.0d), 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.3019079198404987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3065152709994659d + "'", double1 == 0.3065152709994659d);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        double double2 = org.apache.commons.math.util.FastMath.max(1.248867972642223d, 5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.729577951308232d + "'", double2 == 5.729577951308232d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3106472496723418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.09455583665425d + "'", double1 == 75.09455583665425d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.1317761108019555d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.131776110801955d) + "'", double2 == (-2.131776110801955d));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        long long1 = org.apache.commons.math.util.FastMath.round(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5162631492122485d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4032536613179892d) + "'", double1 == (-0.4032536613179892d));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        long long2 = org.apache.commons.math.util.FastMath.min(53L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4677992676220695d + "'", double1 == 1.4677992676220695d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0954243259038507d + "'", double1 == 1.0954243259038507d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7763568394002489E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002489E-15d + "'", double1 == 1.7763568394002489E-15d);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        long long2 = org.apache.commons.math.util.FastMath.min(232L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7330383821741316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6691306779508364d + "'", double1 == 0.6691306779508364d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0426842879669972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.999846751001702d, (-4.632512904931238d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.929020930583958d + "'", double2 == 2.929020930583958d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.496773992873097d + "'", double1 == 2.496773992873097d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 232L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 232.0f + "'", float2 == 232.0f);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.32179921168174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double double1 = org.apache.commons.math.util.FastMath.asin(75.09455583665425d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.14192893333928602d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.141928933339286d) + "'", double2 == (-0.141928933339286d));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4509000100090763d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        double double2 = org.apache.commons.math.util.FastMath.atan2(99.99999999999999d, 1833.4649444186343d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05448755243389763d + "'", double2 == 0.05448755243389763d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 32, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        double double2 = org.apache.commons.math.util.FastMath.max(0.09966865249116202d, (-53.00704927389939d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09966865249116202d + "'", double2 == 0.09966865249116202d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8657694832396586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7135781201111424d + "'", double1 == 0.7135781201111424d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double double1 = org.apache.commons.math.util.FastMath.asinh(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.363655626077857d + "'", double1 == 2.363655626077857d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.1490617565057812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.837411977130465d + "'", double1 == 0.837411977130465d);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5710488338654254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.01446758943851d + "'", double1 == 90.01446758943851d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        double double1 = org.apache.commons.math.util.FastMath.ulp(192.2131105221355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-3L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.115016634173588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.115016634173588d + "'", double1 == 6.115016634173588d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3235780930645504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3235780930645507d + "'", double1 == 1.3235780930645507d);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        double double2 = org.apache.commons.math.util.FastMath.max(0.15467958605816817d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15467958605816817d + "'", double2 == 0.15467958605816817d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0078125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000305177333457d + "'", double1 == 1.0000305177333457d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.079985986933498E-5d + "'", double1 == 9.079985986933498E-5d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.11831214619987152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11886886458581854d) + "'", double1 == (-0.11886886458581854d));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-3.0461741978670873E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0461742449770714E-4d) + "'", double1 == (-3.0461742449770714E-4d));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 97, (-1.3262569125794328d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.3262569125794328d) + "'", double2 == (-1.3262569125794328d));
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5740225962860341d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24107101134909706d) + "'", double1 == (-0.24107101134909706d));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.157240911549055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4097917119315355d + "'", double1 == 1.4097917119315355d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.7507239941348802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-100.30909595621492d) + "'", double1 == (-100.30909595621492d));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7399788154926485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.697222728536797d + "'", double1 == 5.697222728536797d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7330957838811774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9394207128713856d + "'", double1 == 0.9394207128713856d);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3235780930645507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7568396789787606d + "'", double1 == 2.7568396789787606d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.51718181260188d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49652666007064317d) + "'", double1 == (-0.49652666007064317d));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2704418874297039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.903953780547707d + "'", double1 == 0.903953780547707d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5597919847479074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8473655875129774d + "'", double1 == 0.8473655875129774d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9171473774587547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7245451197632213d + "'", double1 == 0.7245451197632213d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(215.5579348013961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 215.55793480139613d + "'", double1 == 215.55793480139613d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9945746134185464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9945746134185464d + "'", double1 == 0.9945746134185464d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int int1 = org.apache.commons.math.util.FastMath.round(53.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4576692332118569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007987835004624685d + "'", double1 == 0.007987835004624685d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011032585021104841d) + "'", double1 == (-0.011032585021104841d));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        double double1 = org.apache.commons.math.util.FastMath.tan(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7490362681090366d + "'", double1 == 0.7490362681090366d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9251475365964138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016146870580322156d) + "'", double1 == (-0.016146870580322156d));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(11013.232920103323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.2171757448326d + "'", double1 == 192.2171757448326d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.005440157440537665d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005440211108893698d) + "'", double1 == (-0.005440211108893698d));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2461900271072904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7158569288579338d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.797850593225596d) + "'", double1 == (-0.797850593225596d));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.709975946676697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02984471039941535d + "'", double1 == 0.02984471039941535d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.014930974924027406d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998885350647092d + "'", double1 == 0.9998885350647092d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2190221255067213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.84482292460207d + "'", double1 == 69.84482292460207d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.7568396789787606d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(199.00499987500626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 199.0049998750063d + "'", double1 == 199.0049998750063d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.3788272112277034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.47381472041445094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3878540873687678d + "'", double1 == 0.3878540873687678d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813735870195429d + "'", double1 == 0.8813735870195429d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        double double1 = org.apache.commons.math.util.FastMath.log(0.29327768157142287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2266354000930777d) + "'", double1 == (-1.2266354000930777d));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9998885350647092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853424278235795d + "'", double1 == 0.7853424278235795d);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.29750002275985665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2975000227598567d + "'", double1 == 0.2975000227598567d);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double double2 = org.apache.commons.math.util.FastMath.min(2.6881171418161737E43d, 0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7615941559557649d + "'", double2 == 0.7615941559557649d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.008750221815056362d, (-0.11158130719039049d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00875022181505636d + "'", double2 == 0.00875022181505636d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4288764780867376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6548866146797762d + "'", double1 == 0.6548866146797762d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        double double1 = org.apache.commons.math.util.FastMath.sinh(116618.90399762256d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        long long1 = org.apache.commons.math.util.FastMath.round(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3019079198404987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3524366883898337d + "'", double1 == 0.3524366883898337d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9980845732903538d, 0.3964729204944982d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9980845732903537d + "'", double2 == 0.9980845732903537d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0030948458264688d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7311284168939934d + "'", double1 == 0.7311284168939934d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.211102550927978d + "'", double1 == 7.211102550927978d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590867d + "'", double1 == 0.6483608274590867d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.40767170372406053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4190581615792427d + "'", double1 == 0.4190581615792427d);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.397318034091222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        double double2 = org.apache.commons.math.util.FastMath.pow(10.000000000000002d, 7.138127355756959d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3744449684274126E7d + "'", double2 == 1.3744449684274126E7d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.359533360579945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23316784367214288d + "'", double1 == 0.23316784367214288d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9993832155237184d, 0.008750221815056362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999946013485154d + "'", double2 == 0.9999946013485154d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        long long1 = org.apache.commons.math.util.FastMath.abs(28L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 28L + "'", long1 == 28L);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8322083902453669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9316507487548492d + "'", double1 == 0.9316507487548492d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.008798809557313646d), 0.9950915100179343d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5700548602583582d, (-0.008798809557313648d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570054860258358d + "'", double2 == 1.570054860258358d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 232.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.47381472041445094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4576692332118569d + "'", double1 == 0.4576692332118569d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.473814720414451d + "'", double1 == 0.473814720414451d);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8003700919354247d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0996411683627738d) + "'", double1 == (-1.0996411683627738d));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double double1 = org.apache.commons.math.util.FastMath.cos(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9712667366571679d) + "'", double1 == (-0.9712667366571679d));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0253512046806867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5733724749885676d + "'", double1 == 1.5733724749885676d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double double1 = org.apache.commons.math.util.FastMath.log((-77.26503394947866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05709087716385303d + "'", double1 == 0.05709087716385303d);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double double1 = org.apache.commons.math.util.FastMath.expm1(22.24855859029184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.596489008890833E9d + "'", double1 == 4.596489008890833E9d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        long long1 = org.apache.commons.math.util.FastMath.abs(53L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.559512775607752d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1938614780827772d, 0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1938614780827772d + "'", double2 == 1.1938614780827772d);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 4.15912713462618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.810295527926742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.901922893385097d + "'", double1 == 0.901922893385097d);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.5049299044217186d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.697222728536797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2488679726422227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0768920629340257d + "'", double1 == 1.0768920629340257d);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9867717342662448d, (-7.369139609590174E-249d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.43930669835763825d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-25.170419727719406d) + "'", double1 == (-25.170419727719406d));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.633123935319537E16d) + "'", double1 == (-1.633123935319537E16d));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9659700754028168d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8862269254527579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7746914034386123d + "'", double1 == 0.7746914034386123d);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double double1 = org.apache.commons.math.util.FastMath.floor(14.899276870949834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.227615833318806d + "'", double1 == 2.227615833318806d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        double double2 = org.apache.commons.math.util.FastMath.max(3.7621956910836314d, 3.946997808922293d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.946997808922293d + "'", double2 == 3.946997808922293d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double double1 = org.apache.commons.math.util.FastMath.signum(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9117339147869651d) + "'", double1 == (-0.9117339147869651d));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.04191482247339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1048285727011695d + "'", double1 == 2.1048285727011695d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 0L, 13.359533360579945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0137651267062167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7922335744099077d + "'", double1 == 0.7922335744099077d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5574077246549045d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.02984471039941535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029840281693512497d + "'", double1 == 0.029840281693512497d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.7621956910836314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.575441381684169d + "'", double1 == 0.575441381684169d);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5504145203048696d), (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.397420143738124E-10d) + "'", double2 == (-8.397420143738124E-10d));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        long long1 = org.apache.commons.math.util.FastMath.round(0.22099213933267595d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(192.2131105221355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.21311052213554d + "'", double1 == 192.21311052213554d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.21127011215504418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45964128639085955d + "'", double1 == 0.45964128639085955d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        float float2 = org.apache.commons.math.util.FastMath.max(1.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6105647004975028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.23316784367214288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2353340528191564d + "'", double1 == 0.2353340528191564d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943295d + "'", double1 == 0.017453292519943295d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(57.29577951308237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951308238d + "'", double1 == 57.29577951308238d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1477895.5237242084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.90634361049858d + "'", double1 == 113.90634361049858d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        int int1 = org.apache.commons.math.util.FastMath.round(9.223372E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double double1 = org.apache.commons.math.util.FastMath.log(5.729577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7456418720467646d + "'", double1 == 1.7456418720467646d);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7212254887267799d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 41.32317658130462d + "'", double1 == 41.32317658130462d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6283488663257064d + "'", double1 == 0.6283488663257064d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3227.9292774459186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.778873676342487d + "'", double1 == 14.778873676342487d);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02984471039941535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.540947184137944d + "'", double1 == 1.540947184137944d);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3877787807814457E-17d, 1.0145592787614723d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.387778780781446E-17d + "'", double2 == 1.387778780781446E-17d);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.6035750265302235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.6035750265302235d + "'", double1 == 7.6035750265302235d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        double double1 = org.apache.commons.math.util.FastMath.cosh(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 601302.1420828041d + "'", double1 == 601302.1420828041d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6548866146797762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5037324957145496d + "'", double1 == 0.5037324957145496d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707055415023634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.196094775945863d + "'", double1 == 0.196094775945863d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013388202148675738d + "'", double1 == 0.013388202148675738d);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        double double1 = org.apache.commons.math.util.FastMath.rint(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.1554436208840472E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4667411450004126E-10d + "'", double1 == 1.4667411450004126E-10d);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        long long1 = org.apache.commons.math.util.FastMath.round(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.6699175736806615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02914555989764255d + "'", double1 == 0.02914555989764255d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8713868162390155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9551472471031407d + "'", double1 == 0.9551472471031407d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        double double1 = org.apache.commons.math.util.FastMath.ulp(36.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 3.9481478E13f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9481478479872E13d + "'", double1 == 3.9481478479872E13d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6384917413123372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19484471582527388d) + "'", double1 == (-0.19484471582527388d));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.007987835004624685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4576692332118568d + "'", double1 == 0.4576692332118568d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.011032585021104841d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011032137421751803d) + "'", double1 == (-0.011032137421751803d));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 232L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.05709087716385303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5013507798060323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46472764886703793d + "'", double1 == 0.46472764886703793d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.06254420428363117d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06066622498266398d + "'", double1 == 0.06066622498266398d);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.155615773557597E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.606218482252364d) + "'", double1 == (-3.606218482252364d));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 4L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.0f + "'", float1 == 4.0f);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8726936208978296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1918237706995551d + "'", double1 == 1.1918237706995551d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3065152709994659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2592664089300267d + "'", double1 == 1.2592664089300267d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.16393896798747645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1781424084962125d + "'", double1 == 0.1781424084962125d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.4515628324511178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42415281851896525d + "'", double1 == 0.42415281851896525d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.59442154605463d + "'", double1 == 31.59442154605463d);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4576692332118569d, 0.2976534827417238d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2976534827417238d + "'", double2 == 0.2976534827417238d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9117339147869651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7219634380306929d) + "'", double1 == (-0.7219634380306929d));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7730965638572164d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.306831672164943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.306831672164945d + "'", double1 == 9.306831672164945d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.001885141133518411d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001885141133518411d + "'", double1 == 0.001885141133518411d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2493184782545368d, 2.0286185349173835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2493184782545368d + "'", double2 == 1.2493184782545368d);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7730965638572164d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double double1 = org.apache.commons.math.util.FastMath.sinh(29.169558789096715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.328887050212274E12d + "'", double1 == 2.328887050212274E12d);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9903301413773639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6921231068842162d + "'", double1 == 1.6921231068842162d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8849970445005177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9407428152797754d + "'", double1 == 0.9407428152797754d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }
}

