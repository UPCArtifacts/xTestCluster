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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter1 = null;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry2 = null;
        com.google.javascript.jscomp.CheckLevel checkLevel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypeCheck typeCheck4 = new com.google.javascript.jscomp.TypeCheck(abstractCompiler0, reverseAbstractInterpreter1, jSTypeRegistry2, checkLevel3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

