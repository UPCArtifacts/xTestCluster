import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        double double1 = org.apache.commons.math.util.FastMath.ulp(59.58700712473184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5215691996538042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4807536997382096d) + "'", double1 == (-0.4807536997382096d));
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7214969542037845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8969016728156219d + "'", double1 == 0.8969016728156219d);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        int int2 = org.apache.commons.math.util.FastMath.min(45, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.11831214619987152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11886728987977911d + "'", double1 == 0.11886728987977911d);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        double double1 = org.apache.commons.math.util.FastMath.sinh(236.0628816681138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.658734566227291E102d + "'", double1 == 1.658734566227291E102d);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        double double1 = org.apache.commons.math.util.FastMath.expm1(18.947503835155906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6935435100000012E8d + "'", double1 == 1.6935435100000012E8d);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.05483113556160755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.054831135561607555d + "'", double1 == 0.054831135561607555d);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.912812809961445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9128128099614456d + "'", double1 == 3.9128128099614456d);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        double double1 = org.apache.commons.math.util.FastMath.exp(30751.495373318383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5707963267948821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003884821853883d + "'", double1 == 1.003884821853883d);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-2), (long) (-36));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36L) + "'", long2 == (-36L));
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3769270190230555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38647636424308024d + "'", double1 == 0.38647636424308024d);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5452187590232507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5212868232278378d) + "'", double1 == (-0.5212868232278378d));
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5729700885805267d, 2005.3522829578815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5729700885805267d + "'", double2 == 1.5729700885805267d);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        double double1 = org.apache.commons.math.util.FastMath.log(0.28111738892954613d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2689829426857087d) + "'", double1 == (-1.2689829426857087d));
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999999999971124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2540596538763483E-12d) + "'", double1 == (-1.2540596538763483E-12d));
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1662915285707833d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        double double2 = org.apache.commons.math.util.FastMath.max(2.9982229502979694d, (-1.5707539050029569d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9982229502979694d + "'", double2 == 2.9982229502979694d);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8818207058137428d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7718976655628679d) + "'", double1 == (-0.7718976655628679d));
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.993222846126381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.049772952917979E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }
}

