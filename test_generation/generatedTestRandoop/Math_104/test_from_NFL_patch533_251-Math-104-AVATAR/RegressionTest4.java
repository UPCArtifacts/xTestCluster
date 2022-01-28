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
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(0.778900855405243d, (double) (short) 100, 1.3679855103709903E-9d, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaP(2.8409872300569567d, 3.473503670788951E-11d, 125.55774215174382d, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.6778094682776357d, (double) (short) 0, 0.3678794411714425d, 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.966968921074397E-9d, 0.7972253741549887d, 2.6478339915281257E-4d, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double double1 = org.apache.commons.math.special.Gamma.logGamma(13.664792122216735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.683839776956162d + "'", double1 == 21.683839776956162d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = org.apache.commons.math.special.Gamma.regularizedGammaQ(537.1532613392394d, 2.390132536334022E-11d, 0.8163331399124467d, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.special.Gamma.regularizedGammaQ(1.665089576211695E-309d, 364.7294262137778d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (2,147,483,647) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
    }
}

