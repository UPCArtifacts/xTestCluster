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
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4585955050518922E86d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7992447670407306E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.710505431213761E-20d + "'", double1 == 2.710505431213761E-20d);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9768834261562479d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9261573285337823d + "'", double1 == 2.9261573285337823d);
    }
}

