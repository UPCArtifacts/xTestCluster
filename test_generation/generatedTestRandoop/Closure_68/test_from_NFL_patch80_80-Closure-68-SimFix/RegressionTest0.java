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
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("");
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.parsing.JsDocInfoParser.parseTypeString("hi!");
        java.lang.Class<?> wildcardClass2 = node1.getClass();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

