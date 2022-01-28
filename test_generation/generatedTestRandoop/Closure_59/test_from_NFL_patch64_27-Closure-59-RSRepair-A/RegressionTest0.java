import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.google.javascript.jscomp.WarningLevel warningLevel0 = com.google.javascript.jscomp.WarningLevel.VERBOSE;
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            warningLevel0.setOptionsForWarningLevel(compilerOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + warningLevel0 + "' != '" + com.google.javascript.jscomp.WarningLevel.VERBOSE + "'", warningLevel0.equals(com.google.javascript.jscomp.WarningLevel.VERBOSE));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.WarningLevel warningLevel0 = com.google.javascript.jscomp.WarningLevel.DEFAULT;
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            warningLevel0.setOptionsForWarningLevel(compilerOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + warningLevel0 + "' != '" + com.google.javascript.jscomp.WarningLevel.DEFAULT + "'", warningLevel0.equals(com.google.javascript.jscomp.WarningLevel.DEFAULT));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.javascript.jscomp.WarningLevel warningLevel0 = com.google.javascript.jscomp.WarningLevel.QUIET;
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            warningLevel0.setOptionsForWarningLevel(compilerOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + warningLevel0 + "' != '" + com.google.javascript.jscomp.WarningLevel.QUIET + "'", warningLevel0.equals(com.google.javascript.jscomp.WarningLevel.QUIET));
    }
}

