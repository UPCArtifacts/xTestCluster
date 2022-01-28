import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isLValue(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo1 = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.InputId inputId1 = com.google.javascript.jscomp.NodeUtil.getInputId(node0);
        org.junit.Assert.assertNull(inputId1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile1 = com.google.javascript.jscomp.NodeUtil.getSourceFile(node0);
        org.junit.Assert.assertNull(staticSourceFile1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.rhino.Node node0 = null;
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getSourceName(node0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidQualifiedName("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((-1));
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) '#');
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(10);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(100);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(1);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) 'a');
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(0);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) ' ');
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) '4');
        java.lang.Class<?> wildcardClass2 = ternaryValue1.getClass();
        org.junit.Assert.assertNotNull(ternaryValue1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

